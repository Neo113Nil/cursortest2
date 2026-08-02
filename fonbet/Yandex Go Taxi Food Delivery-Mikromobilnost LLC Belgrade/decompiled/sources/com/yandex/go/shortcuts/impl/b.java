package com.yandex.go.shortcuts.impl;

import android.net.Uri;
import com.yandex.go.dto.response.Action$CityMode;
import com.yandex.go.dto.response.Action$Deeplink;
import com.yandex.go.dto.response.Action$Drive;
import com.yandex.go.dto.response.Action$Media;
import com.yandex.go.dto.response.Action$MediaStory;
import com.yandex.go.dto.response.Action$RouteInput;
import com.yandex.go.dto.response.Action$SummaryRedirect;
import com.yandex.go.dto.response.Action$TaxiExpectedDestination;
import com.yandex.go.dto.response.q1;
import com.yandex.go.models.SummaryRedirectActionModel;
import com.yandex.go.shortcuts.dto.response.CountersShowPolicy;
import com.yandex.go.shortcuts.dto.response.MediaStories;
import com.yandex.go.shortcuts.dto.response.Type;
import com.yandex.go.shortcuts.dto.response.f0;
import com.yandex.go.shortcuts.impl.next.button.NextButtonAnalytics$ProceedButtonType;
import com.yandex.go.shortcuts.models.LoadingMode;
import com.yandex.go.shortcuts.models.ShortcutClickAction;
import com.yandex.go.zone.model.Zone;
import defpackage.a1f;
import defpackage.ayr0;
import defpackage.b64;
import defpackage.bvf0;
import defpackage.c1f;
import defpackage.cl7;
import defpackage.cx60;
import defpackage.d2c;
import defpackage.do91;
import defpackage.dvw;
import defpackage.dx60;
import defpackage.e3s0;
import defpackage.e6v;
import defpackage.ebu;
import defpackage.f3s0;
import defpackage.fnx0;
import defpackage.g3s0;
import defpackage.g8e;
import defpackage.ga5;
import defpackage.gwz0;
import defpackage.gxr0;
import defpackage.h1p;
import defpackage.hc00;
import defpackage.hst;
import defpackage.hwe0;
import defpackage.i3s0;
import defpackage.ic00;
import defpackage.j0s0;
import defpackage.j18;
import defpackage.jc00;
import defpackage.jst;
import defpackage.k4s0;
import defpackage.kc00;
import defpackage.kf10;
import defpackage.lwr0;
import defpackage.lz;
import defpackage.n170;
import defpackage.nc6;
import defpackage.ny61;
import defpackage.o1s0;
import defpackage.pcu;
import defpackage.pex0;
import defpackage.pwr0;
import defpackage.pzr0;
import defpackage.qwr0;
import defpackage.r3h;
import defpackage.scb1;
import defpackage.sxr0;
import defpackage.tse;
import defpackage.txr0;
import defpackage.u660;
import defpackage.u8w0;
import defpackage.v0s0;
import defpackage.w511;
import defpackage.w660;
import defpackage.x660;
import defpackage.xby;
import defpackage.xsv0;
import defpackage.yyr0;
import defpackage.z660;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Objects;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes8.dex */
public final class b implements e3s0 {
    public final d2c a;
    public final c1f b;
    public final z660 c;
    public final pzr0 d;
    public final o1s0 e;
    public final n170 f;
    public final jc00 g;
    public final xsv0 h;
    public final com.yandex.go.models.b i;
    public final u8w0 j;
    public final hwe0 k;
    public final sxr0 l;
    public final txr0 m;
    public final tse n;

    public b(d2c d2cVar, c1f c1fVar, z660 z660Var, pzr0 pzr0Var, o1s0 o1s0Var, n170 n170Var, jc00 jc00Var, xsv0 xsv0Var, com.yandex.go.models.b bVar, u8w0 u8w0Var, hwe0 hwe0Var, sxr0 sxr0Var, txr0 txr0Var, tse tseVar) {
        this.a = d2cVar;
        this.b = c1fVar;
        this.c = z660Var;
        this.d = pzr0Var;
        this.e = o1s0Var;
        this.f = n170Var;
        this.g = jc00Var;
        this.h = xsv0Var;
        this.i = bVar;
        this.j = u8w0Var;
        this.k = hwe0Var;
        this.l = sxr0Var;
        this.m = txr0Var;
        this.n = tseVar;
    }

    public final ayr0 a(yyr0 yyr0Var) {
        Action$Deeplink action$Deeplink;
        String value;
        r3h r3hVar = yyr0Var instanceof r3h ? (r3h) yyr0Var : null;
        if (r3hVar != null && (action$Deeplink = (Action$Deeplink) r3hVar.getC()) != null) {
            Uri parse = Uri.parse(action$Deeplink.a);
            this.h.getClass();
            h1p a = xsv0.a(parse).a();
            if (a != null && (value = a.getValue()) != null) {
                return new ayr0(value);
            }
        }
        return null;
    }

