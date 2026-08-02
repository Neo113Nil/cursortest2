package com.yandex.passport.internal.database.auth_cookie;

import android.database.Cursor;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.database.PassportDatabase_Impl;
import defpackage.auu0;
import defpackage.iwk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oub1;
import defpackage.p53;
import defpackage.rbx;
import defpackage.sbx;
import defpackage.tcc;
import defpackage.tse;
import defpackage.udq0;
import defpackage.wls;
import defpackage.zy11;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lcom/yandex/passport/internal/database/auth_cookie/f;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.database.auth_cookie.AuthCookieDaoWrapper$getCookieByUid$2", f = "AuthCookieDaoWrapper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AuthCookieDaoWrapper$getCookieByUid$2 extends SuspendLambda implements wls {
    final /* synthetic */ Uid $uid;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthCookieDaoWrapper$getCookieByUid$2(a aVar, Uid uid, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$uid = uid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AuthCookieDaoWrapper$getCookieByUid$2(this.this$0, this.$uid, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AuthCookieDaoWrapper$getCookieByUid$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        Uid uid = this.$uid;
        TreeMap treeMap = iwk0.B;
        iwk0 e = udq0.e(1, "SELECT * from modern_auth_cookie WHERE uid = ?");
        dVar.c.getClass();
        e.m0(1, sbx.d.c(uid, com.yandex.passport.internal.serialization.a.a));
        PassportDatabase_Impl passportDatabase_Impl = dVar.a;
        passportDatabase_Impl.u0();
        Cursor O0 = passportDatabase_Impl.O0(e);
        try {
            int a = oub1.a(O0, "uid");
            int a2 = oub1.a(O0, "cookies");
            int a3 = oub1.a(O0, "domain");
            ArrayList arrayList = new ArrayList(O0.getCount());
            while (O0.moveToNext()) {
                String string = O0.isNull(a) ? null : O0.getString(a);
                rbx rbxVar = sbx.d;
                Uid uid2 = (Uid) rbxVar.b(com.yandex.passport.internal.serialization.a.a, string);
                String string2 = O0.isNull(a2) ? null : O0.getString(a2);
                dVar.d.getClass();
                arrayList.add(new f(uid2, (List) rbxVar.b(new p53(auu0.a, 0), string2), O0.isNull(a3) ? null : O0.getString(a3)));
            }
            O0.close();
            e.a();
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                List list = fVar.b;
                ArrayList arrayList3 = new ArrayList(tcc.n(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Serializable b = aVar.c.b((String) it2.next(), "cookie");
                    if (b instanceof Result.Failure) {
                        b = null;
                    }
                    arrayList3.add((String) b);
                }
                arrayList2.add(f.a(fVar, com.yandex.passport.internal.ui.c.h(arrayList3, EmptyList.a)));
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                if (!((f) next).b.isEmpty()) {
                    arrayList4.add(next);
                }
            }
            return arrayList4;
        } catch (Throwable th) {
            O0.close();
            e.a();
            throw th;
        }
    }
}
