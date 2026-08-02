package com.samsung.android.sdk.samsungpay.v2.payment;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.samsung.android.sdk.samsungpay.v2.ISStatusListener;
import com.samsung.android.sdk.samsungpay.v2.PartnerInfo;
import com.samsung.android.sdk.samsungpay.v2.PartnerRequest;
import com.samsung.android.sdk.samsungpay.v2.SpaySdk;
import com.samsung.android.sdk.samsungpay.v2.payment.CustomSheetPaymentInfo;
import com.samsung.android.sdk.samsungpay.v2.payment.ISGetCardBrandListener;
import com.samsung.android.sdk.samsungpay.v2.payment.ISPaymentCallback;
import com.samsung.android.sdk.samsungpay.v2.payment.sheet.AddressControl;
import com.samsung.android.sdk.samsungpay.v2.payment.sheet.CustomSheet;
import com.samsung.android.sdk.samsungpay.v2.payment.sheet.SheetControl;
import com.samsung.android.sdk.samsungpay.v2.payment.sheet.SheetItemType;
import com.samsung.android.sdk.samsungpay.v2.payment.sheet.SpinnerControl;
import com.samsung.android.sdk.samsungpay.v2.service.ISUserInfoCallback;
import defpackage.ln21;
import defpackage.nnm;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.r8u0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class PaymentManager extends SpaySdk {

    /* renamed from: com.samsung.android.sdk.samsungpay.v2.payment.PaymentManager$1, reason: invalid class name */
    public class AnonymousClass1 extends Handler {
        final /* synthetic */ PaymentManager this$0;

        public AnonymousClass1(PaymentManager paymentManager, Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            PartnerRequest partnerRequest = (PartnerRequest) message.obj;
            switch (message.what) {
                case 101:
                    Bundle data = message.getData();
                    if (partnerRequest.f != null) {
                        ny61.u();
                        return;
                    } else {
                        data.getString("EncryptedData");
                        throw null;
                    }
                case 102:
                case 110:
                    PaymentManager.h(null, message);
                    PaymentManager.g(null);
                    return;
                case 103:
                    Bundle data2 = message.getData();
                    if (partnerRequest.f != null) {
                        ny61.u();
                        return;
                    } else {
                        throw null;
                    }
                case 104:
                    throw oyr.d(partnerRequest.f);
                case 105:
                    PaymentManager.i(null, partnerRequest, message.arg1);
                    return;
                case 106:
                    Bundle data3 = message.getData();
                    String string = data3.getString("updatedControlId");
                    SheetControl sheetControl = ((CustomSheet) data3.get("customSheet")).getSheetControl(string);
                    CustomSheetPaymentInfo customSheetPaymentInfo = (CustomSheetPaymentInfo) partnerRequest.c;
                    if (sheetControl != null) {
                        int i = a.c[sheetControl.getControltype().ordinal()];
                        if (i == 1) {
                            AddressControl addressControl = (AddressControl) customSheetPaymentInfo.getCustomSheet().getSheetControl(string);
                            if (addressControl != null) {
                                addressControl.getSheetUpdatedListener();
                                return;
                            }
                            return;
                        }
                        if (i != 2) {
                            Log.e("SPAYSDK:PaymentManager", "MSG_PAYMENT_SHEET_UPDATED : controlType is not matched.");
                            return;
                        }
                        SpinnerControl spinnerControl = (SpinnerControl) customSheetPaymentInfo.getCustomSheet().getSheetControl(string);
                        if (spinnerControl != null) {
                            spinnerControl.getSheetUpdatedListener();
                            return;
                        }
                        return;
                    }
                    return;
                case HProv.PP_SET_PIN /* 107 */:
                default:
                    return;
                case 108:
                    Bundle data4 = message.getData();
                    throw oyr.d(partnerRequest.f);
                case 109:
                    Bundle data5 = message.getData();
                    if (partnerRequest.f != null) {
                        ny61.u();
                        return;
                    }
                    data5.getString("EncryptedData");
                    throw null;
            }
        }
    }

    /* renamed from: com.samsung.android.sdk.samsungpay.v2.payment.PaymentManager$2, reason: invalid class name */
    public class AnonymousClass2 extends Handler {
        final /* synthetic */ PaymentManager this$0;

        public AnonymousClass2(PaymentManager paymentManager, Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((r8u0) message.obj).onSuccess(message.arg1, message.getData());
            } else if (i == 1) {
                ((r8u0) message.obj).onFail(message.arg1, message.getData());
            } else if (i != 2) {
                Log.e("SPAYSDK:PaymentManager", "sdk can not catch listener from SPay.");
            }
        }
    }

    public class InAppPaymentCallback extends ISPaymentCallback.Stub {
        private WeakReference<PartnerRequest> pReqRef;
        final /* synthetic */ PaymentManager this$0;

        public InAppPaymentCallback(PaymentManager paymentManager, PartnerRequest partnerRequest) {
            this.pReqRef = new WeakReference<>(partnerRequest);
        }

        private PartnerRequest getRequest() {
            PartnerRequest partnerRequest = this.pReqRef.get();
            if (partnerRequest == null) {
                Log.e("SPAYSDK:PaymentManager", "InAppPaymentCallback - request is NULL");
            }
            return partnerRequest;
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.payment.ISPaymentCallback.Stub, com.samsung.android.sdk.samsungpay.v2.payment.ISPaymentCallback
        public void onAddressInfoChanged(PaymentInfo paymentInfo) {
            PartnerRequest request = getRequest();
            if (request != null) {
                Message message = new Message();
                message.what = 103;
                Bundle bundle = new Bundle();
                bundle.putParcelable("PaymentInfo", paymentInfo);
                message.setData(bundle);
                message.obj = request;
                PaymentManager.j(null).sendMessage(message);
            }
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.payment.ISPaymentCallback.Stub, com.samsung.android.sdk.samsungpay.v2.payment.ISPaymentCallback
        public void onApproveTransaction(PaymentInfo paymentInfo, String str) {
            PartnerRequest request = getRequest();
            if (request != null) {
                Message message = new Message();
                message.what = 101;
                Bundle bundle = new Bundle();
                bundle.putParcelable("PaymentInfo", paymentInfo);
                bundle.putString("EncryptedData", str);
                message.setData(bundle);
                message.obj = request;
                PaymentManager.j(null).sendMessage(message);
            }
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.payment.ISPaymentCallback.Stub, com.samsung.android.sdk.samsungpay.v2.payment.ISPaymentCallback
        public void onCardInfoChanged(CardInfo cardInfo) {
            PartnerRequest request = getRequest();
            if (request != null) {
                request.e = cardInfo;
                Message message = new Message();
                message.what = 104;
                message.obj = request;
                PaymentManager.j(null).sendMessage(message);
            }
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.payment.ISPaymentCallback.Stub, com.samsung.android.sdk.samsungpay.v2.payment.ISPaymentCallback
        public void onCustomSheetCardInfoUpdated(CardInfo cardInfo, CustomSheet customSheet) {
            PartnerRequest request = getRequest();
            if (request != null) {
                Message message = new Message();
                message.what = 108;
                Bundle bundle = new Bundle();
                bundle.putParcelable("updatedCard", cardInfo);
                bundle.putParcelable("customSheet", customSheet);
                message.setData(bundle);
                message.obj = request;
                PaymentManager.j(null).sendMessage(message);
            }
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.payment.ISPaymentCallback.Stub, com.samsung.android.sdk.samsungpay.v2.payment.ISPaymentCallback
        public void onCustomSheetTransactionApproved(String str, Bundle bundle, CustomSheetPaymentInfo customSheetPaymentInfo) {
            PartnerRequest request = getRequest();
            if (request != null) {
                Message message = new Message();
                message.what = 109;
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("customSheetPaymentInfo", customSheetPaymentInfo);
                bundle2.putString("EncryptedData", str);
                bundle2.putParcelable("extraData", bundle);
                message.setData(bundle2);
                message.obj = request;
                PaymentManager.j(null).sendMessage(message);
            }
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.payment.ISPaymentCallback.Stub, com.samsung.android.sdk.samsungpay.v2.payment.ISPaymentCallback
        public void onCustomSheetUpdated(String str, CustomSheet customSheet) {
            PartnerRequest request = getRequest();
            if (request != null) {
                Message message = new Message();
                message.what = 106;
                Bundle bundle = new Bundle();
                bundle.putString("updatedControlId", str);
                bundle.putParcelable("customSheet", customSheet);
                message.setData(bundle);
                message.obj = request;
                PaymentManager.j(null).sendMessage(message);
            }
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.payment.ISPaymentCallback.Stub, com.samsung.android.sdk.samsungpay.v2.payment.ISPaymentCallback
        public void onFailPayment(int i, String str) {
            nnm.q(i, "onFailPayment: errCode ", "SPAYSDK:PaymentManager");
            PartnerRequest request = getRequest();
            if (request != null) {
                PaymentManager.k(null, i, request);
            }
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.payment.ISPaymentCallback.Stub, com.samsung.android.sdk.samsungpay.v2.payment.ISPaymentCallback
        public void onFailPaymentForCustomSheet(int i, Bundle bundle) {
            nnm.q(i, "onFailPaymentForCustomSheet: errCode ", "SPAYSDK:PaymentManager");
            PartnerRequest request = getRequest();
            if (request != null) {
                PaymentManager.l(null, i, bundle, request);
            }
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.payment.ISPaymentCallback.Stub, com.samsung.android.sdk.samsungpay.v2.payment.ISPaymentCallback
        public void onInitiateCompleted(Bundle bundle) {
            PartnerRequest request = getRequest();
            if (request != null) {
                request.e = new ComponentName(bundle.getString("packageName"), bundle.getString("className"));
                int i = bundle.getInt("callerUid");
                Message message = new Message();
                message.what = 105;
                message.obj = request;
                message.arg1 = i;
                PaymentManager.j(null).sendMessage(message);
            }
        }
    }

    public class InAppUserInfoCallback extends ISUserInfoCallback.Stub {
        private WeakReference<ln21> listenerRef;
        final /* synthetic */ PaymentManager this$0;

        public InAppUserInfoCallback(PaymentManager paymentManager, ln21 ln21Var) {
            this.listenerRef = new WeakReference<>(ln21Var);
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.service.ISUserInfoCallback.Stub, com.samsung.android.sdk.samsungpay.v2.service.ISUserInfoCallback
        public void onGetUserInfoInitiated(Bundle bundle) {
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.service.ISUserInfoCallback.Stub, com.samsung.android.sdk.samsungpay.v2.service.ISUserInfoCallback
        public void onReceived(int i, Bundle bundle) {
            if (this.listenerRef.get() == null) {
                return;
            }
            ny61.u();
        }
    }

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[SheetControl.Controltype.values().length];
            c = iArr;
            try {
                iArr[SheetControl.Controltype.ADDRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[SheetControl.Controltype.SPINNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[SheetItemType.values().length];
            b = iArr2;
            try {
                iArr2[SheetItemType.SHIPPING_ADDRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[SheetItemType.BILLING_ADDRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[CustomSheetPaymentInfo.AddressInPaymentSheet.values().length];
            a = iArr3;
            try {
                iArr3[CustomSheetPaymentInfo.AddressInPaymentSheet.SEND_SHIPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[CustomSheetPaymentInfo.AddressInPaymentSheet.NEED_BILLING_SEND_SHIPPING.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[CustomSheetPaymentInfo.AddressInPaymentSheet.NEED_SHIPPING_SPAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[CustomSheetPaymentInfo.AddressInPaymentSheet.NEED_BILLING_AND_SHIPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[CustomSheetPaymentInfo.AddressInPaymentSheet.NEED_BILLING_SPAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static /* synthetic */ void g(PaymentManager paymentManager) {
        throw null;
    }

    public static /* synthetic */ void h(PaymentManager paymentManager, Message message) {
        throw null;
    }

    public static /* synthetic */ void i(PaymentManager paymentManager, PartnerRequest partnerRequest, int i) {
        throw null;
    }

    public static /* synthetic */ Handler j(PaymentManager paymentManager) {
        throw null;
    }

    public static /* synthetic */ void k(PaymentManager paymentManager, int i, PartnerRequest partnerRequest) {
        throw null;
    }

    public static /* synthetic */ void l(PaymentManager paymentManager, int i, Bundle bundle, PartnerRequest partnerRequest) {
        throw null;
    }

    public class GetCardBrandListenerInternal {

        public class SpayBrandListener extends ISGetCardBrandListener.Stub {
            final /* synthetic */ GetCardBrandListenerInternal this$1;

            private SpayBrandListener(GetCardBrandListenerInternal getCardBrandListenerInternal) {
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.payment.ISGetCardBrandListener.Stub, com.samsung.android.sdk.samsungpay.v2.payment.ISGetCardBrandListener
            public void onFail(int i, Bundle bundle) throws RemoteException {
                throw null;
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.payment.ISGetCardBrandListener.Stub, com.samsung.android.sdk.samsungpay.v2.payment.ISGetCardBrandListener
            public void onProcess() {
                throw null;
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.payment.ISGetCardBrandListener.Stub, com.samsung.android.sdk.samsungpay.v2.payment.ISGetCardBrandListener
            public void onSuccess(List<CardInfo> list) throws RemoteException {
                new Bundle().putParcelableArrayList("KEY_FOR_MESSAGE", (ArrayList) list);
                throw null;
            }

            public /* synthetic */ SpayBrandListener(GetCardBrandListenerInternal getCardBrandListenerInternal, AnonymousClass1 anonymousClass1) {
                this(getCardBrandListenerInternal);
            }
        }
    }

    public class SpayStatusListener extends ISStatusListener.Stub {
        private static final String TAG = "SpayStatusListener";
        private WeakReference<r8u0> partnerListenerRef;
        final /* synthetic */ PaymentManager this$0;

        private SpayStatusListener(PaymentManager paymentManager) {
            this.partnerListenerRef = null;
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.ISStatusListener.Stub, com.samsung.android.sdk.samsungpay.v2.ISStatusListener
        public void onFail(PartnerInfo partnerInfo, int i, Bundle bundle) throws RemoteException {
            nnm.q(i, "onFail: errorCode: ", TAG);
            throw null;
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.ISStatusListener.Stub, com.samsung.android.sdk.samsungpay.v2.ISStatusListener
        public void onSuccess(PartnerInfo partnerInfo, int i, Bundle bundle) throws RemoteException {
            throw null;
        }

        public void setPartnerListenerRef(r8u0 r8u0Var) {
            this.partnerListenerRef = new WeakReference<>(r8u0Var);
        }

        public /* synthetic */ SpayStatusListener(PaymentManager paymentManager, AnonymousClass1 anonymousClass1) {
            this(paymentManager);
        }
    }
}
