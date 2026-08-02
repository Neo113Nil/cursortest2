package defpackage;

import com.yandex.payment.sdk.core.data.BoundCard;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.a;
import com.yandex.xplat.common.YSError;

/* loaded from: classes2.dex */
public final /* synthetic */ class pw5 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ymu b;

    public /* synthetic */ pw5(ymu ymuVar, int i) {
        this.a = i;
        this.b = ymuVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        final int i2 = 1;
        final int i3 = 0;
        final int i4 = 2;
        zy11 zy11Var = zy11.a;
        final ymu ymuVar = this.b;
        switch (i) {
            case 0:
                final sb8 sb8Var = (sb8) obj;
                n891.n(new sls() { // from class: uw5
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i5 = i4;
                        zy11 zy11Var2 = zy11.a;
                        sb8 sb8Var2 = sb8Var;
                        ymu ymuVar2 = ymuVar;
                        switch (i5) {
                            case 0:
                                ymuVar2.onSuccess(new bc8(new BoundCard(sb8Var2.a, sb8Var2.b)));
                                break;
                            case 1:
                                ymuVar2.onSuccess(new bc8(new BoundCard(sb8Var2.a, sb8Var2.b)));
                                break;
                            default:
                                ymuVar2.onSuccess(new bc8(new BoundCard(sb8Var2.a, sb8Var2.b)));
                                break;
                        }
                        return zy11Var2;
                    }
                });
                break;
            case 1:
                final YSError ySError = (YSError) obj;
                n891.n(new sls() { // from class: vw5
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i5 = i3;
                        zy11 zy11Var2 = zy11.a;
                        YSError ySError2 = ySError;
                        ymu ymuVar2 = ymuVar;
                        switch (i5) {
                            case 0:
                                PaymentKitError.Companion.getClass();
                                ymuVar2.i(a.b(ySError2));
                                break;
                            case 1:
                                PaymentKitError.Companion.getClass();
                                ymuVar2.i(a.b(ySError2));
                                break;
                            default:
                                PaymentKitError.Companion.getClass();
                                ymuVar2.i(a.b(ySError2));
                                break;
                        }
                        return zy11Var2;
                    }
                });
                break;
            case 2:
                final sb8 sb8Var2 = (sb8) obj;
                n891.n(new sls() { // from class: uw5
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i5 = i2;
                        zy11 zy11Var2 = zy11.a;
                        sb8 sb8Var22 = sb8Var2;
                        ymu ymuVar2 = ymuVar;
                        switch (i5) {
                            case 0:
                                ymuVar2.onSuccess(new bc8(new BoundCard(sb8Var22.a, sb8Var22.b)));
                                break;
                            case 1:
                                ymuVar2.onSuccess(new bc8(new BoundCard(sb8Var22.a, sb8Var22.b)));
                                break;
                            default:
                                ymuVar2.onSuccess(new bc8(new BoundCard(sb8Var22.a, sb8Var22.b)));
                                break;
                        }
                        return zy11Var2;
                    }
                });
                break;
            case 3:
                final YSError ySError2 = (YSError) obj;
                n891.n(new sls() { // from class: vw5
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i5 = i2;
                        zy11 zy11Var2 = zy11.a;
                        YSError ySError22 = ySError2;
                        ymu ymuVar2 = ymuVar;
                        switch (i5) {
                            case 0:
                                PaymentKitError.Companion.getClass();
                                ymuVar2.i(a.b(ySError22));
                                break;
                            case 1:
                                PaymentKitError.Companion.getClass();
                                ymuVar2.i(a.b(ySError22));
                                break;
                            default:
                                PaymentKitError.Companion.getClass();
                                ymuVar2.i(a.b(ySError22));
                                break;
                        }
                        return zy11Var2;
                    }
                });
                break;
            case 4:
                final sb8 sb8Var3 = (sb8) obj;
                n891.n(new sls() { // from class: uw5
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i5 = i3;
                        zy11 zy11Var2 = zy11.a;
                        sb8 sb8Var22 = sb8Var3;
                        ymu ymuVar2 = ymuVar;
                        switch (i5) {
                            case 0:
                                ymuVar2.onSuccess(new bc8(new BoundCard(sb8Var22.a, sb8Var22.b)));
                                break;
                            case 1:
                                ymuVar2.onSuccess(new bc8(new BoundCard(sb8Var22.a, sb8Var22.b)));
                                break;
                            default:
                                ymuVar2.onSuccess(new bc8(new BoundCard(sb8Var22.a, sb8Var22.b)));
                                break;
                        }
                        return zy11Var2;
                    }
                });
                break;
            default:
                final YSError ySError3 = (YSError) obj;
                n891.n(new sls() { // from class: vw5
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i5 = i4;
                        zy11 zy11Var2 = zy11.a;
                        YSError ySError22 = ySError3;
                        ymu ymuVar2 = ymuVar;
                        switch (i5) {
                            case 0:
                                PaymentKitError.Companion.getClass();
                                ymuVar2.i(a.b(ySError22));
                                break;
                            case 1:
                                PaymentKitError.Companion.getClass();
                                ymuVar2.i(a.b(ySError22));
                                break;
                            default:
                                PaymentKitError.Companion.getClass();
                                ymuVar2.i(a.b(ySError22));
                                break;
                        }
                        return zy11Var2;
                    }
                });
                break;
        }
        return zy11Var;
    }
}
