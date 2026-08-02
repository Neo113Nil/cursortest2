package com.yandex.plus.home.common.utils;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.p;
import defpackage.bvf0;
import defpackage.eja1;
import defpackage.ike;
import defpackage.ny61;
import defpackage.o6j0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.vqb;
import defpackage.wls;
import defpackage.zls;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public abstract class a {
    public static final Object a(o6j0 o6j0Var, Continuation continuation) {
        return bvf0.n(new CoroutinesExtKt$await$2(o6j0Var, null), continuation);
    }

    public static void b(tse tseVar) {
        kotlinx.coroutines.a.g(tseVar.getCoroutineContext(), null);
    }

    public static final p c(Fragment fragment) {
        return eja1.s(fragment.getViewLifecycleOwner());
    }

    public static final Object d(ArrayList arrayList, ike ikeVar, zls zlsVar, Continuation continuation) {
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(tje.h(ikeVar, null, null, new CoroutinesExtKt$parallelMap$2$1(zlsVar, ikeVar, it.next(), null), 3));
        }
        return kotlinx.coroutines.a.b(arrayList2, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0150 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r18v7, types: [tls] */
    /* JADX WARN: Type inference failed for: r7v11, types: [tls] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x018c -> B:18:0x006a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(int i, long j, long j2, double d, vqb vqbVar, tls tlsVar, ContinuationImpl continuationImpl) {
        CoroutinesExtKt$retry$1 coroutinesExtKt$retry$1;
        int i2;
        long j3;
        double d2;
        vqb vqbVar2;
        tls tlsVar2;
        Ref$LongRef ref$LongRef;
        CoroutinesExtKt$retry$1 coroutinesExtKt$retry$12;
        int i3;
        int i4;
        int i5;
        long j4;
        CoroutinesExtKt$retry$1 coroutinesExtKt$retry$13;
        vqb vqbVar3;
        long j5;
        long j6;
        double d3;
        tls tlsVar3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Throwable th;
        Result.Failure failure;
        vqb vqbVar4;
        int i11;
        vqb vqbVar5;
        Throwable a;
        Object i12;
        CoroutineSingletons coroutineSingletons;
        int i13;
        vqb vqbVar6;
        TimeoutCancellationException e;
        long j7;
        try {
            if (continuationImpl instanceof CoroutinesExtKt$retry$1) {
                coroutinesExtKt$retry$1 = (CoroutinesExtKt$retry$1) continuationImpl;
                int i14 = coroutinesExtKt$retry$1.label;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    coroutinesExtKt$retry$1.label = i14 - Integer.MIN_VALUE;
                    Object obj = coroutinesExtKt$retry$1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = coroutinesExtKt$retry$1.label;
                    if (i2 != 0) {
                        kotlin.b.b(obj);
                        Ref$LongRef ref$LongRef2 = new Ref$LongRef();
                        j3 = j;
                        ref$LongRef2.element = j3;
                        d2 = d;
                        vqbVar2 = vqbVar;
                        tlsVar2 = tlsVar;
                        ref$LongRef = ref$LongRef2;
                        coroutinesExtKt$retry$12 = coroutinesExtKt$retry$1;
                        i3 = i - 1;
                        i4 = 0;
                        i5 = i;
                        j4 = j2;
                        if (i4 >= i3) {
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                kotlin.b.b(obj);
                                return obj;
                            }
                            i11 = coroutinesExtKt$retry$1.I$2;
                            int i15 = coroutinesExtKt$retry$1.I$1;
                            double d4 = coroutinesExtKt$retry$1.D$0;
                            long j8 = coroutinesExtKt$retry$1.J$1;
                            long j9 = coroutinesExtKt$retry$1.J$0;
                            int i16 = coroutinesExtKt$retry$1.I$0;
                            Ref$LongRef ref$LongRef3 = (Ref$LongRef) coroutinesExtKt$retry$1.L$2;
                            tls tlsVar4 = (tls) coroutinesExtKt$retry$1.L$1;
                            ?? r7 = (tls) coroutinesExtKt$retry$1.L$0;
                            kotlin.b.b(obj);
                            i13 = i15;
                            vqbVar2 = r7;
                            d2 = d4;
                            coroutinesExtKt$retry$12 = coroutinesExtKt$retry$1;
                            i5 = i16;
                            tlsVar2 = tlsVar4;
                            coroutineSingletons = coroutineSingletons2;
                            ref$LongRef = ref$LongRef3;
                            j4 = j8;
                            j5 = j9;
                            int i17 = i11;
                            j7 = (long) (ref$LongRef.element * d2);
                            if (j7 > j4) {
                                j7 = j4;
                            }
                            ref$LongRef.element = j7;
                            i4 = i17 + 1;
                            coroutineSingletons2 = coroutineSingletons;
                            j3 = j5;
                            i3 = i13;
                            if (i4 >= i3) {
                                coroutinesExtKt$retry$12.L$0 = null;
                                coroutinesExtKt$retry$12.L$1 = null;
                                coroutinesExtKt$retry$12.L$2 = null;
                                coroutinesExtKt$retry$12.I$0 = i5;
                                coroutinesExtKt$retry$12.J$0 = j3;
                                coroutinesExtKt$retry$12.J$1 = j4;
                                coroutinesExtKt$retry$12.D$0 = d2;
                                coroutinesExtKt$retry$12.label = 3;
                                Object invoke = tlsVar2.invoke(coroutinesExtKt$retry$12);
                                return invoke == coroutineSingletons2 ? coroutineSingletons2 : invoke;
                            }
                            try {
                            } catch (TimeoutCancellationException e2) {
                                e = e2;
                                vqbVar6 = vqbVar2;
                                coroutinesExtKt$retry$13 = coroutinesExtKt$retry$12;
                                double d5 = d2;
                                i6 = i5;
                                tlsVar3 = tlsVar2;
                                d3 = d5;
                                long j10 = j3;
                                i9 = i4;
                                j6 = j4;
                                i8 = i9;
                                i7 = i3;
                                i10 = 0;
                                j5 = j10;
                                failure = new Result.Failure(e);
                                vqbVar4 = vqbVar6;
                                int i18 = i9;
                                int i19 = i10;
                                i11 = i8;
                                CoroutinesExtKt$retry$1 coroutinesExtKt$retry$14 = coroutinesExtKt$retry$13;
                                Result.Failure failure2 = failure;
                                CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                                vqbVar5 = vqbVar4;
                                a = Result.a(failure2);
                                if (a != null) {
                                }
                                long j11 = ref$LongRef.element;
                                coroutinesExtKt$retry$14.L$0 = vqbVar5;
                                coroutinesExtKt$retry$14.L$1 = tlsVar3;
                                coroutinesExtKt$retry$14.L$2 = ref$LongRef;
                                coroutinesExtKt$retry$14.L$3 = null;
                                coroutinesExtKt$retry$14.L$4 = null;
                                coroutinesExtKt$retry$14.L$5 = null;
                                coroutinesExtKt$retry$14.L$6 = null;
                                coroutinesExtKt$retry$14.L$7 = null;
                                coroutinesExtKt$retry$14.I$0 = i6;
                                coroutinesExtKt$retry$14.J$0 = j5;
                                coroutinesExtKt$retry$14.J$1 = j6;
                                coroutinesExtKt$retry$14.D$0 = d3;
                                coroutinesExtKt$retry$14.I$1 = i7;
                                coroutinesExtKt$retry$14.I$2 = i11;
                                coroutinesExtKt$retry$14.I$3 = i18;
                                coroutinesExtKt$retry$14.I$4 = i19;
                                coroutinesExtKt$retry$14.label = 2;
                                i12 = kotlinx.coroutines.a.i(j11, coroutinesExtKt$retry$14);
                                coroutineSingletons = coroutineSingletons3;
                                if (i12 != coroutineSingletons) {
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                vqbVar3 = vqbVar2;
                                coroutinesExtKt$retry$13 = coroutinesExtKt$retry$12;
                                double d6 = d2;
                                i6 = i5;
                                tlsVar3 = tlsVar2;
                                d3 = d6;
                                long j12 = j3;
                                i9 = i4;
                                j6 = j4;
                                i8 = i9;
                                i7 = i3;
                                i10 = 0;
                                j5 = j12;
                                failure = new Result.Failure(th);
                                vqbVar4 = vqbVar3;
                                int i182 = i9;
                                int i192 = i10;
                                i11 = i8;
                                CoroutinesExtKt$retry$1 coroutinesExtKt$retry$142 = coroutinesExtKt$retry$13;
                                Result.Failure failure22 = failure;
                                CoroutineSingletons coroutineSingletons32 = coroutineSingletons2;
                                vqbVar5 = vqbVar4;
                                a = Result.a(failure22);
                                if (a != null) {
                                }
                                long j112 = ref$LongRef.element;
                                coroutinesExtKt$retry$142.L$0 = vqbVar5;
                                coroutinesExtKt$retry$142.L$1 = tlsVar3;
                                coroutinesExtKt$retry$142.L$2 = ref$LongRef;
                                coroutinesExtKt$retry$142.L$3 = null;
                                coroutinesExtKt$retry$142.L$4 = null;
                                coroutinesExtKt$retry$142.L$5 = null;
                                coroutinesExtKt$retry$142.L$6 = null;
                                coroutinesExtKt$retry$142.L$7 = null;
                                coroutinesExtKt$retry$142.I$0 = i6;
                                coroutinesExtKt$retry$142.J$0 = j5;
                                coroutinesExtKt$retry$142.J$1 = j6;
                                coroutinesExtKt$retry$142.D$0 = d3;
                                coroutinesExtKt$retry$142.I$1 = i7;
                                coroutinesExtKt$retry$142.I$2 = i11;
                                coroutinesExtKt$retry$142.I$3 = i182;
                                coroutinesExtKt$retry$142.I$4 = i192;
                                coroutinesExtKt$retry$142.label = 2;
                                i12 = kotlinx.coroutines.a.i(j112, coroutinesExtKt$retry$142);
                                coroutineSingletons = coroutineSingletons32;
                                if (i12 != coroutineSingletons) {
                                }
                            }
                            coroutinesExtKt$retry$12.L$0 = vqbVar2;
                            coroutinesExtKt$retry$12.L$1 = tlsVar2;
                            coroutinesExtKt$retry$12.L$2 = ref$LongRef;
                            coroutinesExtKt$retry$12.L$3 = null;
                            coroutinesExtKt$retry$12.L$4 = null;
                            coroutinesExtKt$retry$12.L$5 = null;
                            coroutinesExtKt$retry$12.L$6 = null;
                            coroutinesExtKt$retry$12.L$7 = null;
                            coroutinesExtKt$retry$12.I$0 = i5;
                            coroutinesExtKt$retry$12.J$0 = j3;
                            coroutinesExtKt$retry$12.J$1 = j4;
                            coroutinesExtKt$retry$12.D$0 = d2;
                            coroutinesExtKt$retry$12.I$1 = i3;
                            coroutinesExtKt$retry$12.I$2 = i4;
                            coroutinesExtKt$retry$12.I$3 = i4;
                            coroutinesExtKt$retry$12.I$4 = 0;
                            coroutinesExtKt$retry$12.I$5 = 0;
                            coroutinesExtKt$retry$12.I$6 = 0;
                            coroutinesExtKt$retry$12.I$7 = 0;
                            coroutinesExtKt$retry$12.I$8 = 0;
                            coroutinesExtKt$retry$12.label = 1;
                            Object invoke2 = tlsVar2.invoke(coroutinesExtKt$retry$12);
                            return invoke2 == coroutineSingletons2 ? coroutineSingletons2 : invoke2;
                        }
                        i10 = coroutinesExtKt$retry$1.I$4;
                        i9 = coroutinesExtKt$retry$1.I$3;
                        i8 = coroutinesExtKt$retry$1.I$2;
                        i7 = coroutinesExtKt$retry$1.I$1;
                        d3 = coroutinesExtKt$retry$1.D$0;
                        j6 = coroutinesExtKt$retry$1.J$1;
                        j5 = coroutinesExtKt$retry$1.J$0;
                        i6 = coroutinesExtKt$retry$1.I$0;
                        ref$LongRef = (Ref$LongRef) coroutinesExtKt$retry$1.L$2;
                        tlsVar3 = (tls) coroutinesExtKt$retry$1.L$1;
                        ?? r18 = (tls) coroutinesExtKt$retry$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            return obj;
                        } catch (TimeoutCancellationException e3) {
                            e = e3;
                            coroutinesExtKt$retry$13 = coroutinesExtKt$retry$1;
                            vqbVar6 = r18;
                            failure = new Result.Failure(e);
                            vqbVar4 = vqbVar6;
                            int i1822 = i9;
                            int i1922 = i10;
                            i11 = i8;
                            CoroutinesExtKt$retry$1 coroutinesExtKt$retry$1422 = coroutinesExtKt$retry$13;
                            Result.Failure failure222 = failure;
                            CoroutineSingletons coroutineSingletons322 = coroutineSingletons2;
                            vqbVar5 = vqbVar4;
                            a = Result.a(failure222);
                            if (a != null && vqbVar5 != null) {
                                vqbVar5.invoke(a);
                            }
                            long j1122 = ref$LongRef.element;
                            coroutinesExtKt$retry$1422.L$0 = vqbVar5;
                            coroutinesExtKt$retry$1422.L$1 = tlsVar3;
                            coroutinesExtKt$retry$1422.L$2 = ref$LongRef;
                            coroutinesExtKt$retry$1422.L$3 = null;
                            coroutinesExtKt$retry$1422.L$4 = null;
                            coroutinesExtKt$retry$1422.L$5 = null;
                            coroutinesExtKt$retry$1422.L$6 = null;
                            coroutinesExtKt$retry$1422.L$7 = null;
                            coroutinesExtKt$retry$1422.I$0 = i6;
                            coroutinesExtKt$retry$1422.J$0 = j5;
                            coroutinesExtKt$retry$1422.J$1 = j6;
                            coroutinesExtKt$retry$1422.D$0 = d3;
                            coroutinesExtKt$retry$1422.I$1 = i7;
                            coroutinesExtKt$retry$1422.I$2 = i11;
                            coroutinesExtKt$retry$1422.I$3 = i1822;
                            coroutinesExtKt$retry$1422.I$4 = i1922;
                            coroutinesExtKt$retry$1422.label = 2;
                            i12 = kotlinx.coroutines.a.i(j1122, coroutinesExtKt$retry$1422);
                            coroutineSingletons = coroutineSingletons322;
                            if (i12 != coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            long j13 = j6;
                            coroutinesExtKt$retry$12 = coroutinesExtKt$retry$1422;
                            i13 = i7;
                            j4 = j13;
                            i5 = i6;
                            double d7 = d3;
                            vqbVar2 = vqbVar5;
                            tlsVar2 = tlsVar3;
                            d2 = d7;
                            int i172 = i11;
                            j7 = (long) (ref$LongRef.element * d2);
                            if (j7 > j4) {
                            }
                            ref$LongRef.element = j7;
                            i4 = i172 + 1;
                            coroutineSingletons2 = coroutineSingletons;
                            j3 = j5;
                            i3 = i13;
                            if (i4 >= i3) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            coroutinesExtKt$retry$13 = coroutinesExtKt$retry$1;
                            vqbVar3 = r18;
                            failure = new Result.Failure(th);
                            vqbVar4 = vqbVar3;
                            int i18222 = i9;
                            int i19222 = i10;
                            i11 = i8;
                            CoroutinesExtKt$retry$1 coroutinesExtKt$retry$14222 = coroutinesExtKt$retry$13;
                            Result.Failure failure2222 = failure;
                            CoroutineSingletons coroutineSingletons3222 = coroutineSingletons2;
                            vqbVar5 = vqbVar4;
                            a = Result.a(failure2222);
                            if (a != null) {
                                vqbVar5.invoke(a);
                            }
                            long j11222 = ref$LongRef.element;
                            coroutinesExtKt$retry$14222.L$0 = vqbVar5;
                            coroutinesExtKt$retry$14222.L$1 = tlsVar3;
                            coroutinesExtKt$retry$14222.L$2 = ref$LongRef;
                            coroutinesExtKt$retry$14222.L$3 = null;
                            coroutinesExtKt$retry$14222.L$4 = null;
                            coroutinesExtKt$retry$14222.L$5 = null;
                            coroutinesExtKt$retry$14222.L$6 = null;
                            coroutinesExtKt$retry$14222.L$7 = null;
                            coroutinesExtKt$retry$14222.I$0 = i6;
                            coroutinesExtKt$retry$14222.J$0 = j5;
                            coroutinesExtKt$retry$14222.J$1 = j6;
                            coroutinesExtKt$retry$14222.D$0 = d3;
                            coroutinesExtKt$retry$14222.I$1 = i7;
                            coroutinesExtKt$retry$14222.I$2 = i11;
                            coroutinesExtKt$retry$14222.I$3 = i18222;
                            coroutinesExtKt$retry$14222.I$4 = i19222;
                            coroutinesExtKt$retry$14222.label = 2;
                            i12 = kotlinx.coroutines.a.i(j11222, coroutinesExtKt$retry$14222);
                            coroutineSingletons = coroutineSingletons3222;
                            if (i12 != coroutineSingletons) {
                            }
                        }
                    }
                }
            }
            if (i2 != 0) {
            }
        } catch (CancellationException e4) {
            throw e4;
        }
        coroutinesExtKt$retry$1 = new CoroutinesExtKt$retry$1(continuationImpl);
        Object obj2 = coroutinesExtKt$retry$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = coroutinesExtKt$retry$1.label;
    }

    public static final void g(tse tseVar, long j, wls wlsVar) {
        tje.N(tseVar, null, null, new CoroutinesExtKt$startCountdown$1(j, wlsVar, null), 3);
    }
}
