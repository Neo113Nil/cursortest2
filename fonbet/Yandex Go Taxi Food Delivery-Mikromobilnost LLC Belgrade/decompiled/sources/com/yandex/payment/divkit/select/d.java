package com.yandex.payment.divkit.select;

import com.yandex.payment.sdk.core.data.PaymentKitError;
import defpackage.aeq0;
import defpackage.aia0;
import defpackage.aq4;
import defpackage.asw;
import defpackage.boj0;
import defpackage.bt5;
import defpackage.cq4;
import defpackage.ds31;
import defpackage.eeq0;
import defpackage.hyj0;
import defpackage.jl40;
import defpackage.kyj0;
import defpackage.l15;
import defpackage.md51;
import defpackage.mdh;
import defpackage.nsi0;
import defpackage.qv90;
import defpackage.qyj0;
import defpackage.rwo;
import defpackage.sjh;
import defpackage.sm0;
import defpackage.sv90;
import defpackage.th40;
import defpackage.tje;
import defpackage.tyh0;
import defpackage.ugd0;
import defpackage.uyj;
import defpackage.vfc;
import defpackage.vpr;
import defpackage.vv90;
import defpackage.w511;
import defpackage.wga0;
import defpackage.y22;
import defpackage.ymx;
import defpackage.yp4;
import defpackage.yr31;
import defpackage.yv90;
import defpackage.zp4;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class d implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ yr31 b;

    public /* synthetic */ d(yr31 yr31Var, int i) {
        this.a = i;
        this.b = yr31Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, hyj0] */
    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object k0;
        md51 md51Var;
        wga0 h;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        yr31 yr31Var = this.b;
        switch (i) {
            case 0:
                cq4 cq4Var = (cq4) obj;
                h hVar = (h) yr31Var;
                if (!jl40.l(cq4Var, zp4.a)) {
                    if (!jl40.l(cq4Var, aq4.a)) {
                        if (!jl40.l(cq4Var, yp4.b)) {
                            if (!jl40.l(cq4Var, yp4.d)) {
                                if (!jl40.l(cq4Var, yp4.a)) {
                                    if (!jl40.l(cq4Var, yp4.c)) {
                                        jl40.l(cq4Var, yp4.e);
                                        break;
                                    } else {
                                        rwo rwoVar = hVar.c;
                                        qv90.a.getClass();
                                        ((y22) rwoVar).a(sv90.T());
                                        break;
                                    }
                                } else {
                                    rwo rwoVar2 = hVar.c;
                                    qv90.a.getClass();
                                    ((y22) rwoVar2).a(sv90.P());
                                    break;
                                }
                            } else {
                                rwo rwoVar3 = hVar.c;
                                qv90.a.getClass();
                                ((y22) rwoVar3).a(sv90.U());
                                break;
                            }
                        } else {
                            rwo rwoVar4 = hVar.c;
                            qv90.a.getClass();
                            ((y22) rwoVar4).a(sv90.Q());
                            break;
                        }
                    } else {
                        rwo rwoVar5 = hVar.c;
                        qv90.a.getClass();
                        ((y22) rwoVar5).a(sv90.S());
                        sjh sjhVar = uyj.a;
                        k0 = tje.k0(mdh.b, new DKSelectViewModel$startPlusCardTopUpSyncing$2(hVar, null), continuation);
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (k0 != coroutineSingletons) {
                            k0 = zy11Var;
                        }
                        if (k0 != coroutineSingletons) {
                        }
                    }
                } else {
                    rwo rwoVar6 = hVar.c;
                    qv90.a.getClass();
                    ((y22) rwoVar6).a(sv90.R());
                    k0 = hVar.S.emit(new aeq0(tyh0.paymentsdk_error, tyh0.paymentsdk_error_top_up), continuation);
                    if (k0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    }
                }
                break;
            default:
                qyj0 qyj0Var = (qyj0) obj;
                n nVar = (n) yr31Var;
                if (qyj0Var instanceof hyj0) {
                    PaymentKitError paymentKitError = ((hyj0) qyj0Var).a;
                    nsi0 nsi0Var = nVar.y;
                    nsi0Var.getClass();
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    ref$ObjectRef.element = new hyj0(paymentKitError);
                    if (paymentKitError.getKind6_6_0() == PaymentKitError.Kind6_6_0.payment_failed_but_new_attempt_allowed) {
                        ((y22) nsi0Var.b).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Платеж завершился с ошибкой, но разрешена новая попытка", "payment_failed_but_new_attempt_allowed"));
                        vv90 vv90Var = nsi0Var.a;
                        asw aswVar = vv90Var instanceof asw ? (asw) vv90Var : null;
                        if (aswVar != null) {
                            boj0 boj0Var = ((yv90) aswVar).i;
                            if (boj0Var == null || (h = boj0Var.h()) == null) {
                                md51Var = null;
                            } else {
                                aia0 aia0Var = h.b;
                                bt5 bt5Var = aia0Var.a;
                                md51Var = ymx.j(bt5Var.c, new l15(bt5Var, aia0Var.f, aia0Var.e, true, 1), null, 5);
                                aia0Var.g = md51Var;
                            }
                            if (md51Var != null) {
                                md51 l = ymx.l((ymx) md51Var, new ugd0(25, nsi0Var, ref$ObjectRef), null, 5);
                                if (l != null) {
                                    l.b(new th40(23, nsi0Var, ref$ObjectRef, paymentKitError));
                                }
                            }
                        }
                    }
                    qyj0 qyj0Var2 = (qyj0) ref$ObjectRef.element;
                    if (qyj0Var2 instanceof hyj0) {
                        r0 r0Var = nVar.J;
                        eeq0 eeq0Var = new eeq0(paymentKitError);
                        r0Var.getClass();
                        r0Var.m(null, eeq0Var);
                        break;
                    } else if (qyj0Var2 instanceof kyj0) {
                        tje.N(ds31.a(nVar), null, null, new DKSelectViewModelRefactor$proceedError$1(nVar, qyj0Var2, null), 3);
                        break;
                    } else {
                        w511.b();
                    }
                } else if (qyj0Var instanceof kyj0) {
                    n.Y(nVar, (sm0) ((kyj0) qyj0Var).a);
                    break;
                } else {
                    w511.b();
                }
                break;
        }
        return zy11Var;
    }
}
