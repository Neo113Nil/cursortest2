package com.yandex.passport.internal.autologin;

import com.yandex.passport.api.exception.PassportAutoLoginImpossibleException;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.properties.AutoLoginProperties;
import com.yandex.passport.internal.report.n1;
import com.yandex.passport.internal.util.p;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lcom/yandex/passport/internal/ModernAccount;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.autologin.AutoLoginPerformer$tryAutoLogin$1", f = "AutoLoginPerformer.kt", l = {35, 44}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AutoLoginPerformer$tryAutoLogin$1 extends SuspendLambda implements wls {
    final /* synthetic */ AutoLoginProperties $properties;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoLoginPerformer$tryAutoLogin$1(d dVar, AutoLoginProperties autoLoginProperties, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$properties = autoLoginProperties;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AutoLoginPerformer$tryAutoLogin$1(this.this$0, this.$properties, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoLoginPerformer$tryAutoLogin$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if (r11 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            com.yandex.passport.internal.filter.i iVar = dVar.x;
            ArrayList f = dVar.b.a().f();
            Filter filter = this.$properties.getFilter();
            this.label = 1;
            obj = iVar.c(f, filter, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        List list = (List) obj;
        boolean isEmpty = list.isEmpty();
        d dVar2 = this.this$0;
        if (isEmpty) {
            com.yandex.passport.internal.report.reporters.j jVar = dVar2.c;
            jVar.getClass();
            jVar.h(n1.w);
            throw new PassportAutoLoginImpossibleException("Accounts for auto login with provided filter not found");
        }
        g gVar = dVar2.a;
        e eVar = new e(this.$properties.getMode(), list, p.u(this.$properties.getFilter().getPrimaryEnvironment()), this.$properties.getCredentials(), this.$properties.getPhoneNumber(), 4);
        this.label = 2;
        Object a = gVar.a(eVar, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
