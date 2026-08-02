package xsna;

import android.view.ViewGroup;
import com.vk.api.generated.video.dto.VideoGetExternalStatsTokenResponseDto;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.view.components.divider.VkDivider;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoOwner;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.hh8;
import xsna.nt80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class eyp0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ eyp0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ArrayList arrayList = null;
        boolean z = false;
        switch (this.b) {
            case 0:
                return ((VideoGetExternalStatsTokenResponseDto) obj).d();
            case 1:
                qgi0.r((tgi0) obj, "upload_cell_middle_subtitle");
                return s3q0.a;
            case 2:
                int i = UserProfileHeaderView.G;
                qgi0.r((tgi0) obj, "topBarRightExtraIcon");
                return s3q0.a;
            case 3:
                bks bksVar = (bks) obj;
                return new fo0(bksVar.a, bksVar.b);
            case 4:
                int i2 = VKSuperAppBrowserFragment.Y;
                if (obj instanceof UiMeasuringScreen) {
                    return new chn0((UiMeasuringScreen) obj);
                }
                if (obj instanceof PerformanceScoreProduct) {
                    return new khn0((PerformanceScoreProduct) obj);
                }
                return null;
            case 5:
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.c = ((VkAuthValidatePhoneResult) obj).b;
                return s3q0.a;
            case 6:
                List<? extends d290> list = ((a21) obj).f;
                if (list != null) {
                    List<? extends d290> list2 = list;
                    arrayList = new ArrayList(c5g.u(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Long.valueOf(((d290) it.next()).b));
                    }
                }
                return arrayList == null ? EmptyList.b : arrayList;
            case 7:
                iss0.a.getClass();
                return new VideoOwner(-1, UserId.d);
            case 8:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 9:
                return s3q0.a;
            case 10:
                return s3q0.a;
            case 11:
                int i3 = isn.l;
                VkDivider vkDivider = new VkDivider(((ViewGroup) obj).getContext(), null, 6, 0);
                float f = 16;
                vkDivider.setLayoutParams(new ViewGroup.LayoutParams(-1, iah0.a(f)));
                bwt0.f0(vkDivider, iah0.a(f), 0, 0, iah0.a(f), 6);
                return new isn(vkDivider);
            case 12:
                qgi0.n((tgi0) obj, 0);
                return s3q0.a;
            default:
                hh8 hh8Var = (hh8) obj;
                if (hh8Var instanceof hh8.a) {
                    hh8.a aVar = (hh8.a) hh8Var;
                    nt80<dfw0> nt80Var = aVar.f;
                    nt80Var.getClass();
                    if ((nt80Var instanceof nt80.c) && aVar.j) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ eyp0(snu0 snu0Var) {
        this.b = 11;
    }
}
