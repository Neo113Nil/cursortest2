package com.yandex.go.agreement.router;

import com.yandex.go.agreement.router.c;
import com.yandex.go.agreement.router.d;
import com.yandex.go.top_modal.api.priority.PopupPriorityLauncher$PopupType;
import defpackage.bae0;
import defpackage.bd;
import defpackage.bl1;
import defpackage.dae0;
import defpackage.dd;
import defpackage.h3y;
import defpackage.h55;
import defpackage.jj3;
import defpackage.m950;
import defpackage.nk1;
import defpackage.ny61;
import defpackage.oc;
import defpackage.qco;
import defpackage.qk1;
import defpackage.qu;
import defpackage.qzj0;
import defpackage.rk1;
import defpackage.sk1;
import defpackage.sls;
import defpackage.tc;
import defpackage.tje;
import defpackage.tk1;
import defpackage.tls;
import defpackage.tse;
import defpackage.um3;
import defpackage.w511;
import defpackage.w9e0;
import defpackage.x9e0;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;

/* loaded from: classes12.dex */
public final class d extends h55 implements m950 {
    public final tse D;
    public final h3y E;
    public final bae0 F;
    public final com.yandex.go.agreement.domain.b G;
    public final ru.yandex.taxi.sdc.a H;
    public final yvf0 I;
    public final yvf0 J;
    public final yvf0 K;
    public final yvf0 L;
    public final tc M;
    public final yvf0 N;

    public d(tse tseVar, h3y h3yVar, bae0 bae0Var, com.yandex.go.agreement.domain.b bVar, ru.yandex.taxi.sdc.a aVar, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, tc tcVar, yvf0 yvf0Var5) {
        super(null);
        this.D = tseVar;
        this.E = h3yVar;
        this.F = bae0Var;
        this.G = bVar;
        this.H = aVar;
        this.I = yvf0Var;
        this.J = yvf0Var2;
        this.K = yvf0Var3;
        this.L = yvf0Var4;
        this.M = tcVar;
        this.N = yvf0Var5;
    }

