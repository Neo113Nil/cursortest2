package com.ybsdk.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.network.dto.WalletsInfoResponse;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/network/dto/WalletsInfoResponse_WalletInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/WalletsInfoResponse$WalletInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "nullableThemesOfStringAdapter", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/Money;", "nullableMoneyAdapter", "Lcom/ybsdk/network/dto/WalletInfoAction;", "nullableWalletInfoActionAdapter", "Lcom/ybsdk/network/dto/PaymentMethodProductType;", "nullablePaymentMethodProductTypeAdapter", "Lcom/ybsdk/network/dto/AutoTopupInfo;", "nullableAutoTopupInfoAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WalletsInfoResponse_WalletInfoJsonAdapter extends JsonAdapter<WalletsInfoResponse.WalletInfo> {
    private final JsonAdapter<AutoTopupInfo> nullableAutoTopupInfoAdapter;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonAdapter<PaymentMethodProductType> nullablePaymentMethodProductTypeAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonAdapter<WalletInfoAction> nullableWalletInfoActionAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "subtitle", "image", "themed_image", "payment_method_id", "balance", "logo", "themed_logo", "manage_button", CreateApplicationWithProductJsonAdapter.productKey, "auto_topup", "auto_fund");
    private final JsonAdapter<String> stringAdapter;

    public WalletsInfoResponse_WalletInfoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "themedImage");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "paymentMethodId");
        this.nullableMoneyAdapter = moshi.adapter(Money.class, emptySet, "balance");
        this.nullableWalletInfoActionAdapter = moshi.adapter(WalletInfoAction.class, emptySet, "action");
        this.nullablePaymentMethodProductTypeAdapter = moshi.adapter(PaymentMethodProductType.class, emptySet, "productType");
        this.nullableAutoTopupInfoAdapter = moshi.adapter(AutoTopupInfo.class, emptySet, "autoTopupInfo");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final WalletsInfoResponse.WalletInfo fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        Themes<String> themes = null;
        String str4 = null;
        Money money = null;
        String str5 = null;
        Themes<String> themes2 = null;
        WalletInfoAction walletInfoAction = null;
        PaymentMethodProductType paymentMethodProductType = null;
        AutoTopupInfo autoTopupInfo = null;
        AutoTopupInfo autoTopupInfo2 = null;
        while (true) {
            String str6 = str;
            if (!jsonReader.hasNext()) {
                String str7 = str2;
                jsonReader.endObject();
                if (str6 == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (str7 == null) {
                    throw Util.missingProperty("subtitle", "subtitle", jsonReader);
                }
                if (str3 != null) {
                    return new WalletsInfoResponse.WalletInfo(str6, str7, str3, themes, str4, money, str5, themes2, walletInfoAction, paymentMethodProductType, autoTopupInfo, autoTopupInfo2);
                }
                throw Util.missingProperty("image", "image", jsonReader);
            }
            String str8 = str2;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str2 = str8;
                    str = str6;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    str2 = str8;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("subtitle", "subtitle", jsonReader);
                    }
                    str = str6;
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("image", "image", jsonReader);
                    }
                    str2 = str8;
                    str = str6;
                case 3:
                    themes = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    str2 = str8;
                    str = str6;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    str2 = str8;
                    str = str6;
                case 5:
                    money = this.nullableMoneyAdapter.fromJson(jsonReader);
                    str2 = str8;
                    str = str6;
                case 6:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    str2 = str8;
                    str = str6;
                case 7:
                    themes2 = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    str2 = str8;
                    str = str6;
                case 8:
                    walletInfoAction = this.nullableWalletInfoActionAdapter.fromJson(jsonReader);
                    str2 = str8;
                    str = str6;
                case 9:
                    paymentMethodProductType = this.nullablePaymentMethodProductTypeAdapter.fromJson(jsonReader);
                    str2 = str8;
                    str = str6;
                case 10:
                    autoTopupInfo = this.nullableAutoTopupInfoAdapter.fromJson(jsonReader);
                    str2 = str8;
                    str = str6;
                case 11:
                    autoTopupInfo2 = this.nullableAutoTopupInfoAdapter.fromJson(jsonReader);
                    str2 = str8;
                    str = str6;
                default:
                    str2 = str8;
                    str = str6;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, WalletsInfoResponse.WalletInfo walletInfo) {
        WalletsInfoResponse.WalletInfo walletInfo2 = walletInfo;
        if (walletInfo2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) walletInfo2.getTitle());
        jsonWriter.name("subtitle");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) walletInfo2.getSubtitle());
        jsonWriter.name("image");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) walletInfo2.getImage());
        jsonWriter.name("themed_image");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) walletInfo2.getThemedImage());
        jsonWriter.name("payment_method_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) walletInfo2.getPaymentMethodId());
        jsonWriter.name("balance");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) walletInfo2.getBalance());
        jsonWriter.name("logo");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) walletInfo2.getLogo());
        jsonWriter.name("themed_logo");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) walletInfo2.getThemedLogo());
        jsonWriter.name("manage_button");
        this.nullableWalletInfoActionAdapter.toJson(jsonWriter, (JsonWriter) walletInfo2.getAction());
        jsonWriter.name(CreateApplicationWithProductJsonAdapter.productKey);
        this.nullablePaymentMethodProductTypeAdapter.toJson(jsonWriter, (JsonWriter) walletInfo2.getProductType());
        jsonWriter.name("auto_topup");
        this.nullableAutoTopupInfoAdapter.toJson(jsonWriter, (JsonWriter) walletInfo2.getAutoTopupInfo());
        jsonWriter.name("auto_fund");
        this.nullableAutoTopupInfoAdapter.toJson(jsonWriter, (JsonWriter) walletInfo2.getAutoFundInfo());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(52, "GeneratedJsonAdapter(WalletsInfoResponse.WalletInfo)");
    }
}
