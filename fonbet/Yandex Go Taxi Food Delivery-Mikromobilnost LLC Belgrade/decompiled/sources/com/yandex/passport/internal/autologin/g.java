package com.yandex.passport.internal.autologin;

import com.yandex.passport.api.PassportAutoLoginMode;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.internal.properties.p;
import com.yandex.passport.internal.report.m1;
import com.yandex.passport.internal.report.o1;
import com.yandex.passport.internal.usecase.g0;
import com.yandex.passport.internal.usecase.h0;
import com.yandex.passport.internal.usecase.ui.w;
import com.yandex.passport.internal.usecase.ui.x;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.w511;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class g extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.storage.i b;
    public final p c;
    public final com.yandex.passport.internal.report.reporters.j d;
    public final h0 e;
    public final k f;
    public final com.yandex.passport.internal.usecase.ui.g g;
    public final x h;

    public g(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.storage.i iVar, p pVar, com.yandex.passport.internal.report.reporters.j jVar, h0 h0Var, k kVar, com.yandex.passport.internal.usecase.ui.g gVar, x xVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = iVar;
        this.c = pVar;
        this.d = jVar;
        this.e = h0Var;
        this.f = kVar;
        this.g = gVar;
        this.h = xVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|(1:(1:(4:11|12|13|14)(2:16|17))(4:18|19|13|14))(6:20|21|(2:37|(2:38|(1:48)(2:40|(4:42|43|(1:45)|46)(1:47))))(1:25)|26|(1:(5:29|(1:31)|12|13|14)(2:33|34))(1:35)|32)))|55|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a6, code lost:
    
        if (r11 == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b5, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b6, code lost:
    
        r11 = new kotlin.Result.Failure(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b3, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b4, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ac, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
    
        r11 = new kotlin.Result.Failure(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable g(g gVar, e eVar, ContinuationImpl continuationImpl) {
        AutoLoginUseCase$run$1 autoLoginUseCase$run$1;
        int i;
        Object failure;
        if (continuationImpl instanceof AutoLoginUseCase$run$1) {
            autoLoginUseCase$run$1 = (AutoLoginUseCase$run$1) continuationImpl;
            int i2 = autoLoginUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoLoginUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoLoginUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoLoginUseCase$run$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        failure = (ModernAccount) obj;
                        return new Result(failure);
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    failure = (ModernAccount) obj;
                    return new Result(failure);
                }
                kotlin.b.b(obj);
                com.yandex.passport.internal.report.reporters.j jVar = gVar.d;
                PassportAutoLoginMode passportAutoLoginMode = eVar.a;
                jVar.l(passportAutoLoginMode);
                Uid b = gVar.b.b();
                List list = eVar.b;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (jl40.l(((ModernAccount) it.next()).getUid(), b)) {
                            gVar.d.j(passportAutoLoginMode, b != null ? new Long(b.getValue()) : null);
                        }
                    }
                }
                int i3 = f.a[passportAutoLoginMode.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    autoLoginUseCase$run$1.label = 2;
                    obj = gVar.f(eVar, autoLoginUseCase$run$1);
                    if (obj == coroutineSingletons) {
                    }
                    failure = (ModernAccount) obj;
                    return new Result(failure);
                }
                autoLoginUseCase$run$1.label = 1;
                obj = gVar.c(eVar, autoLoginUseCase$run$1);
                return coroutineSingletons;
            }
        }
        autoLoginUseCase$run$1 = new AutoLoginUseCase$run$1(gVar, continuationImpl);
        Object obj2 = autoLoginUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoLoginUseCase$run$1.label;
        if (i == 0) {
        }
    }

    @Override // com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        return g(this, (e) obj, (ContinuationImpl) continuation);
    }

    public final Object c(e eVar, Continuation continuation) {
        String str = eVar.f;
        String e = str != null ? com.yandex.passport.internal.utils.b.e(str) : null;
        List list = eVar.b;
        if (e != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                String phoneNumber = ((ModernAccount) obj).getPhoneNumber();
                if (jl40.l(phoneNumber != null ? com.yandex.passport.internal.utils.b.e(phoneNumber) : null, e)) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        if (list.size() != 1) {
            PassportAutoLoginMode passportAutoLoginMode = eVar.a;
            com.yandex.passport.internal.report.reporters.j jVar = this.d;
            jVar.getClass();
            jVar.f(o1.w, new com.yandex.passport.internal.report.c(passportAutoLoginMode));
            return null;
        }
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(new a((ModernAccount) it.next()));
        }
        return h(eVar, arrayList2, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:10)(2:17|18))(5:19|(1:21)|(2:23|(1:25))|13|14)|11|12|13|14))|30|6|7|(0)(0)|11|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0029, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r7 = com.yandex.passport.common.logger.a.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (com.yandex.passport.common.logger.a.a.isEnabled() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.LogLevel.ERROR, null, "Error get auth token", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ModernAccount modernAccount, boolean z, ClientCredentials clientCredentials, ContinuationImpl continuationImpl) {
        AutoLoginUseCase$isGetTokenSuccess$1 autoLoginUseCase$isGetTokenSuccess$1;
        int i;
        if (continuationImpl instanceof AutoLoginUseCase$isGetTokenSuccess$1) {
            autoLoginUseCase$isGetTokenSuccess$1 = (AutoLoginUseCase$isGetTokenSuccess$1) continuationImpl;
            int i2 = autoLoginUseCase$isGetTokenSuccess$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoLoginUseCase$isGetTokenSuccess$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoLoginUseCase$isGetTokenSuccess$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoLoginUseCase$isGetTokenSuccess$1.label;
                boolean z2 = false;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (clientCredentials == null) {
                        clientCredentials = this.c.r(modernAccount.getUid().getEnvironment());
                    }
                    if (clientCredentials != null) {
                        h0 h0Var = this.e;
                        g0 g0Var = new g0(modernAccount, clientCredentials, z);
                        autoLoginUseCase$isGetTokenSuccess$1.label = 1;
                        obj = h0Var.a(g0Var, autoLoginUseCase$isGetTokenSuccess$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return Boolean.valueOf(z2);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                kotlin.b.b(((Result) obj).getValue());
                z2 = true;
                return Boolean.valueOf(z2);
            }
        }
        autoLoginUseCase$isGetTokenSuccess$1 = new AutoLoginUseCase$isGetTokenSuccess$1(this, continuationImpl);
        Object obj2 = autoLoginUseCase$isGetTokenSuccess$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoLoginUseCase$isGetTokenSuccess$1.label;
        boolean z22 = false;
        if (i != 0) {
        }
        kotlin.b.b(((Result) obj2).getValue());
        z22 = true;
        return Boolean.valueOf(z22);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073 A[Catch: Exception -> 0x004c, TRY_LEAVE, TryCatch #1 {Exception -> 0x004c, blocks: (B:27:0x0048, B:28:0x006d, B:31:0x0073), top: B:26:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(com.yandex.passport.internal.entities.k kVar, ContinuationImpl continuationImpl) {
        AutoLoginUseCase$loginByMasterMember$1 autoLoginUseCase$loginByMasterMember$1;
        int i;
        com.yandex.passport.internal.entities.k kVar2;
        com.yandex.passport.internal.entities.k kVar3;
        x xVar;
        w wVar;
        ModernAccount modernAccount;
        com.yandex.passport.internal.entities.k kVar4;
        g gVar = this;
        if (continuationImpl instanceof AutoLoginUseCase$loginByMasterMember$1) {
            autoLoginUseCase$loginByMasterMember$1 = (AutoLoginUseCase$loginByMasterMember$1) continuationImpl;
            int i2 = autoLoginUseCase$loginByMasterMember$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoLoginUseCase$loginByMasterMember$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoLoginUseCase$loginByMasterMember$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoLoginUseCase$loginByMasterMember$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    try {
                        xVar = gVar.h;
                        wVar = new w(kVar.c());
                        autoLoginUseCase$loginByMasterMember$1.L$0 = gVar;
                        kVar2 = kVar;
                    } catch (Exception e) {
                        e = e;
                        kVar2 = kVar;
                    }
                    try {
                        autoLoginUseCase$loginByMasterMember$1.L$1 = kVar2;
                        autoLoginUseCase$loginByMasterMember$1.label = 1;
                        obj = xVar.a(wVar, autoLoginUseCase$loginByMasterMember$1);
                        if (obj != coroutineSingletons) {
                            kVar3 = kVar2;
                        }
                        return coroutineSingletons;
                    } catch (Exception e2) {
                        e = e2;
                        kVar3 = kVar2;
                        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        }
                        return null;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kVar4 = (com.yandex.passport.internal.entities.k) autoLoginUseCase$loginByMasterMember$1.L$0;
                    try {
                        kotlin.b.b(obj);
                        Object value = ((Result) obj).getValue();
                        kotlin.b.b(value);
                        return (ModernAccount) value;
                    } catch (Exception e3) {
                        e = e3;
                        kVar3 = kVar4;
                        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        }
                        return null;
                    }
                }
                kVar3 = (com.yandex.passport.internal.entities.k) autoLoginUseCase$loginByMasterMember$1.L$1;
                gVar = (g) autoLoginUseCase$loginByMasterMember$1.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Exception e4) {
                    e = e4;
                    com.yandex.passport.common.logger.c cVar22 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Silent login by master member failed for uid=" + kVar3.d().getValue(), e);
                    }
                    return null;
                }
                modernAccount = (ModernAccount) obj;
                if (modernAccount != null) {
                    return null;
                }
                com.yandex.passport.internal.usecase.ui.g gVar2 = gVar.g;
                Uid d = kVar3.d();
                Uid c = kVar3.c();
                Uid uid = modernAccount.getUid();
                MasterToken masterToken = modernAccount.getMasterToken();
                Environment environment = modernAccount.getUid().getEnvironment();
                AnalyticsFromValue.Companion.getClass();
                com.yandex.passport.internal.usecase.ui.f fVar = new com.yandex.passport.internal.usecase.ui.f(d, c, uid, masterToken, environment, com.yandex.passport.internal.analytics.a.a(), modernAccount.getLocationId());
                autoLoginUseCase$loginByMasterMember$1.L$0 = kVar3;
                autoLoginUseCase$loginByMasterMember$1.L$1 = null;
                autoLoginUseCase$loginByMasterMember$1.label = 2;
                obj = gVar2.a(fVar, autoLoginUseCase$loginByMasterMember$1);
                if (obj != coroutineSingletons) {
                    kVar4 = kVar3;
                    Object value2 = ((Result) obj).getValue();
                    kotlin.b.b(value2);
                    return (ModernAccount) value2;
                }
                return coroutineSingletons;
            }
        }
        autoLoginUseCase$loginByMasterMember$1 = new AutoLoginUseCase$loginByMasterMember$1(gVar, continuationImpl);
        Object obj2 = autoLoginUseCase$loginByMasterMember$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoLoginUseCase$loginByMasterMember$1.label;
        if (i != 0) {
        }
        modernAccount = (ModernAccount) obj2;
        if (modernAccount != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r11 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(e eVar, ContinuationImpl continuationImpl) {
        AutoLoginUseCase$oneOrMoreAccountMode$1 autoLoginUseCase$oneOrMoreAccountMode$1;
        int i;
        if (continuationImpl instanceof AutoLoginUseCase$oneOrMoreAccountMode$1) {
            autoLoginUseCase$oneOrMoreAccountMode$1 = (AutoLoginUseCase$oneOrMoreAccountMode$1) continuationImpl;
            int i2 = autoLoginUseCase$oneOrMoreAccountMode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoLoginUseCase$oneOrMoreAccountMode$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoLoginUseCase$oneOrMoreAccountMode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoLoginUseCase$oneOrMoreAccountMode$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list = eVar.b;
                    Environment environment = eVar.d;
                    ClientCredentials clientCredentials = eVar.e;
                    i iVar = new i(list, environment, clientCredentials != null ? clientCredentials.getDecryptedId() : null, eVar.f);
                    autoLoginUseCase$oneOrMoreAccountMode$1.L$0 = this;
                    autoLoginUseCase$oneOrMoreAccountMode$1.L$1 = eVar;
                    autoLoginUseCase$oneOrMoreAccountMode$1.label = 1;
                    obj = this.f.a(iVar, autoLoginUseCase$oneOrMoreAccountMode$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eVar = (e) autoLoginUseCase$oneOrMoreAccountMode$1.L$1;
                    this = (g) autoLoginUseCase$oneOrMoreAccountMode$1.L$0;
                    kotlin.b.b(obj);
                }
                autoLoginUseCase$oneOrMoreAccountMode$1.L$0 = null;
                autoLoginUseCase$oneOrMoreAccountMode$1.L$1 = null;
                autoLoginUseCase$oneOrMoreAccountMode$1.label = 2;
                Object h = this.h(eVar, (List) obj, autoLoginUseCase$oneOrMoreAccountMode$1);
                return h != coroutineSingletons ? coroutineSingletons : h;
            }
        }
        autoLoginUseCase$oneOrMoreAccountMode$1 = new AutoLoginUseCase$oneOrMoreAccountMode$1(this, continuationImpl);
        Object obj2 = autoLoginUseCase$oneOrMoreAccountMode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoLoginUseCase$oneOrMoreAccountMode$1.label;
        if (i != 0) {
        }
        autoLoginUseCase$oneOrMoreAccountMode$1.L$0 = null;
        autoLoginUseCase$oneOrMoreAccountMode$1.L$1 = null;
        autoLoginUseCase$oneOrMoreAccountMode$1.label = 2;
        Object h2 = this.h(eVar, (List) obj2, autoLoginUseCase$oneOrMoreAccountMode$1);
        if (h2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0102 A[LOOP:1: B:42:0x00fc->B:44:0x0102, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00bc -> B:16:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d6 -> B:11:0x00da). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(e eVar, List list, ContinuationImpl continuationImpl) {
        AutoLoginUseCase$tryLogin$1 autoLoginUseCase$tryLogin$1;
        int i;
        Iterator it;
        AutoLoginUseCase$tryLogin$1 autoLoginUseCase$tryLogin$12;
        Iterator it2;
        ModernAccount modernAccount;
        Iterator it3;
        Object e;
        if (continuationImpl instanceof AutoLoginUseCase$tryLogin$1) {
            autoLoginUseCase$tryLogin$1 = (AutoLoginUseCase$tryLogin$1) continuationImpl;
            int i2 = autoLoginUseCase$tryLogin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoLoginUseCase$tryLogin$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoLoginUseCase$tryLogin$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoLoginUseCase$tryLogin$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    it = list.iterator();
                    while (it.hasNext()) {
                    }
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    it3 = list2.iterator();
                    while (it3.hasNext()) {
                    }
                    List J0 = kotlin.collections.a.J0(arrayList);
                    com.yandex.passport.internal.report.reporters.j jVar = this.d;
                    PassportAutoLoginMode passportAutoLoginMode = eVar.a;
                    jVar.getClass();
                    jVar.f(m1.w, new com.yandex.passport.internal.report.c(passportAutoLoginMode), new com.yandex.passport.internal.report.c(J0));
                    return null;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ModernAccount modernAccount2 = (ModernAccount) autoLoginUseCase$tryLogin$1.L$4;
                    Iterator it4 = (Iterator) autoLoginUseCase$tryLogin$1.L$3;
                    list = (List) autoLoginUseCase$tryLogin$1.L$2;
                    e eVar2 = (e) autoLoginUseCase$tryLogin$1.L$1;
                    g gVar = (g) autoLoginUseCase$tryLogin$1.L$0;
                    kotlin.b.b(obj);
                    AutoLoginUseCase$tryLogin$1 autoLoginUseCase$tryLogin$13 = autoLoginUseCase$tryLogin$1;
                    it2 = it4;
                    eVar = eVar2;
                    autoLoginUseCase$tryLogin$12 = autoLoginUseCase$tryLogin$13;
                    if (!((Boolean) obj).booleanValue()) {
                        return modernAccount2;
                    }
                    it = it2;
                    autoLoginUseCase$tryLogin$1 = autoLoginUseCase$tryLogin$12;
                    this = gVar;
                    while (it.hasNext()) {
                        c cVar = (c) it.next();
                        Uid b = cVar.b();
                        com.yandex.passport.internal.storage.i iVar = this.b;
                        iVar.getClass();
                        if (!new com.yandex.passport.internal.storage.b(iVar, b).a()) {
                            autoLoginUseCase$tryLogin$1.L$0 = this;
                            autoLoginUseCase$tryLogin$1.L$1 = eVar;
                            autoLoginUseCase$tryLogin$1.L$2 = list;
                            autoLoginUseCase$tryLogin$1.L$3 = it;
                            autoLoginUseCase$tryLogin$1.L$4 = null;
                            autoLoginUseCase$tryLogin$1.label = 1;
                            if (cVar instanceof a) {
                                e = ((a) cVar).c();
                            } else {
                                if (!(cVar instanceof b)) {
                                    w511.b();
                                    return null;
                                }
                                e = this.e(((b) cVar).c(), autoLoginUseCase$tryLogin$1);
                            }
                            if (e != coroutineSingletons) {
                                AutoLoginUseCase$tryLogin$1 autoLoginUseCase$tryLogin$14 = autoLoginUseCase$tryLogin$1;
                                it2 = it;
                                obj = e;
                                autoLoginUseCase$tryLogin$12 = autoLoginUseCase$tryLogin$14;
                                modernAccount = (ModernAccount) obj;
                                if (modernAccount != null) {
                                    it = it2;
                                    autoLoginUseCase$tryLogin$1 = autoLoginUseCase$tryLogin$12;
                                    while (it.hasNext()) {
                                    }
                                } else {
                                    boolean z = eVar.c;
                                    ClientCredentials clientCredentials = eVar.e;
                                    autoLoginUseCase$tryLogin$12.L$0 = this;
                                    autoLoginUseCase$tryLogin$12.L$1 = eVar;
                                    autoLoginUseCase$tryLogin$12.L$2 = list;
                                    autoLoginUseCase$tryLogin$12.L$3 = it2;
                                    autoLoginUseCase$tryLogin$12.L$4 = modernAccount;
                                    autoLoginUseCase$tryLogin$12.label = 2;
                                    Object d = this.d(modernAccount, z, clientCredentials, autoLoginUseCase$tryLogin$12);
                                    if (d != coroutineSingletons) {
                                        gVar = this;
                                        modernAccount2 = modernAccount;
                                        obj = d;
                                        if (!((Boolean) obj).booleanValue()) {
                                        }
                                    }
                                }
                            }
                            return coroutineSingletons;
                        }
                    }
                    List list22 = list;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list22, 10));
                    it3 = list22.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(String.valueOf(((c) it3.next()).b().getValue()));
                    }
                    List J02 = kotlin.collections.a.J0(arrayList2);
                    com.yandex.passport.internal.report.reporters.j jVar2 = this.d;
                    PassportAutoLoginMode passportAutoLoginMode2 = eVar.a;
                    jVar2.getClass();
                    jVar2.f(m1.w, new com.yandex.passport.internal.report.c(passportAutoLoginMode2), new com.yandex.passport.internal.report.c(J02));
                    return null;
                }
                Iterator it5 = (Iterator) autoLoginUseCase$tryLogin$1.L$3;
                List list3 = (List) autoLoginUseCase$tryLogin$1.L$2;
                e eVar3 = (e) autoLoginUseCase$tryLogin$1.L$1;
                g gVar2 = (g) autoLoginUseCase$tryLogin$1.L$0;
                kotlin.b.b(obj);
                AutoLoginUseCase$tryLogin$1 autoLoginUseCase$tryLogin$15 = autoLoginUseCase$tryLogin$1;
                it2 = it5;
                this = gVar2;
                autoLoginUseCase$tryLogin$12 = autoLoginUseCase$tryLogin$15;
                list = list3;
                eVar = eVar3;
                modernAccount = (ModernAccount) obj;
                if (modernAccount != null) {
                }
            }
        }
        autoLoginUseCase$tryLogin$1 = new AutoLoginUseCase$tryLogin$1(this, continuationImpl);
        Object obj2 = autoLoginUseCase$tryLogin$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoLoginUseCase$tryLogin$1.label;
        if (i != 0) {
        }
    }
}
