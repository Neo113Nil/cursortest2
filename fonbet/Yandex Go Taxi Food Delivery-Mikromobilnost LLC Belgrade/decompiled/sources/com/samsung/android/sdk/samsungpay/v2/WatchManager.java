package com.samsung.android.sdk.samsungpay.v2;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.samsung.android.sdk.samsungpay.v2.card.Card;
import com.samsung.android.sdk.samsungpay.v2.card.ISAddCardListener;
import com.samsung.android.sdk.samsungpay.v2.card.ISGetCardListener;
import defpackage.czl0;
import defpackage.g4t;
import defpackage.nnm;
import defpackage.r8u0;
import defpackage.t90;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class WatchManager extends SamsungPayBase {

    /* renamed from: com.samsung.android.sdk.samsungpay.v2.WatchManager$1, reason: invalid class name */
    public class AnonymousClass1 extends Handler {
        final /* synthetic */ WatchManager this$0;

        public AnonymousClass1(WatchManager watchManager, Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                Object obj = message.obj;
                if (obj instanceof g4t) {
                    ((czl0) ((g4t) obj)).b(WatchManager.B(null));
                    return;
                } else if (obj instanceof r8u0) {
                    ((r8u0) obj).onSuccess(message.arg1, message.getData());
                    return;
                } else if (!(obj instanceof t90)) {
                    Log.e(SamsungPayBase.i, "[onSuccess] Wrong listener was called");
                    return;
                } else {
                    ((com.ybsdk.feature.card.internal.samsungpay.b) ((t90) obj)).b(message.arg1, WatchManager.C(null));
                    return;
                }
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        Log.e(SamsungPayBase.i, "sdk can not catch listener from SPay.");
                        return;
                    }
                    return;
                } else {
                    Object obj2 = message.obj;
                    if (!(obj2 instanceof t90)) {
                        Log.e(SamsungPayBase.i, "[onProgress] Wrong listener was called");
                        return;
                    } else {
                        message.getData();
                        ((t90) obj2).getClass();
                        return;
                    }
                }
            }
            Object obj3 = message.obj;
            if (obj3 instanceof g4t) {
                ((czl0) ((g4t) obj3)).a(message.arg1, message.getData());
            } else if (obj3 instanceof r8u0) {
                ((r8u0) obj3).onFail(message.arg1, message.getData());
            } else if (!(obj3 instanceof t90)) {
                Log.e(SamsungPayBase.i, "[onFail] Wrong listener was called");
            } else {
                ((com.ybsdk.feature.card.internal.samsungpay.b) ((t90) obj3)).a(message.arg1, message.getData());
            }
        }
    }

    public static /* synthetic */ List B(WatchManager watchManager) {
        throw null;
    }

    public static /* synthetic */ Card C(WatchManager watchManager) {
        throw null;
    }

    public class AddCardInfoListenerInternal {
        public static /* synthetic */ String a(AddCardInfoListenerInternal addCardInfoListenerInternal) {
            throw null;
        }

        public class SpayAddCardListener extends ISAddCardListener.Stub {
            final /* synthetic */ AddCardInfoListenerInternal this$1;

            private SpayAddCardListener(AddCardInfoListenerInternal addCardInfoListenerInternal) {
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.card.ISAddCardListener.Stub, com.samsung.android.sdk.samsungpay.v2.card.ISAddCardListener
            public void onFail(int i, Bundle bundle) throws RemoteException {
                nnm.q(i, "onFail: errorCode: ", AddCardInfoListenerInternal.a(null));
                throw null;
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.card.ISAddCardListener.Stub, com.samsung.android.sdk.samsungpay.v2.card.ISAddCardListener
            public void onProgress(int i, int i2, Bundle bundle) {
                Log.e(AddCardInfoListenerInternal.a(null), "onNotifyProgress: currentCount: " + i + ", totalCount : " + i2);
                throw null;
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.card.ISAddCardListener.Stub, com.samsung.android.sdk.samsungpay.v2.card.ISAddCardListener
            public void onSuccess(int i, Card card) throws RemoteException {
                AddCardInfoListenerInternal.a(null);
                throw null;
            }

            public /* synthetic */ SpayAddCardListener(AddCardInfoListenerInternal addCardInfoListenerInternal, AnonymousClass1 anonymousClass1) {
                this(addCardInfoListenerInternal);
            }
        }
    }

    public class GetCardListenerInternal {
        public static /* synthetic */ String a(GetCardListenerInternal getCardListenerInternal) {
            throw null;
        }

        public class SpayCardListener extends ISGetCardListener.Stub {
            final /* synthetic */ GetCardListenerInternal this$1;

            private SpayCardListener(GetCardListenerInternal getCardListenerInternal) {
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.card.ISGetCardListener.Stub, com.samsung.android.sdk.samsungpay.v2.card.ISGetCardListener
            public void onFail(PartnerInfo partnerInfo, int i, Bundle bundle) throws RemoteException {
                GetCardListenerInternal.a(null);
                throw null;
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.card.ISGetCardListener.Stub, com.samsung.android.sdk.samsungpay.v2.card.ISGetCardListener
            public void onSuccess(PartnerInfo partnerInfo, List<Card> list) throws RemoteException {
                GetCardListenerInternal.a(null);
                throw null;
            }

            public /* synthetic */ SpayCardListener(GetCardListenerInternal getCardListenerInternal, AnonymousClass1 anonymousClass1) {
                this(getCardListenerInternal);
            }
        }
    }
}
