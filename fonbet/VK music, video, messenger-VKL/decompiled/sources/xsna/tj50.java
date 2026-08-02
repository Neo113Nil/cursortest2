package xsna;

import com.vk.mvi.core.internal.executors.ThreadType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MviBinding.kt */
/* loaded from: classes3.dex */
public final class tj50<S> {
    public volatile ArrayList a;

    /* compiled from: MviBinding.kt */
    public static final class a<State extends km50> {
        public static final tf3 b = new tf3(22);
        public final ArrayList a = new ArrayList();

        /* compiled from: MviBinding.kt */
        /* renamed from: xsna.tj50$a$a, reason: collision with other inner class name */
        public static final class C3749a<State, Field> {
            public final izs<State, Field>[] a;
            public final ao8 b = ao8.d;
            public final Object[] c;

            /* JADX WARN: Multi-variable type inference failed */
            public C3749a(izs<? super State, ? extends Field>... izsVarArr) {
                this.a = izsVarArr;
                int length = izsVarArr.length;
                Object[] objArr = new Object[length];
                for (int i = 0; i < length; i++) {
                    objArr[i] = null;
                }
                this.c = objArr;
            }
        }

        /* compiled from: MviBinding.kt */
        public static final class b<State, Value, Result> implements izs<State, s3q0> {
            public final C3749a<State, Value> b;
            public final c<Object> c;
            public final ita<Result> d;
            public final izs<Object[], Result> e;
            public final h0u0<Result> f = new h0u0<>();

            /* JADX WARN: Multi-variable type inference failed */
            public b(C3749a<State, Value> c3749a, c<Object> cVar, ita<Result> itaVar, izs<? super Object[], ? extends Result> izsVar) {
                this.b = c3749a;
                this.c = cVar;
                this.d = itaVar;
                this.e = izsVar;
            }

            @Override // xsna.izs
            public final s3q0 invoke(Object obj) {
                ThreadType.a aVar = ThreadType.Companion;
                ThreadType threadType = ThreadType.STATE;
                aVar.getClass();
                ThreadType.a.a(threadType);
                C3749a<State, Value> c3749a = this.b;
                Object[] objArr = c3749a.c;
                ThreadType.a.a(threadType);
                izs<State, Value>[] izsVarArr = c3749a.a;
                int length = izsVarArr.length;
                int i = 0;
                boolean z = false;
                int i2 = 0;
                while (i < length) {
                    izs<State, Value> izsVar = izsVarArr[i];
                    int i3 = i2 + 1;
                    Object obj2 = objArr[i2];
                    if (obj2 == null) {
                        obj2 = null;
                    }
                    Value invoke = izsVar.invoke(obj);
                    if (c3749a.b.b(obj2, invoke)) {
                        objArr[i2] = invoke;
                        z = true;
                    }
                    i++;
                    i2 = i3;
                }
                if (z) {
                    ThreadType.a aVar2 = ThreadType.Companion;
                    ThreadType[] threadTypeArr = {ThreadType.STATE};
                    aVar2.getClass();
                    ThreadType.a.a(threadTypeArr);
                    if (this.c != null) {
                        for (Object obj3 : objArr) {
                            if (obj3 == null) {
                                break;
                            }
                        }
                    }
                    h0u0<Result> h0u0Var = this.f;
                    Result a = h0u0Var.a();
                    Result invoke2 = this.e.invoke(objArr);
                    if (this.d.b(a, invoke2)) {
                        ThreadType.a aVar3 = ThreadType.Companion;
                        ThreadType[] threadTypeArr2 = {ThreadType.STATE};
                        aVar3.getClass();
                        ThreadType.a.a(threadTypeArr2);
                        s1v s1vVar = m200.h;
                        h0u0Var.c();
                        s1vVar.getClass();
                        AtomicReference<Result> c = h0u0Var.c();
                        Result result = h0u0Var.c().get();
                        while (!c.compareAndSet(result, invoke2) && c.get() == result) {
                        }
                        com.vk.mvi.core.internal.executors.a.a(new j6(22, h0u0Var, invoke2));
                    }
                }
                return s3q0.a;
            }
        }

        /* compiled from: MviBinding.kt */
        public interface c<T> {
        }

        public static h0u0 b(a aVar, izs izsVar, izs izsVar2) {
            ao8 ao8Var = ao8.d;
            aVar.getClass();
            ThreadType.a aVar2 = ThreadType.Companion;
            ThreadType[] threadTypeArr = {ThreadType.STATE};
            aVar2.getClass();
            ThreadType.a.a(threadTypeArr);
            return aVar.f(ao8Var, null, new izs[]{izsVar}, new fgk(izsVar2, 2));
        }

        public static h0u0 c(a aVar, izs izsVar, izs izsVar2, izs izsVar3, yzs yzsVar) {
            ao8 ao8Var = ao8.d;
            aVar.getClass();
            ThreadType.a aVar2 = ThreadType.Companion;
            ThreadType[] threadTypeArr = {ThreadType.STATE};
            aVar2.getClass();
            ThreadType.a.a(threadTypeArr);
            return aVar.f(ao8Var, null, new izs[]{izsVar, izsVar2, izsVar3}, new kn20(yzsVar, 8));
        }

        public static h0u0 d(a aVar, izs izsVar, izs izsVar2, wzs wzsVar) {
            ao8 ao8Var = ao8.d;
            aVar.getClass();
            ThreadType.a aVar2 = ThreadType.Companion;
            ThreadType[] threadTypeArr = {ThreadType.STATE};
            aVar2.getClass();
            ThreadType.a.a(threadTypeArr);
            return aVar.f(ao8Var, null, new izs[]{izsVar, izsVar2}, new iou(wzsVar, 22));
        }

        public final h0u0 a(izs izsVar, ita itaVar) {
            ThreadType.a aVar = ThreadType.Companion;
            ThreadType[] threadTypeArr = {ThreadType.STATE};
            aVar.getClass();
            ThreadType.a.a(threadTypeArr);
            return f(itaVar, null, new izs[]{izsVar}, new pyz(12));
        }

        public final h0u0 e(izs izsVar) {
            ao8 ao8Var = ao8.d;
            ThreadType.a aVar = ThreadType.Companion;
            ThreadType[] threadTypeArr = {ThreadType.STATE};
            aVar.getClass();
            ThreadType.a.a(threadTypeArr);
            return f(ao8Var, b, new izs[]{izsVar}, new pey(10));
        }

        public final h0u0 f(ita itaVar, tf3 tf3Var, izs[] izsVarArr, izs izsVar) {
            ThreadType.a aVar = ThreadType.Companion;
            ThreadType threadType = ThreadType.STATE;
            aVar.getClass();
            ThreadType.a.a(threadType);
            b bVar = new b(new C3749a((izs[]) Arrays.copyOf(izsVarArr, izsVarArr.length)), tf3Var, itaVar, izsVar);
            this.a.add(bVar);
            ThreadType.a.a(threadType);
            return bVar.f;
        }
    }

    public tj50() {
        throw null;
    }
}
