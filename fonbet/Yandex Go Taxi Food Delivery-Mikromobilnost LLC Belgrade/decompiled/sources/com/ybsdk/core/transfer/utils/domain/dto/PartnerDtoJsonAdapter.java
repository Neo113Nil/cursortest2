package com.ybsdk.core.transfer.utils.domain.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.ny61;
import defpackage.tf91;
import defpackage.uw51;
import defpackage.uza;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/core/transfer/utils/domain/dto/PartnerDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/transfer/utils/domain/dto/PartnerDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "nullableThemesOfStringAdapter", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PartnerDtoJsonAdapter extends JsonAdapter<PartnerDto> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public PartnerDtoJsonAdapter(Moshi moshi) {
        byte[] bArr = new byte[7];
        for (int i = 0; i < 7; i++) {
            bArr[i] = (byte) (tf91.b[i] ^ tf91.a[i % 8]);
        }
        this.options = JsonReader.Options.of(new String(bArr, uza.a), "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "image", "themed_image");
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "ybId");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "themedImage");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PartnerDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Themes<String> themes = null;
        while (true) {
            boolean hasNext = jsonReader.hasNext();
            byte[] bArr = tf91.a;
            int i = 0;
            byte[] bArr2 = tf91.b;
            if (!hasNext) {
                jsonReader.endObject();
                if (str != null) {
                    if (str2 != null) {
                        return new PartnerDto(str, str2, str3, str4, themes);
                    }
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                byte[] bArr3 = new byte[7];
                while (i < 7) {
                    bArr3[i] = (byte) (bArr2[i] ^ bArr[i % 8]);
                    i++;
                }
                throw Util.missingProperty("ybId", new String(bArr3, uza.a), jsonReader);
            }
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    byte[] bArr4 = new byte[7];
                    while (i < 7) {
                        bArr4[i] = (byte) (bArr2[i] ^ bArr[i % 8]);
                        i++;
                    }
                    throw Util.unexpectedNull("ybId", new String(bArr4, uza.a), jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 2) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                str4 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                themes = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PartnerDto partnerDto) {
        PartnerDto partnerDto2 = partnerDto;
        if (partnerDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        byte[] bArr = new byte[7];
        for (int i = 0; i < 7; i++) {
            bArr[i] = (byte) (tf91.b[i] ^ tf91.a[i % 8]);
        }
        jsonWriter.name(new String(bArr, uza.a));
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) partnerDto2.getYbId());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) partnerDto2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) partnerDto2.getDescription());
        jsonWriter.name("image");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) partnerDto2.getImageUrl());
        jsonWriter.name("themed_image");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) partnerDto2.getThemedImage());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(32, "GeneratedJsonAdapter(PartnerDto)");
    }
}
