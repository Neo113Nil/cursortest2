package defpackage;

import com.ybsdk.adapters.paymentsdk.PaymentSdkAdapterFactory;
import com.ybsdk.core.utils.network.retryPolicy.a;
import com.ybsdk.utils.poller.f;
import java.lang.reflect.Method;

/* loaded from: classes9.dex */
public final class egn implements v7p {
    public final /* synthetic */ int a;

    public egn(s960 s960Var, eqh eqhVar) {
        this.a = 4;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        switch (this.a) {
            case 0:
                return new bgn();
            case 1:
                return new cgn();
            case 2:
                try {
                    Object newInstance = PaymentSdkAdapterFactory.class.getConstructor(null).newInstance(null);
                    Method method = PaymentSdkAdapterFactory.class.getMethod("create", null);
                    if (ria0.class.isAssignableFrom(method.getReturnType())) {
                        return (ria0) method.invoke(newInstance, null);
                    }
                    throw new IllegalStateException("Can't create PaymentSdkAdapter: create() must return PaymentSdkAdapter");
                } catch (Throwable th) {
                    x4c.g("Failed to create PaymentSdkAdapter", th, null, null, 12);
                    return new pwu0();
                }
            case 3:
                return new a(0);
            case 4:
                return new ak00(24);
            case 5:
                return new g5f0();
            case 6:
                return new qpi0();
            case 7:
                return new uui0(0);
            case 8:
                return new f();
            case 9:
                return new dpp0();
            case 10:
                return new erg(new d7g0(21));
            default:
                return new nbp0(0);
        }
    }

    public /* synthetic */ egn(int i, Object obj) {
        this.a = i;
    }
}
