package com.ybsdk.feature.partnerselection.internal.network.dto.check;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.hg91;
import defpackage.ny61;
import defpackage.uw51;
import defpackage.uza;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/partnerselection/internal/network/dto/check/CheckUserPartnerRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/check/CheckUserPartnerRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Money;", "nullableMoneyAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-partner-selection_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CheckUserPartnerRequestJsonAdapter extends JsonAdapter<CheckUserPartnerRequest> {
    private volatile Constructor<CheckUserPartnerRequest> constructorRef;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public CheckUserPartnerRequestJsonAdapter(Moshi moshi) {
        byte[] bArr = hg91.f;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ hg91.a[i % 8]);
        }
        this.options = JsonReader.Options.of("agreement_id", "receiver_phone", new String(bArr2, uza.a), "money", "comment", "transfer_id", "transfer_type");
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "agreementId");
        this.nullableMoneyAdapter = moshi.adapter(Money.class, emptySet, "money");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "comment");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CheckUserPartnerRequest fromJson(JsonReader jsonReader) {
        int i;
        byte[] bArr = hg91.a;
        byte[] bArr2 = hg91.f;
        jsonReader.beginObject();
        int i2 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        Money money = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (true) {
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (i2 == -25) {
                    String str7 = str6;
                    String str8 = str5;
                    String str9 = str4;
                    Money money2 = money;
                    String str10 = str3;
                    String str11 = str2;
                    String str12 = str;
                    if (str12 == null) {
                        throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
                    }
                    if (str11 == null) {
                        throw Util.missingProperty("receiverPhone", "receiver_phone", jsonReader);
                    }
                    if (str10 != null) {
                        return new CheckUserPartnerRequest(str12, str11, str10, money2, str9, str8, str7);
                    }
                    byte[] bArr5 = new byte[7];
                    int i3 = 0;
                    for (int i4 = 7; i3 < i4; i4 = 7) {
                        bArr5[i3] = (byte) (bArr4[i3] ^ bArr3[i3 % 8]);
                        i3++;
                    }
                    throw Util.missingProperty("partnerId", new String(bArr5, uza.a), jsonReader);
                }
                String str13 = str6;
                String str14 = str5;
                String str15 = str4;
                Money money3 = money;
                String str16 = str3;
                String str17 = str2;
                String str18 = str;
                Constructor<CheckUserPartnerRequest> constructor = this.constructorRef;
                if (constructor == null) {
                    i = i2;
                    constructor = CheckUserPartnerRequest.class.getDeclaredConstructor(String.class, String.class, String.class, Money.class, String.class, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                    this.constructorRef = constructor;
                } else {
                    i = i2;
                }
                Constructor<CheckUserPartnerRequest> constructor2 = constructor;
                if (str18 == null) {
                    throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
                }
                if (str17 == null) {
                    throw Util.missingProperty("receiverPhone", "receiver_phone", jsonReader);
                }
                if (str16 != null) {
                    return constructor2.newInstance(str18, str17, str16, money3, str15, str14, str13, Integer.valueOf(i), null);
                }
                byte[] bArr6 = new byte[7];
                for (int i5 = 0; i5 < 7; i5++) {
                    bArr6[i5] = (byte) (bArr4[i5] ^ bArr3[i5 % 8]);
                }
                throw Util.missingProperty("partnerId", new String(bArr6, uza.a), jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("agreementId", "agreement_id", jsonReader);
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("receiverPhone", "receiver_phone", jsonReader);
                    }
                    break;
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        byte[] bArr7 = new byte[7];
                        int i6 = 0;
                        for (int i7 = 7; i6 < i7; i7 = 7) {
                            bArr7[i6] = (byte) (bArr4[i6] ^ bArr3[i6 % 8]);
                            i6++;
                        }
                        throw Util.unexpectedNull("partnerId", new String(bArr7, uza.a), jsonReader);
                    }
                    break;
                case 3:
                    money = this.nullableMoneyAdapter.fromJson(jsonReader);
                    i2 &= -9;
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -17;
                    break;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
            bArr = bArr3;
            bArr2 = bArr4;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CheckUserPartnerRequest checkUserPartnerRequest) {
        CheckUserPartnerRequest checkUserPartnerRequest2 = checkUserPartnerRequest;
        if (checkUserPartnerRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) checkUserPartnerRequest2.getAgreementId());
        jsonWriter.name("receiver_phone");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) checkUserPartnerRequest2.getReceiverPhone());
        byte[] bArr = new byte[7];
        for (int i = 0; i < 7; i++) {
            bArr[i] = (byte) (hg91.f[i] ^ hg91.a[i % 8]);
        }
        jsonWriter.name(new String(bArr, uza.a));
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) checkUserPartnerRequest2.getPartnerId());
        jsonWriter.name("money");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) checkUserPartnerRequest2.getMoney());
        jsonWriter.name("comment");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) checkUserPartnerRequest2.getComment());
        jsonWriter.name("transfer_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) checkUserPartnerRequest2.getTransferId());
        jsonWriter.name("transfer_type");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) checkUserPartnerRequest2.getTransferType());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(CheckUserPartnerRequest)");
    }
}
