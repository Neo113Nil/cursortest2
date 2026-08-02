package xsna;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.o2d0;
import xsna.ogo;

/* compiled from: InternalSlider.kt */
@b6l(c = "com.vk.core.compose.component.internal.InternalSliderKt$SliderThumb$1$1$1", f = "InternalSlider.kt", l = {IronSourceError.ERROR_CODE_INIT_FAILED}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class imx extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ sg50 $interactionSource;
    final /* synthetic */ SnapshotStateList<vax> $interactions;
    int label;

    /* compiled from: InternalSlider.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ SnapshotStateList<vax> b;

        public a(SnapshotStateList<vax> snapshotStateList) {
            this.b = snapshotStateList;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            vax vaxVar = (vax) obj;
            boolean z = vaxVar instanceof o2d0.b;
            SnapshotStateList<vax> snapshotStateList = this.b;
            if (z) {
                snapshotStateList.add(vaxVar);
            } else if (vaxVar instanceof o2d0.c) {
                snapshotStateList.remove(((o2d0.c) vaxVar).a);
            } else if (vaxVar instanceof o2d0.a) {
                snapshotStateList.remove(((o2d0.a) vaxVar).a);
            } else if (vaxVar instanceof ogo.b) {
                snapshotStateList.add(vaxVar);
            } else if (vaxVar instanceof ogo.c) {
                snapshotStateList.remove(((ogo.c) vaxVar).a);
            } else if (vaxVar instanceof ogo.a) {
                snapshotStateList.remove(((ogo.a) vaxVar).a);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imx(sg50 sg50Var, SnapshotStateList<vax> snapshotStateList, spj<? super imx> spjVar) {
        super(2, spjVar);
        this.$interactionSource = sg50Var;
        this.$interactions = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new imx(this.$interactionSource, this.$interactions, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((imx) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
