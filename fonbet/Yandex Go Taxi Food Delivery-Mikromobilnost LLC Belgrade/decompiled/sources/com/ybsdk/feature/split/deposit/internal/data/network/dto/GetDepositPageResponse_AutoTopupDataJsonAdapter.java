package com.ybsdk.feature.split.deposit.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.split.deposit.internal.data.network.dto.GetDepositPageResponse;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse_AutoTopupDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$AutoTopupData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$AutoTopupData$PaymentMethodsBottomSheet;", "paymentMethodsBottomSheetAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$AutoTopupData$StatusScreen;", "statusScreenAdapter", "", "stringAdapter", "nullableStringAdapter", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$AutoTopupData$AutoTopupSettings;", "autoTopupSettingsAdapter", "Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/GetDepositPageResponse$AutoTopupData$WalletPaymentMethod;", "walletPaymentMethodAdapter", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetDepositPageResponse_AutoTopupDataJsonAdapter extends JsonAdapter<GetDepositPageResponse.AutoTopupData> {
    private final JsonAdapter<GetDepositPageResponse.AutoTopupData.AutoTopupSettings> autoTopupSettingsAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("payment_methods", "status_screen", "target_agreement_id", "external_member_confirmation_deeplink", "auto_topup_settings", "wallet_payment_method");
    private final JsonAdapter<GetDepositPageResponse.AutoTopupData.PaymentMethodsBottomSheet> paymentMethodsBottomSheetAdapter;
    private final JsonAdapter<GetDepositPageResponse.AutoTopupData.StatusScreen> statusScreenAdapter;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<GetDepositPageResponse.AutoTopupData.WalletPaymentMethod> walletPaymentMethodAdapter;

    public GetDepositPageResponse_AutoTopupDataJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.paymentMethodsBottomSheetAdapter = moshi.adapter(GetDepositPageResponse.AutoTopupData.PaymentMethodsBottomSheet.class, emptySet, "paymentMethodsBottomSheet");
        this.statusScreenAdapter = moshi.adapter(GetDepositPageResponse.AutoTopupData.StatusScreen.class, emptySet, "statusScreen");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "targetAgreementId");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "externalMemberConfirmationDeeplink");
        this.autoTopupSettingsAdapter = moshi.adapter(GetDepositPageResponse.AutoTopupData.AutoTopupSettings.class, emptySet, "autoTopupSettings");
        this.walletPaymentMethodAdapter = moshi.adapter(GetDepositPageResponse.AutoTopupData.WalletPaymentMethod.class, emptySet, "walletPaymentMethod");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetDepositPageResponse.AutoTopupData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        GetDepositPageResponse.AutoTopupData.PaymentMethodsBottomSheet paymentMethodsBottomSheet = null;
        GetDepositPageResponse.AutoTopupData.StatusScreen statusScreen = null;
        String str = null;
        String str2 = null;
        GetDepositPageResponse.AutoTopupData.AutoTopupSettings autoTopupSettings = null;
        GetDepositPageResponse.AutoTopupData.WalletPaymentMethod walletPaymentMethod = null;
        while (true) {
            GetDepositPageResponse.AutoTopupData.PaymentMethodsBottomSheet paymentMethodsBottomSheet2 = paymentMethodsBottomSheet;
            GetDepositPageResponse.AutoTopupData.StatusScreen statusScreen2 = statusScreen;
            if (!jsonReader.hasNext()) {
                String str3 = str;
                jsonReader.endObject();
                if (paymentMethodsBottomSheet2 == null) {
                    throw Util.missingProperty("paymentMethodsBottomSheet", "payment_methods", jsonReader);
                }
                if (statusScreen2 == null) {
                    throw Util.missingProperty("statusScreen", "status_screen", jsonReader);
                }
                if (str3 == null) {
                    throw Util.missingProperty("targetAgreementId", "target_agreement_id", jsonReader);
                }
                if (autoTopupSettings == null) {
                    throw Util.missingProperty("autoTopupSettings", "auto_topup_settings", jsonReader);
                }
                if (walletPaymentMethod != null) {
                    return new GetDepositPageResponse.AutoTopupData(paymentMethodsBottomSheet2, statusScreen2, str3, str2, autoTopupSettings, walletPaymentMethod);
                }
                throw Util.missingProperty("walletPaymentMethod", "wallet_payment_method", jsonReader);
            }
            String str4 = str;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str = str4;
                    paymentMethodsBottomSheet = paymentMethodsBottomSheet2;
                    statusScreen = statusScreen2;
                case 0:
                    paymentMethodsBottomSheet = this.paymentMethodsBottomSheetAdapter.fromJson(jsonReader);
                    if (paymentMethodsBottomSheet == null) {
                        throw Util.unexpectedNull("paymentMethodsBottomSheet", "payment_methods", jsonReader);
                    }
                    str = str4;
                    statusScreen = statusScreen2;
                case 1:
                    statusScreen = this.statusScreenAdapter.fromJson(jsonReader);
                    if (statusScreen == null) {
                        throw Util.unexpectedNull("statusScreen", "status_screen", jsonReader);
                    }
                    str = str4;
                    paymentMethodsBottomSheet = paymentMethodsBottomSheet2;
                case 2:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("targetAgreementId", "target_agreement_id", jsonReader);
                    }
                    paymentMethodsBottomSheet = paymentMethodsBottomSheet2;
                    statusScreen = statusScreen2;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    str = str4;
                    paymentMethodsBottomSheet = paymentMethodsBottomSheet2;
                    statusScreen = statusScreen2;
                case 4:
                    autoTopupSettings = this.autoTopupSettingsAdapter.fromJson(jsonReader);
                    if (autoTopupSettings == null) {
                        throw Util.unexpectedNull("autoTopupSettings", "auto_topup_settings", jsonReader);
                    }
                    str = str4;
                    paymentMethodsBottomSheet = paymentMethodsBottomSheet2;
                    statusScreen = statusScreen2;
                case 5:
                    walletPaymentMethod = this.walletPaymentMethodAdapter.fromJson(jsonReader);
                    if (walletPaymentMethod == null) {
                        throw Util.unexpectedNull("walletPaymentMethod", "wallet_payment_method", jsonReader);
                    }
                    str = str4;
                    paymentMethodsBottomSheet = paymentMethodsBottomSheet2;
                    statusScreen = statusScreen2;
                default:
                    str = str4;
                    paymentMethodsBottomSheet = paymentMethodsBottomSheet2;
                    statusScreen = statusScreen2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetDepositPageResponse.AutoTopupData autoTopupData) {
        GetDepositPageResponse.AutoTopupData autoTopupData2 = autoTopupData;
        if (autoTopupData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("payment_methods");
        this.paymentMethodsBottomSheetAdapter.toJson(jsonWriter, (JsonWriter) autoTopupData2.getPaymentMethodsBottomSheet());
        jsonWriter.name("status_screen");
        this.statusScreenAdapter.toJson(jsonWriter, (JsonWriter) autoTopupData2.getStatusScreen());
        jsonWriter.name("target_agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) autoTopupData2.getTargetAgreementId());
        jsonWriter.name("external_member_confirmation_deeplink");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) autoTopupData2.getExternalMemberConfirmationDeeplink());
        jsonWriter.name("auto_topup_settings");
        this.autoTopupSettingsAdapter.toJson(jsonWriter, (JsonWriter) autoTopupData2.getAutoTopupSettings());
        jsonWriter.name("wallet_payment_method");
        this.walletPaymentMethodAdapter.toJson(jsonWriter, (JsonWriter) autoTopupData2.getWalletPaymentMethod());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(58, "GeneratedJsonAdapter(GetDepositPageResponse.AutoTopupData)");
    }
}
