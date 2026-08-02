package androidx.compose.runtime;

import defpackage.ats;
import defpackage.bts;
import defpackage.did;
import defpackage.e3t0;
import defpackage.fid;
import defpackage.fse;
import defpackage.i3t0;
import defpackage.iy40;
import defpackage.n4u0;
import defpackage.ngd0;
import defpackage.o430;
import defpackage.oz40;
import defpackage.p3t0;
import defpackage.qxi;
import defpackage.rol0;
import defpackage.sls;
import defpackage.tpr;
import defpackage.tx40;
import defpackage.wls;
import defpackage.wz40;
import defpackage.yx40;
import defpackage.zpn;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes.dex */
public abstract class f {
    public static final oz40 a(tpr tprVar, Object obj, fse fseVar, fid fidVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            fseVar = EmptyCoroutineContext.a;
        }
        boolean e = fidVar.e(fseVar) | fidVar.e(tprVar);
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (e || Q == o430Var) {
            Q = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(fseVar, tprVar, null);
            btsVar.o0(Q);
        }
        wls wlsVar = (wls) Q;
        bts btsVar2 = (bts) fidVar;
        Object Q2 = btsVar2.Q();
        if (Q2 == o430Var) {
            Q2 = j(obj);
            btsVar2.o0(Q2);
        }
        oz40 oz40Var = (oz40) Q2;
        boolean e2 = btsVar2.e(wlsVar);
        Object Q3 = btsVar2.Q();
        if (e2 || Q3 == o430Var) {
            Q3 = new SnapshotStateKt__ProduceStateKt$produceState$3$1(wlsVar, oz40Var, null);
            btsVar2.o0(Q3);
        }
        zpn.f(tprVar, fseVar, (wls) Q3, btsVar2);
        return oz40Var;
    }

    public static final oz40 b(n4u0 n4u0Var, fid fidVar) {
        return a(n4u0Var, n4u0Var.getValue(), EmptyCoroutineContext.a, fidVar, 0, 0);
    }

    public static final wz40 c() {
        p3t0 p3t0Var = i3t0.b;
        wz40 wz40Var = (wz40) p3t0Var.a();
        if (wz40Var != null) {
            return wz40Var;
        }
        wz40 wz40Var2 = new wz40(new ats[0]);
        p3t0Var.b(wz40Var2);
        return wz40Var2;
    }

    public static final qxi d(sls slsVar) {
        p3t0 p3t0Var = i3t0.a;
        return new qxi(slsVar, null);
    }

    public static final qxi e(sls slsVar, e3t0 e3t0Var) {
        p3t0 p3t0Var = i3t0.a;
        return new qxi(slsVar, e3t0Var);
    }

    public static final tx40 f(float f) {
        return new ParcelableSnapshotMutableFloatState(f);
    }

    public static final yx40 g(int i) {
        return new ParcelableSnapshotMutableIntState(i);
    }

    public static final iy40 h(long j) {
        return new ParcelableSnapshotMutableLongState(j);
    }

    public static final oz40 i(Object obj, e3t0 e3t0Var) {
        return new ParcelableSnapshotMutableState(obj, e3t0Var);
    }

    public static oz40 j(Object obj) {
        return new ParcelableSnapshotMutableState(obj, ngd0.F);
    }

    public static final oz40 k(fid fidVar, wls wlsVar, Object obj) {
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Q = j(obj);
            btsVar.o0(Q);
        }
        oz40 oz40Var = (oz40) Q;
        boolean e = btsVar.e(wlsVar);
        Object Q2 = btsVar.Q();
        if (e || Q2 == o430Var) {
            Q2 = new SnapshotStateKt__ProduceStateKt$produceState$1$1(wlsVar, oz40Var, null);
            btsVar.o0(Q2);
        }
        zpn.e(btsVar, (wls) Q2, zy11.a);
        return oz40Var;
    }

    public static final oz40 l(Object obj, Object obj2, wls wlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Q = j(obj);
            btsVar.o0(Q);
        }
        oz40 oz40Var = (oz40) Q;
        boolean e = btsVar.e(wlsVar);
        Object Q2 = btsVar.Q();
        if (e || Q2 == o430Var) {
            Q2 = new SnapshotStateKt__ProduceStateKt$produceState$2$1(wlsVar, oz40Var, null);
            btsVar.o0(Q2);
        }
        zpn.e(btsVar, (wls) Q2, obj2);
        return oz40Var;
    }

    public static final oz40 m(Object obj, Object[] objArr, wls wlsVar, fid fidVar) {
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Q = j(obj);
            btsVar.o0(Q);
        }
        oz40 oz40Var = (oz40) Q;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        boolean e = btsVar.e(wlsVar);
        Object Q2 = btsVar.Q();
        if (e || Q2 == o430Var) {
            Q2 = new SnapshotStateKt__ProduceStateKt$produceState$5$1(wlsVar, oz40Var, null);
            btsVar.o0(Q2);
        }
        zpn.h(copyOf, (wls) Q2, btsVar);
        return oz40Var;
    }

    public static final oz40 n(Object obj, fid fidVar) {
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        if (Q == did.a) {
            Q = j(obj);
            btsVar.o0(Q);
        }
        oz40 oz40Var = (oz40) Q;
        oz40Var.setValue(obj);
        return oz40Var;
    }

    public static final rol0 o(sls slsVar) {
        return new rol0(new SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1(null, slsVar, null));
    }
}
