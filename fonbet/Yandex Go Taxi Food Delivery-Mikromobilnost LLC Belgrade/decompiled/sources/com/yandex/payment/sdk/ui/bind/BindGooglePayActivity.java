package com.yandex.payment.sdk.ui.bind;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.payment.sdk.core.data.GooglePayData;
import com.yandex.payment.sdk.core.data.GooglePayToken;
import com.yandex.payment.sdk.core.data.OrderDetails;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.a;
import com.yandex.payment.sdk.ui.BaseActivity;
import com.yandex.xplat.common.YSError;
import defpackage.b64;
import defpackage.dgo;
import defpackage.ev5;
import defpackage.l76;
import defpackage.pm5;
import defpackage.pwf;
import defpackage.qoi0;
import defpackage.qv90;
import defpackage.tls;
import defpackage.tut;
import defpackage.vfc;
import defpackage.ymx;
import defpackage.yv90;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/yandex/payment/sdk/ui/bind/BindGooglePayActivity;", "Lcom/yandex/payment/sdk/ui/BaseActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/BroadcastReceiver;", "getDismissInterfaceReceiver$paymentsdk_release", "()Landroid/content/BroadcastReceiver;", "dismissInterfaceReceiver", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class BindGooglePayActivity extends BaseActivity {
    @Override // com.yandex.payment.sdk.ui.BaseActivity
    /* renamed from: getDismissInterfaceReceiver$paymentsdk_release */
    public BroadcastReceiver getDismissInterfaceReceiver() {
        return new BroadcastReceiver() { // from class: com.yandex.payment.sdk.ui.bind.BindGooglePayActivity$dismissInterfaceReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                BindGooglePayActivity.this.finishWithResult$paymentsdk_release();
            }
        };
    }

    @Override // com.yandex.payment.sdk.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        OrderDetails orderDetails = (OrderDetails) getIntent().getParcelableExtra(BaseActivity.EXTRA_ORDER_DATA);
        GooglePayData googlePayData = ((pwf) getBaseComponent$paymentsdk_release()).a().getGooglePayData();
        if (orderDetails == null || googlePayData == null) {
            a aVar = PaymentKitError.Companion;
            StringBuilder v = b64.v("Failed to init \"", qoi0.a(BindGooglePayActivity.class).d(), "\". OrderDetails is ", orderDetails != null ? orderDetails.getClass().getSimpleName() : null, ", Google Pay data is ");
            v.append(googlePayData);
            v.append(Extension.DOT_CHAR);
            String sb = v.toString();
            aVar.getClass();
            saveActivityResultError$paymentsdk_release(a.d(sb));
            finishWithResult$paymentsdk_release();
            return;
        }
        final int i = 0;
        reportEvent(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Открытие формы GooglePay", "open_google_pay_dialog"));
        Object obj = dgo.a;
        ev5 a = dgo.a(((pwf) getBaseComponent$paymentsdk_release()).b());
        if (a != null) {
            a.a(l76.K);
        }
        tut tutVar = ((yv90) ((pwf) getBaseComponent$paymentsdk_release()).f()).k;
        final pm5 pm5Var = new pm5(2, this);
        final int i2 = 1;
        ymx.l(tutVar.a.a(orderDetails), new tls() { // from class: wvt
            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                int i3 = i;
                zy11 zy11Var = zy11.a;
                pm5 pm5Var2 = pm5Var;
                switch (i3) {
                    case 0:
                        pm5Var2.onSuccess(new GooglePayToken((String) obj2));
                        break;
                    default:
                        PaymentKitError.Companion.getClass();
                        pm5Var2.i(a.b((YSError) obj2));
                        break;
                }
                return zy11Var;
            }
        }, new tls() { // from class: wvt
            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                int i3 = i2;
                zy11 zy11Var = zy11.a;
                pm5 pm5Var2 = pm5Var;
                switch (i3) {
                    case 0:
                        pm5Var2.onSuccess(new GooglePayToken((String) obj2));
                        break;
                    default:
                        PaymentKitError.Companion.getClass();
                        pm5Var2.i(a.b((YSError) obj2));
                        break;
                }
                return zy11Var;
            }
        }, 1);
    }
}
