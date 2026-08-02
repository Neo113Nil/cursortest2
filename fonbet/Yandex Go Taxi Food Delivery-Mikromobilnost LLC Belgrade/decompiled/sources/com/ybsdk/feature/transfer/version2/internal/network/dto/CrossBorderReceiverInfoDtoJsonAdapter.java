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
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CrossBorderReceiverInfoDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CrossBorderReceiverInfoDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrossBorderReceiverInfoDtoJsonAdapter extends JsonAdapter<CrossBorderReceiverInfoDto> {
    private volatile Constructor<CrossBorderReceiverInfoDto> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public CrossBorderReceiverInfoDtoJsonAdapter(Moshi moshi) {
        byte[] bArr = gf91.i;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ gf91.a[i % 8]);
        }
        this.options = JsonReader.Options.of("phone", new String(bArr2, uza.a), "receiver_full_name", "country");
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "phone");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "receiverFullName");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CrossBorderReceiverInfoDto fromJson(JsonReader jsonReader) {
        byte[] bArr = gf91.a;
        byte[] bArr2 = gf91.i;
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = -1;
        while (true) {
            int i2 = 0;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (i == -13) {
                    if (str == null) {
                        throw Util.missingProperty("phone", "phone", jsonReader);
                    }
                    if (str2 != null) {
                        return new CrossBorderReceiverInfoDto(str, str2, str3, str4);
                    }
                    byte[] bArr3 = new byte[7];
                    while (i2 < 7) {
                        bArr3[i2] = (byte) (bArr2[i2] ^ bArr[i2 % 8]);
                        i2++;
                    }
                    throw Util.missingProperty("partnerId", new String(bArr3, uza.a), jsonReader);
                }
                Constructor<CrossBorderReceiverInfoDto> constructor = this.constructorRef;
                if (constructor == null) {
                    constructor = CrossBorderReceiverInfoDto.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                    this.constructorRef = constructor;
                }
                if (str == null) {
                    throw Util.missingProperty("phone", "phone", jsonReader);
                }
                if (str2 != null) {
                    return constructor.newInstance(str, str2, str3, str4, Integer.valueOf(i), null);
                }
                byte[] bArr4 = new byte[7];
                while (i2 < 7) {
                    bArr4[i2] = (byte) (bArr2[i2] ^ bArr[i2 % 8]);
                    i2++;
                }
                throw Util.missingProperty("partnerId", new String(bArr4, uza.a), jsonReader);
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
                    byte[] bArr5 = new byte[7];
                    while (i2 < 7) {
                        bArr5[i2] = (byte) (bArr2[i2] ^ bArr[i2 % 8]);
                        i2++;
                    }
                    throw Util.unexpectedNull("partnerId", new String(bArr5, uza.a), jsonReader);
                }
            } else if (selectName == 2) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -5;
            } else if (selectName == 3) {
                str4 = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -9;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CrossBorderReceiverInfoDto crossBorderReceiverInfoDto) {
        CrossBorderReceiverInfoDto crossBorderReceiverInfoDto2 = crossBorderReceiverInfoDto;
        if (crossBorderReceiverInfoDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("phone");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) crossBorderReceiverInfoDto2.getPhone());
        byte[] bArr = new byte[7];
        for (int i = 0; i < 7; i++) {
            bArr[i] = (byte) (gf91.i[i] ^ gf91.a[i % 8]);
        }
        jsonWriter.name(new String(bArr, uza.a));
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) crossBorderReceiverInfoDto2.getPartnerId());
        jsonWriter.name("receiver_full_name");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) crossBorderReceiverInfoDto2.getReceiverFullName());
        jsonWriter.name("country");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) crossBorderReceiverInfoDto2.getCountry());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(CrossBorderReceiverInfoDto)");
    }
}
