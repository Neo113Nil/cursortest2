package com.samsung.android.sdk.samsungpay.v2.card;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.samsung.android.sdk.samsungpay.v2.ErrorType;
import com.samsung.android.sdk.samsungpay.v2.ISStatusListener;
import com.samsung.android.sdk.samsungpay.v2.PartnerInfo;
import com.samsung.android.sdk.samsungpay.v2.PartnerRequest;
import com.samsung.android.sdk.samsungpay.v2.SpaySdk;
import com.samsung.android.sdk.samsungpay.v2.card.ISAddCardListener;
import com.samsung.android.sdk.samsungpay.v2.card.ISGetCardListener;
import com.samsung.android.sdk.samsungpay.v2.card.ISInitiateSessionCallback;
import com.samsung.android.sdk.samsungpay.v2.f;
import com.ybsdk.feature.card.internal.samsungpay.b;
import defpackage.czl0;
import defpackage.e48;
import defpackage.g4t;
import defpackage.nnm;
import defpackage.ny61;
import defpackage.r8u0;
import defpackage.t90;
import defpackage.vm7;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes11.dex */
public final class CardManager extends SpaySdk {
    private f<ISCardManager> f;
    protected Handler g;
    private final Handler h;

    public class AddCardInfoListenerInternal extends a {
        private SpayAddCardListener b;

