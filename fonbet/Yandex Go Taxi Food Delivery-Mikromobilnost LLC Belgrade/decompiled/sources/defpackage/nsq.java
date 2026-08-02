package defpackage;

import com.yandex.go.feedback_common.data.model.FeedbackParam;
import com.yandex.go.feedback_common.data.model.QuestionInfo$$serializer;
import com.yandex.go.feedback_common.data.model.a;
import com.yandex.go.multimodal_route.network.models.FeedbackHintDto;
import com.yandex.go.multimodal_route.network.models.g;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.request.FilterRequestDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.request.FilterRequestDto$$serializer;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.request.FiltersAndSortingRequestDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.request.SortRequestDto$$serializer;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.FilterChipDto$$serializer;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.FilterChoiceOptionDto$$serializer;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.FilterDto$OneOfManySelectionFilterDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.FilterModalChipBlockDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.FiltersAndSortingResponseDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.d;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.f;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.h;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.i;
import com.yandex.go.taxi.order.feedback.data.model.FeedbackProposalResponse;
import com.yandex.go.taxi.order.feedback.data.model.SurveyQuestion$$serializer;
import com.yandex.go.taxi.order.feedback.data.model.b;
import com.yandex.go.taxi.order.models.api.response.FeedbackDto;
import com.yandex.go.taxi.order.models.api.response.l0;
import com.yandex.go.zone.dto.objects.FeedbackBadgeChoice$FeedbackBadgeType;
import com.yandex.go.zone.dto.objects.FeedbackRatingMapping;
import com.yandex.go.zone.dto.objects.i2;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.object.TaxiOrderFeedbackFlow;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;

/* loaded from: classes13.dex */
public final /* synthetic */ class nsq implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ nsq(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                l0 l0Var = FeedbackDto.Companion;
                return TaxiOrderFeedbackFlow.Companion.serializer();
            case 1:
                g gVar = FeedbackHintDto.Companion;
                return new p53(h6w.a, 0);
            case 2:
                ltq ltqVar = mtq.Companion;
                return new p53(h6w.a, 0);
            case 3:
                qtq qtqVar = rtq.Companion;
                return TaxiOrderFeedbackFlow.Companion.serializer();
            case 4:
                a aVar = FeedbackParam.Companion;
                return new p53(QuestionInfo$$serializer.INSTANCE, 0);
            case 5:
                return FeedbackSettingsParams$Screen.Companion.serializer();
            case 6:
                return new p53(auu0.a, 0);
            case 7:
                return new p53(auu0.a, 0);
            case 8:
                b bVar = FeedbackProposalResponse.Companion;
                return new p53(SurveyQuestion$$serializer.INSTANCE, 0);
            case 9:
                i2 i2Var = FeedbackRatingMapping.Companion;
                return new p53(auu0.a, 0);
            case 10:
                i2 i2Var2 = FeedbackRatingMapping.Companion;
                return FeedbackBadgeChoice$FeedbackBadgeType.Companion.serializer();
            case 11:
                iuq iuqVar = juq.Companion;
                return new p53(ktq.a, 0);
            case 12:
                suq suqVar = tuq.Companion;
                return new p53(ftq.a, 0);
            case 13:
                return FeedbackSettingsParams$Screen.Companion.serializer();
            case 14:
                return vez0.g("ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams.Screen", FeedbackSettingsParams$Screen.values(), new String[]{"finish_card", "cancel_card"}, new Annotation[][]{null, null});
            case 15:
                zuq zuqVar = avq.Companion;
                return new p53(wsq.a, 0);
            case 16:
                zuq zuqVar2 = avq.Companion;
                return new p53(mvq.a, 0);
            case 17:
                zuq zuqVar3 = avq.Companion;
                return new p53(auu0.a, 0);
            case 18:
                return "Feedback queue file: repair error - can't delete";
            case 19:
                nvq nvqVar = ovq.Companion;
                return new p53(auu0.a, 0);
            case 20:
                d dVar = FilterDto$OneOfManySelectionFilterDto.Companion;
                return new p53(FilterChoiceOptionDto$$serializer.INSTANCE, 0);
            case 21:
                return new o4o("com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.FilterDto.Unknown", f.INSTANCE, new Annotation[0]);
            case 22:
                h hVar = FilterModalChipBlockDto.Companion;
                return new p53(FilterChipDto$$serializer.INSTANCE, 0);
            case 23:
                com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.request.b bVar2 = FilterRequestDto.Companion;
                return FilterRequestDto.FilterTypeDto.Companion.serializer();
            case 24:
                return vez0.g("com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.request.FilterRequestDto.FilterTypeDto", FilterRequestDto.FilterTypeDto.values(), new String[]{"toggle_filter_request", "selection_filter_request"}, new Annotation[][]{null, null});
            case 25:
                return new o4o("ru.yandex.taxi.masstransit.trains.schedule.dto.FilterUnknown", e5r.INSTANCE, new Annotation[0]);
            case 26:
                return new o4o("com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.FilterUnknown", com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.a.INSTANCE, new Annotation[0]);
            case 27:
                com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.request.d dVar2 = FiltersAndSortingRequestDto.Companion;
                return new p53(FilterRequestDto$$serializer.INSTANCE, 0);
            case 28:
                com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.request.d dVar3 = FiltersAndSortingRequestDto.Companion;
                return new p53(SortRequestDto$$serializer.INSTANCE, 0);
            default:
                i iVar = FiltersAndSortingResponseDto.Companion;
                return new p53(i4r.e, 0);
        }
    }
}
