package defpackage;

import android.content.Context;
import com.ybsdk.common.repositiories.auth.b;
import com.ybsdk.common.repositiories.auth.f;
import com.ybsdk.feature.paymentsdk.api.PaymentSdkEnvironment;
import com.ybsdk.rconfig.configs.PaymentSdkCreds;
import okhttp3.OkHttpClient;

/* loaded from: classes9.dex */
public final /* synthetic */ class jn2 implements sls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ jn2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
        this.y = obj5;
        this.z = obj6;
        this.A = obj7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sls
    public final Object invoke() {
        int i = 0;
        switch (this.a) {
            case 0:
                on2 on2Var = (on2) this.b;
                h3y h3yVar = (h3y) this.c;
                h3y h3yVar2 = (h3y) this.w;
                h3y h3yVar3 = (h3y) this.x;
                h3y h3yVar4 = (h3y) this.y;
                h3y h3yVar5 = (h3y) this.z;
                e6v0 e6v0Var = (e6v0) this.A;
                OkHttpClient okHttpClient = (OkHttpClient) on2Var.j.getValue();
                bgo jqhVar = new jqh(i, scc.g((nxf0) on2Var.i.getValue(), new rc20()));
                gxf0 gxf0Var = (gxf0) h3yVar.get();
                p8w[] p8wVarArr = {h3yVar2.get(), h3yVar3.get(), h3yVar4.get(), h3yVar5.get(), e6v0Var.get()};
                OkHttpClient.a b = okHttpClient.b();
                ((qot) gxf0Var).a(b, null);
                while (i < 5) {
                    b.a(p8wVarArr[i]);
                    i++;
                }
                b.d(jqhVar);
                return new OkHttpClient(b);
            default:
                ria0 ria0Var = (ria0) this.b;
                Context context = (Context) this.c;
                w4o w4oVar = (w4o) this.w;
                b bVar = (b) this.x;
                f fVar = (f) this.y;
                com.ybsdk.rconfig.b bVar2 = (com.ybsdk.rconfig.b) this.z;
                xop0 xop0Var = (xop0) this.A;
                PaymentSdkEnvironment u = jx81.u(w4oVar);
                boolean z = jx81.u(w4oVar) == PaymentSdkEnvironment.PRODUCTION;
                String str = bVar.d;
                if (str == null) {
                    str = null;
                }
                Object value = fVar.a.getValue();
                bif bifVar = value instanceof bif ? (bif) value : null;
                Long a = bifVar != null ? bifVar.a() : null;
                String l = a != null ? a.toString() : null;
                u290 u290Var = new u290(14, xop0Var);
                dfr dfrVar = wia0.a;
                return ria0Var.a(context, u, z, str, l, u290Var, ((PaymentSdkCreds) bVar2.d(dfrVar).getData()).getMerchantServiceToken(), ((PaymentSdkCreds) bVar2.d(dfrVar).getData()).getCurrency(), ((PaymentSdkCreds) bVar2.d(dfrVar).getData()).getPos(), dzh0.ybsdk_deposit_psdk_payment_selection_title);
        }
    }
}
