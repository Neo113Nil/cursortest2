package xsna;

/* compiled from: StateVerifier.java */
/* loaded from: classes12.dex */
public abstract class vuk0 {

    /* compiled from: StateVerifier.java */
    public static class a extends vuk0 {
        public volatile boolean a;

        public final void a() {
            if (this.a) {
                throw new IllegalStateException("Already released");
            }
        }
    }
}
