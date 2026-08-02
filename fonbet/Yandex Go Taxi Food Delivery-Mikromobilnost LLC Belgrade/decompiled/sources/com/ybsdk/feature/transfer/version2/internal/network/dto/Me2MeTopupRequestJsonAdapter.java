package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.gf91;
import defpackage.ny61;
import defpackage.uw51;
import defpackage.uza;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/Me2MeTopupRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/Me2MeTopupRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/AutoFundPayload;", "nullableAutoFundPayloadAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Me2MeTopupRequestJsonAdapter extends JsonAdapter<Me2MeTopupRequest> {
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonAdapter<AutoFundPayload> nullableAutoFundPayloadAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public Me2MeTopupRequestJsonAdapter(Moshi moshi) {
        byte[] bArr = gf91.i;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ gf91.a[i % 8]);
        }
        this.options = JsonReader.Options.of("agreement_id", new String(bArr2, uza.a), "money", "autofund_payload");
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "agreementId");
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "money");
        this.nullableAutoFundPayloadAdapter = moshi.adapter(AutoFundPayload.class, emptySet, "autoFundPayload");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Me2MeTopupRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        Money money = null;
        AutoFundPayload autoFundPayload = null;
        while (true) {
            boolean hasNext = jsonReader.hasNext();
            byte[] bArr = gf91.a;
            int i = 0;
            byte[] bArr2 = gf91.i;
            if (!hasNext) {
                jsonReader.endObject();
                if (str == null) {
                    throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
                }
                if (str2 != null) {
                    if (money != null) {
                        return new Me2MeTopupRequest(str, str2, money, autoFundPayload);
                    }
                    throw Util.missingProperty("money", "money", jsonReader);
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
                    throw Util.unexpectedNull("agreementId", "agreement_id", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    byte[] bArr4 = new byte[7];
                    while (i < 7) {
                        bArr4[i] = (byte) (bArr2[i] ^ bArr[i % 8]);
                        i++;
                    }
                    throw Util.unexpectedNull("ybId", new String(bArr4, uza.a), jsonReader);
                }
            } else if (selectName == 2) {
                money = this.moneyAdapter.fromJson(jsonReader);
                if (money == null) {
                    throw Util.unexpectedNull("money", "money", jsonReader);
                }
            } else if (selectName == 3) {
                autoFundPayload = this.nullableAutoFundPayloadAdapter.fromJson(jsonReader);
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Me2MeTopupRequest me2MeTopupRequest) {
        Me2MeTopupRequest me2MeTopupRequest2 = me2MeTopupRequest;
        if (me2MeTopupRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) me2MeTopupRequest2.getAgreementId());
        byte[] bArr = new byte[7];
        for (int i = 0; i < 7; i++) {
            bArr[i] = (byte) (gf91.i[i] ^ gf91.a[i % 8]);
        }
        jsonWriter.name(new String(bArr, uza.a));
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) me2MeTopupRequest2.getYbId());
        jsonWriter.name("money");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) me2MeTopupRequest2.getMoney());
        jsonWriter.name("autofund_payload");
        this.nullableAutoFundPayloadAdapter.toJson(jsonWriter, (JsonWriter) me2MeTopupRequest2.getAutoFundPayload());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(Me2MeTopupRequest)");
    }
}
