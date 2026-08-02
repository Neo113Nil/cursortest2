package com.ybsdk.feature.merchant.offers.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOfferBannerItemDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOfferBannerItemDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "divDataDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "nullableThemedParameterOfStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "nullableThemesOfStringAdapter", "nullableStringAdapter", "", "intAdapter", "feature-merchant-offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MerchantOfferBannerItemDtoJsonAdapter extends JsonAdapter<MerchantOfferBannerItemDto> {
    private final JsonAdapter<DivDataDto> divDataDtoAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<ThemedParameter<String>> nullableThemedParameterOfStringAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("notify_button", "banner_id", C0553n3.g, "banner_image", "action", "logo", "title", "subtitle", "duration");
    private final JsonAdapter<String> stringAdapter;

    public MerchantOfferBannerItemDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.divDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "notifyButton");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "bannerId");
        this.nullableThemedParameterOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, String.class), emptySet, C0553n3.g);
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "bannerImage");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "subtitle");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "duration");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MerchantOfferBannerItemDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        DivDataDto divDataDto = null;
        String str = null;
        ThemedParameter<String> themedParameter = null;
        Themes<String> themes = null;
        String str2 = null;
        Themes<String> themes2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            Integer num2 = num;
            DivDataDto divDataDto2 = divDataDto;
            if (!jsonReader.hasNext()) {
                String str5 = str;
                jsonReader.endObject();
                if (divDataDto2 == null) {
                    throw Util.missingProperty("notifyButton", "notify_button", jsonReader);
                }
                if (str5 == null) {
                    throw Util.missingProperty("bannerId", "banner_id", jsonReader);
                }
                if (str2 == null) {
                    throw Util.missingProperty("action", "action", jsonReader);
                }
                if (str3 == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (num2 != null) {
                    return new MerchantOfferBannerItemDto(divDataDto2, str5, themedParameter, themes, str2, themes2, str3, str4, num2.intValue());
                }
                throw Util.missingProperty("duration", "duration", jsonReader);
            }
            String str6 = str;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    num = num2;
                    str = str6;
                    divDataDto = divDataDto2;
                case 0:
                    divDataDto = this.divDataDtoAdapter.fromJson(jsonReader);
                    if (divDataDto == null) {
                        throw Util.unexpectedNull("notifyButton", "notify_button", jsonReader);
                    }
                    num = num2;
                    str = str6;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("bannerId", "banner_id", jsonReader);
                    }
                    num = num2;
                    divDataDto = divDataDto2;
                case 2:
                    themedParameter = this.nullableThemedParameterOfStringAdapter.fromJson(jsonReader);
                    num = num2;
                    str = str6;
                    divDataDto = divDataDto2;
                case 3:
                    themes = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    num = num2;
                    str = str6;
                    divDataDto = divDataDto2;
                case 4:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("action", "action", jsonReader);
                    }
                    num = num2;
                    str = str6;
                    divDataDto = divDataDto2;
                case 5:
                    themes2 = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    num = num2;
                    str = str6;
                    divDataDto = divDataDto2;
                case 6:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    num = num2;
                    str = str6;
                    divDataDto = divDataDto2;
                case 7:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    num = num2;
                    str = str6;
                    divDataDto = divDataDto2;
                case 8:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("duration", "duration", jsonReader);
                    }
                    str = str6;
                    divDataDto = divDataDto2;
                default:
                    num = num2;
                    str = str6;
                    divDataDto = divDataDto2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MerchantOfferBannerItemDto merchantOfferBannerItemDto) {
        MerchantOfferBannerItemDto merchantOfferBannerItemDto2 = merchantOfferBannerItemDto;
        if (merchantOfferBannerItemDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("notify_button");
        this.divDataDtoAdapter.toJson(jsonWriter, (JsonWriter) merchantOfferBannerItemDto2.getNotifyButton());
        jsonWriter.name("banner_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) merchantOfferBannerItemDto2.getBannerId());
        jsonWriter.name(C0553n3.g);
        this.nullableThemedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) merchantOfferBannerItemDto2.getBackground());
        jsonWriter.name("banner_image");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) merchantOfferBannerItemDto2.getBannerImage());
        jsonWriter.name("action");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) merchantOfferBannerItemDto2.getAction());
        jsonWriter.name("logo");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) merchantOfferBannerItemDto2.getLogo());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) merchantOfferBannerItemDto2.getTitle());
        jsonWriter.name("subtitle");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) merchantOfferBannerItemDto2.getSubtitle());
        jsonWriter.name("duration");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(merchantOfferBannerItemDto2.getDuration()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(MerchantOfferBannerItemDto)");
    }
}
