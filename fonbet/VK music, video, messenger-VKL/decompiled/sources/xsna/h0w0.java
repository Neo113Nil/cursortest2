package xsna;

import com.vk.video.growth.api.data.VideoGrowthAppStore;

/* compiled from: VkVideoPromoManager.kt */
/* loaded from: classes2.dex */
public interface h0w0 {
    public static final a a = a.a;

    void a();

    void b();

    boolean c(boolean z);

    k0w0 d();

    void e();

    void f();

    boolean g(boolean z);

    /* compiled from: VkVideoPromoManager.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final h0w0 STUB = new C2965a();

        public final h0w0 getSTUB() {
            return STUB;
        }

        /* compiled from: VkVideoPromoManager.kt */
        /* renamed from: xsna.h0w0$a$a, reason: collision with other inner class name */
        public static final class C2965a implements h0w0 {
            public final k0w0 b = new k0w0("", "", "", "", false, "", VideoGrowthAppStore.GOOGLE);

            @Override // xsna.h0w0
            public final boolean c(boolean z) {
                return false;
            }

            @Override // xsna.h0w0
            public final k0w0 d() {
                return this.b;
            }

            @Override // xsna.h0w0
            public final boolean g(boolean z) {
                return false;
            }

            @Override // xsna.h0w0
            public final void a() {
            }

            @Override // xsna.h0w0
            public final void b() {
            }

            @Override // xsna.h0w0
            public final void e() {
            }

            @Override // xsna.h0w0
            public final void f() {
            }
        }
    }
}
