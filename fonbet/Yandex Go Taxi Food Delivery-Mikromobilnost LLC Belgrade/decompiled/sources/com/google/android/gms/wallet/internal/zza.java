package com.google.android.gms.wallet.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
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
import defpackage.ec91;

/* loaded from: classes11.dex */
public final class zza extends com.google.android.gms.internal.wallet.zza implements IOwService {
    public zza(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.internal.IOwService");
    }

    @Override // com.google.android.gms.wallet.internal.IOwService
    public final void changeMaskedWallet(String str, String str2, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        ec91.b(zza, bundle);
        ec91.c(zza, iWalletServiceCallbacks);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.wallet.internal.IOwService
    public final void checkForPreAuthorization(Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException {
        Parcel zza = zza();
        ec91.b(zza, bundle);
        ec91.c(zza, iWalletServiceCallbacks);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.wallet.internal.IOwService
    public final void createWalletObjects(CreateWalletObjectsRequest createWalletObjectsRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException {
        Parcel zza = zza();
        ec91.b(zza, createWalletObjectsRequest);
        ec91.b(zza, bundle);
        ec91.c(zza, iWalletServiceCallbacks);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.wallet.internal.IOwService
    public final void executeBuyFlow(ExecuteBuyFlowRequest executeBuyFlowRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException {
        Parcel zza = zza();
        ec91.b(zza, executeBuyFlowRequest);
        ec91.b(zza, bundle);
        ec91.c(zza, iWalletServiceCallbacks);
        zzc(16, zza);
    }

    @Override // com.google.android.gms.wallet.internal.IOwService
    public final void getBuyFlowInitializationToken(GetBuyFlowInitializationTokenRequest getBuyFlowInitializationTokenRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException {
        Parcel zza = zza();
        ec91.b(zza, getBuyFlowInitializationTokenRequest);
        ec91.b(zza, bundle);
        ec91.c(zza, iWalletServiceCallbacks);
        zzc(12, zza);
    }

    @Override // com.google.android.gms.wallet.internal.IOwService
    public final void getClientToken(GetClientTokenRequest getClientTokenRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException {
        Parcel zza = zza();
        ec91.b(zza, getClientTokenRequest);
        ec91.b(zza, bundle);
        ec91.c(zza, iWalletServiceCallbacks);
        zzc(15, zza);
    }

    @Override // com.google.android.gms.wallet.internal.IOwService
    public final void getFullWallet(FullWalletRequest fullWalletRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException {
        Parcel zza = zza();
        ec91.b(zza, fullWalletRequest);
        ec91.b(zza, bundle);
        ec91.c(zza, iWalletServiceCallbacks);
        zzc(2, zza);
    }

    @Override // com.google.android.gms.wallet.internal.IOwService
    public final void getInstrumentAvailability(Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException {
        Parcel zza = zza();
        ec91.b(zza, bundle);
        ec91.c(zza, iWalletServiceCallbacks);
        zzc(25, zza);
    }

    @Override // com.google.android.gms.wallet.internal.IOwService
    public final void getMaskedWalletForPreauthorizedBuyer(MaskedWalletRequest maskedWalletRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException {
        Parcel zza = zza();
        ec91.b(zza, maskedWalletRequest);
        ec91.b(zza, bundle);
        ec91.c(zza, iWalletServiceCallbacks);
        zzc(1, zza);
    }

    @Override // com.google.android.gms.wallet.internal.IOwService
    public final void getPaymentCardRecognitionIntent(PaymentCardRecognitionIntentRequest paymentCardRecognitionIntentRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException {
        Parcel zza = zza();
        ec91.b(zza, paymentCardRecognitionIntentRequest);
        ec91.b(zza, bundle);
        ec91.c(zza, iWalletServiceCallbacks);
        zzc(24, zza);
    }

    @Override // com.google.android.gms.wallet.internal.IOwService
    public final void getPaymentMetadata(PaymentMetadataRequest paymentMetadataRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException {
        Parcel zza = zza();
        ec91.b(zza, paymentMetadataRequest);
        ec91.b(zza, bundle);
        ec91.c(zza, iWalletServiceCallbacks);
        zzc(26, zza);
    }

    @Override // com.google.android.gms.wallet.internal.IOwService
    public final void getSaveInstrumentDetails(GetSaveInstrumentDetailsRequest getSaveInstrumentDetailsRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException {
        Parcel zza = zza();
        ec91.b(zza, getSaveInstrumentDetailsRequest);
        ec91.b(zza, bundle);
        ec91.c(zza, iWalletServiceCallbacks);
        zzc(20, zza);
    }

    @Override // com.google.android.gms.wallet.internal.IOwService
    public final void getSetupWizardIntent(GetSetupWizardIntentRequest getSetupWizardIntentRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException {
        Parcel zza = zza();
        ec91.b(zza, getSetupWizardIntentRequest);
        ec91.b(zza, bundle);
        ec91.c(zza, iWalletServiceCallbacks);
        zzc(23, zza);
    }

    @Override // com.google.android.gms.wallet.internal.IOwService
    public final void initializeBuyFlow(InitializeBuyFlowRequest initializeBuyFlowRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException {
        Parcel zza = zza();
        ec91.b(zza, initializeBuyFlowRequest);
        ec91.b(zza, bundle);
        ec91.c(zza, iWalletServiceCallbacks);
        zzc(13, zza);
    }

    @Override // com.google.android.gms.wallet.internal.IOwService
    public final void isNewUser(Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException {
        Parcel zza = zza();
        ec91.b(zza, bundle);
        ec91.c(zza, iWalletServiceCallbacks);
        zzc(11, zza);
    }

    @Override // com.google.android.gms.wallet.internal.IOwService
    public final void isReadyToPay(IsReadyToPayRequest isReadyToPayRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException {
        Parcel zza = zza();
        ec91.b(zza, isReadyToPayRequest);
        ec91.b(zza, bundle);
        ec91.c(zza, iWalletServiceCallbacks);
        zzc(14, zza);
    }

    @Override // com.google.android.gms.wallet.internal.IOwService
    public final void loadPaymentData(PaymentDataRequest paymentDataRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException {
        Parcel zza = zza();
        ec91.b(zza, paymentDataRequest);
        ec91.b(zza, bundle);
        ec91.c(zza, iWalletServiceCallbacks);
        zzc(19, zza);
    }

    @Override // com.google.android.gms.wallet.internal.IOwService
    public final void loadWebPaymentData(WebPaymentDataRequest webPaymentDataRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException {
        Parcel zza = zza();
        ec91.b(zza, webPaymentDataRequest);
        ec91.b(zza, bundle);
        ec91.c(zza, iWalletServiceCallbacks);
        zzc(17, zza);
    }

    @Override // com.google.android.gms.wallet.internal.IOwService
    public final void notifyTransactionStatus(NotifyTransactionStatusRequest notifyTransactionStatusRequest, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        ec91.b(zza, notifyTransactionStatusRequest);
        ec91.b(zza, bundle);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.wallet.internal.IOwService
    public final void saveInstrument(SaveInstrumentRequest saveInstrumentRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException {
        Parcel zza = zza();
        ec91.b(zza, saveInstrumentRequest);
        ec91.b(zza, bundle);
        ec91.c(zza, iWalletServiceCallbacks);
        zzc(18, zza);
    }

    @Override // com.google.android.gms.wallet.internal.IOwService
    public final void setUpBiometricAuthenticationKeys(SetUpBiometricAuthenticationKeysRequest setUpBiometricAuthenticationKeysRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException {
        Parcel zza = zza();
        ec91.b(zza, setUpBiometricAuthenticationKeysRequest);
        ec91.b(zza, bundle);
        ec91.c(zza, iWalletServiceCallbacks);
        zzc(21, zza);
    }

    @Override // com.google.android.gms.wallet.internal.IOwService
    public final void trackWalletFragmentButtonClicked(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        ec91.b(zza, bundle);
        zzc(10, zza);
    }

    @Override // com.google.android.gms.wallet.internal.IOwService
    public final void trackWalletFragmentButtonInitialized(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        ec91.b(zza, bundle);
        zzc(9, zza);
    }

    @Override // com.google.android.gms.wallet.internal.IOwService
    public final void warmUpUiProcess(WarmUpUiProcessRequest warmUpUiProcessRequest, Bundle bundle, IWalletServiceCallbacks iWalletServiceCallbacks) throws RemoteException {
        Parcel zza = zza();
        ec91.b(zza, warmUpUiProcessRequest);
        ec91.b(zza, bundle);
        ec91.c(zza, iWalletServiceCallbacks);
        zzc(22, zza);
    }
}
