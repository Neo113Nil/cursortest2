package xsna;

import android.content.Context;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.recomSettings.dto.RecomSettingsGetAvailableRecomThemesResponseDto;
import com.vk.api.generated.recomSettings.dto.RecomSettingsRecomThemeDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.feature.music.ui.holder.MusicDownloadsHistoryCatalogRootVh;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.dto.newsfeed.SituationalSuggest;
import com.vk.log.L;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerState;
import com.vk.storycamera.picker.feature.StoryMediaPickerState;
import com.vk.superapp.api.dto.app.catalog.section.AppsCatalogSection;
import com.vk.superapp.api.dto.app.catalog.section.AppsHorizontalListSection;
import com.vk.video.ui.smartcrop.impl.presentation.feature.entity.SmartCropState;
import com.vk.voip.ui.broadcast.fragments.info.StreamInfoFragment;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduleCallTimeZone;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.dz40;
import xsna.fh8;
import xsna.lyq0;
import xsna.qg8;
import xsna.v9i0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class oi40 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ oi40(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List<RecomSettingsRecomThemeDto> d;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(MusicDownloadsHistoryCatalogRootVh.k0((List) obj) != null);
            case 1:
                qgi0.r((tgi0) obj, "vk_top_bar_back_btn");
                return s3q0.a;
            case 2:
                MusicPickerList musicPickerList = (MusicPickerList) j5g.k0(((MusicPickerState) obj).j);
                return Boolean.valueOf(((musicPickerList instanceof MusicPickerList.Tracks) || (musicPickerList instanceof MusicPickerList.Playlists)) && !qu40.l(musicPickerList));
            case 3:
                return ((xhp0) ((whp0) obj)).a.b;
            case 4:
                qgi0.r((tgi0) obj, "explicitIcon");
                return s3q0.a;
            case 5:
                return ((me70) obj).getKey();
            case 6:
                qgi0.r((tgi0) obj, "order_status");
                return s3q0.a;
            case 7:
                dy40 dy40Var = ((sy40) obj).e;
                return new dz40.c(dy40Var.a, dy40Var.b, false);
            case 8:
                return ((kk6) obj).b(null);
            case 9:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 10:
                return Boolean.valueOf(fkq0.c(((UIBlock) obj).g));
            case 11:
                qcy<Object>[] qcyVarArr = ReactionsFeedFragment.q0;
                return Boolean.valueOf(((j5f0) obj).b.e);
            case 12:
                return Boolean.valueOf(!drm0.N(((VoipScheduleCallTimeZone) obj).c));
            case 13:
                return ((v9i0.d) obj).b;
            case 14:
                ((Integer) obj).intValue();
                return s3q0.a;
            case 15:
                return new wvz((SituationalSuggest) obj);
            case 16:
                return SmartCropState.a((SmartCropState) obj, null, null, null, null, 0L, false, null, false, false, null, 1791);
            case 17:
                return qkk0.n((Context) obj, false, VkSpinner.SpinnerSize.Size36);
            case 18:
                return Boolean.valueOf(((Integer) obj).intValue() > 0);
            case 19:
                return Boolean.valueOf(((nov) obj) instanceof qx5);
            case 20:
                qgi0.r((tgi0) obj, "alert_positive_button");
                return s3q0.a;
            case 21:
                return (StoryMediaPickerState.a) obj;
            case 22:
                Pair pair = (Pair) obj;
                return new VkPaginationList((List) pair.i(), 0, ((Boolean) pair.j()).booleanValue(), 0, 10, null);
            case 23:
                return s3q0.a;
            case 24:
                Throwable th = (Throwable) obj;
                L.i(th);
                h03.b(th);
                return s3q0.a;
            case 25:
                int i = StreamInfoFragment.S;
                return new it80(((qg8) obj) instanceof qg8.b ? fh8.b.C2873b.a : null);
            case 26:
                ryq0 ryq0Var = (ryq0) obj;
                RecomSettingsGetAvailableRecomThemesResponseDto recomSettingsGetAvailableRecomThemesResponseDto = ryq0Var.f;
                if (recomSettingsGetAvailableRecomThemesResponseDto == null || (d = recomSettingsGetAvailableRecomThemesResponseDto.d()) == null) {
                    return null;
                }
                int i2 = lyq0.a.$EnumSwitchMapping$0[ryq0Var.l.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        return rli0.A(rli0.o(new i5g(d), new cim0(ryq0Var, 5)));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                List<RecomSettingsRecomThemeDto> list = d;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (RecomSettingsRecomThemeDto recomSettingsRecomThemeDto : list) {
                    arrayList.add(new faf0(String.valueOf(recomSettingsRecomThemeDto.getId()), recomSettingsRecomThemeDto.e(), ryq0Var.h.contains(String.valueOf(recomSettingsRecomThemeDto.getId())), recomSettingsRecomThemeDto.d()));
                }
                return arrayList;
            case 27:
                ArrayList<AppsCatalogSection> arrayList2 = ((ke3) obj).a;
                ArrayList arrayList3 = new ArrayList();
                for (AppsCatalogSection appsCatalogSection : arrayList2) {
                    AppsHorizontalListSection appsHorizontalListSection = appsCatalogSection instanceof AppsHorizontalListSection ? (AppsHorizontalListSection) appsCatalogSection : null;
                    if (appsHorizontalListSection != null) {
                        arrayList3.add(appsHorizontalListSection);
                    }
                }
                return arrayList3;
            case 28:
                tq2 tq2Var = (tq2) obj;
                return new mxj0((Float.floatToRawIntBits(tq2Var.a) << 32) | (Float.floatToRawIntBits(tq2Var.b) & 4294967295L));
            default:
                return s3q0.a;
        }
    }

    public /* synthetic */ oi40(Object obj, int i) {
        this.b = i;
    }
}
