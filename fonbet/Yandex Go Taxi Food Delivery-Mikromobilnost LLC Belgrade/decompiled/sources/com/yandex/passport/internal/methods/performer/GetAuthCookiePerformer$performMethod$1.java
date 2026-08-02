package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.exception.PassportInvalidHostException;
import com.yandex.passport.api.exception.PassportNoCookieForUidException;
import com.yandex.passport.common.core.AuthCookie;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.report.e5;
import com.yandex.passport.internal.report.jd;
import defpackage.evu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/passport/common/core/AuthCookie;", "<anonymous>", "(Ltse;)Lcom/yandex/passport/common/core/AuthCookie;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.GetAuthCookiePerformer$performMethod$1", f = "GetAuthCookiePerformer.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetAuthCookiePerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.internal.methods.w0 $method;
    final /* synthetic */ Uid $uid;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAuthCookiePerformer$performMethod$1(com.yandex.passport.internal.methods.w0 w0Var, s sVar, Uid uid, Continuation continuation) {
        super(2, continuation);
        this.$method = w0Var;
        this.this$0 = sVar;
        this.$uid = uid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetAuthCookiePerformer$performMethod$1(this.$method, this.this$0, this.$uid, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetAuthCookiePerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String d;
        String str2;
        com.yandex.passport.internal.database.auth_cookie.e eVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str3 = (String) this.$method.c.c;
            if (evu0.J(str3)) {
                str3 = null;
            }
            if (str3 != null) {
                if (!evu0.y(str3, "://", false)) {
                    str3 = "https://".concat(str3);
                }
                com.yandex.passport.common.url.b bVar = new com.yandex.passport.common.url.b(str3);
                if (!com.yandex.passport.common.url.b.m(str3)) {
                    bVar = null;
                }
                if (bVar != null) {
                    str = bVar.a;
                    d = str != null ? com.yandex.passport.common.url.b.d(str) : null;
                    if (d != null) {
                        throw new PassportInvalidHostException((String) this.$method.c.c);
                    }
                    com.yandex.passport.internal.database.auth_cookie.a aVar = this.this$0.a;
                    Uid uid = this.$uid;
                    this.L$0 = d;
                    com.yandex.passport.internal.database.auth_cookie.e eVar2 = com.yandex.passport.internal.database.auth_cookie.f.d;
                    this.L$1 = eVar2;
                    this.label = 1;
                    obj = aVar.b(uid, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str2 = d;
                    eVar = eVar2;
                }
            }
            str = null;
            if (str != null) {
            }
            if (d != null) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eVar = (com.yandex.passport.internal.database.auth_cookie.e) this.L$1;
            str2 = (String) this.L$0;
            kotlin.b.b(obj);
        }
        eVar.getClass();
        com.yandex.passport.internal.database.auth_cookie.f a = com.yandex.passport.internal.database.auth_cookie.e.a(str2, (List) obj);
        if (a != null) {
            com.yandex.passport.internal.report.reporters.r rVar = this.this$0.c;
            Uid uid2 = this.$uid;
            rVar.getClass();
            rVar.f(e5.w, new jd(Long.valueOf(uid2.getValue())), new com.yandex.passport.internal.report.i(str2, 7));
            return new AuthCookie(a.a, a.b, str2);
        }
        throw new PassportNoCookieForUidException("Cookie for uid " + com.yandex.passport.internal.util.p.A(this.$uid).getValue() + " for host " + str2 + " not found.");
    }
}
