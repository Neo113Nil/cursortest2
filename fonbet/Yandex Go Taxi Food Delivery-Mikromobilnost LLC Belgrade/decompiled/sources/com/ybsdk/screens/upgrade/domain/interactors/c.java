package com.ybsdk.screens.upgrade.domain.interactors;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.utils.dto.common.ApplicationType;
import com.ybsdk.screens.upgrade.domain.entities.SimpleIdFormFieldEntity;
import defpackage.d6v;
import defpackage.db21;
import defpackage.des0;
import defpackage.gci0;
import defpackage.i5z0;
import defpackage.ja21;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.k03;
import defpackage.m1e0;
import defpackage.na21;
import defpackage.nbp0;
import defpackage.ny61;
import defpackage.ob21;
import defpackage.qff;
import defpackage.rfs0;
import defpackage.rol0;
import defpackage.ta21;
import defpackage.w511;
import defpackage.wls;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class c {
    public final db21 a;
    public final k03 b;
    public final des0 c;
    public final AppAnalyticsReporter d;
    public final r0 e;
    public final gci0 f;
    public final gci0 g;

    public c(db21 db21Var, k03 k03Var, des0 des0Var, nbp0 nbp0Var, AppAnalyticsReporter appAnalyticsReporter, na21 na21Var) {
        this.a = db21Var;
        this.b = k03Var;
        this.c = des0Var;
        this.d = appAnalyticsReporter;
        r0 r0Var = na21Var.a;
        this.e = r0Var;
        gci0 d = e.d(r0Var);
        this.f = d;
        this.g = e.R(new jqr(e.t(new n(new rol0(new UpgradeInteractorImpl$special$$inlined$transform$1(e.p(e.t(new qff(d, 1)), 300L), null, this)), new UpgradeInteractorImpl$innSuggestFlow$3(2, null))), new UpgradeInteractorImpl$innSuggestFlow$4(this, null), 3), nbp0Var.a, wsr0.a(xsr0.a, 3), ob21.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r13 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        UpgradeInteractorImpl$createSimpleIDApplication$1 upgradeInteractorImpl$createSimpleIDApplication$1;
        int i;
        Object a;
        if (continuationImpl instanceof UpgradeInteractorImpl$createSimpleIDApplication$1) {
            upgradeInteractorImpl$createSimpleIDApplication$1 = (UpgradeInteractorImpl$createSimpleIDApplication$1) continuationImpl;
            int i2 = upgradeInteractorImpl$createSimpleIDApplication$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upgradeInteractorImpl$createSimpleIDApplication$1.label = i2 - Integer.MIN_VALUE;
                Object obj = upgradeInteractorImpl$createSimpleIDApplication$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upgradeInteractorImpl$createSimpleIDApplication$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    upgradeInteractorImpl$createSimpleIDApplication$1.label = 1;
                    a = ((com.ybsdk.screens.upgrade.data.a) this.a).a(upgradeInteractorImpl$createSimpleIDApplication$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj2 = upgradeInteractorImpl$createSimpleIDApplication$1.L$0;
                        kotlin.b.b(obj);
                        return obj2;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    ja21 ja21Var = ((rfs0) a).c;
                    des0 des0Var = this.c;
                    des0Var.getClass();
                    SimpleIdFormFieldEntity simpleIdFormFieldEntity = SimpleIdFormFieldEntity.FIRST_NAME;
                    String a2 = des0Var.a(simpleIdFormFieldEntity, ja21Var.b(simpleIdFormFieldEntity));
                    SimpleIdFormFieldEntity simpleIdFormFieldEntity2 = SimpleIdFormFieldEntity.LAST_NAME;
                    String a3 = des0Var.a(simpleIdFormFieldEntity2, ja21Var.b(simpleIdFormFieldEntity2));
                    SimpleIdFormFieldEntity simpleIdFormFieldEntity3 = SimpleIdFormFieldEntity.MIDDLE_NAME;
                    String a4 = des0Var.a(simpleIdFormFieldEntity3, ja21Var.b(simpleIdFormFieldEntity3));
                    SimpleIdFormFieldEntity simpleIdFormFieldEntity4 = SimpleIdFormFieldEntity.BIRTHDAY;
                    String a5 = des0Var.a(simpleIdFormFieldEntity4, ja21Var.b(simpleIdFormFieldEntity4));
                    SimpleIdFormFieldEntity simpleIdFormFieldEntity5 = SimpleIdFormFieldEntity.PASSPORT_NUMBER;
                    String a6 = des0Var.a(simpleIdFormFieldEntity5, ja21Var.b(simpleIdFormFieldEntity5));
                    SimpleIdFormFieldEntity simpleIdFormFieldEntity6 = SimpleIdFormFieldEntity.INN_OR_SNILS;
                    ja21 a7 = ja21.a(ja21Var, a2, a3, a4, a6, a5, des0Var.a(simpleIdFormFieldEntity6, ja21Var.b(simpleIdFormFieldEntity6)), 192);
                    upgradeInteractorImpl$createSimpleIDApplication$1.L$0 = a;
                    upgradeInteractorImpl$createSimpleIDApplication$1.label = 2;
                    this.e.emit(a7, upgradeInteractorImpl$createSimpleIDApplication$1);
                    if (zy11.a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return a;
            }
        }
        upgradeInteractorImpl$createSimpleIDApplication$1 = new UpgradeInteractorImpl$createSimpleIDApplication$1(this, continuationImpl);
        Object obj3 = upgradeInteractorImpl$createSimpleIDApplication$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upgradeInteractorImpl$createSimpleIDApplication$1.label;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ba, code lost:
    
        if (((com.ybsdk.common.repositiories.applications.b) r4).f(r10, r11, r1) != r2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0070, code lost:
    
        if (r11 == r2) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077 A[Catch: all -> 0x00c3, TRY_ENTER, TryCatch #0 {all -> 0x00c3, blocks: (B:13:0x0031, B:14:0x00bd, B:21:0x0040, B:22:0x009a, B:26:0x004d, B:27:0x008a, B:34:0x0077), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(d6v d6vVar, String str, ContinuationImpl continuationImpl) {
        UpgradeInteractorImpl$submitForm$1 upgradeInteractorImpl$submitForm$1;
        int i;
        Object O;
        String str2;
        db21 db21Var;
        String str3;
        try {
            if (continuationImpl instanceof UpgradeInteractorImpl$submitForm$1) {
                upgradeInteractorImpl$submitForm$1 = (UpgradeInteractorImpl$submitForm$1) continuationImpl;
                int i2 = upgradeInteractorImpl$submitForm$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    upgradeInteractorImpl$submitForm$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = upgradeInteractorImpl$submitForm$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = upgradeInteractorImpl$submitForm$1.label;
                    k03 k03Var = this.b;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        wls upgradeInteractorImpl$submitForm$2 = new UpgradeInteractorImpl$submitForm$2(this, str, null);
                        upgradeInteractorImpl$submitForm$1.L$0 = str;
                        upgradeInteractorImpl$submitForm$1.label = 1;
                        O = d6vVar.O(upgradeInteractorImpl$submitForm$2, str, upgradeInteractorImpl$submitForm$1);
                    } else if (i == 1) {
                        str = (String) upgradeInteractorImpl$submitForm$1.L$0;
                        kotlin.b.b(obj);
                        O = ((Result) obj).getValue();
                    } else if (i == 2) {
                        str2 = (String) upgradeInteractorImpl$submitForm$1.L$0;
                        kotlin.b.b(obj);
                        db21Var = this.a;
                        upgradeInteractorImpl$submitForm$1.L$0 = str2;
                        upgradeInteractorImpl$submitForm$1.label = 3;
                        if (((com.ybsdk.screens.upgrade.data.a) db21Var).c(str2, upgradeInteractorImpl$submitForm$1) != obj2) {
                            return obj2;
                        }
                        str3 = str2;
                        i5z0.a.a("DDEBUG UpgradeInteractor will startPolling for " + str3, new Object[0]);
                        m1e0 m1e0Var = m1e0.b;
                        upgradeInteractorImpl$submitForm$1.L$0 = null;
                        upgradeInteractorImpl$submitForm$1.label = 4;
                    } else {
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            zy11 zy11Var = zy11.a;
                            kotlin.b.b(zy11Var);
                            return zy11Var;
                        }
                        str3 = (String) upgradeInteractorImpl$submitForm$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        i5z0.a.a("DDEBUG UpgradeInteractor will startPolling for " + str3, new Object[0]);
                        m1e0 m1e0Var2 = m1e0.b;
                        upgradeInteractorImpl$submitForm$1.L$0 = null;
                        upgradeInteractorImpl$submitForm$1.label = 4;
                    }
                    if (!(O instanceof Result.Failure)) {
                        return O;
                    }
                    ApplicationType applicationType = ApplicationType.SIMPLIFIED_IDENTIFICATION;
                    upgradeInteractorImpl$submitForm$1.L$0 = str;
                    upgradeInteractorImpl$submitForm$1.label = 2;
                    if (((com.ybsdk.common.repositiories.applications.b) k03Var).a(applicationType, str, upgradeInteractorImpl$submitForm$1) == obj2) {
                        return obj2;
                    }
                    str2 = str;
                    db21Var = this.a;
                    upgradeInteractorImpl$submitForm$1.L$0 = str2;
                    upgradeInteractorImpl$submitForm$1.label = 3;
                    if (((com.ybsdk.screens.upgrade.data.a) db21Var).c(str2, upgradeInteractorImpl$submitForm$1) != obj2) {
                    }
                }
            }
            if (i != 0) {
            }
            if (!(O instanceof Result.Failure)) {
            }
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        upgradeInteractorImpl$submitForm$1 = new UpgradeInteractorImpl$submitForm$1(this, continuationImpl);
        Object obj3 = upgradeInteractorImpl$submitForm$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upgradeInteractorImpl$submitForm$1.label;
        k03 k03Var2 = this.b;
    }

    public final void c(SimpleIdFormFieldEntity simpleIdFormFieldEntity, String str) {
        ja21 a;
        int i = ta21.a[simpleIdFormFieldEntity.ordinal()];
        r0 r0Var = this.e;
        switch (i) {
            case 1:
                a = ja21.a((ja21) r0Var.getValue(), str, null, null, null, null, null, 254);
                break;
            case 2:
                a = ja21.a((ja21) r0Var.getValue(), null, str, null, null, null, null, 253);
                break;
            case 3:
                a = ja21.a((ja21) r0Var.getValue(), null, null, str, null, null, null, 251);
                break;
            case 4:
                a = ja21.a((ja21) r0Var.getValue(), null, null, null, null, str, null, 239);
                break;
            case 5:
                a = ja21.a((ja21) r0Var.getValue(), null, null, null, str, null, null, 247);
                break;
            case 6:
                a = ja21.a((ja21) r0Var.getValue(), null, null, null, null, null, str, 223);
                break;
            default:
                w511.b();
                return;
        }
        r0Var.getClass();
        r0Var.m(null, a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        UpgradeInteractorImpl$uploadDraft$1 upgradeInteractorImpl$uploadDraft$1;
        int i;
        if (continuationImpl instanceof UpgradeInteractorImpl$uploadDraft$1) {
            upgradeInteractorImpl$uploadDraft$1 = (UpgradeInteractorImpl$uploadDraft$1) continuationImpl;
            int i2 = upgradeInteractorImpl$uploadDraft$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upgradeInteractorImpl$uploadDraft$1.label = i2 - Integer.MIN_VALUE;
                Object obj = upgradeInteractorImpl$uploadDraft$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upgradeInteractorImpl$uploadDraft$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                r0 r0Var = this.e;
                if (jl40.l(r0Var.getValue(), ja21.i)) {
                    return zy11.a;
                }
                ja21 ja21Var = (ja21) r0Var.getValue();
                upgradeInteractorImpl$uploadDraft$1.label = 1;
                Object e = ((com.ybsdk.screens.upgrade.data.a) this.a).e(str, ja21Var, upgradeInteractorImpl$uploadDraft$1);
                return e == coroutineSingletons ? coroutineSingletons : e;
            }
        }
        upgradeInteractorImpl$uploadDraft$1 = new UpgradeInteractorImpl$uploadDraft$1(this, continuationImpl);
        Object obj2 = upgradeInteractorImpl$uploadDraft$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upgradeInteractorImpl$uploadDraft$1.label;
        if (i == 0) {
        }
    }
}
