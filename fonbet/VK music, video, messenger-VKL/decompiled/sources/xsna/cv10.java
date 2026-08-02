package xsna;

import one.video.player.OneVideoPlayer;

/* compiled from: MediaPlaybackController.kt */
/* loaded from: classes3.dex */
public interface cv10 extends fyi<s3q0> {
    OneVideoPlayer a();

    void b(g0b0 g0b0Var, long j, gzs<Boolean> gzsVar);

    void e(g0b0 g0b0Var, long j);

    void release();

    /* compiled from: MediaPlaybackController.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final cv10 STUB = new C2688a();

        public final cv10 getSTUB() {
            return STUB;
        }

        /* compiled from: MediaPlaybackController.kt */
        /* renamed from: xsna.cv10$a$a, reason: collision with other inner class name */
        public static final class C2688a implements cv10 {
            @Override // xsna.cv10
            public final OneVideoPlayer a() {
                throw new UnsupportedOperationException("Tried to get player on STUB instance");
            }

            @Override // xsna.fyi
            public final /* bridge */ /* synthetic */ Object d(d80 d80Var) {
                return s3q0.a;
            }

            @Override // xsna.fyi
            public final /* bridge */ /* synthetic */ Object g(apk apkVar) {
                return s3q0.a;
            }

            @Override // xsna.cv10
            public final void release() {
            }

            @Override // xsna.cv10
            public final void e(g0b0 g0b0Var, long j) {
            }

            @Override // xsna.cv10
            public final void b(g0b0 g0b0Var, long j, gzs<Boolean> gzsVar) {
            }
        }
    }
}
