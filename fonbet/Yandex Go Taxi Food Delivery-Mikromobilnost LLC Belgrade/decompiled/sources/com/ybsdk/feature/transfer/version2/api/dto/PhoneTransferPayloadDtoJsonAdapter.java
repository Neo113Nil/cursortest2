package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.kf91;
import defpackage.ny61;
import defpackage.uw51;
import defpackage.uza;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/PhoneTransferPayloadDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/api/dto/PhoneTransferPayloadDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "themesOfStringAdapter", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhoneTransferPayloadDtoJsonAdapter extends JsonAdapter<PhoneTransferPayloadDto> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public PhoneTransferPayloadDtoJsonAdapter(Moshi moshi) {
        byte[] bArr = kf91.c;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ kf91.a[i % 8]);
        }
        this.options = JsonReader.Options.of("receiver_phone", new String(bArr2, uza.a), "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "check_request_id", "image", "pam");
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "receiverPhone");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.themesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "image");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PhoneTransferPayloadDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Themes<String> themes = null;
        String str6 = null;
        while (true) {
            boolean hasNext = jsonReader.hasNext();
            byte[] bArr = kf91.a;
            byte[] bArr2 = kf91.c;
            String str7 = str;
            if (!hasNext) {
                String str8 = str2;
                jsonReader.endObject();
                if (str7 == null) {
                    throw Util.missingProperty("receiverPhone", "receiver_phone", jsonReader);
                }
                if (str8 == null) {
                    byte[] bArr3 = new byte[7];
                    for (int i = 0; i < 7; i++) {
                        bArr3[i] = (byte) (bArr2[i] ^ bArr[i % 8]);
                    }
                    throw Util.missingProperty("ybId", new String(bArr3, uza.a), jsonReader);
                }
                if (str3 == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (str5 == null) {
                    throw Util.missingProperty("checkRequestId", "check_request_id", jsonReader);
                }
                if (themes != null) {
                    return new PhoneTransferPayloadDto(str7, str8, str3, str4, str5, themes, str6);
                }
                throw Util.missingProperty("image", "image", jsonReader);
            }
            String str9 = str2;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str2 = str9;
                    str = str7;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("receiverPhone", "receiver_phone", jsonReader);
                    }
                    str2 = str9;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        byte[] bArr4 = new byte[7];
                        int i2 = 0;
                        for (int i3 = 7; i2 < i3; i3 = 7) {
                            bArr4[i2] = (byte) (bArr2[i2] ^ bArr[i2 % 8]);
                            i2++;
                        }
                        throw Util.unexpectedNull("ybId", new String(bArr4, uza.a), jsonReader);
                    }
                    str = str7;
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    str2 = str9;
                    str = str7;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    str2 = str9;
                    str = str7;
                case 4:
                    str5 = this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("checkRequestId", "check_request_id", jsonReader);
                    }
                    str2 = str9;
                    str = str7;
                case 5:
                    themes = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes == null) {
                        throw Util.unexpectedNull("image", "image", jsonReader);
                    }
                    str2 = str9;
                    str = str7;
                case 6:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    str2 = str9;
                    str = str7;
                default:
                    str2 = str9;
                    str = str7;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PhoneTransferPayloadDto phoneTransferPayloadDto) {
        PhoneTransferPayloadDto phoneTransferPayloadDto2 = phoneTransferPayloadDto;
        if (phoneTransferPayloadDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("receiver_phone");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) phoneTransferPayloadDto2.getReceiverPhone());
        byte[] bArr = new byte[7];
        for (int i = 0; i < 7; i++) {
            bArr[i] = (byte) (kf91.c[i] ^ kf91.a[i % 8]);
        }
        jsonWriter.name(new String(bArr, uza.a));
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) phoneTransferPayloadDto2.getYbId());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) phoneTransferPayloadDto2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) phoneTransferPayloadDto2.getDescription());
        jsonWriter.name("check_request_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) phoneTransferPayloadDto2.getCheckRequestId());
        jsonWriter.name("image");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) phoneTransferPayloadDto2.getImage());
        jsonWriter.name("pam");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) phoneTransferPayloadDto2.getPam());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(PhoneTransferPayloadDto)");
    }
}
