package com.samsung.android.sdk.samsungpay.v2;

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
import com.samsung.android.sdk.samsungpay.v2.ISStatusListener;
import com.samsung.android.sdk.samsungpay.v2.PartnerRequest;
import com.samsung.android.sdk.samsungpay.v2.SpaySdk;
import defpackage.azl0;
import defpackage.nnm;
import defpackage.ny61;
import defpackage.r8u0;
import defpackage.zyl0;
import java.lang.ref.WeakReference;
import java.util.List;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes11.dex */
public abstract class SamsungPayBase extends SpaySdk {
    protected static String i = "SPAYSDK:SamsungPayBase";
    protected f<IInterface> f;
    protected String g;
    private Handler h;

    public class StatusListenerInternal {
        private WeakReference<PartnerRequest> a = null;
        private SpayStatusListener b = new SpayStatusListener();

        public class SpayStatusListener extends ISStatusListener.Stub {
            private SpayStatusListener() {
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.ISStatusListener.Stub, com.samsung.android.sdk.samsungpay.v2.ISStatusListener
            public void onFail(PartnerInfo partnerInfo, int i, Bundle bundle) throws RemoteException {
                nnm.q(i, "onFail: errorCode: ", "StatusListenerInternal");
                StatusListenerInternal statusListenerInternal = StatusListenerInternal.this;
                SamsungPayBase.this.A(statusListenerInternal.a, 1, i, bundle);
                SamsungPayBase.this.f.I();
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.ISStatusListener.Stub, com.samsung.android.sdk.samsungpay.v2.ISStatusListener
            public void onSuccess(PartnerInfo partnerInfo, int i, Bundle bundle) throws RemoteException {
                StatusListenerInternal statusListenerInternal = StatusListenerInternal.this;
                SamsungPayBase.this.A(statusListenerInternal.a, 0, i, bundle);
                SamsungPayBase.this.f.I();
            }
        }

        public StatusListenerInternal() {
        }

        public ISStatusListener b() {
            return this.b;
        }

        public void c(PartnerRequest partnerRequest) {
            this.a = new WeakReference<>(partnerRequest);
        }
    }

    public SamsungPayBase(Context context, PartnerInfo partnerInfo, String str) {
        super(context, partnerInfo);
        this.h = new Handler(Looper.getMainLooper()) { // from class: com.samsung.android.sdk.samsungpay.v2.SamsungPayBase.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i2 = message.what;
                if (i2 == 0) {
                    ((r8u0) message.obj).onSuccess(message.arg1, message.getData());
                    return;
                }
                if (i2 == 1) {
                    ((r8u0) message.obj).onFail(message.arg1, message.getData());
                } else {
                    if (i2 == 2 || i2 == 4) {
                        return;
                    }
                    Log.e(SamsungPayBase.i, "sdk can not catch listener from SPay.");
                }
            }
        };
        SpaySdk.c();
        if (!e(partnerInfo)) {
            ny61.t("Context and PartnerInfo.serviceId have to be set.");
            throw null;
        }
        this.f = n(context);
        this.g = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(WeakReference<PartnerRequest> weakReference, int i2, int i3, Bundle bundle) {
        PartnerRequest partnerRequest;
        if (weakReference == null || (partnerRequest = weakReference.get()) == null) {
            Log.e(i, "sendMsgForStatusListener - request is NULL");
            return;
        }
        Message obtain = Message.obtain(this.h);
        obtain.obj = partnerRequest.f;
        obtain.what = i2;
        obtain.arg1 = i3;
        obtain.setData(bundle);
        this.h.sendMessage(obtain);
    }

    private void o() {
        Intent intent = new Intent();
        Context context = this.b.get();
        if (context != null) {
            intent.setComponent(new ComponentName(this.g, context.getPackageManager().getLaunchIntentForPackage(this.g).getComponent().getClassName()));
            intent.setFlags(SelfTester_JCP.IMITA);
            intent.putExtra("activate_sp_from_sdk", true);
            context.startActivity(intent);
        } else {
            Log.e(i, "doActivateSamsungPay - Context is null");
        }
        this.f.I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(IInterface iInterface, PartnerRequest partnerRequest) throws RemoteException, ActivityNotFoundException, PackageManager.NameNotFoundException {
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(r8u0 r8u0Var, ErrorType errorType, int i2, Bundle bundle) {
        if (errorType == ErrorType.SPAY_VALIDITY_FAIL) {
            r8u0Var.onSuccess(i2, bundle);
        } else if (errorType == ErrorType.PARTNER_INFO_INVALID) {
            r8u0Var.onFail(-99, bundle);
        } else {
            r8u0Var.onFail(-103, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(IInterface iInterface, PartnerRequest partnerRequest) throws RemoteException, ActivityNotFoundException, PackageManager.NameNotFoundException {
        r();
    }

    public void m(SpaySdk.SdkApiLevel sdkApiLevel) {
        this.f.J(new PartnerRequest.a(this, 1, null).f("activateSamsungPay").c(false).e(new zyl0(this, 1)).b(), sdkApiLevel);
    }

    public abstract f<IInterface> n(Context context);

    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public abstract void w(IInterface iInterface, PartnerRequest partnerRequest) throws RemoteException;

    public abstract void q(IInterface iInterface, PartnerRequest partnerRequest) throws RemoteException;

    public abstract void r() throws PackageManager.NameNotFoundException;

    public void s(r8u0 r8u0Var, SpaySdk.SdkApiLevel sdkApiLevel) {
        a(r8u0Var);
        int i2 = 0;
        this.f.J(new PartnerRequest.a(this, 0, r8u0Var).f("getSamsungPayStatus").e(new zyl0(this, i2)).d(new azl0(r8u0Var, i2)).b(), sdkApiLevel);
    }

    public void t(List<String> list, r8u0 r8u0Var, SpaySdk.SdkApiLevel sdkApiLevel) {
        a(r8u0Var);
        a(list);
        StatusListenerInternal statusListenerInternal = new StatusListenerInternal();
        PartnerRequest b = new PartnerRequest.a(this, 2, r8u0Var).f("getWalletInfo").g(list).h(statusListenerInternal).e(new zyl0(this, 3)).d(new azl0(r8u0Var, 1)).b();
        this.f.J(b, sdkApiLevel);
        statusListenerInternal.c(b);
    }

    public void u(SpaySdk.SdkApiLevel sdkApiLevel) {
        this.f.J(new PartnerRequest.a(this, 3, null).f("goToUpdatePage").c(false).e(new zyl0(this, 2)).b(), sdkApiLevel);
    }
}
