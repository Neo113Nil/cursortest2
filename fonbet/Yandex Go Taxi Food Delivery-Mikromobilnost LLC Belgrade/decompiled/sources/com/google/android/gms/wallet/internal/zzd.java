package com.google.android.gms.wallet.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentResponse;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentMetadata;
import com.google.android.gms.wallet.WebPaymentData;
import com.google.android.gms.wallet.button.GetInstrumentAvailabilityResponse;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenResponse;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysResponse;
import com.google.android.gms.wallet.firstparty.WarmUpUiProcessResponse;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsResponse;

/* loaded from: classes11.dex */
public class zzd extends zzb {
    @Override // com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public void onBiometricAuthenticationKeysSetUp(Status status, SetUpBiometricAuthenticationKeysResponse setUpBiometricAuthenticationKeysResponse, Bundle bundle) {
    }

    @Override // com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public void onBuyFlowInitializationTokenReceived(Status status, GetBuyFlowInitializationTokenResponse getBuyFlowInitializationTokenResponse, Bundle bundle) {
    }

    @Override // com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public void onClientTokenReceived(Status status, GetClientTokenResponse getClientTokenResponse, Bundle bundle) {
    }

    @Override // com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public void onExecuteBuyFlowStatusReceived(Status status, Bundle bundle) {
    }

    @Override // com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public void onFullWalletLoaded(int i, FullWallet fullWallet, Bundle bundle) {
    }

    @Override // com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public final void onGetInstrumentAvailabilityResponse(Status status, GetInstrumentAvailabilityResponse getInstrumentAvailabilityResponse, Bundle bundle) {
    }

    @Override // com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public final void onGetSaveInstrumentDetailsResponse(Status status, GetSaveInstrumentDetailsResponse getSaveInstrumentDetailsResponse, Bundle bundle) {
    }

    @Override // com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public void onInitializeBuyFlowStatusReceived(Status status, Bundle bundle) {
    }

    @Override // com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public final void onIsNewUserDetermined(int i, boolean z, Bundle bundle) {
    }

    @Override // com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public void onIsReadyToPayDetermined(Status status, boolean z, Bundle bundle) {
    }

    @Override // com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public void onMaskedWalletLoaded(int i, MaskedWallet maskedWallet, Bundle bundle) {
    }

    @Override // com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public void onPaymentCardRecognitionIntentResponseReceived(Status status, PaymentCardRecognitionIntentResponse paymentCardRecognitionIntentResponse, Bundle bundle) {
    }

    @Override // com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public void onPaymentDataLoaded(Status status, PaymentData paymentData, Bundle bundle) {
    }

    @Override // com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public void onPaymentMetadataLoaded(Status status, PaymentMetadata paymentMetadata, Bundle bundle) {
    }

    @Override // com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public void onPreAuthorizationDetermined(int i, boolean z, Bundle bundle) {
    }

    @Override // com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public final void onSaveInstrumentStatusReceived(Status status, Bundle bundle) {
    }

    @Override // com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public void onSetupWizardIntentReceived(int i, Bundle bundle) {
    }

    @Override // com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public void onWalletObjectsCreated(int i, Bundle bundle) {
    }

    @Override // com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public void onWarmUpUiProcessResponseReceived(Status status, WarmUpUiProcessResponse warmUpUiProcessResponse, Bundle bundle) {
    }

    @Override // com.google.android.gms.wallet.internal.zzb, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public void onWebPaymentDataLoaded(Status status, WebPaymentData webPaymentData, Bundle bundle) {
    }
}
