package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.attaches.Attach;
import com.vk.onboarding.api.di.VkOnboardingComponent;

/* compiled from: VhAutoplayMsg.kt */
/* loaded from: classes2.dex */
public final class iqr0 extends com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a implements ent0, i4w {
    public static final /* synthetic */ int V = 0;
    public final hr30<Attach, ir30> U;

    public iqr0(View view, ViewGroup viewGroup, hr30 hr30Var, cau0 cau0Var, VkOnboardingComponent vkOnboardingComponent) {
        super(view, viewGroup, hr30Var, cau0Var, vkOnboardingComponent);
        this.U = hr30Var;
    }

    @Override // xsna.i4w
    public final h4w m5() {
        h4w h4wVar;
        hr30<Attach, ir30> hr30Var = this.U;
        if (!(hr30Var instanceof as30) || (h4wVar = ((as30) hr30Var).e) == null) {
            return null;
        }
        return h4wVar;
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        h4w m5 = m5();
        if (m5 != null) {
            return m5.getPresenter();
        }
        return null;
    }
}
