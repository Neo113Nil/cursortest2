package com.ybsdk.feature.transfer.version2.internal.network.dto.me2me;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.transfer.version2.internal.network.dto.fpspay.AgreementSheetItemDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullScreenDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullScreenData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/fpspay/AgreementSheetItemDto;", "agreementSheetItemDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullPageContent;", "me2MeDebitAutoPullPageContentAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Me2MeDebitAutoPullScreenDataJsonAdapter extends JsonAdapter<Me2MeDebitAutoPullScreenData> {
    private final JsonAdapter<AgreementSheetItemDto> agreementSheetItemDtoAdapter;
    private final JsonAdapter<Me2MeDebitAutoPullPageContent> me2MeDebitAutoPullPageContentAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("agreement", "initial_content", "success_content");

    public Me2MeDebitAutoPullScreenDataJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.agreementSheetItemDtoAdapter = moshi.adapter(AgreementSheetItemDto.class, emptySet, "agreement");
        this.me2MeDebitAutoPullPageContentAdapter = moshi.adapter(Me2MeDebitAutoPullPageContent.class, emptySet, "initialContent");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Me2MeDebitAutoPullScreenData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        AgreementSheetItemDto agreementSheetItemDto = null;
        Me2MeDebitAutoPullPageContent me2MeDebitAutoPullPageContent = null;
        Me2MeDebitAutoPullPageContent me2MeDebitAutoPullPageContent2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                agreementSheetItemDto = this.agreementSheetItemDtoAdapter.fromJson(jsonReader);
                if (agreementSheetItemDto == null) {
                    throw Util.unexpectedNull("agreement", "agreement", jsonReader);
                }
            } else if (selectName == 1) {
                me2MeDebitAutoPullPageContent = this.me2MeDebitAutoPullPageContentAdapter.fromJson(jsonReader);
                if (me2MeDebitAutoPullPageContent == null) {
                    throw Util.unexpectedNull("initialContent", "initial_content", jsonReader);
                }
            } else if (selectName == 2 && (me2MeDebitAutoPullPageContent2 = this.me2MeDebitAutoPullPageContentAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("successContent", "success_content", jsonReader);
            }
        }
        jsonReader.endObject();
        if (agreementSheetItemDto == null) {
            throw Util.missingProperty("agreement", "agreement", jsonReader);
        }
        if (me2MeDebitAutoPullPageContent == null) {
            throw Util.missingProperty("initialContent", "initial_content", jsonReader);
        }
        if (me2MeDebitAutoPullPageContent2 != null) {
            return new Me2MeDebitAutoPullScreenData(agreementSheetItemDto, me2MeDebitAutoPullPageContent, me2MeDebitAutoPullPageContent2);
        }
        throw Util.missingProperty("successContent", "success_content", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Me2MeDebitAutoPullScreenData me2MeDebitAutoPullScreenData) {
        Me2MeDebitAutoPullScreenData me2MeDebitAutoPullScreenData2 = me2MeDebitAutoPullScreenData;
        if (me2MeDebitAutoPullScreenData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("agreement");
        this.agreementSheetItemDtoAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitAutoPullScreenData2.getAgreement());
        jsonWriter.name("initial_content");
        this.me2MeDebitAutoPullPageContentAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitAutoPullScreenData2.getInitialContent());
        jsonWriter.name("success_content");
        this.me2MeDebitAutoPullPageContentAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitAutoPullScreenData2.getSuccessContent());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(50, "GeneratedJsonAdapter(Me2MeDebitAutoPullScreenData)");
    }
}
