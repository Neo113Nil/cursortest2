package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.common.core.AuthCookie;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.report.i5;
import com.yandex.passport.internal.report.jd;
import defpackage.evu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lcom/yandex/passport/common/core/AuthCookie;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.GetInvalidateCookiesAndDeleteAuthCookiesPerformer$performMethod$1", f = "GetInvalidateCookiesAndDeleteAuthCookiesPerformer.kt", l = {23, 24}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetInvalidateCookiesAndDeleteAuthCookiesPerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ Uid $uid;
    Object L$0;
    int label;
    final /* synthetic */ e0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetInvalidateCookiesAndDeleteAuthCookiesPerformer$performMethod$1(e0 e0Var, Uid uid, Continuation continuation) {
        super(2, continuation);
        this.this$0 = e0Var;
        this.$uid = uid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetInvalidateCookiesAndDeleteAuthCookiesPerformer$performMethod$1(this.this$0, this.$uid, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetInvalidateCookiesAndDeleteAuthCookiesPerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0032, code lost:
    
        if (r2 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0137 A[LOOP:3: B:27:0x0131->B:29:0x0137, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0082  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        List list;
        Iterator it;
        List W;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.passport.internal.database.auth_cookie.a aVar = this.this$0.a;
            Uid uid = this.$uid;
            this.label = 1;
            b = aVar.b(uid, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = (List) this.L$0;
                kotlin.b.b(obj);
                List<com.yandex.passport.internal.database.auth_cookie.f> list2 = list;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                for (com.yandex.passport.internal.database.auth_cookie.f fVar : list2) {
                    List<String> list3 = fVar.b;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
                    for (String str : list3) {
                        W = evu0.W(str, new String[]{";"}, (r2 & 4) != 0 ? 0 : 2);
                        List list4 = W;
                        ArrayList arrayList3 = new ArrayList(tcc.n(list4, 10));
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(evu0.k0((String) it2.next()).toString());
                        }
                        String str2 = (String) kotlin.collections.a.R(arrayList3);
                        if (str2 != null) {
                            str = kotlin.collections.a.X(kotlin.collections.a.m0(kotlin.collections.a.J(arrayList3, 1), Collections.singletonList(evu0.g0(str2, "=", str2).concat("="))), Extension.SEMICOLON_SPACE, null, null, null, 62);
                        }
                        arrayList2.add(str);
                    }
                    com.yandex.passport.internal.database.auth_cookie.f a = com.yandex.passport.internal.database.auth_cookie.f.a(fVar, arrayList2);
                    arrayList.add(new AuthCookie(a.a, a.b, a.c));
                }
                e0 e0Var = this.this$0;
                Uid uid2 = this.$uid;
                com.yandex.passport.internal.report.reporters.r rVar = e0Var.c;
                ArrayList arrayList4 = new ArrayList(tcc.n(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((com.yandex.passport.internal.database.auth_cookie.f) it.next()).c);
                }
                rVar.getClass();
                rVar.f(i5.w, new jd(Long.valueOf(uid2.getValue())), new com.yandex.passport.internal.report.i(arrayList4, 8));
                return arrayList;
            }
            kotlin.b.b(obj);
            b = obj;
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : (Iterable) b) {
            if (!evu0.J(((com.yandex.passport.internal.database.auth_cookie.f) obj2).c)) {
                arrayList5.add(obj2);
            }
        }
        com.yandex.passport.internal.database.auth_cookie.a aVar2 = this.this$0.a;
        Uid uid3 = this.$uid;
        this.L$0 = arrayList5;
        this.label = 2;
        if (aVar2.a(uid3, this) != coroutineSingletons) {
            list = arrayList5;
            List<com.yandex.passport.internal.database.auth_cookie.f> list22 = list;
            ArrayList arrayList6 = new ArrayList(tcc.n(list22, 10));
            while (r6.hasNext()) {
            }
            e0 e0Var2 = this.this$0;
            Uid uid22 = this.$uid;
            com.yandex.passport.internal.report.reporters.r rVar2 = e0Var2.c;
            ArrayList arrayList42 = new ArrayList(tcc.n(list22, 10));
            it = list22.iterator();
            while (it.hasNext()) {
            }
            rVar2.getClass();
            rVar2.f(i5.w, new jd(Long.valueOf(uid22.getValue())), new com.yandex.passport.internal.report.i(arrayList42, 8));
            return arrayList6;
        }
        return coroutineSingletons;
    }
}
