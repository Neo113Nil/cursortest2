package androidx.compose.animation.core;

import defpackage.kj2;
import defpackage.lc0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sj2;
import defpackage.tls;
import defpackage.vg2;
import defpackage.wi2;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lsj2;", CA20Status.STATUS_CERTIFICATE_V, "Lwi2;", "<anonymous>", "()Lwi2;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {308}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class Animatable$runAnimation$2 extends SuspendLambda implements tls {
    final /* synthetic */ vg2 $animation;
    final /* synthetic */ tls $block;
    final /* synthetic */ Object $initialVelocity;
    final /* synthetic */ long $startTime;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$runAnimation$2(a aVar, Object obj, vg2 vg2Var, long j, tls tlsVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$initialVelocity = obj;
        this.$animation = vg2Var;
        this.$startTime = j;
        this.$block = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Animatable$runAnimation$2(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((Animatable$runAnimation$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kj2 kj2Var;
        Ref$BooleanRef ref$BooleanRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                a aVar = this.this$0;
                aVar.d.c = (sj2) aVar.a.a.invoke(this.$initialVelocity);
                this.this$0.f.setValue(this.$animation.g());
                this.this$0.e.setValue(Boolean.TRUE);
                kj2 kj2Var2 = this.this$0.d;
                kj2 kj2Var3 = new kj2(kj2Var2.a, kj2Var2.b.getValue(), ooc.i(kj2Var2.c), kj2Var2.w, Long.MIN_VALUE, kj2Var2.y);
                Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                vg2 vg2Var = this.$animation;
                long j = this.$startTime;
                lc0 lc0Var = new lc0(this.this$0, kj2Var3, this.$block, ref$BooleanRef2);
                this.L$0 = kj2Var3;
                this.L$1 = ref$BooleanRef2;
                this.label = 1;
                if (e.b(kj2Var3, vg2Var, j, lc0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                kj2Var = kj2Var3;
                ref$BooleanRef = ref$BooleanRef2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$BooleanRef = (Ref$BooleanRef) this.L$1;
                kj2Var = (kj2) this.L$0;
                kotlin.b.b(obj);
            }
            AnimationEndReason animationEndReason = ref$BooleanRef.element ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
            a.b(this.this$0);
            return new wi2(kj2Var, animationEndReason);
        } catch (CancellationException e) {
            a.b(this.this$0);
            throw e;
        }
    }
}
