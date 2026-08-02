package com.ybsdk.feature.savings.internal.data;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.dto.TwoFactorAuthResponse;
import com.ybsdk.core.utils.dto.f;
import com.ybsdk.feature.savings.internal.mapper.c;
import com.ybsdk.feature.savings.internal.network.SavingsApi;
import com.ybsdk.feature.savings.internal.network.dto.DashboardDataResponse;
import com.ybsdk.feature.savings.internal.network.dto.DashboardDataResponseV3;
import com.ybsdk.feature.savings.internal.network.dto.SavingsAccountSettingsResponse;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import defpackage.f6m0;
import defpackage.iam0;
import defpackage.iyd0;
import defpackage.mdm0;
import defpackage.ndm0;
import defpackage.ny61;
import defpackage.tq11;
import defpackage.ucm0;
import defpackage.wlp;
import defpackage.ynb1;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes3.dex */
public final class b {
    public final SavingsApi a;
    public final ucm0 b;
    public final mdm0 c;
    public final com.ybsdk.feature.savings.internal.mapper.b d;
    public final c e;
    public final com.ybsdk.feature.savings.internal.network.dto.a f;
    public final com.ybsdk.feature.savings.internal.entities.c g;

    public b(SavingsApi savingsApi, ucm0 ucm0Var, mdm0 mdm0Var, com.ybsdk.feature.savings.internal.mapper.b bVar, c cVar, com.ybsdk.feature.savings.internal.network.dto.a aVar, com.ybsdk.feature.savings.internal.entities.c cVar2) {
        this.a = savingsApi;
        this.b = ucm0Var;
        this.c = mdm0Var;
        this.d = bVar;
        this.e = cVar;
        this.f = aVar;
        this.g = cVar2;
    }

