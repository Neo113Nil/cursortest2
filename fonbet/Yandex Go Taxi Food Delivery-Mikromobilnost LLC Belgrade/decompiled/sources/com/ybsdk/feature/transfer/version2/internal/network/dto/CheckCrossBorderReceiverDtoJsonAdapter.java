package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.gf91;
import defpackage.ny61;
import defpackage.uw51;
import defpackage.uza;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckCrossBorderReceiverDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckCrossBorderReceiverDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CheckCrossBorderReceiverDtoJsonAdapter extends JsonAdapter<CheckCrossBorderReceiverDto> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public CheckCrossBorderReceiverDtoJsonAdapter(Moshi moshi) {
        byte[] bArr = gf91.o;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ gf91.a[i % 8]);
        }
        this.options = JsonReader.Options.of("phone", new String(bArr2, uza.a), "receiver_full_name");
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "phone");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "receiverFullName");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CheckCrossBorderReceiverDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            boolean hasNext = jsonReader.hasNext();
            byte[] bArr = gf91.a;
            int i = 0;
            byte[] bArr2 = gf91.o;
            if (!hasNext) {
                jsonReader.endObject();
                if (str == null) {
                    throw Util.missingProperty("phone", "phone", jsonReader);
                }
                if (str2 != null) {
                    return new CheckCrossBorderReceiverDto(str, str2, str3);
                }
                byte[] bArr3 = new byte[4];
                while (i < 4) {
                    bArr3[i] = (byte) (bArr2[i] ^ bArr[i % 8]);
                    i++;
                }
                throw Util.missingProperty("partner", new String(bArr3, uza.a), jsonReader);
            }
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("phone", "phone", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    byte[] bArr4 = new byte[4];
                    while (i < 4) {
                        bArr4[i] = (byte) (bArr2[i] ^ bArr[i % 8]);
                        i++;
                    }
                    throw Util.unexpectedNull("partner", new String(bArr4, uza.a), jsonReader);
                }
            } else if (selectName == 2) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CheckCrossBorderReceiverDto checkCrossBorderReceiverDto) {
        CheckCrossBorderReceiverDto checkCrossBorderReceiverDto2 = checkCrossBorderReceiverDto;
        if (checkCrossBorderReceiverDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("phone");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) checkCrossBorderReceiverDto2.getPhone());
        byte[] bArr = new byte[4];
        for (int i = 0; i < 4; i++) {
            bArr[i] = (byte) (gf91.o[i] ^ gf91.a[i % 8]);
        }
        jsonWriter.name(new String(bArr, uza.a));
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) checkCrossBorderReceiverDto2.getPartner());
        jsonWriter.name("receiver_full_name");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) checkCrossBorderReceiverDto2.getReceiverFullName());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(CheckCrossBorderReceiverDto)");
    }
}
