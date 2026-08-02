package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.clips.viewer.impl.di.ClipsViewersSdkComponentImpl;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction;
import com.vk.video.ui.smartcrop.impl.presentation.fragment.SmartCropFragmentInternalComponent;
import java.util.ArrayList;
import java.util.List;
import xsna.dcm;
import xsna.e8v0;
import xsna.hkh0;
import xsna.zjo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class pv7 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ pv7(byte b, int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = 20;
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                wv7.b(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 1:
                return new x0a(new com.vk.newsfeed.posting.mediapicker.photovk.base.a((ViewGroup) obj2, 18), new rme0((View) obj, i));
            case 2:
                gzs gzsVar = (gzs) obj2;
                qcy<Object>[] qcyVarArr = ClipsViewersSdkComponentImpl.l;
                Activity h = e3m.h((Context) obj);
                return h == null ? hkh0.a.a.getSTUB() : new kpf(rdi.p(h, gzsVar));
            case 3:
                return Boolean.valueOf(!epx.f(obj2, obj));
            case 4:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1030823639, intValue, -1, "com.vk.core.compose.component.image.ComposableSingletons$VkResizableAvatarKt.lambda$1030823639.<anonymous> (VkResizableAvatar.kt:61)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 5:
                uu20 uu20Var = (uu20) obj2;
                String str = uu20Var.a;
                String name = uu20Var.b.name();
                String str2 = uu20Var.c;
                String str3 = uu20Var.d;
                List<rh90> list = uu20Var.e;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (rh90 rh90Var : list) {
                    arrayList.add(e43.l(rh90Var.a, rh90Var.b));
                }
                return e43.l(str, name, str2, str3, arrayList);
            case 6:
                dcm.a aVar2 = (dcm.a) obj2;
                return aVar2 != null ? dcm.a.a(aVar2, null, false, false, 7) : new dcm.a(20, 7);
            case 7:
                ((q7v0) obj).a((VkOnboardingCampaign) obj2, VkOnboardingType.Highlighter, e8v0.m.b);
                return s3q0.a;
            case 8:
                return s3q0.a;
            case 9:
                return Integer.valueOf(((zjo0.a) obj2).a);
            case 10:
                return new SmartCropFragmentInternalComponent((j4k0) obj2);
            case 11:
                int i2 = VideoCatalogRootVh.M0;
                s1v s1vVar = p1s0.a;
                p1s0.b(MobileOfficialAppsVideoStat$TypeVideoDiscoveryTabsAction.EventType.SHOW_TAB, ((Integer) obj).intValue(), (String) obj2);
                return s3q0.a;
            default:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar3.K(-1633396521);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1633396521, intValue2, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:175)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.M;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return frv0Var;
        }
    }
}
