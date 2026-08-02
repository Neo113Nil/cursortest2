package xsna;

import android.app.Activity;
import android.app.Application;

/* compiled from: UnityLevelPlayFeature.kt */
/* loaded from: classes6.dex */
public interface d4q0 {
    void a(int i, String str);

    void b(Application application);

    void c(Activity activity, wzs<? super Integer, ? super String, s3q0> wzsVar);

    bu00 d();

    boolean isInitialized();

    /* compiled from: UnityLevelPlayFeature.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();

        public final d4q0 getSTUB() {
            return new C2705a();
        }

        /* compiled from: UnityLevelPlayFeature.kt */
        /* renamed from: xsna.d4q0$a$a, reason: collision with other inner class name */
        public static final class C2705a implements d4q0 {
            @Override // xsna.d4q0
            public final bu00 d() {
                return null;
            }

            @Override // xsna.d4q0
            public final boolean isInitialized() {
                return false;
            }

            @Override // xsna.d4q0
            public final void b(Application application) {
            }

            @Override // xsna.d4q0
            public final void a(int i, String str) {
            }

            @Override // xsna.d4q0
            public final void c(Activity activity, wzs<? super Integer, ? super String, s3q0> wzsVar) {
            }
        }
    }
}
