package com.google.android.gms.wallet.internal;

import android.os.Bundle;
import android.os.Parcel;
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
import defpackage.ec91;

/* loaded from: classes11.dex */
public abstract class zzb extends com.google.android.gms.internal.wallet.zzb implements IWalletServiceCallbacks {
    public zzb() {
        super("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    }

    @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public abstract /* synthetic */ void onBiometricAuthenticationKeysSetUp(Status status, SetUpBiometricAuthenticationKeysResponse setUpBiometricAuthenticationKeysResponse, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public abstract /* synthetic */ void onBuyFlowInitializationTokenReceived(Status status, GetBuyFlowInitializationTokenResponse getBuyFlowInitializationTokenResponse, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public abstract /* synthetic */ void onClientTokenReceived(Status status, GetClientTokenResponse getClientTokenResponse, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public abstract /* synthetic */ void onExecuteBuyFlowStatusReceived(Status status, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public abstract /* synthetic */ void onFullWalletLoaded(int i, FullWallet fullWallet, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public abstract /* synthetic */ void onGetInstrumentAvailabilityResponse(Status status, GetInstrumentAvailabilityResponse getInstrumentAvailabilityResponse, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public abstract /* synthetic */ void onGetSaveInstrumentDetailsResponse(Status status, GetSaveInstrumentDetailsResponse getSaveInstrumentDetailsResponse, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public abstract /* synthetic */ void onInitializeBuyFlowStatusReceived(Status status, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public abstract /* synthetic */ void onIsNewUserDetermined(int i, boolean z, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public abstract /* synthetic */ void onIsReadyToPayDetermined(Status status, boolean z, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public abstract /* synthetic */ void onMaskedWalletLoaded(int i, MaskedWallet maskedWallet, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public abstract /* synthetic */ void onPaymentCardRecognitionIntentResponseReceived(Status status, PaymentCardRecognitionIntentResponse paymentCardRecognitionIntentResponse, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public abstract /* synthetic */ void onPaymentDataLoaded(Status status, PaymentData paymentData, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public abstract /* synthetic */ void onPaymentMetadataLoaded(Status status, PaymentMetadata paymentMetadata, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public abstract /* synthetic */ void onPreAuthorizationDetermined(int i, boolean z, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public abstract /* synthetic */ void onSaveInstrumentStatusReceived(Status status, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public abstract /* synthetic */ void onSetupWizardIntentReceived(int i, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public abstract /* synthetic */ void onWalletObjectsCreated(int i, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public abstract /* synthetic */ void onWarmUpUiProcessResponseReceived(Status status, WarmUpUiProcessResponse warmUpUiProcessResponse, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public abstract /* synthetic */ void onWebPaymentDataLoaded(Status status, WebPaymentData webPaymentData, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.internal.wallet.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean z;
        switch (i) {
            case 1:
                int readInt = parcel.readInt();
                MaskedWallet maskedWallet = (MaskedWallet) ec91.a(parcel, MaskedWallet.CREATOR);
                Bundle bundle = (Bundle) ec91.a(parcel, Bundle.CREATOR);
                ec91.d(parcel);
                onMaskedWalletLoaded(readInt, maskedWallet, bundle);
                return true;
            case 2:
                int readInt2 = parcel.readInt();
                FullWallet fullWallet = (FullWallet) ec91.a(parcel, FullWallet.CREATOR);
                Bundle bundle2 = (Bundle) ec91.a(parcel, Bundle.CREATOR);
                ec91.d(parcel);
                onFullWalletLoaded(readInt2, fullWallet, bundle2);
                return true;
            case 3:
                int readInt3 = parcel.readInt();
                int i3 = ec91.a;
                z = parcel.readInt() != 0;
                Bundle bundle3 = (Bundle) ec91.a(parcel, Bundle.CREATOR);
                ec91.d(parcel);
                onPreAuthorizationDetermined(readInt3, z, bundle3);
                return true;
            case 4:
                int readInt4 = parcel.readInt();
                Bundle bundle4 = (Bundle) ec91.a(parcel, Bundle.CREATOR);
                ec91.d(parcel);
                onWalletObjectsCreated(readInt4, bundle4);
                return true;
            case 5:
            default:
                return false;
            case 6:
                int readInt5 = parcel.readInt();
                int i4 = ec91.a;
                z = parcel.readInt() != 0;
                Bundle bundle5 = (Bundle) ec91.a(parcel, Bundle.CREATOR);
                ec91.d(parcel);
                onIsNewUserDetermined(readInt5, z, bundle5);
                return true;
            case 7:
                Status status = (Status) ec91.a(parcel, Status.CREATOR);
                GetBuyFlowInitializationTokenResponse getBuyFlowInitializationTokenResponse = (GetBuyFlowInitializationTokenResponse) ec91.a(parcel, GetBuyFlowInitializationTokenResponse.CREATOR);
                Bundle bundle6 = (Bundle) ec91.a(parcel, Bundle.CREATOR);
                ec91.d(parcel);
                onBuyFlowInitializationTokenReceived(status, getBuyFlowInitializationTokenResponse, bundle6);
                return true;
            case 8:
                Status status2 = (Status) ec91.a(parcel, Status.CREATOR);
                Bundle bundle7 = (Bundle) ec91.a(parcel, Bundle.CREATOR);
                ec91.d(parcel);
                onInitializeBuyFlowStatusReceived(status2, bundle7);
                return true;
            case 9:
                Status status3 = (Status) ec91.a(parcel, Status.CREATOR);
                z = parcel.readInt() != 0;
                Bundle bundle8 = (Bundle) ec91.a(parcel, Bundle.CREATOR);
                ec91.d(parcel);
                onIsReadyToPayDetermined(status3, z, bundle8);
                return true;
            case 10:
                Status status4 = (Status) ec91.a(parcel, Status.CREATOR);
                GetClientTokenResponse getClientTokenResponse = (GetClientTokenResponse) ec91.a(parcel, GetClientTokenResponse.CREATOR);
                Bundle bundle9 = (Bundle) ec91.a(parcel, Bundle.CREATOR);
                ec91.d(parcel);
                onClientTokenReceived(status4, getClientTokenResponse, bundle9);
                return true;
            case 11:
                Status status5 = (Status) ec91.a(parcel, Status.CREATOR);
                Bundle bundle10 = (Bundle) ec91.a(parcel, Bundle.CREATOR);
                ec91.d(parcel);
                onExecuteBuyFlowStatusReceived(status5, bundle10);
                return true;
            case 12:
                Status status6 = (Status) ec91.a(parcel, Status.CREATOR);
                WebPaymentData webPaymentData = (WebPaymentData) ec91.a(parcel, WebPaymentData.CREATOR);
                Bundle bundle11 = (Bundle) ec91.a(parcel, Bundle.CREATOR);
                ec91.d(parcel);
                onWebPaymentDataLoaded(status6, webPaymentData, bundle11);
                return true;
            case 13:
                Status status7 = (Status) ec91.a(parcel, Status.CREATOR);
                Bundle bundle12 = (Bundle) ec91.a(parcel, Bundle.CREATOR);
                ec91.d(parcel);
                onSaveInstrumentStatusReceived(status7, bundle12);
                return true;
            case 14:
                Status status8 = (Status) ec91.a(parcel, Status.CREATOR);
                PaymentData paymentData = (PaymentData) ec91.a(parcel, PaymentData.CREATOR);
                Bundle bundle13 = (Bundle) ec91.a(parcel, Bundle.CREATOR);
                ec91.d(parcel);
                onPaymentDataLoaded(status8, paymentData, bundle13);
                return true;
            case 15:
                Status status9 = (Status) ec91.a(parcel, Status.CREATOR);
                GetSaveInstrumentDetailsResponse getSaveInstrumentDetailsResponse = (GetSaveInstrumentDetailsResponse) ec91.a(parcel, GetSaveInstrumentDetailsResponse.CREATOR);
                Bundle bundle14 = (Bundle) ec91.a(parcel, Bundle.CREATOR);
                ec91.d(parcel);
                onGetSaveInstrumentDetailsResponse(status9, getSaveInstrumentDetailsResponse, bundle14);
                return true;
            case 16:
                Status status10 = (Status) ec91.a(parcel, Status.CREATOR);
                SetUpBiometricAuthenticationKeysResponse setUpBiometricAuthenticationKeysResponse = (SetUpBiometricAuthenticationKeysResponse) ec91.a(parcel, SetUpBiometricAuthenticationKeysResponse.CREATOR);
                Bundle bundle15 = (Bundle) ec91.a(parcel, Bundle.CREATOR);
                ec91.d(parcel);
                onBiometricAuthenticationKeysSetUp(status10, setUpBiometricAuthenticationKeysResponse, bundle15);
                return true;
            case 17:
                Status status11 = (Status) ec91.a(parcel, Status.CREATOR);
                WarmUpUiProcessResponse warmUpUiProcessResponse = (WarmUpUiProcessResponse) ec91.a(parcel, WarmUpUiProcessResponse.CREATOR);
                Bundle bundle16 = (Bundle) ec91.a(parcel, Bundle.CREATOR);
                ec91.d(parcel);
                onWarmUpUiProcessResponseReceived(status11, warmUpUiProcessResponse, bundle16);
                return true;
            case 18:
                int readInt6 = parcel.readInt();
                Bundle bundle17 = (Bundle) ec91.a(parcel, Bundle.CREATOR);
                ec91.d(parcel);
                onSetupWizardIntentReceived(readInt6, bundle17);
                return true;
            case 19:
                Status status12 = (Status) ec91.a(parcel, Status.CREATOR);
                PaymentCardRecognitionIntentResponse paymentCardRecognitionIntentResponse = (PaymentCardRecognitionIntentResponse) ec91.a(parcel, PaymentCardRecognitionIntentResponse.CREATOR);
                Bundle bundle18 = (Bundle) ec91.a(parcel, Bundle.CREATOR);
                ec91.d(parcel);
                onPaymentCardRecognitionIntentResponseReceived(status12, paymentCardRecognitionIntentResponse, bundle18);
                return true;
            case 20:
                Status status13 = (Status) ec91.a(parcel, Status.CREATOR);
                GetInstrumentAvailabilityResponse getInstrumentAvailabilityResponse = (GetInstrumentAvailabilityResponse) ec91.a(parcel, GetInstrumentAvailabilityResponse.CREATOR);
                Bundle bundle19 = (Bundle) ec91.a(parcel, Bundle.CREATOR);
                ec91.d(parcel);
                onGetInstrumentAvailabilityResponse(status13, getInstrumentAvailabilityResponse, bundle19);
                return true;
            case 21:
                Status status14 = (Status) ec91.a(parcel, Status.CREATOR);
                PaymentMetadata paymentMetadata = (PaymentMetadata) ec91.a(parcel, PaymentMetadata.CREATOR);
                Bundle bundle20 = (Bundle) ec91.a(parcel, Bundle.CREATOR);
                ec91.d(parcel);
                onPaymentMetadataLoaded(status14, paymentMetadata, bundle20);
                return true;
        }
    }
}
