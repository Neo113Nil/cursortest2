package xsna;

import com.vk.fullscreen.promo.core.FullscreenPromoComponent;
import com.vk.fullscreen.promo.core.FullscreenPromoEvent;
import com.vk.onboardingpromo.api.OnboardingPromoComponent;
import com.vk.onepasspromo.impl.b;
import com.vk.toggle.features.VideoFeatures;
import java.util.Collections;
import kotlin.collections.EmptySet;
import xsna.d83;
import xsna.ug80;
import xsna.x9j;
import xsna.zdk0;

/* compiled from: FullscreenPromoSetupTask.kt */
/* loaded from: classes11.dex */
public final class bzs implements gzs<s3q0> {
    public final u0f b;

    public bzs(u0f u0fVar) {
        this.b = u0fVar;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        u0f u0fVar = this.b;
        zys n = ((FullscreenPromoComponent) ((nmg0) u0fVar.invoke()).a(fpf0.a(FullscreenPromoComponent.class))).n();
        FullscreenPromoEvent.MainActivityResume mainActivityResume = FullscreenPromoEvent.MainActivityResume.c;
        btx btxVar = btx.b;
        n.b(cke0.b, mainActivityResume, Collections.singleton(btxVar), new d83.a());
        FullscreenPromoEvent.SignUp signUp = FullscreenPromoEvent.SignUp.c;
        EmptySet emptySet = EmptySet.b;
        n.b(aek0.b, signUp, emptySet, new zdk0.a());
        VideoFeatures videoFeatures = VideoFeatures.ONBOARDING_PROMO;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            n.b(dg80.b, FullscreenPromoEvent.FeedStart.c, emptySet, new ug80.a(((OnboardingPromoComponent) ((nmg0) u0fVar.invoke()).a(fpf0.a(OnboardingPromoComponent.class))).b()));
        }
        n.b(hj80.b, FullscreenPromoEvent.FeedStart.c, Collections.singleton(com.vk.onepasspromo.impl.a.b), new b.a());
        n.b(caj.b, mainActivityResume, Collections.singleton(btxVar), new x9j.a());
        return s3q0.a;
    }
}
