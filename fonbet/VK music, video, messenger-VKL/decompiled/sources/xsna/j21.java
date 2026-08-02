package xsna;

import android.content.Context;
import android.view.View;
import com.vk.api.generated.masks.dto.MasksGetAssetVersionResponseDto;
import com.vk.api.generated.masks.dto.MasksGetModelResponseDto;
import com.vk.clips.design.view.camera.ClipsTimerTimeSelectorWrap;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.core.tool.view.GapLinearLayout;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.masks.SmartMasksGetModelResponse;
import com.vk.dto.music.MusicTrack;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.video.ui.upload.impl.coverchoose.presentation.fragment.CoverChooseFragmentInternalComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import xsna.tpb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class j21 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ j21(byte b, int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        r2 = null;
        String str = null;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                return Integer.valueOf(((Integer) obj2).intValue() - 1);
            case 2:
                VkImage vkImage = (VkImage) obj;
                VkCell.f fVar = (VkCell.f) obj2;
                if ((fVar instanceof tpb.a.C3760a ? (tpb.a.C3760a) fVar : null) != null) {
                    vkImage.setImageResource(((tpb.a.C3760a) fVar).a);
                }
                return s3q0.a;
            case 3:
                int i = ClipsTimerTimeSelectorWrap.d;
                return y8g0.f(R.string.clips_camera_timer_recording_descr, (String) obj, (String) obj2);
            case 4:
                return (MusicTrack) ((zoj0) obj2).c(((Integer) obj).intValue());
            case 5:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-169542922, intValue, -1, "com.vk.profile.community.impl.ui.profile.content.holders.wall.ComposableSingletons$CommunityProfileContentWallViewHolderKt.lambda$-169542922.<anonymous> (CommunityProfileContentWallViewHolder.kt:146)");
                    }
                    rrv0.d(null, null, null, null, m4s.d, aVar, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 6:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(402377103, intValue2, -1, "com.vk.onboardingpromo.impl.ui.view.ComposableSingletons$OnboardingPromoFullscreenSlidesKt.lambda$402377103.<anonymous> (OnboardingPromoFullscreenSlides.kt:205)");
                    }
                    lg90 a = pg90.a(R.drawable.vk_icon_cancel_28, 0, aVar2);
                    String N = d370.N(R.string.accessibility_promo_onboarding_close, 0, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pzu0.b(a, N, null, ylu0Var.getIcon().l, aVar2, 8, 4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 7:
                return new CoverChooseFragmentInternalComponent((v0k) obj2);
            case 8:
                ((Integer) obj).intValue();
                int i2 = GapLinearLayout.c;
                return Boolean.valueOf(((View) obj2).getVisibility() != 8);
            case 9:
                ((Integer) obj2).getClass();
                g3x.e(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 10:
                int intValue3 = ((Integer) obj2).intValue();
                bpn0 bpn0Var = uvg0.a;
                return uvg0.b((Context) obj, 1, intValue3, new ap30(qvg0.b, 14));
            case 11:
                return s3q0.a;
            case 12:
                return Integer.valueOf(((udo0) obj2).a);
            case 13:
                MasksGetModelResponseDto masksGetModelResponseDto = (MasksGetModelResponseDto) obj;
                MasksGetAssetVersionResponseDto masksGetAssetVersionResponseDto = (MasksGetAssetVersionResponseDto) obj2;
                String d = masksGetAssetVersionResponseDto.d();
                if (d != null && d.length() != 0) {
                    str = d;
                }
                Integer e = masksGetAssetVersionResponseDto.e();
                return new SmartMasksGetModelResponse(masksGetModelResponseDto.e(), e != null ? e.intValue() : 1, masksGetModelResponseDto.d(), str);
            case 14:
                String str2 = (String) obj2;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (List) obj) {
                    AboutVideoItem aboutVideoItem = (AboutVideoItem) obj3;
                    if (!(aboutVideoItem instanceof AboutVideoItem.SimilarVideoRedesign) || !epx.f(((AboutVideoItem.SimilarVideoRedesign) aboutVideoItem).b.a.a1(), str2)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 15:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar3.K(-1159446338);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1159446338, intValue4, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:234)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.T0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return frv0Var;
            default:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken2 = VkTypographyToken.DisplayTitle1;
                aVar4.K(-1178987460);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1178987460, intValue5, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:214)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) aVar4.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var2 = wuv0Var2.z0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
                return frv0Var2;
        }
    }

    public /* synthetic */ j21(t5k0 t5k0Var) {
        this.b = 13;
    }
}
