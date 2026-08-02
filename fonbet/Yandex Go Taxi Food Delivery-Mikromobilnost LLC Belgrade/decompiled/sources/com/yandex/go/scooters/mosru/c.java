package com.yandex.go.scooters.mosru;

import com.yandex.go.scooters.mosru.api.analytics.ScootersMosRuAnalyticsEvent$ModalOpened$OpenReason;
import com.yandex.go.scooters.mosru.api.analytics.ScootersMosRuAnalyticsEvent$WebViewOpened$OpenReason;
import com.yandex.go.scooters.mosru.api.analytics.ScootersMosRuAnalyticsFromScreen;
import com.yandex.go.scooters.mosru.api.domain.model.ScootersMosRuActionDialogOpenReason;
import defpackage.azn0;
import defpackage.czn0;
import defpackage.e0o0;
import defpackage.gqm0;
import defpackage.h55;
import defpackage.iqm0;
import defpackage.lg21;
import defpackage.lzn0;
import defpackage.m950;
import defpackage.mg21;
import defpackage.ny61;
import defpackage.ozn0;
import defpackage.q8p0;
import defpackage.qx5;
import defpackage.qzn0;
import defpackage.rzn0;
import defpackage.s6k0;
import defpackage.sy60;
import defpackage.szn0;
import defpackage.tje;
import defpackage.tyn0;
import defpackage.tzn0;
import defpackage.uzn0;
import defpackage.vkn0;
import defpackage.vzn0;
import defpackage.w511;
import defpackage.w8p0;
import defpackage.xpm0;
import defpackage.yvf0;
import defpackage.yyn0;
import defpackage.zy11;
import java.util.LinkedList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class c extends h55 {
    public final yvf0 D;
    public final com.yandex.go.scooters.mosru.domain.a E;
    public final yvf0 F;
    public final czn0 G;
    public final qx5 H;

    public c(yvf0 yvf0Var, com.yandex.go.scooters.mosru.domain.a aVar, yvf0 yvf0Var2, czn0 czn0Var, qx5 qx5Var) {
        super(null);
        this.D = yvf0Var;
        this.E = aVar;
        this.F = yvf0Var2;
        this.G = czn0Var;
        this.H = qx5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        if (r11 == r2) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(c cVar, qzn0 qzn0Var, ScootersMosRuActionDialogOpenReason scootersMosRuActionDialogOpenReason, ContinuationImpl continuationImpl) {
        ScootersMosRuRouterImpl$handleActionDialogMode$1 scootersMosRuRouterImpl$handleActionDialogMode$1;
        int i;
        boolean booleanValue;
        qzn0 qzn0Var2;
        ScootersMosRuActionDialogOpenReason scootersMosRuActionDialogOpenReason2;
        com.yandex.go.scooters.mosru.domain.a aVar = cVar.E;
        if (continuationImpl instanceof ScootersMosRuRouterImpl$handleActionDialogMode$1) {
            scootersMosRuRouterImpl$handleActionDialogMode$1 = (ScootersMosRuRouterImpl$handleActionDialogMode$1) continuationImpl;
            int i2 = scootersMosRuRouterImpl$handleActionDialogMode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersMosRuRouterImpl$handleActionDialogMode$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersMosRuRouterImpl$handleActionDialogMode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersMosRuRouterImpl$handleActionDialogMode$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean z = qzn0Var.e;
                    scootersMosRuRouterImpl$handleActionDialogMode$1.L$0 = qzn0Var;
                    scootersMosRuRouterImpl$handleActionDialogMode$1.L$1 = scootersMosRuActionDialogOpenReason;
                    scootersMosRuRouterImpl$handleActionDialogMode$1.label = 1;
                    obj = aVar.h(z, scootersMosRuActionDialogOpenReason, scootersMosRuRouterImpl$handleActionDialogMode$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        scootersMosRuActionDialogOpenReason2 = (ScootersMosRuActionDialogOpenReason) scootersMosRuRouterImpl$handleActionDialogMode$1.L$1;
                        qzn0Var2 = (qzn0) scootersMosRuRouterImpl$handleActionDialogMode$1.L$0;
                        kotlin.b.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            cVar.r(new vkn0(27));
                            return zy11Var;
                        }
                        cVar.T(qzn0Var2, scootersMosRuActionDialogOpenReason2);
                        return zy11Var;
                    }
                    scootersMosRuActionDialogOpenReason = (ScootersMosRuActionDialogOpenReason) scootersMosRuRouterImpl$handleActionDialogMode$1.L$1;
                    qzn0Var = (qzn0) scootersMosRuRouterImpl$handleActionDialogMode$1.L$0;
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (!booleanValue) {
                    cVar.T(qzn0Var, scootersMosRuActionDialogOpenReason);
                    return zy11Var;
                }
                Integer num = qzn0Var.c;
                scootersMosRuRouterImpl$handleActionDialogMode$1.L$0 = qzn0Var;
                scootersMosRuRouterImpl$handleActionDialogMode$1.L$1 = scootersMosRuActionDialogOpenReason;
                scootersMosRuRouterImpl$handleActionDialogMode$1.Z$0 = booleanValue;
                scootersMosRuRouterImpl$handleActionDialogMode$1.label = 2;
                obj = aVar.g(scootersMosRuActionDialogOpenReason, num, scootersMosRuRouterImpl$handleActionDialogMode$1);
                if (obj != coroutineSingletons) {
                    ScootersMosRuActionDialogOpenReason scootersMosRuActionDialogOpenReason3 = scootersMosRuActionDialogOpenReason;
                    qzn0Var2 = qzn0Var;
                    scootersMosRuActionDialogOpenReason2 = scootersMosRuActionDialogOpenReason3;
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
                return coroutineSingletons;
            }
        }
        scootersMosRuRouterImpl$handleActionDialogMode$1 = new ScootersMosRuRouterImpl$handleActionDialogMode$1(cVar, continuationImpl);
        Object obj2 = scootersMosRuRouterImpl$handleActionDialogMode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMosRuRouterImpl$handleActionDialogMode$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (!booleanValue) {
        }
    }

    public static final void Q(c cVar, vzn0 vzn0Var, String str) {
        if (vzn0Var instanceof rzn0) {
            tje.N(cVar.o(), null, null, new ScootersMosRuRouterImpl$handleButtonAction$1(cVar, str, null), 3);
            return;
        }
        if (vzn0Var instanceof szn0) {
            cVar.r(new vkn0(28));
            return;
        }
        if (vzn0Var instanceof tzn0) {
            ((mg21) ((lg21) cVar.D.get())).c(((tzn0) vzn0Var).a);
        } else if (vzn0Var instanceof uzn0) {
            cVar.A((m950) cVar.F.get(), new w8p0(new q8p0(((uzn0) vzn0Var).a, false), (b) null, 6), sy60.Q2);
        }
    }

    public static final void R(final c cVar, w8p0 w8p0Var, ScootersMosRuAnalyticsEvent$WebViewOpened$OpenReason scootersMosRuAnalyticsEvent$WebViewOpened$OpenReason) {
        cVar.G.b(new yyn0(scootersMosRuAnalyticsEvent$WebViewOpened$OpenReason));
        tje.N(cVar.o(), null, null, new ScootersMosRuRouterImpl$launchWebView$1(cVar, null), 3);
        cVar.A((m950) cVar.F.get(), w8p0Var, new sy60() { // from class: com.yandex.go.scooters.mosru.a
            @Override // defpackage.sy60
            public final void a() {
                c cVar2 = c.this;
                tje.N(cVar2.o(), null, null, new ScootersMosRuRouterImpl$launchWebView$2$1(cVar2, null), 3);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object S(c cVar, String str, ContinuationImpl continuationImpl) {
        ScootersMosRuRouterImpl$prepareWebRouterPayload$1 scootersMosRuRouterImpl$prepareWebRouterPayload$1;
        int i;
        LinkedList linkedList;
        cVar.getClass();
        if (continuationImpl instanceof ScootersMosRuRouterImpl$prepareWebRouterPayload$1) {
            scootersMosRuRouterImpl$prepareWebRouterPayload$1 = (ScootersMosRuRouterImpl$prepareWebRouterPayload$1) continuationImpl;
            int i2 = scootersMosRuRouterImpl$prepareWebRouterPayload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersMosRuRouterImpl$prepareWebRouterPayload$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersMosRuRouterImpl$prepareWebRouterPayload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersMosRuRouterImpl$prepareWebRouterPayload$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    LinkedList linkedList2 = new LinkedList();
                    com.yandex.go.scooters.mosru.domain.a aVar = cVar.E;
                    scootersMosRuRouterImpl$prepareWebRouterPayload$1.L$0 = null;
                    scootersMosRuRouterImpl$prepareWebRouterPayload$1.L$1 = linkedList2;
                    scootersMosRuRouterImpl$prepareWebRouterPayload$1.label = 1;
                    Object c = aVar.c(str, scootersMosRuRouterImpl$prepareWebRouterPayload$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = c;
                    linkedList = linkedList2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    linkedList = (LinkedList) scootersMosRuRouterImpl$prepareWebRouterPayload$1.L$1;
                    kotlin.b.b(obj);
                }
                return new w8p0(new q8p0((String) obj, false), new b(linkedList, cVar), 4);
            }
        }
        scootersMosRuRouterImpl$prepareWebRouterPayload$1 = new ScootersMosRuRouterImpl$prepareWebRouterPayload$1(cVar, continuationImpl);
        Object obj2 = scootersMosRuRouterImpl$prepareWebRouterPayload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMosRuRouterImpl$prepareWebRouterPayload$1.label;
        if (i != 0) {
        }
        return new w8p0(new q8p0((String) obj2, false), new b(linkedList, cVar), 4);
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        tje.N(o(), null, CoroutineStart.UNDISPATCHED, new ScootersMosRuRouterImpl$onAttach$1(this, ((lzn0) obj).a, null), 1);
    }

    public final void T(qzn0 qzn0Var, ScootersMosRuActionDialogOpenReason scootersMosRuActionDialogOpenReason) {
        ScootersMosRuAnalyticsFromScreen scootersMosRuAnalyticsFromScreen;
        int[] iArr = azn0.a;
        int i = iArr[scootersMosRuActionDialogOpenReason.ordinal()];
        boolean z = true;
        if (i == 1) {
            scootersMosRuAnalyticsFromScreen = null;
        } else if (i == 2) {
            scootersMosRuAnalyticsFromScreen = ScootersMosRuAnalyticsFromScreen.DISCOVERY;
        } else if (i == 3) {
            scootersMosRuAnalyticsFromScreen = ScootersMosRuAnalyticsFromScreen.DISCOVERY;
        } else if (i == 4) {
            scootersMosRuAnalyticsFromScreen = ScootersMosRuAnalyticsFromScreen.OFFER;
        } else {
            if (i != 5) {
                w511.b();
                return;
            }
            scootersMosRuAnalyticsFromScreen = ScootersMosRuAnalyticsFromScreen.FINISH;
        }
        int i2 = iArr[scootersMosRuActionDialogOpenReason.ordinal()];
        this.G.b(new tyn0(scootersMosRuAnalyticsFromScreen, i2 != 1 ? i2 != 3 ? ScootersMosRuAnalyticsEvent$ModalOpened$OpenReason.DEFAULT : ScootersMosRuAnalyticsEvent$ModalOpened$OpenReason.SHORTCUT : ScootersMosRuAnalyticsEvent$ModalOpened$OpenReason.STATE_BAR));
        m950 m950Var = (m950) this.H.get();
        e0o0 e0o0Var = qzn0Var.a;
        String str = e0o0Var.g;
        String str2 = str != null ? str : null;
        gqm0 gqm0Var = str2 != null ? new gqm0(str2) : null;
        String str3 = e0o0Var.f;
        FormattedText formattedText = e0o0Var.a;
        FormattedText formattedText2 = e0o0Var.b;
        FormattedText formattedText3 = e0o0Var.c;
        if (str != null && str.length() != 0) {
            z = false;
        }
        boolean z2 = z;
        e0o0 e0o0Var2 = qzn0Var.a;
        s6k0 s6k0Var = e0o0Var2.d;
        xpm0 xpm0Var = new xpm0((FormattedText) s6k0Var.a, (FormattedText) s6k0Var.b);
        s6k0 s6k0Var2 = e0o0Var2.e;
        A(m950Var, new iqm0(gqm0Var, str3, formattedText, formattedText2, formattedText3, z2, xpm0Var, s6k0Var2 != null ? new xpm0((FormattedText) s6k0Var2.a, (FormattedText) s6k0Var2.b) : null), new ozn0(this, qzn0Var));
    }
}
