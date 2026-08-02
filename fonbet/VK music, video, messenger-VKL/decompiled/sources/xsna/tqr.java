package xsna;

import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.o2d0;

/* compiled from: FloatingActionButton.kt */
@b6l(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1", f = "FloatingActionButton.kt", l = {651}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class tqr extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ xqr $animatable;
    final /* synthetic */ wax $interactionSource;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: FloatingActionButton.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ yvj c;
        public final /* synthetic */ xqr d;

        public a(ArrayList arrayList, yvj yvjVar, xqr xqrVar) {
            this.b = arrayList;
            this.c = yvjVar;
            this.d = xqrVar;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            vax vaxVar = (vax) obj;
            boolean z = vaxVar instanceof lgv;
            ArrayList arrayList = this.b;
            if (z) {
                arrayList.add(vaxVar);
            } else if (vaxVar instanceof mgv) {
                arrayList.remove(((mgv) vaxVar).a);
            } else if (vaxVar instanceof pvr) {
                arrayList.add(vaxVar);
            } else if (vaxVar instanceof qvr) {
                arrayList.remove(((qvr) vaxVar).a);
            } else if (vaxVar instanceof o2d0.b) {
                arrayList.add(vaxVar);
            } else if (vaxVar instanceof o2d0.c) {
                arrayList.remove(((o2d0.c) vaxVar).a);
            } else if (vaxVar instanceof o2d0.a) {
                arrayList.remove(((o2d0.a) vaxVar).a);
            }
            myc0.h(this.c, null, null, new sqr(this.d, (vax) j5g.k0(arrayList), null), 3);
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqr(wax waxVar, xqr xqrVar, spj<? super tqr> spjVar) {
        super(2, spjVar);
        this.$interactionSource = waxVar;
        this.$animatable = xqrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        tqr tqrVar = new tqr(this.$interactionSource, this.$animatable, spjVar);
        tqrVar.L$0 = obj;
        return tqrVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((tqr) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            yvj yvjVar = (yvj) this.L$0;
            ArrayList arrayList = new ArrayList();
            caj0 b = this.$interactionSource.b();
            a aVar = new a(arrayList, yvjVar, this.$animatable);
            this.label = 1;
            b.getClass();
            if (caj0.k(b, aVar, this) == coroutineSingletons) {
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
