package defpackage;

import androidx.compose.material3.h;
import com.adjust.sdk.Constants;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityCommentSuggestSelectorDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityCommentSuggestSelectorDto$SuggestItemDto$$serializer;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardActionDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardBannerDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardBannerDto$$serializer;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardBannerStyleDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardButtonsDataDto$Button;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardButtonsDataDto$ButtonStyle;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardButtonsDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardCommentSelectorTypeDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardGeoPointDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardPopupsDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity$PlaceholderPoint$$serializer;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$DueSelectorSectionDtoIntercity;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$PreorderDueViewOverrideParam$$serializer;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$PreorderDueViewParams;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity$SeatsSelectorTariffRule$$serializer;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity$SelectorItemDto$$serializer;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionShowRule$SelectedTariffShowRule;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionTypeDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.SimpleIntercityDashboardButtonsDto$$serializer;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.a;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.a0;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.b;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.c0;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.e;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.f;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.h0;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.i;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.j0;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.k;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.k0;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.m;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.o;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.r;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.v;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.w;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.y;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.dashboard.IntercityDashboardResponseDto;
import java.lang.annotation.Annotation;

/* loaded from: classes10.dex */
public final /* synthetic */ class i8w implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ i8w(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        switch (this.a) {
            case 0:
                bqu bquVar = h.a;
                return Boolean.TRUE;
            case 1:
                a7u0 a7u0Var = j8w.a;
                return Boolean.TRUE;
            case 2:
                return new y7m(48.0f);
            case 3:
                return new o4o("com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityCommentDefaultDto", a.INSTANCE, new Annotation[0]);
            case 4:
                b bVar = IntercityCommentSuggestSelectorDto.Companion;
                return new p53(IntercityCommentSuggestSelectorDto$SuggestItemDto$$serializer.INSTANCE, 0);
            case 5:
                b bVar2 = IntercityCommentSuggestSelectorDto.Companion;
                return IntercityDashboardCommentSelectorTypeDto.Companion.serializer();
            case 6:
                e eVar = IntercityDashboardActionDto.Companion;
                return IntercityDashboardActionDto.ActionType.Companion.serializer();
            case 7:
                return vez0.g("com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardActionDto.ActionType", IntercityDashboardActionDto.ActionType.values(), new String[]{"happy_hours", "discovery", Constants.DEEPLINK, "open_popup", "url", null}, new Annotation[][]{null, null, null, null, null, null});
            case 8:
                f fVar = IntercityDashboardBannerDto.Companion;
                return IntercityDashboardSectionTypeDto.Companion.serializer();
            case 9:
                com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.h hVar = IntercityDashboardBannerStyleDto.Companion;
                return IntercityDashboardBannerStyleDto.BannerType.Companion.serializer();
            case 10:
                return vez0.g("com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardBannerStyleDto.BannerType", IntercityDashboardBannerStyleDto.BannerType.values(), new String[]{"plain", "coupon", null}, new Annotation[][]{null, null, null});
            case 11:
                i iVar = IntercityDashboardButtonsDataDto$Button.Companion;
                return IntercityDashboardButtonsDataDto$ButtonStyle.Companion.serializer();
            case 12:
                return vez0.g("com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardButtonsDataDto.ButtonStyle", IntercityDashboardButtonsDataDto$ButtonStyle.values(), new String[]{"main", "minor", null}, new Annotation[][]{null, null, null});
            case 13:
                k kVar = IntercityDashboardButtonsDto.Companion;
                return new k8u(auu0.a, SimpleIntercityDashboardButtonsDto$$serializer.INSTANCE, 1);
            case 14:
                return vez0.g("com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardCommentSelectorTypeDto", IntercityDashboardCommentSelectorTypeDto.values(), new String[]{"suggests", null}, new Annotation[][]{null, null});
            case 15:
                zy11Var = zy11.a;
                return zy11Var;
            case 16:
                m mVar = IntercityDashboardGeoPointDto.Companion;
                return new p53(e6m.a, 0);
            case 17:
                o oVar = IntercityDashboardPopupsDto.Companion;
                return new p53(k480.e, 0);
            case 18:
                com.yandex.go.taxi.intercity.dashboard.impl.data.entity.dashboard.b bVar3 = IntercityDashboardResponseDto.Companion;
                return new p53(jjw.f, 0);
            case 19:
                com.yandex.go.taxi.intercity.dashboard.impl.data.entity.dashboard.b bVar4 = IntercityDashboardResponseDto.Companion;
                return new p53(IntercityDashboardBannerDto$$serializer.INSTANCE, 0);
            case 20:
                r rVar = IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity.PlaceholderPoint.Companion;
                return new k8u(auu0.a, IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity$PlaceholderPoint$$serializer.INSTANCE, 1);
            case 21:
                v vVar = IntercityDashboardSectionDto$DueSelectorSectionDtoIntercity.Companion;
                return new k8u(auu0.a, IntercityDashboardSectionDto$PreorderDueViewOverrideParam$$serializer.INSTANCE, 1);
            case 22:
                return new o4o("com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto.HeaderSectionDtoIntercity", w.INSTANCE, new Annotation[0]);
            case 23:
                y yVar = IntercityDashboardSectionDto$PreorderDueViewParams.Companion;
                return IntercityDashboardSectionDto$PreorderDueViewParams.Type.Companion.serializer();
            case 24:
                return vez0.g("com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto.PreorderDueViewParams.Type", IntercityDashboardSectionDto$PreorderDueViewParams.Type.values(), new String[]{"default", "timetable", "timetable_with_seats", Constants.DEEPLINK}, new Annotation[][]{null, null, null, null});
            case 25:
                a0 a0Var = IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity.Companion;
                return new k8u(auu0.a, IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity$SeatsSelectorTariffRule$$serializer.INSTANCE, 1);
            case 26:
                c0 c0Var = IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.Companion;
                return new p53(IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity$SelectorItemDto$$serializer.INSTANCE, 0);
            case 27:
                return new o4o("com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto.UnknownSectionDtoIntercity", h0.INSTANCE, new Annotation[0]);
            case 28:
                j0 j0Var = IntercityDashboardSectionShowRule$SelectedTariffShowRule.Companion;
                return new p53(auu0.a, 0);
            default:
                return new o4o("com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionShowRule.UnknownSectionShowRule", k0.INSTANCE, new Annotation[0]);
        }
    }
}
