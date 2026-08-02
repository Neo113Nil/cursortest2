package com.yandex.go.payments.cards.ui;

import com.yandex.go.payments.cards.domain.exception.OnCardAddingErrorException;
import com.yandex.go.payments.cards.domain.exception.SelectCardException;
import com.yandex.go.payments.cards.domain.exception.TooManyRequestsException;
import com.yandex.go.payments.cards.domain.model.PaymentMethodVerificationSession;
import com.yandex.go.payments.cards.verification.confirm.ConfirmCardModalView;
import com.yandex.go.payments.domain.exception.CardExpiredException;
import com.yandex.go.payments.domain.exception.MissingCvnException;
import defpackage.b1a0;
import defpackage.b90;
import defpackage.cda0;
import defpackage.da0;
import defpackage.dcp0;
import defpackage.erw;
import defpackage.evu0;
import defpackage.f3e;
import defpackage.g3e;
import defpackage.g8e;
import defpackage.gyc;
import defpackage.hit;
import defpackage.io9;
import defpackage.j831;
import defpackage.jj8;
import defpackage.m2v;
import defpackage.mp8;
import defpackage.ney;
import defpackage.ny61;
import defpackage.p731;
import defpackage.p88;
import defpackage.pzt0;
import defpackage.q88;
import defpackage.qc5;
import defpackage.qc8;
import defpackage.qf8;
import defpackage.qsj0;
import defpackage.r88;
import defpackage.s88;
import defpackage.tje;
import defpackage.tu5;
import defpackage.tx90;
import defpackage.u32;
import defpackage.v88;
import defpackage.v920;
import defpackage.vqb;
import defpackage.wjh;
import defpackage.xqw;
import defpackage.y931;
import defpackage.z80;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.animation.NavigationDirection;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.payment_options.model.PaymentIconType;
import ru.yandex.taxi.payment_options.model.pci_dss.CardType;
import ru.yandex.taxi.payments.cards.dto.VerificationStatus;

/* loaded from: classes13.dex */
public final class c extends qc5 {
    public final erw A;
    public final com.yandex.go.payments.cards.data.c B;
    public final gyc C;
    public final dcp0 D;
    public final u32 E;
    public final v88 F;
    public final hit G;
    public final com.yandex.go.payments.cards.pci_dss.data.a H;
    public final qsj0 I;
    public final com.yandex.go.payments.cards.experiments.a J;
    public int K;
    public tx90 L;
    public tx90 M;
    public pzt0 N;
    public boolean O;

