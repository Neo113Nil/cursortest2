package com.yandex.plus.pay.internal.feature.user;

import com.yandex.plus.pay.api.exception.PlusPayException;
import com.yandex.plus.pay.common.internal.log.PayCoreLogTag;
import com.yandex.plus.pay.internal.model.PlusPayUserAvatarInfo;
import defpackage.ak21;
import defpackage.lj;
import defpackage.mdd0;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.xca1;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class e {
    public final n4u0 a;
    public final com.yandex.plus.pay.graphql.avatar.a b;
    public final mdd0 c;

    public e(r0 r0Var, com.yandex.plus.pay.graphql.avatar.a aVar, mdd0 mdd0Var) {
        this.a = r0Var;
        this.b = aVar;
        this.c = mdd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        UserInfoInteractorImpl$getUserAvatarInfo$1 userInfoInteractorImpl$getUserAvatarInfo$1;
        int i;
        String l;
        String str;
        Throwable th;
        TimeoutCancellationException e;
        Result.Failure failure;
        Throwable a;
        try {
            if (continuationImpl instanceof UserInfoInteractorImpl$getUserAvatarInfo$1) {
                userInfoInteractorImpl$getUserAvatarInfo$1 = (UserInfoInteractorImpl$getUserAvatarInfo$1) continuationImpl;
                int i2 = userInfoInteractorImpl$getUserAvatarInfo$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    userInfoInteractorImpl$getUserAvatarInfo$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = userInfoInteractorImpl$getUserAvatarInfo$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = userInfoInteractorImpl$getUserAvatarInfo$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        Long id = ((lj) this.a.getValue()).getId();
                        if (id == null || (l = id.toString()) == null) {
                            throw new PlusPayException("User must be authorized to get user info", 2);
                        }
                        try {
                            com.yandex.plus.pay.graphql.avatar.a aVar = this.b;
                            userInfoInteractorImpl$getUserAvatarInfo$1.L$0 = l;
                            userInfoInteractorImpl$getUserAvatarInfo$1.L$1 = null;
                            userInfoInteractorImpl$getUserAvatarInfo$1.L$2 = null;
                            userInfoInteractorImpl$getUserAvatarInfo$1.L$3 = null;
                            userInfoInteractorImpl$getUserAvatarInfo$1.I$0 = 0;
                            userInfoInteractorImpl$getUserAvatarInfo$1.I$1 = 0;
                            userInfoInteractorImpl$getUserAvatarInfo$1.label = 1;
                            Object a2 = aVar.a(l, userInfoInteractorImpl$getUserAvatarInfo$1);
                            if (a2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            str = l;
                            obj = a2;
                        } catch (TimeoutCancellationException e2) {
                            str = l;
                            e = e2;
                            failure = new Result.Failure(e);
                            obj = failure;
                            a = Result.a(obj);
                            if (a != null) {
                            }
                        } catch (Throwable th2) {
                            str = l;
                            th = th2;
                            failure = new Result.Failure(th);
                            obj = failure;
                            a = Result.a(obj);
                            if (a != null) {
                            }
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) userInfoInteractorImpl$getUserAvatarInfo$1.L$0;
                        try {
                            kotlin.b.b(obj);
                        } catch (TimeoutCancellationException e3) {
                            e = e3;
                            failure = new Result.Failure(e);
                            obj = failure;
                            a = Result.a(obj);
                            if (a != null) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            failure = new Result.Failure(th);
                            obj = failure;
                            a = Result.a(obj);
                            if (a != null) {
                            }
                        }
                    }
                    a = Result.a(obj);
                    if (a != null) {
                        return new PlusPayUserAvatarInfo(str, ((ak21) obj).a);
                    }
                    mdd0.g(this.c, PayCoreLogTag.USER, null, a, 10);
                    throw xca1.e(a);
                }
            }
            if (i != 0) {
            }
            a = Result.a(obj);
            if (a != null) {
            }
        } catch (CancellationException e4) {
            throw e4;
        }
        userInfoInteractorImpl$getUserAvatarInfo$1 = new UserInfoInteractorImpl$getUserAvatarInfo$1(this, continuationImpl);
        Object obj2 = userInfoInteractorImpl$getUserAvatarInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userInfoInteractorImpl$getUserAvatarInfo$1.label;
    }
}
