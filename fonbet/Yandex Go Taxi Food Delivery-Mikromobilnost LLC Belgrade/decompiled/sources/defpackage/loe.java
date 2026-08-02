package defpackage;

import com.squareup.wire.Message;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.xplat.payment.sdk.PaymentPollingResult;
import kotlinx.coroutines.channels.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class loe implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ y6f0 b;

    public /* synthetic */ loe(y6f0 y6f0Var, int i) {
        this.a = i;
        this.b = y6f0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        y6f0 y6f0Var = this.b;
        switch (i) {
            case 0:
                int i2 = moe.a[((PaymentPollingResult) obj).ordinal()];
                if (i2 == 1) {
                    break;
                } else if (i2 != 2) {
                    w511.b();
                    break;
                } else {
                    break;
                }
            case 1:
                PaymentKitError.Companion.getClass();
                break;
            case 2:
                b.c(y6f0Var, obj);
                break;
            case 3:
                ota0 ota0Var = (ota0) obj;
                ((x6f0) y6f0Var).d(ota0Var != null ? Boolean.valueOf(ota0Var.b) : null);
                break;
            case 4:
                Object d = ((c231) obj).d();
                Boolean bool = d instanceof Boolean ? (Boolean) d : null;
                ((x6f0) y6f0Var).d(Boolean.valueOf(bool != null ? bool.booleanValue() : false));
                break;
            case 5:
                ((x6f0) y6f0Var).d(new oc41((Message) obj));
                break;
            default:
                ((x6f0) y6f0Var).d(new mc41((String) obj));
                break;
        }
        return zy11Var;
    }
}