    public c(erw erwVar, com.yandex.go.payments.cards.data.c cVar, gyc gycVar, dcp0 dcp0Var, ney neyVar, u32 u32Var, v88 v88Var, hit hitVar, com.yandex.go.payments.cards.pci_dss.data.a aVar, qsj0 qsj0Var, com.yandex.go.payments.cards.experiments.a aVar2) {
        super(f3e.class, neyVar);
        this.A = erwVar;
        this.B = cVar;
        this.C = gycVar;
        this.D = dcp0Var;
        this.E = u32Var;
        this.F = v88Var;
        this.G = hitVar;
        this.H = aVar;
        this.I = qsj0Var;
        this.J = aVar2;
        tx90 tx90Var = tx90.b;
        this.L = tx90Var;
        this.M = tx90Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|(1:(1:9)(2:50|51))(2:52|(1:54))|10|(3:36|37|38)(2:13|(1:15)(2:19|(1:21)(2:22|(3:24|(1:26)(1:28)|27)(2:29|(1:31)(2:32|(1:34)(1:35))))))|16|17))|55|6|(0)(0)|10|(0)|36|37|38) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012d, code lost:
    
        ((defpackage.f3e) r7.Dg()).V9();
        r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010b, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010c, code lost:
    
        r9 = ((defpackage.b90) r1).a;
        r8 = r8.getWhen();
        r7 = ((com.yandex.go.payments.cards.verification.confirm.ConfirmCardModalView) r7.C.a).confirmCardNavigator;
        ((defpackage.da0) ((defpackage.io9) r7).a).r(new defpackage.kj8(r8, r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e9, code lost:
    
        r7 = (defpackage.f3e) r7.Dg();
        r8 = ((defpackage.b90) r1).c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f3, code lost:
    
        if (r8 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f5, code lost:
    
        r8 = ru.yandex.taxi.payment_options.model.pci_dss.CardType.UNKNOWN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0103, code lost:
    
        r7.z2(r8.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
    
        r9 = ru.yandex.taxi.payment_options.model.pci_dss.CardType.Companion;
        r8 = r8.a;
        r9.getClass();
        r8 = defpackage.mp8.a(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00db, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dc, code lost:
    
        ((defpackage.f3e) r7.Dg()).i3(r8);
        r7.Qg();
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Mg(c cVar, Throwable th, boolean z, ContinuationImpl continuationImpl) {
        ConfirmCardPresenter$handleBindCardError$1 confirmCardPresenter$handleBindCardError$1;
        Object obj;
        int i;
        CardType a;
        u32 u32Var = cVar.E;
        erw erwVar = cVar.A;
        v88 v88Var = cVar.F;
        if (continuationImpl instanceof ConfirmCardPresenter$handleBindCardError$1) {
            confirmCardPresenter$handleBindCardError$1 = (ConfirmCardPresenter$handleBindCardError$1) continuationImpl;
            int i2 = confirmCardPresenter$handleBindCardError$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                confirmCardPresenter$handleBindCardError$1.label = i2 - Integer.MIN_VALUE;
                obj = confirmCardPresenter$handleBindCardError$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = confirmCardPresenter$handleBindCardError$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ((com.yandex.go.payments.paymentlist.data.c) ((cda0) cVar.B.a.x)).p();
                    confirmCardPresenter$handleBindCardError$1.L$0 = th;
                    confirmCardPresenter$handleBindCardError$1.Z$0 = z;
                    confirmCardPresenter$handleBindCardError$1.label = 1;
                    obj = cVar.J.a(confirmCardPresenter$handleBindCardError$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = confirmCardPresenter$handleBindCardError$1.Z$0;
                    th = (Throwable) confirmCardPresenter$handleBindCardError$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue() || !z) {
                    cVar.O = true;
                    throw th;
                }
                if (th instanceof SelectCardException) {
                    v88Var.a(p88.d);
                    u32Var.b();
                } else if (th instanceof TooManyRequestsException) {
                    v88Var.a(new s88(((TooManyRequestsException) th).getWhen()));
                } else if (th instanceof MissingCvnException) {
                    qc8 qc8Var = ((b90) erwVar).c;
                    if (qc8Var == null) {
                        a = CardType.UNKNOWN;
                    } else {
                        mp8 mp8Var = CardType.Companion;
                        String str = qc8Var.a;
                        mp8Var.getClass();
                        a = mp8.a(str);
                    }
                    v88Var.a(new q88(a.b()));
                } else if (th instanceof OnCardAddingErrorException) {
                    v88Var.a(new r88(((OnCardAddingErrorException) th).getMessage()));
                    cVar.Qg();
                } else if (th instanceof CardExpiredException) {
                    v88Var.a(p88.b);
                    cVar.Qg();
                } else {
                    v88Var.a(p88.a);
                    cVar.Qg();
                }
                return zy11.a;
            }
        }
        confirmCardPresenter$handleBindCardError$1 = new ConfirmCardPresenter$handleBindCardError$1(cVar, continuationImpl);
        obj = confirmCardPresenter$handleBindCardError$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = confirmCardPresenter$handleBindCardError$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        cVar.O = true;
        throw th;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x012c, code lost:
    
        if (r12 == r2) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Ng(c cVar, tu5 tu5Var, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        ConfirmCardPresenter$handleBindCardResult$1 confirmCardPresenter$handleBindCardResult$1;
        Object obj;
        int i;
        String str;
        g3e g3eVar;
        cVar.getClass();
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof ConfirmCardPresenter$handleBindCardResult$1) {
            confirmCardPresenter$handleBindCardResult$1 = (ConfirmCardPresenter$handleBindCardResult$1) continuationImpl;
            int i2 = confirmCardPresenter$handleBindCardResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                confirmCardPresenter$handleBindCardResult$1.label = i2 - Integer.MIN_VALUE;
                obj = confirmCardPresenter$handleBindCardResult$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = confirmCardPresenter$handleBindCardResult$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p731 p731Var = tu5Var.b;
                    VerificationStatus verificationStatus = p731Var.b.c;
                    if (verificationStatus == VerificationStatus.SUCCESS || verificationStatus == VerificationStatus.FAILURE) {
                        confirmCardPresenter$handleBindCardResult$1.L$0 = tu5Var;
                        confirmCardPresenter$handleBindCardResult$1.Z$0 = z;
                        confirmCardPresenter$handleBindCardResult$1.Z$1 = z2;
                        confirmCardPresenter$handleBindCardResult$1.label = 1;
                        obj = cVar.J.a(confirmCardPresenter$handleBindCardResult$1);
                    } else {
                        if (p731Var.a.b == PaymentMethod$Type.SBP_TOKEN) {
                            if (tu5Var.e) {
                                cVar.Pg(tu5Var, z, (f3e) cVar.Dg());
                                return zy11Var;
                            }
                            cVar.E.m(String.format("only random amount expected but %s got", Arrays.copyOf(new Object[]{verificationStatus}, 1)));
                            ((f3e) cVar.Dg()).i3(new IllegalStateException("RandomAmount only available for SbpToken verification"));
                            return zy11Var;
                        }
                        if (!tu5Var.d) {
                            if (!tu5Var.c) {
                                cVar.Pg(tu5Var, z, (f3e) cVar.Dg());
                                return zy11Var;
                            }
                            qsj0 qsj0Var = cVar.I;
                            erw erwVar = cVar.A;
                            qsj0Var.getClass();
                            cVar.M = qsj0.a(erwVar, tu5Var);
                            qc8 qc8Var = ((b90) erwVar).c;
                            if (qc8Var == null) {
                                ((f3e) cVar.Dg()).i3(new IllegalStateException("Missing card data for step cvn"));
                                return zy11Var;
                            }
                            String str2 = qc8Var.d;
                            f3e f3eVar = (f3e) cVar.Dg();
                            String str3 = qc8Var.a;
                            String str4 = qc8Var.c;
                            String str5 = qc8Var.b;
                            if (evu0.J(str5) || evu0.J(str4)) {
                                str = "";
                            } else {
                                if (str4.length() > 2) {
                                    str4 = str4.substring(str4.length() - 2);
                                }
                                str = g8e.p(str5, "/", str4);
                            }
                            PaymentIconType.Companion.getClass();
                            f3eVar.y6(new qf8(str3, str2, str, b1a0.a(str2)));
                            return zy11Var;
                        }
                        confirmCardPresenter$handleBindCardResult$1.L$0 = null;
                        confirmCardPresenter$handleBindCardResult$1.Z$0 = z;
                        confirmCardPresenter$handleBindCardResult$1.Z$1 = z2;
                        confirmCardPresenter$handleBindCardResult$1.label = 2;
                        if (cVar.Og(tu5Var, z2, confirmCardPresenter$handleBindCardResult$1) != obj2) {
                            return zy11Var;
                        }
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                z2 = confirmCardPresenter$handleBindCardResult$1.Z$1;
                tu5Var = (tu5) confirmCardPresenter$handleBindCardResult$1.L$0;
                kotlin.b.b(obj);
                if (!((Boolean) obj).booleanValue() && z2) {
                    v88 v88Var = cVar.F;
                    b90 b90Var = (b90) cVar.A;
                    m2v m2vVar = b90Var.g;
                    xqw xqwVar = b90Var.k;
                    m2vVar.getClass();
                    v88Var.c = new z80(m2vVar, true, tu5Var, xqwVar);
                    cVar.F.a(tu5Var.b.b.c == VerificationStatus.SUCCESS ? p88.e : p88.c);
                    return zy11Var;
                }
                v88 v88Var2 = cVar.F;
                v88Var2.d = null;
                v88Var2.b = false;
                v88Var2.c = null;
                v88Var2.e.l(null);
                ((f3e) cVar.Dg()).W6();
                gyc gycVar = cVar.C;
                b90 b90Var2 = (b90) cVar.A;
                m2v m2vVar2 = b90Var2.g;
                xqw xqwVar2 = b90Var2.k;
                m2vVar2.getClass();
                z80 z80Var = new z80(m2vVar2, true, tu5Var, xqwVar2);
                g3eVar = ((ConfirmCardModalView) gycVar.a).confirmCardNavigator;
                ((da0) ((io9) g3eVar).a).r(new jj8(z80Var, i3));
                cVar.E.b();
                cVar.E.i(tu5Var.b.b.b(), ((b90) cVar.A).e);
                return zy11Var;
            }
        }
        confirmCardPresenter$handleBindCardResult$1 = new ConfirmCardPresenter$handleBindCardResult$1(cVar, continuationImpl);
        obj = confirmCardPresenter$handleBindCardResult$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = confirmCardPresenter$handleBindCardResult$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        v88 v88Var22 = cVar.F;
        v88Var22.d = null;
        v88Var22.b = false;
        v88Var22.c = null;
        v88Var22.e.l(null);
        ((f3e) cVar.Dg()).W6();
        gyc gycVar2 = cVar.C;
        b90 b90Var22 = (b90) cVar.A;
        m2v m2vVar22 = b90Var22.g;
        xqw xqwVar22 = b90Var22.k;
        m2vVar22.getClass();
        z80 z80Var2 = new z80(m2vVar22, true, tu5Var, xqwVar22);
        g3eVar = ((ConfirmCardModalView) gycVar2.a).confirmCardNavigator;
        ((da0) ((io9) g3eVar).a).r(new jj8(z80Var2, i32));
        cVar.E.b();
        cVar.E.i(tu5Var.b.b.b(), ((b90) cVar.A).e);
        return zy11Var;
    }

    @Override // defpackage.qc5, defpackage.ad5, defpackage.zc5
    public final void Cg() {
        ((wjh) this.D).a(this);
        super.Cg();
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Gg() {
        super.Gg();
        if (this.O) {
            return;
        }
        this.F.b = false;
        tje.N(Kg(), null, null, new ConfirmCardPresenter$onResume$1(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Og(tu5 tu5Var, boolean z, ContinuationImpl continuationImpl) {
        ConfirmCardPresenter$handle3ds$1 confirmCardPresenter$handle3ds$1;
        Object obj;
        int i;
        tu5 tu5Var2;
        String str;
        int i2;
        g3e g3eVar;
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof ConfirmCardPresenter$handle3ds$1) {
            confirmCardPresenter$handle3ds$1 = (ConfirmCardPresenter$handle3ds$1) continuationImpl;
            int i3 = confirmCardPresenter$handle3ds$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                confirmCardPresenter$handle3ds$1.label = i3 - Integer.MIN_VALUE;
                obj = confirmCardPresenter$handle3ds$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = confirmCardPresenter$handle3ds$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str2 = tu5Var.b.b.e;
                    String str3 = this.F.d;
                    int i4 = (str3 == null || !str3.equals(str2)) ? 0 : 1;
                    if (this.F.b) {
                        this.F.b = false;
                        pzt0 pzt0Var = this.N;
                        if (pzt0Var != null) {
                            pzt0Var.a(null);
                        }
                        this.N = null;
                        return zy11Var;
                    }
                    confirmCardPresenter$handle3ds$1.L$0 = tu5Var;
                    confirmCardPresenter$handle3ds$1.L$1 = str2;
                    confirmCardPresenter$handle3ds$1.L$2 = null;
                    confirmCardPresenter$handle3ds$1.Z$0 = z;
                    confirmCardPresenter$handle3ds$1.I$0 = i4;
                    confirmCardPresenter$handle3ds$1.label = 1;
                    Object a = this.J.a(confirmCardPresenter$handle3ds$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    tu5Var2 = tu5Var;
                    str = str2;
                    obj = a;
                    i2 = i4;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = confirmCardPresenter$handle3ds$1.I$0;
                    z = confirmCardPresenter$handle3ds$1.Z$0;
                    str = (String) confirmCardPresenter$handle3ds$1.L$1;
                    tu5 tu5Var3 = (tu5) confirmCardPresenter$handle3ds$1.L$0;
                    kotlin.b.b(obj);
                    tu5Var2 = tu5Var3;
                }
                if (!((Boolean) obj).booleanValue() || i2 != 0) {
                    if (i2 != 0 && !z) {
                        ((f3e) Dg()).rf(true);
                    }
                    this.N = tje.N(this.G.a, null, null, new ConfirmCardPresenter$handle3ds$2(tu5Var2, this, null), 3);
                }
                if (z) {
                    if (i2 == 0) {
                        this.F.d = str;
                        ((f3e) Dg()).W6();
                        gyc gycVar = this.C;
                        b90 b90Var = (b90) this.A;
                        m2v m2vVar = b90Var.g;
                        xqw xqwVar = b90Var.k;
                        y931 y931Var = b90Var.j;
                        PaymentMethodVerificationSession paymentMethodVerificationSession = b90Var.h;
                        m2vVar.getClass();
                        v920 v920Var = new v920(tu5Var2, m2vVar, xqwVar, y931Var, paymentMethodVerificationSession);
                        ConfirmCardModalView confirmCardModalView = (ConfirmCardModalView) gycVar.a;
                        confirmCardModalView.closingNavigationDirection = NavigationDirection.FORWARD;
                        g3eVar = confirmCardModalView.confirmCardNavigator;
                        ((da0) ((io9) g3eVar).a).r(new vqb(19, v920Var));
                        this.E.d();
                        return zy11Var;
                    }
                } else if (str != null) {
                    r0 r0Var = this.F.e;
                    r0Var.getClass();
                    r0Var.m(null, str);
                    return zy11Var;
                }
                return zy11Var;
            }
        }
        confirmCardPresenter$handle3ds$1 = new ConfirmCardPresenter$handle3ds$1(this, continuationImpl);
        obj = confirmCardPresenter$handle3ds$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = confirmCardPresenter$handle3ds$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        if (i2 != 0) {
            ((f3e) Dg()).rf(true);
        }
        this.N = tje.N(this.G.a, null, null, new ConfirmCardPresenter$handle3ds$2(tu5Var2, this, null), 3);
        if (z) {
        }
        return zy11Var;
    }

    public final void Pg(tu5 tu5Var, boolean z, f3e f3eVar) {
        this.I.getClass();
        this.L = qsj0.a(this.A, tu5Var);
        f3eVar.z6();
        u32 u32Var = this.E;
        if (!z) {
            u32Var.n(tu5Var.b.a.b);
            return;
        }
        p731 p731Var = tu5Var.b;
        p731 p731Var2 = tu5Var.b;
        Integer num = p731Var.b.h;
        u32Var.h(p731Var2.a, p731Var2.b.b());
        Integer num2 = p731Var2.b.h;
        f3eVar.Ke(num2 != null ? num2.intValue() : -1);
    }

    public final void Qg() {
        j831 j831Var = ((b90) this.A).i;
        this.E.j(j831Var != null ? j831Var.a : null, null);
    }
}