    public static final void P(final d dVar, final String str) {
        if (str != null) {
            ((jj3) dVar.L.get()).c(new um3(Events$Zalogin$LoginContext.AGREEMENT, new qzj0(null, new tls() { // from class: com.yandex.go.agreement.router.b
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    boolean z = ((Result) obj).getValue() instanceof Result.Failure;
                    d dVar2 = d.this;
                    if (z) {
                        dVar2.r(new qu(9));
                    } else {
                        tje.N(dVar2.o(), null, null, new AgreementRouterImpl$showWebView$1(dVar2, str, null), 3);
                    }
                    return zy11.a;
                }
            }), false, false, 28));
        } else {
            dVar.getClass();
            dVar.r(new qu(9));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(d dVar, bd bdVar, ContinuationImpl continuationImpl) {
        AgreementRouterImpl$showEulaAgreement$1 agreementRouterImpl$showEulaAgreement$1;
        int i;
        qco qcoVar;
        dVar.getClass();
        if (continuationImpl instanceof AgreementRouterImpl$showEulaAgreement$1) {
            agreementRouterImpl$showEulaAgreement$1 = (AgreementRouterImpl$showEulaAgreement$1) continuationImpl;
            int i2 = agreementRouterImpl$showEulaAgreement$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                agreementRouterImpl$showEulaAgreement$1.label = i2 - Integer.MIN_VALUE;
                Object obj = agreementRouterImpl$showEulaAgreement$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = agreementRouterImpl$showEulaAgreement$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.sdc.a aVar = dVar.H;
                    agreementRouterImpl$showEulaAgreement$1.L$0 = bdVar;
                    agreementRouterImpl$showEulaAgreement$1.label = 1;
                    obj = aVar.a(bdVar, agreementRouterImpl$showEulaAgreement$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bdVar = (bd) agreementRouterImpl$showEulaAgreement$1.L$0;
                    kotlin.b.b(obj);
                }
                qcoVar = (qco) obj;
                zy11 zy11Var = zy11.a;
                if (qcoVar != null) {
                    dVar.r(new qu(9));
                    return zy11Var;
                }
                dVar.D((m950) dVar.M.get(), new oc(bdVar, qcoVar), new bl1(dVar));
                return zy11Var;
            }
        }
        agreementRouterImpl$showEulaAgreement$1 = new AgreementRouterImpl$showEulaAgreement$1(dVar, continuationImpl);
        Object obj2 = agreementRouterImpl$showEulaAgreement$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = agreementRouterImpl$showEulaAgreement$1.label;
        if (i != 0) {
        }
        qcoVar = (qco) obj2;
        zy11 zy11Var2 = zy11.a;
        if (qcoVar != null) {
        }
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        PopupPriorityLauncher$PopupType popupPriorityLauncher$PopupType;
        String name;
        tk1 tk1Var = (tk1) obj;
        dd a = tk1Var.a();
        if (a == null || (name = a.a()) == null) {
            if (tk1Var instanceof rk1) {
                popupPriorityLauncher$PopupType = PopupPriorityLauncher$PopupType.GDPR;
            } else if ((tk1Var instanceof nk1) || (tk1Var instanceof sk1)) {
                popupPriorityLauncher$PopupType = PopupPriorityLauncher$PopupType.EULA;
            } else {
                if (!(tk1Var instanceof qk1)) {
                    w511.b();
                    return;
                }
                popupPriorityLauncher$PopupType = PopupPriorityLauncher$PopupType.LocationPermissionAgreement;
            }
            name = popupPriorityLauncher$PopupType.name();
        }
        ((dae0) this.F).d(name);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        String str;
        final tk1 tk1Var = (tk1) obj;
        if (tk1Var instanceof qk1) {
            bd a = ((qk1) tk1Var).a();
            if (a == null || (str = a.a) == null) {
                str = "LocationPermissionAgreement";
            }
            String str2 = str;
            final int i = 0;
            bae0.a(this.F, str2, PopupPriorityLauncher$PopupType.LocationPermissionAgreement, w9e0.b, null, new sls(this) { // from class: al1
                public final /* synthetic */ d b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    Object obj2;
                    int i2 = i;
                    int i3 = 0;
                    zy11 zy11Var = zy11.a;
                    tk1 tk1Var2 = tk1Var;
                    d dVar = this.b;
                    switch (i2) {
                        case 0:
                            qk1 qk1Var = (qk1) tk1Var2;
                            m950 m950Var = (m950) dVar.I.get();
                            if (!(qk1Var instanceof ok1)) {
                                if (!(qk1Var instanceof pk1)) {
                                    w511.b();
                                    break;
                                } else {
                                    obj2 = baz.a;
                                }
                            } else {
                                obj2 = new aaz(((ok1) qk1Var).a, false);
                            }
                            dVar.D(m950Var, obj2, new c(dVar));
                            break;
                        case 1:
                            dVar.A((m950) dVar.K.get(), ((rk1) tk1Var2).a, new cl1(dVar));
                            break;
                        default:
                            dVar.D((m950) dVar.J.get(), new u101(((sk1) tk1Var2).a), new dl1(i3, dVar));
                            break;
                    }
                    return zy11Var;
                }
            }, 24);
            return;
        }
        boolean z = tk1Var instanceof rk1;
        x9e0 x9e0Var = x9e0.b;
        if (z) {
            final int i2 = 1;
            bae0.a(this.F, ((rk1) tk1Var).a.a, PopupPriorityLauncher$PopupType.GDPR, x9e0Var, null, new sls(this) { // from class: al1
                public final /* synthetic */ d b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    Object obj2;
                    int i22 = i2;
                    int i3 = 0;
                    zy11 zy11Var = zy11.a;
                    tk1 tk1Var2 = tk1Var;
                    d dVar = this.b;
                    switch (i22) {
                        case 0:
                            qk1 qk1Var = (qk1) tk1Var2;
                            m950 m950Var = (m950) dVar.I.get();
                            if (!(qk1Var instanceof ok1)) {
                                if (!(qk1Var instanceof pk1)) {
                                    w511.b();
                                    break;
                                } else {
                                    obj2 = baz.a;
                                }
                            } else {
                                obj2 = new aaz(((ok1) qk1Var).a, false);
                            }
                            dVar.D(m950Var, obj2, new c(dVar));
                            break;
                        case 1:
                            dVar.A((m950) dVar.K.get(), ((rk1) tk1Var2).a, new cl1(dVar));
                            break;
                        default:
                            dVar.D((m950) dVar.J.get(), new u101(((sk1) tk1Var2).a), new dl1(i3, dVar));
                            break;
                    }
                    return zy11Var;
                }
            }, 24);
        } else if (tk1Var instanceof nk1) {
            bae0.a(this.F, ((nk1) tk1Var).a.a, PopupPriorityLauncher$PopupType.EULA, x9e0Var, null, new sls() { // from class: com.yandex.go.agreement.router.a
                @Override // defpackage.sls
                public final Object invoke() {
                    d dVar = d.this;
                    com.yandex.go.coroutines.b.g(dVar.o(), null, null, new AgreementRouterImpl$showAgreement$3$1(dVar, tk1Var, null), 3);
                    return zy11.a;
                }
            }, 24);
        } else if (!(tk1Var instanceof sk1)) {
            w511.b();
        } else {
            final int i3 = 2;
            bae0.a(this.F, ((sk1) tk1Var).a.a, PopupPriorityLauncher$PopupType.EULA, x9e0Var, null, new sls(this) { // from class: al1
                public final /* synthetic */ d b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    Object obj2;
                    int i22 = i3;
                    int i32 = 0;
                    zy11 zy11Var = zy11.a;
                    tk1 tk1Var2 = tk1Var;
                    d dVar = this.b;
                    switch (i22) {
                        case 0:
                            qk1 qk1Var = (qk1) tk1Var2;
                            m950 m950Var = (m950) dVar.I.get();
                            if (!(qk1Var instanceof ok1)) {
                                if (!(qk1Var instanceof pk1)) {
                                    w511.b();
                                    break;
                                } else {
                                    obj2 = baz.a;
                                }
                            } else {
                                obj2 = new aaz(((ok1) qk1Var).a, false);
                            }
                            dVar.D(m950Var, obj2, new c(dVar));
                            break;
                        case 1:
                            dVar.A((m950) dVar.K.get(), ((rk1) tk1Var2).a, new cl1(dVar));
                            break;
                        default:
                            dVar.D((m950) dVar.J.get(), new u101(((sk1) tk1Var2).a), new dl1(i32, dVar));
                            break;
                    }
                    return zy11Var;
                }
            }, 24);
        }
    }
}
