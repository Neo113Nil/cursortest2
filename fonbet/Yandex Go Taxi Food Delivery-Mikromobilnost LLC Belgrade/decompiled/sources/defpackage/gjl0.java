package defpackage;

import androidx.media3.exoplayer.upstream.a;

/* loaded from: classes10.dex */
public final class gjl0 {
    public final fjl0 a;
    public final a b;
    public final uyl0 c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ hjl0 f;

    public gjl0(hjl0 hjl0Var, jjl0 jjl0Var, int i, iil0 iil0Var) {
        this.f = hjl0Var;
        this.b = new a(oyr.i(i, "ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper "));
        uyl0 uyl0Var = new uyl0(hjl0Var.a, null, null);
        this.c = uyl0Var;
        this.a = new fjl0(hjl0Var, jjl0Var, i, uyl0Var, iil0Var);
        uyl0Var.f = hjl0Var.c;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        this.a.b.C = true;
        this.d = true;
        hjl0.a(this.f);
    }
}
