package com.yandex.go.personal_goals_v2.data;

import com.yandex.go.personal_goals_v2.data.model.PersonalGoalAcceptParam;
import com.yandex.go.personal_goals_v2.data.model.PersonalGoalAcceptResponse;
import defpackage.a4b0;
import defpackage.b4b0;
import defpackage.c4b0;
import defpackage.cmt;
import defpackage.eo5;
import defpackage.fmt;
import defpackage.i0b0;
import defpackage.jst;
import defpackage.ny61;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class b {
    public final i0b0 a;

    public b(i0b0 i0b0Var) {
        this.a = i0b0Var;
    }

    public static c4b0 b(fmt fmtVar) {
        int i = fmtVar.b;
        Object obj = fmtVar.a;
        return i == 200 ? new b4b0((PersonalGoalAcceptResponse) obj) : new a4b0((PersonalGoalAcceptResponse) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        PersonalGoalsRepository$acceptPersonalGoal$1 personalGoalsRepository$acceptPersonalGoal$1;
        int i;
        try {
            if (continuationImpl instanceof PersonalGoalsRepository$acceptPersonalGoal$1) {
                personalGoalsRepository$acceptPersonalGoal$1 = (PersonalGoalsRepository$acceptPersonalGoal$1) continuationImpl;
                int i2 = personalGoalsRepository$acceptPersonalGoal$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    personalGoalsRepository$acceptPersonalGoal$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = personalGoalsRepository$acceptPersonalGoal$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = personalGoalsRepository$acceptPersonalGoal$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<PersonalGoalAcceptResponse> a = ((PersonalGoalsInternalApi) ((eo5) this.a.get()).a.getValue()).a(new PersonalGoalAcceptParam(str));
                        personalGoalsRepository$acceptPersonalGoal$1.L$0 = null;
                        personalGoalsRepository$acceptPersonalGoal$1.L$1 = null;
                        personalGoalsRepository$acceptPersonalGoal$1.label = 1;
                        obj = a.a(personalGoalsRepository$acceptPersonalGoal$1);
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
                    return b((fmt) obj);
                }
            }
            if (i != 0) {
            }
            return b((fmt) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.h("personal_goals", "Failed to accept personal goal", th);
            return new a4b0(null);
        }
        personalGoalsRepository$acceptPersonalGoal$1 = new PersonalGoalsRepository$acceptPersonalGoal$1(this, continuationImpl);
        Object obj2 = personalGoalsRepository$acceptPersonalGoal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = personalGoalsRepository$acceptPersonalGoal$1.label;
    }
}
