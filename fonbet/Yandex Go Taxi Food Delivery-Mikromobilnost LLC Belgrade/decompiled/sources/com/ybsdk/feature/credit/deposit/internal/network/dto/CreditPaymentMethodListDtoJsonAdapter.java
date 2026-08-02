package com.ybsdk.feature.credit.deposit.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditPaymentMethodListDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditPaymentMethodListDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/PaymentMethodSheetItemDto;", "listOfPaymentMethodSheetItemDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditAdditionalButtonDto;", "nullableListOfCreditAdditionalButtonDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreditPaymentMethodListDtoJsonAdapter extends JsonAdapter<CreditPaymentMethodListDto> {
    private volatile Constructor<CreditPaymentMethodListDto> constructorRef;
    private final JsonAdapter<List<PaymentMethodSheetItemDto>> listOfPaymentMethodSheetItemDtoAdapter;
    private final JsonAdapter<List<CreditAdditionalButtonDto>> nullableListOfCreditAdditionalButtonDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("payment_methods", "additional_buttons");

    public CreditPaymentMethodListDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, PaymentMethodSheetItemDto.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfPaymentMethodSheetItemDtoAdapter = moshi.adapter(newParameterizedType, emptySet, "paymentMethods");
        this.nullableListOfCreditAdditionalButtonDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, CreditAdditionalButtonDto.class), emptySet, "additionalButtons");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CreditPaymentMethodListDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<PaymentMethodSheetItemDto> list = null;
        List<CreditAdditionalButtonDto> list2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfPaymentMethodSheetItemDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("paymentMethods", "payment_methods", jsonReader);
                }
            } else if (selectName == 1) {
                list2 = this.nullableListOfCreditAdditionalButtonDtoAdapter.fromJson(jsonReader);
                i = -3;
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            if (list != null) {
                return new CreditPaymentMethodListDto(list, list2);
            }
            throw Util.missingProperty("paymentMethods", "payment_methods", jsonReader);
        }
        Constructor<CreditPaymentMethodListDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CreditPaymentMethodListDto.class.getDeclaredConstructor(List.class, List.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (list != null) {
            return constructor.newInstance(list, list2, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("paymentMethods", "payment_methods", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CreditPaymentMethodListDto creditPaymentMethodListDto) {
        CreditPaymentMethodListDto creditPaymentMethodListDto2 = creditPaymentMethodListDto;
        if (creditPaymentMethodListDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("payment_methods");
        this.listOfPaymentMethodSheetItemDtoAdapter.toJson(jsonWriter, (JsonWriter) creditPaymentMethodListDto2.getPaymentMethods());
        jsonWriter.name("additional_buttons");
        this.nullableListOfCreditAdditionalButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) creditPaymentMethodListDto2.getAdditionalButtons());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(48, "GeneratedJsonAdapter(CreditPaymentMethodListDto)");
    }
}
