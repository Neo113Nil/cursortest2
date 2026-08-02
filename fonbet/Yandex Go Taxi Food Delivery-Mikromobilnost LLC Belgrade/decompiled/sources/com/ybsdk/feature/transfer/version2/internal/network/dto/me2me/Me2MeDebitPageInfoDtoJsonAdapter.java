package com.ybsdk.feature.transfer.version2.internal.network.dto.me2me;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.transfer.utils.domain.dto.AgreementWithWidgetDto;
import com.ybsdk.core.transfer.utils.domain.dto.PageHeaderDto;
import com.ybsdk.core.transfer.utils.domain.dto.UnconditionalLimitWidgetDto;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitPageInfoDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitPageInfoDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;", "pageHeaderDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitDto;", "me2MeDebitDtoAdapter", "", "Lcom/ybsdk/core/transfer/utils/domain/dto/AgreementWithWidgetDto;", "listOfAgreementWithWidgetDtoAdapter", "Lcom/ybsdk/core/transfer/utils/domain/dto/UnconditionalLimitWidgetDto;", "nullableUnconditionalLimitWidgetDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitResultPageDto;", "me2MeDebitResultPageDtoAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Me2MeDebitPageInfoDtoJsonAdapter extends JsonAdapter<Me2MeDebitPageInfoDto> {
    private final JsonAdapter<List<AgreementWithWidgetDto>> listOfAgreementWithWidgetDtoAdapter;
    private final JsonAdapter<Me2MeDebitDto> me2MeDebitDtoAdapter;
    private final JsonAdapter<Me2MeDebitResultPageDto> me2MeDebitResultPageDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<UnconditionalLimitWidgetDto> nullableUnconditionalLimitWidgetDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("header", "agreements_sheet_title", "me2me_debit", "agreements", "transfer_widget", "result_loader_page", "undefined_result_page");
    private final JsonAdapter<PageHeaderDto> pageHeaderDtoAdapter;

    public Me2MeDebitPageInfoDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.pageHeaderDtoAdapter = moshi.adapter(PageHeaderDto.class, emptySet, "header");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "agreementsSheetTitle");
        this.me2MeDebitDtoAdapter = moshi.adapter(Me2MeDebitDto.class, emptySet, "debitInfo");
        this.listOfAgreementWithWidgetDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, AgreementWithWidgetDto.class), emptySet, "agreements");
        this.nullableUnconditionalLimitWidgetDtoAdapter = moshi.adapter(UnconditionalLimitWidgetDto.class, emptySet, "transferWidget");
        this.me2MeDebitResultPageDtoAdapter = moshi.adapter(Me2MeDebitResultPageDto.class, emptySet, "resultLoaderPage");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Me2MeDebitPageInfoDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PageHeaderDto pageHeaderDto = null;
        String str = null;
        Me2MeDebitDto me2MeDebitDto = null;
        List<AgreementWithWidgetDto> list = null;
        UnconditionalLimitWidgetDto unconditionalLimitWidgetDto = null;
        Me2MeDebitResultPageDto me2MeDebitResultPageDto = null;
        Me2MeDebitResultPageDto me2MeDebitResultPageDto2 = null;
        while (true) {
            PageHeaderDto pageHeaderDto2 = pageHeaderDto;
            String str2 = str;
            if (!jsonReader.hasNext()) {
                Me2MeDebitDto me2MeDebitDto2 = me2MeDebitDto;
                jsonReader.endObject();
                if (pageHeaderDto2 == null) {
                    throw Util.missingProperty("header_", "header", jsonReader);
                }
                if (me2MeDebitDto2 == null) {
                    throw Util.missingProperty("debitInfo", "me2me_debit", jsonReader);
                }
                if (list == null) {
                    throw Util.missingProperty("agreements", "agreements", jsonReader);
                }
                if (me2MeDebitResultPageDto == null) {
                    throw Util.missingProperty("resultLoaderPage", "result_loader_page", jsonReader);
                }
                if (me2MeDebitResultPageDto2 != null) {
                    return new Me2MeDebitPageInfoDto(pageHeaderDto2, str2, me2MeDebitDto2, list, unconditionalLimitWidgetDto, me2MeDebitResultPageDto, me2MeDebitResultPageDto2);
                }
                throw Util.missingProperty("undefinedResultPage", "undefined_result_page", jsonReader);
            }
            Me2MeDebitDto me2MeDebitDto3 = me2MeDebitDto;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    me2MeDebitDto = me2MeDebitDto3;
                    pageHeaderDto = pageHeaderDto2;
                    str = str2;
                case 0:
                    pageHeaderDto = this.pageHeaderDtoAdapter.fromJson(jsonReader);
                    if (pageHeaderDto == null) {
                        throw Util.unexpectedNull("header_", "header", jsonReader);
                    }
                    me2MeDebitDto = me2MeDebitDto3;
                    str = str2;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    me2MeDebitDto = me2MeDebitDto3;
                    pageHeaderDto = pageHeaderDto2;
                case 2:
                    me2MeDebitDto = this.me2MeDebitDtoAdapter.fromJson(jsonReader);
                    if (me2MeDebitDto == null) {
                        throw Util.unexpectedNull("debitInfo", "me2me_debit", jsonReader);
                    }
                    pageHeaderDto = pageHeaderDto2;
                    str = str2;
                case 3:
                    list = this.listOfAgreementWithWidgetDtoAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("agreements", "agreements", jsonReader);
                    }
                    me2MeDebitDto = me2MeDebitDto3;
                    pageHeaderDto = pageHeaderDto2;
                    str = str2;
                case 4:
                    unconditionalLimitWidgetDto = this.nullableUnconditionalLimitWidgetDtoAdapter.fromJson(jsonReader);
                    me2MeDebitDto = me2MeDebitDto3;
                    pageHeaderDto = pageHeaderDto2;
                    str = str2;
                case 5:
                    me2MeDebitResultPageDto = this.me2MeDebitResultPageDtoAdapter.fromJson(jsonReader);
                    if (me2MeDebitResultPageDto == null) {
                        throw Util.unexpectedNull("resultLoaderPage", "result_loader_page", jsonReader);
                    }
                    me2MeDebitDto = me2MeDebitDto3;
                    pageHeaderDto = pageHeaderDto2;
                    str = str2;
                case 6:
                    me2MeDebitResultPageDto2 = this.me2MeDebitResultPageDtoAdapter.fromJson(jsonReader);
                    if (me2MeDebitResultPageDto2 == null) {
                        throw Util.unexpectedNull("undefinedResultPage", "undefined_result_page", jsonReader);
                    }
                    me2MeDebitDto = me2MeDebitDto3;
                    pageHeaderDto = pageHeaderDto2;
                    str = str2;
                default:
                    me2MeDebitDto = me2MeDebitDto3;
                    pageHeaderDto = pageHeaderDto2;
                    str = str2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Me2MeDebitPageInfoDto me2MeDebitPageInfoDto) {
        Me2MeDebitPageInfoDto me2MeDebitPageInfoDto2 = me2MeDebitPageInfoDto;
        if (me2MeDebitPageInfoDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("header");
        this.pageHeaderDtoAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitPageInfoDto2.getHeader());
        jsonWriter.name("agreements_sheet_title");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitPageInfoDto2.getAgreementsSheetTitle());
        jsonWriter.name("me2me_debit");
        this.me2MeDebitDtoAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitPageInfoDto2.getDebitInfo());
        jsonWriter.name("agreements");
        this.listOfAgreementWithWidgetDtoAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitPageInfoDto2.getAgreements());
        jsonWriter.name("transfer_widget");
        this.nullableUnconditionalLimitWidgetDtoAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitPageInfoDto2.getTransferWidget());
        jsonWriter.name("result_loader_page");
        this.me2MeDebitResultPageDtoAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitPageInfoDto2.getResultLoaderPage());
        jsonWriter.name("undefined_result_page");
        this.me2MeDebitResultPageDtoAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitPageInfoDto2.getUndefinedResultPage());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(Me2MeDebitPageInfoDto)");
    }
}
