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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/AftTopupRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/AftTopupRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/Money;", "moneyAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AftTopupRequestJsonAdapter extends JsonAdapter<AftTopupRequest> {
    private final JsonAdapter<Money> moneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public AftTopupRequestJsonAdapter(Moshi moshi) {
        byte[] bArr = gf91.i;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ gf91.a[i % 8]);
        }
        this.options = JsonReader.Options.of("agreement_id", "card_id", new String(bArr2, uza.a), "money");
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "agreementId");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "ybId");
        this.moneyAdapter = moshi.adapter(Money.class, emptySet, "money");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AftTopupRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        Money money = null;
        while (jsonReader.hasNext()) {
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
                    throw Util.unexpectedNull("cardId", "card_id", jsonReader);
                }
            } else if (selectName == 2) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 3 && (money = this.moneyAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("money", "money", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("cardId", "card_id", jsonReader);
        }
        if (money != null) {
            return new AftTopupRequest(str, str2, str3, money);
        }
        throw Util.missingProperty("money", "money", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AftTopupRequest aftTopupRequest) {
        AftTopupRequest aftTopupRequest2 = aftTopupRequest;
        if (aftTopupRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) aftTopupRequest2.getAgreementId());
        jsonWriter.name("card_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) aftTopupRequest2.getCardId());
        byte[] bArr = new byte[7];
        for (int i = 0; i < 7; i++) {
            bArr[i] = (byte) (gf91.i[i] ^ gf91.a[i % 8]);
        }
        jsonWriter.name(new String(bArr, uza.a));
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) aftTopupRequest2.getYbId());
        jsonWriter.name("money");
        this.moneyAdapter.toJson(jsonWriter, (JsonWriter) aftTopupRequest2.getMoney());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(AftTopupRequest)");
    }
}
