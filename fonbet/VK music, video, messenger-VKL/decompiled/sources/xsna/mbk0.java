package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: Sniffer.java */
/* loaded from: classes12.dex */
public final class mbk0 implements tph0 {
    public int a;
    public final Object b;

    public mbk0(int i, u9h0 u9h0Var) {
        this.a = i;
        this.b = u9h0Var;
    }

    @Override // xsna.tph0
    public io.reactivex.rxjava3.core.x a(int i, String str) {
        u9h0 u9h0Var = (u9h0) this.b;
        int i2 = this.a;
        edi ediVar = (edi) ((qs9) u9h0Var.a).b;
        Integer valueOf = Integer.valueOf(i);
        Integer num = 100;
        ediVar.getClass();
        tfx tfxVar = new tfx("database.getSchools", new io.reactivex.rxjava3.internal.operators.observable.q1(15), new hr(9));
        tfx.l(tfxVar, "city_id", i2, 0, 0, 8);
        if (str != null) {
            tfx.o(tfxVar, CampaignEx.JSON_KEY_AD_Q, str, 0, 0, 12);
        }
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, valueOf.intValue(), 0, 0, 8);
        tfxVar.f(num.intValue(), 0, 10000, "count");
        dz2 x = yfb.x(tfxVar);
        ahn.D(x);
        return rsg0.w0(x).l(new or20(new ai6((t9h0) u9h0Var.b, 9), 12));
    }

    public long b(tel telVar) throws IOException {
        xi90 xi90Var = (xi90) this.b;
        int i = 0;
        telVar.peekFully(xi90Var.a, 0, 1, false);
        int i2 = xi90Var.a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        telVar.peekFully(xi90Var.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (xi90Var.a[i] & 255) + (i5 << 8);
        }
        this.a = i4 + 1 + this.a;
        return i5;
    }

    public mbk0() {
        this.b = new xi90(8);
    }
}
