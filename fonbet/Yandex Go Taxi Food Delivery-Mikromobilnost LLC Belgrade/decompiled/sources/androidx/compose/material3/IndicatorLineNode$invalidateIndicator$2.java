package androidx.compose.material3;

import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import defpackage.f810;
import defpackage.hob1;
import defpackage.jj2;
import defpackage.mvg;
import defpackage.npb1;
import defpackage.ny61;
import defpackage.sb2;
import defpackage.tse;
import defpackage.wls;
import defpackage.y7m;
import defpackage.ya30;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.compose.material3.IndicatorLineNode$invalidateIndicator$2", f = "TextField.kt", l = {1611}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class IndicatorLineNode$invalidateIndicator$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorLineNode$invalidateIndicator$2(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IndicatorLineNode$invalidateIndicator$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IndicatorLineNode$invalidateIndicator$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0;
            androidx.compose.animation.core.a aVar = gVar.F;
            y7m y7mVar = new y7m((gVar.A && gVar.c) ? gVar.y : gVar.z);
            jj2 b = gVar.c ? hob1.b((ya30) npb1.c(gVar, f810.a), MotionSchemeKeyTokens.FastSpatial) : sb2.F();
            this.label = 1;
            if (androidx.compose.animation.core.a.d(aVar, y7mVar, b, null, null, this, 12) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
