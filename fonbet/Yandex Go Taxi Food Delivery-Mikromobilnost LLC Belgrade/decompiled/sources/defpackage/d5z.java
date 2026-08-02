package defpackage;

import android.content.Context;
import defpackage.f0b1;
import defpackage.fe10;
import defpackage.ijl0;
import defpackage.r400;
import defpackage.rf10;
import defpackage.rmm;
import defpackage.twy;
import defpackage.uf10;
import defpackage.xs01;
import defpackage.zd10;
import javax.net.SocketFactory;

/* loaded from: classes4.dex */
public final class d5z extends ye0 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d5z(String str, int i) {
        super(str);
        this.b = i;
    }

    @Override // defpackage.ye0
    public final fe10 h() {
        int i = this.b;
        String str = this.a;
        switch (i) {
            case 0:
                td10 td10Var = new td10();
                td10Var.b(str);
                return td10Var.a();
            default:
                td10 td10Var2 = new td10();
                td10Var2.b(str);
                return td10Var2.a();
        }
    }

    @Override // defpackage.ye0
    public final rf10 i(Context context) {
        switch (this.b) {
            case 0:
                return new ueh(context);
            default:
                return new rf10() { // from class: androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory
                    public final SocketFactory a = SocketFactory.getDefault();

                    @Override // defpackage.rf10
                    public final uf10 createMediaSource(fe10 fe10Var) {
                        fe10Var.b.getClass();
                        zd10 zd10Var = fe10Var.b;
                        zd10Var.getClass();
                        String scheme = zd10Var.a.getScheme();
                        return new ijl0(fe10Var, (scheme == null || !f0b1.f("rtspt", scheme)) ? new r400(15) : new xs01(), this.a);
                    }

                    @Override // defpackage.rf10
                    public final int[] getSupportedTypes() {
                        return new int[]{3};
                    }

                    @Override // defpackage.rf10
                    public final rf10 setDrmSessionManagerProvider(rmm rmmVar) {
                        return this;
                    }

                    @Override // defpackage.rf10
                    public final rf10 setLoadErrorHandlingPolicy(twy twyVar) {
                        return this;
                    }
                };
        }
    }
}
