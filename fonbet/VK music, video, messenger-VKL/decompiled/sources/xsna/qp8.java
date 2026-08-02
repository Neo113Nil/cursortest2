package xsna;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.o2d0;

/* compiled from: Button.kt */
@b6l(c = "androidx.compose.material3.ButtonElevation$animateElevation$1$1", f = "Button.kt", l = {951}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class qp8 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wax $interactionSource;
    final /* synthetic */ SnapshotStateList<vax> $interactions;
    int label;

    /* compiled from: Button.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ SnapshotStateList<vax> b;

        public a(SnapshotStateList<vax> snapshotStateList) {
            this.b = snapshotStateList;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            vax vaxVar = (vax) obj;
            boolean z = vaxVar instanceof lgv;
            SnapshotStateList<vax> snapshotStateList = this.b;
            if (z) {
                snapshotStateList.add(vaxVar);
            } else if (vaxVar instanceof mgv) {
                snapshotStateList.remove(((mgv) vaxVar).a);
            } else if (vaxVar instanceof pvr) {
                snapshotStateList.add(vaxVar);
            } else if (vaxVar instanceof qvr) {
                snapshotStateList.remove(((qvr) vaxVar).a);
            } else if (vaxVar instanceof o2d0.b) {
                snapshotStateList.add(vaxVar);
            } else if (vaxVar instanceof o2d0.c) {
                snapshotStateList.remove(((o2d0.c) vaxVar).a);
            } else if (vaxVar instanceof o2d0.a) {
                snapshotStateList.remove(((o2d0.a) vaxVar).a);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp8(wax waxVar, SnapshotStateList<vax> snapshotStateList, spj<? super qp8> spjVar) {
        super(2, spjVar);
        this.$interactionSource = waxVar;
        this.$interactions = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new qp8(this.$interactionSource, this.$interactions, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((qp8) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            caj0 b = this.$interactionSource.b();
            a aVar = new a(this.$interactions);
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
