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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PhoneTransferPrerequisiteParamJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PhoneTransferPrerequisiteParam;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhoneTransferPrerequisiteParamJsonAdapter extends JsonAdapter<PhoneTransferPrerequisiteParam> {
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public PhoneTransferPrerequisiteParamJsonAdapter(Moshi moshi) {
        byte[] bArr = gf91.l;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ gf91.a[i % 8]);
        }
        this.options = JsonReader.Options.of("target_phone", new String(bArr2, uza.a));
        this.stringAdapter = moshi.adapter(String.class, EmptySet.a, "targetPhone");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PhoneTransferPrerequisiteParam fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (true) {
            boolean hasNext = jsonReader.hasNext();
            byte[] bArr = gf91.a;
            int i = 0;
            byte[] bArr2 = gf91.l;
            if (!hasNext) {
                jsonReader.endObject();
                if (str == null) {
                    throw Util.missingProperty("targetPhone", "target_phone", jsonReader);
                }
                if (str2 != null) {
                    return new PhoneTransferPrerequisiteParam(str, str2);
                }
                byte[] bArr3 = new byte[14];
                while (i < 14) {
                    bArr3[i] = (byte) (bArr2[i] ^ bArr[i % 8]);
                    i++;
                }
                throw Util.missingProperty("targetBankId", new String(bArr3, uza.a), jsonReader);
            }
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("targetPhone", "target_phone", jsonReader);
                }
            } else if (selectName == 1 && (str2 = this.stringAdapter.fromJson(jsonReader)) == null) {
                byte[] bArr4 = new byte[14];
                while (i < 14) {
                    bArr4[i] = (byte) (bArr2[i] ^ bArr[i % 8]);
                    i++;
                }
                throw Util.unexpectedNull("targetBankId", new String(bArr4, uza.a), jsonReader);
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PhoneTransferPrerequisiteParam phoneTransferPrerequisiteParam) {
        PhoneTransferPrerequisiteParam phoneTransferPrerequisiteParam2 = phoneTransferPrerequisiteParam;
        if (phoneTransferPrerequisiteParam2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("target_phone");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) phoneTransferPrerequisiteParam2.getTargetPhone());
        byte[] bArr = new byte[14];
        for (int i = 0; i < 14; i++) {
            bArr[i] = (byte) (gf91.l[i] ^ gf91.a[i % 8]);
        }
        jsonWriter.name(new String(bArr, uza.a));
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) phoneTransferPrerequisiteParam2.getTargetBankId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(52, "GeneratedJsonAdapter(PhoneTransferPrerequisiteParam)");
    }
}
