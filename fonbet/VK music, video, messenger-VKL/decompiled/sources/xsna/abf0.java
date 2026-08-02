package xsna;

import android.app.Activity;
import com.vk.dto.music.onboarding.OnboardingInfo;
import com.vk.music.bottomsheets.domain.model.AudioOnboardingScenarioType;
import com.vk.music.bottomsheets.domain.model.OnboardingInfoEntity;
import java.util.UUID;
import xsna.k840;

/* compiled from: RecommendationOnboardingControllerImpl.kt */
/* loaded from: classes3.dex */
public final class abf0 implements zaf0 {
    public final u2b0 a;
    public final com.vk.music.pref.a b;
    public lqk0 c;
    public io.reactivex.rxjava3.disposables.c d;
    public final String e = UUID.randomUUID().toString();

    public abf0(u2b0 u2b0Var, com.vk.music.pref.a aVar) {
        this.a = u2b0Var;
        this.b = aVar;
    }

    @Override // xsna.zaf0
    public final void a() {
        io.reactivex.rxjava3.disposables.c cVar = this.d;
        if (cVar != null) {
            cVar.dispose();
        }
        this.c = null;
    }

    @Override // xsna.zaf0
    public final boolean b(lqk0 lqk0Var, OnboardingInfo onboardingInfo) {
        if (onboardingInfo == null) {
            return false;
        }
        this.c = lqk0Var;
        return e(onboardingInfo);
    }

    @Override // xsna.zaf0
    public final boolean c(OnboardingInfo onboardingInfo) {
        this.c = null;
        if (onboardingInfo == null) {
            return false;
        }
        return e(onboardingInfo);
    }

    @Override // xsna.zaf0
    public final void d() {
        r5v0 r5v0Var = k840.a.h;
        if (r5v0Var == null) {
            r5v0Var = null;
        }
        this.d = r5v0Var.a.a.b0(dcg0.class).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new m5y(new b140(this, 14), 22));
    }

    public final boolean e(OnboardingInfo onboardingInfo) {
        if (this.b.o()) {
            return false;
        }
        String str = onboardingInfo.c;
        String str2 = onboardingInfo.b;
        if (str.length() == 0 || str2.length() == 0) {
            return false;
        }
        AudioOnboardingScenarioType.Companion.getClass();
        AudioOnboardingScenarioType a = AudioOnboardingScenarioType.a.a(str2);
        if (a == null) {
            return true;
        }
        ic40 w = lyd.g().w();
        c63 c63Var = c63.a;
        Activity b = c63.b();
        if (b == null) {
            return false;
        }
        w.k(b, new OnboardingInfoEntity(a, onboardingInfo.c), this.e);
        return true;
    }
}
