package yads;

/* loaded from: classes10.dex */
public final class il extends Exception {
    public final int b;
    public final boolean c;
    public final nx0 d;

    public il(int i, nx0 nx0Var, boolean z) {
        super(nh2.a("AudioTrack write failed: ", i));
        this.c = z;
        this.b = i;
        this.d = nx0Var;
    }
}