        public class SpayAddCardListener extends ISAddCardListener.Stub {
            private SpayAddCardListener() {
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.card.ISAddCardListener.Stub, com.samsung.android.sdk.samsungpay.v2.card.ISAddCardListener
            public void onFail(int i, Bundle bundle) throws RemoteException {
                if (AddCardInfoListenerInternal.this.a("AddCardInfoInternal onFail")) {
                    nnm.q(i, "onFail: errorCode: ", "AddCardInfoInternal");
                    AddCardInfoListenerInternal addCardInfoListenerInternal = AddCardInfoListenerInternal.this;
                    CardManager.this.s(addCardInfoListenerInternal.a, 1, i, 0, bundle);
                    CardManager.this.f.I();
                }
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.card.ISAddCardListener.Stub, com.samsung.android.sdk.samsungpay.v2.card.ISAddCardListener
            public void onProgress(int i, int i2, Bundle bundle) {
                if (AddCardInfoListenerInternal.this.a("AddCardInfoInternal onProgress")) {
                    Log.e("AddCardInfoInternal", "onProgress: currentCount: " + i + ", totalCount : " + i2);
                    AddCardInfoListenerInternal addCardInfoListenerInternal = AddCardInfoListenerInternal.this;
                    CardManager.this.s(addCardInfoListenerInternal.a, 2, i, i2, bundle);
                }
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.card.ISAddCardListener.Stub, com.samsung.android.sdk.samsungpay.v2.card.ISAddCardListener
            public void onSuccess(int i, Card card) throws RemoteException {
                Bundle bundle = new Bundle();
                bundle.putParcelable("KEY_FOR_MESSAGE", card);
                AddCardInfoListenerInternal addCardInfoListenerInternal = AddCardInfoListenerInternal.this;
                CardManager.this.s(addCardInfoListenerInternal.a, 0, i, 0, bundle);
                CardManager.this.f.I();
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private AddCardInfoListenerInternal() {
            super();
            this.b = new SpayAddCardListener();
        }

        public ISAddCardListener c() {
            return this.b;
        }
    }

    public class GetCardListenerInternal extends a {
        private SpayCardListener b;

        public class SpayCardListener extends ISGetCardListener.Stub {
            private SpayCardListener() {
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.card.ISGetCardListener.Stub, com.samsung.android.sdk.samsungpay.v2.card.ISGetCardListener
            public void onFail(PartnerInfo partnerInfo, int i, Bundle bundle) throws RemoteException {
                if (GetCardListenerInternal.this.a("GetCardListenerInternal onFail")) {
                    GetCardListenerInternal getCardListenerInternal = GetCardListenerInternal.this;
                    CardManager.this.t(getCardListenerInternal.a, 1, i, bundle);
                    CardManager.this.f.I();
                }
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.card.ISGetCardListener.Stub, com.samsung.android.sdk.samsungpay.v2.card.ISGetCardListener
            public void onSuccess(PartnerInfo partnerInfo, List<Card> list) throws RemoteException {
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("KEY_FOR_MESSAGE", (ArrayList) list);
                GetCardListenerInternal getCardListenerInternal = GetCardListenerInternal.this;
                CardManager.this.t(getCardListenerInternal.a, 0, 0, bundle);
                CardManager.this.f.I();
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private GetCardListenerInternal() {
            super();
            this.b = new SpayCardListener();
        }

        public ISGetCardListener c() {
            if (this.b == null) {
                this.b = new SpayCardListener();
            }
            return this.b;
        }
    }

    public class StatusListenerInternal extends a {

        public class SpayStatusListener extends ISStatusListener.Stub {
            final /* synthetic */ StatusListenerInternal this$1;

            private SpayStatusListener(StatusListenerInternal statusListenerInternal) {
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.ISStatusListener.Stub, com.samsung.android.sdk.samsungpay.v2.ISStatusListener
            public void onFail(PartnerInfo partnerInfo, int i, Bundle bundle) throws RemoteException {
                throw null;
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.ISStatusListener.Stub, com.samsung.android.sdk.samsungpay.v2.ISStatusListener
            public void onSuccess(PartnerInfo partnerInfo, int i, Bundle bundle) throws RemoteException {
                throw null;
            }
        }
    }

    public class UpdateServiceSessionCallback extends a {

        public class InitiateSessionCallback extends ISInitiateSessionCallback.Stub {
            final /* synthetic */ UpdateServiceSessionCallback this$1;

            private InitiateSessionCallback(UpdateServiceSessionCallback updateServiceSessionCallback) {
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.card.ISInitiateSessionCallback.Stub, com.samsung.android.sdk.samsungpay.v2.card.ISInitiateSessionCallback
            public void onAuthenticationApproved(int i, Bundle bundle) {
                Log.e("UpdateServiceCallback", "onAuthenticationApproved: errorData " + bundle);
                Message message = new Message();
                message.what = 0;
                Bundle bundle2 = new Bundle(bundle);
                message.obj = null;
                message.arg1 = i;
                message.setData(bundle2);
                throw null;
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.card.ISInitiateSessionCallback.Stub, com.samsung.android.sdk.samsungpay.v2.card.ISInitiateSessionCallback
            public void onSessionCompleted(Bundle bundle) {
                UpdateServiceSessionCallback.e(null, new ComponentName(bundle.getString("packageName"), bundle.getString("className")));
                int i = bundle.getInt("callerUid");
                Message message = new Message();
                message.what = 3;
                message.obj = null;
                message.arg1 = i;
                throw null;
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.card.ISInitiateSessionCallback.Stub, com.samsung.android.sdk.samsungpay.v2.card.ISInitiateSessionCallback
            public void onSessionFailed(int i, Bundle bundle) {
                throw null;
            }
        }

        public static /* synthetic */ WeakReference c(UpdateServiceSessionCallback updateServiceSessionCallback) {
            throw null;
        }

        public static /* synthetic */ ComponentName d(UpdateServiceSessionCallback updateServiceSessionCallback) {
            throw null;
        }

        public static /* synthetic */ ComponentName e(UpdateServiceSessionCallback updateServiceSessionCallback, ComponentName componentName) {
            throw null;
        }
    }

    public static abstract class a {
        protected WeakReference<PartnerRequest> a;

        private a() {
            this.a = null;
        }

        public boolean a(String str) {
            WeakReference<PartnerRequest> weakReference = this.a;
            if (weakReference != null && weakReference.get() != null && !this.a.get().o) {
                return true;
            }
            Log.e("SPAYSDK:CardManager", str + ": Request is cancelled or invalid");
            return false;
        }

        public void b(PartnerRequest partnerRequest) {
            this.a = new WeakReference<>(partnerRequest);
        }
    }

    public CardManager(Context context, PartnerInfo partnerInfo) {
        super(context, partnerInfo);
        this.g = new Handler(Looper.getMainLooper()) { // from class: com.samsung.android.sdk.samsungpay.v2.card.CardManager.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 0) {
                    Object obj = message.obj;
                    if (obj instanceof g4t) {
                        ((czl0) ((g4t) obj)).b(message.getData().getParcelableArrayList("KEY_FOR_MESSAGE"));
                        return;
                    } else if (obj instanceof r8u0) {
                        ((r8u0) obj).onSuccess(message.arg1, message.getData());
                        return;
                    } else if (!(obj instanceof t90)) {
                        Log.e("SPAYSDK:CardManager", "[onSuccess] Wrong listener was called");
                        return;
                    } else {
                        ((b) ((t90) obj)).b(message.arg1, (Card) message.getData().getParcelable("KEY_FOR_MESSAGE"));
                        return;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 4) {
                            Log.e("SPAYSDK:CardManager", "sdk can not catch listener from SPay.");
                            return;
                        }
                        return;
                    } else {
                        Object obj2 = message.obj;
                        if (!(obj2 instanceof t90)) {
                            Log.e("SPAYSDK:CardManager", "[onProgress] Wrong listener was called");
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
                    Log.e("SPAYSDK:CardManager", "[onFail] Wrong listener was called");
                } else {
                    ((b) ((t90) obj3)).a(message.arg1, message.getData());
                }
            }
        };
        this.h = new Handler(Looper.getMainLooper()) { // from class: com.samsung.android.sdk.samsungpay.v2.card.CardManager.2
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.obj != null) {
                    ny61.u();
                    return;
                }
                if (UpdateServiceSessionCallback.c(null).get() != null) {
                    ny61.u();
                    return;
                }
                int i = message.what;
                if (i == 0 || i == 1 || i != 3) {
                    return;
                }
                CardManager.this.u(null, message.arg1);
            }
        };
        this.f = new f.c().a(context, "com.samsung.android.spay.sdk.v2.service.AppToAppService", new vm7(14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(AddCardInfo addCardInfo, AddCardInfoListenerInternal addCardInfoListenerInternal, IInterface iInterface, PartnerRequest partnerRequest) throws RemoteException, ActivityNotFoundException, PackageManager.NameNotFoundException {
        ((ISCardManager) iInterface).addCard(b(), addCardInfo, addCardInfoListenerInternal.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(t90 t90Var, ErrorType errorType, int i, Bundle bundle) {
        ((b) t90Var).a(i, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(Bundle bundle, GetCardListenerInternal getCardListenerInternal, IInterface iInterface, PartnerRequest partnerRequest) throws RemoteException, ActivityNotFoundException, PackageManager.NameNotFoundException {
        ((ISCardManager) iInterface).getAllCards(b(), bundle, getCardListenerInternal.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(g4t g4tVar, ErrorType errorType, int i, Bundle bundle) {
        ((czl0) g4tVar).a(i, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(UpdateServiceSessionCallback updateServiceSessionCallback, int i) {
        Context context = this.b.get();
        if (context == null) {
            Log.e("SPAYSDK:CardManager", "showUpdateServiceSheet - Context is destroyed");
            return;
        }
        try {
            Intent intent = new Intent();
            if (context instanceof Activity) {
                intent.setFlags(536870912);
            } else {
                intent.setFlags(SelfTester_JCP.IMITA);
            }
            intent.setComponent(UpdateServiceSessionCallback.d(updateServiceSessionCallback));
            intent.putExtra("callerUid", i);
            intent.putExtra("sdkVersion", 2);
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Log.e("SPAYSDK:CardManager", "activity not found and return error");
            if (UpdateServiceSessionCallback.c(updateServiceSessionCallback).get() == null) {
                return;
            }
            ny61.u();
        }
    }

    public void m(AddCardInfo addCardInfo, t90 t90Var) {
        a(t90Var);
        a(addCardInfo);
        a(addCardInfo.getTokenizationProvider());
        a(addCardInfo.getCardDetail());
        a(addCardInfo.getCardDetail().getString(AddCardInfo.EXTRA_PROVISION_PAYLOAD));
        AddCardInfoListenerInternal addCardInfoListenerInternal = new AddCardInfoListenerInternal();
        PartnerRequest b = new PartnerRequest.a(this, 2, t90Var).f("addCard").a(addCardInfo).e(new com.samsung.android.sdk.samsungpay.v2.card.a(this, addCardInfo, addCardInfoListenerInternal, 1)).d(new e48(8, t90Var)).b();
        addCardInfoListenerInternal.b(b);
        this.f.J(b, SpaySdk.SdkApiLevel.LEVEL_1_2);
    }

    public void n(Bundle bundle, g4t g4tVar) {
        a(g4tVar);
        if (bundle == null) {
            bundle = new Bundle();
        }
        GetCardListenerInternal getCardListenerInternal = new GetCardListenerInternal();
        PartnerRequest b = new PartnerRequest.a(this, 1, g4tVar).f("getAllCards").e(new com.samsung.android.sdk.samsungpay.v2.card.a(this, bundle, getCardListenerInternal, 0)).d(new e48(7, g4tVar)).b();
        getCardListenerInternal.b(b);
        this.f.J(b, SpaySdk.SdkApiLevel.LEVEL_2_15);
    }

    public void s(WeakReference<PartnerRequest> weakReference, int i, int i2, int i3, Bundle bundle) {
        PartnerRequest partnerRequest;
        if (weakReference == null || (partnerRequest = weakReference.get()) == null) {
            return;
        }
        Message obtain = Message.obtain(this.g);
        obtain.obj = partnerRequest.f;
        obtain.what = i;
        obtain.arg1 = i2;
        obtain.setData(bundle);
        if (i == 2) {
            obtain.arg2 = i3;
        }
        this.g.sendMessage(obtain);
    }

    public void t(WeakReference<PartnerRequest> weakReference, int i, int i2, Bundle bundle) {
        PartnerRequest partnerRequest;
        if (weakReference == null || (partnerRequest = weakReference.get()) == null) {
            return;
        }
        Message obtain = Message.obtain(this.g);
        obtain.obj = partnerRequest.f;
        obtain.what = i;
        obtain.setData(bundle);
        if (i == 1) {
            obtain.arg1 = i2;
        }
        this.g.sendMessage(obtain);
    }
}
