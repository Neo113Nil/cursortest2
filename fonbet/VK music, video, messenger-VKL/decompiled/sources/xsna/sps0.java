package xsna;

/* compiled from: VideoHolderSettings.kt */
/* loaded from: classes4.dex */
public final class sps0 {
    public final boolean a;
    public final boolean b;
    public final wqj c;
    public final boolean d;
    public final jcr e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public sps0(wqj wqjVar, jcr jcrVar, boolean z, int i) {
        boolean z2 = (i & 1) == 0;
        boolean z3 = (i & 2) == 0;
        wqjVar = (i & 4) != 0 ? null : wqjVar;
        boolean z4 = (i & 8) != 0;
        jcrVar = (i & 16) != 0 ? null : jcrVar;
        boolean z5 = (i & 32) == 0;
        z = (i & 64) != 0 ? false : z;
        boolean z6 = (i & 128) != 0;
        this.a = z2;
        this.b = z3;
        this.c = wqjVar;
        this.d = z4;
        this.e = jcrVar;
        this.f = z5;
        this.g = z;
        this.h = z6;
    }
}
