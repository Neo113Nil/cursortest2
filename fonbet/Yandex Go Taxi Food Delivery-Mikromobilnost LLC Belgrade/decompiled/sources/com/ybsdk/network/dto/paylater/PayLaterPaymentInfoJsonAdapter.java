package com.ybsdk.network.dto.paylater;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ColoredTextDto;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/network/dto/paylater/PayLaterPaymentInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/paylater/PayLaterPaymentInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/ColoredTextDto;", "nullableColoredTextDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PayLaterPaymentInfoJsonAdapter extends JsonAdapter<PayLaterPaymentInfo> {
    private volatile Constructor<PayLaterPaymentInfo> constructorRef;
    private final JsonAdapter<ColoredTextDto> nullableColoredTextDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("amount", "payment_date", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
    private final JsonAdapter<String> stringAdapter;

    public PayLaterPaymentInfoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "paymentAmount");
        this.nullableColoredTextDtoAdapter = moshi.adapter(ColoredTextDto.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PayLaterPaymentInfo fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        ColoredTextDto coloredTextDto = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("paymentAmount", "amount", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("paymentDate", "payment_date", jsonReader);
                }
            } else if (selectName == 2) {
                coloredTextDto = this.nullableColoredTextDtoAdapter.fromJson(jsonReader);
                i = -5;
            }
        }
        jsonReader.endObject();
        if (i == -5) {
            if (str == null) {
                throw Util.missingProperty("paymentAmount", "amount", jsonReader);
            }
            if (str2 != null) {
                return new PayLaterPaymentInfo(str, str2, coloredTextDto);
            }
            throw Util.missingProperty("paymentDate", "payment_date", jsonReader);
        }
        Constructor<PayLaterPaymentInfo> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PayLaterPaymentInfo.class.getDeclaredConstructor(String.class, String.class, ColoredTextDto.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str == null) {
            throw Util.missingProperty("paymentAmount", "amount", jsonReader);
        }
        if (str2 != null) {
            return constructor.newInstance(str, str2, coloredTextDto, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("paymentDate", "payment_date", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PayLaterPaymentInfo payLaterPaymentInfo) {
        PayLaterPaymentInfo payLaterPaymentInfo2 = payLaterPaymentInfo;
        if (payLaterPaymentInfo2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("amount");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) payLaterPaymentInfo2.getPaymentAmount());
        jsonWriter.name("payment_date");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) payLaterPaymentInfo2.getPaymentDate());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableColoredTextDtoAdapter.toJson(jsonWriter, (JsonWriter) payLaterPaymentInfo2.getDescription());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(PayLaterPaymentInfo)");
    }
}
