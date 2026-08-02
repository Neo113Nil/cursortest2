package com.yandex.messaging.ui.settings;

import defpackage.ny61;
import defpackage.rk80;
import defpackage.vpr;
import defpackage.x221;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ rk80 b;

    public d(vpr vprVar, rk80 rk80Var) {
        this.a = vprVar;
        this.b = rk80Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PersonalOrganizationsViewModel$subscribeToUnreadCounts$2$invokeSuspend$$inlined$map$1$2$1 personalOrganizationsViewModel$subscribeToUnreadCounts$2$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof PersonalOrganizationsViewModel$subscribeToUnreadCounts$2$invokeSuspend$$inlined$map$1$2$1) {
            personalOrganizationsViewModel$subscribeToUnreadCounts$2$invokeSuspend$$inlined$map$1$2$1 = (PersonalOrganizationsViewModel$subscribeToUnreadCounts$2$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = personalOrganizationsViewModel$subscribeToUnreadCounts$2$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                personalOrganizationsViewModel$subscribeToUnreadCounts$2$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = personalOrganizationsViewModel$subscribeToUnreadCounts$2$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = personalOrganizationsViewModel$subscribeToUnreadCounts$2$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = new Pair(new Long(this.b.a), new Integer(((x221) obj).b));
                    personalOrganizationsViewModel$subscribeToUnreadCounts$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pair, personalOrganizationsViewModel$subscribeToUnreadCounts$2$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        personalOrganizationsViewModel$subscribeToUnreadCounts$2$invokeSuspend$$inlined$map$1$2$1 = new PersonalOrganizationsViewModel$subscribeToUnreadCounts$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = personalOrganizationsViewModel$subscribeToUnreadCounts$2$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = personalOrganizationsViewModel$subscribeToUnreadCounts$2$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
