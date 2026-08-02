package com.yandex.go.movista.nfc;

import android.nfc.cardemulation.HostApduService;
import android.os.Bundle;
import defpackage.ctb1;
import defpackage.d6w;
import defpackage.dtb1;
import defpackage.f73;
import defpackage.i3y;
import defpackage.j73;
import defpackage.nyj0;
import defpackage.t960;
import defpackage.v77;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/go/movista/nfc/NfcValidationService;", "Landroid/nfc/cardemulation/HostApduService;", "<init>", "()V", "", "commandApdu", "Landroid/os/Bundle;", "extras", "processCommandApdu", "([BLandroid/os/Bundle;)[B", "", CRLReasonCodeExtension.REASON, "Lzy11;", "onDeactivated", "(I)V", "Lcom/yandex/go/movista/nfc/a;", "useCase", "Lcom/yandex/go/movista/nfc/a;", "movista"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NfcValidationService extends HostApduService {
    private final a useCase = new a();

    @Override // android.nfc.cardemulation.HostApduService
    public void onDeactivated(int reason) {
    }

    @Override // android.nfc.cardemulation.HostApduService
    public byte[] processCommandApdu(byte[] commandApdu, Bundle extras) {
        short s;
        int i;
        byte[] bArr;
        short s2;
        int i2;
        a aVar = this.useCase;
        aVar.getClass();
        d6w d6wVar = new d6w(0, 3, 1);
        if (commandApdu.length > d6wVar.b ? Arrays.equals(dtb1.a("00a40400"), j73.Y(commandApdu, d6wVar)) : false) {
            aVar.b = null;
            aVar.c = false;
            i3y i3yVar = t960.d;
            ctb1.b().a.getClass();
            return aVar.d("Empty device id");
        }
        if (a.b("da", commandApdu)) {
            aVar.c = true;
            i3y i3yVar2 = t960.d;
            v77 v77Var = ctb1.b().a.a;
            if (v77Var == null || (bArr = v77Var.a) == null) {
                return aVar.d("No ticket data");
            }
            if (commandApdu.length >= 5 && (s2 = ByteBuffer.wrap(commandApdu, 3, 2).getShort()) >= 0 && (i2 = s2 + 5) <= commandApdu.length) {
                r3 = f73.m(5, i2, commandApdu);
            }
            return r3 == null ? aVar.d("Can't get qr") : aVar.c(f73.r(r3, bArr));
        }
        if (!a.b("0c", commandApdu)) {
            if (!a.b("db", commandApdu)) {
                return aVar.d("Unrecognizable command");
            }
            aVar.c = false;
            i3y i3yVar3 = t960.d;
            v77 v77Var2 = ctb1.b().a.b;
            r3 = v77Var2 != null ? v77Var2.a : null;
            return r3 != null ? aVar.c(r3) : aVar.d("Something went wrong, try again or activate the ticket at another turnstile or validator");
        }
        if (commandApdu.length <= 3) {
            return aVar.d("Short command");
        }
        byte b = commandApdu[3];
        byte[] bArr2 = aVar.b;
        if (b > 0) {
            aVar.e(new nyj0(aVar.c, null, (commandApdu.length >= 8 && (s = ByteBuffer.wrap(commandApdu, 4, 2).getShort()) >= 0 && s < 1025 && (i = s + 6) <= commandApdu.length) ? new String(f73.m(6, i, commandApdu), StandardCharsets.UTF_8) : null, 2));
            return a.f("1c");
        }
        if (bArr2 == null) {
            return aVar.d("Something went wrong, try again or activate the ticket at another turnstile or validator.");
        }
        aVar.e(new nyj0(aVar.c, new v77(bArr2), null, 4));
        return a.f("1c");
    }
}
