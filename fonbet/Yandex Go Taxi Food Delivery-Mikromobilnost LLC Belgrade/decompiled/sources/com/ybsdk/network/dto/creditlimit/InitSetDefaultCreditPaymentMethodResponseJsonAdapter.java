package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/InitSetDefaultCreditPaymentMethodResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/creditlimit/InitSetDefaultCreditPaymentMethodResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/network/dto/creditlimit/CreditPaymentMethodSetStatus;", "creditPaymentMethodSetStatusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InitSetDefaultCreditPaymentMethodResponseJsonAdapter extends JsonAdapter<InitSetDefaultCreditPaymentMethodResponse> {
    private volatile Constructor<InitSetDefaultCreditPaymentMethodResponse> constructorRef;
    private final JsonAdapter<CreditPaymentMethodSetStatus> creditPaymentMethodSetStatusAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(ACSPConstants.STATUS, "payment_id");

    public InitSetDefaultCreditPaymentMethodResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.creditPaymentMethodSetStatusAdapter = moshi.adapter(CreditPaymentMethodSetStatus.class, emptySet, ACSPConstants.STATUS);
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "paymentId");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final InitSetDefaultCreditPaymentMethodResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        CreditPaymentMethodSetStatus creditPaymentMethodSetStatus = null;
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                creditPaymentMethodSetStatus = this.creditPaymentMethodSetStatusAdapter.fromJson(jsonReader);
                if (creditPaymentMethodSetStatus == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
                i = -3;
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            if (creditPaymentMethodSetStatus != null) {
                return new InitSetDefaultCreditPaymentMethodResponse(creditPaymentMethodSetStatus, str);
            }
            throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
        }
        Constructor<InitSetDefaultCreditPaymentMethodResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = InitSetDefaultCreditPaymentMethodResponse.class.getDeclaredConstructor(CreditPaymentMethodSetStatus.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (creditPaymentMethodSetStatus != null) {
            return constructor.newInstance(creditPaymentMethodSetStatus, str, Integer.valueOf(i), null);
        }
        throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, InitSetDefaultCreditPaymentMethodResponse initSetDefaultCreditPaymentMethodResponse) {
        InitSetDefaultCreditPaymentMethodResponse initSetDefaultCreditPaymentMethodResponse2 = initSetDefaultCreditPaymentMethodResponse;
        if (initSetDefaultCreditPaymentMethodResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ACSPConstants.STATUS);
        this.creditPaymentMethodSetStatusAdapter.toJson(jsonWriter, (JsonWriter) initSetDefaultCreditPaymentMethodResponse2.getStatus());
        jsonWriter.name("payment_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) initSetDefaultCreditPaymentMethodResponse2.getPaymentId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(63, "GeneratedJsonAdapter(InitSetDefaultCreditPaymentMethodResponse)");
    }
}
