package com.ybsdk.feature.transfer.version2.api.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.transfer.version2.api.entities.PhoneTransferRequest;
import defpackage.kf91;
import defpackage.ny61;
import defpackage.uw51;
import defpackage.uza;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/entities/PhoneTransferRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/api/entities/PhoneTransferRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "nullableStringAdapter", "Lcom/ybsdk/feature/transfer/version2/api/entities/PhoneTransferRequest$InputSource;", "inputSourceAdapter", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhoneTransferRequestJsonAdapter extends JsonAdapter<PhoneTransferRequest> {
    private final JsonAdapter<PhoneTransferRequest.InputSource> inputSourceAdapter;
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("receiver_phone", kf91.d(kf91.c), "agreement_id", "money", "comment", kf91.d(kf91.d), "input_source", "pam");
    private final JsonAdapter<String> stringAdapter;

    public PhoneTransferRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "receiverPhone");
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "money");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "comment");
        this.inputSourceAdapter = moshi.adapter(PhoneTransferRequest.InputSource.class, emptySet, "phoneInputSource");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PhoneTransferRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        Money money = null;
        String str4 = null;
        String str5 = null;
        PhoneTransferRequest.InputSource inputSource = null;
        String str6 = null;
        while (true) {
            boolean hasNext = jsonReader.hasNext();
            byte[] bArr = kf91.a;
            byte[] bArr2 = kf91.c;
            String str7 = str;
            String str8 = str2;
            if (!hasNext) {
                String str9 = str3;
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
                if (str9 == null) {
                    throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
                }
                if (money == null) {
                    throw Util.missingProperty("money", "money", jsonReader);
                }
                if (inputSource != null) {
                    return new PhoneTransferRequest(str7, str8, str9, money, str4, str5, inputSource, str6);
                }
                throw Util.missingProperty("phoneInputSource", "input_source", jsonReader);
            }
            String str10 = str3;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str3 = str10;
                    str = str7;
                    str2 = str8;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("receiverPhone", "receiver_phone", jsonReader);
                    }
                    str3 = str10;
                    str2 = str8;
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
                    str3 = str10;
                    str = str7;
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("agreementId", "agreement_id", jsonReader);
                    }
                    str = str7;
                    str2 = str8;
                case 3:
                    money = this.moneyAdapter.fromJson(jsonReader);
                    if (money == null) {
                        throw Util.unexpectedNull("money", "money", jsonReader);
                    }
                    str3 = str10;
                    str = str7;
                    str2 = str8;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    str3 = str10;
                    str = str7;
                    str2 = str8;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    str3 = str10;
                    str = str7;
                    str2 = str8;
                case 6:
                    inputSource = this.inputSourceAdapter.fromJson(jsonReader);
                    if (inputSource == null) {
                        throw Util.unexpectedNull("phoneInputSource", "input_source", jsonReader);
                    }
                    str3 = str10;
                    str = str7;
                    str2 = str8;
                case 7:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    str3 = str10;
                    str = str7;
                    str2 = str8;
                default:
                    str3 = str10;
                    str = str7;
                    str2 = str8;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PhoneTransferRequest phoneTransferRequest) {
        PhoneTransferRequest phoneTransferRequest2 = phoneTransferRequest;
        if (phoneTransferRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("receiver_phone");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) phoneTransferRequest2.getReceiverPhone());
        jsonWriter.name(kf91.d(kf91.c));
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) phoneTransferRequest2.getYbId());
        jsonWriter.name("agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) phoneTransferRequest2.getAgreementId());
        jsonWriter.name("money");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) phoneTransferRequest2.getMoney());
        jsonWriter.name("comment");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) phoneTransferRequest2.getComment());
        jsonWriter.name(kf91.d(kf91.d));
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) phoneTransferRequest2.getRequestId());
        jsonWriter.name("input_source");
        this.inputSourceAdapter.toJson(jsonWriter, (JsonWriter) phoneTransferRequest2.getPhoneInputSource());
        jsonWriter.name("pam");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) phoneTransferRequest2.getPam());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(PhoneTransferRequest)");
    }
}
