package xsna;

import androidx.lifecycle.Lifecycle;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.core.view.components.button.VkButton;
import com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2;
import xsna.f1z;
import xsna.m8v0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ka2 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ xzs f;
    public final /* synthetic */ xzs g;

    public /* synthetic */ ka2(Object obj, Object obj2, Object obj3, xzs xzsVar, xzs xzsVar2, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = xzsVar;
        this.g = xzsVar2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        xzs xzsVar = this.g;
        xzs xzsVar2 = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                k1z k1zVar = (k1z) obj;
                f1z.a aVar = ((na2) obj3).a;
                k1zVar.h = (tho0) obj4;
                k1zVar.i = (rnw) obj2;
                k1zVar.c = (lq5) xzsVar2;
                k1zVar.d = (izs) xzsVar;
                k1zVar.e = aVar != null ? aVar.c0() : null;
                k1zVar.f = aVar != null ? aVar.W() : null;
                k1zVar.g = aVar != null ? aVar.getViewConfiguration() : null;
                break;
            default:
                ofc0 ofc0Var = (ofc0) xzsVar2;
                int i2 = VideoNewProfileHeaderViewV2.y;
                int i3 = m8v0.M;
                m8v0.a.a((VkButton) obj4, (String) obj3, null, VkTooltip$MarkerStyle.Style3, VkTooltip$MarkerSize.Size48, VkOnboarding$TintColor.Azure, VkTooltip$BalloonPosition.BottomLeft, VkTooltip$BalloonTilt.Left, new xim0(ofc0Var, 9), new f6m0(ofc0Var, 14), null, null, null, new n9m0((gd0) xzsVar, 15), null, 0, false, (Lifecycle) obj2, null, false, null, false, 14015492);
                break;
        }
        return s3q0.a;
    }
}
