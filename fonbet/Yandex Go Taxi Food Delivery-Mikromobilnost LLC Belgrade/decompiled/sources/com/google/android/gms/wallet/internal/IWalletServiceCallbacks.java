package com.google.android.gms.wallet.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
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
public interface IWalletServiceCallbacks extends IInterface {
    void onBiometricAuthenticationKeysSetUp(Status status, SetUpBiometricAuthenticationKeysResponse setUpBiometricAuthenticationKeysResponse, Bundle bundle) throws RemoteException;

    void onBuyFlowInitializationTokenReceived(Status status, GetBuyFlowInitializationTokenResponse getBuyFlowInitializationTokenResponse, Bundle bundle) throws RemoteException;

    void onClientTokenReceived(Status status, GetClientTokenResponse getClientTokenResponse, Bundle bundle) throws RemoteException;

    void onExecuteBuyFlowStatusReceived(Status status, Bundle bundle) throws RemoteException;

    void onFullWalletLoaded(int i, FullWallet fullWallet, Bundle bundle) throws RemoteException;

    void onGetInstrumentAvailabilityResponse(Status status, GetInstrumentAvailabilityResponse getInstrumentAvailabilityResponse, Bundle bundle) throws RemoteException;

    void onGetSaveInstrumentDetailsResponse(Status status, GetSaveInstrumentDetailsResponse getSaveInstrumentDetailsResponse, Bundle bundle) throws RemoteException;

    void onInitializeBuyFlowStatusReceived(Status status, Bundle bundle) throws RemoteException;

    void onIsNewUserDetermined(int i, boolean z, Bundle bundle) throws RemoteException;

    void onIsReadyToPayDetermined(Status status, boolean z, Bundle bundle) throws RemoteException;

    void onMaskedWalletLoaded(int i, MaskedWallet maskedWallet, Bundle bundle) throws RemoteException;

    void onPaymentCardRecognitionIntentResponseReceived(Status status, PaymentCardRecognitionIntentResponse paymentCardRecognitionIntentResponse, Bundle bundle) throws RemoteException;

    void onPaymentDataLoaded(Status status, PaymentData paymentData, Bundle bundle) throws RemoteException;

    void onPaymentMetadataLoaded(Status status, PaymentMetadata paymentMetadata, Bundle bundle) throws RemoteException;

    void onPreAuthorizationDetermined(int i, boolean z, Bundle bundle) throws RemoteException;

    void onSaveInstrumentStatusReceived(Status status, Bundle bundle) throws RemoteException;

    void onSetupWizardIntentReceived(int i, Bundle bundle) throws RemoteException;

    void onWalletObjectsCreated(int i, Bundle bundle) throws RemoteException;

    void onWarmUpUiProcessResponseReceived(Status status, WarmUpUiProcessResponse warmUpUiProcessResponse, Bundle bundle) throws RemoteException;

    void onWebPaymentDataLoaded(Status status, WebPaymentData webPaymentData, Bundle bundle) throws RemoteException;
}
