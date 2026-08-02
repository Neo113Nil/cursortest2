package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\fR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\fR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/GetDashboardResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/dashboard/internal/data/dto/GetDashboardResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "divDataDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/ybsdk/feature/dashboard/internal/data/dto/ScreenItem;", "listOfScreenItemAdapter", "Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardFullScreenResponse;", "nullableListOfDashboardFullScreenResponseAdapter", "", "nullableStringAdapter", "Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardBalanceModel;", "dashboardBalanceModelAdapter", "Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardNavigationItemModel;", "nullableDashboardNavigationItemModelAdapter", "Lcom/ybsdk/feature/dashboard/internal/data/dto/HeaderTopButtonsResponse;", "listOfHeaderTopButtonsResponseAdapter", "Lcom/ybsdk/feature/dashboard/internal/data/dto/CardInfo;", "nullableCardInfoAdapter", "Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardBottomButton;", "nullableDashboardBottomButtonAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetDashboardResponseJsonAdapter extends JsonAdapter<GetDashboardResponse> {
    private volatile Constructor<GetDashboardResponse> constructorRef;
    private final JsonAdapter<DashboardBalanceModel> dashboardBalanceModelAdapter;
    private final JsonAdapter<DivDataDto> divDataDtoAdapter;
    private final JsonAdapter<List<HeaderTopButtonsResponse>> listOfHeaderTopButtonsResponseAdapter;
    private final JsonAdapter<List<ScreenItem>> listOfScreenItemAdapter;
    private final JsonAdapter<CardInfo> nullableCardInfoAdapter;
    private final JsonAdapter<DashboardBottomButton> nullableDashboardBottomButtonAdapter;
    private final JsonAdapter<DashboardNavigationItemModel> nullableDashboardNavigationItemModelAdapter;
    private final JsonAdapter<List<DashboardFullScreenResponse>> nullableListOfDashboardFullScreenResponseAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("common_div_data", "screen_items", "fullscreens", "agreement_id", "balance", "navigation_item", "header_top_buttons", "cursor", "card", "bottom_button");

    public GetDashboardResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.divDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "commonDivData");
        this.listOfScreenItemAdapter = moshi.adapter(Types.newParameterizedType(List.class, ScreenItem.class), emptySet, "screenItems");
        this.nullableListOfDashboardFullScreenResponseAdapter = moshi.adapter(Types.newParameterizedType(List.class, DashboardFullScreenResponse.class), emptySet, "fullScreens");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "agreementId");
        this.dashboardBalanceModelAdapter = moshi.adapter(DashboardBalanceModel.class, emptySet, "balance");
        this.nullableDashboardNavigationItemModelAdapter = moshi.adapter(DashboardNavigationItemModel.class, emptySet, "navigationItem");
        this.listOfHeaderTopButtonsResponseAdapter = moshi.adapter(Types.newParameterizedType(List.class, HeaderTopButtonsResponse.class), emptySet, "topButtons");
        this.nullableCardInfoAdapter = moshi.adapter(CardInfo.class, emptySet, "cardInfo");
        this.nullableDashboardBottomButtonAdapter = moshi.adapter(DashboardBottomButton.class, emptySet, "bottomButton");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetDashboardResponse fromJson(JsonReader jsonReader) {
        int i;
        jsonReader.beginObject();
        int i2 = -1;
        DivDataDto divDataDto = null;
        List<ScreenItem> list = null;
        List<DashboardFullScreenResponse> list2 = null;
        String str = null;
        DashboardBalanceModel dashboardBalanceModel = null;
        DashboardNavigationItemModel dashboardNavigationItemModel = null;
        List<HeaderTopButtonsResponse> list3 = null;
        String str2 = null;
        CardInfo cardInfo = null;
        DashboardBottomButton dashboardBottomButton = null;
        while (true) {
            DivDataDto divDataDto2 = divDataDto;
            List<ScreenItem> list4 = list;
            List<DashboardFullScreenResponse> list5 = list2;
            String str3 = str;
            if (!jsonReader.hasNext()) {
                DashboardBalanceModel dashboardBalanceModel2 = dashboardBalanceModel;
                jsonReader.endObject();
                if (i2 == -9) {
                    if (divDataDto2 == null) {
                        throw Util.missingProperty("commonDivData", "common_div_data", jsonReader);
                    }
                    if (list4 == null) {
                        throw Util.missingProperty("screenItems", "screen_items", jsonReader);
                    }
                    if (dashboardBalanceModel2 == null) {
                        throw Util.missingProperty("balance", "balance", jsonReader);
                    }
                    if (list3 == null) {
                        throw Util.missingProperty("topButtons", "header_top_buttons", jsonReader);
                    }
                    CardInfo cardInfo2 = cardInfo;
                    return new GetDashboardResponse(divDataDto2, list4, list5, str3, dashboardBalanceModel2, dashboardNavigationItemModel, list3, str2, cardInfo2, dashboardBottomButton);
                }
                Constructor<GetDashboardResponse> constructor = this.constructorRef;
                if (constructor == null) {
                    i = i2;
                    constructor = GetDashboardResponse.class.getDeclaredConstructor(DivDataDto.class, List.class, List.class, String.class, DashboardBalanceModel.class, DashboardNavigationItemModel.class, List.class, String.class, CardInfo.class, DashboardBottomButton.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                    this.constructorRef = constructor;
                } else {
                    i = i2;
                }
                Constructor<GetDashboardResponse> constructor2 = constructor;
                if (divDataDto2 == null) {
                    throw Util.missingProperty("commonDivData", "common_div_data", jsonReader);
                }
                if (list4 == null) {
                    throw Util.missingProperty("screenItems", "screen_items", jsonReader);
                }
                if (dashboardBalanceModel2 == null) {
                    throw Util.missingProperty("balance", "balance", jsonReader);
                }
                if (list3 == null) {
                    throw Util.missingProperty("topButtons", "header_top_buttons", jsonReader);
                }
                return constructor2.newInstance(divDataDto2, list4, list5, str3, dashboardBalanceModel2, dashboardNavigationItemModel, list3, str2, cardInfo, dashboardBottomButton, Integer.valueOf(i), null);
            }
            DashboardBalanceModel dashboardBalanceModel3 = dashboardBalanceModel;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    dashboardBalanceModel = dashboardBalanceModel3;
                    divDataDto = divDataDto2;
                    list = list4;
                    list2 = list5;
                    str = str3;
                case 0:
                    divDataDto = this.divDataDtoAdapter.fromJson(jsonReader);
                    if (divDataDto == null) {
                        throw Util.unexpectedNull("commonDivData", "common_div_data", jsonReader);
                    }
                    dashboardBalanceModel = dashboardBalanceModel3;
                    list = list4;
                    list2 = list5;
                    str = str3;
                case 1:
                    list = this.listOfScreenItemAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("screenItems", "screen_items", jsonReader);
                    }
                    dashboardBalanceModel = dashboardBalanceModel3;
                    divDataDto = divDataDto2;
                    list2 = list5;
                    str = str3;
                case 2:
                    list2 = this.nullableListOfDashboardFullScreenResponseAdapter.fromJson(jsonReader);
                    dashboardBalanceModel = dashboardBalanceModel3;
                    divDataDto = divDataDto2;
                    list = list4;
                    str = str3;
                case 3:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    dashboardBalanceModel = dashboardBalanceModel3;
                    divDataDto = divDataDto2;
                    list = list4;
                    list2 = list5;
                    i2 = -9;
                case 4:
                    dashboardBalanceModel = this.dashboardBalanceModelAdapter.fromJson(jsonReader);
                    if (dashboardBalanceModel == null) {
                        throw Util.unexpectedNull("balance", "balance", jsonReader);
                    }
                    divDataDto = divDataDto2;
                    list = list4;
                    list2 = list5;
                    str = str3;
                case 5:
                    dashboardNavigationItemModel = this.nullableDashboardNavigationItemModelAdapter.fromJson(jsonReader);
                    dashboardBalanceModel = dashboardBalanceModel3;
                    divDataDto = divDataDto2;
                    list = list4;
                    list2 = list5;
                    str = str3;
                case 6:
                    list3 = this.listOfHeaderTopButtonsResponseAdapter.fromJson(jsonReader);
                    if (list3 == null) {
                        throw Util.unexpectedNull("topButtons", "header_top_buttons", jsonReader);
                    }
                    dashboardBalanceModel = dashboardBalanceModel3;
                    divDataDto = divDataDto2;
                    list = list4;
                    list2 = list5;
                    str = str3;
                case 7:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    dashboardBalanceModel = dashboardBalanceModel3;
                    divDataDto = divDataDto2;
                    list = list4;
                    list2 = list5;
                    str = str3;
                case 8:
                    cardInfo = this.nullableCardInfoAdapter.fromJson(jsonReader);
                    dashboardBalanceModel = dashboardBalanceModel3;
                    divDataDto = divDataDto2;
                    list = list4;
                    list2 = list5;
                    str = str3;
                case 9:
                    dashboardBottomButton = this.nullableDashboardBottomButtonAdapter.fromJson(jsonReader);
                    dashboardBalanceModel = dashboardBalanceModel3;
                    divDataDto = divDataDto2;
                    list = list4;
                    list2 = list5;
                    str = str3;
                default:
                    dashboardBalanceModel = dashboardBalanceModel3;
                    divDataDto = divDataDto2;
                    list = list4;
                    list2 = list5;
                    str = str3;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetDashboardResponse getDashboardResponse) {
        GetDashboardResponse getDashboardResponse2 = getDashboardResponse;
        if (getDashboardResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("common_div_data");
        this.divDataDtoAdapter.toJson(jsonWriter, (JsonWriter) getDashboardResponse2.getCommonDivData());
        jsonWriter.name("screen_items");
        this.listOfScreenItemAdapter.toJson(jsonWriter, (JsonWriter) getDashboardResponse2.getScreenItems());
        jsonWriter.name("fullscreens");
        this.nullableListOfDashboardFullScreenResponseAdapter.toJson(jsonWriter, (JsonWriter) getDashboardResponse2.getFullScreens());
        jsonWriter.name("agreement_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) getDashboardResponse2.getAgreementId());
        jsonWriter.name("balance");
        this.dashboardBalanceModelAdapter.toJson(jsonWriter, (JsonWriter) getDashboardResponse2.getBalance());
        jsonWriter.name("navigation_item");
        this.nullableDashboardNavigationItemModelAdapter.toJson(jsonWriter, (JsonWriter) getDashboardResponse2.getNavigationItem());
        jsonWriter.name("header_top_buttons");
        this.listOfHeaderTopButtonsResponseAdapter.toJson(jsonWriter, (JsonWriter) getDashboardResponse2.getTopButtons());
        jsonWriter.name("cursor");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) getDashboardResponse2.getCursor());
        jsonWriter.name("card");
        this.nullableCardInfoAdapter.toJson(jsonWriter, (JsonWriter) getDashboardResponse2.getCardInfo());
        jsonWriter.name("bottom_button");
        this.nullableDashboardBottomButtonAdapter.toJson(jsonWriter, (JsonWriter) getDashboardResponse2.getBottomButton());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(GetDashboardResponse)");
    }
}
