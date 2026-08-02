package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import defpackage.ny61;
import defpackage.rol0;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class r implements com.yandex.passport.common.mvi.a {
    public final com.yandex.passport.internal.usecase.ui.x a;

    public r(com.yandex.passport.internal.usecase.ui.x xVar) {
        this.a = xVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(r rVar, com.yandex.passport.internal.ui.bouncer.model.k kVar, s1 s1Var, ContinuationImpl continuationImpl) {
        CreateProfileActor$route$1 createProfileActor$route$1;
        int i;
        s1 s1Var2;
        ModernAccount modernAccount;
        Uid uid;
        LoginProperties m307copyLjS6rdk$default;
        rVar.getClass();
        if (continuationImpl instanceof CreateProfileActor$route$1) {
            createProfileActor$route$1 = (CreateProfileActor$route$1) continuationImpl;
            int i2 = createProfileActor$route$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                createProfileActor$route$1.label = i2 - Integer.MIN_VALUE;
                Object obj = createProfileActor$route$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = createProfileActor$route$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list = kVar.a;
                    if (list.isEmpty()) {
                        return new com.yandex.passport.internal.ui.bouncer.model.o("CreateProfileActor", "Can't find phone number for the new profile.", null);
                    }
                    LoginProperties loginProperties = s1Var.c;
                    boolean z = false;
                    if (loginProperties != null && loginProperties.getCreateMasterEnterPhoneNumberOption()) {
                        z = true;
                    }
                    if (list.size() > 1 || z) {
                        return new com.yandex.passport.internal.ui.bouncer.model.c0(list);
                    }
                    Uid uid2 = ((com.yandex.passport.internal.ui.bouncer.model.d1) kotlin.collections.a.P(list)).a;
                    com.yandex.passport.internal.usecase.ui.x xVar = rVar.a;
                    com.yandex.passport.internal.usecase.ui.w wVar = new com.yandex.passport.internal.usecase.ui.w(uid2);
                    createProfileActor$route$1.L$0 = s1Var;
                    createProfileActor$route$1.label = 1;
                    obj = xVar.a(wVar, createProfileActor$route$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    s1Var2 = s1Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    s1Var2 = (s1) createProfileActor$route$1.L$0;
                    kotlin.b.b(obj);
                }
                modernAccount = (ModernAccount) obj;
                if (modernAccount != null || (uid = modernAccount.getUid()) == null) {
                    return new com.yandex.passport.internal.ui.bouncer.model.o("CreateProfileActor", "No related accounts to create a profile.", null);
                }
                LoginProperties loginProperties2 = s1Var2.c;
                return (loginProperties2 == null || (m307copyLjS6rdk$default = LoginProperties.m307copyLjS6rdk$default(loginProperties2, null, false, null, null, null, null, null, false, true, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, false, null, 2147483391, null)) == null) ? new com.yandex.passport.internal.ui.bouncer.model.o("CreateProfileActor", "No login properties", null) : new com.yandex.passport.internal.ui.bouncer.model.d0(m307copyLjS6rdk$default, null, null, null, false, false, uid, null, 190);
            }
        }
        createProfileActor$route$1 = new CreateProfileActor$route$1(rVar, continuationImpl);
        Object obj2 = createProfileActor$route$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = createProfileActor$route$1.label;
        if (i != 0) {
        }
        modernAccount = (ModernAccount) obj2;
        if (modernAccount != null) {
        }
        return new com.yandex.passport.internal.ui.bouncer.model.o("CreateProfileActor", "No related accounts to create a profile.", null);
    }

    @Override // com.yandex.passport.common.mvi.a
    public final rol0 a(kotlinx.coroutines.flow.n0 n0Var, kotlinx.coroutines.flow.r0 r0Var) {
        return com.lightside.cookies.coroutines.b.a(new com.yandex.passport.internal.impl.d(n0Var, 4), r0Var, new CreateProfileActor$act$1(this, null));
    }
}
