package com.samsung.android.sdk.samsungpay.v2.payment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.samsung.android.sdk.samsungpay.v2.SpaySdk;
import com.samsung.android.sdk.samsungpay.v2.payment.ISEncryptionKeyListener;
import com.samsung.android.sdk.samsungpay.v2.payment.ISMstPaymentListener;
import com.samsung.android.sdk.samsungpay.v2.payment.ISTransactionResultListener;
import defpackage.ec30;
import defpackage.nnm;
import java.util.Objects;

/* loaded from: classes11.dex */
public abstract class MstManager extends SpaySdk {

    /* renamed from: com.samsung.android.sdk.samsungpay.v2.payment.MstManager$1, reason: invalid class name */
    public class AnonymousClass1 extends Handler {
        final /* synthetic */ MstManager this$0;

        public AnonymousClass1(MstManager mstManager, Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                Log.e("SPAYSDK:MstManager", "[onSuccess] Wrong listener was called");
            } else if (i == 1) {
                Log.e("SPAYSDK:MstManager", "[onFail] Wrong listener was called");
            } else if (i != 4) {
                Log.e("SPAYSDK:MstManager", "sdk can not catch listener from SPay.");
            }
        }
    }

    /* renamed from: com.samsung.android.sdk.samsungpay.v2.payment.MstManager$2, reason: invalid class name */
    class AnonymousClass2 extends ISMstPaymentListener.Stub {
        final /* synthetic */ MstManager this$0;
        final /* synthetic */ ec30 val$listener;

        public AnonymousClass2(MstManager mstManager, ec30 ec30Var) {
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.payment.ISMstPaymentListener.Stub, com.samsung.android.sdk.samsungpay.v2.payment.ISMstPaymentListener
        public void onFail(int i, Bundle bundle) {
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.payment.ISMstPaymentListener.Stub, com.samsung.android.sdk.samsungpay.v2.payment.ISMstPaymentListener
        public void onSuccess(SpayResponseInfo spayResponseInfo) {
        }
    }

    public class EncryptionKeyListenerInternal {

        public class SpayEncryptionKeyListener extends ISEncryptionKeyListener.Stub {
            final /* synthetic */ EncryptionKeyListenerInternal this$1;

            private SpayEncryptionKeyListener(EncryptionKeyListenerInternal encryptionKeyListenerInternal) {
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.payment.ISEncryptionKeyListener.Stub, com.samsung.android.sdk.samsungpay.v2.payment.ISEncryptionKeyListener
            public void onFail(int i, Bundle bundle) throws RemoteException {
                nnm.q(i, "onFail: error: ", "EncryptionKeyListener");
                throw null;
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.payment.ISEncryptionKeyListener.Stub, com.samsung.android.sdk.samsungpay.v2.payment.ISEncryptionKeyListener
            public void onSuccess(SpayPublicKey spayPublicKey) throws RemoteException {
                Objects.toString(spayPublicKey);
                throw null;
            }

            public /* synthetic */ SpayEncryptionKeyListener(EncryptionKeyListenerInternal encryptionKeyListenerInternal, AnonymousClass1 anonymousClass1) {
                this(encryptionKeyListenerInternal);
            }
        }
    }

    public class MstPaymentListenerInternal {

        public class SpayMSTPaymentListenerInternal extends ISMstPaymentListener.Stub {
            final /* synthetic */ MstPaymentListenerInternal this$1;

            private SpayMSTPaymentListenerInternal(MstPaymentListenerInternal mstPaymentListenerInternal) {
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.payment.ISMstPaymentListener.Stub, com.samsung.android.sdk.samsungpay.v2.payment.ISMstPaymentListener
            public void onFail(int i, Bundle bundle) throws RemoteException {
                nnm.q(i, "onFail: error: ", "MstPaymentListener");
                throw null;
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.payment.ISMstPaymentListener.Stub, com.samsung.android.sdk.samsungpay.v2.payment.ISMstPaymentListener
            public void onSuccess(SpayResponseInfo spayResponseInfo) throws RemoteException {
                spayResponseInfo.getPayMstStatus();
                throw null;
            }

            public /* synthetic */ SpayMSTPaymentListenerInternal(MstPaymentListenerInternal mstPaymentListenerInternal, AnonymousClass1 anonymousClass1) {
                this(mstPaymentListenerInternal);
            }
        }
    }

    public class MstTransactionListenerInternal {

        public class SpayMstTransactionListenerInternal extends ISTransactionResultListener.Stub {
            final /* synthetic */ MstTransactionListenerInternal this$1;

            private SpayMstTransactionListenerInternal(MstTransactionListenerInternal mstTransactionListenerInternal) {
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.payment.ISTransactionResultListener.Stub, com.samsung.android.sdk.samsungpay.v2.payment.ISTransactionResultListener
            public void onFail(int i, Bundle bundle) throws RemoteException {
                nnm.q(i, "onFail: error: ", "TransactionResult");
                throw null;
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.payment.ISTransactionResultListener.Stub, com.samsung.android.sdk.samsungpay.v2.payment.ISTransactionResultListener
            public void onSuccess(Bundle bundle) throws RemoteException {
                Objects.toString(bundle);
                throw null;
            }

            public /* synthetic */ SpayMstTransactionListenerInternal(MstTransactionListenerInternal mstTransactionListenerInternal, AnonymousClass1 anonymousClass1) {
                this(mstTransactionListenerInternal);
            }
        }
    }
}