    public static /* synthetic */ Object n(b bVar, String str, String str2, Boolean bool, f6m0 f6m0Var, Boolean bool2, String str3, String str4, SuspendLambda suspendLambda, int i) {
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            f6m0Var = null;
        }
        if ((i & 16) != 0) {
            bool2 = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        if ((i & 64) != 0) {
            str4 = null;
        }
        return bVar.m(str, str2, bool, f6m0Var, bool2, str3, str4, suspendLambda);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        SavingsRepository$closeAccount$1 savingsRepository$closeAccount$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof SavingsRepository$closeAccount$1) {
            savingsRepository$closeAccount$1 = (SavingsRepository$closeAccount$1) continuationImpl;
            int i2 = savingsRepository$closeAccount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savingsRepository$closeAccount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = savingsRepository$closeAccount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsRepository$closeAccount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SavingsRepository$closeAccount$2 savingsRepository$closeAccount$2 = new SavingsRepository$closeAccount$2(this, str2, str, null);
                    savingsRepository$closeAccount$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(savingsRepository$closeAccount$2, savingsRepository$closeAccount$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                SavingsRepository$closeAccount$3$1 savingsRepository$closeAccount$3$1 = SavingsRepository$closeAccount$3$1.a;
                savingsRepository$closeAccount$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, savingsRepository$closeAccount$3$1, savingsRepository$closeAccount$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        savingsRepository$closeAccount$1 = new SavingsRepository$closeAccount$1(this, continuationImpl);
        Object obj2 = savingsRepository$closeAccount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsRepository$closeAccount$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (r0 == r11) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, String str4, String str5, boolean z, ContinuationImpl continuationImpl) {
        SavingsRepository$fundOperation$1 savingsRepository$fundOperation$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof SavingsRepository$fundOperation$1) {
            savingsRepository$fundOperation$1 = (SavingsRepository$fundOperation$1) continuationImpl;
            int i2 = savingsRepository$fundOperation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savingsRepository$fundOperation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = savingsRepository$fundOperation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsRepository$fundOperation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SavingsRepository$fundOperation$2 savingsRepository$fundOperation$2 = new SavingsRepository$fundOperation$2(this, str3, str2, str, str4, str5, z, null);
                    savingsRepository$fundOperation$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(savingsRepository$fundOperation$2, savingsRepository$fundOperation$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                SavingsRepository$fundOperation$3$1 savingsRepository$fundOperation$3$1 = new SavingsRepository$fundOperation$3$1(2, null);
                savingsRepository$fundOperation$1.label = 2;
                Object a2 = f.a((TwoFactorAuthResponse) c, savingsRepository$fundOperation$3$1, savingsRepository$fundOperation$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        savingsRepository$fundOperation$1 = new SavingsRepository$fundOperation$1(this, continuationImpl);
        Object obj2 = savingsRepository$fundOperation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsRepository$fundOperation$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        SavingsRepository$getAccountInfo$1 savingsRepository$getAccountInfo$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof SavingsRepository$getAccountInfo$1) {
            savingsRepository$getAccountInfo$1 = (SavingsRepository$getAccountInfo$1) continuationImpl;
            int i2 = savingsRepository$getAccountInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savingsRepository$getAccountInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = savingsRepository$getAccountInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsRepository$getAccountInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SavingsRepository$getAccountInfo$2 savingsRepository$getAccountInfo$2 = new SavingsRepository$getAccountInfo$2(this, str, null);
                    savingsRepository$getAccountInfo$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(savingsRepository$getAccountInfo$2, savingsRepository$getAccountInfo$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                SavingsRepository$getAccountInfo$3$1 savingsRepository$getAccountInfo$3$1 = new SavingsRepository$getAccountInfo$3$1(this, null);
                savingsRepository$getAccountInfo$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, savingsRepository$getAccountInfo$3$1, savingsRepository$getAccountInfo$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        savingsRepository$getAccountInfo$1 = new SavingsRepository$getAccountInfo$1(this, continuationImpl);
        Object obj2 = savingsRepository$getAccountInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsRepository$getAccountInfo$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00eb, code lost:
    
        if (r13 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        if (r10 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d6, code lost:
    
        if (r10 == r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(tq11 tq11Var, Map map, ContinuationImpl continuationImpl) {
        SavingsRepository$getDashboardData$1 savingsRepository$getDashboardData$1;
        int i;
        Object c;
        Object c2;
        iyd0 iyd0Var;
        iyd0 iyd0Var2;
        try {
            try {
                if (continuationImpl instanceof SavingsRepository$getDashboardData$1) {
                    savingsRepository$getDashboardData$1 = (SavingsRepository$getDashboardData$1) continuationImpl;
                    int i2 = savingsRepository$getDashboardData$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        savingsRepository$getDashboardData$1.label = i2 - Integer.MIN_VALUE;
                        Object obj = savingsRepository$getDashboardData$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = savingsRepository$getDashboardData$1.label;
                        com.ybsdk.feature.savings.internal.mapper.b bVar = this.d;
                        mdm0 mdm0Var = this.c;
                        if (i != 0) {
                            kotlin.b.b(obj);
                            Map b = ynb1.b(new Pair("X-YB-Polling-Attempt-Number", tq11Var != null ? tq11.a(tq11Var.a) : null));
                            if (((ndm0) mdm0Var).b()) {
                                SavingsRepository$getDashboardData$2 savingsRepository$getDashboardData$2 = new SavingsRepository$getDashboardData$2(this, b, map, null);
                                savingsRepository$getDashboardData$1.label = 1;
                                c2 = com.ybsdk.core.utils.ext.c.c(savingsRepository$getDashboardData$2, savingsRepository$getDashboardData$1);
                            } else {
                                SavingsRepository$getDashboardData$4 savingsRepository$getDashboardData$4 = new SavingsRepository$getDashboardData$4(this, b, null);
                                savingsRepository$getDashboardData$1.label = 3;
                                c = com.ybsdk.core.utils.ext.c.c(savingsRepository$getDashboardData$4, savingsRepository$getDashboardData$1);
                            }
                            return coroutineSingletons;
                        }
                        if (i == 1) {
                            kotlin.b.b(obj);
                            c2 = ((Result) obj).getValue();
                            if (c2 instanceof Result.Failure) {
                                return c2;
                            }
                            iyd0Var = (iyd0) c2;
                            DashboardDataResponseV3 dashboardDataResponseV3 = (DashboardDataResponseV3) iyd0Var.a;
                            boolean isEnabled = ((CommonFeatureFlag) ((ndm0) mdm0Var).a.d(wlp.q0).getData()).isEnabled();
                            savingsRepository$getDashboardData$1.L$0 = iyd0Var;
                            savingsRepository$getDashboardData$1.label = 2;
                            obj = bVar.b(dashboardDataResponseV3, isEnabled, savingsRepository$getDashboardData$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            return new iyd0(iyd0Var.b, (iam0) obj);
                        }
                        if (i == 2) {
                            iyd0Var = (iyd0) savingsRepository$getDashboardData$1.L$0;
                            kotlin.b.b(obj);
                            return new iyd0(iyd0Var.b, (iam0) obj);
                        }
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            iyd0Var2 = (iyd0) savingsRepository$getDashboardData$1.L$0;
                            kotlin.b.b(obj);
                            return new iyd0(iyd0Var2.b, (iam0) obj);
                        }
                        kotlin.b.b(obj);
                        c = ((Result) obj).getValue();
                        if (c instanceof Result.Failure) {
                            return c;
                        }
                        iyd0Var2 = (iyd0) c;
                        DashboardDataResponse dashboardDataResponse = (DashboardDataResponse) iyd0Var2.a;
                        savingsRepository$getDashboardData$1.L$0 = iyd0Var2;
                        savingsRepository$getDashboardData$1.label = 4;
                        obj = bVar.a(dashboardDataResponse, savingsRepository$getDashboardData$1);
                    }
                }
                if (i != 0) {
                }
            } catch (Throwable th) {
                return new Result.Failure(th);
            }
        } catch (Throwable th2) {
            return new Result.Failure(th2);
        }
        savingsRepository$getDashboardData$1 = new SavingsRepository$getDashboardData$1(this, continuationImpl);
        Object obj2 = savingsRepository$getDashboardData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsRepository$getDashboardData$1.label;
        com.ybsdk.feature.savings.internal.mapper.b bVar2 = this.d;
        mdm0 mdm0Var2 = this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(tq11 tq11Var, Map map, ContinuationImpl continuationImpl) {
        SavingsRepository$getDashboardV4$1 savingsRepository$getDashboardV4$1;
        int i;
        Object c;
        Throwable a;
        Object obj;
        iyd0 iyd0Var;
        if (continuationImpl instanceof SavingsRepository$getDashboardV4$1) {
            savingsRepository$getDashboardV4$1 = (SavingsRepository$getDashboardV4$1) continuationImpl;
            int i2 = savingsRepository$getDashboardV4$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savingsRepository$getDashboardV4$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = savingsRepository$getDashboardV4$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsRepository$getDashboardV4$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    SavingsRepository$getDashboardV4$2 savingsRepository$getDashboardV4$2 = new SavingsRepository$getDashboardV4$2(this, ynb1.b(new Pair("X-YB-Polling-Attempt-Number", tq11Var != null ? tq11.a(tq11Var.a) : null)), map, null);
                    savingsRepository$getDashboardV4$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(savingsRepository$getDashboardV4$2, savingsRepository$getDashboardV4$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        iyd0Var = (iyd0) savingsRepository$getDashboardV4$1.L$0;
                        kotlin.b.b(obj2);
                        obj = ((Result) obj2).getValue();
                        return obj instanceof Result.Failure ? new iyd0(iyd0Var.b, obj) : obj;
                    }
                    kotlin.b.b(obj2);
                    c = ((Result) obj2).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                iyd0 iyd0Var2 = (iyd0) c;
                DataWithStatusResponse dataWithStatusResponse = (DataWithStatusResponse) iyd0Var2.a;
                SavingsRepository$getDashboardV4$3$1$1 savingsRepository$getDashboardV4$3$1$1 = new SavingsRepository$getDashboardV4$3$1$1(this, null);
                savingsRepository$getDashboardV4$1.L$0 = iyd0Var2;
                savingsRepository$getDashboardV4$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a(dataWithStatusResponse, savingsRepository$getDashboardV4$3$1$1, savingsRepository$getDashboardV4$1);
                if (a2 != coroutineSingletons) {
                    obj = a2;
                    iyd0Var = iyd0Var2;
                    if (obj instanceof Result.Failure) {
                    }
                }
                return coroutineSingletons;
            }
        }
        savingsRepository$getDashboardV4$1 = new SavingsRepository$getDashboardV4$1(this, continuationImpl);
        Object obj22 = savingsRepository$getDashboardV4$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsRepository$getDashboardV4$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r0 == r10) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, String str2, String str3, String str4, Pair pair, ContinuationImpl continuationImpl) {
        SavingsRepository$openFund$1 savingsRepository$openFund$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof SavingsRepository$openFund$1) {
            savingsRepository$openFund$1 = (SavingsRepository$openFund$1) continuationImpl;
            int i2 = savingsRepository$openFund$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savingsRepository$openFund$1.label = i2 - Integer.MIN_VALUE;
                Object obj = savingsRepository$openFund$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsRepository$openFund$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SavingsRepository$openFund$2 savingsRepository$openFund$2 = new SavingsRepository$openFund$2(this, str2, str3, str, str4, pair, null);
                    savingsRepository$openFund$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(savingsRepository$openFund$2, savingsRepository$openFund$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                SavingsRepository$openFund$3$1 savingsRepository$openFund$3$1 = new SavingsRepository$openFund$3$1(2, null);
                savingsRepository$openFund$1.label = 2;
                Object a2 = f.a((TwoFactorAuthResponse) c, savingsRepository$openFund$3$1, savingsRepository$openFund$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        savingsRepository$openFund$1 = new SavingsRepository$openFund$1(this, continuationImpl);
        Object obj2 = savingsRepository$openFund$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsRepository$openFund$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r0 == r9) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, String str2, String str3, MoneyEntity moneyEntity, ContinuationImpl continuationImpl) {
        SavingsRepository$openSavingsAccount$1 savingsRepository$openSavingsAccount$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof SavingsRepository$openSavingsAccount$1) {
            savingsRepository$openSavingsAccount$1 = (SavingsRepository$openSavingsAccount$1) continuationImpl;
            int i2 = savingsRepository$openSavingsAccount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savingsRepository$openSavingsAccount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = savingsRepository$openSavingsAccount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsRepository$openSavingsAccount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SavingsRepository$openSavingsAccount$2 savingsRepository$openSavingsAccount$2 = new SavingsRepository$openSavingsAccount$2(this, str, str2, str3, moneyEntity, null);
                    savingsRepository$openSavingsAccount$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(savingsRepository$openSavingsAccount$2, savingsRepository$openSavingsAccount$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                SavingsRepository$openSavingsAccount$3$1 savingsRepository$openSavingsAccount$3$1 = new SavingsRepository$openSavingsAccount$3$1(2, null);
                savingsRepository$openSavingsAccount$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, savingsRepository$openSavingsAccount$3$1, savingsRepository$openSavingsAccount$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        savingsRepository$openSavingsAccount$1 = new SavingsRepository$openSavingsAccount$1(this, continuationImpl);
        Object obj2 = savingsRepository$openSavingsAccount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsRepository$openSavingsAccount$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (r15 == r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r14 == r2) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, String str2, String str3, int i, ContinuationImpl continuationImpl) {
        SavingsRepository$requestFundOperationStatus$1 savingsRepository$requestFundOperationStatus$1;
        int i2;
        Object c;
        Throwable a;
        iyd0 iyd0Var;
        Object a2;
        if (continuationImpl instanceof SavingsRepository$requestFundOperationStatus$1) {
            savingsRepository$requestFundOperationStatus$1 = (SavingsRepository$requestFundOperationStatus$1) continuationImpl;
            int i3 = savingsRepository$requestFundOperationStatus$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                savingsRepository$requestFundOperationStatus$1.label = i3 - Integer.MIN_VALUE;
                Object obj = savingsRepository$requestFundOperationStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = savingsRepository$requestFundOperationStatus$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    SavingsRepository$requestFundOperationStatus$2 savingsRepository$requestFundOperationStatus$2 = new SavingsRepository$requestFundOperationStatus$2(this, str, str2, str3, i, null);
                    savingsRepository$requestFundOperationStatus$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(savingsRepository$requestFundOperationStatus$2, savingsRepository$requestFundOperationStatus$1);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        iyd0Var = (iyd0) savingsRepository$requestFundOperationStatus$1.L$0;
                        kotlin.b.b(obj);
                        a2 = ((Result) obj).getValue();
                        return !(a2 instanceof Result.Failure) ? new iyd0(iyd0Var.b, a2) : a2;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                iyd0Var = (iyd0) c;
                DataWithStatusResponse dataWithStatusResponse = (DataWithStatusResponse) iyd0Var.a;
                SavingsRepository$requestFundOperationStatus$3$1$1 savingsRepository$requestFundOperationStatus$3$1$1 = new SavingsRepository$requestFundOperationStatus$3$1$1(2, null);
                savingsRepository$requestFundOperationStatus$1.L$0 = iyd0Var;
                savingsRepository$requestFundOperationStatus$1.label = 2;
                a2 = com.ybsdk.core.utils.dto.b.a(dataWithStatusResponse, savingsRepository$requestFundOperationStatus$3$1$1, savingsRepository$requestFundOperationStatus$1);
            }
        }
        savingsRepository$requestFundOperationStatus$1 = new SavingsRepository$requestFundOperationStatus$1(this, continuationImpl);
        Object obj2 = savingsRepository$requestFundOperationStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = savingsRepository$requestFundOperationStatus$1.label;
        if (i2 != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        if (r0 == r7) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(int i, String str, String str2, ContinuationImpl continuationImpl) {
        SavingsRepository$requestFundStatus$1 savingsRepository$requestFundStatus$1;
        int i2;
        Object c;
        Throwable a;
        iyd0 iyd0Var;
        Object obj;
        if (continuationImpl instanceof SavingsRepository$requestFundStatus$1) {
            savingsRepository$requestFundStatus$1 = (SavingsRepository$requestFundStatus$1) continuationImpl;
            int i3 = savingsRepository$requestFundStatus$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                savingsRepository$requestFundStatus$1.label = i3 - Integer.MIN_VALUE;
                SavingsRepository$requestFundStatus$1 savingsRepository$requestFundStatus$12 = savingsRepository$requestFundStatus$1;
                Object obj2 = savingsRepository$requestFundStatus$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = savingsRepository$requestFundStatus$12.label;
                if (i2 != 0) {
                    kotlin.b.b(obj2);
                    SavingsRepository$requestFundStatus$2 savingsRepository$requestFundStatus$2 = new SavingsRepository$requestFundStatus$2(this, str, str2, i, null);
                    savingsRepository$requestFundStatus$12.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(savingsRepository$requestFundStatus$2, savingsRepository$requestFundStatus$12);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        iyd0Var = (iyd0) savingsRepository$requestFundStatus$12.L$0;
                        kotlin.b.b(obj2);
                        obj = ((Result) obj2).getValue();
                        return obj instanceof Result.Failure ? new iyd0(iyd0Var.b, obj) : obj;
                    }
                    kotlin.b.b(obj2);
                    c = ((Result) obj2).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                iyd0 iyd0Var2 = (iyd0) c;
                DataWithStatusResponse dataWithStatusResponse = (DataWithStatusResponse) iyd0Var2.a;
                SavingsRepository$requestFundStatus$3$1$1 savingsRepository$requestFundStatus$3$1$1 = new SavingsRepository$requestFundStatus$3$1$1(this, null);
                savingsRepository$requestFundStatus$12.L$0 = iyd0Var2;
                savingsRepository$requestFundStatus$12.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a(dataWithStatusResponse, savingsRepository$requestFundStatus$3$1$1, savingsRepository$requestFundStatus$12);
                if (a2 != coroutineSingletons) {
                    iyd0Var = iyd0Var2;
                    obj = a2;
                    if (obj instanceof Result.Failure) {
                    }
                }
                return coroutineSingletons;
            }
        }
        savingsRepository$requestFundStatus$1 = new SavingsRepository$requestFundStatus$1(this, continuationImpl);
        SavingsRepository$requestFundStatus$1 savingsRepository$requestFundStatus$122 = savingsRepository$requestFundStatus$1;
        Object obj22 = savingsRepository$requestFundStatus$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = savingsRepository$requestFundStatus$122.label;
        if (i2 != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(int i, String str, ContinuationImpl continuationImpl) {
        SavingsRepository$requestOpeningStatus$1 savingsRepository$requestOpeningStatus$1;
        int i2;
        Object c;
        Throwable a;
        Object obj;
        iyd0 iyd0Var;
        if (continuationImpl instanceof SavingsRepository$requestOpeningStatus$1) {
            savingsRepository$requestOpeningStatus$1 = (SavingsRepository$requestOpeningStatus$1) continuationImpl;
            int i3 = savingsRepository$requestOpeningStatus$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                savingsRepository$requestOpeningStatus$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = savingsRepository$requestOpeningStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = savingsRepository$requestOpeningStatus$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj2);
                    SavingsRepository$requestOpeningStatus$2 savingsRepository$requestOpeningStatus$2 = new SavingsRepository$requestOpeningStatus$2(this, str, i, null);
                    savingsRepository$requestOpeningStatus$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(savingsRepository$requestOpeningStatus$2, savingsRepository$requestOpeningStatus$1);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        iyd0Var = (iyd0) savingsRepository$requestOpeningStatus$1.L$0;
                        kotlin.b.b(obj2);
                        obj = ((Result) obj2).getValue();
                        return obj instanceof Result.Failure ? new iyd0(iyd0Var.b, obj) : obj;
                    }
                    kotlin.b.b(obj2);
                    c = ((Result) obj2).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                iyd0 iyd0Var2 = (iyd0) c;
                DataWithStatusResponse dataWithStatusResponse = (DataWithStatusResponse) iyd0Var2.a;
                SavingsRepository$requestOpeningStatus$3$1$1 savingsRepository$requestOpeningStatus$3$1$1 = new SavingsRepository$requestOpeningStatus$3$1$1(this, null);
                savingsRepository$requestOpeningStatus$1.L$0 = iyd0Var2;
                savingsRepository$requestOpeningStatus$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a(dataWithStatusResponse, savingsRepository$requestOpeningStatus$3$1$1, savingsRepository$requestOpeningStatus$1);
                if (a2 != coroutineSingletons) {
                    obj = a2;
                    iyd0Var = iyd0Var2;
                    if (obj instanceof Result.Failure) {
                    }
                }
                return coroutineSingletons;
            }
        }
        savingsRepository$requestOpeningStatus$1 = new SavingsRepository$requestOpeningStatus$1(this, continuationImpl);
        Object obj22 = savingsRepository$requestOpeningStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = savingsRepository$requestOpeningStatus$1.label;
        if (i2 != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, List list, ContinuationImpl continuationImpl) {
        SavingsRepository$setOrder$1 savingsRepository$setOrder$1;
        int i;
        Object c;
        if (continuationImpl instanceof SavingsRepository$setOrder$1) {
            savingsRepository$setOrder$1 = (SavingsRepository$setOrder$1) continuationImpl;
            int i2 = savingsRepository$setOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savingsRepository$setOrder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = savingsRepository$setOrder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsRepository$setOrder$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SavingsRepository$setOrder$2 savingsRepository$setOrder$2 = new SavingsRepository$setOrder$2(this, str, list, null);
                    savingsRepository$setOrder$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(savingsRepository$setOrder$2, savingsRepository$setOrder$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                Throwable a = Result.a(c);
                return a != null ? com.ybsdk.core.utils.dto.b.c((DataWithStatusResponse) c) : new Result.Failure(a);
            }
        }
        savingsRepository$setOrder$1 = new SavingsRepository$setOrder$1(this, continuationImpl);
        Object obj2 = savingsRepository$setOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsRepository$setOrder$1.label;
        if (i != 0) {
        }
        Throwable a2 = Result.a(c);
        if (a2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(String str, List list, ContinuationImpl continuationImpl) {
        SavingsRepository$setOrderV2$1 savingsRepository$setOrderV2$1;
        int i;
        Object c;
        if (continuationImpl instanceof SavingsRepository$setOrderV2$1) {
            savingsRepository$setOrderV2$1 = (SavingsRepository$setOrderV2$1) continuationImpl;
            int i2 = savingsRepository$setOrderV2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savingsRepository$setOrderV2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = savingsRepository$setOrderV2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsRepository$setOrderV2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SavingsRepository$setOrderV2$2 savingsRepository$setOrderV2$2 = new SavingsRepository$setOrderV2$2(this, str, list, null);
                    savingsRepository$setOrderV2$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(savingsRepository$setOrderV2$2, savingsRepository$setOrderV2$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                Throwable a = Result.a(c);
                return a != null ? com.ybsdk.core.utils.dto.b.c((DataWithStatusResponse) c) : new Result.Failure(a);
            }
        }
        savingsRepository$setOrderV2$1 = new SavingsRepository$setOrderV2$1(this, continuationImpl);
        Object obj2 = savingsRepository$setOrderV2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsRepository$setOrderV2$1.label;
        if (i != 0) {
        }
        Throwable a2 = Result.a(c);
        if (a2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(String str, String str2, Boolean bool, f6m0 f6m0Var, Boolean bool2, String str3, String str4, ContinuationImpl continuationImpl) {
        SavingsRepository$setSettings$1 savingsRepository$setSettings$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof SavingsRepository$setSettings$1) {
            savingsRepository$setSettings$1 = (SavingsRepository$setSettings$1) continuationImpl;
            int i2 = savingsRepository$setSettings$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                savingsRepository$setSettings$1.label = i2 - Integer.MIN_VALUE;
                Object obj = savingsRepository$setSettings$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = savingsRepository$setSettings$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SavingsRepository$setSettings$2 savingsRepository$setSettings$2 = new SavingsRepository$setSettings$2(f6m0Var, this, str2, str, str3, str4, bool2, bool, null);
                    savingsRepository$setSettings$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(savingsRepository$setSettings$2, savingsRepository$setSettings$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                SavingsAccountSettingsResponse savingsAccountSettingsResponse = (SavingsAccountSettingsResponse) c;
                return savingsAccountSettingsResponse.getError() != null ? new Result.Failure(new IllegalStateException(savingsAccountSettingsResponse.getError().getMessage())) : zy11.a;
            }
        }
        savingsRepository$setSettings$1 = new SavingsRepository$setSettings$1(this, continuationImpl);
        Object obj2 = savingsRepository$setSettings$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = savingsRepository$setSettings$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
