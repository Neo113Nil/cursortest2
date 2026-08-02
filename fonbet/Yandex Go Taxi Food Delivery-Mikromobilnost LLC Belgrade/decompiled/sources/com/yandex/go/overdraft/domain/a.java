package com.yandex.go.overdraft.domain;

import com.yandex.go.overdraft.api.domain.model.OverdraftContext;
import com.yandex.go.overdraft.data.model.ActionButton;
import com.yandex.go.overdraft.data.model.ActionButtonPrerequisite;
import com.yandex.go.overdraft.data.model.ComparisonType;
import com.yandex.go.overdraft.data.model.DebtUiOpenSource;
import com.yandex.go.overdraft.data.model.RequiredBalance;
import com.yandex.go.yb.api.domain.model.YbSdkCheckPaymentCondition;
import com.yandex.go.yb.api.domain.model.YbSdkPaymentMethodInfo$ProductType;
import com.yandex.go.yb.data.u;
import defpackage.avu0;
import defpackage.es;
import defpackage.fs;
import defpackage.gs;
import defpackage.hs;
import defpackage.is;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.mv51;
import defpackage.nv51;
import defpackage.ny61;
import defpackage.ov51;
import defpackage.pv51;
import defpackage.qv51;
import defpackage.uv51;
import defpackage.w511;
import defpackage.zv51;
import java.math.BigDecimal;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class a {
    public final OverdraftContext a;
    public final u b;

    public a(OverdraftContext overdraftContext, u uVar) {
        this.a = overdraftContext;
        this.b = uVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0142, code lost:
    
        if (r3 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0067, code lost:
    
        if (r13.equals(r20 != null ? r20.getCode() : null) != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0168 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ActionButton actionButton, PaymentMethod$Type paymentMethod$Type, uv51 uv51Var, ContinuationImpl continuationImpl) {
        ActionButtonConditionsInteractor$checkActionButtonConditions$1 actionButtonConditionsInteractor$checkActionButtonConditions$1;
        int i;
        Object obj;
        DebtUiOpenSource debtUiOpenSource;
        boolean contains;
        RequiredBalance requiredBalance;
        Object b;
        String str;
        Double i2;
        ActionButtonPrerequisite actionButtonPrerequisite;
        ComparisonType comparisonType;
        int i3;
        boolean z;
        ActionButton actionButton2 = actionButton;
        if (continuationImpl instanceof ActionButtonConditionsInteractor$checkActionButtonConditions$1) {
            actionButtonConditionsInteractor$checkActionButtonConditions$1 = (ActionButtonConditionsInteractor$checkActionButtonConditions$1) continuationImpl;
            int i4 = actionButtonConditionsInteractor$checkActionButtonConditions$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                actionButtonConditionsInteractor$checkActionButtonConditions$1.label = i4 - Integer.MIN_VALUE;
                Object obj2 = actionButtonConditionsInteractor$checkActionButtonConditions$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = actionButtonConditionsInteractor$checkActionButtonConditions$1.label;
                boolean z2 = false;
                Object obj4 = gs.a;
                obj = fs.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ActionButtonPrerequisite actionButtonPrerequisite2 = actionButton2.f;
                    if (actionButtonPrerequisite2 != null) {
                        jsq0 jsq0Var = actionButtonPrerequisite2.d;
                        String str2 = actionButtonPrerequisite2.b;
                        if (str2 != null) {
                        }
                        if (jsq0Var == null) {
                            contains = true;
                        } else if (jsq0Var.a.isEmpty()) {
                            contains = false;
                        } else {
                            int i5 = is.e[this.a.ordinal()];
                            if (i5 == 1) {
                                debtUiOpenSource = DebtUiOpenSource.SUMMARY;
                            } else if (i5 == 2) {
                                debtUiOpenSource = DebtUiOpenSource.MAIN_SCREEN;
                            } else if (i5 == 3) {
                                debtUiOpenSource = DebtUiOpenSource.ACTIVE_ORDER;
                            } else {
                                if (i5 != 4 && i5 != 5) {
                                    w511.b();
                                    return null;
                                }
                                debtUiOpenSource = DebtUiOpenSource.ORDER_BUTTON;
                            }
                            contains = jsq0Var.contains(debtUiOpenSource);
                        }
                        if (contains) {
                            actionButtonConditionsInteractor$checkActionButtonConditions$1.L$0 = actionButton2;
                            actionButtonConditionsInteractor$checkActionButtonConditions$1.L$1 = null;
                            actionButtonConditionsInteractor$checkActionButtonConditions$1.L$2 = null;
                            actionButtonConditionsInteractor$checkActionButtonConditions$1.L$3 = actionButtonPrerequisite2;
                            actionButtonConditionsInteractor$checkActionButtonConditions$1.label = 1;
                            if (paymentMethod$Type != null && (requiredBalance = actionButtonPrerequisite2.c) != null) {
                                int i6 = is.c[paymentMethod$Type.ordinal()];
                                if (i6 == 1) {
                                    b = b(uv51Var, requiredBalance, actionButtonConditionsInteractor$checkActionButtonConditions$1);
                                } else if (i6 == 2 && jl40.l(requiredBalance.a, null) && (str = requiredBalance.c) != null && (i2 = avu0.i(str)) != null) {
                                    double doubleValue = i2.doubleValue();
                                    if (0.0d < doubleValue) {
                                        b = new es(new zv51(null, new BigDecimal(doubleValue)));
                                    }
                                } else {
                                    b = obj;
                                }
                                if (b != obj3) {
                                    return obj3;
                                }
                                obj2 = b;
                                actionButtonPrerequisite = actionButtonPrerequisite2;
                            }
                            b = obj4;
                            if (b != obj3) {
                            }
                        }
                        int i7 = is.a[actionButtonPrerequisite2.a.ordinal()];
                        if (i7 == 1 || i7 != 2) {
                        }
                    }
                    return obj4;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                actionButtonPrerequisite = (ActionButtonPrerequisite) actionButtonConditionsInteractor$checkActionButtonConditions$1.L$3;
                actionButton2 = (ActionButton) actionButtonConditionsInteractor$checkActionButtonConditions$1.L$0;
                kotlin.b.b(obj2);
                hs hsVar = (hs) obj2;
                RequiredBalance requiredBalance2 = actionButton2.f.c;
                comparisonType = requiredBalance2 == null ? requiredBalance2.b : null;
                if (comparisonType != null) {
                    if (!jl40.l(hsVar, obj)) {
                        int i8 = is.d[comparisonType.ordinal()];
                        if (i8 == 1) {
                            z = hsVar instanceof es;
                        } else if (i8 == 2) {
                            z = jl40.l(hsVar, obj4);
                        } else if (i8 != 3) {
                            w511.b();
                            return null;
                        }
                    }
                    z = false;
                }
                z2 = true;
                Objects.toString(actionButton2.d.a());
                System.out.getClass();
                i3 = is.a[actionButtonPrerequisite.a.ordinal()];
                if (i3 != 1 ? z2 : !(i3 != 2 || z2)) {
                    return hsVar;
                }
            }
        }
        actionButtonConditionsInteractor$checkActionButtonConditions$1 = new ActionButtonConditionsInteractor$checkActionButtonConditions$1(this, continuationImpl);
        Object obj22 = actionButtonConditionsInteractor$checkActionButtonConditions$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = actionButtonConditionsInteractor$checkActionButtonConditions$1.label;
        boolean z22 = false;
        Object obj42 = gs.a;
        obj = fs.a;
        if (i != 0) {
        }
        hs hsVar2 = (hs) obj22;
        RequiredBalance requiredBalance22 = actionButton2.f.c;
        if (requiredBalance22 == null) {
        }
        if (comparisonType != null) {
        }
        z22 = true;
        Objects.toString(actionButton2.d.a());
        System.out.getClass();
        i3 = is.a[actionButtonPrerequisite.a.ordinal()];
        return i3 != 1 ? obj : obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(uv51 uv51Var, RequiredBalance requiredBalance, ContinuationImpl continuationImpl) {
        ActionButtonConditionsInteractor$isYbWalletHasEnoughBalance$1 actionButtonConditionsInteractor$isYbWalletHasEnoughBalance$1;
        int i;
        String str;
        String str2;
        BigDecimal h;
        BigDecimal bigDecimal;
        qv51 qv51Var;
        if (continuationImpl instanceof ActionButtonConditionsInteractor$isYbWalletHasEnoughBalance$1) {
            actionButtonConditionsInteractor$isYbWalletHasEnoughBalance$1 = (ActionButtonConditionsInteractor$isYbWalletHasEnoughBalance$1) continuationImpl;
            int i2 = actionButtonConditionsInteractor$isYbWalletHasEnoughBalance$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                actionButtonConditionsInteractor$isYbWalletHasEnoughBalance$1.label = i2 - Integer.MIN_VALUE;
                Object obj = actionButtonConditionsInteractor$isYbWalletHasEnoughBalance$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = actionButtonConditionsInteractor$isYbWalletHasEnoughBalance$1.label;
                zv51 zv51Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if ((uv51Var != null ? uv51Var.d : null) != YbSdkPaymentMethodInfo$ProductType.CREDIT_LIMIT) {
                        if (uv51Var != null && (str = uv51Var.a) != null && (str2 = requiredBalance.c) != null && (h = avu0.h(str2)) != null) {
                            String str3 = requiredBalance.a;
                            actionButtonConditionsInteractor$isYbWalletHasEnoughBalance$1.L$0 = uv51Var;
                            actionButtonConditionsInteractor$isYbWalletHasEnoughBalance$1.L$1 = requiredBalance;
                            actionButtonConditionsInteractor$isYbWalletHasEnoughBalance$1.L$2 = null;
                            actionButtonConditionsInteractor$isYbWalletHasEnoughBalance$1.L$3 = h;
                            actionButtonConditionsInteractor$isYbWalletHasEnoughBalance$1.label = 1;
                            obj = this.b.b(str, h, str3, actionButtonConditionsInteractor$isYbWalletHasEnoughBalance$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            bigDecimal = h;
                        }
                        return fs.a;
                    }
                    return gs.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bigDecimal = (BigDecimal) actionButtonConditionsInteractor$isYbWalletHasEnoughBalance$1.L$3;
                requiredBalance = (RequiredBalance) actionButtonConditionsInteractor$isYbWalletHasEnoughBalance$1.L$1;
                uv51Var = (uv51) actionButtonConditionsInteractor$isYbWalletHasEnoughBalance$1.L$0;
                kotlin.b.b(obj);
                qv51Var = (qv51) obj;
                if (!jl40.l(qv51Var, nv51.a)) {
                    if (!jl40.l(qv51Var, ov51.a) && (qv51Var instanceof pv51) && ((pv51) qv51Var).a == YbSdkCheckPaymentCondition.TOPUP) {
                        String str4 = requiredBalance.a;
                        mv51 mv51Var = uv51Var.e;
                        if (mv51Var != null) {
                            BigDecimal bigDecimal2 = mv51Var.a;
                            if (jl40.l(mv51Var.b, str4)) {
                                BigDecimal subtract = bigDecimal.subtract(bigDecimal2);
                                if (subtract.compareTo(BigDecimal.ZERO) > 0) {
                                    zv51Var = new zv51(str4, subtract);
                                }
                            }
                        }
                        if (zv51Var != null) {
                            return new es(zv51Var);
                        }
                    }
                    return fs.a;
                }
                return gs.a;
            }
        }
        actionButtonConditionsInteractor$isYbWalletHasEnoughBalance$1 = new ActionButtonConditionsInteractor$isYbWalletHasEnoughBalance$1(this, continuationImpl);
        Object obj2 = actionButtonConditionsInteractor$isYbWalletHasEnoughBalance$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = actionButtonConditionsInteractor$isYbWalletHasEnoughBalance$1.label;
        zv51 zv51Var2 = null;
        if (i != 0) {
        }
        qv51Var = (qv51) obj2;
        if (!jl40.l(qv51Var, nv51.a)) {
        }
        return gs.a;
    }
}
