package xsna;

import java.util.UUID;

/* compiled from: PixelStatsDeduplicator.kt */
/* loaded from: classes14.dex */
public interface eqa0 {
    void a(UUID uuid);

    boolean b(UUID uuid);

    /* compiled from: PixelStatsDeduplicator.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final eqa0 STUB = new C2833a();

        public final eqa0 getSTUB() {
            return STUB;
        }

        /* compiled from: PixelStatsDeduplicator.kt */
        /* renamed from: xsna.eqa0$a$a, reason: collision with other inner class name */
        public static final class C2833a implements eqa0 {
            @Override // xsna.eqa0
            public final boolean b(UUID uuid) {
                return false;
            }

            @Override // xsna.eqa0
            public final void a(UUID uuid) {
            }
        }
    }
}
