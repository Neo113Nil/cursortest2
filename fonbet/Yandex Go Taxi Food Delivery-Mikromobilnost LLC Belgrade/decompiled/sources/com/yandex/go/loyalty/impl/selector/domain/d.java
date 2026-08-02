package com.yandex.go.loyalty.impl.selector.domain;

import com.yandex.go.loyalty.impl.analytics.LoyaltyProgramAnalytics$LoyaltyAction;
import com.yandex.go.loyalty.impl.common.domain.h;
import com.yandex.go.loyalty.impl.selector.data.model.GeoState;
import com.yandex.go.loyalty.impl.selector.data.model.LoyaltyStateParam;
import com.yandex.go.loyalty.impl.selector.domain.model.LoyaltyProgramState;
import defpackage.am2;
import defpackage.axz;
import defpackage.bxz;
import defpackage.cda0;
import defpackage.cxz;
import defpackage.dvz;
import defpackage.eiq0;
import defpackage.evu0;
import defpackage.evz;
import defpackage.fia1;
import defpackage.fvz;
import defpackage.g8e;
import defpackage.gvz;
import defpackage.gwz;
import defpackage.h1t;
import defpackage.h3y;
import defpackage.hwz;
import defpackage.iwz;
import defpackage.jl40;
import defpackage.jrd;
import defpackage.jst;
import defpackage.kyh0;
import defpackage.lvz;
import defpackage.lxz;
import defpackage.m950;
import defpackage.mqu;
import defpackage.mxz;
import defpackage.nxz;
import defpackage.ny61;
import defpackage.pho;
import defpackage.qu;
import defpackage.qyz;
import defpackage.rwz;
import defpackage.sls;
import defpackage.t7j;
import defpackage.twz;
import defpackage.u8w;
import defpackage.w511;
import defpackage.x1f0;
import defpackage.x4e;
import defpackage.xvf0;
import defpackage.xwz;
import defpackage.ywz;
import defpackage.zwz;
import defpackage.zy11;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.network.api.models.GoApiHttpException;
import ru.yandex.taxi.notifications.local.LocalNotificationItemComponent;

/* loaded from: classes12.dex */
public final class d {
    public final nxz a;
    public final u8w b;
    public final cda0 c;
    public final h d;
    public final qyz e;
    public final com.yandex.go.loyalty.impl.common.domain.a f;
    public final a g;
    public final am2 h;
    public final iwz i;
    public final twz j;
    public final h3y k;
    public final h1t l;

