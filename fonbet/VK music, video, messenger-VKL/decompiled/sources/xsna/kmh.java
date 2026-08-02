package xsna;

import com.vk.onboarding.api.di.VkOnboardingComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class kmh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ ynh c;

    public /* synthetic */ kmh(ynh ynhVar, int i) {
        this.b = i;
        this.c = ynhVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (cfh) this.c.G0.getValue();
            default:
                return (VkOnboardingComponent) ((k7m) m7m.f(this.c.a)).a(fpf0.a(VkOnboardingComponent.class));
        }
    }
}
