package com.ybsdk.feature.dashboard.internal.domain.interactors;

import com.ybsdk.common.InternalSdkState;
import com.ybsdk.common.entities.ApplicationTypeEntity;
import com.ybsdk.common.entities.SessionApplicationEntity;
import com.ybsdk.feature.card.api.CardApplicationsRepository$CardIssueResult;
import com.ybsdk.feature.card.api.entities.YbCardStatusEntity;
import com.ybsdk.feature.dashboard.api.model.ProductId;
import com.ybsdk.feature.dashboard.internal.domain.entities.DashboardCardInfoEntity;
import com.ybsdk.rconfig.CardPromo;
import defpackage.bvf0;
import defpackage.hz91;
import defpackage.if8;
import defpackage.jl40;
import defpackage.job1;
import defpackage.kq51;
import defpackage.lq51;
import defpackage.mq51;
import defpackage.nbv;
import defpackage.nq51;
import defpackage.ny61;
import defpackage.nyg0;
import defpackage.oq51;
import defpackage.ov3;
import defpackage.pq51;
import defpackage.qxy0;
import defpackage.rbv;
import defpackage.suf;
import defpackage.thg;
import defpackage.ua8;
import defpackage.uhg;
import defpackage.w511;
import defpackage.whg;
import defpackage.wm8;
import defpackage.x4c;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a {
    public static final nbv f = new nbv(nyg0.ybsdk_ic_card_mir_disabled, null);
    public final com.ybsdk.feature.dashboard.internal.data.a a;
    public final ov3 b;
    public final wm8 c;
    public final ua8 d;
    public final r0 e = bvf0.c(new thg(new oq51(f), (String) null, 6));

    public a(com.ybsdk.feature.dashboard.internal.data.a aVar, ov3 ov3Var, wm8 wm8Var, ua8 ua8Var) {
        this.a = aVar;
        this.b = ov3Var;
        this.c = wm8Var;
        this.d = ua8Var;
    }

    public static rbv a(DashboardCardInfoEntity dashboardCardInfoEntity) {
        rbv f2 = job1.f(qxy0.c(dashboardCardInfoEntity.d, null), new suf(6));
        if (f2 != null) {
            return f2;
        }
        x4c.g("Error parsing image for DashboardCardEntity", null, null, null, 14);
        return f;
    }

    public static /* synthetic */ Object g(a aVar, DashboardCardInfoEntity dashboardCardInfoEntity, String str, boolean z, ProductId productId, ContinuationImpl continuationImpl, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            productId = ProductId.WALLET;
        }
        return aVar.f(dashboardCardInfoEntity, str, z2, productId, continuationImpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0096, code lost:
    
        if (r8 == r0) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ProductId productId, String str, boolean z, ContinuationImpl continuationImpl) {
        DashboardCardInteractor$refreshCardState$1 dashboardCardInteractor$refreshCardState$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object a;
        boolean z2;
        ProductId productId2;
        if (continuationImpl instanceof DashboardCardInteractor$refreshCardState$1) {
            dashboardCardInteractor$refreshCardState$1 = (DashboardCardInteractor$refreshCardState$1) continuationImpl;
            int i2 = dashboardCardInteractor$refreshCardState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dashboardCardInteractor$refreshCardState$1.label = i2 - Integer.MIN_VALUE;
                DashboardCardInteractor$refreshCardState$1 dashboardCardInteractor$refreshCardState$12 = dashboardCardInteractor$refreshCardState$1;
                Object obj = dashboardCardInteractor$refreshCardState$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dashboardCardInteractor$refreshCardState$12.label;
                zy11 zy11Var = zy11.a;
                String str2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r0 r0Var = this.e;
                    Object value = r0Var.getValue();
                    thg thgVar = value instanceof thg ? (thg) value : null;
                    if ((thgVar != null ? thgVar.a : null) instanceof oq51) {
                        thg thgVar2 = new thg(new oq51(f), str2, 6);
                        dashboardCardInteractor$refreshCardState$12.L$0 = productId;
                        dashboardCardInteractor$refreshCardState$12.L$1 = str;
                        dashboardCardInteractor$refreshCardState$12.Z$0 = z;
                        dashboardCardInteractor$refreshCardState$12.label = 1;
                        r0Var.emit(thgVar2, dashboardCardInteractor$refreshCardState$12);
                    }
                } else if (i == 1) {
                    z = dashboardCardInteractor$refreshCardState$12.Z$0;
                    str = (String) dashboardCardInteractor$refreshCardState$12.L$1;
                    productId = (ProductId) dashboardCardInteractor$refreshCardState$12.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            kotlin.b.b(obj);
                            return zy11Var;
                        }
                        if (i == 4) {
                            kotlin.b.b(obj);
                            return zy11Var;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z3 = dashboardCardInteractor$refreshCardState$12.Z$0;
                    str = (String) dashboardCardInteractor$refreshCardState$12.L$1;
                    productId2 = (ProductId) dashboardCardInteractor$refreshCardState$12.L$0;
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                    z2 = z3;
                    if (Result.a(a) != null) {
                        dashboardCardInteractor$refreshCardState$12.L$0 = null;
                        dashboardCardInteractor$refreshCardState$12.L$1 = null;
                        dashboardCardInteractor$refreshCardState$12.label = 3;
                        return g(this, (DashboardCardInfoEntity) a, str, z2, null, dashboardCardInteractor$refreshCardState$12, 8) == coroutineSingletons ? coroutineSingletons : zy11Var;
                    }
                    dashboardCardInteractor$refreshCardState$12.L$0 = null;
                    dashboardCardInteractor$refreshCardState$12.L$1 = null;
                    dashboardCardInteractor$refreshCardState$12.label = 4;
                    c(productId2, dashboardCardInteractor$refreshCardState$12);
                    if (zy11Var == coroutineSingletons) {
                    }
                }
                dashboardCardInteractor$refreshCardState$12.L$0 = productId;
                dashboardCardInteractor$refreshCardState$12.L$1 = str;
                dashboardCardInteractor$refreshCardState$12.Z$0 = z;
                dashboardCardInteractor$refreshCardState$12.label = 2;
                a = this.a.a(productId, str, dashboardCardInteractor$refreshCardState$12);
                if (a != coroutineSingletons) {
                    z2 = z;
                    productId2 = productId;
                    if (Result.a(a) != null) {
                    }
                }
            }
        }
        dashboardCardInteractor$refreshCardState$1 = new DashboardCardInteractor$refreshCardState$1(this, continuationImpl);
        DashboardCardInteractor$refreshCardState$1 dashboardCardInteractor$refreshCardState$122 = dashboardCardInteractor$refreshCardState$1;
        Object obj2 = dashboardCardInteractor$refreshCardState$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dashboardCardInteractor$refreshCardState$122.label;
        zy11 zy11Var2 = zy11.a;
        String str22 = null;
        if (i != 0) {
        }
        dashboardCardInteractor$refreshCardState$122.L$0 = productId;
        dashboardCardInteractor$refreshCardState$122.L$1 = str;
        dashboardCardInteractor$refreshCardState$122.Z$0 = z;
        dashboardCardInteractor$refreshCardState$122.label = 2;
        a = this.a.a(productId, str, dashboardCardInteractor$refreshCardState$122);
        if (a != coroutineSingletons) {
        }
    }

    public final zy11 c(ProductId productId, ContinuationImpl continuationImpl) {
        int i = whg.a[productId.ordinal()];
        String str = null;
        zy11 zy11Var = zy11.a;
        r0 r0Var = this.e;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                r0Var.emit(new thg(new lq51(f), str, 6), continuationImpl);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                return zy11Var;
            case 5:
            case 6:
                r0Var.emit(uhg.a, continuationImpl);
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return zy11Var;
            default:
                w511.b();
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0166 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ProductId productId, String str, boolean z, String str2, rbv rbvVar, ContinuationImpl continuationImpl) {
        DashboardCardInteractor$startApplicationPoling$1 dashboardCardInteractor$startApplicationPoling$1;
        int i;
        ProductId productId2;
        String str3;
        rbv rbvVar2;
        boolean z2;
        Object obj;
        String str4;
        List<SessionApplicationEntity> applications;
        Object obj2;
        String str5;
        Object obj3;
        ProductId productId3;
        String str6;
        String str7;
        ProductId productId4;
        int i2;
        if (continuationImpl instanceof DashboardCardInteractor$startApplicationPoling$1) {
            dashboardCardInteractor$startApplicationPoling$1 = (DashboardCardInteractor$startApplicationPoling$1) continuationImpl;
            int i3 = dashboardCardInteractor$startApplicationPoling$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dashboardCardInteractor$startApplicationPoling$1.label = i3 - Integer.MIN_VALUE;
                Object obj4 = dashboardCardInteractor$startApplicationPoling$1.result;
                Object obj5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dashboardCardInteractor$startApplicationPoling$1.label;
                int i4 = 4;
                nbv nbvVar = f;
                r0 r0Var = this.e;
                ua8 ua8Var = this.d;
                Object obj6 = zy11.a;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj4);
                        productId2 = productId;
                        dashboardCardInteractor$startApplicationPoling$1.L$0 = productId2;
                        dashboardCardInteractor$startApplicationPoling$1.L$1 = str;
                        str3 = str2;
                        dashboardCardInteractor$startApplicationPoling$1.L$2 = str3;
                        rbvVar2 = rbvVar;
                        dashboardCardInteractor$startApplicationPoling$1.L$3 = rbvVar2;
                        z2 = z;
                        dashboardCardInteractor$startApplicationPoling$1.Z$0 = z2;
                        dashboardCardInteractor$startApplicationPoling$1.label = 1;
                        InternalSdkState b = ((com.ybsdk.common.repositiories.card.b) ua8Var).d.b();
                        if (b != null && (applications = b.getApplications()) != null) {
                            Iterator<T> it = applications.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (((SessionApplicationEntity) obj2).getType() == ApplicationTypeEntity.DIGITAL_CARD_ISSUE) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            SessionApplicationEntity sessionApplicationEntity = (SessionApplicationEntity) obj2;
                            if (sessionApplicationEntity != null) {
                                obj = sessionApplicationEntity.getApplicationId();
                                if (obj != obj5) {
                                    str4 = str;
                                    str5 = (String) obj;
                                    if (str5 != null) {
                                        thg thgVar = new thg(new kq51(rbvVar2, z2), str3, i4);
                                        dashboardCardInteractor$startApplicationPoling$1.L$0 = null;
                                        dashboardCardInteractor$startApplicationPoling$1.L$1 = null;
                                        dashboardCardInteractor$startApplicationPoling$1.L$2 = null;
                                        dashboardCardInteractor$startApplicationPoling$1.L$3 = null;
                                        dashboardCardInteractor$startApplicationPoling$1.label = 2;
                                        r0Var.emit(thgVar, dashboardCardInteractor$startApplicationPoling$1);
                                        if (obj6 != obj5) {
                                            return obj6;
                                        }
                                    } else {
                                        thg thgVar2 = new thg(new oq51(nbvVar), str3, i4);
                                        dashboardCardInteractor$startApplicationPoling$1.L$0 = productId2;
                                        dashboardCardInteractor$startApplicationPoling$1.L$1 = str4;
                                        dashboardCardInteractor$startApplicationPoling$1.L$2 = str5;
                                        obj3 = null;
                                        dashboardCardInteractor$startApplicationPoling$1.L$3 = null;
                                        dashboardCardInteractor$startApplicationPoling$1.label = 3;
                                        r0Var.emit(thgVar2, dashboardCardInteractor$startApplicationPoling$1);
                                        if (obj6 != obj5) {
                                            productId3 = productId2;
                                            str6 = str4;
                                            dashboardCardInteractor$startApplicationPoling$1.L$0 = productId3;
                                            dashboardCardInteractor$startApplicationPoling$1.L$1 = str6;
                                            dashboardCardInteractor$startApplicationPoling$1.L$2 = obj3;
                                            dashboardCardInteractor$startApplicationPoling$1.label = 4;
                                            obj4 = ((com.ybsdk.common.repositiories.card.b) ua8Var).b(str5, dashboardCardInteractor$startApplicationPoling$1);
                                            if (obj4 != obj5) {
                                                str7 = str6;
                                                productId4 = productId3;
                                                i2 = whg.b[((CardApplicationsRepository$CardIssueResult) obj4).ordinal()];
                                                if (i2 != 1) {
                                                    dashboardCardInteractor$startApplicationPoling$1.L$0 = null;
                                                    dashboardCardInteractor$startApplicationPoling$1.L$1 = null;
                                                    dashboardCardInteractor$startApplicationPoling$1.label = 5;
                                                    if (b(productId4, str7, true, dashboardCardInteractor$startApplicationPoling$1) == obj5) {
                                                    }
                                                } else {
                                                    if (i2 != 2) {
                                                        w511.b();
                                                        return null;
                                                    }
                                                    thg thgVar3 = new thg(new nq51(nbvVar), (String) null, 6);
                                                    dashboardCardInteractor$startApplicationPoling$1.L$0 = null;
                                                    dashboardCardInteractor$startApplicationPoling$1.L$1 = null;
                                                    dashboardCardInteractor$startApplicationPoling$1.label = 6;
                                                    r0Var.emit(thgVar3, dashboardCardInteractor$startApplicationPoling$1);
                                                    if (obj6 == obj5) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return obj5;
                            }
                        }
                        obj = null;
                        if (obj != obj5) {
                        }
                        return obj5;
                    case 1:
                        boolean z3 = dashboardCardInteractor$startApplicationPoling$1.Z$0;
                        rbvVar2 = (rbv) dashboardCardInteractor$startApplicationPoling$1.L$3;
                        String str8 = (String) dashboardCardInteractor$startApplicationPoling$1.L$2;
                        str4 = (String) dashboardCardInteractor$startApplicationPoling$1.L$1;
                        ProductId productId5 = (ProductId) dashboardCardInteractor$startApplicationPoling$1.L$0;
                        kotlin.b.b(obj4);
                        obj = obj4;
                        productId2 = productId5;
                        str3 = str8;
                        z2 = z3;
                        str5 = (String) obj;
                        if (str5 != null) {
                        }
                        return obj5;
                    case 2:
                        kotlin.b.b(obj4);
                        return obj6;
                    case 3:
                        str5 = (String) dashboardCardInteractor$startApplicationPoling$1.L$2;
                        str6 = (String) dashboardCardInteractor$startApplicationPoling$1.L$1;
                        productId3 = (ProductId) dashboardCardInteractor$startApplicationPoling$1.L$0;
                        kotlin.b.b(obj4);
                        obj3 = null;
                        dashboardCardInteractor$startApplicationPoling$1.L$0 = productId3;
                        dashboardCardInteractor$startApplicationPoling$1.L$1 = str6;
                        dashboardCardInteractor$startApplicationPoling$1.L$2 = obj3;
                        dashboardCardInteractor$startApplicationPoling$1.label = 4;
                        obj4 = ((com.ybsdk.common.repositiories.card.b) ua8Var).b(str5, dashboardCardInteractor$startApplicationPoling$1);
                        if (obj4 != obj5) {
                        }
                        return obj5;
                    case 4:
                        str7 = (String) dashboardCardInteractor$startApplicationPoling$1.L$1;
                        productId4 = (ProductId) dashboardCardInteractor$startApplicationPoling$1.L$0;
                        kotlin.b.b(obj4);
                        i2 = whg.b[((CardApplicationsRepository$CardIssueResult) obj4).ordinal()];
                        if (i2 != 1) {
                        }
                        break;
                    case 5:
                        kotlin.b.b(obj4);
                        return obj6;
                    case 6:
                        kotlin.b.b(obj4);
                        return obj6;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        dashboardCardInteractor$startApplicationPoling$1 = new DashboardCardInteractor$startApplicationPoling$1(this, continuationImpl);
        Object obj42 = dashboardCardInteractor$startApplicationPoling$1.result;
        Object obj52 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dashboardCardInteractor$startApplicationPoling$1.label;
        int i42 = 4;
        nbv nbvVar2 = f;
        r0 r0Var2 = this.e;
        ua8 ua8Var2 = this.d;
        Object obj62 = zy11.a;
        switch (i) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r12 == r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ProductId productId, String str, ContinuationImpl continuationImpl) {
        DashboardCardInteractor$startCardPoling$1 dashboardCardInteractor$startCardPoling$1;
        int i;
        Object c;
        if (continuationImpl instanceof DashboardCardInteractor$startCardPoling$1) {
            dashboardCardInteractor$startCardPoling$1 = (DashboardCardInteractor$startCardPoling$1) continuationImpl;
            int i2 = dashboardCardInteractor$startCardPoling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dashboardCardInteractor$startCardPoling$1.label = i2 - Integer.MIN_VALUE;
                DashboardCardInteractor$startCardPoling$1 dashboardCardInteractor$startCardPoling$12 = dashboardCardInteractor$startCardPoling$1;
                Object obj = dashboardCardInteractor$startCardPoling$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dashboardCardInteractor$startCardPoling$12.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    dashboardCardInteractor$startCardPoling$12.L$0 = productId;
                    dashboardCardInteractor$startCardPoling$12.L$1 = str;
                    dashboardCardInteractor$startCardPoling$12.label = 1;
                    c = this.a.c(productId, str, dashboardCardInteractor$startCardPoling$12);
                } else {
                    if (i != 1) {
                        if (i == 2 || i == 3) {
                            kotlin.b.b(obj);
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) dashboardCardInteractor$startCardPoling$12.L$1;
                    productId = (ProductId) dashboardCardInteractor$startCardPoling$12.L$0;
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                if (Result.a(c) != null) {
                    dashboardCardInteractor$startCardPoling$12.L$0 = null;
                    dashboardCardInteractor$startCardPoling$12.L$1 = null;
                    dashboardCardInteractor$startCardPoling$12.label = 2;
                    return g(this, (DashboardCardInfoEntity) c, str, false, productId, dashboardCardInteractor$startCardPoling$12, 4) == coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                dashboardCardInteractor$startCardPoling$12.L$0 = null;
                dashboardCardInteractor$startCardPoling$12.L$1 = null;
                dashboardCardInteractor$startCardPoling$12.label = 3;
                c(productId, dashboardCardInteractor$startCardPoling$12);
                if (zy11Var == coroutineSingletons) {
                }
            }
        }
        dashboardCardInteractor$startCardPoling$1 = new DashboardCardInteractor$startCardPoling$1(this, continuationImpl);
        DashboardCardInteractor$startCardPoling$1 dashboardCardInteractor$startCardPoling$122 = dashboardCardInteractor$startCardPoling$1;
        Object obj2 = dashboardCardInteractor$startCardPoling$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dashboardCardInteractor$startCardPoling$122.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        if (Result.a(c) != null) {
        }
    }

    public final Object f(DashboardCardInfoEntity dashboardCardInfoEntity, String str, boolean z, ProductId productId, ContinuationImpl continuationImpl) {
        YbCardStatusEntity ybCardStatusEntity;
        YbCardStatusEntity ybCardStatusEntity2;
        r0 r0Var = this.e;
        zy11 zy11Var = zy11.a;
        if (dashboardCardInfoEntity == null) {
            r0Var.emit(uhg.a, continuationImpl);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return zy11Var;
        }
        String str2 = dashboardCardInfoEntity.c;
        String str3 = dashboardCardInfoEntity.e;
        if (str == null || str.length() == 0) {
            try {
                ybCardStatusEntity = jl40.l(str3, "CLOSED") ? YbCardStatusEntity.DELETED : YbCardStatusEntity.valueOf(str3);
            } catch (Exception unused) {
                ybCardStatusEntity = YbCardStatusEntity.UNKNOWN;
            }
            r0Var.emit(new thg(new mq51(ybCardStatusEntity, z, false, a(dashboardCardInfoEntity)), str2, 4), continuationImpl);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            return zy11Var;
        }
        boolean z2 = productId == ProductId.WALLET || productId == ProductId.CREDIT_LIMIT;
        boolean z3 = dashboardCardInfoEntity.b >= 1;
        boolean z4 = dashboardCardInfoEntity.f;
        ov3 ov3Var = this.b;
        int i = ov3Var.a.a.getInt("card_plastic_suggest_interactions_count_".concat(str), 0);
        if8 if8Var = (if8) this.c;
        com.ybsdk.rconfig.b bVar = if8Var.a;
        boolean z5 = i < ((CardPromo) bVar.d(bVar.i.i).getData()).getPlasticPromoInteractionCount() && z3 && !z4;
        int i2 = dashboardCardInfoEntity.a;
        if (i2 == 0) {
            Object d = d(productId, str, z3 && z2, dashboardCardInfoEntity.c, a(dashboardCardInfoEntity), continuationImpl);
            return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : zy11Var;
        }
        boolean z6 = true;
        if (i2 <= 1) {
            if (!z3) {
                int i3 = ov3Var.a.a.getInt("card_interactions_count_".concat(str), 0);
                try {
                    ybCardStatusEntity2 = jl40.l(str3, "CLOSED") ? YbCardStatusEntity.DELETED : YbCardStatusEntity.valueOf(str3);
                } catch (Exception unused2) {
                    ybCardStatusEntity2 = YbCardStatusEntity.UNKNOWN;
                }
                if (ybCardStatusEntity2 == YbCardStatusEntity.REISSUE) {
                    r0Var.emit(new thg((hz91) new oq51(a(dashboardCardInfoEntity)), str2, true), continuationImpl);
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    return zy11Var;
                }
                com.ybsdk.rconfig.b bVar2 = if8Var.a;
                r0Var.emit(new thg(new mq51(ybCardStatusEntity2, z, (i3 < ((CardPromo) bVar2.d(bVar2.i.i).getData()).getInteractionsValue()) && z2, a(dashboardCardInfoEntity)), str2, 4), continuationImpl);
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return zy11Var;
            }
            z6 = true;
        }
        if (!z5 || !z2) {
            z6 = false;
        }
        r0Var.emit(new thg(new pq51(z, z6, a(dashboardCardInfoEntity)), str2, 4), continuationImpl);
        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
        return zy11Var;
    }
}
