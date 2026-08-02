package androidx.compose.material3;

import defpackage.g8w;
import defpackage.jxe0;
import defpackage.ltu;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.tz6;
import defpackage.wls;
import defpackage.y7m;
import defpackage.ztr;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.compose.material3.ButtonElevation$animateElevation$2$1", f = "Button.kt", l = {1720, 1729}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class ButtonElevation$animateElevation$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ androidx.compose.animation.core.a $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ g8w $interaction;
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ tz6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonElevation$animateElevation$2$1(androidx.compose.animation.core.a aVar, float f, boolean z, tz6 tz6Var, g8w g8wVar, Continuation continuation) {
        super(2, continuation);
        this.$animatable = aVar;
        this.$target = f;
        this.$enabled = z;
        this.this$0 = tz6Var;
        this.$interaction = g8wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ButtonElevation$animateElevation$2$1(this.$animatable, this.$target, this.$enabled, this.this$0, this.$interaction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ButtonElevation$animateElevation$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r1.f(r2, r6) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0092, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        if (defpackage.vqn.a(r7, r1, r2, r4, r6) == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        g8w g8wVar = null;
        if (i == 0) {
            kotlin.b.b(obj);
            if (!y7m.b(((y7m) this.$animatable.f.getValue()).a, this.$target)) {
                boolean z = this.$enabled;
                androidx.compose.animation.core.a aVar = this.$animatable;
                if (z) {
                    float f = ((y7m) aVar.f.getValue()).a;
                    this.this$0.getClass();
                    if (y7m.b(f, 0.0f)) {
                        g8wVar = new jxe0(0L);
                    } else if (y7m.b(f, this.this$0.a)) {
                        g8wVar = new ltu();
                    } else {
                        this.this$0.getClass();
                        if (y7m.b(f, 0.0f)) {
                            g8wVar = new ztr();
                        }
                    }
                    androidx.compose.animation.core.a aVar2 = this.$animatable;
                    float f2 = this.$target;
                    g8w g8wVar2 = this.$interaction;
                    this.label = 2;
                } else {
                    y7m y7mVar = new y7m(this.$target);
                    this.label = 1;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
