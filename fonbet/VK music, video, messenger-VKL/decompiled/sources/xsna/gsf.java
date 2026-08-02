package xsna;

import java.util.LinkedHashMap;

/* compiled from: ClipsWrapperMemoryStorage.kt */
/* loaded from: classes17.dex */
public final class gsf {
    public final io.reactivex.rxjava3.subjects.f a = new io.reactivex.rxjava3.subjects.f();
    public final LinkedHashMap b = new LinkedHashMap();
    public final io.reactivex.rxjava3.subjects.f c = new io.reactivex.rxjava3.subjects.f();
    public final io.reactivex.rxjava3.subjects.f d = new io.reactivex.rxjava3.subjects.f();
    public final io.reactivex.rxjava3.subjects.f e = new io.reactivex.rxjava3.subjects.f();
    public final io.reactivex.rxjava3.subjects.f f = new io.reactivex.rxjava3.subjects.f();

    /* compiled from: ClipsWrapperMemoryStorage.kt */
    public static final class a implements io.reactivex.rxjava3.functions.l {
        public final /* synthetic */ izs b;

        public a(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final /* synthetic */ Object apply(Object obj) {
            return this.b.invoke(obj);
        }
    }

    public static io.reactivex.rxjava3.internal.operators.observable.j1 a(io.reactivex.rxjava3.subjects.f fVar, String str) {
        b9 b9Var = new b9(new bsf(str, 0), 8);
        fVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, b9Var).U(new wq(11, new qb(16)));
    }

    public final gx6<stf> b(String str) {
        LinkedHashMap linkedHashMap = this.b;
        gx6<stf> gx6Var = (gx6) linkedHashMap.get(str);
        if (gx6Var != null) {
            return gx6Var;
        }
        gx6<stf> gx6Var2 = new gx6<>(io.reactivex.rxjava3.subjects.d.N0());
        linkedHashMap.put(str, gx6Var2);
        return gx6Var2;
    }

    public final io.reactivex.rxjava3.internal.operators.observable.m1 c(String str) {
        io.reactivex.rxjava3.core.q<stf> a2 = b(str).a();
        asu0.a.getClass();
        return a2.a0(asu0.i());
    }
}
