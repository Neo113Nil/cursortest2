package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import xsna.l7v;
import xsna.m8v0;
import xsna.xrh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class c5h implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c5h(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q7v0 p3;
        f3r f3rVar;
        Context mo2getContext;
        Activity h;
        int i = this.b;
        int i2 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                d5h d5hVar = (d5h) obj3;
                xrh.c.b bVar = (xrh.c.b) obj;
                View view = ((RecyclerView.e0) obj2).itemView;
                try {
                    VkOnboardingComponent vkOnboardingComponent = d5hVar.n;
                    if (vkOnboardingComponent != null && (p3 = vkOnboardingComponent.p3()) != null && p3.b(bVar.b, false)) {
                        int i3 = m8v0.M;
                        m8v0.a.a(view, bVar.d, null, VkTooltip$MarkerStyle.Style1, VkTooltip$MarkerSize.Size146, VkOnboarding$TintColor.Lime, VkTooltip$BalloonPosition.TopRight, VkTooltip$BalloonTilt.Left, new qt(16), null, null, null, new qb6(6, p3, bVar), new nv2(13, p3, bVar), null, 0, false, null, null, false, null, false, 16764420);
                        break;
                    }
                } catch (Throwable th) {
                    com.vk.metrics.eventtracking.b.a.a(th);
                    return;
                }
                break;
            case 1:
                mqp mqpVar = (mqp) obj2;
                String str = (String) obj;
                f3r[] reactionViews = ((m3r) obj3).getScrollView().getReactionViews();
                int length = reactionViews.length;
                while (true) {
                    if (i2 < length) {
                        f3rVar = reactionViews[i2];
                        if (!(f3rVar instanceof dxq)) {
                            i2++;
                        }
                    } else {
                        f3rVar = null;
                    }
                }
                if (f3rVar != null && (mo2getContext = mqpVar.d.mo2getContext()) != null && (h = e3m.h(mo2getContext)) != null) {
                    l7v b = pla.e().b();
                    Rect C = bwt0.C(f3rVar);
                    b.getClass();
                    l7v.b bVar2 = new l7v.b(str, b, C);
                    bVar2.m = 48;
                    bVar2.j(h);
                    break;
                }
                break;
            default:
                ((yads.co1) obj3).a((yads.do1) obj2, (yads.in1) obj);
                break;
        }
    }
}
