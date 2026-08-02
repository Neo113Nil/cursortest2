package com.ybsdk.feature.transfer.version2.internal.network.dto.me2me;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.transfer.utils.domain.dto.EmptyListInfoDto;
import com.ybsdk.core.transfer.utils.domain.dto.PageHeaderDto;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitGetAutoPullResultDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitGetAutoPullResultDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/transfer/utils/domain/dto/PageHeaderDto;", "pageHeaderDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/AutoPullPermissionDto;", "listOfAutoPullPermissionDtoAdapter", "Lcom/ybsdk/core/transfer/utils/domain/dto/EmptyListInfoDto;", "emptyListInfoDtoAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Me2MeDebitGetAutoPullResultDtoJsonAdapter extends JsonAdapter<Me2MeDebitGetAutoPullResultDto> {
    private final JsonAdapter<EmptyListInfoDto> emptyListInfoDtoAdapter;
    private final JsonAdapter<List<AutoPullPermissionDto>> listOfAutoPullPermissionDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("header", "permissions", "empty_list_info");
    private final JsonAdapter<PageHeaderDto> pageHeaderDtoAdapter;

    public Me2MeDebitGetAutoPullResultDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.pageHeaderDtoAdapter = moshi.adapter(PageHeaderDto.class, emptySet, "header");
        this.listOfAutoPullPermissionDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, AutoPullPermissionDto.class), emptySet, "permissions");
        this.emptyListInfoDtoAdapter = moshi.adapter(EmptyListInfoDto.class, emptySet, "emptyListInfo");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Me2MeDebitGetAutoPullResultDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PageHeaderDto pageHeaderDto = null;
        List<AutoPullPermissionDto> list = null;
        EmptyListInfoDto emptyListInfoDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                pageHeaderDto = this.pageHeaderDtoAdapter.fromJson(jsonReader);
                if (pageHeaderDto == null) {
                    throw Util.unexpectedNull("header_", "header", jsonReader);
                }
            } else if (selectName == 1) {
                list = this.listOfAutoPullPermissionDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("permissions", "permissions", jsonReader);
                }
            } else if (selectName == 2 && (emptyListInfoDto = this.emptyListInfoDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("emptyListInfo", "empty_list_info", jsonReader);
            }
        }
        jsonReader.endObject();
        if (pageHeaderDto == null) {
            throw Util.missingProperty("header_", "header", jsonReader);
        }
        if (list == null) {
            throw Util.missingProperty("permissions", "permissions", jsonReader);
        }
        if (emptyListInfoDto != null) {
            return new Me2MeDebitGetAutoPullResultDto(pageHeaderDto, list, emptyListInfoDto);
        }
        throw Util.missingProperty("emptyListInfo", "empty_list_info", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Me2MeDebitGetAutoPullResultDto me2MeDebitGetAutoPullResultDto) {
        Me2MeDebitGetAutoPullResultDto me2MeDebitGetAutoPullResultDto2 = me2MeDebitGetAutoPullResultDto;
        if (me2MeDebitGetAutoPullResultDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("header");
        this.pageHeaderDtoAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitGetAutoPullResultDto2.getHeader());
        jsonWriter.name("permissions");
        this.listOfAutoPullPermissionDtoAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitGetAutoPullResultDto2.getPermissions());
        jsonWriter.name("empty_list_info");
        this.emptyListInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitGetAutoPullResultDto2.getEmptyListInfo());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(52, "GeneratedJsonAdapter(Me2MeDebitGetAutoPullResultDto)");
    }
}
