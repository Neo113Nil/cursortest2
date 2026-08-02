package androidx.compose.material3;

import defpackage.jj2;
import defpackage.jzw0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.compose.material3.ThumbNode$measure$2", f = "Switch.kt", l = {286}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class ThumbNode$measure$2 extends SuspendLambda implements wls {
    final /* synthetic */ float $offset;
    int label;
    final /* synthetic */ z this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThumbNode$measure$2(z zVar, float f, Continuation continuation) {
        super(2, continuation);
        this.this$0 = zVar;
        this.$offset = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ThumbNode$measure$2(this.this$0, this.$offset, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ThumbNode$measure$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            androidx.compose.animation.core.a aVar = this.this$0.x;
            if (aVar != null) {
                Float f = new Float(this.$offset);
                z zVar = this.this$0;
                jj2 jj2Var = zVar.w ? jzw0.f : zVar.c;
                this.label = 1;
                obj = androidx.compose.animation.core.a.d(aVar, f, jj2Var, null, null, this, 12);
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
