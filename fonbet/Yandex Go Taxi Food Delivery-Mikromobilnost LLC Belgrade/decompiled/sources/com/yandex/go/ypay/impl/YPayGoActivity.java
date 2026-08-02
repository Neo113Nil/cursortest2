package com.yandex.go.ypay.impl;

import com.yandex.fintechsdk.flows.applink.payment.api.activity.ApplinkPaymentActivity;
import com.yandex.go.ypay.impl.YPayGoActivity;
import com.yandex.go.ypay.impl.auth.a;
import defpackage.ej51;
import defpackage.eja1;
import defpackage.hrw;
import defpackage.i3y;
import defpackage.sls;
import defpackage.wwg;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/yandex/go/ypay/impl/YPayGoActivity;", "Lcom/yandex/fintechsdk/flows/applink/payment/api/activity/ApplinkPaymentActivity;", "<init>", "()V", "Lhrw;", "provideInternalDependencies", "()Lhrw;", "Lej51;", "dependencies$delegate", "Li3y;", "getDependencies", "()Lej51;", "dependencies", "Lcom/yandex/go/ypay/impl/auth/a;", "passportUidProvider$delegate", "getPassportUidProvider", "()Lcom/yandex/go/ypay/impl/auth/a;", "passportUidProvider", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class YPayGoActivity extends ApplinkPaymentActivity {

    /* renamed from: dependencies$delegate, reason: from kotlin metadata */
    private final i3y dependencies;

    /* renamed from: passportUidProvider$delegate, reason: from kotlin metadata */
    private final i3y passportUidProvider;

    public YPayGoActivity() {
        final int i = 0;
        this.dependencies = kotlin.a.a(new sls(this) { // from class: jj51
            public final /* synthetic */ YPayGoActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                ej51 dependencies_delegate$lambda$0;
                a passportUidProvider_delegate$lambda$0;
                int i2 = i;
                YPayGoActivity yPayGoActivity = this.b;
                switch (i2) {
                    case 0:
                        dependencies_delegate$lambda$0 = YPayGoActivity.dependencies_delegate$lambda$0(yPayGoActivity);
                        return dependencies_delegate$lambda$0;
                    default:
                        passportUidProvider_delegate$lambda$0 = YPayGoActivity.passportUidProvider_delegate$lambda$0(yPayGoActivity);
                        return passportUidProvider_delegate$lambda$0;
                }
            }
        });
        final int i2 = 1;
        this.passportUidProvider = kotlin.a.a(new sls(this) { // from class: jj51
            public final /* synthetic */ YPayGoActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                ej51 dependencies_delegate$lambda$0;
                a passportUidProvider_delegate$lambda$0;
                int i22 = i2;
                YPayGoActivity yPayGoActivity = this.b;
                switch (i22) {
                    case 0:
                        dependencies_delegate$lambda$0 = YPayGoActivity.dependencies_delegate$lambda$0(yPayGoActivity);
                        return dependencies_delegate$lambda$0;
                    default:
                        passportUidProvider_delegate$lambda$0 = YPayGoActivity.passportUidProvider_delegate$lambda$0(yPayGoActivity);
                        return passportUidProvider_delegate$lambda$0;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ej51 dependencies_delegate$lambda$0(YPayGoActivity yPayGoActivity) {
        return (ej51) wwg.e(yPayGoActivity, ej51.class);
    }

    private final ej51 getDependencies() {
        return (ej51) this.dependencies.getValue();
    }

    private final com.yandex.go.ypay.impl.auth.a getPassportUidProvider() {
        return (com.yandex.go.ypay.impl.auth.a) this.passportUidProvider.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.yandex.go.ypay.impl.auth.a passportUidProvider_delegate$lambda$0(YPayGoActivity yPayGoActivity) {
        return new com.yandex.go.ypay.impl.auth.a(yPayGoActivity.getDependencies(), eja1.s(yPayGoActivity));
    }

    @Override // com.yandex.fintechsdk.flows.applink.payment.api.activity.ApplinkPaymentActivity, defpackage.irw
    public hrw provideInternalDependencies() {
        return new hrw(getPassportUidProvider(), 1);
    }
}
