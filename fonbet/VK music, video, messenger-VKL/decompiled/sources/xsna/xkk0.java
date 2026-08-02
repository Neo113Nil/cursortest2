package xsna;

import com.vk.splashscreen.api.SplashScreenState;

/* compiled from: SplashScreenStateManager.kt */
/* loaded from: classes5.dex */
public interface xkk0 {
    public static final a a = a.a;

    /* compiled from: SplashScreenStateManager.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final xkk0 STUB = new C4013a();

        /* compiled from: SplashScreenStateManager.kt */
        /* renamed from: xsna.xkk0$a$a, reason: collision with other inner class name */
        public static final class C4013a implements xkk0 {
            public final utk0 b = vtk0.a(SplashScreenState.HIDDEN);

            @Override // xsna.xkk0
            public final utk0 getState() {
                return this.b;
            }
        }

        public final xkk0 getSTUB() {
            return STUB;
        }
    }

    utk0 getState();
}
