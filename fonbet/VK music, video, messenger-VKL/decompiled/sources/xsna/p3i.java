package xsna;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.dto.group.Group;
import com.vk.profile.community.suggestions.impl.ui.suggestions.a;
import ru.ok.gl.tf.Tensorflow;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class p3i implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p3i(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                ((com.vk.profile.community.suggestions.impl.ui.suggestions.g) this.c).c.invoke(new a.f((Group) obj, (String) obj2, (View) obj3));
                break;
            case 1:
                String str = (String) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(216626821, intValue, -1, "com.vk.clips.coauthors.selector.ui.recommendedTitle.<anonymous> (LoadedContent.kt:290)");
                    }
                    com.vk.core.compose.component.group.header.g.b(f.a.a(str, null, null, null, null, null, null, null, false, aVar, 805306368, 510), txj0.h(ahn.E(q630.a.a, "RecommendedTitle"), 46), b.d.a, null, null, null, false, aVar, Tensorflow.FRAME_WIDTH, 120);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 2:
                eka0 eka0Var = (eka0) this.c;
                int intValue2 = ((Integer) obj2).intValue();
                int intValue3 = ((Integer) obj3).intValue();
                if (intValue2 != 0 && intValue3 != 0) {
                    eka0Var.t.a();
                }
                break;
            default:
                i8s0 i8s0Var = (i8s0) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue4 & 1, (intValue4 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(774036376, intValue4, -1, "com.vk.design.demo.presentation.screens.VideoCardScreenContent.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VideoCardScreenContent.kt:79)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getText().m;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c("Интерактивная карточка", s200.F(4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a), j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.l1, aVar2, 54, 0, 8184);
                    i8s0Var.b(0, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}
