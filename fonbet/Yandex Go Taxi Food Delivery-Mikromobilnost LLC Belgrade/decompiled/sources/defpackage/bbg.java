package defpackage;

import android.content.Context;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;

/* loaded from: classes14.dex */
public final class bbg implements xvf0 {
    public final /* synthetic */ int a;
    public final z4m0 b;

    public /* synthetic */ bbg(z4m0 z4m0Var, int i) {
        this.a = i;
        this.b = z4m0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        z4m0 z4m0Var = this.b;
        switch (i) {
            case 0:
                jwh jwhVar = (jwh) z4m0Var.z;
                q5z.h(jwhVar);
                return jwhVar;
            case 1:
                Context context = (Context) z4m0Var.b;
                q5z.h(context);
                return context;
            case 2:
                dci dciVar = (dci) z4m0Var.y;
                q5z.h(dciVar);
                return dciVar;
            case 3:
                qcp0 qcp0Var = (qcp0) z4m0Var.c;
                q5z.h(qcp0Var);
                return qcp0Var;
            case 4:
                npy0 npy0Var = (npy0) z4m0Var.x;
                q5z.h(npy0Var);
                return npy0Var;
            case 5:
                hwy0 hwy0Var = (hwy0) z4m0Var.w;
                q5z.h(hwy0Var);
                return hwy0Var;
            default:
                e eVar = (e) z4m0Var.A;
                q5z.h(eVar);
                return eVar;
        }
    }
}
