package androidx.compose.foundation.text.contextmenu.modifier;

import defpackage.ily0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oly0;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode$show$1", f = "TextContextMenuToolbarHandlerModifier.kt", l = {205, 206, 208, 208}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class TextContextMenuToolbarHandlerNode$show$1 extends SuspendLambda implements wls {
    final /* synthetic */ ily0 $provider;
    Object L$0;
    int label;
    final /* synthetic */ oly0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextContextMenuToolbarHandlerNode$show$1(oly0 oly0Var, ily0 ily0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oly0Var;
        this.$provider = ily0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextContextMenuToolbarHandlerNode$show$1(this.this$0, this.$provider, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TextContextMenuToolbarHandlerNode$show$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r7.invoke(r6) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        if (r7.a(r1, r6) == r0) goto L37;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Throwable th2) {
            tls tlsVar = this.this$0.x;
            if (tlsVar == null) {
                throw th2;
            }
            this.L$0 = th2;
            this.label = 4;
            if (tlsVar.invoke(this) != coroutineSingletons) {
                th = th2;
            }
        }
        if (i == 0) {
            kotlin.b.b(obj);
            tls tlsVar2 = this.this$0.w;
            if (tlsVar2 != null) {
                this.label = 1;
                if (tlsVar2.invoke(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    tls tlsVar3 = this.this$0.x;
                    if (tlsVar3 != null) {
                        this.label = 3;
                    }
                    return zy11.a;
                }
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = (Throwable) this.L$0;
                kotlin.b.b(obj);
                throw th;
            }
            kotlin.b.b(obj);
        }
        ily0 ily0Var = this.$provider;
        oly0 oly0Var = this.this$0;
        this.label = 2;
    }
}
