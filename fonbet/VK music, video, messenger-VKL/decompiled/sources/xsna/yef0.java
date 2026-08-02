package xsna;

import android.os.Trace;
import androidx.compose.runtime.Recomposer;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ag8;

/* compiled from: Recomposer.kt */
@b6l(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {IronSourceError.ERROR_BN_LOAD_NO_CONFIG, LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class yef0 extends SuspendLambda implements yzs<yvj, g830, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yef0(Recomposer recomposer, spj<? super yef0> spjVar) {
        super(3, spjVar);
        this.this$0 = recomposer;
    }

    public static final void a(Recomposer recomposer, List<hqj> list, List<ic30> list2, List<hqj> list3, qh50<hqj> qh50Var, qh50<hqj> qh50Var2, qh50<Object> qh50Var3, qh50<hqj> qh50Var4) {
        char c;
        long j;
        long j2;
        synchronized (recomposer.c) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    hqj hqjVar = list3.get(i);
                    hqjVar.x();
                    recomposer.P(hqjVar);
                }
                list3.clear();
                Object[] objArr = qh50Var.b;
                long[] jArr = qh50Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    hqj hqjVar2 = (hqj) objArr[(i2 << 3) + i4];
                                    hqjVar2.x();
                                    recomposer.P(hqjVar2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                qh50Var.f();
                Object[] objArr2 = qh50Var2.b;
                long[] jArr2 = qh50Var2.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((hqj) objArr2[(i5 << 3) + i7]).q();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                qh50Var2.f();
                qh50Var3.f();
                Object[] objArr3 = qh50Var4.b;
                long[] jArr3 = qh50Var4.a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    hqj hqjVar3 = (hqj) objArr3[(i8 << 3) + i10];
                                    hqjVar3.x();
                                    recomposer.P(hqjVar3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length3) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                qh50Var4.f();
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void c(List<ic30> list, Recomposer recomposer) {
        list.clear();
        synchronized (recomposer.c) {
            try {
                ArrayList arrayList = recomposer.k;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((ic30) arrayList.get(i));
                }
                recomposer.k.clear();
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.yzs
    public final Object invoke(yvj yvjVar, g830 g830Var, spj<? super s3q0> spjVar) {
        yef0 yef0Var = new yef0(this.this$0, spjVar);
        yef0Var.L$0 = g830Var;
        return yef0Var.invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x014a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x013d -> B:6:0x0145). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x028e -> B:26:0x00b2). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g830 g830Var;
        qh50 a;
        qh50 a2;
        List list;
        Set set;
        final List list2;
        qh50 qh50Var;
        List list3;
        qh50 qh50Var2;
        final List list4;
        final qh50 qh50Var3;
        final List list5;
        final qh50 qh50Var4;
        Recomposer recomposer;
        Object obj2;
        lq9 lq9Var;
        int i;
        CoroutineSingletons coroutineSingletons;
        g830 g830Var2;
        Set set2;
        qh50 qh50Var5;
        qh50 qh50Var6;
        qh50 qh50Var7;
        fh50 fh50Var;
        fh50 fh50Var2;
        Object[] objArr;
        Object[] objArr2;
        long j;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        int i3 = 2;
        int i4 = 1;
        if (i2 == 0) {
            kotlin.a.a(obj);
            g830Var = (g830) this.L$0;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            a = k5h0.a();
            qh50 a3 = k5h0.a();
            qh50 qh50Var8 = new qh50((Object) null);
            l5h0 l5h0Var = new l5h0(qh50Var8);
            a2 = k5h0.a();
            list = arrayList;
            set = l5h0Var;
            list2 = arrayList2;
            qh50Var = qh50Var8;
            list3 = arrayList3;
            qh50Var2 = a3;
            synchronized (this.this$0.c) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qh50 qh50Var9 = (qh50) this.L$8;
                Set set3 = (Set) this.L$7;
                qh50 qh50Var10 = (qh50) this.L$6;
                qh50 qh50Var11 = (qh50) this.L$5;
                qh50 qh50Var12 = (qh50) this.L$4;
                list3 = (List) this.L$3;
                list2 = (List) this.L$2;
                list = (List) this.L$1;
                g830 g830Var3 = (g830) this.L$0;
                kotlin.a.a(obj);
                a2 = qh50Var9;
                g830Var = g830Var3;
                Recomposer recomposer2 = this.this$0;
                synchronized (recomposer2.c) {
                    try {
                        i = i3;
                        if (recomposer2.l.g()) {
                            ph50<Object, Object> ph50Var = recomposer2.l;
                            if (ph50Var.f()) {
                                fh50Var2 = sp70.b;
                                coroutineSingletons = coroutineSingletons2;
                                g830Var2 = g830Var;
                                set2 = set3;
                                qh50Var5 = qh50Var10;
                                qh50Var6 = qh50Var11;
                                qh50Var7 = qh50Var12;
                            } else {
                                fh50 fh50Var3 = new fh50((Object) null);
                                Object[] objArr3 = ph50Var.c;
                                long[] jArr = ph50Var.a;
                                coroutineSingletons = coroutineSingletons2;
                                int length = jArr.length - 2;
                                g830Var2 = g830Var;
                                set2 = set3;
                                qh50Var5 = qh50Var10;
                                if (length >= 0) {
                                    int i5 = 0;
                                    while (true) {
                                        long j2 = jArr[i5];
                                        qh50Var6 = qh50Var11;
                                        qh50Var7 = qh50Var12;
                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                                            int i7 = 0;
                                            while (i7 < i6) {
                                                if ((j2 & 255) < 128) {
                                                    objArr2 = objArr3;
                                                    Object obj3 = objArr2[(i5 << 3) + i7];
                                                    j = j2;
                                                    if (obj3 instanceof fh50) {
                                                        fh50Var3.l((fh50) obj3);
                                                    } else {
                                                        fh50Var3.j(obj3);
                                                    }
                                                } else {
                                                    objArr2 = objArr3;
                                                    j = j2;
                                                }
                                                j2 = j >> 8;
                                                i7++;
                                                objArr3 = objArr2;
                                            }
                                            objArr = objArr3;
                                            if (i6 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                        }
                                        if (i5 == length) {
                                            break;
                                        }
                                        i5++;
                                        qh50Var11 = qh50Var6;
                                        qh50Var12 = qh50Var7;
                                        objArr3 = objArr;
                                    }
                                } else {
                                    qh50Var6 = qh50Var11;
                                    qh50Var7 = qh50Var12;
                                }
                                fh50Var2 = fh50Var3;
                            }
                            recomposer2.l.h();
                            t060 t060Var = recomposer2.m;
                            ((ph50) t060Var.b).h();
                            ((ph50) t060Var.c).h();
                            recomposer2.o.h();
                            fh50Var = new fh50(fh50Var2.b);
                            Object[] objArr4 = fh50Var2.a;
                            int i8 = fh50Var2.b;
                            for (int i9 = 0; i9 < i8; i9++) {
                                ic30 ic30Var = (ic30) objArr4[i9];
                                fh50Var.j(new Pair(ic30Var, recomposer2.n.d(ic30Var)));
                            }
                            recomposer2.n.h();
                        } else {
                            coroutineSingletons = coroutineSingletons2;
                            g830Var2 = g830Var;
                            set2 = set3;
                            qh50Var5 = qh50Var10;
                            qh50Var6 = qh50Var11;
                            qh50Var7 = qh50Var12;
                            fh50Var = sp70.b;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Object[] objArr5 = fh50Var.a;
                int i10 = fh50Var.b;
                for (int i11 = 0; i11 < i10; i11++) {
                    Pair pair = (Pair) objArr5[i11];
                    ic30 ic30Var2 = (ic30) pair.d();
                    hc30 hc30Var = (hc30) pair.g();
                    if (hc30Var != null) {
                        ic30Var2.c.f(hc30Var);
                    }
                }
                r170 r170Var = this.this$0.b;
                r170Var.a.set(0);
                r170Var.b.b(new leq(21));
                i3 = i;
                coroutineSingletons2 = coroutineSingletons;
                g830Var = g830Var2;
                set = set2;
                qh50Var = qh50Var5;
                qh50Var2 = qh50Var6;
                a = qh50Var7;
                i4 = 1;
                synchronized (this.this$0.c) {
                }
                Recomposer recomposer3 = this.this$0;
                this.L$0 = g830Var;
                this.L$1 = list;
                this.L$2 = list2;
                this.L$3 = list3;
                this.L$4 = a;
                this.L$5 = qh50Var2;
                this.L$6 = qh50Var;
                this.L$7 = set;
                this.L$8 = a2;
                this.label = i4;
                if (recomposer3.G()) {
                    obj2 = s3q0.a;
                } else {
                    lq9 lq9Var2 = new lq9(i4, s7s0.c(this));
                    lq9Var2.o();
                    synchronized (recomposer3.c) {
                        if (recomposer3.G()) {
                            lq9Var = lq9Var2;
                        } else {
                            recomposer3.r = lq9Var2;
                            lq9Var = null;
                        }
                    }
                    if (lq9Var != null) {
                        lq9Var.resumeWith(s3q0.a);
                    }
                    obj2 = lq9Var2.n();
                    if (obj2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        obj2 = s3q0.a;
                    }
                }
                if (obj2 != coroutineSingletons2) {
                    List list6 = list;
                    qh50Var3 = a;
                    qh50Var4 = a2;
                    list4 = list3;
                    list5 = list6;
                    final Set set4 = set;
                    final qh50 qh50Var13 = qh50Var2;
                    final qh50 qh50Var14 = qh50Var;
                    recomposer = this.this$0;
                    utk0 utk0Var = Recomposer.z;
                    if (recomposer.O()) {
                        List list7 = list4;
                        a2 = qh50Var4;
                        a = qh50Var3;
                        list = list5;
                        list3 = list7;
                        qh50Var = qh50Var14;
                        qh50Var2 = qh50Var13;
                        set = set4;
                        synchronized (this.this$0.c) {
                        }
                    } else {
                        final Recomposer recomposer4 = this.this$0;
                        izs izsVar = new izs() { // from class: xsna.xef0
                            @Override // xsna.izs
                            public final Object invoke(Object obj4) {
                                boolean D;
                                s3q0 s3q0Var;
                                int i12;
                                dak0 nop0Var;
                                long j3;
                                boolean z;
                                Recomposer recomposer5 = Recomposer.this;
                                qh50<Object> qh50Var15 = qh50Var14;
                                qh50 qh50Var16 = qh50Var4;
                                List list8 = list5;
                                List<ic30> list9 = list2;
                                qh50 qh50Var17 = qh50Var3;
                                List list10 = list4;
                                qh50 qh50Var18 = qh50Var13;
                                Set<? extends Object> set5 = set4;
                                final long longValue = ((Long) obj4).longValue();
                                synchronized (recomposer5.c) {
                                    D = recomposer5.D();
                                }
                                if (D) {
                                    Trace.beginSection("Recomposer:animation");
                                    try {
                                        recomposer5.a.c.b(new izs() { // from class: xsna.zf8
                                            @Override // xsna.izs
                                            public final Object invoke(Object obj5) {
                                                lq9 lq9Var3;
                                                Object failure;
                                                long j4 = longValue;
                                                ag8.a aVar = (ag8.a) obj5;
                                                izs<? super Long, ? extends R> izsVar2 = aVar.b;
                                                if (izsVar2 != 0 && (lq9Var3 = aVar.a) != null) {
                                                    try {
                                                        failure = izsVar2.invoke(Long.valueOf(j4));
                                                    } catch (Throwable th2) {
                                                        failure = new Result.Failure(th2);
                                                    }
                                                    lq9Var3.resumeWith(failure);
                                                }
                                                return s3q0.a;
                                            }
                                        });
                                        synchronized (qak0.c) {
                                            qh50<muk0> qh50Var19 = qak0.j.h;
                                            if (qh50Var19 != null) {
                                                z = qh50Var19.d();
                                            }
                                        }
                                        if (z) {
                                            qak0.a();
                                        }
                                        s3q0 s3q0Var2 = s3q0.a;
                                    } finally {
                                        Trace.endSection();
                                    }
                                }
                                Trace.beginSection("Recomposer:recompose");
                                try {
                                    recomposer5.O();
                                    synchronized (recomposer5.c) {
                                        try {
                                            ci50<hqj> ci50Var = recomposer5.i;
                                            hqj[] hqjVarArr = ci50Var.b;
                                            int i13 = ci50Var.d;
                                            for (int i14 = 0; i14 < i13; i14++) {
                                                list8.add(hqjVarArr[i14]);
                                            }
                                            recomposer5.i.g();
                                            s3q0 s3q0Var3 = s3q0.a;
                                        } finally {
                                        }
                                    }
                                    qh50Var15.f();
                                    qh50Var16.f();
                                    while (true) {
                                        if (list8.isEmpty() && list9.isEmpty()) {
                                            break;
                                        }
                                        try {
                                            int size = list8.size();
                                            for (int i15 = 0; i15 < size; i15++) {
                                                hqj hqjVar = (hqj) list8.get(i15);
                                                hqj M = recomposer5.M(hqjVar, qh50Var15);
                                                if (M != null) {
                                                    list10.add(M);
                                                    s3q0 s3q0Var4 = s3q0.a;
                                                }
                                                qh50Var16.e(hqjVar);
                                            }
                                            list8.clear();
                                            if (qh50Var15.d() || recomposer5.i.d != 0) {
                                                synchronized (recomposer5.c) {
                                                    try {
                                                        List<hqj> H = recomposer5.H();
                                                        int size2 = H.size();
                                                        for (int i16 = 0; i16 < size2; i16++) {
                                                            hqj hqjVar2 = H.get(i16);
                                                            if (!qh50Var16.a(hqjVar2) && hqjVar2.p(set5)) {
                                                                list8.add(hqjVar2);
                                                            }
                                                        }
                                                        ci50<hqj> ci50Var2 = recomposer5.i;
                                                        int i17 = ci50Var2.d;
                                                        int i18 = 0;
                                                        for (int i19 = 0; i19 < i17; i19++) {
                                                            hqj hqjVar3 = ci50Var2.b[i19];
                                                            if (!qh50Var16.a(hqjVar3) && !list8.contains(hqjVar3)) {
                                                                list8.add(hqjVar3);
                                                                i18++;
                                                            } else if (i18 > 0) {
                                                                hqj[] hqjVarArr2 = ci50Var2.b;
                                                                hqjVarArr2[i19 - i18] = hqjVarArr2[i19];
                                                            }
                                                        }
                                                        int i20 = i17 - i18;
                                                        Arrays.fill(ci50Var2.b, i20, i17, (Object) null);
                                                        ci50Var2.d = i20;
                                                        s3q0 s3q0Var5 = s3q0.a;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            if (list8.isEmpty()) {
                                                try {
                                                    yef0.c(list9, recomposer5);
                                                    while (!list9.isEmpty()) {
                                                        List<hqj> L = recomposer5.L(list9, qh50Var15);
                                                        qh50Var17.getClass();
                                                        Iterator<T> it = L.iterator();
                                                        while (it.hasNext()) {
                                                            qh50Var17.k(it.next());
                                                        }
                                                        yef0.c(list9, recomposer5);
                                                    }
                                                } catch (Throwable th2) {
                                                    recomposer5.N(th2, null);
                                                    yef0.a(recomposer5, list8, list9, list10, qh50Var17, qh50Var18, qh50Var15, qh50Var16);
                                                    s3q0Var = s3q0.a;
                                                    return s3q0Var;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            try {
                                                recomposer5.N(th3, null);
                                                yef0.a(recomposer5, list8, list9, list10, qh50Var17, qh50Var18, qh50Var15, qh50Var16);
                                                s3q0Var = s3q0.a;
                                                list8.clear();
                                                return s3q0Var;
                                            } catch (Throwable th4) {
                                                list8.clear();
                                                throw th4;
                                            }
                                        }
                                    }
                                    dak0 j4 = qak0.j();
                                    if (j4 instanceof uh50) {
                                        nop0Var = new mop0((uh50) j4, null, null, true, false);
                                        i12 = 0;
                                    } else {
                                        i12 = 0;
                                        nop0Var = new nop0(j4, null, true, false);
                                    }
                                    try {
                                        dak0 j5 = nop0Var.j();
                                        try {
                                            if (!list10.isEmpty()) {
                                                try {
                                                    int size3 = list10.size();
                                                    for (int i21 = i12; i21 < size3; i21++) {
                                                        qh50Var18.e((hqj) list10.get(i21));
                                                    }
                                                    int size4 = list10.size();
                                                    for (int i22 = i12; i22 < size4; i22++) {
                                                        ((hqj) list10.get(i22)).X();
                                                    }
                                                } catch (Throwable th5) {
                                                    try {
                                                        recomposer5.N(th5, null);
                                                        yef0.a(recomposer5, list8, list9, list10, qh50Var17, qh50Var18, qh50Var15, qh50Var16);
                                                        s3q0Var = s3q0.a;
                                                        return s3q0Var;
                                                    } finally {
                                                        list10.clear();
                                                    }
                                                }
                                            }
                                            if (qh50Var17.d()) {
                                                try {
                                                    qh50Var18.l(qh50Var17);
                                                    Object[] objArr6 = qh50Var17.b;
                                                    long[] jArr2 = qh50Var17.a;
                                                    j3 = 128;
                                                    int length2 = jArr2.length - 2;
                                                    if (length2 >= 0) {
                                                        int i23 = 0;
                                                        while (true) {
                                                            long j6 = jArr2[i23];
                                                            Object[] objArr7 = objArr6;
                                                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i24 = 8 - ((~(i23 - length2)) >>> 31);
                                                                for (int i25 = 0; i25 < i24; i25++) {
                                                                    if ((j6 & 255) < 128) {
                                                                        ((hqj) objArr7[(i23 << 3) + i25]).r();
                                                                    }
                                                                    j6 >>= 8;
                                                                }
                                                                if (i24 != 8) {
                                                                    break;
                                                                }
                                                            }
                                                            if (i23 == length2) {
                                                                break;
                                                            }
                                                            i23++;
                                                            objArr6 = objArr7;
                                                        }
                                                    }
                                                } catch (Throwable th6) {
                                                    try {
                                                        recomposer5.N(th6, null);
                                                        yef0.a(recomposer5, list8, list9, list10, qh50Var17, qh50Var18, qh50Var15, qh50Var16);
                                                        s3q0Var = s3q0.a;
                                                        dak0.q(j5);
                                                        return s3q0Var;
                                                    } finally {
                                                        qh50Var17.f();
                                                    }
                                                }
                                            } else {
                                                j3 = 128;
                                            }
                                            if (qh50Var18.d()) {
                                                try {
                                                    Object[] objArr8 = qh50Var18.b;
                                                    long[] jArr3 = qh50Var18.a;
                                                    int length3 = jArr3.length - 2;
                                                    if (length3 >= 0) {
                                                        int i26 = 0;
                                                        while (true) {
                                                            long j7 = jArr3[i26];
                                                            Object[] objArr9 = objArr8;
                                                            long[] jArr4 = jArr3;
                                                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i27 = 8 - ((~(i26 - length3)) >>> 31);
                                                                for (int i28 = 0; i28 < i27; i28++) {
                                                                    if ((j7 & 255) < j3) {
                                                                        ((hqj) objArr9[(i26 << 3) + i28]).q();
                                                                    }
                                                                    j7 >>= 8;
                                                                }
                                                                if (i27 != 8) {
                                                                    break;
                                                                }
                                                            }
                                                            if (i26 == length3) {
                                                                break;
                                                            }
                                                            i26++;
                                                            objArr8 = objArr9;
                                                            jArr3 = jArr4;
                                                        }
                                                    }
                                                } catch (Throwable th7) {
                                                    try {
                                                        recomposer5.N(th7, null);
                                                        yef0.a(recomposer5, list8, list9, list10, qh50Var17, qh50Var18, qh50Var15, qh50Var16);
                                                        s3q0Var = s3q0.a;
                                                        dak0.q(j5);
                                                        return s3q0Var;
                                                    } finally {
                                                        qh50Var18.f();
                                                    }
                                                }
                                            }
                                            s3q0 s3q0Var6 = s3q0.a;
                                            nop0Var.c();
                                            synchronized (recomposer5.c) {
                                                if (recomposer5.C() != null) {
                                                    androidx.compose.runtime.b.a("unexpected to get continuation here");
                                                }
                                            }
                                            qak0.j().m();
                                            qh50Var16.f();
                                            qh50Var15.f();
                                            recomposer5.q = null;
                                            Trace.endSection();
                                            return s3q0.a;
                                        } finally {
                                            dak0.q(j5);
                                        }
                                    } finally {
                                        nop0Var.c();
                                    }
                                } catch (Throwable th8) {
                                    throw th8;
                                }
                            }
                        };
                        this.L$0 = g830Var;
                        this.L$1 = list5;
                        this.L$2 = list2;
                        this.L$3 = list4;
                        this.L$4 = qh50Var3;
                        this.L$5 = qh50Var13;
                        this.L$6 = qh50Var14;
                        this.L$7 = set4;
                        this.L$8 = qh50Var4;
                        this.label = i3;
                        if (g830Var.k(izsVar, this) != coroutineSingletons2) {
                            List list8 = list4;
                            a2 = qh50Var4;
                            qh50Var12 = qh50Var3;
                            list = list5;
                            list3 = list8;
                            qh50Var10 = qh50Var14;
                            qh50Var11 = qh50Var13;
                            set3 = set4;
                            Recomposer recomposer22 = this.this$0;
                            synchronized (recomposer22.c) {
                            }
                        }
                    }
                }
                return coroutineSingletons2;
            }
            qh50 qh50Var15 = (qh50) this.L$8;
            set = (Set) this.L$7;
            qh50Var = (qh50) this.L$6;
            qh50Var2 = (qh50) this.L$5;
            qh50 qh50Var16 = (qh50) this.L$4;
            List list9 = (List) this.L$3;
            list2 = (List) this.L$2;
            List list10 = (List) this.L$1;
            g830 g830Var4 = (g830) this.L$0;
            kotlin.a.a(obj);
            qh50Var4 = qh50Var15;
            g830Var = g830Var4;
            list4 = list9;
            list5 = list10;
            qh50Var3 = qh50Var16;
            final Set set42 = set;
            final qh50 qh50Var132 = qh50Var2;
            final qh50 qh50Var142 = qh50Var;
            recomposer = this.this$0;
            utk0 utk0Var2 = Recomposer.z;
            if (recomposer.O()) {
            }
        }
    }
}
