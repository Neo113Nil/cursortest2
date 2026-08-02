package xsna;

import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.epx;
import xsna.gzs;
import xsna.ksr;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;
import xsna.t9g;
import xsna.yzs;

/* compiled from: WorkConstraintsTracker.kt */
@b6l(c = "androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1", f = "WorkConstraintsTracker.kt", l = {67}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class vux0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ j380 $listener;
    final /* synthetic */ fxx0 $spec;
    final /* synthetic */ WorkConstraintsTracker $this_listen;
    int label;

    /* compiled from: WorkConstraintsTracker.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ j380 b;
        public final /* synthetic */ fxx0 c;

        public a(j380 j380Var, fxx0 fxx0Var) {
            this.b = j380Var;
            this.c = fxx0Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            this.b.a(this.c, (androidx.work.impl.constraints.a) obj);
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vux0(WorkConstraintsTracker workConstraintsTracker, fxx0 fxx0Var, j380 j380Var, spj<? super vux0> spjVar) {
        super(2, spjVar);
        this.$this_listen = workConstraintsTracker;
        this.$spec = fxx0Var;
        this.$listener = j380Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new vux0(this.$this_listen, this.$spec, this.$listener, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((vux0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            WorkConstraintsTracker workConstraintsTracker = this.$this_listen;
            fxx0 fxx0Var = this.$spec;
            List<v5j> list = workConstraintsTracker.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((v5j) obj2).a(fxx0Var)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((v5j) it.next()).b(fxx0Var.j));
            }
            final ksr[] ksrVarArr = (ksr[]) j5g.O0(arrayList2).toArray(new ksr[0]);
            ksr l = rsr.l(new ksr<androidx.work.impl.constraints.a>() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1

                /* compiled from: Zip.kt */
                @b6l(c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f = "WorkConstraintsTracker.kt", l = {292}, m = "invokeSuspend")
                /* renamed from: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3, reason: invalid class name */
                public static final class AnonymousClass3 extends SuspendLambda implements yzs<lsr<? super a>, a[], spj<? super s3q0>, Object> {
                    private /* synthetic */ Object L$0;
                    /* synthetic */ Object L$1;
                    int label;

                    @Override // xsna.yzs
                    public final Object invoke(lsr<? super a> lsrVar, a[] aVarArr, spj<? super s3q0> spjVar) {
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(3, spjVar);
                        anonymousClass3.L$0 = lsrVar;
                        anonymousClass3.L$1 = aVarArr;
                        return anonymousClass3.invokeSuspend(s3q0.a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        a aVar;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i = this.label;
                        if (i == 0) {
                            kotlin.a.a(obj);
                            lsr lsrVar = (lsr) this.L$0;
                            a[] aVarArr = (a[]) ((Object[]) this.L$1);
                            int length = aVarArr.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    aVar = null;
                                    break;
                                }
                                aVar = aVarArr[i2];
                                if (!epx.f(aVar, a.C0094a.a)) {
                                    break;
                                }
                                i2++;
                            }
                            if (aVar == null) {
                                aVar = a.C0094a.a;
                            }
                            this.label = 1;
                            if (lsrVar.emit(aVar, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a.a(obj);
                        }
                        return s3q0.a;
                    }
                }

                @Override // xsna.ksr
                public final Object collect(lsr<? super a> lsrVar, spj spjVar) {
                    final ksr[] ksrVarArr2 = ksrVarArr;
                    Object a2 = t9g.a(spjVar, lsrVar, new gzs<a[]>() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // xsna.gzs
                        public final a[] invoke() {
                            return new a[ksrVarArr2.length];
                        }
                    }, new AnonymousClass3(3, null), ksrVarArr2);
                    return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : s3q0.a;
                }
            });
            a aVar = new a(this.$listener, this.$spec);
            this.label = 1;
            if (l.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
