package defpackage;

import com.yandex.fintechsdk.flows.applink.payment.internal.model.payment.PayboxScenario;
import com.yandex.pay.payment.PaymentData;
import com.yandex.payment.sdk.flex.impl.FlexAdapterFactory;
import com.yandex.plus.metrica.api.a;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import kotlin.collections.EmptySet;

/* loaded from: classes2.dex */
public final class b55 implements v7p {
    public final /* synthetic */ int a;

    public /* synthetic */ b55(int i, Object obj) {
        this.a = i;
    }

    public static b55 a(d8b0 d8b0Var) {
        return new b55(21, d8b0Var);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        switch (this.a) {
            case 0:
                return new km0();
            case 1:
                return new ve51();
            case 2:
                sjh sjhVar = uyj.a;
                return bvf0.a(mdh.b);
            case 3:
                return ffx.c(0, 0, null, 7);
            case 4:
                return ffx.c(0, 1, null, 5);
            case 5:
                return sb2.a(0, null, null, 7);
            case 6:
                return new jcp0();
            case 7:
                return ffx.c(0, 0, null, 7);
            case 8:
                return ffx.c(0, 0, null, 7);
            case 9:
                return new iwy0();
            case 10:
                qhw0 a = jl40.a();
                sjh sjhVar2 = uyj.a;
                return bvf0.a(cvw.U(a, o400.a.x));
            case 11:
                sjh sjhVar3 = uyj.a;
                mdh mdhVar = mdh.b;
                q5z.i(mdhVar);
                return mdhVar;
            case 12:
                qhw0 a2 = jl40.a();
                sjh sjhVar4 = uyj.a;
                return bvf0.a(cvw.U(a2, o400.a));
            case 13:
                return new kyk();
            case 14:
                return new u2l(new qxk(0));
            case 15:
                return new bw();
            case 16:
                return new unf();
            case 17:
                return new iu31();
            case 18:
                return new lkr();
            case 19:
                try {
                    Object newInstance = FlexAdapterFactory.class.getConstructor(null).newInstance(null);
                    Method method = FlexAdapterFactory.class.getMethod("create", null);
                    if (ahr.class.isAssignableFrom(method.getReturnType())) {
                        return (ahr) method.invoke(newInstance, null);
                    }
                    return null;
                } catch (ClassNotFoundException e) {
                    LinkedHashMap linkedHashMap = zdz.a;
                    ogb1.b("Error creating FlexAdapter: " + e.getMessage());
                    return null;
                }
            case 20:
                return new szt();
            case 21:
                return new a8b0();
            case 22:
                return a.a;
            case 23:
                return new dli0();
            case 24:
                return qz4.a;
            case 25:
                return EmptySet.a;
            case 26:
                PayboxScenario payboxScenario = PayboxScenario.PAY_ONLINE;
                q5z.i(payboxScenario);
                return payboxScenario;
            case 27:
                return new PaymentData("", null, 2, null);
            case 28:
                return new bw();
            default:
                return new tem0();
        }
    }
}
