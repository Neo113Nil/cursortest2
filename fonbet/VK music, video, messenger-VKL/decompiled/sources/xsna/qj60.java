package xsna;

import android.util.SparseArray;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import kotlin.NoWhenBranchMatchedException;
import xsna.jv60;
import xsna.qz60;

/* compiled from: NewsfeedFreshNewsReducer.kt */
/* loaded from: classes4.dex */
public final class qj60 implements bm50<qz60, jv60.a> {
    public final lv60 a;
    public final bpn0 b = new bpn0(new i13(20));

    public qj60(lv60 lv60Var) {
        this.a = lv60Var;
    }

    @Override // xsna.bm50
    public final qz60 a(qz60 qz60Var, jv60.a aVar) {
        qz60 qz60Var2 = qz60Var;
        jv60.a aVar2 = aVar;
        qz60.a aVar3 = qz60Var2.h;
        if (!this.a.a(qz60Var2, aVar2) || ((Boolean) this.b.getValue()).booleanValue()) {
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return qz60Var2;
            }
            L.u(l, L.LogType.d, new Object[]{"Skipping " + aVar2});
            return qz60Var2;
        }
        if (aVar2 instanceof jv60.a.d) {
            jv60.a.d dVar = (jv60.a.d) aVar2;
            SparseArray<lu60> sparseArray = aVar3.a;
            sparseArray.put(dVar.a, dVar.b);
            s3q0 s3q0Var = s3q0.a;
            return qz60.a(qz60Var2, null, 0, null, null, null, null, qz60.a.a(aVar3, sparseArray, null, 0, false, 14), null, 191);
        }
        if (aVar2 instanceof jv60.a.c) {
            SparseArray<lu60> sparseArray2 = aVar3.a;
            sparseArray2.remove(((jv60.a.c) aVar2).a);
            s3q0 s3q0Var2 = s3q0.a;
            return qz60.a(qz60Var2, null, 0, null, null, null, null, qz60.a.a(aVar3, sparseArray2, null, 0, false, 14), null, 191);
        }
        if (aVar2 instanceof jv60.a.C3147a) {
            return qz60.a(qz60Var2, null, 0, null, null, null, null, qz60.a.a(qz60Var2.h, null, null, 0, ((jv60.a.C3147a) aVar2).a, 7), null, 191);
        }
        if (aVar2 instanceof jv60.a.e) {
            return qz60.a(qz60Var2, null, 0, null, null, null, null, qz60.a.a(qz60Var2.h, null, ((jv60.a.e) aVar2).a, 0, false, 13), null, 191);
        }
        if (aVar2 instanceof jv60.a.b.C3149b) {
            qz60.a aVar4 = qz60Var2.h;
            return qz60.a(qz60Var2, null, 0, null, null, null, null, qz60.a.a(aVar4, null, null, aVar4.c + 1, false, 11), null, 191);
        }
        if (aVar2 instanceof jv60.a.b.C3148a) {
            return qz60.a(qz60Var2, null, 0, null, null, null, null, qz60.a.a(qz60Var2.h, null, null, 0, false, 11), null, 191);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(jv60.a aVar) {
        return true;
    }
}
