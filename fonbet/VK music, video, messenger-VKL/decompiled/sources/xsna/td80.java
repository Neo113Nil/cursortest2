package xsna;

import com.vk.music.bottomsheets.domain.model.AudioOnboardingScenarioType;

/* compiled from: OnboardingInteractor.kt */
/* loaded from: classes3.dex */
public interface td80 {

    /* compiled from: OnboardingInteractor.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final td80 STUB = new C3740a();

        /* compiled from: OnboardingInteractor.kt */
        /* renamed from: xsna.td80$a$a, reason: collision with other inner class name */
        public static final class C3740a implements td80 {
            @Override // xsna.td80
            public final io.reactivex.rxjava3.core.a a(AudioOnboardingScenarioType audioOnboardingScenarioType) {
                return io.reactivex.rxjava3.internal.operators.completable.i.b;
            }
        }

        public final td80 getSTUB() {
            return STUB;
        }
    }

    io.reactivex.rxjava3.core.a a(AudioOnboardingScenarioType audioOnboardingScenarioType);
}
