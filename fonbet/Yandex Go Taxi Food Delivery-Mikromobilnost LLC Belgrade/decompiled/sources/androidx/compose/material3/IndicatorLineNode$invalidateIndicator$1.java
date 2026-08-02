package androidx.compose.material3;

import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import defpackage.agc;
import defpackage.dgc;
import defpackage.f810;
import defpackage.hob1;
import defpackage.imy0;
import defpackage.jj2;
import defpackage.ldc;
import defpackage.mvg;
import defpackage.npb1;
import defpackage.ny61;
import defpackage.osy0;
import defpackage.psy0;
import defpackage.sb2;
import defpackage.tse;
import defpackage.wls;
import defpackage.ya30;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.compose.material3.IndicatorLineNode$invalidateIndicator$1", f = "TextField.kt", l = {1599}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class IndicatorLineNode$invalidateIndicator$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorLineNode$invalidateIndicator$1(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IndicatorLineNode$invalidateIndicator$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IndicatorLineNode$invalidateIndicator$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0;
            androidx.compose.animation.core.a aVar = gVar.D;
            if (aVar != null) {
                imy0 imy0Var = gVar.C;
                if (imy0Var == null) {
                    imy0Var = t.f((agc) npb1.c(gVar, dgc.a), (osy0) npb1.c(gVar, psy0.a));
                }
                g gVar2 = this.this$0;
                ldc ldcVar = new ldc(imy0Var.c(gVar2.c, gVar2.w, gVar2.A));
                g gVar3 = this.this$0;
                jj2 b = gVar3.c ? hob1.b((ya30) npb1.c(gVar3, f810.a), MotionSchemeKeyTokens.FastEffects) : sb2.F();
                this.label = 1;
                obj = androidx.compose.animation.core.a.d(aVar, ldcVar, b, null, null, this, 12);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        return zy11.a;
    }
}
