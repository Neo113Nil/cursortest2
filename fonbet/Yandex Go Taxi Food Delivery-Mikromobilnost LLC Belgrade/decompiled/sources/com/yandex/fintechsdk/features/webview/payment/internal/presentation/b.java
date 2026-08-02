package com.yandex.fintechsdk.features.webview.payment.internal.presentation;

import android.content.Context;
import android.net.Uri;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.fintechsdk.entities.region.Region;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.pay.payment.Metadata;
import com.yandex.pay.payment.OrderId;
import com.yandex.pay.payment.YPayResult;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.abe;
import defpackage.cvu0;
import defpackage.dn90;
import defpackage.fs41;
import defpackage.hk3;
import defpackage.hn90;
import defpackage.i0k0;
import defpackage.ji41;
import defpackage.kju0;
import defpackage.mh5;
import defpackage.mp41;
import defpackage.nr41;
import defpackage.p370;
import defpackage.pzt0;
import defpackage.qk3;
import defpackage.w13;
import defpackage.wc5;
import defpackage.xk3;
import defpackage.yxf0;
import defpackage.z22;
import defpackage.zn90;

/* loaded from: classes12.dex */
public final class b extends wc5 {
    public final p370 A;
    public final Region B;
    public final yxf0 C;
    public final i0k0 D;
    public final abe E;
    public final ji41 F;
    public final mh5 G;
    public final nr41 H;
    public final com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.webviewpayment.data.a I;
    public final mp41 J;
    public pzt0 K;
    public pzt0 L;
    public final z22 c;
    public final hk3 w;
    public final DefaultEnvironment x;
    public final dn90 y;
    public final zn90 z;

    public b(z22 z22Var, hk3 hk3Var, DefaultEnvironment defaultEnvironment, dn90 dn90Var, zn90 zn90Var, p370 p370Var, Region region, yxf0 yxf0Var, i0k0 i0k0Var, abe abeVar, ji41 ji41Var, mh5 mh5Var, nr41 nr41Var, com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.webviewpayment.data.a aVar) {
        super(fs41.a);
        this.c = z22Var;
        this.w = hk3Var;
        this.x = defaultEnvironment;
        this.y = dn90Var;
        this.z = zn90Var;
        this.A = p370Var;
        this.B = region;
        this.C = yxf0Var;
        this.D = i0k0Var;
        this.E = abeVar;
        this.F = ji41Var;
        this.G = mh5Var;
        this.H = nr41Var;
        this.I = aVar;
        this.J = new mp41(0);
    }

    public static final String X(b bVar, Context context, String str) {
        dn90 dn90Var;
        xk3 xk3Var = (xk3) bVar.w.c.a.getValue();
        if (!(xk3Var instanceof qk3) || (dn90Var = bVar.y) == null) {
            return null;
        }
        return ((hn90) dn90Var).b(context, str, ((qk3) xk3Var).a.b, bVar.B.getKey(), bVar.x == DefaultEnvironment.TESTING);
    }

    @Override // defpackage.wc5
    public final void W() {
        com.yandex.fintechsdk.core.architecture.api.mvi.b.a(this, new WebViewPaymentViewModel$onBackPressed$1(2, null));
    }

    public final void Y() {
        pzt0 pzt0Var = this.K;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.K = null;
        pzt0 pzt0Var2 = this.L;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.L = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r0.equals("error") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        r5 = new com.yandex.pay.payment.YPayResult.Failure("transaction error", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r0.equals("abort") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
    
        r5 = com.yandex.pay.payment.YPayResult.Cancelled.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r0.equals(com.yandex.payment.common.result.ResultType.RESULT_TYPE_FAILURE) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
    
        if (r0.equals("cancel") == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z(Uri uri) {
        boolean t;
        Object failure;
        yxf0 yxf0Var = this.C;
        if (((Region) yxf0Var.b) == Region.RU) {
            try {
                t = cvu0.t(yxf0Var.l().getHost(), uri.getHost(), false);
            } catch (Throwable unused) {
            }
            if (t) {
                return false;
            }
            Y();
            i0k0 i0k0Var = this.D;
            i0k0Var.getClass();
            String queryParameter = uri.getQueryParameter(kju0.j);
            Metadata metadata = queryParameter != null ? new Metadata(queryParameter) : null;
            String queryParameter2 = uri.getQueryParameter(TarifficatorScenarioActivity.RESULT_KEY);
            if (queryParameter2 != null) {
                switch (queryParameter2.hashCode()) {
                    case -1867169789:
                        if (queryParameter2.equals("success")) {
                            String queryParameter3 = uri.getQueryParameter(FinishFlowStatus.ORDER_ID_FIELD_NAME);
                            if (queryParameter3 == null) {
                                failure = new YPayResult.Failure("failed to parse order ID", metadata);
                                break;
                            } else {
                                failure = new YPayResult.Success(metadata, new OrderId(queryParameter3));
                                break;
                            }
                        }
                        break;
                    case -1367724422:
                        break;
                    case -1086574198:
                        break;
                    case 92611376:
                        break;
                    case 96784904:
                        break;
                }
                w13 w13Var = i0k0Var.a;
                w13Var.c = null;
                w13Var.a.g(failure);
                return true;
            }
            failure = new YPayResult.Failure("incorrect payment url", metadata);
            w13 w13Var2 = i0k0Var.a;
            w13Var2.c = null;
            w13Var2.a.g(failure);
            return true;
        }
        t = false;
        if (t) {
        }
    }
}
