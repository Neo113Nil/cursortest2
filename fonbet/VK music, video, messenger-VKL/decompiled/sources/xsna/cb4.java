package xsna;

import com.vk.audience.api.domain.AudienceResearchSurfaceCode;

/* compiled from: AudienceResearchUrlBuilder.kt */
/* loaded from: classes15.dex */
public interface cb4 {
    cb4 b(AudienceResearchSurfaceCode audienceResearchSurfaceCode);

    String build();

    /* compiled from: AudienceResearchUrlBuilder.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final cb4 STUB = new C2653a();

        public final cb4 getSTUB() {
            return STUB;
        }

        /* compiled from: AudienceResearchUrlBuilder.kt */
        /* renamed from: xsna.cb4$a$a, reason: collision with other inner class name */
        public static final class C2653a implements cb4 {
            @Override // xsna.cb4
            public final String build() {
                return "";
            }

            @Override // xsna.cb4
            public final cb4 b(AudienceResearchSurfaceCode audienceResearchSurfaceCode) {
                return this;
            }
        }
    }
}
