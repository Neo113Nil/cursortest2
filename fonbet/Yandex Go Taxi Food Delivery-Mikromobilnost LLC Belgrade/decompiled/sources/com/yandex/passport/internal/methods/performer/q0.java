package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.common.core.AuthCookie;
import com.yandex.passport.common.core.FrontendUrlType;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.methods.u1;
import com.yandex.passport.internal.methods.x2;
import com.yandex.passport.user_id.di.GetUserIdUrlRequester$Response;
import defpackage.ny61;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class q0 implements w0 {
    public final com.yandex.passport.internal.report.reporters.e1 A;
    public final com.yandex.passport.internal.account.a a;
    public final com.yandex.passport.internal.network.e b;
    public final com.yandex.passport.internal.usecase.y c;
    public final com.yandex.passport.common.ui.lang.b w;
    public final com.yandex.passport.internal.sloth.p x;
    public final com.yandex.passport.internal.usecase.ui.v y;
    public final com.yandex.passport.internal.flags.j z;

    public q0(com.yandex.passport.internal.account.a aVar, com.yandex.passport.internal.network.e eVar, com.yandex.passport.internal.usecase.y yVar, com.yandex.passport.common.ui.lang.b bVar, com.yandex.passport.internal.sloth.p pVar, com.yandex.passport.internal.usecase.ui.v vVar, com.yandex.passport.internal.flags.j jVar, com.yandex.passport.internal.report.reporters.e1 e1Var) {
        this.a = aVar;
        this.b = eVar;
        this.c = yVar;
        this.w = bVar;
        this.x = pVar;
        this.y = vVar;
        this.z = jVar;
        this.A = e1Var;
    }

    public static final String b(q0 q0Var, String str) {
        q0Var.getClass();
        return com.yandex.passport.common.url.b.b(str, new Pair("deauthorize", "true"));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(q0 q0Var, Uid uid, String str, ContinuationImpl continuationImpl) {
        GetUserIdUrlPerformer$obtainCookie$1 getUserIdUrlPerformer$obtainCookie$1;
        int i;
        q0Var.getClass();
        if (continuationImpl instanceof GetUserIdUrlPerformer$obtainCookie$1) {
            getUserIdUrlPerformer$obtainCookie$1 = (GetUserIdUrlPerformer$obtainCookie$1) continuationImpl;
            int i2 = getUserIdUrlPerformer$obtainCookie$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getUserIdUrlPerformer$obtainCookie$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getUserIdUrlPerformer$obtainCookie$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getUserIdUrlPerformer$obtainCookie$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.usecase.ui.v vVar = q0Var.y;
                    com.yandex.passport.internal.usecase.ui.u uVar = new com.yandex.passport.internal.usecase.ui.u(uid, com.yandex.passport.common.url.b.g(str));
                    getUserIdUrlPerformer$obtainCookie$1.L$0 = str;
                    getUserIdUrlPerformer$obtainCookie$1.label = 1;
                    obj = vVar.a(uVar, getUserIdUrlPerformer$obtainCookie$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) getUserIdUrlPerformer$obtainCookie$1.L$0;
                    kotlin.b.b(obj);
                }
                Object value = ((Result) obj).getValue();
                return value instanceof Result.Failure ? new GetUserIdUrlRequester$Response(str, (AuthCookie) value) : value;
            }
        }
        getUserIdUrlPerformer$obtainCookie$1 = new GetUserIdUrlPerformer$obtainCookie$1(q0Var, continuationImpl);
        Object obj2 = getUserIdUrlPerformer$obtainCookie$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getUserIdUrlPerformer$obtainCookie$1.label;
        if (i != 0) {
        }
        Object value2 = ((Result) obj2).getValue();
        if (value2 instanceof Result.Failure) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(q0 q0Var, Uid uid, String str, ContinuationImpl continuationImpl) {
        GetUserIdUrlPerformer$requireAuthUrl$1 getUserIdUrlPerformer$requireAuthUrl$1;
        int i;
        q0Var.getClass();
        if (continuationImpl instanceof GetUserIdUrlPerformer$requireAuthUrl$1) {
            getUserIdUrlPerformer$requireAuthUrl$1 = (GetUserIdUrlPerformer$requireAuthUrl$1) continuationImpl;
            int i2 = getUserIdUrlPerformer$requireAuthUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getUserIdUrlPerformer$requireAuthUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getUserIdUrlPerformer$requireAuthUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getUserIdUrlPerformer$requireAuthUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.usecase.y yVar = q0Var.c;
                    com.yandex.passport.internal.usecase.w wVar = new com.yandex.passport.internal.usecase.w(uid, ((com.yandex.passport.internal.ui.lang.a) q0Var.w).b(), str, (String) null, (Map) null, (FrontendUrlType) null, 120);
                    getUserIdUrlPerformer$requireAuthUrl$1.label = 1;
                    obj = yVar.a(wVar, getUserIdUrlPerformer$requireAuthUrl$1);
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
                return ((Result) obj).getValue();
            }
        }
        getUserIdUrlPerformer$requireAuthUrl$1 = new GetUserIdUrlPerformer$requireAuthUrl$1(q0Var, continuationImpl);
        Object obj2 = getUserIdUrlPerformer$requireAuthUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getUserIdUrlPerformer$requireAuthUrl$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        return com.yandex.passport.common.util.a.g(new GetUserIdUrlPerformer$performMethod$1((u1) x2Var, this, null));
    }
}
