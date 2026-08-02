package xsna;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.epx;
import xsna.lgj;

/* compiled from: BringIntoViewResponder.kt */
@b6l(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2", f = "BringIntoViewResponder.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class dd8 extends SuspendLambda implements wzs<yvj, spj<? super eyx>, Object> {
    final /* synthetic */ gzs<zhf0> $boundsProvider;
    final /* synthetic */ tny $childCoordinates;
    final /* synthetic */ gzs<zhf0> $parentRect;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ed8 this$0;

    /* compiled from: BringIntoViewResponder.kt */
    @b6l(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1", f = "BringIntoViewResponder.kt", l = {183}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ gzs<zhf0> $boundsProvider;
        final /* synthetic */ tny $childCoordinates;
        int label;
        final /* synthetic */ ed8 this$0;

        /* compiled from: BringIntoViewResponder.kt */
        /* renamed from: xsna.dd8$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2721a extends FunctionReferenceImpl implements gzs<zhf0> {
            final /* synthetic */ gzs<zhf0> $boundsProvider;
            final /* synthetic */ tny $childCoordinates;
            final /* synthetic */ ed8 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2721a(ed8 ed8Var, tny tnyVar, gzs<zhf0> gzsVar) {
                super(0, epx.a.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                this.this$0 = ed8Var;
                this.$childCoordinates = tnyVar;
                this.$boundsProvider = gzsVar;
            }

            @Override // xsna.gzs
            public final zhf0 invoke() {
                return ed8.i2(this.this$0, this.$childCoordinates, this.$boundsProvider);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ed8 ed8Var, tny tnyVar, gzs<zhf0> gzsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = ed8Var;
            this.$childCoordinates = tnyVar;
            this.$boundsProvider = gzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, this.$childCoordinates, this.$boundsProvider, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                lgj lgjVar = this.this$0.p;
                C2721a c2721a = new C2721a(this.this$0, this.$childCoordinates, this.$boundsProvider);
                this.label = 1;
                lgjVar.getClass();
                zhf0 zhf0Var = (zhf0) c2721a.invoke();
                if (zhf0Var == null || lgj.k2(lgjVar, zhf0Var, 0L, 0L, 3)) {
                    obj2 = s3q0.a;
                } else {
                    lq9 lq9Var = new lq9(1, s7s0.c(this));
                    lq9Var.o();
                    lgj.a aVar = new lgj.a(c2721a, lq9Var);
                    xc8 xc8Var = lgjVar.u;
                    ci50<lgj.a> ci50Var = xc8Var.a;
                    zhf0 zhf0Var2 = (zhf0) c2721a.invoke();
                    if (zhf0Var2 == null) {
                        lq9Var.resumeWith(s3q0.a);
                    } else {
                        lq9Var.r(new mm1(3, xc8Var, aVar));
                        k9x q = swe0.q(0, ci50Var.d);
                        int i2 = q.b;
                        int i3 = q.c;
                        if (i2 <= i3) {
                            while (true) {
                                zhf0 zhf0Var3 = (zhf0) ci50Var.b[i3].a.invoke();
                                if (zhf0Var3 != null) {
                                    zhf0 f = zhf0Var2.f(zhf0Var3);
                                    if (f.equals(zhf0Var2)) {
                                        ci50Var.a(i3 + 1, aVar);
                                        break;
                                    }
                                    if (!f.equals(zhf0Var3)) {
                                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                        int i4 = ci50Var.d - 1;
                                        if (i4 <= i3) {
                                            while (true) {
                                                ci50Var.b[i3].b.z(cancellationException);
                                                if (i4 == i3) {
                                                    break;
                                                }
                                                i4++;
                                            }
                                        }
                                    }
                                }
                                if (i3 == i2) {
                                    break;
                                }
                                i3--;
                            }
                        }
                        ci50Var.a(0, aVar);
                        if (!lgjVar.x) {
                            lgjVar.l2(0L);
                        }
                    }
                    obj2 = lq9Var.n();
                    if (obj2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        obj2 = s3q0.a;
                    }
                }
                if (obj2 == coroutineSingletons) {
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

    /* compiled from: BringIntoViewResponder.kt */
    @b6l(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2", f = "BringIntoViewResponder.kt", l = {191}, m = "invokeSuspend", v = 1)
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ gzs<zhf0> $parentRect;
        int label;
        final /* synthetic */ ed8 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ed8 ed8Var, gzs<zhf0> gzsVar, spj<? super b> spjVar) {
            super(2, spjVar);
            this.this$0 = ed8Var;
            this.$parentRect = gzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.this$0, this.$parentRect, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                ed8 ed8Var = this.this$0;
                gzs<zhf0> gzsVar = this.$parentRect;
                this.label = 1;
                if (mc8.a(ed8Var, gzsVar, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd8(ed8 ed8Var, tny tnyVar, gzs<zhf0> gzsVar, gzs<zhf0> gzsVar2, spj<? super dd8> spjVar) {
        super(2, spjVar);
        this.this$0 = ed8Var;
        this.$childCoordinates = tnyVar;
        this.$boundsProvider = gzsVar;
        this.$parentRect = gzsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        dd8 dd8Var = new dd8(this.this$0, this.$childCoordinates, this.$boundsProvider, this.$parentRect, spjVar);
        dd8Var.L$0 = obj;
        return dd8Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super eyx> spjVar) {
        return ((dd8) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        yvj yvjVar = (yvj) this.L$0;
        myc0.h(yvjVar, null, null, new a(this.this$0, this.$childCoordinates, this.$boundsProvider, null), 3);
        return myc0.h(yvjVar, null, null, new b(this.this$0, this.$parentRect, null), 3);
    }
}
