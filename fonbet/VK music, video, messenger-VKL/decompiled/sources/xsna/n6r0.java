package xsna;

import com.vk.dto.common.Image;

/* compiled from: AuthBridge.kt */
/* loaded from: classes15.dex */
public interface n6r0 {
    n6r0 a(Boolean bool);

    n6r0 b(Image image, boolean z);

    n6r0 c(String str);

    boolean commit();

    n6r0 d(String str, boolean z);

    n6r0 e(boolean z);

    /* compiled from: AuthBridge.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final n6r0 STUB = new C3388a();

        public final n6r0 getSTUB() {
            return STUB;
        }

        /* compiled from: AuthBridge.kt */
        /* renamed from: xsna.n6r0$a$a, reason: collision with other inner class name */
        public static final class C3388a implements n6r0 {
            @Override // xsna.n6r0
            public final boolean commit() {
                return false;
            }

            @Override // xsna.n6r0
            public final n6r0 a(Boolean bool) {
                return this;
            }

            @Override // xsna.n6r0
            public final n6r0 c(String str) {
                return this;
            }

            @Override // xsna.n6r0
            public final n6r0 e(boolean z) {
                return this;
            }

            @Override // xsna.n6r0
            public final n6r0 b(Image image, boolean z) {
                return this;
            }

            @Override // xsna.n6r0
            public final n6r0 d(String str, boolean z) {
                return this;
            }
        }
    }
}
