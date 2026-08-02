package com.google.android.gms.wallet.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentRequest;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentMetadataRequest;
import com.google.android.gms.wallet.WebPaymentDataRequest;
import com.google.android.gms.wallet.firstparty.ExecuteBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenRequest;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.InitializeBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysRequest;
import com.google.android.gms.wallet.firstparty.WarmUpUiProcessRequest;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsRequest;
import com.google.android.gms.wallet.firstparty.saveinstrument.SaveInstrumentRequest;
import com.google.android.gms.wallet.firstparty.setupwizard.GetSetupWizardIntentRequest;

/* loaded from: classes11.dex */
public interface IOwService extends IInterface {
    void changeMaskedWallet(String str, String str2, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException;

    void checkForPreAuthorization(Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException;

    void createWalletObjects(CreateWalletObjectsRequest createWalletObjectsRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException;

    void executeBuyFlow(ExecuteBuyFlowRequest executeBuyFlowRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException;

    void getBuyFlowInitializationToken(GetBuyFlowInitializationTokenRequest getBuyFlowInitializationTokenRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException;

    void getClientToken(GetClientTokenRequest getClientTokenRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException;

    void getFullWallet(FullWalletRequest fullWalletRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException;

    void getInstrumentAvailability(Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException;

    void getMaskedWalletForPreauthorizedBuyer(MaskedWalletRequest maskedWalletRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException;

    void getPaymentCardRecognitionIntent(PaymentCardRecognitionIntentRequest paymentCardRecognitionIntentRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException;

    void getPaymentMetadata(PaymentMetadataRequest paymentMetadataRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException;

    void getSaveInstrumentDetails(GetSaveInstrumentDetailsRequest getSaveInstrumentDetailsRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException;

    void getSetupWizardIntent(GetSetupWizardIntentRequest getSetupWizardIntentRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException;

    void initializeBuyFlow(InitializeBuyFlowRequest initializeBuyFlowRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException;

    void isNewUser(Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException;

    void isReadyToPay(IsReadyToPayRequest isReadyToPayRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException;

    void loadPaymentData(PaymentDataRequest paymentDataRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException;

    void loadWebPaymentData(WebPaymentDataRequest webPaymentDataRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException;

    void notifyTransactionStatus(NotifyTransactionStatusRequest notifyTransactionStatusRequest, Bundle bundle) throws RemoteException;

    void saveInstrument(SaveInstrumentRequest saveInstrumentRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException;

    void setUpBiometricAuthenticationKeys(SetUpBiometricAuthenticationKeysRequest setUpBiometricAuthenticationKeysRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException;

    void trackWalletFragmentButtonClicked(Bundle bundle) throws RemoteException;

    void trackWalletFragmentButtonInitialized(Bundle bundle) throws RemoteException;

    void warmUpUiProcess(WarmUpUiProcessRequest warmUpUiProcessRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException;
}
