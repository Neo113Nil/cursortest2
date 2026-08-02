package xsna;

import java.util.ArrayList;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: ComposableLambda.kt */
/* loaded from: classes11.dex */
public final class jai implements wzs, yzs, zzs, a0t, b0t, c0t, d0t, e0t, hzs, jzs, lzs, mzs, nzs, ozs, pzs, qzs, rzs, tzs, uzs {
    public final int b;
    public final boolean c;
    public Object d;
    public vef0 e;
    public ArrayList f;

    /* compiled from: ComposableLambda.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            int intValue = num.intValue();
            ((jai) this.receiver).a(intValue, aVar);
            return s3q0.a;
        }
    }

    public jai(int i, Object obj, boolean z) {
        this.b = i;
        this.c = z;
        this.d = obj;
    }

    public final Object a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(this.b);
        l(M);
        int a2 = i | (M.J(this) ? kai.a(2, 0) : kai.a(1, 0));
        Object obj = this.d;
        ttp0.d(2, obj);
        Object invoke = ((wzs) obj).invoke(M, Integer.valueOf(a2));
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new a(2, this, jai.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        }
        return invoke;
    }

    @Override // xsna.hzs
    public final /* bridge */ /* synthetic */ Object b(Long l, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return c(l, obj, obj2, obj3, obj4, obj5, obj6, obj7, (androidx.compose.runtime.a) obj8, ((Number) obj9).intValue());
    }

    public final Object c(final Long l, final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(this.b);
        l(M);
        int a2 = M.J(this) ? kai.a(2, 8) : kai.a(1, 8);
        Object obj8 = this.d;
        ttp0.d(10, obj8);
        Object b = ((hzs) obj8).b(l, obj, obj2, obj3, obj4, obj5, obj6, obj7, M, Integer.valueOf(i | a2));
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.iai
                @Override // xsna.wzs
                public final Object invoke(Object obj9, Object obj10) {
                    ((Integer) obj10).getClass();
                    jai.this.c(l, obj, obj2, obj3, obj4, obj5, obj6, obj7, (androidx.compose.runtime.a) obj9, ne7.I(i) | 1);
                    return s3q0.a;
                }
            };
        }
        return b;
    }

    public final Object d(Object obj, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(this.b);
        l(M);
        int a2 = M.J(this) ? kai.a(2, 1) : kai.a(1, 1);
        Object obj2 = this.d;
        ttp0.d(3, obj2);
        Object invoke = ((yzs) obj2).invoke(obj, M, Integer.valueOf(a2 | i));
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tq8(this, obj, i, 2);
        }
        return invoke;
    }

    public final Object e(final Object obj, final Boolean bool, final Object obj2, final Object obj3, final Object obj4, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(this.b);
        l(M);
        int a2 = M.J(this) ? kai.a(2, 6) : kai.a(1, 6);
        Object obj5 = this.d;
        ttp0.d(8, obj5);
        Object f = ((d0t) obj5).f(obj, bool, obj2, obj3, obj4, M, Integer.valueOf(i | a2));
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.gai
                @Override // xsna.wzs
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    jai.this.e(obj, bool, obj2, obj3, obj4, (androidx.compose.runtime.a) obj6, ne7.I(i) | 1);
                    return s3q0.a;
                }
            };
        }
        return f;
    }

    @Override // xsna.d0t
    public final /* bridge */ /* synthetic */ Object f(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, androidx.compose.runtime.a aVar, Integer num) {
        return e(obj, bool, obj2, obj3, obj4, aVar, num.intValue());
    }

    public final Object g(Object obj, Object obj2, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(this.b);
        l(M);
        int a2 = M.J(this) ? kai.a(2, 2) : kai.a(1, 2);
        Object obj3 = this.d;
        ttp0.d(4, obj3);
        Object invoke = ((zzs) obj3).invoke(obj, obj2, M, Integer.valueOf(a2 | i));
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new es5(i, 2, this, obj, obj2);
        }
        return invoke;
    }

    public final Object h(Object obj, Object obj2, Object obj3, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(this.b);
        l(M);
        int a2 = M.J(this) ? kai.a(2, 3) : kai.a(1, 3);
        Object obj4 = this.d;
        ttp0.d(5, obj4);
        Object invoke = ((a0t) obj4).invoke(obj, obj2, obj3, M, Integer.valueOf(a2 | i));
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new hai(this, obj, obj2, obj3, i, 0);
        }
        return invoke;
    }

    @Override // xsna.wzs
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a(((Number) obj2).intValue(), (androidx.compose.runtime.a) obj);
    }

    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(this.b);
        l(M);
        int a2 = M.J(this) ? kai.a(2, 4) : kai.a(1, 4);
        Object obj5 = this.d;
        ttp0.d(6, obj5);
        Object invoke = ((b0t) obj5).invoke(obj, obj2, obj3, obj4, M, Integer.valueOf(i | a2));
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new uma(this, obj, obj2, obj3, obj4, i, 1);
        }
        return invoke;
    }

    public final void l(androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.f v;
        if (!this.c || (v = aVar.v()) == null) {
            return;
        }
        aVar.Y(v);
        if (kai.d(this.e, v)) {
            this.e = v;
            return;
        }
        ArrayList arrayList = this.f;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f = arrayList2;
            arrayList2.add(v);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (kai.d((vef0) arrayList.get(i), v)) {
                arrayList.set(i, v);
                return;
            }
        }
        arrayList.add(v);
    }

    @Override // xsna.yzs
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return d(obj, (androidx.compose.runtime.a) obj2, ((Number) obj3).intValue());
    }

    @Override // xsna.zzs
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return g(obj, obj2, (androidx.compose.runtime.a) obj3, ((Number) obj4).intValue());
    }

    @Override // xsna.a0t
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return h(obj, obj2, obj3, (androidx.compose.runtime.a) obj4, ((Number) obj5).intValue());
    }

    @Override // xsna.b0t
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return k(obj, obj2, obj3, obj4, (androidx.compose.runtime.a) obj5, ((Number) obj6).intValue());
    }
}
