package androidx.compose.material3;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.ay40;
import defpackage.g8w;
import defpackage.h8w;
import defpackage.iy6;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.compose.material3.CardElevation$animateElevation$1$1", f = "Card.kt", l = {670}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class CardElevation$animateElevation$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ h8w $interactionSource;
    final /* synthetic */ SnapshotStateList<g8w> $interactions;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardElevation$animateElevation$1$1(h8w h8wVar, SnapshotStateList snapshotStateList, Continuation continuation) {
        super(2, continuation);
        this.$interactionSource = h8wVar;
        this.$interactions = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardElevation$animateElevation$1$1(this.$interactionSource, this.$interactions, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CardElevation$animateElevation$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n0 n0Var = ((ay40) this.$interactionSource).a;
            iy6 iy6Var = new iy6(this.$interactions, 2);
            this.label = 1;
            n0Var.getClass();
            if (n0.m(n0Var, iy6Var, this) == coroutineSingletons) {
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