    public d(nxz nxzVar, u8w u8wVar, cda0 cda0Var, h hVar, qyz qyzVar, com.yandex.go.loyalty.impl.common.domain.a aVar, a aVar2, am2 am2Var, iwz iwzVar, twz twzVar, h3y h3yVar, h1t h1tVar) {
        this.a = nxzVar;
        this.b = u8wVar;
        this.c = cda0Var;
        this.d = hVar;
        this.e = qyzVar;
        this.f = aVar;
        this.g = aVar2;
        this.h = am2Var;
        this.i = iwzVar;
        this.j = twzVar;
        this.k = h3yVar;
        this.l = h1tVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        if (d(r10, r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if (r11 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, sls slsVar, ContinuationImpl continuationImpl) {
        LoyaltySelectorUiActionInteractor$acceptProgramLoyalty$1 loyaltySelectorUiActionInteractor$acceptProgramLoyalty$1;
        int i;
        Object a;
        Object obj;
        if (continuationImpl instanceof LoyaltySelectorUiActionInteractor$acceptProgramLoyalty$1) {
            loyaltySelectorUiActionInteractor$acceptProgramLoyalty$1 = (LoyaltySelectorUiActionInteractor$acceptProgramLoyalty$1) continuationImpl;
            int i2 = loyaltySelectorUiActionInteractor$acceptProgramLoyalty$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loyaltySelectorUiActionInteractor$acceptProgramLoyalty$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = loyaltySelectorUiActionInteractor$acceptProgramLoyalty$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = loyaltySelectorUiActionInteractor$acceptProgramLoyalty$1.label;
                iwz iwzVar = this.i;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    iwzVar.a.l(LoyaltySelectorLoadingState.ACCEPT_PROGRAM_LOADING);
                    loyaltySelectorUiActionInteractor$acceptProgramLoyalty$1.L$0 = str;
                    loyaltySelectorUiActionInteractor$acceptProgramLoyalty$1.L$1 = slsVar;
                    loyaltySelectorUiActionInteractor$acceptProgramLoyalty$1.label = 1;
                    a = this.g.a(str, loyaltySelectorUiActionInteractor$acceptProgramLoyalty$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = loyaltySelectorUiActionInteractor$acceptProgramLoyalty$1.L$2;
                        kotlin.b.b(obj2);
                        if (Result.a(obj) != null) {
                            rwz rwzVar = (rwz) this.k.get();
                            LocalNotificationItemComponent a2 = rwzVar.a("accept_program_loyalty_failure", rwzVar.a.getString(kyh0.loyalty_notification_error_loyalty_switched));
                            a2.startExpiresTimer(5000L);
                            rwzVar.b.e(a2);
                            iwzVar.a.l(LoyaltySelectorLoadingState.NONE);
                        }
                        return zy11.a;
                    }
                    slsVar = (sls) loyaltySelectorUiActionInteractor$acceptProgramLoyalty$1.L$1;
                    str = (String) loyaltySelectorUiActionInteractor$acceptProgramLoyalty$1.L$0;
                    kotlin.b.b(obj2);
                    a = ((Result) obj2).getValue();
                }
                sls slsVar2 = slsVar;
                String str2 = str;
                obj = a;
                if (!(obj instanceof Result.Failure)) {
                    loyaltySelectorUiActionInteractor$acceptProgramLoyalty$1.L$0 = null;
                    loyaltySelectorUiActionInteractor$acceptProgramLoyalty$1.L$1 = null;
                    loyaltySelectorUiActionInteractor$acceptProgramLoyalty$1.L$2 = obj;
                    loyaltySelectorUiActionInteractor$acceptProgramLoyalty$1.L$3 = null;
                    loyaltySelectorUiActionInteractor$acceptProgramLoyalty$1.label = 2;
                }
                if (Result.a(obj) != null) {
                }
                return zy11.a;
            }
        }
        loyaltySelectorUiActionInteractor$acceptProgramLoyalty$1 = new LoyaltySelectorUiActionInteractor$acceptProgramLoyalty$1(this, continuationImpl);
        Object obj22 = loyaltySelectorUiActionInteractor$acceptProgramLoyalty$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loyaltySelectorUiActionInteractor$acceptProgramLoyalty$1.label;
        iwz iwzVar2 = this.i;
        if (i != 0) {
        }
        sls slsVar22 = slsVar;
        String str22 = str;
        obj = a;
        if (!(obj instanceof Result.Failure)) {
        }
        if (Result.a(obj) != null) {
        }
        return zy11.a;
    }

    public final String b(String str) {
        Object obj;
        if (str == null) {
            return "";
        }
        lxz a = this.a.a();
        String str2 = null;
        if (a != null) {
            Iterator it = a.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((mxz) obj).a, str)) {
                    break;
                }
            }
            mxz mxzVar = (mxz) obj;
            if (mxzVar != null) {
                str2 = mxzVar.b;
            }
        }
        return str2 == null ? "" : str2;
    }

    public final LoyaltyProgramState c(String str) {
        Object obj;
        lxz a = this.a.a();
        if (a != null) {
            Iterator it = a.a.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((dvz) obj).a, str)) {
                    break;
                }
            }
            dvz dvzVar = (dvz) obj;
            if (dvzVar != null) {
                return dvzVar.d;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x005f, code lost:
    
        if (r11 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, sls slsVar, ContinuationImpl continuationImpl) {
        LoyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1 loyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object b;
        String str2;
        sls slsVar2;
        boolean z;
        Object obj;
        if (continuationImpl instanceof LoyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1) {
            loyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1 = (LoyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1) continuationImpl;
            int i2 = loyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = loyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = loyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1.label;
                Object obj3 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    loyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1.L$0 = str;
                    loyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1.L$1 = slsVar;
                    loyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1.label = 1;
                    obj2 = this.d.a(loyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        slsVar2 = (sls) loyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1.L$1;
                        str2 = (String) loyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1.L$0;
                        kotlin.b.b(obj2);
                        b = ((Result) obj2).getValue();
                        z = b instanceof Result.Failure;
                        iwz iwzVar = this.i;
                        if (!z) {
                            lxz lxzVar = (lxz) b;
                            slsVar2.invoke();
                            iwzVar.a.l(LoyaltySelectorLoadingState.NONE);
                            am2 am2Var = this.h;
                            x1f0 x1f0Var = (x1f0) am2Var.b;
                            Iterator it = lxzVar.a.b.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                if (jl40.l(((dvz) obj).a, str2)) {
                                    break;
                                }
                            }
                            dvz dvzVar = (dvz) obj;
                            Iterator it2 = lxzVar.c.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                Object next = it2.next();
                                if (jl40.l(((mxz) next).a, str2)) {
                                    obj3 = next;
                                    break;
                                }
                            }
                            mxz mxzVar = (mxz) obj3;
                            if (dvzVar == null || mxzVar == null) {
                                jst.e.c("Couldn't find selected loyalty program with name " + str2);
                            } else {
                                ((lvz) am2Var.a).getClass();
                                evz a = lvz.a(dvzVar, mxzVar);
                                if (a != null) {
                                    evz evzVar = (evz) x1f0Var.b.a.getValue();
                                    x1f0Var.a(a);
                                    Iterator it3 = ((Iterable) ((xvf0) am2Var.c).get()).iterator();
                                    while (it3.hasNext()) {
                                        ((jrd) it3.next()).a(evzVar, a);
                                    }
                                }
                            }
                        }
                        if (Result.a(b) != null) {
                            rwz rwzVar = (rwz) this.k.get();
                            LocalNotificationItemComponent a2 = rwzVar.a("accept_program_loyalty_failure", rwzVar.a.getString(kyh0.loyalty_notification_error_loyalty_switched));
                            a2.startExpiresTimer(5000L);
                            rwzVar.b.e(a2);
                            iwzVar.a.l(LoyaltySelectorLoadingState.NONE);
                        }
                        return zy11.a;
                    }
                    slsVar = (sls) loyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1.L$1;
                    str = (String) loyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1.L$0;
                    kotlin.b.b(obj2);
                }
                LoyaltyStateParam loyaltyStateParam = new LoyaltyStateParam((GeoState) obj2);
                loyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1.L$0 = str;
                loyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1.L$1 = slsVar;
                loyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1.L$2 = null;
                loyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1.label = 2;
                b = this.f.b(loyaltyStateParam, loyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1);
                if (b != coroutineSingletons) {
                    sls slsVar3 = slsVar;
                    str2 = str;
                    slsVar2 = slsVar3;
                    z = b instanceof Result.Failure;
                    iwz iwzVar2 = this.i;
                    if (!z) {
                    }
                    if (Result.a(b) != null) {
                    }
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        loyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1 = new LoyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1(this, continuationImpl);
        Object obj22 = loyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1.label;
        Object obj32 = null;
        if (i != 0) {
        }
        LoyaltyStateParam loyaltyStateParam2 = new LoyaltyStateParam((GeoState) obj22);
        loyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1.L$0 = str;
        loyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1.L$1 = slsVar;
        loyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1.L$2 = null;
        loyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1.label = 2;
        b = this.f.b(loyaltyStateParam2, loyaltySelectorUiActionInteractor$handleAcceptProgramLoyaltySuccess$1);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x01a1, code lost:
    
        if (r2 == r7) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(bxz bxzVar, String str, String str2, gwz gwzVar, ContinuationImpl continuationImpl) {
        LoyaltySelectorUiActionInteractor$handleAction$1 loyaltySelectorUiActionInteractor$handleAction$1;
        int i;
        String str3;
        gwz gwzVar2;
        String str4;
        dvz c;
        Object obj;
        int i2;
        u8w u8wVar = this.b;
        pho phoVar = u8wVar.a;
        if (continuationImpl instanceof LoyaltySelectorUiActionInteractor$handleAction$1) {
            loyaltySelectorUiActionInteractor$handleAction$1 = (LoyaltySelectorUiActionInteractor$handleAction$1) continuationImpl;
            int i3 = loyaltySelectorUiActionInteractor$handleAction$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                loyaltySelectorUiActionInteractor$handleAction$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = loyaltySelectorUiActionInteractor$handleAction$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = loyaltySelectorUiActionInteractor$handleAction$1.label;
                int i4 = 9;
                Object obj4 = zy11.a;
                Object obj5 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (bxzVar instanceof ywz) {
                        String str5 = ((ywz) bxzVar).a;
                        u8wVar.b(str5, LoyaltyProgramAnalytics$LoyaltyAction.SignIn, b(str5));
                        loyaltySelectorUiActionInteractor$handleAction$1.L$0 = null;
                        loyaltySelectorUiActionInteractor$handleAction$1.L$1 = null;
                        loyaltySelectorUiActionInteractor$handleAction$1.L$2 = null;
                        loyaltySelectorUiActionInteractor$handleAction$1.L$3 = null;
                        loyaltySelectorUiActionInteractor$handleAction$1.label = 1;
                        Object f = f(str5, gwzVar, loyaltySelectorUiActionInteractor$handleAction$1);
                        if (f != obj3) {
                            return f;
                        }
                    } else {
                        if (bxzVar instanceof zwz) {
                            String str6 = ((zwz) bxzVar).a;
                            u8wVar.b(str6, LoyaltyProgramAnalytics$LoyaltyAction.Select, b(str6));
                            r0 r0Var = this.j.a;
                            eiq0 eiq0Var = new eiq0(str6);
                            r0Var.getClass();
                            r0Var.m(null, eiq0Var);
                            return obj4;
                        }
                        if (bxzVar instanceof xwz) {
                            String str7 = ((xwz) bxzVar).a;
                            x4e.B(phoVar, "LoyaltyProgram.LoyaltyScreen.DoneTapped", g8e.u("loyalty_program", str7 == null ? "" : str7, "loyalty_balance", b(str7)), 1);
                            loyaltySelectorUiActionInteractor$handleAction$1.L$0 = null;
                            loyaltySelectorUiActionInteractor$handleAction$1.L$1 = null;
                            loyaltySelectorUiActionInteractor$handleAction$1.L$2 = null;
                            loyaltySelectorUiActionInteractor$handleAction$1.L$3 = null;
                            loyaltySelectorUiActionInteractor$handleAction$1.label = 2;
                            lxz a = this.a.a();
                            if (a != null && (c = fia1.c(a)) != null) {
                                obj5 = c.a;
                            }
                            if (str7 == null || str7.equals(obj5)) {
                                gwzVar.a.r(new qu(i4));
                            } else {
                                obj4 = a(str7, new t7j(29, gwzVar, this, str7), loyaltySelectorUiActionInteractor$handleAction$1);
                            }
                            if (obj4 != obj3) {
                                return obj4;
                            }
                        } else {
                            if (!jl40.l(bxzVar, axz.a)) {
                                w511.b();
                                return null;
                            }
                            loyaltySelectorUiActionInteractor$handleAction$1.L$0 = null;
                            str3 = str;
                            loyaltySelectorUiActionInteractor$handleAction$1.L$1 = str3;
                            loyaltySelectorUiActionInteractor$handleAction$1.L$2 = str2;
                            loyaltySelectorUiActionInteractor$handleAction$1.L$3 = gwzVar;
                            loyaltySelectorUiActionInteractor$handleAction$1.label = 3;
                            if (g(loyaltySelectorUiActionInteractor$handleAction$1) != obj3) {
                                gwzVar2 = gwzVar;
                                str4 = str2;
                            }
                        }
                    }
                    return obj3;
                }
                if (i == 1 || i == 2) {
                    kotlin.b.b(obj2);
                    return obj2;
                }
                if (i != 3) {
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = (String) loyaltySelectorUiActionInteractor$handleAction$1.L$1;
                    kotlin.b.b(obj2);
                    String b = b("plus");
                    String b2 = b("birbonus");
                    boolean z = c("birbonus") != LoyaltyProgramState.NEED_ACTIVATION;
                    HashMap u = g8e.u("source", str3, "plus_loyalty_balance", b);
                    u.put("birbonus_loyalty_balance", b2);
                    u.put("is_birbonus_loyalty_active", Boolean.valueOf(z));
                    phoVar.a("LoyaltyProgram.LoyaltyScreen.Shown", u, 1, new HashMap());
                    return obj4;
                }
                gwz gwzVar3 = (gwz) loyaltySelectorUiActionInteractor$handleAction$1.L$3;
                str4 = (String) loyaltySelectorUiActionInteractor$handleAction$1.L$2;
                String str8 = (String) loyaltySelectorUiActionInteractor$handleAction$1.L$1;
                kotlin.b.b(obj2);
                gwzVar2 = gwzVar3;
                str3 = str8;
                loyaltySelectorUiActionInteractor$handleAction$1.L$0 = null;
                loyaltySelectorUiActionInteractor$handleAction$1.L$1 = str3;
                loyaltySelectorUiActionInteractor$handleAction$1.L$2 = null;
                loyaltySelectorUiActionInteractor$handleAction$1.L$3 = null;
                loyaltySelectorUiActionInteractor$handleAction$1.label = 4;
                if (str4 != null && !evu0.J(str4)) {
                    LoyaltyProgramState c2 = c(str4);
                    i2 = c2 != null ? -1 : cxz.a[c2.ordinal()];
                    if (i2 != -1) {
                        if (i2 == 1) {
                            gwzVar2.a.r(new qu(i4));
                            ((rwz) this.k.get()).b(str4);
                        } else if (i2 == 2) {
                            obj = a(str4, new mqu(27, this, str4), loyaltySelectorUiActionInteractor$handleAction$1);
                        } else {
                            if (i2 != 3) {
                                w511.b();
                                return null;
                            }
                            obj = f(str4, gwzVar2, loyaltySelectorUiActionInteractor$handleAction$1);
                        }
                    }
                }
                obj = obj4;
            }
        }
        loyaltySelectorUiActionInteractor$handleAction$1 = new LoyaltySelectorUiActionInteractor$handleAction$1(this, continuationImpl);
        Object obj22 = loyaltySelectorUiActionInteractor$handleAction$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loyaltySelectorUiActionInteractor$handleAction$1.label;
        int i42 = 9;
        Object obj42 = zy11.a;
        Object obj52 = null;
        if (i != 0) {
        }
        loyaltySelectorUiActionInteractor$handleAction$1.L$0 = null;
        loyaltySelectorUiActionInteractor$handleAction$1.L$1 = str3;
        loyaltySelectorUiActionInteractor$handleAction$1.L$2 = null;
        loyaltySelectorUiActionInteractor$handleAction$1.L$3 = null;
        loyaltySelectorUiActionInteractor$handleAction$1.label = 4;
        if (str4 != null) {
            LoyaltyProgramState c22 = c(str4);
            if (c22 != null) {
            }
            if (i2 != -1) {
            }
        }
        obj = obj42;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, gwz gwzVar, ContinuationImpl continuationImpl) {
        LoyaltySelectorUiActionInteractor$signInLoyaltyProgram$1 loyaltySelectorUiActionInteractor$signInLoyaltyProgram$1;
        int i;
        Object a;
        Throwable a2;
        if (continuationImpl instanceof LoyaltySelectorUiActionInteractor$signInLoyaltyProgram$1) {
            loyaltySelectorUiActionInteractor$signInLoyaltyProgram$1 = (LoyaltySelectorUiActionInteractor$signInLoyaltyProgram$1) continuationImpl;
            int i2 = loyaltySelectorUiActionInteractor$signInLoyaltyProgram$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loyaltySelectorUiActionInteractor$signInLoyaltyProgram$1.label = i2 - Integer.MIN_VALUE;
                Object obj = loyaltySelectorUiActionInteractor$signInLoyaltyProgram$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = loyaltySelectorUiActionInteractor$signInLoyaltyProgram$1.label;
                iwz iwzVar = this.i;
                if (i != 0) {
                    kotlin.b.b(obj);
                    iwzVar.a.l(LoyaltySelectorLoadingState.GET_DATA_FOR_AUTH);
                    b bVar = (b) this.l.get();
                    loyaltySelectorUiActionInteractor$signInLoyaltyProgram$1.L$0 = null;
                    loyaltySelectorUiActionInteractor$signInLoyaltyProgram$1.L$1 = gwzVar;
                    loyaltySelectorUiActionInteractor$signInLoyaltyProgram$1.label = 1;
                    a = bVar.a(str, loyaltySelectorUiActionInteractor$signInLoyaltyProgram$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gwzVar = (gwz) loyaltySelectorUiActionInteractor$signInLoyaltyProgram$1.L$1;
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    fvz fvzVar = (fvz) a;
                    String str2 = fvzVar.a;
                    String str3 = fvzVar.b;
                    LoyaltySelectorUiActionInteractor$signInLoyaltyProgram$2$1 loyaltySelectorUiActionInteractor$signInLoyaltyProgram$2$1 = new LoyaltySelectorUiActionInteractor$signInLoyaltyProgram$2$1(this, null);
                    LoyaltySelectorUiActionInteractor$signInLoyaltyProgram$2$2 loyaltySelectorUiActionInteractor$signInLoyaltyProgram$2$2 = new LoyaltySelectorUiActionInteractor$signInLoyaltyProgram$2$2(this, null);
                    hwz hwzVar = gwzVar.a;
                    hwzVar.A((m950) hwzVar.I.get(), new gvz(str2, str3), new com.yandex.go.loyalty.impl.selector.b(hwzVar, loyaltySelectorUiActionInteractor$signInLoyaltyProgram$2$1, loyaltySelectorUiActionInteractor$signInLoyaltyProgram$2$2));
                }
                a2 = Result.a(a);
                if (a2 != null) {
                    boolean z = a2 instanceof GoApiHttpException;
                    h3y h3yVar = this.k;
                    if (z && ((GoApiHttpException) a2).getCode() == 400) {
                        rwz rwzVar = (rwz) h3yVar.get();
                        LocalNotificationItemComponent a3 = rwzVar.a("loyalty_phone_error", rwzVar.a.getString(kyh0.loyalty_notification_log_in_with_local_phone));
                        a3.startExpiresTimer(5000L);
                        rwzVar.b.e(a3);
                    } else {
                        rwz rwzVar2 = (rwz) h3yVar.get();
                        LocalNotificationItemComponent a4 = rwzVar2.a("sign_in_error", rwzVar2.a.getString(kyh0.unknown_error_description));
                        a4.startExpiresTimer(5000L);
                        rwzVar2.b.e(a4);
                    }
                }
                iwzVar.a.l(LoyaltySelectorLoadingState.NONE);
                return zy11.a;
            }
        }
        loyaltySelectorUiActionInteractor$signInLoyaltyProgram$1 = new LoyaltySelectorUiActionInteractor$signInLoyaltyProgram$1(this, continuationImpl);
        Object obj2 = loyaltySelectorUiActionInteractor$signInLoyaltyProgram$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loyaltySelectorUiActionInteractor$signInLoyaltyProgram$1.label;
        iwz iwzVar2 = this.i;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        a2 = Result.a(a);
        if (a2 != null) {
        }
        iwzVar2.a.l(LoyaltySelectorLoadingState.NONE);
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        LoyaltySelectorUiActionInteractor$updateLoyaltyState$1 loyaltySelectorUiActionInteractor$updateLoyaltyState$1;
        int i;
        com.yandex.go.loyalty.impl.common.domain.a aVar;
        Object b;
        if (continuationImpl instanceof LoyaltySelectorUiActionInteractor$updateLoyaltyState$1) {
            loyaltySelectorUiActionInteractor$updateLoyaltyState$1 = (LoyaltySelectorUiActionInteractor$updateLoyaltyState$1) continuationImpl;
            int i2 = loyaltySelectorUiActionInteractor$updateLoyaltyState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loyaltySelectorUiActionInteractor$updateLoyaltyState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = loyaltySelectorUiActionInteractor$updateLoyaltyState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = loyaltySelectorUiActionInteractor$updateLoyaltyState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    aVar = this.f;
                    loyaltySelectorUiActionInteractor$updateLoyaltyState$1.L$0 = aVar;
                    loyaltySelectorUiActionInteractor$updateLoyaltyState$1.label = 1;
                    obj = this.d.a(loyaltySelectorUiActionInteractor$updateLoyaltyState$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        b = ((Result) obj).getValue();
                        if (!(b instanceof Result.Failure)) {
                            this.i.a.l(LoyaltySelectorLoadingState.NONE);
                        }
                        return zy11.a;
                    }
                    aVar = (com.yandex.go.loyalty.impl.common.domain.a) loyaltySelectorUiActionInteractor$updateLoyaltyState$1.L$0;
                    kotlin.b.b(obj);
                }
                LoyaltyStateParam loyaltyStateParam = new LoyaltyStateParam((GeoState) obj);
                loyaltySelectorUiActionInteractor$updateLoyaltyState$1.L$0 = null;
                loyaltySelectorUiActionInteractor$updateLoyaltyState$1.label = 2;
                b = aVar.b(loyaltyStateParam, loyaltySelectorUiActionInteractor$updateLoyaltyState$1);
            }
        }
        loyaltySelectorUiActionInteractor$updateLoyaltyState$1 = new LoyaltySelectorUiActionInteractor$updateLoyaltyState$1(this, continuationImpl);
        Object obj2 = loyaltySelectorUiActionInteractor$updateLoyaltyState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loyaltySelectorUiActionInteractor$updateLoyaltyState$1.label;
        if (i != 0) {
        }
        LoyaltyStateParam loyaltyStateParam2 = new LoyaltyStateParam((GeoState) obj2);
        loyaltySelectorUiActionInteractor$updateLoyaltyState$1.L$0 = null;
        loyaltySelectorUiActionInteractor$updateLoyaltyState$1.label = 2;
        b = aVar.b(loyaltyStateParam2, loyaltySelectorUiActionInteractor$updateLoyaltyState$1);
    }
}
