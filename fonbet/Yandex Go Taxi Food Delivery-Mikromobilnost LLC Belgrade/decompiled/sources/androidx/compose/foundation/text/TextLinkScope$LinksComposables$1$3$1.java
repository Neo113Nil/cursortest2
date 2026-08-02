package androidx.compose.foundation.text;

import defpackage.ay40;
import defpackage.ily;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xur;
import defpackage.xy40;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$3$1", f = "TextLinkScope.kt", l = {247}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class TextLinkScope$LinksComposables$1$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ ily $linkStateObserver;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextLinkScope$LinksComposables$1$3$1(ily ilyVar, Continuation continuation) {
        super(2, continuation);
        this.$linkStateObserver = ilyVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextLinkScope$LinksComposables$1$3$1(this.$linkStateObserver, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TextLinkScope$LinksComposables$1$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj3 = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj3;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ily ilyVar = this.$linkStateObserver;
        this.label = 1;
        ilyVar.getClass();
        xy40 xy40Var = new xy40((Object) null);
        n0 n0Var = ((ay40) ilyVar.a).a;
        xur xurVar = new xur(8, xy40Var, ilyVar);
        n0Var.getClass();
        Object m = n0.m(n0Var, xurVar, this);
        if (m != obj2) {
            m = obj3;
        }
        return m == obj2 ? obj2 : obj3;
    }
}
