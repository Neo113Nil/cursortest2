package xsna;

import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: View.kt */
@b6l(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {410, 412}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class dyt0 extends RestrictedSuspendLambda implements wzs<ali0<? super View>, spj<? super s3q0>, Object> {
    final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyt0(View view, spj<? super dyt0> spjVar) {
        super(2, spjVar);
        this.$this_allViews = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        dyt0 dyt0Var = new dyt0(this.$this_allViews, spjVar);
        dyt0Var.L$0 = obj;
        return dyt0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(ali0<? super View> ali0Var, spj<? super s3q0> spjVar) {
        return ((dyt0) create(ali0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        if (r5 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r1.a(r5, r4) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ali0 ali0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ali0Var = (ali0) this.L$0;
            View view = this.$this_allViews;
            this.L$0 = ali0Var;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            ali0Var = (ali0) this.L$0;
            kotlin.a.a(obj);
        }
        View view2 = this.$this_allViews;
        if (view2 instanceof ViewGroup) {
            this.L$0 = null;
            this.label = 2;
            ali0Var.getClass();
            Object b = ali0Var.b(new qpp0(new kxt0((ViewGroup) view2)), this);
            if (b != coroutineSingletons) {
                b = s3q0.a;
            }
        }
        return s3q0.a;
    }
}
