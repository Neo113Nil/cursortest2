package com.yandex.passport.internal.ui.router;

import android.content.Context;
import com.yandex.passport.internal.properties.LoginProperties;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.router.LoginRouterViewModel$onFirstStart$1", f = "LoginRouterViewModel.kt", l = {38, 37}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class LoginRouterViewModel$onFirstStart$1 extends SuspendLambda implements wls {
    final /* synthetic */ Context $context;
    final /* synthetic */ LoginProperties $loginProperties;
    Object L$0;
    int label;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginRouterViewModel$onFirstStart$1(r rVar, Context context, LoginProperties loginProperties, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rVar;
        this.$context = context;
        this.$loginProperties = loginProperties;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoginRouterViewModel$onFirstStart$1(this.this$0, this.$context, this.$loginProperties, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LoginRouterViewModel$onFirstStart$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r1.emit(r8, r7) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r8 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lz40 lz40Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            r rVar = this.this$0;
            lz40Var = rVar.w;
            Context context = this.$context;
            LoginProperties loginProperties = this.$loginProperties;
            this.L$0 = lz40Var;
            this.label = 1;
            obj = r.W(rVar, context, loginProperties, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lz40Var = (lz40) this.L$0;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.label = 2;
    }
}
