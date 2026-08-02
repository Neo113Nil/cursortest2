package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.network.dto.creditlimit.CreditLimitPlansResponse;
import defpackage.ny61;
import defpackage.tje;
import defpackage.uw51;
import defpackage.uza;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlansResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlansResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlansResponse$UpgradeStatus;", "upgradeStatusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/creditlimit/CreditPlanLimitResponse;", "nullableCreditPlanLimitResponseAdapter", "", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanResponse;", "listOfCreditLimitPlanResponseAdapter", "", "nullableStringAdapter", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPublicDocumentsResponse;", "creditLimitPublicDocumentsResponseAdapter", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitPaymentMethodResponse;", "nullableCreditLimitPaymentMethodResponseAdapter", "stringAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreditLimitPlansResponseJsonAdapter extends JsonAdapter<CreditLimitPlansResponse> {
    private final JsonAdapter<CreditLimitPublicDocumentsResponse> creditLimitPublicDocumentsResponseAdapter;
    private final JsonAdapter<List<CreditLimitPlanResponse>> listOfCreditLimitPlanResponseAdapter;
    private final JsonAdapter<CreditLimitPaymentMethodResponse> nullableCreditLimitPaymentMethodResponseAdapter;
    private final JsonAdapter<CreditPlanLimitResponse> nullableCreditPlanLimitResponseAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<CreditLimitPlansResponse.UpgradeStatus> upgradeStatusAdapter;

    public CreditLimitPlansResponseJsonAdapter(Moshi moshi) {
        byte[] bArr = tje.z0;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        this.options = JsonReader.Options.of("upgrade_status", "limit", "plans", "split_card_id", "onboarding_url", "public_documents", "credit_payment_method", "change_payment_method_action", new String(bArr2, uza.a));
        EmptySet emptySet = EmptySet.a;
        this.upgradeStatusAdapter = moshi.adapter(CreditLimitPlansResponse.UpgradeStatus.class, emptySet, "upgradeStatus");
        this.nullableCreditPlanLimitResponseAdapter = moshi.adapter(CreditPlanLimitResponse.class, emptySet, "limit");
        this.listOfCreditLimitPlanResponseAdapter = moshi.adapter(Types.newParameterizedType(List.class, CreditLimitPlanResponse.class), emptySet, "plans");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "splitCardId");
        this.creditLimitPublicDocumentsResponseAdapter = moshi.adapter(CreditLimitPublicDocumentsResponse.class, emptySet, "publicDocuments");
        this.nullableCreditLimitPaymentMethodResponseAdapter = moshi.adapter(CreditLimitPaymentMethodResponse.class, emptySet, "creditPaymentMethod");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "changePaymentMethodAction");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CreditLimitPlansResponse fromJson(JsonReader jsonReader) {
        byte[] bArr = tje.b;
        byte[] bArr2 = tje.z0;
        jsonReader.beginObject();
        CreditLimitPlansResponse.UpgradeStatus upgradeStatus = null;
        CreditPlanLimitResponse creditPlanLimitResponse = null;
        List<CreditLimitPlanResponse> list = null;
        String str = null;
        String str2 = null;
        CreditLimitPublicDocumentsResponse creditLimitPublicDocumentsResponse = null;
        CreditLimitPaymentMethodResponse creditLimitPaymentMethodResponse = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            CreditLimitPlansResponse.UpgradeStatus upgradeStatus2 = upgradeStatus;
            CreditPlanLimitResponse creditPlanLimitResponse2 = creditPlanLimitResponse;
            List<CreditLimitPlanResponse> list2 = list;
            if (!jsonReader.hasNext()) {
                String str5 = str;
                jsonReader.endObject();
                if (upgradeStatus2 == null) {
                    throw Util.missingProperty("upgradeStatus", "upgrade_status", jsonReader);
                }
                if (list2 == null) {
                    throw Util.missingProperty("plans", "plans", jsonReader);
                }
                if (creditLimitPublicDocumentsResponse == null) {
                    throw Util.missingProperty("publicDocuments", "public_documents", jsonReader);
                }
                if (str3 == null) {
                    throw Util.missingProperty("changePaymentMethodAction", "change_payment_method_action", jsonReader);
                }
                if (str4 != null) {
                    return new CreditLimitPlansResponse(upgradeStatus2, creditPlanLimitResponse2, list2, str5, str2, creditLimitPublicDocumentsResponse, creditLimitPaymentMethodResponse, str3, str4);
                }
                byte[] bArr5 = new byte[13];
                for (int i = 0; i < 13; i++) {
                    bArr5[i] = (byte) (bArr4[i] ^ bArr3[i % 8]);
                }
                throw Util.missingProperty("appLink", new String(bArr5, uza.a), jsonReader);
            }
            String str6 = str;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    bArr = bArr3;
                    bArr2 = bArr4;
                    str = str6;
                    upgradeStatus = upgradeStatus2;
                    creditPlanLimitResponse = creditPlanLimitResponse2;
                    list = list2;
                case 0:
                    upgradeStatus = this.upgradeStatusAdapter.fromJson(jsonReader);
                    if (upgradeStatus == null) {
                        throw Util.unexpectedNull("upgradeStatus", "upgrade_status", jsonReader);
                    }
                    bArr = bArr3;
                    bArr2 = bArr4;
                    str = str6;
                    creditPlanLimitResponse = creditPlanLimitResponse2;
                    list = list2;
                case 1:
                    creditPlanLimitResponse = this.nullableCreditPlanLimitResponseAdapter.fromJson(jsonReader);
                    bArr = bArr3;
                    bArr2 = bArr4;
                    str = str6;
                    upgradeStatus = upgradeStatus2;
                    list = list2;
                case 2:
                    List<CreditLimitPlanResponse> fromJson = this.listOfCreditLimitPlanResponseAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("plans", "plans", jsonReader);
                    }
                    list = fromJson;
                    bArr = bArr3;
                    bArr2 = bArr4;
                    str = str6;
                    upgradeStatus = upgradeStatus2;
                    creditPlanLimitResponse = creditPlanLimitResponse2;
                case 3:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    bArr = bArr3;
                    bArr2 = bArr4;
                    upgradeStatus = upgradeStatus2;
                    creditPlanLimitResponse = creditPlanLimitResponse2;
                    list = list2;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    bArr = bArr3;
                    bArr2 = bArr4;
                    str = str6;
                    upgradeStatus = upgradeStatus2;
                    creditPlanLimitResponse = creditPlanLimitResponse2;
                    list = list2;
                case 5:
                    creditLimitPublicDocumentsResponse = this.creditLimitPublicDocumentsResponseAdapter.fromJson(jsonReader);
                    if (creditLimitPublicDocumentsResponse == null) {
                        throw Util.unexpectedNull("publicDocuments", "public_documents", jsonReader);
                    }
                    bArr = bArr3;
                    bArr2 = bArr4;
                    str = str6;
                    upgradeStatus = upgradeStatus2;
                    creditPlanLimitResponse = creditPlanLimitResponse2;
                    list = list2;
                case 6:
                    creditLimitPaymentMethodResponse = this.nullableCreditLimitPaymentMethodResponseAdapter.fromJson(jsonReader);
                    bArr = bArr3;
                    bArr2 = bArr4;
                    str = str6;
                    upgradeStatus = upgradeStatus2;
                    creditPlanLimitResponse = creditPlanLimitResponse2;
                    list = list2;
                case 7:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("changePaymentMethodAction", "change_payment_method_action", jsonReader);
                    }
                    bArr = bArr3;
                    bArr2 = bArr4;
                    str = str6;
                    upgradeStatus = upgradeStatus2;
                    creditPlanLimitResponse = creditPlanLimitResponse2;
                    list = list2;
                case 8:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        byte[] bArr6 = new byte[13];
                        int i2 = 0;
                        for (int i3 = 13; i2 < i3; i3 = 13) {
                            bArr6[i2] = (byte) (bArr4[i2] ^ bArr3[i2 % 8]);
                            i2++;
                        }
                        throw Util.unexpectedNull("appLink", new String(bArr6, uza.a), jsonReader);
                    }
                    bArr = bArr3;
                    bArr2 = bArr4;
                    str = str6;
                    upgradeStatus = upgradeStatus2;
                    creditPlanLimitResponse = creditPlanLimitResponse2;
                    list = list2;
                default:
                    bArr = bArr3;
                    bArr2 = bArr4;
                    str = str6;
                    upgradeStatus = upgradeStatus2;
                    creditPlanLimitResponse = creditPlanLimitResponse2;
                    list = list2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CreditLimitPlansResponse creditLimitPlansResponse) {
        CreditLimitPlansResponse creditLimitPlansResponse2 = creditLimitPlansResponse;
        if (creditLimitPlansResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("upgrade_status");
        this.upgradeStatusAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlansResponse2.getUpgradeStatus());
        jsonWriter.name("limit");
        this.nullableCreditPlanLimitResponseAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlansResponse2.getLimit());
        jsonWriter.name("plans");
        this.listOfCreditLimitPlanResponseAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlansResponse2.getPlans());
        jsonWriter.name("split_card_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlansResponse2.getSplitCardId());
        jsonWriter.name("onboarding_url");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlansResponse2.getOnboardingUrl());
        jsonWriter.name("public_documents");
        this.creditLimitPublicDocumentsResponseAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlansResponse2.getPublicDocuments());
        jsonWriter.name("credit_payment_method");
        this.nullableCreditLimitPaymentMethodResponseAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlansResponse2.getCreditPaymentMethod());
        jsonWriter.name("change_payment_method_action");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlansResponse2.getChangePaymentMethodAction());
        byte[] bArr = tje.z0;
        byte[] bArr2 = new byte[13];
        for (int i = 0; i < 13; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        jsonWriter.name(new String(bArr2, uza.a));
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) creditLimitPlansResponse2.getAppLink());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(CreditLimitPlansResponse)");
    }
}
