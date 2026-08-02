package androidx.compose.foundation.text.contextmenu.provider;

import defpackage.je5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider$showTextContextMenu$2", f = "BasicTextContextMenuProvider.kt", l = {130}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class BasicTextContextMenuProvider$showTextContextMenu$2 extends SuspendLambda implements tls {
    final /* synthetic */ je5 $localSession;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextContextMenuProvider$showTextContextMenu$2(a aVar, je5 je5Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$localSession = je5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new BasicTextContextMenuProvider$showTextContextMenu$2(this.this$0, this.$localSession, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((BasicTextContextMenuProvider$showTextContextMenu$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [oz40] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                b.b(obj);
                a aVar = this.this$0;
                aVar.c.setValue(this.$localSession);
                je5 je5Var = this.$localSession;
                this.label = 1;
                kotlinx.coroutines.channels.a aVar2 = je5Var.b;
                aVar2.getClass();
                Object J = kotlinx.coroutines.channels.a.J(aVar2, this);
                if (J != coroutineSingletons) {
                    J = zy11Var;
                }
                if (J == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            return zy11Var;
        } finally {
            this.this$0.c.setValue(null);
        }
    }
}
