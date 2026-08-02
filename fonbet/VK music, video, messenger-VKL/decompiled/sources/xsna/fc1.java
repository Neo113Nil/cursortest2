package xsna;

import android.widget.ImageView;
import androidx.compose.runtime.a;
import com.vk.catalog2.common.ui.mvp.holder.video.assistant.c;
import com.vk.catalog2.feature.music.holders.podcast.ComposePodcastSliderVh;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.dto.common.VerifyInfo;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.isc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class fc1 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fc1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                com.vk.catalog2.common.ui.mvp.holder.video.assistant.b.g((c.d) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                euc eucVar = (euc) obj4;
                z37 z37Var = (z37) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr = isc.t1;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-170718709, intValue, -1, "com.vk.clips.viewer.edit.presentation.fragment.ClipEditSdkBottomSheet.Content.<anonymous>.<anonymous>.<anonymous> (ClipEditSdkBottomSheet.kt:212)");
                    }
                    boolean J = aVar.J(z37Var);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        isc.e eVar = new isc.e(1, z37Var, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                        aVar.R(eVar);
                        x = eVar;
                    }
                    vzo.b(eucVar, (izs) ((fcy) x), aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 2:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                ((l14) obj4).invoke((e520) obj2);
                dw20 dw20Var = (dw20) ref$ObjectRef.element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                ref$ObjectRef.element = null;
                break;
            case 3:
                ijb0 ijb0Var = (ijb0) obj4;
                ComposePodcastSliderVh composePodcastSliderVh = (ComposePodcastSliderVh) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-185281776, intValue2, -1, "com.vk.catalog2.feature.music.holders.podcast.ComposePodcastSliderVh.bindData.<anonymous> (ComposePodcastSliderVh.kt:90)");
                    }
                    rrv0.d(null, null, null, null, kai.c(1296585653, new mz1(6, ijb0Var, composePodcastSliderVh), aVar2), aVar2, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 4:
                VerifyInfoHelper.k((ImageView) obj4, true, (VerifyInfo) obj3, false, false, 40);
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((d.c.C0760d) obj4).e((mtk0) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
            default:
                f7v0 f7v0Var = (f7v0) obj4;
                VkOnboardingStat$Delegate vkOnboardingStat$Delegate = (VkOnboardingStat$Delegate) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(17003228, intValue3, -1, "com.vk.core.tool.compose.onboarding.VkOnboardingBanner.<anonymous> (VkOnboardingBanner.kt:76)");
                    }
                    f7v0Var.a(vkOnboardingStat$Delegate, aVar3, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ fc1(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
