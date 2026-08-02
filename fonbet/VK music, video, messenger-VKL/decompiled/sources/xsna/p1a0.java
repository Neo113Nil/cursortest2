package xsna;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.vk.dto.common.Source;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PersonalChannelOnboardingControllerImpl.kt */
/* loaded from: classes16.dex */
public final class p1a0 implements o1a0 {
    public final VkOnboardingComponent a;
    public final f5z b;
    public final f0c c;
    public final q7v0 d;
    public final AtomicBoolean e;
    public final bpn0 f;

    public p1a0(VkOnboardingComponent vkOnboardingComponent, f5z f5zVar, f0c f0cVar) {
        this.a = vkOnboardingComponent;
        this.b = f5zVar;
        this.c = f0cVar;
        q7v0 p3 = vkOnboardingComponent.p3();
        this.d = p3;
        this.e = new AtomicBoolean(false);
        this.f = new bpn0(new r(22));
        if (p3.isReady()) {
            return;
        }
        p3.init();
    }

    @Override // xsna.o1a0
    public final void a(FloatingActionButton floatingActionButton) {
        q7v0 q7v0Var;
        VkOnboardingCampaign e;
        if (((Boolean) this.f.getValue()).booleanValue() && (e = (q7v0Var = this.d).e("me:personal_channels_create_button")) != null && q7v0Var.d(e) && q7v0Var.b(e, false)) {
            com.vk.im.video.f fVar = new com.vk.im.video.f(this, floatingActionButton, e, 2);
            ftt fttVar = new ftt(Source.ACTUAL);
            f0c f0cVar = this.c;
            io.reactivex.rxjava3.internal.operators.single.c C = f0cVar.a.C(f0cVar, fttVar);
            asu0 asu0Var = asu0.a;
            io.reactivex.rxjava3.internal.operators.single.b0 m = C.q(asu0Var.c()).m(asu0Var.d());
            defpackage.z zVar = new defpackage.z(new com.vk.movika.sdk.base.data.a(fVar, 19), 13);
            int i = kwg0.a;
            f0cVar.b.b(m.subscribe(zVar, new hwg0()));
        }
    }

    @Override // xsna.o1a0
    public final boolean b() {
        return this.e.getAndSet(false);
    }
}
