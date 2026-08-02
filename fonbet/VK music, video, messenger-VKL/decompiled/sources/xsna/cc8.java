package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.music.onboarding.api.di.MusicOnboardingComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class cc8 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ cc8(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (BridgeComponent) this.c.a(fpf0.a(BridgeComponent.class));
            default:
                return (MusicOnboardingComponent) this.c.a(fpf0.a(MusicOnboardingComponent.class));
        }
    }
}
