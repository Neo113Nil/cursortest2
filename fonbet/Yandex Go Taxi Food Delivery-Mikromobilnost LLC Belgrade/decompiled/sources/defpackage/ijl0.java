package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import javax.net.SocketFactory;

/* loaded from: classes10.dex */
public final class ijl0 extends c45 {
    public final iil0 A;
    public final String B = "AndroidXMedia3/1.7.1";
    public final Uri C;
    public final SocketFactory D;
    public long E;
    public boolean F;
    public boolean G;
    public boolean H;
    public fe10 I;

    static {
        ge10.a("media3.exoplayer.rtsp");
    }

    public ijl0(fe10 fe10Var, iil0 iil0Var, SocketFactory socketFactory) {
        this.I = fe10Var;
        this.A = iil0Var;
        zd10 zd10Var = fe10Var.b;
        zd10Var.getClass();
        this.C = h(zd10Var.a);
        this.D = socketFactory;
        this.E = -9223372036854775807L;
        this.H = true;
    }

    public static Uri h(Uri uri) {
        String scheme = uri.getScheme();
        return (scheme == null || !f0b1.f("rtspt", scheme)) ? uri : Uri.parse("rtsp".concat(uri.toString().substring(5)));
    }

    @Override // defpackage.uf10
    public final boolean canUpdateMediaItem(fe10 fe10Var) {
        zd10 zd10Var = fe10Var.b;
        return zd10Var != null && h(zd10Var.a).equals(this.C);
    }

    @Override // defpackage.uf10
    public final xe10 createPeriod(sf10 sf10Var, au1 au1Var, long j) {
        return new hjl0(au1Var, this.A, this.C, new ndl0(1, this), this.B, this.D);
    }

    @Override // defpackage.c45
    public final void e(cj01 cj01Var) {
        i();
    }

    @Override // defpackage.c45
    public final void g() {
    }

    @Override // defpackage.uf10
    public final synchronized fe10 getMediaItem() {
        return this.I;
    }

    public final void i() {
        a9z0 rhs0Var = new rhs0(this.E, this.F, this.G, getMediaItem());
        if (this.H) {
            rhs0Var = new rkf0(rhs0Var, 1);
        }
        f(rhs0Var);
    }

    @Override // defpackage.uf10
    public final void maybeThrowSourceInfoRefreshError() {
    }

    @Override // defpackage.uf10
    public final void releasePeriod(xe10 xe10Var) {
        hjl0 hjl0Var = (hjl0) xe10Var;
        ArrayList arrayList = hjl0Var.x;
        for (int i = 0; i < arrayList.size(); i++) {
            gjl0 gjl0Var = (gjl0) arrayList.get(i);
            if (!gjl0Var.e) {
                gjl0Var.b.f(null);
                gjl0Var.c.z();
                gjl0Var.e = true;
            }
        }
        tw21.g(hjl0Var.w);
        hjl0Var.K = true;
    }

    @Override // defpackage.uf10
    public final synchronized void updateMediaItem(fe10 fe10Var) {
        this.I = fe10Var;
    }
}
