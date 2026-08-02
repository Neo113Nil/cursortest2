package com.ybsdk.feature.main.internal.data.network.dto;

import com.adjust.sdk.Constants;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.CommonSheet;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/BindSbpAccountResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/main/internal/data/network/dto/BindSbpAccountResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/CommonSheet;", "commonSheetAdapter", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BindSbpAccountResponseJsonAdapter extends JsonAdapter<BindSbpAccountResponse> {
    private final JsonAdapter<CommonSheet> commonSheetAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(Constants.DEEPLINK, "app_not_found_sheet");

    public BindSbpAccountResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, Constants.DEEPLINK);
        this.commonSheetAdapter = moshi.adapter(CommonSheet.class, emptySet, "appNotFoundSheet");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final BindSbpAccountResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        CommonSheet commonSheet = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1 && (commonSheet = this.commonSheetAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("appNotFoundSheet", "app_not_found_sheet", jsonReader);
            }
        }
        jsonReader.endObject();
        if (commonSheet != null) {
            return new BindSbpAccountResponse(str, commonSheet);
        }
        throw Util.missingProperty("appNotFoundSheet", "app_not_found_sheet", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, BindSbpAccountResponse bindSbpAccountResponse) {
        BindSbpAccountResponse bindSbpAccountResponse2 = bindSbpAccountResponse;
        if (bindSbpAccountResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(Constants.DEEPLINK);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) bindSbpAccountResponse2.getDeeplink());
        jsonWriter.name("app_not_found_sheet");
        this.commonSheetAdapter.toJson(jsonWriter, (JsonWriter) bindSbpAccountResponse2.getAppNotFoundSheet());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(BindSbpAccountResponse)");
    }
}
