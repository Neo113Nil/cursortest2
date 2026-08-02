package com.yandex.passport.internal.database.auth_cookie;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.database.PassportDatabase_Impl;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sbx;
import defpackage.tse;
import defpackage.wls;
import defpackage.zfs;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)I"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.database.auth_cookie.AuthCookieDaoWrapper$deleteCookieByUid$2", f = "AuthCookieDaoWrapper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AuthCookieDaoWrapper$deleteCookieByUid$2 extends SuspendLambda implements wls {
    final /* synthetic */ Uid $uid;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthCookieDaoWrapper$deleteCookieByUid$2(a aVar, Uid uid, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$uid = uid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AuthCookieDaoWrapper$deleteCookieByUid$2(this.this$0, this.$uid, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AuthCookieDaoWrapper$deleteCookieByUid$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.this$0.a;
        Uid uid = this.$uid;
        PassportDatabase_Impl passportDatabase_Impl = dVar.a;
        passportDatabase_Impl.u0();
        c cVar = dVar.e;
        zfs a = cVar.a();
        dVar.c.getClass();
        a.m0(1, sbx.d.c(uid, com.yandex.passport.internal.serialization.a.a));
        try {
            passportDatabase_Impl.v0();
            try {
                int c = a.c();
                passportDatabase_Impl.Q0();
                cVar.k(a);
                return new Integer(c);
            } finally {
                passportDatabase_Impl.B0();
            }
        } catch (Throwable th) {
            cVar.k(a);
            throw th;
        }
    }
}
