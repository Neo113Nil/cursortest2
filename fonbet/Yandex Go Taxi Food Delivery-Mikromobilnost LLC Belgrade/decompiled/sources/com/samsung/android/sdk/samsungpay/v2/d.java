package com.samsung.android.sdk.samsungpay.v2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.samsung.android.sdk.samsungpay.v2.SamsungPayBase;
import com.samsung.android.sdk.samsungpay.v2.SpaySdk;
import com.samsung.android.sdk.samsungpay.v2.f;
import defpackage.d7g0;
import defpackage.r8u0;
import java.util.List;

/* loaded from: classes11.dex */
public final class d extends SamsungPayBase {
    public d(Context context, PartnerInfo partnerInfo) {
        super(context, partnerInfo, "com.samsung.android.spay");
        SamsungPayBase.i = "SPAYSDK:SamsungPay";
    }

    public void B() {
        super.m(SpaySdk.SdkApiLevel.LEVEL_1_1);
    }

    public void C(r8u0 r8u0Var) {
        super.s(r8u0Var, SpaySdk.e);
    }

    public void D(List<String> list, r8u0 r8u0Var) {
        super.t(list, r8u0Var, SpaySdk.SdkApiLevel.LEVEL_1_2);
    }

    public void E() {
        super.u(SpaySdk.SdkApiLevel.LEVEL_1_2);
    }

    @Override // com.samsung.android.sdk.samsungpay.v2.SamsungPayBase
    public f<IInterface> n(Context context) {
        return new f.c().a(context, "com.samsung.android.spay.sdk.v2.service.CommonAppService", new d7g0(18));
    }

    @Override // com.samsung.android.sdk.samsungpay.v2.SamsungPayBase
    /* renamed from: p */
    public void w(IInterface iInterface, PartnerRequest partnerRequest) throws RemoteException {
        Status samsungPayStatus = ((ISSamsungPay) iInterface).getSamsungPayStatus(b());
        if (samsungPayStatus != null) {
            int status = samsungPayStatus.getStatus();
            if (status == 0 || status == 1 || status == 2 || status == 3) {
                ((r8u0) partnerRequest.f).onSuccess(status, samsungPayStatus.getData());
            } else {
                ((r8u0) partnerRequest.f).onFail(status, samsungPayStatus.getData());
            }
        }
        this.f.I();
    }

    @Override // com.samsung.android.sdk.samsungpay.v2.SamsungPayBase
    public void q(IInterface iInterface, PartnerRequest partnerRequest) throws RemoteException {
        SamsungPayBase.StatusListenerInternal statusListenerInternal = (SamsungPayBase.StatusListenerInternal) partnerRequest.d;
        ((ISSamsungPay) iInterface).getWalletInfo(b(), (List) partnerRequest.c, statusListenerInternal.b());
    }

    @Override // com.samsung.android.sdk.samsungpay.v2.SamsungPayBase
    public void r() throws PackageManager.NameNotFoundException {
        Context context = this.b.get();
        if (context != null) {
            int i = context.getPackageManager().getPackageInfo(this.g, 0).versionCode / AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength;
            Intent intent = new Intent();
            if (i >= 2100) {
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse("samsungpay://launch?action=aboutsamsungpay"));
            } else {
                intent.setComponent(new ComponentName(this.g, context.getPackageManager().getLaunchIntentForPackage(this.g).getComponent().getClassName()));
            }
            intent.addFlags(268468224);
            context.startActivity(intent);
        } else {
            Log.e(SamsungPayBase.i, "doGoToUpdatePage - Context is null");
        }
        this.f.I();
    }
}
