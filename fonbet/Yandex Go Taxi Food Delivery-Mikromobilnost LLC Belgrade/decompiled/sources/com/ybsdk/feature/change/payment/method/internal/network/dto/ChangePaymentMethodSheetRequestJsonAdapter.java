package com.ybsdk.feature.change.payment.method.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/change/payment/method/internal/network/dto/ChangePaymentMethodSheetRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/change/payment/method/internal/network/dto/ChangePaymentMethodSheetRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "nullableStringAdapter", "", "nullableListOfStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-change-payment-method_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChangePaymentMethodSheetRequestJsonAdapter extends JsonAdapter<ChangePaymentMethodSheetRequest> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ChangePaymentMethodSheetRequest> constructorRef;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("scenario", "is_first_launch", "selected_payment_method_id", "agreement_id", "new_card_trust_id", "success_actions", "fail_actions", "cancel_actions");
    private final JsonAdapter<String> stringAdapter;

    public ChangePaymentMethodSheetRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "scenario");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isFirstLaunch");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "selectedPaymentMethodId");
        this.nullableListOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "successActions");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ChangePaymentMethodSheetRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        Boolean bool = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List<String> list = null;
        List<String> list2 = null;
        List<String> list3 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("scenario", "scenario", jsonReader);
                    }
                    break;
                case 1:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("isFirstLaunch", "is_first_launch", jsonReader);
                    }
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    list = this.nullableListOfStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    list2 = this.nullableListOfStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    list3 = this.nullableListOfStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -29) {
            Boolean bool2 = bool;
            String str5 = str;
            if (str5 == null) {
                throw Util.missingProperty("scenario", "scenario", jsonReader);
            }
            if (bool2 == null) {
                throw Util.missingProperty("isFirstLaunch", "is_first_launch", jsonReader);
            }
            List<String> list4 = list3;
            List<String> list5 = list2;
            List<String> list6 = list;
            String str6 = str4;
            return new ChangePaymentMethodSheetRequest(str5, bool2.booleanValue(), str2, str3, str6, list6, list5, list4);
        }
        String str7 = str3;
        String str8 = str2;
        List<String> list7 = list3;
        List<String> list8 = list2;
        List<String> list9 = list;
        String str9 = str4;
        Boolean bool3 = bool;
        String str10 = str;
        Constructor<ChangePaymentMethodSheetRequest> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ChangePaymentMethodSheetRequest.class.getDeclaredConstructor(String.class, Boolean.TYPE, String.class, String.class, String.class, List.class, List.class, List.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        Constructor<ChangePaymentMethodSheetRequest> constructor2 = constructor;
        if (str10 == null) {
            throw Util.missingProperty("scenario", "scenario", jsonReader);
        }
        if (bool3 != null) {
            return constructor2.newInstance(str10, bool3, str8, str7, str9, list9, list8, list7, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("isFirstLaunch", "is_first_launch", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ChangePaymentMethodSheetRequest changePaymentMethodSheetRequest) {
        ChangePaymentMethodSheetRequest changePaymentMethodSheetRequest2 = changePaymentMethodSheetRequest;
        if (changePaymentMethodSheetRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("scenario");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) changePaymentMethodSheetRequest2.getScenario());
        jsonWriter.name("is_first_launch");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(changePaymentMethodSheetRequest2.isFirstLaunch()));
        jsonWriter.name("selected_payment_method_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) changePaymentMethodSheetRequest2.getSelectedPaymentMethodId());
        jsonWriter.name("agreement_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) changePaymentMethodSheetRequest2.getAgreementId());
        jsonWriter.name("new_card_trust_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) changePaymentMethodSheetRequest2.getNewCardTrustId());
        jsonWriter.name("success_actions");
        this.nullableListOfStringAdapter.toJson(jsonWriter, (JsonWriter) changePaymentMethodSheetRequest2.getSuccessActions());
        jsonWriter.name("fail_actions");
        this.nullableListOfStringAdapter.toJson(jsonWriter, (JsonWriter) changePaymentMethodSheetRequest2.getFailActions());
        jsonWriter.name("cancel_actions");
        this.nullableListOfStringAdapter.toJson(jsonWriter, (JsonWriter) changePaymentMethodSheetRequest2.getCancelActions());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(53, "GeneratedJsonAdapter(ChangePaymentMethodSheetRequest)");
    }
}
