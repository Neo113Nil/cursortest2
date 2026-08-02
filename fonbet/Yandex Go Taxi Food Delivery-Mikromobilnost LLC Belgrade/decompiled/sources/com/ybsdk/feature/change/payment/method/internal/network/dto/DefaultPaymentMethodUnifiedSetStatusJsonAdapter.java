package com.ybsdk.feature.change.payment.method.internal.network.dto;

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

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/change/payment/method/internal/network/dto/DefaultPaymentMethodUnifiedSetStatusJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/change/payment/method/internal/network/dto/DefaultPaymentMethodUnifiedSetStatus;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/change/payment/method/internal/network/dto/DefaultPaymentMethodUnifiedStatus;", "defaultPaymentMethodUnifiedStatusAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-change-payment-method_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultPaymentMethodUnifiedSetStatusJsonAdapter extends JsonAdapter<DefaultPaymentMethodUnifiedSetStatus> {
    private volatile Constructor<DefaultPaymentMethodUnifiedSetStatus> constructorRef;
    private final JsonAdapter<DefaultPaymentMethodUnifiedStatus> defaultPaymentMethodUnifiedStatusAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(ACSPConstants.STATUS, "url_3ds", "payment_url", "error_code");

    public DefaultPaymentMethodUnifiedSetStatusJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.defaultPaymentMethodUnifiedStatusAdapter = moshi.adapter(DefaultPaymentMethodUnifiedStatus.class, emptySet, ACSPConstants.STATUS);
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "url3ds");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DefaultPaymentMethodUnifiedSetStatus fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        DefaultPaymentMethodUnifiedStatus defaultPaymentMethodUnifiedStatus = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                defaultPaymentMethodUnifiedStatus = this.defaultPaymentMethodUnifiedStatusAdapter.fromJson(jsonReader);
                if (defaultPaymentMethodUnifiedStatus == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (selectName == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -5;
            } else if (selectName == 3) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -9;
            }
        }
        jsonReader.endObject();
        if (i == -15) {
            if (defaultPaymentMethodUnifiedStatus != null) {
                return new DefaultPaymentMethodUnifiedSetStatus(defaultPaymentMethodUnifiedStatus, str, str2, str3);
            }
            throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
        }
        Constructor<DefaultPaymentMethodUnifiedSetStatus> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = DefaultPaymentMethodUnifiedSetStatus.class.getDeclaredConstructor(DefaultPaymentMethodUnifiedStatus.class, String.class, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (defaultPaymentMethodUnifiedStatus != null) {
            return constructor.newInstance(defaultPaymentMethodUnifiedStatus, str, str2, str3, Integer.valueOf(i), null);
        }
        throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DefaultPaymentMethodUnifiedSetStatus defaultPaymentMethodUnifiedSetStatus) {
        DefaultPaymentMethodUnifiedSetStatus defaultPaymentMethodUnifiedSetStatus2 = defaultPaymentMethodUnifiedSetStatus;
        if (defaultPaymentMethodUnifiedSetStatus2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ACSPConstants.STATUS);
        this.defaultPaymentMethodUnifiedStatusAdapter.toJson(jsonWriter, (JsonWriter) defaultPaymentMethodUnifiedSetStatus2.getStatus());
        jsonWriter.name("url_3ds");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) defaultPaymentMethodUnifiedSetStatus2.getUrl3ds());
        jsonWriter.name("payment_url");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) defaultPaymentMethodUnifiedSetStatus2.getPaymentUrl());
        jsonWriter.name("error_code");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) defaultPaymentMethodUnifiedSetStatus2.getErrorCode());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(58, "GeneratedJsonAdapter(DefaultPaymentMethodUnifiedSetStatus)");
    }
}
