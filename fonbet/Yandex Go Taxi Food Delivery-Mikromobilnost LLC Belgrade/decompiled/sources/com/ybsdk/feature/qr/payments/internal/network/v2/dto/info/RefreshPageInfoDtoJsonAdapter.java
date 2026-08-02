package com.ybsdk.feature.qr.payments.internal.network.v2.dto.info;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.common.PageImageHeaderDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/RefreshPageInfoDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/RefreshPageInfoDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "themesOfStringAdapter", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/common/PageImageHeaderDto;", "pageImageHeaderDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "actionButtonDtoAdapter", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RefreshPageInfoDtoJsonAdapter extends JsonAdapter<RefreshPageInfoDto> {
    private final JsonAdapter<ActionButtonDto> actionButtonDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "image", "header", "button");
    private final JsonAdapter<PageImageHeaderDto> pageImageHeaderDtoAdapter;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public RefreshPageInfoDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.themesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "image");
        this.pageImageHeaderDtoAdapter = moshi.adapter(PageImageHeaderDto.class, emptySet, "header");
        this.actionButtonDtoAdapter = moshi.adapter(ActionButtonDto.class, emptySet, "button");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RefreshPageInfoDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        Themes<String> themes = null;
        PageImageHeaderDto pageImageHeaderDto = null;
        ActionButtonDto actionButtonDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                }
            } else if (selectName == 2) {
                themes = this.themesOfStringAdapter.fromJson(jsonReader);
                if (themes == null) {
                    throw Util.unexpectedNull("image", "image", jsonReader);
                }
            } else if (selectName == 3) {
                pageImageHeaderDto = this.pageImageHeaderDtoAdapter.fromJson(jsonReader);
                if (pageImageHeaderDto == null) {
                    throw Util.unexpectedNull("header_", "header", jsonReader);
                }
            } else if (selectName == 4 && (actionButtonDto = this.actionButtonDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("button", "button", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
        }
        if (themes == null) {
            throw Util.missingProperty("image", "image", jsonReader);
        }
        if (pageImageHeaderDto == null) {
            throw Util.missingProperty("header_", "header", jsonReader);
        }
        if (actionButtonDto != null) {
            return new RefreshPageInfoDto(str, str2, themes, pageImageHeaderDto, actionButtonDto);
        }
        throw Util.missingProperty("button", "button", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RefreshPageInfoDto refreshPageInfoDto) {
        RefreshPageInfoDto refreshPageInfoDto2 = refreshPageInfoDto;
        if (refreshPageInfoDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) refreshPageInfoDto2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) refreshPageInfoDto2.getDescription());
        jsonWriter.name("image");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) refreshPageInfoDto2.getImage());
        jsonWriter.name("header");
        this.pageImageHeaderDtoAdapter.toJson(jsonWriter, (JsonWriter) refreshPageInfoDto2.getHeader());
        jsonWriter.name("button");
        this.actionButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) refreshPageInfoDto2.getButton());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(RefreshPageInfoDto)");
    }
}
