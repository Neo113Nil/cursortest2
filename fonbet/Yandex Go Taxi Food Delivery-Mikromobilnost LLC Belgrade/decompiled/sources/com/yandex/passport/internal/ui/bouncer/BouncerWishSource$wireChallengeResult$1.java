package com.yandex.passport.internal.ui.bouncer;

import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ui.bouncer.model.i2;
import defpackage.fyc;
import defpackage.lz40;
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
@mvg(c = "com.yandex.passport.internal.ui.bouncer.BouncerWishSource$wireChallengeResult$1", f = "BouncerWishSource.kt", l = {40, 40}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BouncerWishSource$wireChallengeResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.internal.ui.common.web.c $data;
    final /* synthetic */ PassportTheme $theme;
    final /* synthetic */ Uid $uid;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BouncerWishSource$wireChallengeResult$1(t tVar, Uid uid, com.yandex.passport.internal.ui.common.web.c cVar, PassportTheme passportTheme, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tVar;
        this.$uid = uid;
        this.$data = cVar;
        this.$theme = passportTheme;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BouncerWishSource$wireChallengeResult$1(this.this$0, this.$uid, this.$data, this.$theme, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BouncerWishSource$wireChallengeResult$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        if (r4.emit(r6, r8) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Uid uid;
        lz40 lz40Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n0 n0Var = this.this$0.a;
            uid = this.$uid;
            fyc fycVar = ((com.yandex.passport.internal.ui.common.web.a) this.$data).b;
            this.L$0 = n0Var;
            this.L$1 = uid;
            this.label = 1;
            Object s = fycVar.s(this);
            if (s != coroutineSingletons) {
                lz40Var = n0Var;
                obj = s;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.b.b(obj);
                return zy11.a;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uid = (Uid) this.L$1;
        lz40Var = (lz40) this.L$0;
        kotlin.b.b(obj);
        i2 i2Var = new i2(uid, ((Boolean) obj).booleanValue(), this.$theme);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
