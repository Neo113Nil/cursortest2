package com.yandex.payment.sdk.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import defpackage.apa1;
import defpackage.eja1;
import defpackage.frt0;
import defpackage.m50;
import defpackage.ny61;
import defpackage.pwf;
import defpackage.rlh0;
import defpackage.rol0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.u870;
import defpackage.v50;
import defpackage.ypt0;
import defpackage.yv90;
import defpackage.zpt0;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/yandex/payment/sdk/ui/SplashActivity;", "Lcom/yandex/payment/sdk/ui/BaseActivity;", "<init>", "()V", "Lzy11;", "initTelemetry", "Ltpr;", "getFeatureFlagsFlow", "()Ltpr;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "featureFlagsTimeoutFlow", "Ltpr;", "Lm50;", "activityLauncher", "Lm50;", "Landroid/content/BroadcastReceiver;", "dismissInterfaceReceiver", "Landroid/content/BroadcastReceiver;", "getDismissInterfaceReceiver$paymentsdk_release", "()Landroid/content/BroadcastReceiver;", "Companion", "ypt0", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SplashActivity extends BaseActivity {
    public static final ypt0 Companion = new ypt0();
    private static final long GET_FLAGS_TIMEOUT = 3000;
    private final tpr featureFlagsTimeoutFlow = new rol0(new SplashActivity$featureFlagsTimeoutFlow$1(2, null));
    private final m50 activityLauncher = registerForActivityResult(new zpt0(), new v50(8, this));
    private final BroadcastReceiver dismissInterfaceReceiver = new BroadcastReceiver() { // from class: com.yandex.payment.sdk.ui.SplashActivity$dismissInterfaceReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ((yv90) ((pwf) SplashActivity.this.getBaseComponent$paymentsdk_release()).f()).j.c();
            SplashActivity.this.finishWithResult$paymentsdk_release();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final void activityLauncher$lambda$0(SplashActivity splashActivity, frt0 frt0Var) {
        splashActivity.setResult(frt0Var.a, frt0Var.b);
        splashActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tpr getFeatureFlagsFlow() {
        return new rol0(new SplashActivity$getFeatureFlagsFlow$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initTelemetry() {
        if (apa1.e(FeatureFlag.CUSTOM_TELEMETRY_FLAG)) {
            ((u870) ((pwf) getBaseComponent$paymentsdk_release()).g.get()).b();
        } else {
            ((u870) ((pwf) getBaseComponent$paymentsdk_release()).g.get()).destroy();
        }
    }

    @Override // com.yandex.payment.sdk.ui.BaseActivity
    /* renamed from: getDismissInterfaceReceiver$paymentsdk_release, reason: from getter */
    public BroadcastReceiver getDismissInterfaceReceiver() {
        return this.dismissInterfaceReceiver;
    }

    @Override // com.yandex.payment.sdk.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View inflate = getLayoutInflater().inflate(rlh0.paymentsdk_splash_activity, (ViewGroup) null, false);
        if (inflate == null) {
            ny61.t("rootView");
            return;
        }
        setContentView((FrameLayout) inflate);
        if (savedInstanceState == null) {
            tje.N(eja1.s(this), null, null, new SplashActivity$onCreate$2(this, null), 3);
        }
    }
}
