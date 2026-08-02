package xsna;

import com.vk.uxpolls.api.models.BaseRequestParam;
import com.vk.uxpolls.api.models.UxPollsGetResponse;
import com.vk.uxpolls.api.models.UxPollsInteractEvent;
import com.vk.uxpolls.api.models.UxPollsPoll;
import com.vk.uxpolls.data.db.UxPollsDatabase;
import com.vk.uxpolls.data.model.UxPollsShownData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: UxPollsRepositoryImpl.kt */
/* loaded from: classes6.dex */
public final class t5r0 implements n5r0 {
    public final i5r0 a;
    public final UxPollsDatabase b;
    public final p4r0 c;

    public t5r0(i5r0 i5r0Var, UxPollsDatabase uxPollsDatabase, p4r0 p4r0Var) {
        this.a = i5r0Var;
        this.b = uxPollsDatabase;
        this.c = p4r0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x027f, code lost:
    
        if (r0.d(r4, r3) != r1) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r12v22, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00f5 -> B:22:0x00fc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(t5r0 t5r0Var, List list, List list2, ContinuationImpl continuationImpl) {
        p5r0 p5r0Var;
        int i;
        Iterator it;
        ArrayList arrayList;
        int i2;
        int i3;
        List list3;
        p5r0 p5r0Var2;
        List list4;
        List list5;
        UxPollsDatabase uxPollsDatabase = t5r0Var.b;
        if (continuationImpl instanceof p5r0) {
            p5r0Var = (p5r0) continuationImpl;
            int i4 = p5r0Var.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                p5r0Var.label = i4 - Integer.MIN_VALUE;
                Object obj = p5r0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = p5r0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    List list6 = list2;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list6, 10));
                    it = list6.iterator();
                    arrayList = arrayList2;
                    i2 = 0;
                    i3 = 0;
                    list3 = list;
                    p5r0Var2 = p5r0Var;
                    list4 = list2;
                    if (it.hasNext()) {
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    int i5 = p5r0Var.I$1;
                    int i6 = p5r0Var.I$0;
                    ?? r12 = (Collection) p5r0Var.L$8;
                    Iterator it2 = (Iterator) p5r0Var.L$5;
                    ?? r14 = (Collection) p5r0Var.L$4;
                    List list7 = (List) p5r0Var.L$1;
                    List list8 = (List) p5r0Var.L$0;
                    kotlin.a.a(obj);
                    p5r0Var2 = p5r0Var;
                    list4 = list7;
                    Iterator it3 = it2;
                    ArrayList arrayList3 = r12;
                    int i7 = i6;
                    int i8 = i5;
                    ArrayList arrayList4 = r14;
                    arrayList3.add((List) obj);
                    list3 = list8;
                    i2 = i8;
                    i3 = i7;
                    arrayList = arrayList4;
                    it = it3;
                    if (it.hasNext()) {
                        String str = (String) it.next();
                        lnb0 y = uxPollsDatabase.y();
                        p5r0Var2.L$0 = list3;
                        p5r0Var2.L$1 = list4;
                        p5r0Var2.L$2 = null;
                        p5r0Var2.L$3 = null;
                        p5r0Var2.L$4 = arrayList;
                        p5r0Var2.L$5 = it;
                        p5r0Var2.L$6 = null;
                        p5r0Var2.L$7 = null;
                        p5r0Var2.L$8 = arrayList;
                        p5r0Var2.I$0 = i3;
                        p5r0Var2.I$1 = i2;
                        p5r0Var2.I$2 = 0;
                        p5r0Var2.label = 1;
                        Object a = y.a(str, p5r0Var2);
                        if (a != coroutineSingletons) {
                            it3 = it;
                            arrayList3 = arrayList;
                            i7 = i3;
                            i8 = i2;
                            list8 = list3;
                            obj = a;
                            arrayList4 = arrayList3;
                            arrayList3.add((List) obj);
                            list3 = list8;
                            i2 = i8;
                            i3 = i7;
                            arrayList = arrayList4;
                            it = it3;
                            if (it.hasNext()) {
                                ArrayList v = c5g.v(arrayList);
                                HashSet hashSet = new HashSet();
                                ArrayList arrayList5 = new ArrayList();
                                Iterator it4 = v.iterator();
                                while (it4.hasNext()) {
                                    Object next = it4.next();
                                    if (hashSet.add(new Integer(((ypb0) next).a))) {
                                        arrayList5.add(next);
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it5 = arrayList5.iterator();
                                while (it5.hasNext()) {
                                    Object next2 = it5.next();
                                    if (((ypb0) next2).b.size() == 1) {
                                        arrayList6.add(next2);
                                    }
                                }
                                ArrayList arrayList7 = new ArrayList(c5g.u(arrayList6, 10));
                                Iterator it6 = arrayList6.iterator();
                                while (it6.hasNext()) {
                                    arrayList7.add(new Integer(((ypb0) it6.next()).a));
                                }
                                List list9 = list3;
                                ArrayList arrayList8 = new ArrayList(c5g.u(list9, 10));
                                Iterator it7 = list9.iterator();
                                while (it7.hasNext()) {
                                    arrayList8.add(new Integer(((UxPollsPoll) it7.next()).getId()));
                                }
                                ArrayList arrayList9 = new ArrayList();
                                Iterator it8 = arrayList5.iterator();
                                while (it8.hasNext()) {
                                    Object next3 = it8.next();
                                    if (!arrayList8.contains(new Integer(((ypb0) next3).a))) {
                                        arrayList9.add(next3);
                                    }
                                }
                                ArrayList arrayList10 = new ArrayList();
                                Iterator it9 = arrayList9.iterator();
                                while (it9.hasNext()) {
                                    Object next4 = it9.next();
                                    if (!arrayList7.contains(new Integer(((ypb0) next4).a))) {
                                        arrayList10.add(next4);
                                    }
                                }
                                ArrayList arrayList11 = new ArrayList(c5g.u(arrayList10, 10));
                                Iterator it10 = arrayList10.iterator();
                                while (it10.hasNext()) {
                                    ypb0 ypb0Var = (ypb0) it10.next();
                                    List<String> list10 = ypb0Var.b;
                                    ArrayList arrayList12 = new ArrayList();
                                    for (Object obj2 : list10) {
                                        if (!list4.contains((String) obj2)) {
                                            arrayList12.add(obj2);
                                        }
                                    }
                                    arrayList11.add(new ypb0(ypb0Var.a, ypb0Var.c, ypb0Var.d, ypb0Var.e, arrayList12));
                                }
                                lnb0 y2 = uxPollsDatabase.y();
                                p5r0Var2.L$0 = null;
                                p5r0Var2.L$1 = null;
                                p5r0Var2.L$2 = null;
                                p5r0Var2.L$3 = null;
                                p5r0Var2.L$4 = null;
                                p5r0Var2.L$5 = arrayList11;
                                p5r0Var2.L$6 = null;
                                p5r0Var2.L$7 = null;
                                p5r0Var2.L$8 = null;
                                p5r0Var2.label = 2;
                                if (y2.e(arrayList7, p5r0Var2) != coroutineSingletons) {
                                    p5r0Var = p5r0Var2;
                                    list5 = arrayList11;
                                    lnb0 y3 = uxPollsDatabase.y();
                                    p5r0Var.L$0 = null;
                                    p5r0Var.L$1 = null;
                                    p5r0Var.L$2 = null;
                                    p5r0Var.L$3 = null;
                                    p5r0Var.L$4 = null;
                                    p5r0Var.L$5 = null;
                                    p5r0Var.label = 3;
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                list5 = (List) p5r0Var.L$5;
                kotlin.a.a(obj);
                lnb0 y32 = uxPollsDatabase.y();
                p5r0Var.L$0 = null;
                p5r0Var.L$1 = null;
                p5r0Var.L$2 = null;
                p5r0Var.L$3 = null;
                p5r0Var.L$4 = null;
                p5r0Var.L$5 = null;
                p5r0Var.label = 3;
            }
        }
        p5r0Var = new p5r0(t5r0Var, continuationImpl);
        Object obj3 = p5r0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = p5r0Var.label;
        if (i != 0) {
        }
    }

    @Override // xsna.n5r0
    public final List<BaseRequestParam> a() {
        return this.a.a();
    }

    @Override // xsna.n5r0
    public final String b() {
        String b = this.a.b();
        return b == null ? "" : b;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.n5r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(List list, ContinuationImpl continuationImpl) {
        q5r0 q5r0Var;
        int i;
        if (continuationImpl instanceof q5r0) {
            q5r0Var = (q5r0) continuationImpl;
            int i2 = q5r0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q5r0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = q5r0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = q5r0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    q5r0Var.L$0 = list;
                    q5r0Var.label = 1;
                    obj = o(q5r0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) q5r0Var.L$0;
                    kotlin.a.a(obj);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    if (list.contains(new Long(((UxPollsPoll) obj2).getId()))) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            }
        }
        q5r0Var = new q5r0(this, continuationImpl);
        Object obj3 = q5r0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = q5r0Var.label;
        if (i != 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (r7.hasNext()) {
        }
        return arrayList2;
    }

    @Override // xsna.n5r0
    public final UxPollsGetResponse d(List list, e4e0 e4e0Var) {
        return this.c.a(list, e4e0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.n5r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable e(List list, ContinuationImpl continuationImpl) {
        r5r0 r5r0Var;
        int i;
        if (continuationImpl instanceof r5r0) {
            r5r0Var = (r5r0) continuationImpl;
            int i2 = r5r0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r5r0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = r5r0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = r5r0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    r5r0Var.L$0 = list;
                    r5r0Var.label = 1;
                    obj = o(r5r0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) r5r0Var.L$0;
                    kotlin.a.a(obj);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    UxPollsPoll uxPollsPoll = (UxPollsPoll) obj2;
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                String str = (String) it.next();
                                List<String> f = uxPollsPoll.f();
                                if (!(f instanceof Collection) || !f.isEmpty()) {
                                    Iterator<T> it2 = f.iterator();
                                    while (it2.hasNext()) {
                                        if (epx.f((String) it2.next(), str)) {
                                            arrayList.add(obj2);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return arrayList;
            }
        }
        r5r0Var = new r5r0(this, continuationImpl);
        Object obj3 = r5r0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = r5r0Var.label;
        if (i != 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (r9.hasNext()) {
        }
        return arrayList2;
    }

    @Override // xsna.n5r0
    public final Boolean f(blq0 blq0Var, int i, String str, List list) {
        return Boolean.valueOf(this.c.d(blq0Var, i, str, list));
    }

    @Override // xsna.n5r0
    public final Boolean g(UxPollsInteractEvent uxPollsInteractEvent, Integer num, String str, e4e0 e4e0Var) {
        return Boolean.valueOf(this.c.c(uxPollsInteractEvent, num, str, e4e0Var));
    }

    @Override // xsna.n5r0
    public final Object h(ContinuationImpl continuationImpl) {
        Object c = this.b.y().c(continuationImpl);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : s3q0.a;
    }

    @Override // xsna.n5r0
    public final void i(List<BaseRequestParam> list) {
        this.a.e(list);
    }

    @Override // xsna.n5r0
    public final void j(String str) {
        this.a.d(str);
    }

    @Override // xsna.n5r0
    public final UxPollsGetResponse k(List list, e4e0 e4e0Var) {
        return this.c.b(list, e4e0Var);
    }

    @Override // xsna.n5r0
    public final void l() {
        this.a.c(new UxPollsShownData(true, 0L, 2, null));
    }

    @Override // xsna.n5r0
    public final Object m(List list, List list2, lf6 lf6Var) {
        Object a = bmg0.a(this.b, new o5r0(this, list, list2, null), lf6Var);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058 A[LOOP:0: B:11:0x0052->B:13:0x0058, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable o(ContinuationImpl continuationImpl) {
        s5r0 s5r0Var;
        int i;
        if (continuationImpl instanceof s5r0) {
            s5r0Var = (s5r0) continuationImpl;
            int i2 = s5r0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s5r0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = s5r0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = s5r0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    lnb0 y = this.b.y();
                    s5r0Var.label = 1;
                    obj = y.b(s5r0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                Iterable<ypb0> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
                for (ypb0 ypb0Var : iterable) {
                    arrayList.add(new UxPollsPoll(ypb0Var.a, ypb0Var.b, ypb0Var.c, ypb0Var.e, null));
                }
                return arrayList;
            }
        }
        s5r0Var = new s5r0(this, continuationImpl);
        Object obj2 = s5r0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = s5r0Var.label;
        if (i != 0) {
        }
        Iterable<ypb0> iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(c5g.u(iterable2, 10));
        while (r9.hasNext()) {
        }
        return arrayList2;
    }
}
