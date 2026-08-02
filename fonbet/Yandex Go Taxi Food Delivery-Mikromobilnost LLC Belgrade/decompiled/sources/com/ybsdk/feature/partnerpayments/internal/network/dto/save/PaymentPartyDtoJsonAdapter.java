package com.ybsdk.feature.partnerpayments.internal.network.dto.save;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.partnerpayments.internal.network.dto.save.PaymentPartyDto;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/PaymentPartyDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/PaymentPartyDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/PaymentPartyDto$PaymentPartyType;", "nullablePaymentPartyTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/SbpPartyDto;", "nullableSbpPartyDtoAdapter", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AgreementPartyDto;", "nullableAgreementPartyDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-partner-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentPartyDtoJsonAdapter extends JsonAdapter<PaymentPartyDto> {
    private volatile Constructor<PaymentPartyDto> constructorRef;
    private final JsonAdapter<AgreementPartyDto> nullableAgreementPartyDtoAdapter;
    private final JsonAdapter<PaymentPartyDto.PaymentPartyType> nullablePaymentPartyTypeAdapter;
    private final JsonAdapter<SbpPartyDto> nullableSbpPartyDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("party_type", "sbp_party", "agreement_party");

    public PaymentPartyDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullablePaymentPartyTypeAdapter = moshi.adapter(PaymentPartyDto.PaymentPartyType.class, emptySet, "partyType");
        this.nullableSbpPartyDtoAdapter = moshi.adapter(SbpPartyDto.class, emptySet, "sbpParty");
        this.nullableAgreementPartyDtoAdapter = moshi.adapter(AgreementPartyDto.class, emptySet, "agreementParty");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PaymentPartyDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PaymentPartyDto.PaymentPartyType paymentPartyType = null;
        SbpPartyDto sbpPartyDto = null;
        AgreementPartyDto agreementPartyDto = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                paymentPartyType = this.nullablePaymentPartyTypeAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (selectName == 1) {
                sbpPartyDto = this.nullableSbpPartyDtoAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (selectName == 2) {
                agreementPartyDto = this.nullableAgreementPartyDtoAdapter.fromJson(jsonReader);
                i &= -5;
            }
        }
        jsonReader.endObject();
        if (i == -8) {
            return new PaymentPartyDto(paymentPartyType, sbpPartyDto, agreementPartyDto);
        }
        Constructor<PaymentPartyDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PaymentPartyDto.class.getDeclaredConstructor(PaymentPartyDto.PaymentPartyType.class, SbpPartyDto.class, AgreementPartyDto.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(paymentPartyType, sbpPartyDto, agreementPartyDto, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PaymentPartyDto paymentPartyDto) {
        PaymentPartyDto paymentPartyDto2 = paymentPartyDto;
        if (paymentPartyDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("party_type");
        this.nullablePaymentPartyTypeAdapter.toJson(jsonWriter, (JsonWriter) paymentPartyDto2.getPartyType());
        jsonWriter.name("sbp_party");
        this.nullableSbpPartyDtoAdapter.toJson(jsonWriter, (JsonWriter) paymentPartyDto2.getSbpParty());
        jsonWriter.name("agreement_party");
        this.nullableAgreementPartyDtoAdapter.toJson(jsonWriter, (JsonWriter) paymentPartyDto2.getAgreementParty());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(PaymentPartyDto)");
    }
}
