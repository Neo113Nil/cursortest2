package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.exception.PassportChallengeRequiredException;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.methods.m2;
import com.yandex.passport.internal.methods.x2;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.lang.reflect.Field;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class g1 implements w0 {
    public final com.yandex.passport.internal.usecase.d0 a;
    public final com.yandex.passport.internal.account.a b;
    public final com.yandex.passport.internal.usecase.j1 c;

    public g1(com.yandex.passport.internal.usecase.d0 d0Var, com.yandex.passport.internal.account.a aVar, com.yandex.passport.internal.usecase.j1 j1Var) {
        this.a = d0Var;
        this.b = aVar;
        this.c = j1Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|(1:(1:9)(2:49|50))(3:51|(1:53)(1:61)|(1:60)(2:57|(1:59)))|10|11|(2:29|(4:31|(1:33)(1:39)|34|(1:36)(2:37|38))(2:40|(2:42|43)(2:44|45)))(1:13)|14|(3:16|17|(3:19|20|21)(2:23|24))(1:28)))|62|6|(0)(0)|10|11|(0)(0)|14|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a4, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c1, code lost:
    
        r9 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060 A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:11:0x005b, B:29:0x0060, B:31:0x0064, B:34:0x0074, B:37:0x007a, B:38:0x00a3, B:40:0x00a6, B:42:0x00aa, B:43:0x00ac, B:44:0x00ad, B:45:0x00c0), top: B:10:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(g1 g1Var, Uid uid, ContinuationImpl continuationImpl) {
        SetCurrentAccountPerformer$checkChallenge$1 setCurrentAccountPerformer$checkChallenge$1;
        Object obj;
        int i;
        g1Var.getClass();
        if (continuationImpl instanceof SetCurrentAccountPerformer$checkChallenge$1) {
            setCurrentAccountPerformer$checkChallenge$1 = (SetCurrentAccountPerformer$checkChallenge$1) continuationImpl;
            int i2 = setCurrentAccountPerformer$checkChallenge$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                setCurrentAccountPerformer$checkChallenge$1.label = i2 - Integer.MIN_VALUE;
                obj = setCurrentAccountPerformer$checkChallenge$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = setCurrentAccountPerformer$checkChallenge$1.label;
                Object obj2 = zy11.a;
                Object obj3 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ModernAccount a = g1Var.b.a();
                    Uid uid2 = a != null ? a.getUid() : null;
                    if (uid2 == null || uid2.equals(uid)) {
                        return obj2;
                    }
                    com.yandex.passport.internal.usecase.d0 d0Var = g1Var.a;
                    setCurrentAccountPerformer$checkChallenge$1.label = 1;
                    obj = d0Var.a(uid2, setCurrentAccountPerformer$checkChallenge$1);
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
                if (!(obj instanceof com.yandex.passport.internal.usecase.c0)) {
                    if (!(obj instanceof Result)) {
                        if (obj instanceof Throwable) {
                            throw ((Throwable) obj);
                        }
                        Field declaredField = obj.getClass().getDeclaredField(Constants.KEY_EXCEPTION);
                        declaredField.setAccessible(true);
                        throw ((Throwable) declaredField.get(obj));
                    }
                    Object value = ((Result) obj).getValue();
                    kotlin.b.b(value);
                    if (value instanceof com.yandex.passport.internal.usecase.c0) {
                        obj3 = value;
                    }
                    com.yandex.passport.internal.usecase.c0 c0Var = (com.yandex.passport.internal.usecase.c0) obj3;
                    if (c0Var == null) {
                        throw new ClassCastException("Can't cast " + ((Object) Result.c(((Result) obj).getValue())) + " to " + qoi0.a(com.yandex.passport.internal.usecase.c0.class));
                    }
                    obj = c0Var;
                }
                if (!(obj instanceof Result.Failure)) {
                    return obj;
                }
                try {
                } catch (Throwable th) {
                    obj2 = new Result.Failure(th);
                }
                if (((com.yandex.passport.internal.usecase.c0) obj) instanceof com.yandex.passport.internal.usecase.b0) {
                    return obj2;
                }
                throw new PassportChallengeRequiredException(0);
            }
        }
        setCurrentAccountPerformer$checkChallenge$1 = new SetCurrentAccountPerformer$checkChallenge$1(g1Var, continuationImpl);
        obj = setCurrentAccountPerformer$checkChallenge$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setCurrentAccountPerformer$checkChallenge$1.label;
        Object obj22 = zy11.a;
        Object obj32 = null;
        if (i != 0) {
        }
        if (!(obj instanceof com.yandex.passport.internal.usecase.c0)) {
        }
        if (!(obj instanceof Result.Failure)) {
        }
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        return com.yandex.passport.common.util.a.h(new SetCurrentAccountPerformer$performMethod$1((m2) x2Var, this, null));
    }
}
