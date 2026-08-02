package xsna;

import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.a0t;
import xsna.b6l;
import xsna.bur;
import xsna.hcj0;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;
import xsna.t9g;
import xsna.yzs;

/* compiled from: ReportViewModel.kt */
/* loaded from: classes4.dex */
public final class n6g0 extends nyt0 {
    public final utk0 b;
    public final utk0 c;
    public final utk0 d;
    public final utk0 e;
    public final utk0 f;
    public final b8f0 g;
    public long h;
    public boolean i;
    public final Object j;
    public final b8f0 k;
    public final caj0 l;
    public final z7f0 m;

    /* compiled from: ReportViewModel.kt */
    @b6l(c = "com.vk.overlaymenu.feature.report.ReportViewModel$state$1", f = "ReportViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements a0t<Boolean, Boolean, Boolean, String, spj<? super d6g0>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        /* synthetic */ boolean Z$1;
        /* synthetic */ boolean Z$2;
        int label;

        @Override // xsna.a0t
        public final Object invoke(Boolean bool, Boolean bool2, Boolean bool3, String str, spj<? super d6g0> spjVar) {
            boolean booleanValue = bool.booleanValue();
            boolean booleanValue2 = bool2.booleanValue();
            boolean booleanValue3 = bool3.booleanValue();
            a aVar = new a(5, spjVar);
            aVar.Z$0 = booleanValue;
            aVar.Z$1 = booleanValue2;
            aVar.Z$2 = booleanValue3;
            aVar.L$0 = str;
            return aVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            boolean z2 = this.Z$1;
            boolean z3 = this.Z$2;
            String str = (String) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return new d6g0(str, z3, z, z2);
        }
    }

    public n6g0() {
        utk0 a2 = vtk0.a(Boolean.TRUE);
        this.b = a2;
        Boolean bool = Boolean.FALSE;
        utk0 a3 = vtk0.a(bool);
        this.c = a3;
        utk0 a4 = vtk0.a(bool);
        this.d = a4;
        utk0 a5 = vtk0.a(null);
        this.e = a5;
        utk0 a6 = vtk0.a("");
        this.f = a6;
        this.g = rsr.f(a6);
        this.h = -1L;
        this.j = msy.a(LazyThreadSafetyMode.NONE, new c6(25));
        final a aVar = new a(5, null);
        final ksr[] ksrVarArr = {a3, a4, a2, a5};
        this.k = rsr.w(new ksr<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2

            /* compiled from: Zip.kt */
            @b6l(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", l = {259, 258}, m = "invokeSuspend")
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements yzs<lsr<Object>, Object[], spj<? super s3q0>, Object> {
                final /* synthetic */ a0t $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(spj spjVar, a0t a0tVar) {
                    super(3, spjVar);
                    this.$transform$inlined = a0tVar;
                }

                @Override // xsna.yzs
                public final Object invoke(lsr<Object> lsrVar, Object[] objArr, spj<? super s3q0> spjVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(spjVar, this.$transform$inlined);
                    anonymousClass2.L$0 = lsrVar;
                    anonymousClass2.L$1 = objArr;
                    return anonymousClass2.invokeSuspend(s3q0.a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
                
                    if (r1.emit(r11, r10) == r0) goto L15;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
                
                    if (r11 == r0) goto L15;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    lsr lsrVar;
                    AnonymousClass2 anonymousClass2;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        a.a(obj);
                        lsrVar = (lsr) this.L$0;
                        Object[] objArr = (Object[]) this.L$1;
                        a0t a0tVar = this.$transform$inlined;
                        Object obj2 = objArr[0];
                        Object obj3 = objArr[1];
                        Object obj4 = objArr[2];
                        Object obj5 = objArr[3];
                        this.L$0 = lsrVar;
                        this.label = 1;
                        anonymousClass2 = this;
                        obj = a0tVar.invoke(obj2, obj3, obj4, obj5, anonymousClass2);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            a.a(obj);
                            return s3q0.a;
                        }
                        lsrVar = (lsr) this.L$0;
                        a.a(obj);
                        anonymousClass2 = this;
                    }
                    anonymousClass2.L$0 = null;
                    anonymousClass2.label = 2;
                }
            }

            @Override // xsna.ksr
            public final Object collect(lsr<? super Object> lsrVar, spj spjVar) {
                Object a7 = t9g.a(spjVar, lsrVar, bur.b, new AnonymousClass2(null, aVar), ksrVarArr);
                return a7 == CoroutineSingletons.COROUTINE_SUSPENDED ? a7 : s3q0.a;
            }
        }, fai.t(this), hcj0.a.b, d6g0.e);
        caj0 b = lyd.b(0, 0, null, 7);
        this.l = b;
        this.m = rsr.e(b);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(n6g0 n6g0Var, String str, String str2, ContinuationImpl continuationImpl) {
        l6g0 l6g0Var;
        int i;
        n6g0Var.getClass();
        if (continuationImpl instanceof l6g0) {
            l6g0Var = (l6g0) continuationImpl;
            int i2 = l6g0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l6g0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = l6g0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = l6g0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    m6g0 m6g0Var = new m6g0(str, n6g0Var, str2, null);
                    l6g0Var.L$0 = null;
                    l6g0Var.L$1 = null;
                    l6g0Var.label = 1;
                    obj = myc0.k(b, m6g0Var, l6g0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        l6g0Var = new l6g0(n6g0Var, continuationImpl);
        Object obj2 = l6g0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = l6g0Var.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }
}
