package xsna;

import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.yhp0;

/* compiled from: TrackpadScrollingLogic.kt */
@b6l(c = "androidx.compose.foundation.gestures.TrackpadScrollingLogic$dispatchTrackpadScroll$3", f = "TrackpadScrollingLogic.kt", l = {178}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class aip0 extends SuspendLambda implements wzs<n160, spj<? super s3q0>, Object> {
    final /* synthetic */ Ref$ObjectRef<yhp0.a> $targetScrollDelta;
    final /* synthetic */ zhh0 $this_dispatchTrackpadScroll;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ yhp0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aip0(yhp0 yhp0Var, zhh0 zhh0Var, Ref$ObjectRef<yhp0.a> ref$ObjectRef, spj<? super aip0> spjVar) {
        super(2, spjVar);
        this.this$0 = yhp0Var;
        this.$this_dispatchTrackpadScroll = zhh0Var;
        this.$targetScrollDelta = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        aip0 aip0Var = new aip0(this.this$0, this.$this_dispatchTrackpadScroll, this.$targetScrollDelta, spjVar);
        aip0Var.L$0 = obj;
        return aip0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(n160 n160Var, spj<? super s3q0> spjVar) {
        return ((aip0) create(n160Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00af  */
    /* JADX WARN: Type inference failed for: r2v14, types: [T, xsna.yhp0$a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0070 -> B:5:0x0073). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        n160 n160Var;
        Ref$ObjectRef<yhp0.a> ref$ObjectRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            n160 n160Var2 = (n160) this.L$0;
            yhp0 yhp0Var = this.this$0;
            zhh0 zhh0Var = this.$this_dispatchTrackpadScroll;
            float i2 = zhh0Var.i(zhh0Var.e(this.$targetScrollDelta.element.a));
            zhh0 zhh0Var2 = yhp0Var.a;
            zhh0Var2.g(zhh0Var2.e(n160Var2.a(1, zhh0Var2.h(zhh0Var2.d(i2)))));
            n160Var = n160Var2;
            ref$ObjectRef = this.$targetScrollDelta;
            if (!ref$ObjectRef.element.c) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef = (Ref$ObjectRef) this.L$1;
            n160Var = (n160) this.L$0;
            kotlin.a.a(obj);
            T t = obj;
            ref$ObjectRef.element = t;
            yhp0 yhp0Var2 = this.this$0;
            yhp0.a aVar = this.$targetScrollDelta.element;
            wxm wxmVar = yhp0Var2.e;
            long j = aVar.b;
            long j2 = aVar.a;
            ((VelocityTracker1D) wxmVar.b).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
            ((VelocityTracker1D) wxmVar.c).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
            yhp0.a e = yhp0.e(this.this$0.f);
            if (e != null) {
                yhp0 yhp0Var3 = this.this$0;
                Ref$ObjectRef<yhp0.a> ref$ObjectRef2 = this.$targetScrollDelta;
                wxm wxmVar2 = yhp0Var3.e;
                long j3 = e.b;
                long j4 = e.a;
                ((VelocityTracker1D) wxmVar2.b).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                ((VelocityTracker1D) wxmVar2.c).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                ref$ObjectRef2.element = ref$ObjectRef2.element.a(e);
            }
            yhp0 yhp0Var4 = this.this$0;
            zhh0 zhh0Var3 = this.$this_dispatchTrackpadScroll;
            float i3 = zhh0Var3.i(zhh0Var3.e(this.$targetScrollDelta.element.a));
            zhh0 zhh0Var4 = yhp0Var4.a;
            zhh0Var4.g(zhh0Var4.e(n160Var.a(1, zhh0Var4.h(zhh0Var4.d(i3)))));
            ref$ObjectRef = this.$targetScrollDelta;
            if (!ref$ObjectRef.element.c) {
                nm8 nm8Var = this.this$0.f;
                this.L$0 = n160Var;
                this.L$1 = ref$ObjectRef;
                this.label = 1;
                Object d = zvj.d(new k670(nm8Var, null), this);
                t = d;
                if (d == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$ObjectRef.element = t;
                yhp0 yhp0Var22 = this.this$0;
                yhp0.a aVar2 = this.$targetScrollDelta.element;
                wxm wxmVar3 = yhp0Var22.e;
                long j5 = aVar2.b;
                long j22 = aVar2.a;
                ((VelocityTracker1D) wxmVar3.b).a(Float.intBitsToFloat((int) (j22 >> 32)), j5);
                ((VelocityTracker1D) wxmVar3.c).a(Float.intBitsToFloat((int) (j22 & 4294967295L)), j5);
                yhp0.a e2 = yhp0.e(this.this$0.f);
                if (e2 != null) {
                }
                yhp0 yhp0Var42 = this.this$0;
                zhh0 zhh0Var32 = this.$this_dispatchTrackpadScroll;
                float i32 = zhh0Var32.i(zhh0Var32.e(this.$targetScrollDelta.element.a));
                zhh0 zhh0Var42 = yhp0Var42.a;
                zhh0Var42.g(zhh0Var42.e(n160Var.a(1, zhh0Var42.h(zhh0Var42.d(i32)))));
                ref$ObjectRef = this.$targetScrollDelta;
                if (!ref$ObjectRef.element.c) {
                    return s3q0.a;
                }
            }
        }
    }
}
