package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.data.exceptions.ChallengeRequiredException;
import com.yandex.passport.data.exceptions.CurrentMuidMissingException;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.data.SlothTheme;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.w511;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class a0 implements com.yandex.passport.common.mvi.a {
    public final com.yandex.passport.internal.usecase.h0 a;
    public final com.yandex.passport.internal.usecase.ui.x b;
    public final com.yandex.passport.internal.usecase.ui.g c;
    public final com.yandex.passport.internal.flags.j d;

    public a0(com.yandex.passport.internal.usecase.h0 h0Var, com.yandex.passport.internal.usecase.ui.x xVar, com.yandex.passport.internal.usecase.ui.g gVar, com.yandex.passport.internal.flags.j jVar) {
        this.a = h0Var;
        this.b = xVar;
        this.c = gVar;
        this.d = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a0 a0Var, com.yandex.passport.internal.ui.bouncer.model.j jVar, LoginProperties loginProperties, ContinuationImpl continuationImpl) {
        GetClientTokenActor$tryToGetAccountWithMasterRelatedToken$1 getClientTokenActor$tryToGetAccountWithMasterRelatedToken$1;
        int i;
        Throwable th;
        Object obj;
        TimeoutCancellationException e;
        ModernAccount modernAccount;
        Object failure;
        a0Var.getClass();
        try {
            if (continuationImpl instanceof GetClientTokenActor$tryToGetAccountWithMasterRelatedToken$1) {
                getClientTokenActor$tryToGetAccountWithMasterRelatedToken$1 = (GetClientTokenActor$tryToGetAccountWithMasterRelatedToken$1) continuationImpl;
                int i2 = getClientTokenActor$tryToGetAccountWithMasterRelatedToken$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    getClientTokenActor$tryToGetAccountWithMasterRelatedToken$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = getClientTokenActor$tryToGetAccountWithMasterRelatedToken$1.result;
                    Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = getClientTokenActor$tryToGetAccountWithMasterRelatedToken$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        if (!((Boolean) a0Var.d.b(com.yandex.passport.internal.flags.q.r0)).booleanValue()) {
                            com.yandex.passport.internal.ui.bouncer.model.h hVar = jVar instanceof com.yandex.passport.internal.ui.bouncer.model.h ? (com.yandex.passport.internal.ui.bouncer.model.h) jVar : null;
                            if (hVar != null && (modernAccount = hVar.a) != null) {
                                return modernAccount;
                            }
                            ny61.r("Can't handle member account.");
                            return null;
                        }
                        if (jVar instanceof com.yandex.passport.internal.ui.bouncer.model.h) {
                            ModernAccount modernAccount2 = ((com.yandex.passport.internal.ui.bouncer.model.h) jVar).a;
                            if (modernAccount2.getMasterUid() == null || modernAccount2.getHasMasterToken()) {
                                return modernAccount2;
                            }
                            try {
                                Uid uid = modernAccount2.getUid();
                                Uid masterUid = modernAccount2.getMasterUid();
                                getClientTokenActor$tryToGetAccountWithMasterRelatedToken$1.L$0 = modernAccount2;
                                getClientTokenActor$tryToGetAccountWithMasterRelatedToken$1.label = 1;
                                obj2 = a0Var.c(loginProperties, uid, masterUid, getClientTokenActor$tryToGetAccountWithMasterRelatedToken$1);
                                if (obj2 != obj3) {
                                    obj = modernAccount2;
                                }
                            } catch (TimeoutCancellationException e2) {
                                e = e2;
                                obj = modernAccount2;
                                failure = new Result.Failure(e);
                                if (!(failure instanceof Result.Failure)) {
                                }
                                return (ModernAccount) obj;
                            } catch (Throwable th2) {
                                th = th2;
                                obj = modernAccount2;
                                failure = new Result.Failure(th);
                                if (!(failure instanceof Result.Failure)) {
                                }
                                return (ModernAccount) obj;
                            }
                        } else {
                            if (!(jVar instanceof com.yandex.passport.internal.ui.bouncer.model.i)) {
                                w511.b();
                                return null;
                            }
                            com.yandex.passport.internal.ui.bouncer.model.i iVar = (com.yandex.passport.internal.ui.bouncer.model.i) jVar;
                            Uid uid2 = iVar.a;
                            Uid uid3 = iVar.b;
                            getClientTokenActor$tryToGetAccountWithMasterRelatedToken$1.label = 2;
                            Object c = a0Var.c(loginProperties, uid2, uid3, getClientTokenActor$tryToGetAccountWithMasterRelatedToken$1);
                            if (c != obj3) {
                                return c;
                            }
                        }
                        return obj3;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj2);
                            return obj2;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = (ModernAccount) getClientTokenActor$tryToGetAccountWithMasterRelatedToken$1.L$0;
                    try {
                        kotlin.b.b(obj2);
                    } catch (TimeoutCancellationException e3) {
                        e = e3;
                        failure = new Result.Failure(e);
                        if (!(failure instanceof Result.Failure)) {
                        }
                        return (ModernAccount) obj;
                    } catch (Throwable th3) {
                        th = th3;
                        failure = new Result.Failure(th);
                        if (!(failure instanceof Result.Failure)) {
                        }
                        return (ModernAccount) obj;
                    }
                    failure = (ModernAccount) obj2;
                    if (!(failure instanceof Result.Failure)) {
                        obj = failure;
                    }
                    return (ModernAccount) obj;
                }
            }
            if (i != 0) {
            }
            failure = (ModernAccount) obj2;
            if (!(failure instanceof Result.Failure)) {
            }
            return (ModernAccount) obj;
        } catch (CancellationException e4) {
            throw e4;
        }
        getClientTokenActor$tryToGetAccountWithMasterRelatedToken$1 = new GetClientTokenActor$tryToGetAccountWithMasterRelatedToken$1(a0Var, continuationImpl);
        Object obj22 = getClientTokenActor$tryToGetAccountWithMasterRelatedToken$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getClientTokenActor$tryToGetAccountWithMasterRelatedToken$1.label;
    }

    @Override // com.yandex.passport.common.mvi.a
    public final rol0 a(kotlinx.coroutines.flow.n0 n0Var, kotlinx.coroutines.flow.r0 r0Var) {
        return com.lightside.cookies.coroutines.b.a(new com.yandex.passport.internal.impl.d(n0Var, 8), r0Var, new GetClientTokenActor$act$1(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(LoginProperties loginProperties, Uid uid, Uid uid2, ContinuationImpl continuationImpl) {
        GetClientTokenActor$getAccountForMasterMember$1 getClientTokenActor$getAccountForMasterMember$1;
        int i;
        LoginProperties loginProperties2;
        Uid uid3;
        Uid uid4;
        ModernAccount modernAccount;
        AnalyticsFromValue analyticsFromValue;
        ModernAccount modernAccount2;
        Uid uid5;
        Throwable a;
        SlothTheme slothTheme;
        PassportTheme theme;
        a0 a0Var = this;
        if (continuationImpl instanceof GetClientTokenActor$getAccountForMasterMember$1) {
            getClientTokenActor$getAccountForMasterMember$1 = (GetClientTokenActor$getAccountForMasterMember$1) continuationImpl;
            int i2 = getClientTokenActor$getAccountForMasterMember$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getClientTokenActor$getAccountForMasterMember$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getClientTokenActor$getAccountForMasterMember$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getClientTokenActor$getAccountForMasterMember$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.usecase.ui.w wVar = new com.yandex.passport.internal.usecase.ui.w(uid2);
                    getClientTokenActor$getAccountForMasterMember$1.L$0 = a0Var;
                    loginProperties2 = loginProperties;
                    getClientTokenActor$getAccountForMasterMember$1.L$1 = loginProperties2;
                    getClientTokenActor$getAccountForMasterMember$1.L$2 = uid;
                    getClientTokenActor$getAccountForMasterMember$1.L$3 = uid2;
                    getClientTokenActor$getAccountForMasterMember$1.label = 1;
                    obj = a0Var.b.a(wVar, getClientTokenActor$getAccountForMasterMember$1);
                    if (obj != coroutineSingletons) {
                        uid3 = uid2;
                        uid4 = uid;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    modernAccount2 = (ModernAccount) getClientTokenActor$getAccountForMasterMember$1.L$2;
                    Uid uid6 = (Uid) getClientTokenActor$getAccountForMasterMember$1.L$1;
                    LoginProperties loginProperties3 = (LoginProperties) getClientTokenActor$getAccountForMasterMember$1.L$0;
                    kotlin.b.b(obj);
                    loginProperties2 = loginProperties3;
                    uid5 = uid6;
                    Object value = ((Result) obj).getValue();
                    a = Result.a(value);
                    if (a != null) {
                        kotlin.b.b(value);
                        return value;
                    }
                    boolean z = a instanceof CurrentMuidMissingException;
                    if (!z && !(a instanceof ChallengeRequiredException)) {
                        throw a;
                    }
                    Uid uid7 = modernAccount2.getUid();
                    long locationId = modernAccount2.getLocationId();
                    if (loginProperties2 == null || (theme = loginProperties2.getTheme()) == null || (slothTheme = com.yandex.passport.internal.properties.u.W(theme)) == null) {
                        slothTheme = SlothTheme.FOLLOW_SYSTEM;
                    }
                    throw new GetClientTokenActor$ExecuteBouncerActionException(new com.yandex.passport.internal.ui.bouncer.model.j0(new SlothParams(new com.yandex.passport.sloth.data.y(uid7, uid5, locationId, z, slothTheme), uid5.getEnvironment(), null, null, 12, null)));
                }
                Uid uid8 = (Uid) getClientTokenActor$getAccountForMasterMember$1.L$3;
                Uid uid9 = (Uid) getClientTokenActor$getAccountForMasterMember$1.L$2;
                loginProperties2 = (LoginProperties) getClientTokenActor$getAccountForMasterMember$1.L$1;
                a0 a0Var2 = (a0) getClientTokenActor$getAccountForMasterMember$1.L$0;
                kotlin.b.b(obj);
                uid3 = uid8;
                uid4 = uid9;
                a0Var = a0Var2;
                modernAccount = (ModernAccount) obj;
                if (modernAccount != null) {
                    throw new Exception() { // from class: com.yandex.passport.internal.ui.bouncer.model.middleware.GetClientTokenActor$MemberNotFoundException
                    };
                }
                com.yandex.passport.internal.usecase.ui.g gVar = a0Var.c;
                Uid uid10 = modernAccount.getUid();
                MasterToken masterToken = modernAccount.getMasterToken();
                Environment environment = modernAccount.getUid().getEnvironment();
                AnalyticsFromValue.Companion.getClass();
                analyticsFromValue = AnalyticsFromValue.MUID_LOGIN;
                com.yandex.passport.internal.usecase.ui.f fVar = new com.yandex.passport.internal.usecase.ui.f(uid4, uid3, uid10, masterToken, environment, analyticsFromValue, modernAccount.getLocationId());
                getClientTokenActor$getAccountForMasterMember$1.L$0 = loginProperties2;
                getClientTokenActor$getAccountForMasterMember$1.L$1 = uid4;
                getClientTokenActor$getAccountForMasterMember$1.L$2 = modernAccount;
                getClientTokenActor$getAccountForMasterMember$1.L$3 = null;
                getClientTokenActor$getAccountForMasterMember$1.label = 2;
                obj = gVar.a(fVar, getClientTokenActor$getAccountForMasterMember$1);
                if (obj != coroutineSingletons) {
                    modernAccount2 = modernAccount;
                    uid5 = uid4;
                    Object value2 = ((Result) obj).getValue();
                    a = Result.a(value2);
                    if (a != null) {
                    }
                }
                return coroutineSingletons;
            }
        }
        getClientTokenActor$getAccountForMasterMember$1 = new GetClientTokenActor$getAccountForMasterMember$1(a0Var, continuationImpl);
        Object obj2 = getClientTokenActor$getAccountForMasterMember$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getClientTokenActor$getAccountForMasterMember$1.label;
        if (i != 0) {
        }
        modernAccount = (ModernAccount) obj2;
        if (modernAccount != null) {
        }
    }
}
