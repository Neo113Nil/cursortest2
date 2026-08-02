package com.ybsdk.feature.credit.deposit.internal.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.boostdeposit.internal.network.BoostDepositApi;
import com.ybsdk.feature.boostdeposit.internal.network.dto.BoostDepositAmountCheckRequest;
import com.ybsdk.feature.boostdeposit.internal.network.dto.BoostDepositPageRequest;
import com.ybsdk.feature.boostdeposit.internal.network.dto.BoostDepositTransactionCreateRequest;
import com.ybsdk.feature.boostdeposit.internal.network.dto.BoostDepositTransactionStatusRequest;
import com.ybsdk.feature.credit.deposit.internal.domain.entities.b;
import com.ybsdk.feature.credit.deposit.internal.network.CreditDepositApi;
import com.ybsdk.feature.credit.deposit.internal.network.dto.CreditDepositAmountCheckRequest;
import com.ybsdk.feature.credit.deposit.internal.network.dto.CreditDepositPageRequest;
import com.ybsdk.feature.credit.deposit.internal.network.dto.CreditDepositTransactionCreateRequest;
import com.ybsdk.feature.credit.deposit.internal.network.dto.CreditDepositTransactionStatusRequest;
import com.ybsdk.feature.credit.limitdeposit.internal.network.CreditLimitDepositApi;
import com.ybsdk.feature.credit.limitdeposit.internal.network.dto.CreditLimitDepositAmountCheckRequest;
import com.ybsdk.feature.credit.limitdeposit.internal.network.dto.CreditLimitDepositPageRequest;
import com.ybsdk.feature.credit.limitdeposit.internal.network.dto.CreditLimitDepositTransactionCreateRequest;
import com.ybsdk.feature.credit.limitdeposit.internal.network.dto.CreditLimitDepositTransactionStatusRequest;
import com.ybsdk.feature.mkkdeposit.internal.network.MkkDepositApi;
import com.ybsdk.feature.mkkdeposit.internal.network.dto.MkkDepositAmountCheckRequest;
import com.ybsdk.feature.mkkdeposit.internal.network.dto.MkkDepositPageRequest;
import com.ybsdk.feature.mkkdeposit.internal.network.dto.MkkDepositTransactionCreateRequest;
import com.ybsdk.feature.mkkdeposit.internal.network.dto.MkkDepositTransactionStatusRequest;
import defpackage.iyd0;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final CreditDepositApi a;
    public final CreditLimitDepositApi b;
    public final MkkDepositApi c;
    public final BoostDepositApi d;
    public final b e;

    public a(CreditDepositApi creditDepositApi, CreditLimitDepositApi creditLimitDepositApi, MkkDepositApi mkkDepositApi, BoostDepositApi boostDepositApi, b bVar) {
        this.a = creditDepositApi;
        this.b = creditLimitDepositApi;
        this.c = mkkDepositApi;
        this.d = boostDepositApi;
        this.e = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(BoostDepositAmountCheckRequest boostDepositAmountCheckRequest, ContinuationImpl continuationImpl) {
        CreditDepositRepository$checkBoostAmount$1 creditDepositRepository$checkBoostAmount$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof CreditDepositRepository$checkBoostAmount$1) {
            creditDepositRepository$checkBoostAmount$1 = (CreditDepositRepository$checkBoostAmount$1) continuationImpl;
            int i2 = creditDepositRepository$checkBoostAmount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                creditDepositRepository$checkBoostAmount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = creditDepositRepository$checkBoostAmount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = creditDepositRepository$checkBoostAmount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CreditDepositRepository$checkBoostAmount$2 creditDepositRepository$checkBoostAmount$2 = new CreditDepositRepository$checkBoostAmount$2(this, boostDepositAmountCheckRequest, null);
                    creditDepositRepository$checkBoostAmount$1.label = 1;
                    c = c.c(creditDepositRepository$checkBoostAmount$2, creditDepositRepository$checkBoostAmount$1);
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
                CreditDepositRepository$checkBoostAmount$3$1 creditDepositRepository$checkBoostAmount$3$1 = new CreditDepositRepository$checkBoostAmount$3$1(2, null);
                creditDepositRepository$checkBoostAmount$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, creditDepositRepository$checkBoostAmount$3$1, creditDepositRepository$checkBoostAmount$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        creditDepositRepository$checkBoostAmount$1 = new CreditDepositRepository$checkBoostAmount$1(this, continuationImpl);
        Object obj2 = creditDepositRepository$checkBoostAmount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = creditDepositRepository$checkBoostAmount$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(CreditDepositAmountCheckRequest creditDepositAmountCheckRequest, ContinuationImpl continuationImpl) {
        CreditDepositRepository$checkCreditAmount$1 creditDepositRepository$checkCreditAmount$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof CreditDepositRepository$checkCreditAmount$1) {
            creditDepositRepository$checkCreditAmount$1 = (CreditDepositRepository$checkCreditAmount$1) continuationImpl;
            int i2 = creditDepositRepository$checkCreditAmount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                creditDepositRepository$checkCreditAmount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = creditDepositRepository$checkCreditAmount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = creditDepositRepository$checkCreditAmount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CreditDepositRepository$checkCreditAmount$2 creditDepositRepository$checkCreditAmount$2 = new CreditDepositRepository$checkCreditAmount$2(this, creditDepositAmountCheckRequest, null);
                    creditDepositRepository$checkCreditAmount$1.label = 1;
                    c = c.c(creditDepositRepository$checkCreditAmount$2, creditDepositRepository$checkCreditAmount$1);
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
                CreditDepositRepository$checkCreditAmount$3$1 creditDepositRepository$checkCreditAmount$3$1 = new CreditDepositRepository$checkCreditAmount$3$1(2, null);
                creditDepositRepository$checkCreditAmount$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, creditDepositRepository$checkCreditAmount$3$1, creditDepositRepository$checkCreditAmount$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        creditDepositRepository$checkCreditAmount$1 = new CreditDepositRepository$checkCreditAmount$1(this, continuationImpl);
        Object obj2 = creditDepositRepository$checkCreditAmount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = creditDepositRepository$checkCreditAmount$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(CreditLimitDepositAmountCheckRequest creditLimitDepositAmountCheckRequest, ContinuationImpl continuationImpl) {
        CreditDepositRepository$checkCreditLimitAmount$1 creditDepositRepository$checkCreditLimitAmount$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof CreditDepositRepository$checkCreditLimitAmount$1) {
            creditDepositRepository$checkCreditLimitAmount$1 = (CreditDepositRepository$checkCreditLimitAmount$1) continuationImpl;
            int i2 = creditDepositRepository$checkCreditLimitAmount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                creditDepositRepository$checkCreditLimitAmount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = creditDepositRepository$checkCreditLimitAmount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = creditDepositRepository$checkCreditLimitAmount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CreditDepositRepository$checkCreditLimitAmount$2 creditDepositRepository$checkCreditLimitAmount$2 = new CreditDepositRepository$checkCreditLimitAmount$2(this, creditLimitDepositAmountCheckRequest, null);
                    creditDepositRepository$checkCreditLimitAmount$1.label = 1;
                    c = c.c(creditDepositRepository$checkCreditLimitAmount$2, creditDepositRepository$checkCreditLimitAmount$1);
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
                CreditDepositRepository$checkCreditLimitAmount$3$1 creditDepositRepository$checkCreditLimitAmount$3$1 = new CreditDepositRepository$checkCreditLimitAmount$3$1(2, null);
                creditDepositRepository$checkCreditLimitAmount$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, creditDepositRepository$checkCreditLimitAmount$3$1, creditDepositRepository$checkCreditLimitAmount$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        creditDepositRepository$checkCreditLimitAmount$1 = new CreditDepositRepository$checkCreditLimitAmount$1(this, continuationImpl);
        Object obj2 = creditDepositRepository$checkCreditLimitAmount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = creditDepositRepository$checkCreditLimitAmount$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(MkkDepositAmountCheckRequest mkkDepositAmountCheckRequest, ContinuationImpl continuationImpl) {
        CreditDepositRepository$checkMkkAmount$1 creditDepositRepository$checkMkkAmount$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof CreditDepositRepository$checkMkkAmount$1) {
            creditDepositRepository$checkMkkAmount$1 = (CreditDepositRepository$checkMkkAmount$1) continuationImpl;
            int i2 = creditDepositRepository$checkMkkAmount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                creditDepositRepository$checkMkkAmount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = creditDepositRepository$checkMkkAmount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = creditDepositRepository$checkMkkAmount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CreditDepositRepository$checkMkkAmount$2 creditDepositRepository$checkMkkAmount$2 = new CreditDepositRepository$checkMkkAmount$2(this, mkkDepositAmountCheckRequest, null);
                    creditDepositRepository$checkMkkAmount$1.label = 1;
                    c = c.c(creditDepositRepository$checkMkkAmount$2, creditDepositRepository$checkMkkAmount$1);
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
                CreditDepositRepository$checkMkkAmount$3$1 creditDepositRepository$checkMkkAmount$3$1 = new CreditDepositRepository$checkMkkAmount$3$1(2, null);
                creditDepositRepository$checkMkkAmount$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, creditDepositRepository$checkMkkAmount$3$1, creditDepositRepository$checkMkkAmount$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        creditDepositRepository$checkMkkAmount$1 = new CreditDepositRepository$checkMkkAmount$1(this, continuationImpl);
        Object obj2 = creditDepositRepository$checkMkkAmount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = creditDepositRepository$checkMkkAmount$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, BoostDepositTransactionCreateRequest boostDepositTransactionCreateRequest, ContinuationImpl continuationImpl) {
        CreditDepositRepository$createBoostTransaction$1 creditDepositRepository$createBoostTransaction$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof CreditDepositRepository$createBoostTransaction$1) {
            creditDepositRepository$createBoostTransaction$1 = (CreditDepositRepository$createBoostTransaction$1) continuationImpl;
            int i2 = creditDepositRepository$createBoostTransaction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                creditDepositRepository$createBoostTransaction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = creditDepositRepository$createBoostTransaction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = creditDepositRepository$createBoostTransaction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CreditDepositRepository$createBoostTransaction$2 creditDepositRepository$createBoostTransaction$2 = new CreditDepositRepository$createBoostTransaction$2(this, str, boostDepositTransactionCreateRequest, null);
                    creditDepositRepository$createBoostTransaction$1.label = 1;
                    c = c.c(creditDepositRepository$createBoostTransaction$2, creditDepositRepository$createBoostTransaction$1);
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
                CreditDepositRepository$createBoostTransaction$3$1 creditDepositRepository$createBoostTransaction$3$1 = new CreditDepositRepository$createBoostTransaction$3$1(2, null);
                creditDepositRepository$createBoostTransaction$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, creditDepositRepository$createBoostTransaction$3$1, creditDepositRepository$createBoostTransaction$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        creditDepositRepository$createBoostTransaction$1 = new CreditDepositRepository$createBoostTransaction$1(this, continuationImpl);
        Object obj2 = creditDepositRepository$createBoostTransaction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = creditDepositRepository$createBoostTransaction$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, CreditLimitDepositTransactionCreateRequest creditLimitDepositTransactionCreateRequest, ContinuationImpl continuationImpl) {
        CreditDepositRepository$createCreditLimitTransaction$1 creditDepositRepository$createCreditLimitTransaction$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof CreditDepositRepository$createCreditLimitTransaction$1) {
            creditDepositRepository$createCreditLimitTransaction$1 = (CreditDepositRepository$createCreditLimitTransaction$1) continuationImpl;
            int i2 = creditDepositRepository$createCreditLimitTransaction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                creditDepositRepository$createCreditLimitTransaction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = creditDepositRepository$createCreditLimitTransaction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = creditDepositRepository$createCreditLimitTransaction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CreditDepositRepository$createCreditLimitTransaction$2 creditDepositRepository$createCreditLimitTransaction$2 = new CreditDepositRepository$createCreditLimitTransaction$2(this, str, creditLimitDepositTransactionCreateRequest, null);
                    creditDepositRepository$createCreditLimitTransaction$1.label = 1;
                    c = c.c(creditDepositRepository$createCreditLimitTransaction$2, creditDepositRepository$createCreditLimitTransaction$1);
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
                CreditDepositRepository$createCreditLimitTransaction$3$1 creditDepositRepository$createCreditLimitTransaction$3$1 = new CreditDepositRepository$createCreditLimitTransaction$3$1(2, null);
                creditDepositRepository$createCreditLimitTransaction$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, creditDepositRepository$createCreditLimitTransaction$3$1, creditDepositRepository$createCreditLimitTransaction$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        creditDepositRepository$createCreditLimitTransaction$1 = new CreditDepositRepository$createCreditLimitTransaction$1(this, continuationImpl);
        Object obj2 = creditDepositRepository$createCreditLimitTransaction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = creditDepositRepository$createCreditLimitTransaction$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, CreditDepositTransactionCreateRequest creditDepositTransactionCreateRequest, ContinuationImpl continuationImpl) {
        CreditDepositRepository$createCreditTransaction$1 creditDepositRepository$createCreditTransaction$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof CreditDepositRepository$createCreditTransaction$1) {
            creditDepositRepository$createCreditTransaction$1 = (CreditDepositRepository$createCreditTransaction$1) continuationImpl;
            int i2 = creditDepositRepository$createCreditTransaction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                creditDepositRepository$createCreditTransaction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = creditDepositRepository$createCreditTransaction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = creditDepositRepository$createCreditTransaction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CreditDepositRepository$createCreditTransaction$2 creditDepositRepository$createCreditTransaction$2 = new CreditDepositRepository$createCreditTransaction$2(this, str, creditDepositTransactionCreateRequest, null);
                    creditDepositRepository$createCreditTransaction$1.label = 1;
                    c = c.c(creditDepositRepository$createCreditTransaction$2, creditDepositRepository$createCreditTransaction$1);
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
                CreditDepositRepository$createCreditTransaction$3$1 creditDepositRepository$createCreditTransaction$3$1 = new CreditDepositRepository$createCreditTransaction$3$1(2, null);
                creditDepositRepository$createCreditTransaction$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, creditDepositRepository$createCreditTransaction$3$1, creditDepositRepository$createCreditTransaction$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        creditDepositRepository$createCreditTransaction$1 = new CreditDepositRepository$createCreditTransaction$1(this, continuationImpl);
        Object obj2 = creditDepositRepository$createCreditTransaction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = creditDepositRepository$createCreditTransaction$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, MkkDepositTransactionCreateRequest mkkDepositTransactionCreateRequest, ContinuationImpl continuationImpl) {
        CreditDepositRepository$createMkkTransaction$1 creditDepositRepository$createMkkTransaction$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof CreditDepositRepository$createMkkTransaction$1) {
            creditDepositRepository$createMkkTransaction$1 = (CreditDepositRepository$createMkkTransaction$1) continuationImpl;
            int i2 = creditDepositRepository$createMkkTransaction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                creditDepositRepository$createMkkTransaction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = creditDepositRepository$createMkkTransaction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = creditDepositRepository$createMkkTransaction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CreditDepositRepository$createMkkTransaction$2 creditDepositRepository$createMkkTransaction$2 = new CreditDepositRepository$createMkkTransaction$2(this, str, mkkDepositTransactionCreateRequest, null);
                    creditDepositRepository$createMkkTransaction$1.label = 1;
                    c = c.c(creditDepositRepository$createMkkTransaction$2, creditDepositRepository$createMkkTransaction$1);
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
                CreditDepositRepository$createMkkTransaction$3$1 creditDepositRepository$createMkkTransaction$3$1 = new CreditDepositRepository$createMkkTransaction$3$1(2, null);
                creditDepositRepository$createMkkTransaction$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, creditDepositRepository$createMkkTransaction$3$1, creditDepositRepository$createMkkTransaction$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        creditDepositRepository$createMkkTransaction$1 = new CreditDepositRepository$createMkkTransaction$1(this, continuationImpl);
        Object obj2 = creditDepositRepository$createMkkTransaction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = creditDepositRepository$createMkkTransaction$1.label;
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
    public final Object i(BoostDepositPageRequest boostDepositPageRequest, ContinuationImpl continuationImpl) {
        CreditDepositRepository$getBoostDepositPage$1 creditDepositRepository$getBoostDepositPage$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof CreditDepositRepository$getBoostDepositPage$1) {
            creditDepositRepository$getBoostDepositPage$1 = (CreditDepositRepository$getBoostDepositPage$1) continuationImpl;
            int i2 = creditDepositRepository$getBoostDepositPage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                creditDepositRepository$getBoostDepositPage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = creditDepositRepository$getBoostDepositPage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = creditDepositRepository$getBoostDepositPage$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CreditDepositRepository$getBoostDepositPage$2 creditDepositRepository$getBoostDepositPage$2 = new CreditDepositRepository$getBoostDepositPage$2(this, boostDepositPageRequest, null);
                    creditDepositRepository$getBoostDepositPage$1.label = 1;
                    c = c.c(creditDepositRepository$getBoostDepositPage$2, creditDepositRepository$getBoostDepositPage$1);
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
                CreditDepositRepository$getBoostDepositPage$3$1 creditDepositRepository$getBoostDepositPage$3$1 = new CreditDepositRepository$getBoostDepositPage$3$1(this, null);
                creditDepositRepository$getBoostDepositPage$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, creditDepositRepository$getBoostDepositPage$3$1, creditDepositRepository$getBoostDepositPage$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        creditDepositRepository$getBoostDepositPage$1 = new CreditDepositRepository$getBoostDepositPage$1(this, continuationImpl);
        Object obj2 = creditDepositRepository$getBoostDepositPage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = creditDepositRepository$getBoostDepositPage$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(BoostDepositTransactionStatusRequest boostDepositTransactionStatusRequest, int i, ContinuationImpl continuationImpl) {
        CreditDepositRepository$getBoostTransactionStatus$1 creditDepositRepository$getBoostTransactionStatus$1;
        int i2;
        Object c;
        Throwable a;
        iyd0 iyd0Var;
        Object a2;
        if (continuationImpl instanceof CreditDepositRepository$getBoostTransactionStatus$1) {
            creditDepositRepository$getBoostTransactionStatus$1 = (CreditDepositRepository$getBoostTransactionStatus$1) continuationImpl;
            int i3 = creditDepositRepository$getBoostTransactionStatus$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                creditDepositRepository$getBoostTransactionStatus$1.label = i3 - Integer.MIN_VALUE;
                Object obj = creditDepositRepository$getBoostTransactionStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = creditDepositRepository$getBoostTransactionStatus$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    CreditDepositRepository$getBoostTransactionStatus$2 creditDepositRepository$getBoostTransactionStatus$2 = new CreditDepositRepository$getBoostTransactionStatus$2(this, boostDepositTransactionStatusRequest, i, null);
                    creditDepositRepository$getBoostTransactionStatus$1.label = 1;
                    c = c.c(creditDepositRepository$getBoostTransactionStatus$2, creditDepositRepository$getBoostTransactionStatus$1);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        iyd0Var = (iyd0) creditDepositRepository$getBoostTransactionStatus$1.L$0;
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
                CreditDepositRepository$getBoostTransactionStatus$3$1$1 creditDepositRepository$getBoostTransactionStatus$3$1$1 = new CreditDepositRepository$getBoostTransactionStatus$3$1$1(2, null);
                creditDepositRepository$getBoostTransactionStatus$1.L$0 = iyd0Var;
                creditDepositRepository$getBoostTransactionStatus$1.label = 2;
                a2 = com.ybsdk.core.utils.dto.b.a(dataWithStatusResponse, creditDepositRepository$getBoostTransactionStatus$3$1$1, creditDepositRepository$getBoostTransactionStatus$1);
            }
        }
        creditDepositRepository$getBoostTransactionStatus$1 = new CreditDepositRepository$getBoostTransactionStatus$1(this, continuationImpl);
        Object obj2 = creditDepositRepository$getBoostTransactionStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = creditDepositRepository$getBoostTransactionStatus$1.label;
        if (i2 != 0) {
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
    public final Object k(CreditDepositPageRequest creditDepositPageRequest, ContinuationImpl continuationImpl) {
        CreditDepositRepository$getCreditDepositPage$1 creditDepositRepository$getCreditDepositPage$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof CreditDepositRepository$getCreditDepositPage$1) {
            creditDepositRepository$getCreditDepositPage$1 = (CreditDepositRepository$getCreditDepositPage$1) continuationImpl;
            int i2 = creditDepositRepository$getCreditDepositPage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                creditDepositRepository$getCreditDepositPage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = creditDepositRepository$getCreditDepositPage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = creditDepositRepository$getCreditDepositPage$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CreditDepositRepository$getCreditDepositPage$2 creditDepositRepository$getCreditDepositPage$2 = new CreditDepositRepository$getCreditDepositPage$2(this, creditDepositPageRequest, null);
                    creditDepositRepository$getCreditDepositPage$1.label = 1;
                    c = c.c(creditDepositRepository$getCreditDepositPage$2, creditDepositRepository$getCreditDepositPage$1);
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
                CreditDepositRepository$getCreditDepositPage$3$1 creditDepositRepository$getCreditDepositPage$3$1 = new CreditDepositRepository$getCreditDepositPage$3$1(this, null);
                creditDepositRepository$getCreditDepositPage$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, creditDepositRepository$getCreditDepositPage$3$1, creditDepositRepository$getCreditDepositPage$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        creditDepositRepository$getCreditDepositPage$1 = new CreditDepositRepository$getCreditDepositPage$1(this, continuationImpl);
        Object obj2 = creditDepositRepository$getCreditDepositPage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = creditDepositRepository$getCreditDepositPage$1.label;
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
    public final Object l(CreditLimitDepositPageRequest creditLimitDepositPageRequest, ContinuationImpl continuationImpl) {
        CreditDepositRepository$getCreditLimitDepositPage$1 creditDepositRepository$getCreditLimitDepositPage$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof CreditDepositRepository$getCreditLimitDepositPage$1) {
            creditDepositRepository$getCreditLimitDepositPage$1 = (CreditDepositRepository$getCreditLimitDepositPage$1) continuationImpl;
            int i2 = creditDepositRepository$getCreditLimitDepositPage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                creditDepositRepository$getCreditLimitDepositPage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = creditDepositRepository$getCreditLimitDepositPage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = creditDepositRepository$getCreditLimitDepositPage$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CreditDepositRepository$getCreditLimitDepositPage$2 creditDepositRepository$getCreditLimitDepositPage$2 = new CreditDepositRepository$getCreditLimitDepositPage$2(this, creditLimitDepositPageRequest, null);
                    creditDepositRepository$getCreditLimitDepositPage$1.label = 1;
                    c = c.c(creditDepositRepository$getCreditLimitDepositPage$2, creditDepositRepository$getCreditLimitDepositPage$1);
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
                CreditDepositRepository$getCreditLimitDepositPage$3$1 creditDepositRepository$getCreditLimitDepositPage$3$1 = new CreditDepositRepository$getCreditLimitDepositPage$3$1(this, null);
                creditDepositRepository$getCreditLimitDepositPage$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, creditDepositRepository$getCreditLimitDepositPage$3$1, creditDepositRepository$getCreditLimitDepositPage$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        creditDepositRepository$getCreditLimitDepositPage$1 = new CreditDepositRepository$getCreditLimitDepositPage$1(this, continuationImpl);
        Object obj2 = creditDepositRepository$getCreditLimitDepositPage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = creditDepositRepository$getCreditLimitDepositPage$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(CreditLimitDepositTransactionStatusRequest creditLimitDepositTransactionStatusRequest, int i, ContinuationImpl continuationImpl) {
        CreditDepositRepository$getCreditLimitTransactionStatus$1 creditDepositRepository$getCreditLimitTransactionStatus$1;
        int i2;
        Object c;
        Throwable a;
        iyd0 iyd0Var;
        Object a2;
        if (continuationImpl instanceof CreditDepositRepository$getCreditLimitTransactionStatus$1) {
            creditDepositRepository$getCreditLimitTransactionStatus$1 = (CreditDepositRepository$getCreditLimitTransactionStatus$1) continuationImpl;
            int i3 = creditDepositRepository$getCreditLimitTransactionStatus$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                creditDepositRepository$getCreditLimitTransactionStatus$1.label = i3 - Integer.MIN_VALUE;
                Object obj = creditDepositRepository$getCreditLimitTransactionStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = creditDepositRepository$getCreditLimitTransactionStatus$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    CreditDepositRepository$getCreditLimitTransactionStatus$2 creditDepositRepository$getCreditLimitTransactionStatus$2 = new CreditDepositRepository$getCreditLimitTransactionStatus$2(this, creditLimitDepositTransactionStatusRequest, i, null);
                    creditDepositRepository$getCreditLimitTransactionStatus$1.label = 1;
                    c = c.c(creditDepositRepository$getCreditLimitTransactionStatus$2, creditDepositRepository$getCreditLimitTransactionStatus$1);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        iyd0Var = (iyd0) creditDepositRepository$getCreditLimitTransactionStatus$1.L$0;
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
                CreditDepositRepository$getCreditLimitTransactionStatus$3$1$1 creditDepositRepository$getCreditLimitTransactionStatus$3$1$1 = new CreditDepositRepository$getCreditLimitTransactionStatus$3$1$1(2, null);
                creditDepositRepository$getCreditLimitTransactionStatus$1.L$0 = iyd0Var;
                creditDepositRepository$getCreditLimitTransactionStatus$1.label = 2;
                a2 = com.ybsdk.core.utils.dto.b.a(dataWithStatusResponse, creditDepositRepository$getCreditLimitTransactionStatus$3$1$1, creditDepositRepository$getCreditLimitTransactionStatus$1);
            }
        }
        creditDepositRepository$getCreditLimitTransactionStatus$1 = new CreditDepositRepository$getCreditLimitTransactionStatus$1(this, continuationImpl);
        Object obj2 = creditDepositRepository$getCreditLimitTransactionStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = creditDepositRepository$getCreditLimitTransactionStatus$1.label;
        if (i2 != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(CreditDepositTransactionStatusRequest creditDepositTransactionStatusRequest, int i, ContinuationImpl continuationImpl) {
        CreditDepositRepository$getCreditTransactionStatus$1 creditDepositRepository$getCreditTransactionStatus$1;
        int i2;
        Object c;
        Throwable a;
        iyd0 iyd0Var;
        Object a2;
        if (continuationImpl instanceof CreditDepositRepository$getCreditTransactionStatus$1) {
            creditDepositRepository$getCreditTransactionStatus$1 = (CreditDepositRepository$getCreditTransactionStatus$1) continuationImpl;
            int i3 = creditDepositRepository$getCreditTransactionStatus$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                creditDepositRepository$getCreditTransactionStatus$1.label = i3 - Integer.MIN_VALUE;
                Object obj = creditDepositRepository$getCreditTransactionStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = creditDepositRepository$getCreditTransactionStatus$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    CreditDepositRepository$getCreditTransactionStatus$2 creditDepositRepository$getCreditTransactionStatus$2 = new CreditDepositRepository$getCreditTransactionStatus$2(this, creditDepositTransactionStatusRequest, i, null);
                    creditDepositRepository$getCreditTransactionStatus$1.label = 1;
                    c = c.c(creditDepositRepository$getCreditTransactionStatus$2, creditDepositRepository$getCreditTransactionStatus$1);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        iyd0Var = (iyd0) creditDepositRepository$getCreditTransactionStatus$1.L$0;
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
                CreditDepositRepository$getCreditTransactionStatus$3$1$1 creditDepositRepository$getCreditTransactionStatus$3$1$1 = new CreditDepositRepository$getCreditTransactionStatus$3$1$1(2, null);
                creditDepositRepository$getCreditTransactionStatus$1.L$0 = iyd0Var;
                creditDepositRepository$getCreditTransactionStatus$1.label = 2;
                a2 = com.ybsdk.core.utils.dto.b.a(dataWithStatusResponse, creditDepositRepository$getCreditTransactionStatus$3$1$1, creditDepositRepository$getCreditTransactionStatus$1);
            }
        }
        creditDepositRepository$getCreditTransactionStatus$1 = new CreditDepositRepository$getCreditTransactionStatus$1(this, continuationImpl);
        Object obj2 = creditDepositRepository$getCreditTransactionStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = creditDepositRepository$getCreditTransactionStatus$1.label;
        if (i2 != 0) {
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
    public final Object o(MkkDepositPageRequest mkkDepositPageRequest, ContinuationImpl continuationImpl) {
        CreditDepositRepository$getMkkDepositPage$1 creditDepositRepository$getMkkDepositPage$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof CreditDepositRepository$getMkkDepositPage$1) {
            creditDepositRepository$getMkkDepositPage$1 = (CreditDepositRepository$getMkkDepositPage$1) continuationImpl;
            int i2 = creditDepositRepository$getMkkDepositPage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                creditDepositRepository$getMkkDepositPage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = creditDepositRepository$getMkkDepositPage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = creditDepositRepository$getMkkDepositPage$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CreditDepositRepository$getMkkDepositPage$2 creditDepositRepository$getMkkDepositPage$2 = new CreditDepositRepository$getMkkDepositPage$2(this, mkkDepositPageRequest, null);
                    creditDepositRepository$getMkkDepositPage$1.label = 1;
                    c = c.c(creditDepositRepository$getMkkDepositPage$2, creditDepositRepository$getMkkDepositPage$1);
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
                CreditDepositRepository$getMkkDepositPage$3$1 creditDepositRepository$getMkkDepositPage$3$1 = new CreditDepositRepository$getMkkDepositPage$3$1(this, null);
                creditDepositRepository$getMkkDepositPage$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, creditDepositRepository$getMkkDepositPage$3$1, creditDepositRepository$getMkkDepositPage$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        creditDepositRepository$getMkkDepositPage$1 = new CreditDepositRepository$getMkkDepositPage$1(this, continuationImpl);
        Object obj2 = creditDepositRepository$getMkkDepositPage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = creditDepositRepository$getMkkDepositPage$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(MkkDepositTransactionStatusRequest mkkDepositTransactionStatusRequest, int i, ContinuationImpl continuationImpl) {
        CreditDepositRepository$getMkkTransactionStatus$1 creditDepositRepository$getMkkTransactionStatus$1;
        int i2;
        Object c;
        Throwable a;
        iyd0 iyd0Var;
        Object a2;
        if (continuationImpl instanceof CreditDepositRepository$getMkkTransactionStatus$1) {
            creditDepositRepository$getMkkTransactionStatus$1 = (CreditDepositRepository$getMkkTransactionStatus$1) continuationImpl;
            int i3 = creditDepositRepository$getMkkTransactionStatus$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                creditDepositRepository$getMkkTransactionStatus$1.label = i3 - Integer.MIN_VALUE;
                Object obj = creditDepositRepository$getMkkTransactionStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = creditDepositRepository$getMkkTransactionStatus$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    CreditDepositRepository$getMkkTransactionStatus$2 creditDepositRepository$getMkkTransactionStatus$2 = new CreditDepositRepository$getMkkTransactionStatus$2(this, mkkDepositTransactionStatusRequest, i, null);
                    creditDepositRepository$getMkkTransactionStatus$1.label = 1;
                    c = c.c(creditDepositRepository$getMkkTransactionStatus$2, creditDepositRepository$getMkkTransactionStatus$1);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        iyd0Var = (iyd0) creditDepositRepository$getMkkTransactionStatus$1.L$0;
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
                CreditDepositRepository$getMkkTransactionStatus$3$1$1 creditDepositRepository$getMkkTransactionStatus$3$1$1 = new CreditDepositRepository$getMkkTransactionStatus$3$1$1(2, null);
                creditDepositRepository$getMkkTransactionStatus$1.L$0 = iyd0Var;
                creditDepositRepository$getMkkTransactionStatus$1.label = 2;
                a2 = com.ybsdk.core.utils.dto.b.a(dataWithStatusResponse, creditDepositRepository$getMkkTransactionStatus$3$1$1, creditDepositRepository$getMkkTransactionStatus$1);
            }
        }
        creditDepositRepository$getMkkTransactionStatus$1 = new CreditDepositRepository$getMkkTransactionStatus$1(this, continuationImpl);
        Object obj2 = creditDepositRepository$getMkkTransactionStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = creditDepositRepository$getMkkTransactionStatus$1.label;
        if (i2 != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
