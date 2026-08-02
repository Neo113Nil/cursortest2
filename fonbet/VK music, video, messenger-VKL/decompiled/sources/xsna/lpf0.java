package xsna;

/* compiled from: RefreshPipHolder.kt */
/* loaded from: classes8.dex */
public final class lpf0 {
    public static boolean a;

    /* compiled from: RefreshPipHolder.kt */
    public static final class a implements nhl {
        @Override // xsna.nhl
        public final void onStop(f5z f5zVar) {
            lpf0.a = false;
        }
    }

    static {
        androidx.lifecycle.q.j.g.addObserver(new a());
    }
}
