package xsna;

/* compiled from: Buffer.java */
/* loaded from: classes12.dex */
public abstract class xl8 {
    public int b;

    public final void a(int i) {
        this.b = i | this.b;
    }

    public final boolean b(int i) {
        return (this.b & i) == i;
    }
}
