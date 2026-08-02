package xsna;

import com.vk.onboarding.api.di.VkOnboardingComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class lmh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ ynh c;

    public /* synthetic */ lmh(ynh ynhVar, int i) {
        this.b = i;
        this.c = ynhVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return this.c.b().d();
            default:
                return ((VkOnboardingComponent) this.c.p0.getValue()).p3();
        }
    }
}
