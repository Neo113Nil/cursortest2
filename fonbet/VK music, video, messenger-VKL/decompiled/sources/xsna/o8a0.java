package xsna;

import com.vk.log.L;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.hg1;
import xsna.i8a0;
import xsna.m7a0;
import xsna.q8a0;
import xsna.qfa0;
import xsna.u8a0;
import xsna.x8a0;

/* compiled from: PhotoFlowSettingsFeature.kt */
/* loaded from: classes4.dex */
public final class o8a0 extends wk50<a9a0, y8a0, i8a0, u8a0> {
    public final f8a0 f;
    public final ysg0<m7a0> g;
    public final qfa0.i h;
    public final f4z i;

    /* compiled from: PhotoFlowSettingsFeature.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public o8a0(f8a0 f8a0Var, ysg0<m7a0> ysg0Var, s0e0 s0e0Var, qfa0.i iVar) {
        super(null, new w8a0(s0e0Var.d()));
        this.f = f8a0Var;
        this.g = ysg0Var;
        this.h = iVar;
        this.i = new f4z();
        io.reactivex.rxjava3.internal.operators.observable.i0 c = hg1.c(ysg0.b.a, nda0.class, dl1.class);
        io.reactivex.rxjava3.subjects.f<m7a0> fVar = ysg0Var.a;
        hg1.a3 a3Var = new hg1.a3();
        fVar.getClass();
        this.e.b(io.reactivex.rxjava3.core.q.X(c, new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, a3Var).U(new hg1.z2())).v0(500L, TimeUnit.MILLISECONDS).subscribe(new xk30(this, 12), new oo20(new a(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 10)));
    }

    @Override // xsna.wk50
    public final void N(y8a0 y8a0Var, i8a0 i8a0Var) {
        final ArrayList arrayList;
        i8a0 i8a0Var2 = i8a0Var;
        Map<Integer, Boolean> map = y8a0Var.e;
        boolean equals = i8a0Var2.equals(i8a0.a.b);
        f4z f4zVar = this.i;
        if (equals) {
            f4zVar.b(x8a0.a.a);
            return;
        }
        if (i8a0Var2 instanceof i8a0.d) {
            q8a0.a aVar = ((i8a0.d) i8a0Var2).b;
            this.h.a(aVar.a().b);
            f4zVar.b(new x8a0.c(aVar));
            return;
        }
        if (i8a0Var2 instanceof i8a0.f) {
            T(new u8a0.e(((i8a0.f) i8a0Var2).b, !r14.b()));
            return;
        }
        if (i8a0Var2 instanceof i8a0.b) {
            i8a0.b bVar = (i8a0.b) i8a0Var2;
            T(new u8a0.a(bVar.b, bVar.c));
            return;
        }
        if (i8a0Var2 instanceof i8a0.c) {
            i8a0.c cVar = (i8a0.c) i8a0Var2;
            List<q8a0.a> list = cVar.b;
            if (cVar.c) {
                T(new u8a0.d(list));
                return;
            } else {
                T(new u8a0.b(list));
                return;
            }
        }
        if (!i8a0Var2.equals(i8a0.e.b)) {
            throw new NoWhenBranchMatchedException();
        }
        if (map.isEmpty()) {
            return;
        }
        Set<Map.Entry<Integer, Boolean>> entrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : entrySet) {
            Boolean bool = (Boolean) ((Map.Entry) obj).getValue();
            bool.getClass();
            Object obj2 = linkedHashMap.get(bool);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(bool, obj2);
            }
            ((List) obj2).add(obj);
        }
        List list2 = (List) linkedHashMap.get(Boolean.TRUE);
        ArrayList arrayList2 = null;
        if (list2 != null) {
            List list3 = list2;
            arrayList = new ArrayList(c5g.u(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((Number) ((Map.Entry) it.next()).getKey()).intValue()));
            }
        } else {
            arrayList = null;
        }
        List list4 = (List) linkedHashMap.get(Boolean.FALSE);
        if (list4 != null) {
            List list5 = list4;
            arrayList2 = new ArrayList(c5g.u(list5, 10));
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((Number) ((Map.Entry) it2.next()).getKey()).intValue()));
            }
        }
        f8a0 f8a0Var = this.f;
        io.reactivex.rxjava3.core.a n = io.reactivex.rxjava3.core.a.n((arrayList == null || !(arrayList.isEmpty() ^ true)) ? io.reactivex.rxjava3.internal.operators.completable.i.b : f8a0Var.d(arrayList).g(new io.reactivex.rxjava3.functions.a() { // from class: xsna.n8a0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                List<Integer> list6 = arrayList;
                o8a0 o8a0Var = o8a0.this;
                o8a0Var.h.c(list6);
                o8a0Var.g.a(m7a0.c.b.a);
            }
        }).q(asu0.a.c()), (arrayList2 == null || !(arrayList2.isEmpty() ^ true)) ? io.reactivex.rxjava3.internal.operators.completable.i.b : f8a0Var.f(arrayList2).g(new f68(3, this, arrayList2)).q(asu0.a.c()));
        tl30 tl30Var = new tl30(new lw20(this, 13), 12);
        n.getClass();
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        this.e.b(new io.reactivex.rxjava3.internal.operators.completable.w(n, tl30Var, lVar, kVar, kVar, kVar, kVar).j(new zsb(this, 3)).subscribe(new uu4(this, 6), new g600(new t440(this, 7), 11)));
    }
}
