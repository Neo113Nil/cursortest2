package xsna;

import androidx.car.app.hardware.common.CarZone;
import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: VideoBottomSheetCallback.kt */
@b6l(c = "com.vk.libvideo.bottomsheet.VideoBottomSheetCallbackKt$fragmentsUnder$1", f = "VideoBottomSheetCallback.kt", l = {CarZone.CAR_ZONE_COLUMN_PASSENGER}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class n6s0 extends RestrictedSuspendLambda implements wzs<ali0<? super Fragment>, spj<? super s3q0>, Object> {
    final /* synthetic */ List<Fragment> $fragments;
    final /* synthetic */ int $index;
    int I$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6s0(int i, List<Fragment> list, spj<? super n6s0> spjVar) {
        super(2, spjVar);
        this.$index = i;
        this.$fragments = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        n6s0 n6s0Var = new n6s0(this.$index, this.$fragments, spjVar);
        n6s0Var.L$0 = obj;
        return n6s0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(ali0<? super Fragment> ali0Var, spj<? super s3q0> spjVar) {
        return ((n6s0) create(ali0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0035 -> B:5:0x0038). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        ali0 ali0Var = (ali0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.a.a(obj);
            i = this.$index - 1;
            if (-1 < i) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            kotlin.a.a(obj);
            i--;
            if (-1 < i) {
                Fragment fragment = this.$fragments.get(i);
                this.L$0 = ali0Var;
                this.I$0 = i;
                this.label = 1;
                if (ali0Var.a(fragment, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i--;
                if (-1 < i) {
                    return s3q0.a;
                }
            }
        }
    }
}
