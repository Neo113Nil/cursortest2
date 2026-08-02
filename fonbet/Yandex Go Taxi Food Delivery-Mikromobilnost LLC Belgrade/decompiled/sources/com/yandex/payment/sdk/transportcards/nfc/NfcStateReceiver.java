package com.yandex.payment.sdk.transportcards.nfc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.c1x0;
import defpackage.da60;
import defpackage.fa60;
import defpackage.jl40;
import defpackage.pv01;
import defpackage.qv90;
import defpackage.rwo;
import defpackage.vfc;
import defpackage.y22;
import kotlin.Metadata;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0002\u0002\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/yandex/payment/sdk/transportcards/nfc/NfcStateReceiver;", "Landroid/content/BroadcastReceiver;", "Lfa60;", "listener", "<init>", "(Lfa60;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lfa60;", "Companion", "da60", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NfcStateReceiver extends BroadcastReceiver {
    public static final da60 Companion = new da60();
    private final fa60 listener;

    public NfcStateReceiver(fa60 fa60Var) {
        this.listener = fa60Var;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (jl40.l(intent != null ? intent.getAction() : null, "android.nfc.action.ADAPTER_STATE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.nfc.extra.ADAPTER_STATE", 1);
            if (intExtra == 1) {
                a aVar = (a) ((c1x0) this.listener).a;
                rwo rwoVar = aVar.b;
                if (rwoVar != null) {
                    ((y22) rwoVar).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "NFC модуль выключен", "nfc_off"));
                }
                aVar.a.w(false);
                return;
            }
            if (intExtra != 3) {
                return;
            }
            a aVar2 = (a) ((c1x0) this.listener).a;
            rwo rwoVar2 = aVar2.b;
            if (rwoVar2 != null) {
                ((y22) rwoVar2).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "NFC модуль включен", "nfc_on"));
            }
            aVar2.a.w(true);
            aVar2.e(new pv01(5, aVar2));
        }
    }
}
