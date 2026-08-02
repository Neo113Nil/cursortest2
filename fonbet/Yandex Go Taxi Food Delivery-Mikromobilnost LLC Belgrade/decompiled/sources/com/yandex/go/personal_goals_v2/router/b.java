package com.yandex.go.personal_goals_v2.router;

import defpackage.a4b0;
import defpackage.b4b0;
import defpackage.c4b0;
import defpackage.e4b0;
import defpackage.ny61;
import defpackage.w511;
import defpackage.w7b0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class b {
    public final String a;
    public final String b;
    public final /* synthetic */ c c;

    public b(c cVar, String str, String str2) {
        this.c = cVar;
        this.a = str;
        this.b = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x006d, code lost:
    
        if (r14 == r3) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(w7b0 w7b0Var, ContinuationImpl continuationImpl) {
        PersonalGoalsRouterImpl$PersonalGoalNavigatorImpl$acceptPersonalGoal$1 personalGoalsRouterImpl$PersonalGoalNavigatorImpl$acceptPersonalGoal$1;
        int i;
        c4b0 c4b0Var;
        w7b0 w7b0Var2;
        w7b0 w7b0Var3;
        String str;
        String str2;
        c cVar = this.c;
        e4b0 e4b0Var = cVar.I;
        if (continuationImpl instanceof PersonalGoalsRouterImpl$PersonalGoalNavigatorImpl$acceptPersonalGoal$1) {
            personalGoalsRouterImpl$PersonalGoalNavigatorImpl$acceptPersonalGoal$1 = (PersonalGoalsRouterImpl$PersonalGoalNavigatorImpl$acceptPersonalGoal$1) continuationImpl;
            int i2 = personalGoalsRouterImpl$PersonalGoalNavigatorImpl$acceptPersonalGoal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                personalGoalsRouterImpl$PersonalGoalNavigatorImpl$acceptPersonalGoal$1.label = i2 - Integer.MIN_VALUE;
                Object obj = personalGoalsRouterImpl$PersonalGoalNavigatorImpl$acceptPersonalGoal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = personalGoalsRouterImpl$PersonalGoalNavigatorImpl$acceptPersonalGoal$1.label;
                String str3 = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cVar.W(true);
                    com.yandex.go.personal_goals_v2.data.b bVar = cVar.J;
                    String str4 = w7b0Var.a;
                    personalGoalsRouterImpl$PersonalGoalNavigatorImpl$acceptPersonalGoal$1.L$0 = w7b0Var;
                    personalGoalsRouterImpl$PersonalGoalNavigatorImpl$acceptPersonalGoal$1.label = 1;
                    obj = bVar.a(str4, personalGoalsRouterImpl$PersonalGoalNavigatorImpl$acceptPersonalGoal$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            w7b0Var3 = (w7b0) personalGoalsRouterImpl$PersonalGoalNavigatorImpl$acceptPersonalGoal$1.L$0;
                            kotlin.b.b(obj);
                            str = w7b0Var3.a;
                            e4b0Var.getClass();
                            HashMap hashMap = new HashMap();
                            hashMap.put("open_source", str3);
                            if (str != null) {
                                hashMap.put("selected_goal", str);
                            }
                            e4b0Var.a.a("PersonalGoals.Selector.AcceptFailed", hashMap, 1, new HashMap());
                            return zy11.a;
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        w7b0Var2 = (w7b0) personalGoalsRouterImpl$PersonalGoalNavigatorImpl$acceptPersonalGoal$1.L$0;
                        kotlin.b.b(obj);
                        str2 = w7b0Var2.a;
                        e4b0Var.getClass();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("open_source", str3);
                        if (str2 != null) {
                            hashMap2.put("selected_goal", str2);
                        }
                        e4b0Var.a.a("PersonalGoals.Selector.AcceptSuccess", hashMap2, 1, new HashMap());
                        return zy11.a;
                    }
                    w7b0Var = (w7b0) personalGoalsRouterImpl$PersonalGoalNavigatorImpl$acceptPersonalGoal$1.L$0;
                    kotlin.b.b(obj);
                }
                c4b0Var = (c4b0) obj;
                if (!(c4b0Var instanceof a4b0)) {
                    personalGoalsRouterImpl$PersonalGoalNavigatorImpl$acceptPersonalGoal$1.L$0 = w7b0Var;
                    personalGoalsRouterImpl$PersonalGoalNavigatorImpl$acceptPersonalGoal$1.L$1 = null;
                    personalGoalsRouterImpl$PersonalGoalNavigatorImpl$acceptPersonalGoal$1.label = 2;
                    if (c.U(cVar, (a4b0) c4b0Var, personalGoalsRouterImpl$PersonalGoalNavigatorImpl$acceptPersonalGoal$1) != coroutineSingletons) {
                        w7b0Var3 = w7b0Var;
                        str = w7b0Var3.a;
                        e4b0Var.getClass();
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("open_source", str3);
                        if (str != null) {
                        }
                        e4b0Var.a.a("PersonalGoals.Selector.AcceptFailed", hashMap3, 1, new HashMap());
                        return zy11.a;
                    }
                } else {
                    if (!(c4b0Var instanceof b4b0)) {
                        w511.b();
                        return null;
                    }
                    personalGoalsRouterImpl$PersonalGoalNavigatorImpl$acceptPersonalGoal$1.L$0 = w7b0Var;
                    personalGoalsRouterImpl$PersonalGoalNavigatorImpl$acceptPersonalGoal$1.L$1 = null;
                    personalGoalsRouterImpl$PersonalGoalNavigatorImpl$acceptPersonalGoal$1.label = 3;
                    if (c.V(cVar, w7b0Var, (b4b0) c4b0Var, this.b, personalGoalsRouterImpl$PersonalGoalNavigatorImpl$acceptPersonalGoal$1) != coroutineSingletons) {
                        w7b0Var2 = w7b0Var;
                        str2 = w7b0Var2.a;
                        e4b0Var.getClass();
                        HashMap hashMap22 = new HashMap();
                        hashMap22.put("open_source", str3);
                        if (str2 != null) {
                        }
                        e4b0Var.a.a("PersonalGoals.Selector.AcceptSuccess", hashMap22, 1, new HashMap());
                        return zy11.a;
                    }
                }
                return coroutineSingletons;
            }
        }
        personalGoalsRouterImpl$PersonalGoalNavigatorImpl$acceptPersonalGoal$1 = new PersonalGoalsRouterImpl$PersonalGoalNavigatorImpl$acceptPersonalGoal$1(this, continuationImpl);
        Object obj2 = personalGoalsRouterImpl$PersonalGoalNavigatorImpl$acceptPersonalGoal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = personalGoalsRouterImpl$PersonalGoalNavigatorImpl$acceptPersonalGoal$1.label;
        String str32 = this.a;
        if (i != 0) {
        }
        c4b0Var = (c4b0) obj2;
        if (!(c4b0Var instanceof a4b0)) {
        }
        return coroutineSingletons2;
    }
}
