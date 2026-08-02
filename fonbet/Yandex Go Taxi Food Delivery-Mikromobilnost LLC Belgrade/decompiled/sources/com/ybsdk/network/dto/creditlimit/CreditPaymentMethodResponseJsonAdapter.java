package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.tje;
import defpackage.uw51;
import defpackage.uza;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditPaymentMethodResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/creditlimit/CreditPaymentMethodResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/network/dto/creditlimit/CreditPaymentMethodTypeResponse;", "creditPaymentMethodTypeResponseAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "nullableStringAdapter", "Lcom/ybsdk/network/dto/creditlimit/CreditPaymentMethodAftInfoResponse;", "nullableCreditPaymentMethodAftInfoResponseAdapter", "Lcom/ybsdk/network/dto/creditlimit/CreditPaymentMethodWalletInfoResponse;", "nullableCreditPaymentMethodWalletInfoResponseAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreditPaymentMethodResponseJsonAdapter extends JsonAdapter<CreditPaymentMethodResponse> {
    private volatile Constructor<CreditPaymentMethodResponse> constructorRef;
    private final JsonAdapter<CreditPaymentMethodTypeResponse> creditPaymentMethodTypeResponseAdapter;
    private final JsonAdapter<CreditPaymentMethodAftInfoResponse> nullableCreditPaymentMethodAftInfoResponseAdapter;
    private final JsonAdapter<CreditPaymentMethodWalletInfoResponse> nullableCreditPaymentMethodWalletInfoResponseAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public CreditPaymentMethodResponseJsonAdapter(Moshi moshi) {
        byte[] bArr = tje.f0;
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        this.options = JsonReader.Options.of("payment_method_type", "title", "payment_method_id", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "logo", new String(bArr2, uza.a), "aft_info", "wallet_info");
        EmptySet emptySet = EmptySet.a;
        this.creditPaymentMethodTypeResponseAdapter = moshi.adapter(CreditPaymentMethodTypeResponse.class, emptySet, "paymentMethodType");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "paymentMethodId");
        this.nullableCreditPaymentMethodAftInfoResponseAdapter = moshi.adapter(CreditPaymentMethodAftInfoResponse.class, emptySet, "aftInfo");
        this.nullableCreditPaymentMethodWalletInfoResponseAdapter = moshi.adapter(CreditPaymentMethodWalletInfoResponse.class, emptySet, "walletInfo");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CreditPaymentMethodResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        CreditPaymentMethodTypeResponse creditPaymentMethodTypeResponse = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        CreditPaymentMethodAftInfoResponse creditPaymentMethodAftInfoResponse = null;
        CreditPaymentMethodWalletInfoResponse creditPaymentMethodWalletInfoResponse = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    creditPaymentMethodTypeResponse = this.creditPaymentMethodTypeResponseAdapter.fromJson(jsonReader);
                    if (creditPaymentMethodTypeResponse == null) {
                        throw Util.unexpectedNull("paymentMethodType", "payment_method_type", jsonReader);
                    }
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
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
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    creditPaymentMethodAftInfoResponse = this.nullableCreditPaymentMethodAftInfoResponseAdapter.fromJson(jsonReader);
                    i &= -65;
                    break;
                case 7:
                    creditPaymentMethodWalletInfoResponse = this.nullableCreditPaymentMethodWalletInfoResponseAdapter.fromJson(jsonReader);
                    i &= -129;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -253) {
            CreditPaymentMethodWalletInfoResponse creditPaymentMethodWalletInfoResponse2 = creditPaymentMethodWalletInfoResponse;
            CreditPaymentMethodAftInfoResponse creditPaymentMethodAftInfoResponse2 = creditPaymentMethodAftInfoResponse;
            String str6 = str5;
            String str7 = str4;
            String str8 = str3;
            String str9 = str2;
            String str10 = str;
            CreditPaymentMethodTypeResponse creditPaymentMethodTypeResponse2 = creditPaymentMethodTypeResponse;
            if (creditPaymentMethodTypeResponse2 == null) {
                throw Util.missingProperty("paymentMethodType", "payment_method_type", jsonReader);
            }
            if (str10 != null) {
                return new CreditPaymentMethodResponse(creditPaymentMethodTypeResponse2, str10, str9, str8, str7, str6, creditPaymentMethodAftInfoResponse2, creditPaymentMethodWalletInfoResponse2);
            }
            throw Util.missingProperty("title", "title", jsonReader);
        }
        CreditPaymentMethodWalletInfoResponse creditPaymentMethodWalletInfoResponse3 = creditPaymentMethodWalletInfoResponse;
        CreditPaymentMethodAftInfoResponse creditPaymentMethodAftInfoResponse3 = creditPaymentMethodAftInfoResponse;
        String str11 = str5;
        String str12 = str4;
        String str13 = str3;
        String str14 = str2;
        String str15 = str;
        CreditPaymentMethodTypeResponse creditPaymentMethodTypeResponse3 = creditPaymentMethodTypeResponse;
        Constructor<CreditPaymentMethodResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CreditPaymentMethodResponse.class.getDeclaredConstructor(CreditPaymentMethodTypeResponse.class, String.class, String.class, String.class, String.class, String.class, CreditPaymentMethodAftInfoResponse.class, CreditPaymentMethodWalletInfoResponse.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        Constructor<CreditPaymentMethodResponse> constructor2 = constructor;
        if (creditPaymentMethodTypeResponse3 == null) {
            throw Util.missingProperty("paymentMethodType", "payment_method_type", jsonReader);
        }
        if (str15 != null) {
            return constructor2.newInstance(creditPaymentMethodTypeResponse3, str15, str14, str13, str12, str11, creditPaymentMethodAftInfoResponse3, creditPaymentMethodWalletInfoResponse3, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("title", "title", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CreditPaymentMethodResponse creditPaymentMethodResponse) {
        CreditPaymentMethodResponse creditPaymentMethodResponse2 = creditPaymentMethodResponse;
        if (creditPaymentMethodResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("payment_method_type");
        this.creditPaymentMethodTypeResponseAdapter.toJson(jsonWriter, (JsonWriter) creditPaymentMethodResponse2.getPaymentMethodType());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) creditPaymentMethodResponse2.getTitle());
        jsonWriter.name("payment_method_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditPaymentMethodResponse2.getPaymentMethodId());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditPaymentMethodResponse2.getDescription());
        jsonWriter.name("logo");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditPaymentMethodResponse2.getLogo());
        byte[] bArr = tje.f0;
        byte[] bArr2 = new byte[15];
        for (int i = 0; i < 15; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        jsonWriter.name(new String(bArr2, uza.a));
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditPaymentMethodResponse2.getYbSuggestId());
        jsonWriter.name("aft_info");
        this.nullableCreditPaymentMethodAftInfoResponseAdapter.toJson(jsonWriter, (JsonWriter) creditPaymentMethodResponse2.getAftInfo());
        jsonWriter.name("wallet_info");
        this.nullableCreditPaymentMethodWalletInfoResponseAdapter.toJson(jsonWriter, (JsonWriter) creditPaymentMethodResponse2.getWalletInfo());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(CreditPaymentMethodResponse)");
    }
}
