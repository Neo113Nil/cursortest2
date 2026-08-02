package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.video.dto.VideoGetByIdsResponseDto;
import com.vk.api.generated.video.dto.VideoGetResponseDto;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.dto.common.VideoFile;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.gl.tf.Tensorflow;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class t0r implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t0r(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        boolean z;
        switch (this.b) {
            case 0:
                v0r v0rVar = (v0r) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-48499800, intValue, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentsList.<anonymous>.<anonymous>.<anonymous> (FeedInlineCommentsScreenContent.kt:134)");
                    }
                    v0rVar.l(0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                wh50 wh50Var = (wh50) this.c;
                k1i0 k1i0Var = (k1i0) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(k1i0Var) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-460862516, intValue2, -1, "com.vk.design.demo.presentation.screens.FormFieldScreenContent.Content.<anonymous>.<anonymous> (FormFieldScreenContent.kt:89)");
                    }
                    if (((Number) wh50Var.getValue()).intValue() == 0) {
                        i = intValue2;
                        z = true;
                    } else {
                        i = intValue2;
                        z = false;
                    }
                    Object x = aVar2.x();
                    Object obj4 = a.C0011a.a;
                    if (x == obj4) {
                        x = new a36(1, wh50Var);
                        aVar2.R(x);
                    }
                    int i2 = ((i << 12) & 57344) | Tensorflow.FRAME_WIDTH;
                    k1i0Var.b(z, (gzs) x, xfi.a, null, aVar2, i2, 8);
                    boolean z2 = ((Number) wh50Var.getValue()).intValue() == 1;
                    Object x2 = aVar2.x();
                    if (x2 == obj4) {
                        x2 = new l8s(0, wh50Var);
                        aVar2.R(x2);
                    }
                    k1i0Var.b(z2, (gzs) x2, xfi.b, null, aVar2, i2, 8);
                    boolean z3 = ((Number) wh50Var.getValue()).intValue() == 2;
                    Object x3 = aVar2.x();
                    if (x3 == obj4) {
                        x3 = new c36(1, wh50Var);
                        aVar2.R(x3);
                    }
                    k1i0Var.b(z3, (gzs) x3, xfi.c, null, aVar2, i2, 8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                af90 af90Var = (af90) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2129208773, intValue3, -1, "com.vk.core.tool.compose.onboarding.fullscreen.PaginationWithButtonImpl.Content.<anonymous>.<anonymous> (PaginationWithButtonImpl.kt:49)");
                }
                float f = 24;
                bhu0.e((gzs) ((zak0) af90Var.b).getValue(), (ButtonSize) ((zak0) af90Var.c).getValue(), (ButtonStyle) ((zak0) af90Var.d).getValue(), (ButtonAppearance) ((zak0) af90Var.e).getValue(), com.vk.core.compose.component.semantics.b.b(s200.H(txj0.f(q630.a.a, 1.0f), f, 8, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), (SemanticsConfiguration) ((zak0) af90Var.f).getValue()), null, false, false, null, null, null, (String) ((zak0) af90Var.a).getValue(), null, null, null, null, false, null, null, null, aVar3, 0, 0, 0, 4190176);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            case 3:
                jai jaiVar = (jai) this.c;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-161210139, intValue4, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.background.TopshelfFadeVisibility.<anonymous> (TopshelfCardBackground.kt:165)");
                }
                if (cq.i(0, aVar4, jaiVar)) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            case 4:
                VideoGetByIdsResponseDto videoGetByIdsResponseDto = (VideoGetByIdsResponseDto) obj;
                return ((com.vk.libvideo.a) this.c).a.invoke(new VideoGetResponseDto(videoGetByIdsResponseDto.d().size(), videoGetByIdsResponseDto.d(), (List) obj3, ((GroupsGetByIdObjectResponseDto) obj2).d(), null, null, 48, null));
            default:
                yg5 yg5Var = (yg5) this.c;
                VideoFile videoFile = (VideoFile) obj;
                j4t0 j4t0Var = (j4t0) obj2;
                drt0 drt0Var = (drt0) obj3;
                EmptyList emptyList = EmptyList.b;
                d3b0 v0 = yg5Var.v0();
                return new mit0(videoFile, j4t0Var, drt0Var, emptyList, null, v0 != null ? v0.getSessionId() : null, false);
        }
    }
}
