package defpackage;

import android.content.Context;
import ru.yandex.taxi.logistics.sdk.delivery.edit.b;

/* loaded from: classes5.dex */
public final class mxf implements xvf0 {
    public final /* synthetic */ int a;
    public final bc b;

    public /* synthetic */ mxf(bc bcVar, int i) {
        this.a = i;
        this.b = bcVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        bc bcVar = this.b;
        switch (i) {
            case 0:
                jwh jwhVar = (jwh) bcVar.w;
                q5z.h(jwhVar);
                return jwhVar;
            case 1:
                Context context = (Context) bcVar.a;
                q5z.h(context);
                return context;
            case 2:
                b bVar = (b) bcVar.x;
                q5z.h(bVar);
                return bVar;
            case 3:
                qcp0 qcp0Var = (qcp0) bcVar.b;
                q5z.h(qcp0Var);
                return qcp0Var;
            default:
                hwy0 hwy0Var = (hwy0) bcVar.c;
                q5z.h(hwy0Var);
                return hwy0Var;
        }
    }
}
