package defpackage;

import ru.rt.ebs.cryptosdk.core.logging.EbsLogger;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.BioCollectionType;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.BioSampleType;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.exceptions.AccessDeniedEsiaVerificationEbsException;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.exceptions.IllegalStateVerificationFlowEbsException;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.flows.a;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.Event;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.VerificationRequestScheme;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.d;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.e;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.g;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.h;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.i;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.j;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.k;

/* loaded from: classes4.dex */
public final class a7p extends a {
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a7p(eg01 eg01Var, int i) {
        super(eg01Var);
        this.h = i;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.flows.a
    public final void c(Exception exc) {
        z3v z3vVar;
        z3v z3vVar2;
        int i = this.h;
        eg01 eg01Var = this.a;
        switch (i) {
            case 0:
                if (sa91.d(exc)) {
                    z3v z3vVar3 = this.f;
                    if (z3vVar3 != null) {
                        ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar3).a();
                    }
                    try {
                        z3v createState = eg01Var.createState(qoi0.a(k731.class), this);
                        this.f = createState;
                        ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState).l(exc);
                        break;
                    } catch (Exception e) {
                        s2a1.a(EbsLogger.INSTANCE, e, e, this);
                        return;
                    }
                } else if (vob1.b(exc) && (z3vVar2 = this.f) != null && ((z3vVar2 instanceof gbo) || (z3vVar2 instanceof d))) {
                    ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar2).a();
                    try {
                        z3v createState2 = eg01Var.createState(qoi0.a(fbo.class), this);
                        this.f = createState2;
                        ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState2).l(exc);
                        break;
                    } catch (Exception e2) {
                        s2a1.a(EbsLogger.INSTANCE, e2, e2, this);
                        return;
                    }
                } else if (vob1.b(exc) && (z3vVar = this.f) != null && ((z3vVar instanceof yvo) || (z3vVar instanceof e))) {
                    ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
                    try {
                        z3v createState3 = eg01Var.createState(qoi0.a(xvo.class), this);
                        this.f = createState3;
                        ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState3).l(exc);
                        break;
                    } catch (Exception e3) {
                        s2a1.a(EbsLogger.INSTANCE, e3, e3, this);
                        return;
                    }
                } else if (!(this.f instanceof qc21) || !sa91.c(exc)) {
                    if (!vob1.b(exc)) {
                        z3v z3vVar4 = this.f;
                        if (z3vVar4 instanceof qc21) {
                            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar4).a();
                            try {
                                z3v createState4 = eg01Var.createState(qoi0.a(pc21.class), this);
                                this.f = createState4;
                                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState4).l(exc);
                                break;
                            } catch (Exception e4) {
                                s2a1.a(EbsLogger.INSTANCE, e4, e4, this);
                                return;
                            }
                        }
                    }
                    super.c(exc);
                    break;
                } else {
                    z3v z3vVar5 = this.f;
                    if (z3vVar5 != null) {
                        ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar5).a();
                    }
                    try {
                        z3v createState5 = eg01Var.createState(qoi0.a(u8p.class), this);
                        this.f = createState5;
                        ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState5).l(exc);
                        break;
                    } catch (Exception e5) {
                        s2a1.a(EbsLogger.INSTANCE, e5, e5, this);
                        return;
                    }
                }
                break;
            default:
                boolean d = sa91.d(exc);
                z3v z3vVar6 = this.f;
                if (!d) {
                    if (!(z3vVar6 instanceof ad21) && (!(z3vVar6 instanceof qc21) || !sa91.c(exc))) {
                        if (!vob1.b(exc)) {
                            z3v z3vVar7 = this.f;
                            if (z3vVar7 instanceof ad21) {
                                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar7).a();
                                try {
                                    z3v createState6 = eg01Var.createState(qoi0.a(pc21.class), this);
                                    this.f = createState6;
                                    ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState6).l(exc);
                                    break;
                                } catch (Exception e6) {
                                    EbsLogger.INSTANCE.error(e6);
                                    emit(new Event.Error(e6));
                                    return;
                                }
                            }
                        }
                        super.c(exc);
                        break;
                    } else {
                        z3v z3vVar8 = this.f;
                        if (z3vVar8 != null) {
                            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar8).a();
                        }
                        try {
                            z3v createState7 = eg01Var.createState(qoi0.a(u8p.class), this);
                            this.f = createState7;
                            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState7).l(exc);
                            break;
                        } catch (Exception e7) {
                            EbsLogger.INSTANCE.error(e7);
                            emit(new Event.Error(e7));
                        }
                    }
                } else {
                    if (z3vVar6 != null) {
                        ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar6).a();
                    }
                    try {
                        z3v createState8 = eg01Var.createState(qoi0.a(k731.class), this);
                        this.f = createState8;
                        ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState8).l(exc);
                        break;
                    } catch (Exception e8) {
                        EbsLogger.INSTANCE.error(e8);
                        emit(new Event.Error(e8));
                        return;
                    }
                }
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.flows.a
    public final void d(Object obj) {
        VerificationRequestScheme.WithoutEsia withoutEsia;
        BioSampleType bioSampleType;
        BioCollectionType bioCollectionType;
        BioSampleType bioSampleType2;
        BioCollectionType bioCollectionType2;
        BioSampleType bioSampleType3;
        BioCollectionType bioCollectionType3;
        int i = this.h;
        eg01 eg01Var = this.a;
        switch (i) {
            case 0:
                z3v z3vVar = this.f;
                if (!(z3vVar instanceof bxy)) {
                    if (!(z3vVar instanceof z0u0)) {
                        if (!(z3vVar instanceof gbo)) {
                            if (!(z3vVar instanceof d)) {
                                if (!(z3vVar instanceof g)) {
                                    if (!(z3vVar instanceof dvv)) {
                                        if (!(z3vVar instanceof iz5)) {
                                            if (!(z3vVar instanceof i)) {
                                                if (!(z3vVar instanceof qc21)) {
                                                    if (!(z3vVar instanceof k)) {
                                                        if (!(z3vVar instanceof u8p)) {
                                                            if (!(z3vVar instanceof j)) {
                                                                if (!(z3vVar instanceof d2k0)) {
                                                                    if (!(z3vVar instanceof a1u0)) {
                                                                        if (!(z3vVar instanceof yvo)) {
                                                                            if (!(z3vVar instanceof e)) {
                                                                                if (!(z3vVar instanceof n9e)) {
                                                                                    if (!(z3vVar instanceof fbo)) {
                                                                                        if (!(z3vVar instanceof xvo)) {
                                                                                            super.d(obj);
                                                                                            break;
                                                                                        } else {
                                                                                            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
                                                                                            try {
                                                                                                z3v createState = eg01Var.createState(qoi0.a(yvo.class), this);
                                                                                                this.f = createState;
                                                                                                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState).l(obj);
                                                                                                break;
                                                                                            } catch (Exception e) {
                                                                                                s2a1.a(EbsLogger.INSTANCE, e, e, this);
                                                                                                return;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
                                                                                        try {
                                                                                            z3v createState2 = eg01Var.createState(qoi0.a(gbo.class), this);
                                                                                            this.f = createState2;
                                                                                            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState2).l(obj);
                                                                                            break;
                                                                                        } catch (Exception e2) {
                                                                                            s2a1.a(EbsLogger.INSTANCE, e2, e2, this);
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
                                                                                    try {
                                                                                        z3v createState3 = eg01Var.createState(qoi0.a(o6f0.class), this);
                                                                                        this.f = createState3;
                                                                                        ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState3).l(obj);
                                                                                        break;
                                                                                    } catch (Exception e3) {
                                                                                        s2a1.a(EbsLogger.INSTANCE, e3, e3, this);
                                                                                        return;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
                                                                                try {
                                                                                    z3v createState4 = eg01Var.createState(qoi0.a(n9e.class), this);
                                                                                    this.f = createState4;
                                                                                    ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState4).l(obj);
                                                                                    break;
                                                                                } catch (Exception e4) {
                                                                                    s2a1.a(EbsLogger.INSTANCE, e4, e4, this);
                                                                                    return;
                                                                                }
                                                                            }
                                                                        } else if (obj instanceof AccessDeniedEsiaVerificationEbsException) {
                                                                            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
                                                                            try {
                                                                                z3v createState5 = eg01Var.createState(qoi0.a(uao.class), this);
                                                                                this.f = createState5;
                                                                                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState5).l(obj);
                                                                                break;
                                                                            } catch (Exception e5) {
                                                                                s2a1.a(EbsLogger.INSTANCE, e5, e5, this);
                                                                                return;
                                                                            }
                                                                        } else {
                                                                            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
                                                                            try {
                                                                                z3v createState6 = eg01Var.createState(qoi0.a(e.class), this);
                                                                                this.f = createState6;
                                                                                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState6).l(obj);
                                                                                break;
                                                                            } catch (Exception e6) {
                                                                                s2a1.a(EbsLogger.INSTANCE, e6, e6, this);
                                                                                return;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
                                                                        try {
                                                                            z3v createState7 = eg01Var.createState(qoi0.a(yvo.class), this);
                                                                            this.f = createState7;
                                                                            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState7).l(obj);
                                                                            break;
                                                                        } catch (Exception e7) {
                                                                            s2a1.a(EbsLogger.INSTANCE, e7, e7, this);
                                                                            return;
                                                                        }
                                                                    }
                                                                } else {
                                                                    ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
                                                                    try {
                                                                        z3v createState8 = eg01Var.createState(qoi0.a(i.class), this);
                                                                        this.f = createState8;
                                                                        ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState8).l(obj);
                                                                        break;
                                                                    } catch (Exception e8) {
                                                                        s2a1.a(EbsLogger.INSTANCE, e8, e8, this);
                                                                        return;
                                                                    }
                                                                }
                                                            } else {
                                                                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
                                                                try {
                                                                    z3v createState9 = eg01Var.createState(qoi0.a(d2k0.class), this);
                                                                    this.f = createState9;
                                                                    ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState9).l(obj);
                                                                    break;
                                                                } catch (Exception e9) {
                                                                    s2a1.a(EbsLogger.INSTANCE, e9, e9, this);
                                                                    return;
                                                                }
                                                            }
                                                        } else {
                                                            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
                                                            try {
                                                                z3v createState10 = eg01Var.createState(qoi0.a(j.class), this);
                                                                this.f = createState10;
                                                                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState10).l(obj);
                                                                break;
                                                            } catch (Exception e10) {
                                                                s2a1.a(EbsLogger.INSTANCE, e10, e10, this);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
                                                        try {
                                                            z3v createState11 = eg01Var.createState(qoi0.a(a1u0.class), this);
                                                            this.f = createState11;
                                                            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState11).l(obj);
                                                            break;
                                                        } catch (Exception e11) {
                                                            s2a1.a(EbsLogger.INSTANCE, e11, e11, this);
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
                                                    try {
                                                        z3v createState12 = eg01Var.createState(qoi0.a(k.class), this);
                                                        this.f = createState12;
                                                        ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState12).l(obj);
                                                        break;
                                                    } catch (Exception e12) {
                                                        s2a1.a(EbsLogger.INSTANCE, e12, e12, this);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
                                                try {
                                                    z3v createState13 = eg01Var.createState(qoi0.a(qc21.class), this);
                                                    this.f = createState13;
                                                    ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState13).l(obj);
                                                    break;
                                                } catch (Exception e13) {
                                                    s2a1.a(EbsLogger.INSTANCE, e13, e13, this);
                                                    return;
                                                }
                                            }
                                        } else {
                                            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
                                            try {
                                                z3v createState14 = eg01Var.createState(qoi0.a(i.class), this);
                                                this.f = createState14;
                                                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState14).l(obj);
                                                break;
                                            } catch (Exception e14) {
                                                s2a1.a(EbsLogger.INSTANCE, e14, e14, this);
                                                return;
                                            }
                                        }
                                    } else {
                                        ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
                                        try {
                                            z3v createState15 = eg01Var.createState(qoi0.a(iz5.class), this);
                                            this.f = createState15;
                                            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState15).l(obj);
                                            break;
                                        } catch (Exception e15) {
                                            s2a1.a(EbsLogger.INSTANCE, e15, e15, this);
                                            return;
                                        }
                                    }
                                } else {
                                    ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
                                    try {
                                        z3v createState16 = eg01Var.createState(qoi0.a(dvv.class), this);
                                        this.f = createState16;
                                        ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState16).l(obj);
                                        break;
                                    } catch (Exception e16) {
                                        s2a1.a(EbsLogger.INSTANCE, e16, e16, this);
                                        return;
                                    }
                                }
                            } else {
                                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
                                try {
                                    z3v createState17 = eg01Var.createState(qoi0.a(g.class), this);
                                    this.f = createState17;
                                    ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState17).l(obj);
                                    break;
                                } catch (Exception e17) {
                                    s2a1.a(EbsLogger.INSTANCE, e17, e17, this);
                                    return;
                                }
                            }
                        } else if (obj instanceof AccessDeniedEsiaVerificationEbsException) {
                            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
                            try {
                                z3v createState18 = eg01Var.createState(qoi0.a(uao.class), this);
                                this.f = createState18;
                                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState18).l(obj);
                                break;
                            } catch (Exception e18) {
                                s2a1.a(EbsLogger.INSTANCE, e18, e18, this);
                                return;
                            }
                        } else {
                            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
                            try {
                                z3v createState19 = eg01Var.createState(qoi0.a(d.class), this);
                                this.f = createState19;
                                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState19).l(obj);
                                break;
                            } catch (Exception e19) {
                                s2a1.a(EbsLogger.INSTANCE, e19, e19, this);
                                return;
                            }
                        }
                    } else {
                        ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
                        try {
                            z3v createState20 = eg01Var.createState(qoi0.a(gbo.class), this);
                            this.f = createState20;
                            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState20).l(obj);
                            break;
                        } catch (Exception e20) {
                            s2a1.a(EbsLogger.INSTANCE, e20, e20, this);
                            return;
                        }
                    }
                } else {
                    ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
                    try {
                        z3v createState21 = eg01Var.createState(qoi0.a(z0u0.class), this);
                        this.f = createState21;
                        ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState21).l(obj);
                        break;
                    } catch (Exception e21) {
                        s2a1.a(EbsLogger.INSTANCE, e21, e21, this);
                        return;
                    }
                }
            default:
                z3v z3vVar2 = this.f;
                if (!(z3vVar2 instanceof bxy)) {
                    if (!(z3vVar2 instanceof g)) {
                        if (!(z3vVar2 instanceof dvv)) {
                            if (!(z3vVar2 instanceof iz5)) {
                                if (!(z3vVar2 instanceof h)) {
                                    if (!(z3vVar2 instanceof ad21)) {
                                        if (!(z3vVar2 instanceof i)) {
                                            if (!(z3vVar2 instanceof qc21)) {
                                                if (!(z3vVar2 instanceof mar)) {
                                                    if (!(z3vVar2 instanceof n9e)) {
                                                        if (!(z3vVar2 instanceof k)) {
                                                            if (!(z3vVar2 instanceof u8p)) {
                                                                if (!(z3vVar2 instanceof j)) {
                                                                    if (!(z3vVar2 instanceof d2k0)) {
                                                                        super.d(obj);
                                                                        break;
                                                                    } else {
                                                                        VerificationRequestScheme verificationRequestScheme = ((d2k0) z3vVar2).g.getVerificationRequestScheme();
                                                                        withoutEsia = verificationRequestScheme instanceof VerificationRequestScheme.WithoutEsia ? (VerificationRequestScheme.WithoutEsia) verificationRequestScheme : null;
                                                                        if (withoutEsia == null || (bioCollectionType = withoutEsia.getBioCollectionType()) == null || (bioSampleType = bioCollectionType.getBioSampleType()) == null) {
                                                                            bioSampleType = BioSampleType.VIDEO;
                                                                        }
                                                                        e(bioSampleType, obj);
                                                                        break;
                                                                    }
                                                                } else {
                                                                    j jVar = (j) z3vVar2;
                                                                    if (jVar.m() != BioSampleType.VIDEO) {
                                                                        e(jVar.m(), obj);
                                                                        break;
                                                                    } else {
                                                                        z3v z3vVar3 = this.f;
                                                                        if (z3vVar3 != null) {
                                                                            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar3).a();
                                                                        }
                                                                        try {
                                                                            z3v createState22 = eg01Var.createState(qoi0.a(d2k0.class), this);
                                                                            this.f = createState22;
                                                                            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState22).l(obj);
                                                                            break;
                                                                        } catch (Exception e22) {
                                                                            EbsLogger.INSTANCE.error(e22);
                                                                            emit(new Event.Error(e22));
                                                                            return;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar2).a();
                                                                try {
                                                                    z3v createState23 = eg01Var.createState(qoi0.a(j.class), this);
                                                                    this.f = createState23;
                                                                    ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState23).l(obj);
                                                                    break;
                                                                } catch (Exception e23) {
                                                                    EbsLogger.INSTANCE.error(e23);
                                                                    emit(new Event.Error(e23));
                                                                    return;
                                                                }
                                                            }
                                                        } else {
                                                            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar2).a();
                                                            try {
                                                                z3v createState24 = eg01Var.createState(qoi0.a(o6f0.class), this);
                                                                this.f = createState24;
                                                                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState24).l(obj);
                                                                break;
                                                            } catch (Exception e24) {
                                                                EbsLogger.INSTANCE.error(e24);
                                                                emit(new Event.Error(e24));
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar2).a();
                                                        try {
                                                            z3v createState25 = eg01Var.createState(qoi0.a(k.class), this);
                                                            this.f = createState25;
                                                            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState25).l(obj);
                                                            break;
                                                        } catch (Exception e25) {
                                                            EbsLogger.INSTANCE.error(e25);
                                                            emit(new Event.Error(e25));
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar2).a();
                                                    try {
                                                        z3v createState26 = eg01Var.createState(qoi0.a(n9e.class), this);
                                                        this.f = createState26;
                                                        ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState26).l(obj);
                                                        break;
                                                    } catch (Exception e26) {
                                                        EbsLogger.INSTANCE.error(e26);
                                                        emit(new Event.Error(e26));
                                                        return;
                                                    }
                                                }
                                            } else {
                                                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar2).a();
                                                try {
                                                    z3v createState27 = eg01Var.createState(qoi0.a(mar.class), this);
                                                    this.f = createState27;
                                                    ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState27).l(obj);
                                                    break;
                                                } catch (Exception e27) {
                                                    EbsLogger.INSTANCE.error(e27);
                                                    emit(new Event.Error(e27));
                                                    return;
                                                }
                                            }
                                        } else {
                                            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar2).a();
                                            try {
                                                z3v createState28 = eg01Var.createState(qoi0.a(qc21.class), this);
                                                this.f = createState28;
                                                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState28).l(obj);
                                                break;
                                            } catch (Exception e28) {
                                                EbsLogger.INSTANCE.error(e28);
                                                emit(new Event.Error(e28));
                                                return;
                                            }
                                        }
                                    } else {
                                        ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar2).a();
                                        try {
                                            z3v createState29 = eg01Var.createState(qoi0.a(mar.class), this);
                                            this.f = createState29;
                                            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState29).l(obj);
                                            break;
                                        } catch (Exception e29) {
                                            EbsLogger.INSTANCE.error(e29);
                                            emit(new Event.Error(e29));
                                            return;
                                        }
                                    }
                                } else {
                                    ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar2).a();
                                    try {
                                        z3v createState30 = eg01Var.createState(qoi0.a(ad21.class), this);
                                        this.f = createState30;
                                        ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState30).l(obj);
                                        break;
                                    } catch (Exception e30) {
                                        EbsLogger.INSTANCE.error(e30);
                                        emit(new Event.Error(e30));
                                        return;
                                    }
                                }
                            } else {
                                VerificationRequestScheme verificationRequestScheme2 = ((iz5) z3vVar2).f.getVerificationRequestScheme();
                                withoutEsia = verificationRequestScheme2 instanceof VerificationRequestScheme.WithoutEsia ? (VerificationRequestScheme.WithoutEsia) verificationRequestScheme2 : null;
                                if (withoutEsia == null || (bioCollectionType2 = withoutEsia.getBioCollectionType()) == null || (bioSampleType2 = bioCollectionType2.getBioSampleType()) == null) {
                                    bioSampleType2 = BioSampleType.VIDEO;
                                }
                                e(bioSampleType2, obj);
                                break;
                            }
                        } else {
                            ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar2).a();
                            try {
                                z3v createState31 = eg01Var.createState(qoi0.a(iz5.class), this);
                                this.f = createState31;
                                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState31).l(obj);
                                break;
                            } catch (Exception e31) {
                                EbsLogger.INSTANCE.error(e31);
                                emit(new Event.Error(e31));
                                return;
                            }
                        }
                    } else {
                        VerificationRequestScheme verificationRequestScheme3 = ((g) z3vVar2).g.getVerificationRequestScheme();
                        withoutEsia = verificationRequestScheme3 instanceof VerificationRequestScheme.WithoutEsia ? (VerificationRequestScheme.WithoutEsia) verificationRequestScheme3 : null;
                        if (withoutEsia == null || (bioCollectionType3 = withoutEsia.getBioCollectionType()) == null || (bioSampleType3 = bioCollectionType3.getBioSampleType()) == null) {
                            bioSampleType3 = BioSampleType.VIDEO;
                        }
                        BioSampleType bioSampleType4 = BioSampleType.VIDEO;
                        z3v z3vVar4 = this.f;
                        if (bioSampleType3 == bioSampleType4) {
                            if (z3vVar4 != null) {
                                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar4).a();
                            }
                            try {
                                z3v createState32 = eg01Var.createState(qoi0.a(dvv.class), this);
                                this.f = createState32;
                                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState32).l(obj);
                                break;
                            } catch (Exception e32) {
                                EbsLogger.INSTANCE.error(e32);
                                emit(new Event.Error(e32));
                                return;
                            }
                        } else {
                            if (z3vVar4 != null) {
                                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar4).a();
                            }
                            try {
                                z3v createState33 = eg01Var.createState(qoi0.a(iz5.class), this);
                                this.f = createState33;
                                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState33).l(obj);
                                break;
                            } catch (Exception e33) {
                                EbsLogger.INSTANCE.error(e33);
                                emit(new Event.Error(e33));
                                return;
                            }
                        }
                    }
                } else {
                    ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar2).a();
                    try {
                        z3v createState34 = eg01Var.createState(qoi0.a(g.class), this);
                        this.f = createState34;
                        ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState34).l(obj);
                        break;
                    } catch (Exception e34) {
                        EbsLogger.INSTANCE.error(e34);
                        emit(new Event.Error(e34));
                        return;
                    }
                }
                break;
        }
    }

    public void e(BioSampleType bioSampleType, Object obj) {
        if (bioSampleType != null) {
            int i = m931.a[bioSampleType.ordinal()];
            eg01 eg01Var = this.a;
            if (i == 1) {
                z3v z3vVar = this.f;
                if (z3vVar != null) {
                    ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar).a();
                }
                try {
                    z3v createState = eg01Var.createState(qoi0.a(h.class), this);
                    this.f = createState;
                    ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState).l(obj);
                    return;
                } catch (Exception e) {
                    EbsLogger.INSTANCE.error(e);
                    emit(new Event.Error(e));
                    return;
                }
            }
            if (i != 2) {
                throw new IllegalStateVerificationFlowEbsException("Incorrect bioSampleType");
            }
            z3v z3vVar2 = this.f;
            if (z3vVar2 != null) {
                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) z3vVar2).a();
            }
            try {
                z3v createState2 = eg01Var.createState(qoi0.a(i.class), this);
                this.f = createState2;
                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) createState2).l(obj);
            } catch (Exception e2) {
                EbsLogger.INSTANCE.error(e2);
                emit(new Event.Error(e2));
            }
        }
    }
}
