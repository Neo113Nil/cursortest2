package androidx.lifecycle.compose;

import androidx.compose.runtime.f;
import androidx.lifecycle.Lifecycle;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.fse;
import defpackage.n3z;
import defpackage.n4u0;
import defpackage.oz40;
import defpackage.pey;
import defpackage.tpr;
import defpackage.wls;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class a {
    public static final oz40 a(tpr tprVar, Object obj, bts btsVar) {
        pey peyVar = (pey) btsVar.m(n3z.a);
        return b(tprVar, obj, peyVar.getLifecycle(), Lifecycle.State.STARTED, EmptyCoroutineContext.a, btsVar, 0);
    }

    public static final oz40 b(tpr tprVar, Object obj, Lifecycle lifecycle, Lifecycle.State state, fse fseVar, fid fidVar, int i) {
        Object[] objArr = {tprVar, lifecycle, state, fseVar};
        boolean e = ((((i & 7168) ^ HProv.ALG_TYPE_SECURECHANNEL) > 2048 && fidVar.c(state.ordinal())) || (i & HProv.ALG_TYPE_SECURECHANNEL) == 2048) | fidVar.e(lifecycle) | fidVar.e(fseVar) | fidVar.e(tprVar);
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        if (e || Q == did.a) {
            FlowExtKt$collectAsStateWithLifecycle$1$1 flowExtKt$collectAsStateWithLifecycle$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1(lifecycle, state, fseVar, tprVar, null);
            btsVar.o0(flowExtKt$collectAsStateWithLifecycle$1$1);
            Q = flowExtKt$collectAsStateWithLifecycle$1$1;
        }
        return f.m(obj, objArr, (wls) Q, fidVar);
    }

    public static final oz40 c(n4u0 n4u0Var, fse fseVar, fid fidVar, int i, int i2) {
        pey peyVar = (pey) ((bts) fidVar).m(n3z.a);
        Lifecycle.State state = Lifecycle.State.STARTED;
        if ((i2 & 4) != 0) {
            fseVar = EmptyCoroutineContext.a;
        }
        fse fseVar2 = fseVar;
        int i3 = i & 14;
        int i4 = i << 3;
        return b(n4u0Var, n4u0Var.getValue(), peyVar.getLifecycle(), state, fseVar2, fidVar, i3 | (i4 & 7168) | (i4 & HProv.ALG_CLASS_ALL));
    }
}
