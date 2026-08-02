package androidx.compose.runtime;

import android.os.Trace;
import androidx.compose.runtime.internal.AtomicInt;
import defpackage.am2;
import defpackage.bud;
import defpackage.cc4;
import defpackage.dmm0;
import defpackage.dvw;
import defpackage.hz40;
import defpackage.i2t0;
import defpackage.iz40;
import defpackage.j18;
import defpackage.jb30;
import defpackage.jid;
import defpackage.kb30;
import defpackage.lid;
import defpackage.mvg;
import defpackage.mz40;
import defpackage.np60;
import defpackage.ny61;
import defpackage.ows0;
import defpackage.q2t0;
import defpackage.qz10;
import defpackage.r630;
import defpackage.sus0;
import defpackage.tls;
import defpackage.tz01;
import defpackage.uz01;
import defpackage.wz40;
import defpackage.xy40;
import defpackage.zk6;
import defpackage.zls;
import defpackage.zm50;
import defpackage.zti0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lr630;", "parentFrameClock", "Lzy11;", "<anonymous>", "(Ltse;Lr630;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {615, 626}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements zls {
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
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(j jVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = jVar;
    }

    public static final void i(j jVar, List list, List list2, List list3, iz40 iz40Var, iz40 iz40Var2, iz40 iz40Var3, iz40 iz40Var4) {
        char c;
        long j;
        long j2;
        synchronized (jVar.c) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    bud budVar = (bud) list3.get(i);
                    budVar.d();
                    jVar.Q(budVar);
                }
                list3.clear();
                Object[] objArr = iz40Var.b;
                long[] jArr = iz40Var.a;
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
                                    bud budVar2 = (bud) objArr[(i2 << 3) + i4];
                                    budVar2.d();
                                    jVar.Q(budVar2);
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
                iz40Var.b();
                Object[] objArr2 = iz40Var2.b;
                long[] jArr2 = iz40Var2.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((bud) objArr2[(i5 << 3) + i7]).j();
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
                iz40Var2.b();
                iz40Var3.b();
                Object[] objArr3 = iz40Var4.b;
                long[] jArr3 = iz40Var4.a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    bud budVar3 = (bud) objArr3[(i8 << 3) + i10];
                                    budVar3.d();
                                    jVar.Q(budVar3);
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
                iz40Var4.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void k(List list, j jVar) {
        list.clear();
        synchronized (jVar.c) {
            try {
                ArrayList arrayList = jVar.k;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((kb30) arrayList.get(i));
                }
                jVar.k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.this$0, (Continuation) obj3);
        recomposer$runRecomposeAndApplyChanges$2.L$0 = (r630) obj2;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x013b -> B:6:0x0143). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x02be -> B:44:0x02b9). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r630 r630Var;
        iz40 a;
        iz40 a2;
        List list;
        Set set;
        final List list2;
        iz40 iz40Var;
        List list3;
        iz40 iz40Var2;
        final List list4;
        final iz40 iz40Var3;
        final List list5;
        final iz40 iz40Var4;
        j jVar;
        Object obj2;
        j18 j18Var;
        int i;
        CoroutineSingletons coroutineSingletons;
        r630 r630Var2;
        Set set2;
        iz40 iz40Var5;
        iz40 iz40Var6;
        iz40 iz40Var7;
        xy40 xy40Var;
        xy40 xy40Var2;
        int i2;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        int i4 = 2;
        int i5 = 1;
        if (i3 == 0) {
            kotlin.b.b(obj);
            r630Var = (r630) this.L$0;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            a = dmm0.a();
            iz40 a3 = dmm0.a();
            iz40 iz40Var8 = new iz40((Object) null);
            androidx.compose.runtime.collection.a aVar = new androidx.compose.runtime.collection.a(iz40Var8);
            a2 = dmm0.a();
            list = arrayList;
            set = aVar;
            list2 = arrayList2;
            iz40Var = iz40Var8;
            list3 = arrayList3;
            iz40Var2 = a3;
            synchronized (this.this$0.c) {
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                iz40 iz40Var9 = (iz40) this.L$8;
                Set set3 = (Set) this.L$7;
                iz40 iz40Var10 = (iz40) this.L$6;
                iz40 iz40Var11 = (iz40) this.L$5;
                iz40 iz40Var12 = (iz40) this.L$4;
                list3 = (List) this.L$3;
                list2 = (List) this.L$2;
                list = (List) this.L$1;
                r630 r630Var3 = (r630) this.L$0;
                kotlin.b.b(obj);
                a2 = iz40Var9;
                r630Var = r630Var3;
                j jVar2 = this.this$0;
                synchronized (jVar2.c) {
                    try {
                        i = i4;
                        if (jVar2.l.g()) {
                            hz40 hz40Var = jVar2.l;
                            if (hz40Var.f()) {
                                xy40Var2 = np60.b;
                                coroutineSingletons = coroutineSingletons2;
                                r630Var2 = r630Var;
                                set2 = set3;
                                iz40Var5 = iz40Var10;
                                iz40Var6 = iz40Var11;
                                iz40Var7 = iz40Var12;
                            } else {
                                xy40 xy40Var3 = new xy40((Object) null);
                                Object[] objArr = hz40Var.c;
                                long[] jArr = hz40Var.a;
                                coroutineSingletons = coroutineSingletons2;
                                int length = jArr.length - 2;
                                r630Var2 = r630Var;
                                set2 = set3;
                                iz40Var5 = iz40Var10;
                                if (length >= 0) {
                                    int i6 = 0;
                                    while (true) {
                                        long j = jArr[i6];
                                        iz40Var6 = iz40Var11;
                                        iz40Var7 = iz40Var12;
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i7 = 8;
                                            int i8 = 8 - ((~(i6 - length)) >>> 31);
                                            long j2 = j;
                                            int i9 = 0;
                                            while (i9 < i8) {
                                                if ((j2 & 255) < 128) {
                                                    Object obj3 = objArr[(i6 << 3) + i9];
                                                    i2 = i7;
                                                    if (obj3 instanceof xy40) {
                                                        xy40Var3.k((xy40) obj3);
                                                    } else {
                                                        xy40Var3.g(obj3);
                                                    }
                                                } else {
                                                    i2 = i7;
                                                }
                                                j2 >>= i2;
                                                i9++;
                                                i7 = i2;
                                            }
                                            if (i8 != i7) {
                                                break;
                                            }
                                        }
                                        if (i6 == length) {
                                            break;
                                        }
                                        i6++;
                                        iz40Var11 = iz40Var6;
                                        iz40Var12 = iz40Var7;
                                    }
                                } else {
                                    iz40Var6 = iz40Var11;
                                    iz40Var7 = iz40Var12;
                                }
                                xy40Var2 = xy40Var3;
                            }
                            jVar2.l.h();
                            zm50 zm50Var = jVar2.m;
                            zm50Var.a.h();
                            zm50Var.b.h();
                            jVar2.o.h();
                            xy40Var = new xy40(xy40Var2.b);
                            Object[] objArr2 = xy40Var2.a;
                            int i10 = xy40Var2.b;
                            for (int i11 = 0; i11 < i10; i11++) {
                                kb30 kb30Var = (kb30) objArr2[i11];
                                xy40Var.g(new Pair(kb30Var, jVar2.n.d(kb30Var)));
                            }
                            jVar2.n.h();
                        } else {
                            coroutineSingletons = coroutineSingletons2;
                            r630Var2 = r630Var;
                            set2 = set3;
                            iz40Var5 = iz40Var10;
                            iz40Var6 = iz40Var11;
                            iz40Var7 = iz40Var12;
                            xy40Var = np60.b;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Object[] objArr3 = xy40Var.a;
                int i12 = xy40Var.b;
                for (int i13 = 0; i13 < i12; i13++) {
                    Pair pair = (Pair) objArr3[i13];
                    kb30 kb30Var2 = (kb30) pair.getFirst();
                    jb30 jb30Var = (jb30) pair.getSecond();
                    if (jb30Var != null) {
                        bud b = kb30Var2.b();
                        zti0 zti0Var = b.N;
                        try {
                            zti0Var.g(b.x, b.O.D());
                            ows0 k = ((sus0) jb30Var.a()).k();
                            try {
                                k.n(new jid(0, zti0Var), k.t);
                                k.J();
                                k.e(true);
                                zti0Var.c();
                            } catch (Throwable th2) {
                                k.e(false);
                                throw th2;
                            }
                        } finally {
                            zti0Var.a();
                        }
                    }
                }
                i5 = 1;
                am2 am2Var = this.this$0.b;
                ((AtomicInt) am2Var.a).set(0);
                ((cc4) am2Var.b).b(new qz10(10));
                i4 = i;
                coroutineSingletons2 = coroutineSingletons;
                r630Var = r630Var2;
                set = set2;
                iz40Var = iz40Var5;
                iz40Var2 = iz40Var6;
                a = iz40Var7;
                synchronized (this.this$0.c) {
                }
                j jVar3 = this.this$0;
                this.L$0 = r630Var;
                this.L$1 = list;
                this.L$2 = list2;
                this.L$3 = list3;
                this.L$4 = a;
                this.L$5 = iz40Var2;
                this.L$6 = iz40Var;
                this.L$7 = set;
                this.L$8 = a2;
                this.label = i5;
                if (jVar3.G()) {
                    obj2 = zy11.a;
                } else {
                    j18 j18Var2 = new j18(i5, dvw.b(this));
                    j18Var2.u();
                    synchronized (jVar3.c) {
                        if (jVar3.G()) {
                            j18Var = j18Var2;
                        } else {
                            jVar3.r = j18Var2;
                            j18Var = null;
                        }
                    }
                    if (j18Var != null) {
                        j18Var.resumeWith(zy11.a);
                    }
                    obj2 = j18Var2.s();
                    if (obj2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        obj2 = zy11.a;
                    }
                }
                if (obj2 != coroutineSingletons2) {
                    List list6 = list;
                    iz40Var3 = a;
                    iz40Var4 = a2;
                    list4 = list3;
                    list5 = list6;
                    final Set set4 = set;
                    final iz40 iz40Var13 = iz40Var2;
                    final iz40 iz40Var14 = iz40Var;
                    jVar = this.this$0;
                    r0 r0Var = j.z;
                    if (jVar.P()) {
                        List list7 = list4;
                        a2 = iz40Var4;
                        a = iz40Var3;
                        list = list5;
                        list3 = list7;
                        iz40Var = iz40Var14;
                        iz40Var2 = iz40Var13;
                        set = set4;
                        synchronized (this.this$0.c) {
                        }
                    } else {
                        final j jVar4 = this.this$0;
                        tls tlsVar = new tls() { // from class: androidx.compose.runtime.i
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.tls
                            public final Object invoke(Object obj4) {
                                boolean D;
                                Object[] objArr4;
                                List list8;
                                List list9;
                                long j3;
                                List list10;
                                List list11;
                                List list12;
                                iz40 iz40Var15;
                                Object[] objArr5;
                                boolean z;
                                j jVar5 = j.this;
                                iz40 iz40Var16 = iz40Var14;
                                iz40 iz40Var17 = iz40Var4;
                                List list13 = list5;
                                List list14 = list2;
                                iz40 iz40Var18 = iz40Var3;
                                List list15 = list4;
                                iz40 iz40Var19 = iz40Var13;
                                Set set5 = set4;
                                long longValue = ((Long) obj4).longValue();
                                synchronized (jVar5.c) {
                                    D = jVar5.D();
                                }
                                boolean z2 = 0;
                                if (D) {
                                    Trace.beginSection("Recomposer:animation");
                                    try {
                                        jVar5.a.b.b(new zk6(longValue, 0));
                                        synchronized (q2t0.c) {
                                            iz40 iz40Var20 = q2t0.j.h;
                                            if (iz40Var20 != null) {
                                                z = iz40Var20.h();
                                            }
                                        }
                                        if (z) {
                                            q2t0.a();
                                        }
                                    } finally {
                                    }
                                }
                                Trace.beginSection("Recomposer:recompose");
                                try {
                                    jVar5.P();
                                    synchronized (jVar5.c) {
                                        try {
                                            wz40 wz40Var = jVar5.i;
                                            Object[] objArr6 = wz40Var.a;
                                            int i14 = wz40Var.c;
                                            for (int i15 = 0; i15 < i14; i15++) {
                                                list13.add((bud) objArr6[i15]);
                                            }
                                            jVar5.i.g();
                                        } finally {
                                        }
                                    }
                                    iz40Var16.b();
                                    iz40Var17.b();
                                    while (true) {
                                        if (list13.isEmpty() && list14.isEmpty()) {
                                            break;
                                        }
                                        try {
                                            int size = list13.size();
                                            for (int i16 = 0; i16 < size; i16++) {
                                                bud budVar = (bud) list13.get(i16);
                                                bud N = jVar5.N(budVar, iz40Var16);
                                                if (N != null) {
                                                    list15.add(N);
                                                }
                                                iz40Var17.a(budVar);
                                            }
                                            list13.clear();
                                            if (iz40Var16.h() || jVar5.i.c != 0) {
                                                synchronized (jVar5.c) {
                                                    try {
                                                        List I = jVar5.I();
                                                        int size2 = I.size();
                                                        for (int i17 = 0; i17 < size2; i17++) {
                                                            bud budVar2 = (bud) I.get(i17);
                                                            if (!iz40Var17.c(budVar2) && budVar2.w(set5)) {
                                                                list13.add(budVar2);
                                                            }
                                                        }
                                                        wz40 wz40Var2 = jVar5.i;
                                                        int i18 = wz40Var2.c;
                                                        int i19 = 0;
                                                        int i20 = 0;
                                                        while (true) {
                                                            objArr4 = wz40Var2.a;
                                                            if (i19 >= i18) {
                                                                break;
                                                            }
                                                            bud budVar3 = (bud) objArr4[i19];
                                                            if (!iz40Var17.c(budVar3) && !list13.contains(budVar3)) {
                                                                list13.add(budVar3);
                                                                i20++;
                                                            } else if (i20 > 0) {
                                                                Object[] objArr7 = wz40Var2.a;
                                                                objArr7[i19 - i20] = objArr7[i19];
                                                            }
                                                            i19++;
                                                        }
                                                        int i21 = i18 - i20;
                                                        Arrays.fill(objArr4, i21, i18, (Object) null);
                                                        wz40Var2.c = i21;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            if (list13.isEmpty()) {
                                                try {
                                                    Recomposer$runRecomposeAndApplyChanges$2.k(list14, jVar5);
                                                    while (!list14.isEmpty()) {
                                                        List M = jVar5.M(list14, iz40Var16);
                                                        iz40Var18.getClass();
                                                        Iterator it = M.iterator();
                                                        while (it.hasNext()) {
                                                            iz40Var18.k(it.next());
                                                        }
                                                        Recomposer$runRecomposeAndApplyChanges$2.k(list14, jVar5);
                                                    }
                                                } catch (Throwable th3) {
                                                    jVar5.O(th3, null);
                                                    Recomposer$runRecomposeAndApplyChanges$2.i(jVar5, list13, list14, list15, iz40Var18, iz40Var19, iz40Var16, iz40Var17);
                                                }
                                            }
                                            z2 = 0;
                                        } catch (Throwable th4) {
                                            try {
                                                jVar5.O(th4, null);
                                                Recomposer$runRecomposeAndApplyChanges$2.i(jVar5, list13, list14, list15, iz40Var18, iz40Var19, iz40Var16, iz40Var17);
                                            } finally {
                                                list13.clear();
                                            }
                                        }
                                    }
                                    i2t0 j4 = q2t0.j();
                                    i2t0 tz01Var = j4 instanceof mz40 ? new tz01((mz40) j4, null, null, true, false) : new uz01(j4, null, true, z2);
                                    try {
                                        i2t0 j5 = tz01Var.j();
                                        try {
                                            if (!list15.isEmpty()) {
                                                try {
                                                    int size3 = list15.size();
                                                    for (int i22 = z2; i22 < size3; i22++) {
                                                        iz40Var19.a((bud) list15.get(i22));
                                                    }
                                                    int size4 = list15.size();
                                                    for (int i23 = z2; i23 < size4; i23++) {
                                                        ((bud) list15.get(i23)).g();
                                                    }
                                                } catch (Throwable th5) {
                                                    try {
                                                        jVar5.O(th5, null);
                                                        Recomposer$runRecomposeAndApplyChanges$2.i(jVar5, list13, list14, list15, iz40Var18, iz40Var19, iz40Var16, iz40Var17);
                                                        i2t0.q(j5);
                                                        return zy11.a;
                                                    } finally {
                                                        list15.clear();
                                                    }
                                                }
                                            }
                                            if (iz40Var18.h()) {
                                                try {
                                                    iz40Var19.j(iz40Var18);
                                                    Object[] objArr8 = iz40Var18.b;
                                                    long[] jArr2 = iz40Var18.a;
                                                    int length2 = jArr2.length - 2;
                                                    if (length2 >= 0) {
                                                        int i24 = 0;
                                                        j3 = 255;
                                                        while (true) {
                                                            long j6 = jArr2[i24];
                                                            list8 = list13;
                                                            list9 = list14;
                                                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i25 = 8 - ((~(i24 - length2)) >>> 31);
                                                                for (int i26 = 0; i26 < i25; i26++) {
                                                                    if ((j6 & 255) < 128) {
                                                                        try {
                                                                            ((bud) objArr8[(i24 << 3) + i26]).i();
                                                                        } catch (Throwable th6) {
                                                                            th = th6;
                                                                            try {
                                                                                jVar5.O(th, null);
                                                                                Recomposer$runRecomposeAndApplyChanges$2.i(jVar5, list8, list9, list15, iz40Var18, iz40Var19, iz40Var16, iz40Var17);
                                                                                i2t0.q(j5);
                                                                                return zy11.a;
                                                                            } finally {
                                                                                iz40Var18.b();
                                                                            }
                                                                        }
                                                                    }
                                                                    j6 >>= 8;
                                                                }
                                                                if (i25 != 8) {
                                                                    break;
                                                                }
                                                            }
                                                            if (i24 == length2) {
                                                                break;
                                                            }
                                                            i24++;
                                                            list13 = list8;
                                                            list14 = list9;
                                                        }
                                                    } else {
                                                        list8 = list13;
                                                        list9 = list14;
                                                        j3 = 255;
                                                    }
                                                    list13 = list8;
                                                    list14 = list9;
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    list8 = list13;
                                                    list9 = list14;
                                                }
                                            } else {
                                                j3 = 255;
                                            }
                                            if (iz40Var19.h()) {
                                                try {
                                                    Object[] objArr9 = iz40Var19.b;
                                                    long[] jArr3 = iz40Var19.a;
                                                    int length3 = jArr3.length - 2;
                                                    if (length3 >= 0) {
                                                        list10 = list13;
                                                        list11 = list14;
                                                        int i27 = 0;
                                                        while (true) {
                                                            try {
                                                                long j7 = jArr3[i27];
                                                                list12 = list15;
                                                                iz40Var15 = iz40Var18;
                                                                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i28 = 8 - ((~(i27 - length3)) >>> 31);
                                                                    int i29 = 0;
                                                                    while (i29 < i28) {
                                                                        if ((j7 & j3) < 128) {
                                                                            try {
                                                                                ((bud) objArr9[(i27 << 3) + i29]).j();
                                                                            } catch (Throwable th8) {
                                                                                th = th8;
                                                                                try {
                                                                                    jVar5.O(th, null);
                                                                                    Recomposer$runRecomposeAndApplyChanges$2.i(jVar5, list10, list11, list12, iz40Var15, iz40Var19, iz40Var16, iz40Var17);
                                                                                    i2t0.q(j5);
                                                                                    return zy11.a;
                                                                                } finally {
                                                                                    iz40Var19.b();
                                                                                }
                                                                            }
                                                                        }
                                                                        j7 >>= 8;
                                                                        i29++;
                                                                        objArr9 = objArr9;
                                                                    }
                                                                    objArr5 = objArr9;
                                                                    if (i28 != 8) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    objArr5 = objArr9;
                                                                }
                                                                if (i27 == length3) {
                                                                    break;
                                                                }
                                                                i27++;
                                                                iz40Var18 = iz40Var15;
                                                                list15 = list12;
                                                                objArr9 = objArr5;
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                                list12 = list15;
                                                                iz40Var15 = iz40Var18;
                                                                jVar5.O(th, null);
                                                                Recomposer$runRecomposeAndApplyChanges$2.i(jVar5, list10, list11, list12, iz40Var15, iz40Var19, iz40Var16, iz40Var17);
                                                                i2t0.q(j5);
                                                                return zy11.a;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    list10 = list13;
                                                    list11 = list14;
                                                }
                                            }
                                            i2t0.q(j5);
                                            tz01Var.c();
                                            synchronized (jVar5.c) {
                                                if (jVar5.C() != null) {
                                                    lid.a("unexpected to get continuation here");
                                                }
                                            }
                                            q2t0.j().m();
                                            iz40Var17.b();
                                            iz40Var16.b();
                                            jVar5.q = null;
                                            return zy11.a;
                                        } catch (Throwable th11) {
                                            i2t0.q(j5);
                                            throw th11;
                                        }
                                    } finally {
                                        tz01Var.c();
                                    }
                                } finally {
                                }
                            }
                        };
                        this.L$0 = r630Var;
                        this.L$1 = list5;
                        this.L$2 = list2;
                        this.L$3 = list4;
                        this.L$4 = iz40Var3;
                        this.L$5 = iz40Var13;
                        this.L$6 = iz40Var14;
                        this.L$7 = set4;
                        this.L$8 = iz40Var4;
                        this.label = i4;
                        if (r630Var.v(tlsVar, this) != coroutineSingletons2) {
                            List list8 = list4;
                            a2 = iz40Var4;
                            iz40Var12 = iz40Var3;
                            list = list5;
                            list3 = list8;
                            iz40Var10 = iz40Var14;
                            iz40Var11 = iz40Var13;
                            set3 = set4;
                            j jVar22 = this.this$0;
                            synchronized (jVar22.c) {
                            }
                        }
                    }
                }
                return coroutineSingletons2;
            }
            iz40 iz40Var15 = (iz40) this.L$8;
            set = (Set) this.L$7;
            iz40Var = (iz40) this.L$6;
            iz40Var2 = (iz40) this.L$5;
            iz40 iz40Var16 = (iz40) this.L$4;
            List list9 = (List) this.L$3;
            list2 = (List) this.L$2;
            List list10 = (List) this.L$1;
            r630 r630Var4 = (r630) this.L$0;
            kotlin.b.b(obj);
            iz40Var4 = iz40Var15;
            r630Var = r630Var4;
            list4 = list9;
            list5 = list10;
            iz40Var3 = iz40Var16;
            final Set set42 = set;
            final iz40 iz40Var132 = iz40Var2;
            final iz40 iz40Var142 = iz40Var;
            jVar = this.this$0;
            r0 r0Var2 = j.z;
            if (jVar.P()) {
            }
        }
    }
}
