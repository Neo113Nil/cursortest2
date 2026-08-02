package com.yandex.go.taxi.main.shortcuts.interactors;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.clarify_address.before_order.ClarifyAddressBeforeOrderOrigin;
import com.yandex.go.dto.response.Action$TaxiExpectedDestination;
import com.yandex.go.models.SummaryRedirectActionModel;
import defpackage.b8r;
import defpackage.dkv0;
import defpackage.gkv0;
import defpackage.gvh;
import defpackage.h1s0;
import defpackage.hcu;
import defpackage.jjv0;
import defpackage.m1s0;
import defpackage.mxb;
import defpackage.n1s0;
import defpackage.ny61;
import defpackage.o820;
import defpackage.pv0;
import defpackage.sxg;
import defpackage.xxr0;
import defpackage.yyr0;
import defpackage.za31;
import defpackage.zy11;
import defpackage.zzs;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class c implements n1s0 {
    public final ru.yandex.taxi.shortcuts.interactors.a a;
    public final ru.yandex.taxi.location.user.c b;
    public final com.yandex.go.route.interactor.b c;
    public final h1s0 d;
    public final hcu e;
    public final b8r f;
    public final gvh g;
    public final jjv0 h;
    public final dkv0 i;
    public final mxb j;
    public final com.yandex.go.taxi.tariffs.internal.interactor.a k;

    public c(ru.yandex.taxi.shortcuts.interactors.a aVar, ru.yandex.taxi.location.user.c cVar, com.yandex.go.route.interactor.b bVar, h1s0 h1s0Var, hcu hcuVar, b8r b8rVar, gvh gvhVar, jjv0 jjv0Var, dkv0 dkv0Var, mxb mxbVar, com.yandex.go.taxi.tariffs.internal.interactor.a aVar2) {
        this.a = aVar;
        this.b = cVar;
        this.c = bVar;
        this.d = h1s0Var;
        this.e = hcuVar;
        this.f = b8rVar;
        this.g = gvhVar;
        this.h = jjv0Var;
        this.i = dkv0Var;
        this.j = mxbVar;
        this.k = aVar2;
    }

    public final void a(sxg sxgVar) {
        boolean z = sxgVar.b;
        pv0 pv0Var = sxgVar.a;
        h1s0 h1s0Var = this.d;
        if (!z) {
            Address address = pv0Var.a;
            this.c.l(address);
            h1s0Var.c(address);
        } else {
            Address e = this.b.a.e();
            if (e == null) {
                e = PlainAddress.a;
            }
            h1s0Var.a(pv0Var, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Action$TaxiExpectedDestination action$TaxiExpectedDestination, o820 o820Var, ContinuationImpl continuationImpl) {
        ShortcutToSummaryInteractor$openExpectedDestination$1 shortcutToSummaryInteractor$openExpectedDestination$1;
        int i;
        try {
            if (continuationImpl instanceof ShortcutToSummaryInteractor$openExpectedDestination$1) {
                shortcutToSummaryInteractor$openExpectedDestination$1 = (ShortcutToSummaryInteractor$openExpectedDestination$1) continuationImpl;
                int i2 = shortcutToSummaryInteractor$openExpectedDestination$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    shortcutToSummaryInteractor$openExpectedDestination$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = shortcutToSummaryInteractor$openExpectedDestination$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = shortcutToSummaryInteractor$openExpectedDestination$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        this.i.a(gkv0.b);
                        this.j.a(ClarifyAddressBeforeOrderOrigin.EXPECTED_DESTINATION_SHORTCUT);
                        ru.yandex.taxi.shortcuts.interactors.a aVar = this.a;
                        zzs zzsVar = action$TaxiExpectedDestination.a;
                        String str = action$TaxiExpectedDestination.b;
                        if (str.length() == 0) {
                            str = action$TaxiExpectedDestination.c;
                        }
                        shortcutToSummaryInteractor$openExpectedDestination$1.L$0 = null;
                        shortcutToSummaryInteractor$openExpectedDestination$1.L$1 = null;
                        shortcutToSummaryInteractor$openExpectedDestination$1.label = 1;
                        obj = aVar.a(zzsVar, str, o820Var, false, shortcutToSummaryInteractor$openExpectedDestination$1);
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
                    a((sxg) obj);
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            a((sxg) obj);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new Result.Failure(e2);
        }
        shortcutToSummaryInteractor$openExpectedDestination$1 = new ShortcutToSummaryInteractor$openExpectedDestination$1(this, continuationImpl);
        Object obj2 = shortcutToSummaryInteractor$openExpectedDestination$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shortcutToSummaryInteractor$openExpectedDestination$1.label;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(3:10|11|12)(2:20|21))(5:22|23|24|28|(1:30)(1:31))|13|(1:15)|16|17|18))|39|6|7|(0)(0)|13|(0)|16|17|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bf, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b2, code lost:
    
        defpackage.jst.e.r("Failed to open summary with address finalizing", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ab A[Catch: all -> 0x00b1, CancellationException -> 0x00bd, TryCatch #2 {CancellationException -> 0x00bd, all -> 0x00b1, blocks: (B:11:0x003a, B:13:0x0096, B:15:0x00ab, B:16:0x00ad, B:23:0x0049, B:24:0x0065, B:25:0x0068, B:26:0x006d, B:28:0x0076), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(SummaryRedirectActionModel.a aVar, yyr0 yyr0Var, SummaryRedirectActionModel summaryRedirectActionModel, m1s0 m1s0Var, za31 za31Var, ContinuationImpl continuationImpl) {
        ShortcutToSummaryInteractor$openSummary$1 shortcutToSummaryInteractor$openSummary$1;
        int i;
        String str;
        za31 za31Var2;
        SummaryRedirectActionModel summaryRedirectActionModel2;
        m1s0 m1s0Var2;
        if (continuationImpl instanceof ShortcutToSummaryInteractor$openSummary$1) {
            shortcutToSummaryInteractor$openSummary$1 = (ShortcutToSummaryInteractor$openSummary$1) continuationImpl;
            int i2 = shortcutToSummaryInteractor$openSummary$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                shortcutToSummaryInteractor$openSummary$1.label = i2 - Integer.MIN_VALUE;
                Object obj = shortcutToSummaryInteractor$openSummary$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shortcutToSummaryInteractor$openSummary$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.shortcuts.interactors.a aVar2 = this.a;
                    zzs zzsVar = aVar.a;
                    String a = aVar.a();
                    String e = yyr0Var.e();
                    String f = yyr0Var.f();
                    switch (xxr0.a[yyr0Var.getSource().ordinal()]) {
                        case 1:
                            str = "Header";
                            break;
                        case 2:
                            str = "Suggest";
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            str = "UNKNOWN";
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    o820 o820Var = new o820(f, e, str, "shortcut");
                    shortcutToSummaryInteractor$openSummary$1.L$0 = aVar;
                    shortcutToSummaryInteractor$openSummary$1.L$1 = null;
                    shortcutToSummaryInteractor$openSummary$1.L$2 = summaryRedirectActionModel;
                    shortcutToSummaryInteractor$openSummary$1.L$3 = m1s0Var;
                    za31Var2 = za31Var;
                    shortcutToSummaryInteractor$openSummary$1.L$4 = za31Var2;
                    shortcutToSummaryInteractor$openSummary$1.label = 1;
                    obj = aVar2.a(zzsVar, a, o820Var, false, shortcutToSummaryInteractor$openSummary$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    summaryRedirectActionModel2 = summaryRedirectActionModel;
                    m1s0Var2 = m1s0Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    za31 za31Var3 = (za31) shortcutToSummaryInteractor$openSummary$1.L$4;
                    m1s0Var2 = (m1s0) shortcutToSummaryInteractor$openSummary$1.L$3;
                    summaryRedirectActionModel2 = (SummaryRedirectActionModel) shortcutToSummaryInteractor$openSummary$1.L$2;
                    SummaryRedirectActionModel.a aVar3 = (SummaryRedirectActionModel.a) shortcutToSummaryInteractor$openSummary$1.L$0;
                    kotlin.b.b(obj);
                    za31Var2 = za31Var3;
                    aVar = aVar3;
                }
                this.c.l(this.g.a(((sxg) obj).a, aVar.d));
                this.e.a(summaryRedirectActionModel2, za31Var2 != null ? za31Var2.a : null, m1s0Var2);
                return zy11.a;
            }
        }
        shortcutToSummaryInteractor$openSummary$1 = new ShortcutToSummaryInteractor$openSummary$1(this, continuationImpl);
        Object obj2 = shortcutToSummaryInteractor$openSummary$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shortcutToSummaryInteractor$openSummary$1.label;
        if (i != 0) {
        }
        this.c.l(this.g.a(((sxg) obj2).a, aVar.d));
        this.e.a(summaryRedirectActionModel2, za31Var2 != null ? za31Var2.a : null, m1s0Var2);
        return zy11.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|8|(1:(2:11|12)(2:20|21))(6:22|23|24|28|29|(1:31))|13|(1:15)|16|17|18))|39|6|7|8|(0)(0)|13|(0)|16|17|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        defpackage.jst.e.r("Failed to open summary with full routestats", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095 A[Catch: all -> 0x009b, CancellationException -> 0x00a7, TryCatch #2 {CancellationException -> 0x00a7, all -> 0x009b, blocks: (B:12:0x0038, B:13:0x008f, B:15:0x0095, B:16:0x0097, B:23:0x0045, B:24:0x0062, B:25:0x0065, B:26:0x006a, B:29:0x0075), top: B:8:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(SummaryRedirectActionModel.a aVar, yyr0 yyr0Var, SummaryRedirectActionModel summaryRedirectActionModel, m1s0 m1s0Var, ContinuationImpl continuationImpl) {
        ShortcutToSummaryInteractor$waitFullRouteStats$1 shortcutToSummaryInteractor$waitFullRouteStats$1;
        int i;
        String str;
        if (continuationImpl instanceof ShortcutToSummaryInteractor$waitFullRouteStats$1) {
            shortcutToSummaryInteractor$waitFullRouteStats$1 = (ShortcutToSummaryInteractor$waitFullRouteStats$1) continuationImpl;
            int i2 = shortcutToSummaryInteractor$waitFullRouteStats$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                shortcutToSummaryInteractor$waitFullRouteStats$1.label = i2 - Integer.MIN_VALUE;
                ShortcutToSummaryInteractor$waitFullRouteStats$1 shortcutToSummaryInteractor$waitFullRouteStats$12 = shortcutToSummaryInteractor$waitFullRouteStats$1;
                Object obj = shortcutToSummaryInteractor$waitFullRouteStats$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shortcutToSummaryInteractor$waitFullRouteStats$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.taxi.tariffs.internal.interactor.a aVar2 = this.k;
                    zzs zzsVar = aVar.a;
                    String a = aVar.a();
                    String e = yyr0Var.e();
                    String f = yyr0Var.f();
                    switch (xxr0.a[yyr0Var.getSource().ordinal()]) {
                        case 1:
                            str = "Header";
                            break;
                        case 2:
                            str = "Suggest";
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            str = "UNKNOWN";
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    o820 o820Var = new o820(f, e, str, "shortcut");
                    String str2 = summaryRedirectActionModel.b;
                    shortcutToSummaryInteractor$waitFullRouteStats$12.L$0 = null;
                    shortcutToSummaryInteractor$waitFullRouteStats$12.L$1 = null;
                    shortcutToSummaryInteractor$waitFullRouteStats$12.L$2 = summaryRedirectActionModel;
                    shortcutToSummaryInteractor$waitFullRouteStats$12.L$3 = m1s0Var;
                    shortcutToSummaryInteractor$waitFullRouteStats$12.label = 1;
                    obj = aVar2.a(zzsVar, a, o820Var, str2, shortcutToSummaryInteractor$waitFullRouteStats$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m1s0Var = (m1s0) shortcutToSummaryInteractor$waitFullRouteStats$12.L$3;
                    summaryRedirectActionModel = (SummaryRedirectActionModel) shortcutToSummaryInteractor$waitFullRouteStats$12.L$2;
                    kotlin.b.b(obj);
                }
                za31 za31Var = (za31) obj;
                this.e.a(summaryRedirectActionModel, za31Var != null ? za31Var.a : null, m1s0Var);
                return zy11.a;
            }
        }
        shortcutToSummaryInteractor$waitFullRouteStats$1 = new ShortcutToSummaryInteractor$waitFullRouteStats$1(this, continuationImpl);
        ShortcutToSummaryInteractor$waitFullRouteStats$1 shortcutToSummaryInteractor$waitFullRouteStats$122 = shortcutToSummaryInteractor$waitFullRouteStats$1;
        Object obj2 = shortcutToSummaryInteractor$waitFullRouteStats$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shortcutToSummaryInteractor$waitFullRouteStats$122.label;
        if (i != 0) {
        }
        za31 za31Var2 = (za31) obj2;
        this.e.a(summaryRedirectActionModel, za31Var2 != null ? za31Var2.a : null, m1s0Var);
        return zy11.a;
    }
}
