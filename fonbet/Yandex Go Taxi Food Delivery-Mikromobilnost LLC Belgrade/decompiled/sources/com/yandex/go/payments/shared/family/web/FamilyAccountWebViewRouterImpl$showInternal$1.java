package com.yandex.go.payments.shared.family.web;

import defpackage.ab60;
import defpackage.io60;
import defpackage.jl40;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pne;
import defpackage.svb;
import defpackage.t7j;
import defpackage.tse;
import defpackage.tvb;
import defpackage.u5o;
import defpackage.ua41;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;
import ru.yandex.taxi.am.AuthType;
import ru.yandex.taxi.am.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.family.web.FamilyAccountWebViewRouterImpl$showInternal$1", f = "FamilyAccountWebViewRouterImpl.kt", l = {JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class FamilyAccountWebViewRouterImpl$showInternal$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyAccountWebViewRouterImpl$showInternal$1(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FamilyAccountWebViewRouterImpl$showInternal$1(this.this$0, this.$url, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FamilyAccountWebViewRouterImpl$showInternal$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.S();
            o oVar = this.this$0.L;
            String str2 = this.$url;
            AuthType authType = AuthType.COOKIES;
            this.label = 1;
            obj = oVar.b(str2, authType, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ua41 ua41Var = (ua41) obj;
        if (jl40.l(ua41Var, ab60.a) || (ua41Var instanceof u5o)) {
            jst.e.k(new IllegalStateException(), ua41Var.toString());
            str = this.$url;
        } else if (ua41Var instanceof pne) {
            str = ((pne) ua41Var).a;
        } else {
            if (!(ua41Var instanceof io60)) {
                w511.b();
                return null;
            }
            str = this.$url;
        }
        c cVar = this.this$0;
        b bVar = new b(cVar, str);
        tvb tvbVar = cVar.U;
        if (tvbVar != null) {
            ((svb) tvbVar).T(new t7j(7, cVar, str, bVar));
        }
        return zy11.a;
    }
}
