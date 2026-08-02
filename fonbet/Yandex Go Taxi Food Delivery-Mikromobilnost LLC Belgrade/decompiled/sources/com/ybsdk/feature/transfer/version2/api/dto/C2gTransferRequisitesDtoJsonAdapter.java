package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.kf91;
import defpackage.ny61;
import defpackage.uw51;
import defpackage.uza;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/C2gTransferRequisitesDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/api/dto/C2gTransferRequisitesDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/Money;", "nullableMoneyAdapter", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class C2gTransferRequisitesDtoJsonAdapter extends JsonAdapter<C2gTransferRequisitesDto> {
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public C2gTransferRequisitesDtoJsonAdapter(Moshi moshi) {
        byte[] bArr = kf91.b;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ kf91.a[i % 8]);
        }
        this.options = JsonReader.Options.of("uin", "payment_purpose", "discount", "discount_expire", "payer_name", "payer_inn", "payer_kpp", "tax_bill_date", "payee_name", "payee_account_number", new String(bArr2, uza.a), "payee_inn", "payee_kpp", "legal_act", "payment_term");
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "uin");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "paymentPurpose");
        this.nullableMoneyAdapter = moshi.adapter(Money.class, emptySet, "discount");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final C2gTransferRequisitesDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        Money money = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        while (true) {
            boolean hasNext = jsonReader.hasNext();
            String str15 = str;
            String str16 = str2;
            byte[] bArr = kf91.a;
            byte[] bArr2 = kf91.b;
            Money money2 = money;
            String str17 = str3;
            if (!hasNext) {
                String str18 = str4;
                jsonReader.endObject();
                if (str15 == null) {
                    throw Util.missingProperty("uin", "uin", jsonReader);
                }
                if (str8 == null) {
                    throw Util.missingProperty("payeeName", "payee_name", jsonReader);
                }
                if (str9 == null) {
                    throw Util.missingProperty("payeeAccountNumber", "payee_account_number", jsonReader);
                }
                if (str10 != null) {
                    return new C2gTransferRequisitesDto(str15, str16, money2, str17, str18, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
                }
                byte[] bArr3 = new byte[14];
                for (int i = 0; i < 14; i++) {
                    bArr3[i] = (byte) (bArr2[i] ^ bArr[i % 8]);
                }
                throw Util.missingProperty("payeeBankBic", new String(bArr3, uza.a), jsonReader);
            }
            String str19 = str4;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str4 = str19;
                    str = str15;
                    str2 = str16;
                    money = money2;
                    str3 = str17;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("uin", "uin", jsonReader);
                    }
                    str4 = str19;
                    str2 = str16;
                    money = money2;
                    str3 = str17;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    str4 = str19;
                    str = str15;
                    money = money2;
                    str3 = str17;
                case 2:
                    money = this.nullableMoneyAdapter.fromJson(jsonReader);
                    str4 = str19;
                    str = str15;
                    str2 = str16;
                    str3 = str17;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    str4 = str19;
                    str = str15;
                    str2 = str16;
                    money = money2;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    str = str15;
                    str2 = str16;
                    money = money2;
                    str3 = str17;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    str4 = str19;
                    str = str15;
                    str2 = str16;
                    money = money2;
                    str3 = str17;
                case 6:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    str4 = str19;
                    str = str15;
                    str2 = str16;
                    money = money2;
                    str3 = str17;
                case 7:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader);
                    str4 = str19;
                    str = str15;
                    str2 = str16;
                    money = money2;
                    str3 = str17;
                case 8:
                    str8 = this.stringAdapter.fromJson(jsonReader);
                    if (str8 == null) {
                        throw Util.unexpectedNull("payeeName", "payee_name", jsonReader);
                    }
                    str4 = str19;
                    str = str15;
                    str2 = str16;
                    money = money2;
                    str3 = str17;
                case 9:
                    str9 = this.stringAdapter.fromJson(jsonReader);
                    if (str9 == null) {
                        throw Util.unexpectedNull("payeeAccountNumber", "payee_account_number", jsonReader);
                    }
                    str4 = str19;
                    str = str15;
                    str2 = str16;
                    money = money2;
                    str3 = str17;
                case 10:
                    str10 = this.stringAdapter.fromJson(jsonReader);
                    if (str10 == null) {
                        byte[] bArr4 = new byte[14];
                        for (int i2 = 0; i2 < 14; i2++) {
                            bArr4[i2] = (byte) (bArr2[i2] ^ bArr[i2 % 8]);
                        }
                        throw Util.unexpectedNull("payeeBankBic", new String(bArr4, uza.a), jsonReader);
                    }
                    str4 = str19;
                    str = str15;
                    str2 = str16;
                    money = money2;
                    str3 = str17;
                case 11:
                    str11 = this.nullableStringAdapter.fromJson(jsonReader);
                    str4 = str19;
                    str = str15;
                    str2 = str16;
                    money = money2;
                    str3 = str17;
                case 12:
                    str12 = this.nullableStringAdapter.fromJson(jsonReader);
                    str4 = str19;
                    str = str15;
                    str2 = str16;
                    money = money2;
                    str3 = str17;
                case 13:
                    str13 = this.nullableStringAdapter.fromJson(jsonReader);
                    str4 = str19;
                    str = str15;
                    str2 = str16;
                    money = money2;
                    str3 = str17;
                case 14:
                    str14 = this.nullableStringAdapter.fromJson(jsonReader);
                    str4 = str19;
                    str = str15;
                    str2 = str16;
                    money = money2;
                    str3 = str17;
                default:
                    str4 = str19;
                    str = str15;
                    str2 = str16;
                    money = money2;
                    str3 = str17;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, C2gTransferRequisitesDto c2gTransferRequisitesDto) {
        C2gTransferRequisitesDto c2gTransferRequisitesDto2 = c2gTransferRequisitesDto;
        if (c2gTransferRequisitesDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("uin");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) c2gTransferRequisitesDto2.getUin());
        jsonWriter.name("payment_purpose");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) c2gTransferRequisitesDto2.getPaymentPurpose());
        jsonWriter.name("discount");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) c2gTransferRequisitesDto2.getDiscount());
        jsonWriter.name("discount_expire");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) c2gTransferRequisitesDto2.getDiscountExpire());
        jsonWriter.name("payer_name");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) c2gTransferRequisitesDto2.getPayerName());
        jsonWriter.name("payer_inn");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) c2gTransferRequisitesDto2.getPayerInn());
        jsonWriter.name("payer_kpp");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) c2gTransferRequisitesDto2.getPayerKpp());
        jsonWriter.name("tax_bill_date");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) c2gTransferRequisitesDto2.getTaxiBillDate());
        jsonWriter.name("payee_name");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) c2gTransferRequisitesDto2.getPayeeName());
        jsonWriter.name("payee_account_number");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) c2gTransferRequisitesDto2.getPayeeAccountNumber());
        byte[] bArr = new byte[14];
        for (int i = 0; i < 14; i++) {
            bArr[i] = (byte) (kf91.b[i] ^ kf91.a[i % 8]);
        }
        jsonWriter.name(new String(bArr, uza.a));
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) c2gTransferRequisitesDto2.getPayeeBankBic());
        jsonWriter.name("payee_inn");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) c2gTransferRequisitesDto2.getPayeeInn());
        jsonWriter.name("payee_kpp");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) c2gTransferRequisitesDto2.getPayeeKpp());
        jsonWriter.name("legal_act");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) c2gTransferRequisitesDto2.getLegalAct());
        jsonWriter.name("payment_term");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) c2gTransferRequisitesDto2.getPaymentTerm());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(C2gTransferRequisitesDto)");
    }
}
