package com.yandex.passport.internal.database.auth_cookie;

import com.yandex.passport.internal.database.PassportDatabase_Impl;
import com.yandex.passport.internal.flags.q;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zfs;
import defpackage.zy11;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.database.auth_cookie.AuthCookieDaoWrapper$insertCookie$2", f = "AuthCookieDaoWrapper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AuthCookieDaoWrapper$insertCookie$2 extends SuspendLambda implements wls {
    final /* synthetic */ f $authCookieEntity;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthCookieDaoWrapper$insertCookie$2(a aVar, f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$authCookieEntity = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AuthCookieDaoWrapper$insertCookie$2(this.this$0, this.$authCookieEntity, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AuthCookieDaoWrapper$insertCookie$2 authCookieDaoWrapper$insertCookie$2 = (AuthCookieDaoWrapper$insertCookie$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        authCookieDaoWrapper$insertCookie$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a aVar = this.this$0;
        d dVar = aVar.a;
        f fVar = this.$authCookieEntity;
        if (((Boolean) aVar.e.b(q.i0)).booleanValue()) {
            List list = fVar.b;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Serializable b = aVar.d.b((String) it.next(), "cookie");
                if (b instanceof Result.Failure) {
                    b = null;
                }
                arrayList.add((String) b);
            }
            fVar = f.a(fVar, com.yandex.passport.internal.ui.c.h(arrayList, fVar.b));
        }
        PassportDatabase_Impl passportDatabase_Impl = dVar.a;
        passportDatabase_Impl.u0();
        passportDatabase_Impl.v0();
        try {
            b bVar = dVar.b;
            zfs a = bVar.a();
            try {
                bVar.m(a, fVar);
                a.a();
                bVar.k(a);
                passportDatabase_Impl.Q0();
                passportDatabase_Impl.B0();
                return zy11.a;
            } catch (Throwable th) {
                bVar.k(a);
                throw th;
            }
        } catch (Throwable th2) {
            passportDatabase_Impl.B0();
            throw th2;
        }
    }
}