    public final Object b(yyr0 yyr0Var, SuspendLambda suspendLambda) {
        SummaryRedirectActionModel.State state;
        boolean z = yyr0Var instanceof pcu;
        sxr0 sxr0Var = this.l;
        if (z) {
            ((com.yandex.go.shortcuts.impl.analytic.a) sxr0Var).f(yyr0Var, null);
        }
        q1 c = yyr0Var.getC();
        zy11 zy11Var = zy11.a;
        if (c == null) {
            xby.t(jst.e, "SHORTCUTS:ACTION:NOT_FOUND", null, g8e.o("Action not found. ShortcutId = ", yyr0Var.e()), 6);
            return zy11Var;
        }
        hst hstVar = jst.e;
        c.toString();
        hstVar.getClass();
        int i = f3s0.b[c.a().ordinal()];
        if (i == 1) {
            if ((c instanceof Action$SummaryRedirect ? (Action$SummaryRedirect) c : null) != null) {
                Action$SummaryRedirect action$SummaryRedirect = (Action$SummaryRedirect) c;
                this.i.getClass();
                String str = action$SummaryRedirect.a;
                String str2 = action$SummaryRedirect.b;
                int i2 = com.yandex.go.models.a.a[action$SummaryRedirect.c.ordinal()];
                if (i2 == 1) {
                    state = SummaryRedirectActionModel.State.COLLAPSED;
                } else if (i2 == 2) {
                    state = SummaryRedirectActionModel.State.EXPANDED;
                } else {
                    if (i2 != 3) {
                        w511.b();
                        return null;
                    }
                    state = SummaryRedirectActionModel.State.ANCHORED;
                }
                SummaryRedirectActionModel.State state2 = state;
                boolean z2 = action$SummaryRedirect.d;
                Action$SummaryRedirect.Destination destination = action$SummaryRedirect.e;
                Object n = bvf0.n(new ShortcutsOnItemClickInteractorImpl$handleHeaderSummaryRedirect$2(this, new SummaryRedirectActionModel(str, str2, state2, z2, destination != null ? new SummaryRedirectActionModel.a(8, destination.getA(), destination.getB(), destination.getC()) : null, action$SummaryRedirect.f, action$SummaryRedirect.g, null, null, 384), yyr0Var, null), suspendLambda);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (n != coroutineSingletons) {
                    n = zy11Var;
                }
                if (n == coroutineSingletons) {
                    return n;
                }
            }
        } else {
            if (i != 2) {
                if (c instanceof Action$RouteInput) {
                    Action$RouteInput action$RouteInput = (Action$RouteInput) c;
                    ebu ebuVar = yyr0Var instanceof ebu ? (ebu) yyr0Var : null;
                    c = Action$RouteInput.b(action$RouteInput, null, null, null, ebuVar != null ? ebuVar.x() : null, 7);
                }
                return this.j.a(c, suspendLambda);
            }
            ((com.yandex.go.shortcuts.impl.analytic.a) sxr0Var).f(yyr0Var, a(yyr0Var));
            if ((c instanceof Action$CityMode ? (Action$CityMode) c : null) != null) {
                this.d.b(new lwr0((Action$CityMode) c));
                return zy11Var;
            }
        }
        return zy11Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        if ((r6 instanceof defpackage.hc00) != false) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [tls] */
    /* JADX WARN: Type inference failed for: r4v1, types: [yyr0] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.yandex.go.shortcuts.impl.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(LoadingMode loadingMode, yyr0 yyr0Var, j0s0 j0s0Var, SuspendLambda suspendLambda) {
        int i = f3s0.a[yyr0Var.getSource().ordinal()];
        sxr0 sxr0Var = this.l;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 1:
            case 2:
                ((com.yandex.go.shortcuts.impl.analytic.a) sxr0Var).f(yyr0Var, null);
                return b(yyr0Var, suspendLambda);
            case 3:
                if (loadingMode != LoadingMode.IDLE) {
                    ic00 ic00Var = ((kc00) this.g).a;
                    ic00Var.getClass();
                    break;
                }
                if (yyr0Var instanceof ga5) {
                    ((com.yandex.go.shortcuts.impl.analytic.a) sxr0Var).f(yyr0Var, a(yyr0Var));
                    ga5 ga5Var = (ga5) yyr0Var;
                    int i2 = f3s0.c[ga5Var.getType().ordinal()];
                    pzr0 pzr0Var = this.d;
                    switch (i2) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            return b(yyr0Var, suspendLambda);
                        case 8:
                            break;
                        case 9:
                            return e(ga5Var, (Action$TaxiExpectedDestination) ga5Var.getC(), j0s0Var, suspendLambda);
                        case 10:
                            return ga5Var.getC() instanceof Action$TaxiExpectedDestination ? e(ga5Var, (Action$TaxiExpectedDestination) ga5Var.getC(), j0s0Var, suspendLambda) : b(yyr0Var, suspendLambda);
                        case 11:
                            kf10 kf10Var = (kf10) yyr0Var;
                            if (kf10Var.getC() != null) {
                                pzr0Var.b(new gxr0(new a(r4, this), ((Action$MediaStory) kf10Var.getC()).a.getA()));
                                return zy11Var;
                            }
                            break;
                        case 12:
                            if (((Action$Drive) ga5Var.getC()) != null) {
                                pzr0Var.b(pwr0.a);
                                return zy11Var;
                            }
                            break;
                        default:
                            xby.t(jst.e, "OFFER:ERROR", null, "Unexpected offer type. Offer type = " + ga5Var.getType(), 6);
                            return zy11Var;
                    }
                }
                return zy11Var;
            case 4:
                r4 = yyr0Var instanceof gwz0 ? (gwz0) yyr0Var : 0;
                if (r4 != 0) {
                    ((com.yandex.go.shortcuts.impl.analytic.a) sxr0Var).f(r4, null);
                    Object b = b(r4, suspendLambda);
                    if (b == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return b;
                    }
                }
                return zy11Var;
            case 5:
                nc6 nc6Var = yyr0Var instanceof nc6 ? (nc6) yyr0Var : null;
                if (nc6Var != null) {
                    ((com.yandex.go.shortcuts.impl.analytic.a) sxr0Var).f(nc6Var, null);
                    Object b2 = b(nc6Var, suspendLambda);
                    if (b2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return b2;
                    }
                }
                return zy11Var;
            case 6:
            case 7:
                if (loadingMode == LoadingMode.IDLE) {
                    ((com.yandex.go.shortcuts.impl.analytic.a) sxr0Var).f(yyr0Var, null);
                    return b(yyr0Var, suspendLambda);
                }
                return zy11Var;
            case 8:
                return b(yyr0Var, suspendLambda);
            default:
                xby.t(jst.e, "SHORTCUTS:ACTION:UNSUPPORTED", null, "Unexpected shortcut source type = " + yyr0Var.getSource(), 6);
                return zy11Var;
        }
    }

    public final Object d(e6v e6vVar, LoadingMode loadingMode, k4s0 k4s0Var, Continuation continuation) {
        q1 c;
        f0 i;
        Action$Media action$Media;
        hst hstVar = jst.e;
        Objects.toString(e6vVar);
        hstVar.getClass();
        String str = null;
        yyr0 yyr0Var = e6vVar instanceof yyr0 ? (yyr0) e6vVar : null;
        zy11 zy11Var = zy11.a;
        if (yyr0Var == null || loadingMode == LoadingMode.LOADING_SINGLE) {
            return zy11Var;
        }
        String e = yyr0Var.e();
        String f = yyr0Var.f();
        String a = this.m.a(yyr0Var);
        if (a == null) {
            a = "";
        }
        String str2 = a;
        q1 c2 = yyr0Var.getC();
        Action$MediaStory action$MediaStory = c2 instanceof Action$MediaStory ? (Action$MediaStory) c2 : null;
        if (action$MediaStory != null && (action$Media = action$MediaStory.a) != null) {
            str = action$Media.getA();
        }
        ((com.yandex.go.shortcuts.impl.interactors.a) this.a).d(e, str2, f, str, ShortcutClickAction.TAP, this.e.a());
        if (yyr0Var instanceof a1f) {
            Iterator it = ((a1f) yyr0Var).h().getA().iterator();
            while (it.hasNext()) {
                this.b.b((CountersShowPolicy) it.next());
            }
        }
        boolean z = yyr0Var instanceof v0s0;
        pzr0 pzr0Var = this.d;
        if (z && (i = ((v0s0) yyr0Var).i()) != null && i.a() == Type.MEDIA_STORIES) {
            MediaStories mediaStories = (MediaStories) i;
            Action$MediaStory a2 = mediaStories.getA();
            CountersShowPolicy b = mediaStories.getB();
            if (b != null) {
                n170 n170Var = this.f;
                if (!n170Var.w.b.contains(b.getA()) && !n170Var.e(b) && a2 != null) {
                    n170Var.b(b);
                    pzr0Var.b(new gxr0(new a(new ShortcutsOnItemClickInteractorImpl$onItemClick$2(this, loadingMode, yyr0Var, k4s0Var, null), this), a2.a.getA()));
                    jst.e.getClass();
                    return zy11Var;
                }
            }
        }
        if ((yyr0Var instanceof pcu) && (c = ((pcu) yyr0Var).getC()) != null) {
            String a3 = pzr0Var.a();
            String name = c.a().name();
            z660 z660Var = this.c;
            w660 w660Var = z660Var.c;
            Zone g = z660Var.a.g();
            ic00 ic00Var = ((kc00) z660Var.b).a;
            ic00Var.getClass();
            x660 x660Var = new x660(g, ic00Var instanceof hc00);
            w660Var.getClass();
            u660 u660Var = new u660(NextButtonAnalytics$ProceedButtonType.ARROW_ON_SHORTCUT, x660Var.a(), "shortcuts", x660Var.b(), a3);
            w660Var.a.e(u660Var.b(), u660Var.a().getValue(), name, u660Var.c());
        }
        return c(loadingMode, yyr0Var, k4s0Var, (SuspendLambda) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, g3s0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ga5 ga5Var, Action$TaxiExpectedDestination action$TaxiExpectedDestination, j0s0 j0s0Var, ContinuationImpl continuationImpl) {
        ShortcutsOnItemClickInteractorImpl$openExpectedDestination$1 shortcutsOnItemClickInteractorImpl$openExpectedDestination$1;
        int i;
        pex0 pex0Var;
        String str;
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof ShortcutsOnItemClickInteractorImpl$openExpectedDestination$1) {
            shortcutsOnItemClickInteractorImpl$openExpectedDestination$1 = (ShortcutsOnItemClickInteractorImpl$openExpectedDestination$1) continuationImpl;
            int i2 = shortcutsOnItemClickInteractorImpl$openExpectedDestination$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                shortcutsOnItemClickInteractorImpl$openExpectedDestination$1.label = i2 - Integer.MIN_VALUE;
                Object obj = shortcutsOnItemClickInteractorImpl$openExpectedDestination$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shortcutsOnItemClickInteractorImpl$openExpectedDestination$1.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                kotlin.b.b(obj);
                if (action$TaxiExpectedDestination != null) {
                    hst hstVar = jst.e;
                    action$TaxiExpectedDestination.toString();
                    hstVar.getClass();
                    hwe0 hwe0Var = this.k;
                    fnx0 l = hwe0Var.b.l();
                    if (l != null && (pex0Var = l.c) != null && (str = pex0Var.b) != null) {
                        hwe0Var.b.j.f = str;
                    }
                    shortcutsOnItemClickInteractorImpl$openExpectedDestination$1.L$0 = ga5Var;
                    shortcutsOnItemClickInteractorImpl$openExpectedDestination$1.L$1 = action$TaxiExpectedDestination;
                    shortcutsOnItemClickInteractorImpl$openExpectedDestination$1.L$2 = j0s0Var;
                    shortcutsOnItemClickInteractorImpl$openExpectedDestination$1.label = 1;
                    j18 j18Var = new j18(1, dvw.b(shortcutsOnItemClickInteractorImpl$openExpectedDestination$1));
                    Ref$ObjectRef y = b64.y(j18Var);
                    cx60 cx60Var = new cx60(8, y);
                    cl7 cl7Var = new cl7(j18Var, cx60Var);
                    ShortcutsOnItemClickInteractorImpl$openExpectedDestination$$inlined$suspendCallbackApi$2 shortcutsOnItemClickInteractorImpl$openExpectedDestination$$inlined$suspendCallbackApi$2 = new ShortcutsOnItemClickInteractorImpl$openExpectedDestination$$inlined$suspendCallbackApi$2(cl7Var);
                    y.element = new g3s0(this.d.b(new qwr0(action$TaxiExpectedDestination, scb1.c(ga5Var), new do91(14, j0s0Var, ga5Var), new lz(this, ga5Var, j0s0Var, shortcutsOnItemClickInteractorImpl$openExpectedDestination$$inlined$suspendCallbackApi$2, 24), new i3s0(this, ga5Var, action$TaxiExpectedDestination, j0s0Var, shortcutsOnItemClickInteractorImpl$openExpectedDestination$$inlined$suspendCallbackApi$2))), 1);
                    if (cl7Var.c()) {
                        cx60Var.invoke();
                    } else {
                        j18Var.w(new dx60(cl7Var, 9));
                    }
                    if (j18Var.s() == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        shortcutsOnItemClickInteractorImpl$openExpectedDestination$1 = new ShortcutsOnItemClickInteractorImpl$openExpectedDestination$1(this, continuationImpl);
        Object obj2 = shortcutsOnItemClickInteractorImpl$openExpectedDestination$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shortcutsOnItemClickInteractorImpl$openExpectedDestination$1.label;
        if (i == 0) {
        }
    }
}
