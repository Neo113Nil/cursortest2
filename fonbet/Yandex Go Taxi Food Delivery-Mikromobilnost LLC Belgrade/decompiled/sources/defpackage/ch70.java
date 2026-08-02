package defpackage;

import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes10.dex */
public final class ch70 extends gru0 {
    public static final byte[] o = {79, Alerts.alert_unrecognized_name, 117, 115, 72, 101, 97, Alerts.alert_no_renegotiation};
    public static final byte[] p = {79, Alerts.alert_unrecognized_name, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(ef90 ef90Var, byte[] bArr) {
        if (ef90Var.a() < bArr.length) {
            return false;
        }
        int i = ef90Var.b;
        byte[] bArr2 = new byte[bArr.length];
        ef90Var.i(0, bArr.length, bArr2);
        ef90Var.K(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.gru0
    public final long b(ef90 ef90Var) {
        byte[] bArr = ef90Var.a;
        return (this.i * xub1.c(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // defpackage.gru0
    public final boolean c(ef90 ef90Var, long j, zxs0 zxs0Var) {
        if (e(ef90Var, o)) {
            byte[] copyOf = Arrays.copyOf(ef90Var.a, ef90Var.c);
            int i = copyOf[9] & 255;
            ArrayList a = xub1.a(copyOf);
            if (((a) zxs0Var.a) == null) {
                f7s f7sVar = new f7s();
                f7sVar.l = eh20.q("audio/ogg");
                f7sVar.m = eh20.q("audio/opus");
                f7sVar.C = i;
                f7sVar.D = 48000;
                f7sVar.p = a;
                zxs0Var.a = new a(f7sVar);
                return true;
            }
        } else {
            if (!e(ef90Var, p)) {
                d6z.z((a) zxs0Var.a);
                return false;
            }
            d6z.z((a) zxs0Var.a);
            if (!this.n) {
                this.n = true;
                ef90Var.L(8);
                w820 c = xj91.c(ImmutableList.m((String[]) xj91.d(ef90Var, false, false).a));
                if (c != null) {
                    f7s a2 = ((a) zxs0Var.a).a();
                    a2.k = c.b(((a) zxs0Var.a).l);
                    zxs0Var.a = new a(a2);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // defpackage.gru0
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = false;
        }
    }
}
