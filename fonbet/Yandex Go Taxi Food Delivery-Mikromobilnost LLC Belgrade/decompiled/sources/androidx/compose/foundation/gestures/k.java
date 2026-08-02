package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragDetectionState$AwaitDown;
import androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import defpackage.ay40;
import defpackage.bsv;
import defpackage.ci9;
import defpackage.csv;
import defpackage.dai0;
import defpackage.dd11;
import defpackage.dsv;
import defpackage.esv;
import defpackage.ey91;
import defpackage.f73;
import defpackage.fsv;
import defpackage.fud;
import defpackage.fzz0;
import defpackage.gsv;
import defpackage.gwd0;
import defpackage.gzz0;
import defpackage.isv;
import defpackage.j9m;
import defpackage.jl40;
import defpackage.jwd0;
import defpackage.k9m;
import defpackage.kx91;
import defpackage.l9m;
import defpackage.lqh;
import defpackage.m9m;
import defpackage.ma91;
import defpackage.n9m;
import defpackage.npb1;
import defpackage.ny61;
import defpackage.pv60;
import defpackage.q5b1;
import defpackage.qa91;
import defpackage.qje;
import defpackage.r9m;
import defpackage.s5b1;
import defpackage.s9m;
import defpackage.sb2;
import defpackage.sl91;
import defpackage.t631;
import defpackage.t9m;
import defpackage.tje;
import defpackage.tls;
import defpackage.tvd0;
import defpackage.w511;
import defpackage.w8m;
import defpackage.wls;
import defpackage.wu60;
import defpackage.x2t;
import defpackage.x8m;
import defpackage.xp31;
import defpackage.y8m;
import defpackage.y92;
import defpackage.z2t;
import defpackage.zvd0;
import defpackage.zx40;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public abstract class k extends lqh implements gwd0, isv, fud, x2t {
    public kotlinx.coroutines.channels.a A;
    public s9m B;
    public boolean C;
    public boolean D;
    public DragDetectionState$AwaitDown E;
    public y8m F;
    public x8m G;
    public w8m H;
    public sl91 I;
    public t631 J;
    public gzz0 L;
    public p M;
    public Orientation c;
    public tls w;
    public boolean x;
    public zx40 y;
    public z2t z;
    public long K = 9205357640488583168L;
    public long N = 0;

    public k(tls tlsVar, boolean z, zx40 zx40Var, Orientation orientation) {
        this.c = orientation;
        this.w = tlsVar;
        this.x = z;
        this.y = zx40Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object H0(k kVar, ContinuationImpl continuationImpl) {
        DragGestureNode$processDragCancel$1 dragGestureNode$processDragCancel$1;
        int i;
        kVar.getClass();
        if (continuationImpl instanceof DragGestureNode$processDragCancel$1) {
            dragGestureNode$processDragCancel$1 = (DragGestureNode$processDragCancel$1) continuationImpl;
            int i2 = dragGestureNode$processDragCancel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureNode$processDragCancel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dragGestureNode$processDragCancel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dragGestureNode$processDragCancel$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    s9m s9mVar = kVar.B;
                    if (s9mVar != null) {
                        zx40 zx40Var = kVar.y;
                        if (zx40Var != null) {
                            r9m r9mVar = new r9m(s9mVar);
                            dragGestureNode$processDragCancel$1.label = 1;
                            if (((ay40) zx40Var).a(r9mVar, dragGestureNode$processDragCancel$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    kVar.R0(new m9m(0L, false));
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                kVar.B = null;
                kVar.R0(new m9m(0L, false));
                return zy11.a;
            }
        }
        dragGestureNode$processDragCancel$1 = new DragGestureNode$processDragCancel$1(kVar, continuationImpl);
        Object obj2 = dragGestureNode$processDragCancel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dragGestureNode$processDragCancel$1.label;
        if (i != 0) {
        }
        kVar.B = null;
        kVar.R0(new m9m(0L, false));
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (((defpackage.ay40) r2).a(r5, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object I0(k kVar, l9m l9mVar, ContinuationImpl continuationImpl) {
        DragGestureNode$processDragStart$1 dragGestureNode$processDragStart$1;
        int i;
        s9m s9mVar;
        zx40 zx40Var;
        l9m l9mVar2;
        s9m s9mVar2;
        kVar.getClass();
        if (continuationImpl instanceof DragGestureNode$processDragStart$1) {
            dragGestureNode$processDragStart$1 = (DragGestureNode$processDragStart$1) continuationImpl;
            int i2 = dragGestureNode$processDragStart$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureNode$processDragStart$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dragGestureNode$processDragStart$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dragGestureNode$processDragStart$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    s9m s9mVar3 = kVar.B;
                    if (s9mVar3 != null && (r2 = kVar.y) != null) {
                        r9m r9mVar = new r9m(s9mVar3);
                        dragGestureNode$processDragStart$1.L$0 = l9mVar;
                        dragGestureNode$processDragStart$1.label = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        s9mVar2 = (s9m) dragGestureNode$processDragStart$1.L$1;
                        l9mVar2 = (l9m) dragGestureNode$processDragStart$1.L$0;
                        kotlin.b.b(obj);
                        s9mVar = s9mVar2;
                        l9mVar = l9mVar2;
                        kVar.B = s9mVar;
                        kVar.Q0(l9mVar.a);
                        return zy11.a;
                    }
                    l9mVar = (l9m) dragGestureNode$processDragStart$1.L$0;
                    kotlin.b.b(obj);
                }
                s9mVar = new s9m();
                zx40Var = kVar.y;
                if (zx40Var != null) {
                    dragGestureNode$processDragStart$1.L$0 = l9mVar;
                    dragGestureNode$processDragStart$1.L$1 = s9mVar;
                    dragGestureNode$processDragStart$1.label = 2;
                    if (((ay40) zx40Var).a(s9mVar, dragGestureNode$processDragStart$1) != coroutineSingletons) {
                        l9mVar2 = l9mVar;
                        s9mVar2 = s9mVar;
                        s9mVar = s9mVar2;
                        l9mVar = l9mVar2;
                    }
                    return coroutineSingletons;
                }
                kVar.B = s9mVar;
                kVar.Q0(l9mVar.a);
                return zy11.a;
            }
        }
        dragGestureNode$processDragStart$1 = new DragGestureNode$processDragStart$1(kVar, continuationImpl);
        Object obj2 = dragGestureNode$processDragStart$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dragGestureNode$processDragStart$1.label;
        if (i != 0) {
        }
        s9mVar = new s9m();
        zx40Var = kVar.y;
        if (zx40Var != null) {
        }
        kVar.B = s9mVar;
        kVar.Q0(l9mVar.a);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object J0(k kVar, m9m m9mVar, ContinuationImpl continuationImpl) {
        DragGestureNode$processDragStop$1 dragGestureNode$processDragStop$1;
        int i;
        kVar.getClass();
        if (continuationImpl instanceof DragGestureNode$processDragStop$1) {
            dragGestureNode$processDragStop$1 = (DragGestureNode$processDragStop$1) continuationImpl;
            int i2 = dragGestureNode$processDragStop$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dragGestureNode$processDragStop$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dragGestureNode$processDragStop$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dragGestureNode$processDragStop$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    s9m s9mVar = kVar.B;
                    if (s9mVar != null) {
                        zx40 zx40Var = kVar.y;
                        if (zx40Var != null) {
                            t9m t9mVar = new t9m(s9mVar);
                            dragGestureNode$processDragStop$1.L$0 = m9mVar;
                            dragGestureNode$processDragStop$1.label = 1;
                            if (((ay40) zx40Var).a(t9mVar, dragGestureNode$processDragStop$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    kVar.R0(m9mVar);
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m9mVar = (m9m) dragGestureNode$processDragStop$1.L$0;
                kotlin.b.b(obj);
                kVar.B = null;
                kVar.R0(m9mVar);
                return zy11.a;
            }
        }
        dragGestureNode$processDragStop$1 = new DragGestureNode$processDragStop$1(kVar, continuationImpl);
        Object obj2 = dragGestureNode$processDragStop$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dragGestureNode$processDragStop$1.label;
        if (i != 0) {
        }
        kVar.B = null;
        kVar.R0(m9mVar);
        return zy11.a;
    }

    public static void O0(k kVar, zvd0 zvd0Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        x8m x8mVar = kVar.G;
        if (x8mVar == null) {
            x8mVar = new x8m();
            x8mVar.a = null;
            x8mVar.b = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
            x8mVar.c = false;
            kVar.G = x8mVar;
        }
        x8mVar.a = zvd0Var;
        x8mVar.b = j;
        gzz0 gzz0Var = kVar.L;
        Orientation orientation = kVar.c;
        if (gzz0Var == null) {
            kVar.L = new gzz0(orientation, 2);
        } else {
            gzz0Var.a = orientation;
            gzz0Var.b = j2;
        }
        x8mVar.c = false;
        kVar.I = x8mVar;
    }

    @Override // defpackage.gwd0
    public final void D() {
        if (this.D) {
            M0();
            if (this.C) {
                S0().d(j9m.a);
            }
            this.J = null;
        }
        this.D = false;
    }

    public final void K0() {
        s9m s9mVar = this.B;
        if (s9mVar != null) {
            zx40 zx40Var = this.y;
            if (zx40Var != null) {
                ((ay40) zx40Var).b(new r9m(s9mVar));
            }
            this.B = null;
        }
    }

    public abstract Object L0(wls wlsVar, Continuation continuation);

    public final void M0() {
        DragDetectionState$AwaitDown dragDetectionState$AwaitDown = this.E;
        if (dragDetectionState$AwaitDown == null) {
            dragDetectionState$AwaitDown = new DragDetectionState$AwaitDown(0);
            this.E = dragDetectionState$AwaitDown;
        }
        dragDetectionState$AwaitDown.a = DragDetectionState$AwaitDown.AwaitTouchSlop.NotInitialized;
        dragDetectionState$AwaitDown.b = false;
        this.I = dragDetectionState$AwaitDown;
    }

    public final void N0(zvd0 zvd0Var, long j, gzz0 gzz0Var) {
        w8m w8mVar = this.H;
        if (w8mVar == null) {
            w8mVar = new w8m();
            w8mVar.a = null;
            w8mVar.b = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
            this.H = w8mVar;
        }
        w8mVar.a = zvd0Var;
        w8mVar.b = j;
        gzz0Var.b = 0L;
        this.I = w8mVar;
    }

    public final void P0(n9m n9mVar) {
        if ((n9mVar instanceof l9m) && !this.C) {
            this.C = true;
            X0();
        }
        S0().d(n9mVar);
    }

    public abstract void Q0(long j);

    public abstract void R0(m9m m9mVar);

    public final ci9 S0() {
        kotlinx.coroutines.channels.a aVar = this.A;
        if (aVar != null) {
            return aVar;
        }
        ny61.g("Events channel not initialized.");
        return null;
    }

    public final t631 T0() {
        t631 t631Var = this.J;
        if (t631Var != null) {
            return t631Var;
        }
        ny61.g("Velocity Tracker not initialized.");
        return null;
    }

    public final void U0(long j, zvd0 zvd0Var) {
        long mo43localToScreenMKHz9U = qje.O(getNode()).mo43localToScreenMKHz9U(0L);
        if (!wu60.c(this.K, 9205357640488583168L) && !wu60.c(mo43localToScreenMKHz9U, this.K)) {
            this.N = wu60.f(this.N, wu60.e(mo43localToScreenMKHz9U, this.K));
        }
        this.K = mo43localToScreenMKHz9U;
        qa91.a(T0(), zvd0Var, this.N);
        S0().d(new k9m(j, false));
    }

    public final void V0(zvd0 zvd0Var, zvd0 zvd0Var2, long j) {
        if (this.J == null) {
            this.J = new t631();
        }
        qa91.a(T0(), zvd0Var, 0L);
        long e = wu60.e(zvd0Var2.c, j);
        this.N = 0L;
        if (((Boolean) this.w.invoke(new jwd0(zvd0Var.i))).booleanValue()) {
            if (!this.C) {
                if (this.A == null) {
                    this.A = sb2.a(Integer.MAX_VALUE, null, null, 6);
                }
                X0();
            }
            this.K = qje.O(this).mo43localToScreenMKHz9U(0L);
            S0().d(new l9m(e));
        }
    }

    public abstract boolean W0();

    public final void X0() {
        this.C = true;
        if (this.A == null) {
            this.A = sb2.a(Integer.MAX_VALUE, null, null, 6);
        }
        tje.N(getCoroutineScope(), null, null, new DragGestureNode$startListeningForEvents$1(this, null), 3);
    }

    public final void Y0(tls tlsVar, boolean z, zx40 zx40Var, Orientation orientation, boolean z2) {
        this.w = tlsVar;
        boolean z3 = true;
        if (this.x != z) {
            this.x = z;
            if (!z) {
                K0();
                this.M = null;
            }
            z2 = true;
        }
        if (!jl40.l(this.y, zx40Var)) {
            K0();
            this.y = zx40Var;
        }
        if (this.c != orientation) {
            this.c = orientation;
        } else {
            z3 = z2;
        }
        if (z3) {
            boolean z4 = this.D;
            j9m j9mVar = j9m.a;
            if (z4) {
                M0();
                if (this.C) {
                    S0().d(j9mVar);
                }
                this.J = null;
            }
            p pVar = this.M;
            if (pVar != null) {
                pVar.a();
                k kVar = pVar.a;
                if (kVar.C) {
                    kVar.P0(j9mVar);
                }
                pVar.g = null;
                pv60 pv60Var = pVar.k;
                pv60Var.a = 0;
                pv60Var.b.b = 0;
            }
        }
    }

    @Override // defpackage.x2t
    public final boolean j(dsv dsvVar) {
        return s5b1.d(dsvVar) && this.x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v0, types: [androidx.compose.foundation.gestures.k, fud, lqh, x2t] */
    @Override // defpackage.gwd0
    public void m0(tvd0 tvd0Var, PointerEventPass pointerEventPass, long j) {
        Object obj;
        Object obj2;
        zvd0 zvd0Var;
        Object obj3;
        zvd0 zvd0Var2;
        boolean z = true;
        this.D = true;
        if (this.z == null) {
            z2t z2tVar = new z2t(this);
            E0(z2tVar);
            this.z = z2tVar;
        }
        if (this.x) {
            int i = 0;
            if (this.I == null) {
                DragDetectionState$AwaitDown dragDetectionState$AwaitDown = this.E;
                if (dragDetectionState$AwaitDown == null) {
                    dragDetectionState$AwaitDown = new DragDetectionState$AwaitDown(0);
                    this.E = dragDetectionState$AwaitDown;
                }
                this.I = dragDetectionState$AwaitDown;
            }
            sl91 sl91Var = this.I;
            if (sl91Var == null) {
                ny61.g("currentDragState should not be null");
                return;
            }
            if (sl91Var instanceof DragDetectionState$AwaitDown) {
                DragDetectionState$AwaitDown dragDetectionState$AwaitDown2 = (DragDetectionState$AwaitDown) sl91Var;
                if (!tvd0Var.a.isEmpty() && z.g(tvd0Var, false, false)) {
                    zvd0 zvd0Var3 = (zvd0) kotlin.collections.a.P(tvd0Var.a);
                    DragDetectionState$AwaitDown.AwaitTouchSlop awaitTouchSlop = j.a[dragDetectionState$AwaitDown2.a.ordinal()] == 1 ? !W0() ? DragDetectionState$AwaitDown.AwaitTouchSlop.Yes : DragDetectionState$AwaitDown.AwaitTouchSlop.No : dragDetectionState$AwaitDown2.a;
                    dragDetectionState$AwaitDown2.a = awaitTouchSlop;
                    if (pointerEventPass == PointerEventPass.Initial && awaitTouchSlop == DragDetectionState$AwaitDown.AwaitTouchSlop.No) {
                        zvd0Var3.a();
                        dragDetectionState$AwaitDown2.b = true;
                    }
                    if (pointerEventPass == PointerEventPass.Main) {
                        if (awaitTouchSlop == DragDetectionState$AwaitDown.AwaitTouchSlop.Yes) {
                            O0(this, zvd0Var3, zvd0Var3.a, 0L, 12);
                            return;
                        }
                        if (dragDetectionState$AwaitDown2.b) {
                            V0(zvd0Var3, zvd0Var3, 0L);
                            U0(0L, zvd0Var3);
                            long j2 = zvd0Var3.a;
                            y8m y8mVar = this.F;
                            if (y8mVar == null) {
                                y8mVar = new y8m();
                                y8mVar.a = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                                this.F = y8mVar;
                            }
                            y8mVar.a = j2;
                            this.I = y8mVar;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (!(sl91Var instanceof x8m)) {
                if (sl91Var instanceof w8m) {
                    w8m w8mVar = (w8m) sl91Var;
                    if (pointerEventPass != PointerEventPass.Final) {
                        return;
                    }
                    List list = tvd0Var.a;
                    List list2 = list;
                    int size = list2.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        if (((zvd0) list.get(i2)).j()) {
                            z = false;
                            break;
                        }
                        i2++;
                    }
                    int size2 = list2.size();
                    while (true) {
                        if (i >= size2) {
                            break;
                        }
                        if (!((zvd0) list.get(i)).d) {
                            i++;
                        } else if (!list.isEmpty()) {
                            if (z) {
                                long e = wu60.e(((zvd0) kotlin.collections.a.P(list)).c, w8mVar.a.c);
                                zvd0 zvd0Var4 = w8mVar.a;
                                if (zvd0Var4 != null) {
                                    O0(this, zvd0Var4, w8mVar.b, e, 8);
                                    return;
                                } else {
                                    ny61.g("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    M0();
                    return;
                }
                if (!(sl91Var instanceof y8m)) {
                    w511.b();
                    return;
                }
                y8m y8mVar2 = (y8m) sl91Var;
                if (pointerEventPass != PointerEventPass.Main) {
                    return;
                }
                long j3 = y8mVar2.a;
                List list3 = tvd0Var.a;
                int size3 = list3.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size3) {
                        obj = null;
                        break;
                    }
                    obj = list3.get(i3);
                    if (ey91.e(((zvd0) obj).a, j3)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                zvd0 zvd0Var5 = (zvd0) obj;
                if (zvd0Var5 == null) {
                    return;
                }
                boolean d = kx91.d(zvd0Var5);
                j9m j9mVar = j9m.a;
                if (!d) {
                    if (zvd0Var5.j()) {
                        S0().d(j9mVar);
                        return;
                    } else {
                        if (wu60.d(kx91.g(zvd0Var5, true)) == 0.0f) {
                            return;
                        }
                        U0(kx91.g(zvd0Var5, false), zvd0Var5);
                        zvd0Var5.a();
                        return;
                    }
                }
                List list4 = tvd0Var.a;
                int size4 = list4.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size4) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list4.get(i4);
                    if (((zvd0) obj2).d) {
                        break;
                    } else {
                        i4++;
                    }
                }
                zvd0 zvd0Var6 = (zvd0) obj2;
                if (zvd0Var6 != null) {
                    y8mVar2.a = zvd0Var6.a;
                    return;
                }
                if (zvd0Var5.j() || !kx91.d(zvd0Var5)) {
                    S0().d(j9mVar);
                } else {
                    qa91.a(T0(), zvd0Var5, 0L);
                    float i5 = ((xp31) npb1.c(this, androidx.compose.ui.platform.j.t)).i();
                    long a = T0().a(ma91.a(i5, i5));
                    androidx.compose.ui.input.pointer.util.a aVar = T0().a;
                    VelocityTracker1D velocityTracker1D = aVar.a;
                    f73.q(velocityTracker1D.d, null);
                    velocityTracker1D.e = 0;
                    VelocityTracker1D velocityTracker1D2 = aVar.b;
                    f73.q(velocityTracker1D2.d, null);
                    velocityTracker1D2.e = 0;
                    aVar.c = 0L;
                    S0().d(new m9m(l.b(a), false));
                    this.D = false;
                }
                M0();
                return;
            }
            x8m x8mVar = (x8m) sl91Var;
            if (pointerEventPass == PointerEventPass.Initial) {
                return;
            }
            List list5 = tvd0Var.a;
            List list6 = list5;
            int size5 = list6.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size5) {
                    zvd0Var = null;
                    break;
                }
                ?? r12 = list5.get(i6);
                if (ey91.e(((zvd0) r12).a, x8mVar.b)) {
                    zvd0Var = r12;
                    break;
                }
                i6++;
            }
            zvd0 zvd0Var7 = zvd0Var;
            if (zvd0Var7 == null) {
                int size6 = list6.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        zvd0Var2 = 0;
                        break;
                    }
                    zvd0Var2 = list5.get(i7);
                    if (((zvd0) zvd0Var2).d) {
                        break;
                    } else {
                        i7++;
                    }
                }
                zvd0Var7 = zvd0Var2;
                if (zvd0Var7 == null) {
                    M0();
                    return;
                }
                x8mVar.b = zvd0Var7.a;
            }
            if (pointerEventPass == PointerEventPass.Main) {
                if (zvd0Var7.j()) {
                    zvd0 zvd0Var8 = x8mVar.a;
                    if (zvd0Var8 == null) {
                        ny61.g("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j4 = x8mVar.b;
                    gzz0 gzz0Var = this.L;
                    if (gzz0Var == null) {
                        ny61.g("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                    N0(zvd0Var8, j4, gzz0Var);
                } else if (kx91.d(zvd0Var7)) {
                    int size7 = list6.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size7) {
                            obj3 = null;
                            break;
                        }
                        obj3 = list5.get(i8);
                        if (((zvd0) obj3).d) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                    zvd0 zvd0Var9 = (zvd0) obj3;
                    if (zvd0Var9 == null) {
                        M0();
                    } else {
                        x8mVar.b = zvd0Var9.a;
                    }
                } else {
                    float n = i.n((xp31) npb1.c(this, androidx.compose.ui.platform.j.t), zvd0Var7.i);
                    gzz0 gzz0Var2 = this.L;
                    if (gzz0Var2 == null) {
                        ny61.g("Touch slop detector not initialized.");
                        return;
                    }
                    long a2 = gzz0Var2.a(n, kx91.g(zvd0Var7, true), true);
                    if ((9223372034707292159L & a2) != 9205357640488583168L) {
                        boolean s0 = s0(zvd0Var7);
                        dd11 n2 = dai0.n(this, z2t.b);
                        z2t z2tVar2 = n2 instanceof z2t ? (z2t) n2 : null;
                        x2t x2tVar = z2tVar2 != null ? z2tVar2.a : null;
                        boolean z2 = x2tVar != null && x2tVar.s0(zvd0Var7);
                        if (s0 || !z2) {
                            zvd0Var7.a();
                            V0(x8mVar.a, zvd0Var7, a2);
                            U0(a2, zvd0Var7);
                            long j5 = zvd0Var7.a;
                            y8m y8mVar3 = this.F;
                            if (y8mVar3 == null) {
                                y8mVar3 = new y8m();
                                y8mVar3.a = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                                this.F = y8mVar3;
                            }
                            y8mVar3.a = j5;
                            this.I = y8mVar3;
                        } else {
                            x8mVar.c = true;
                        }
                    } else {
                        x8mVar.c = true;
                    }
                }
            }
            if (pointerEventPass == PointerEventPass.Final && x8mVar.c) {
                if (!zvd0Var7.j()) {
                    x8mVar.c = false;
                    return;
                }
                zvd0 zvd0Var10 = x8mVar.a;
                if (zvd0Var10 == null) {
                    ny61.g("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long j6 = x8mVar.b;
                gzz0 gzz0Var3 = this.L;
                if (gzz0Var3 != null) {
                    N0(zvd0Var10, j6, gzz0Var3);
                } else {
                    ny61.g("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v0, types: [androidx.compose.foundation.gestures.k, lqh, x2t] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.isv
    public final void n0(bsv bsvVar, PointerEventPass pointerEventPass) {
        dsv dsvVar;
        Object obj;
        Object obj2;
        Object obj3;
        dsv dsvVar2;
        if (this.z == null) {
            z2t z2tVar = new z2t(this);
            E0(z2tVar);
            this.z = z2tVar;
        }
        if (this.x) {
            if (this.M == null) {
                this.M = new p(this);
            }
            p pVar = this.M;
            if (pVar != null) {
                k kVar = pVar.a;
                int i = 0;
                if (pVar.f == null) {
                    IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown = pVar.b;
                    if (indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown == null) {
                        indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown = new IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown(0);
                        pVar.b = indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown;
                    }
                    pVar.f = indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown;
                }
                q5b1 q5b1Var = pVar.f;
                if (q5b1Var == null) {
                    ny61.g("currentDragState should not be null");
                    return;
                }
                boolean z = true;
                if (q5b1Var instanceof IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown) {
                    IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown2 = (IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown) q5b1Var;
                    if (((y92) bsvVar).a.isEmpty()) {
                        return;
                    }
                    y92 y92Var = (y92) bsvVar;
                    int i2 = y92Var.b;
                    ArrayList arrayList = y92Var.a;
                    int size = arrayList.size();
                    while (i < size) {
                        if (!s5b1.d((dsv) arrayList.get(i))) {
                            return;
                        } else {
                            i++;
                        }
                    }
                    dsv dsvVar3 = (dsv) kotlin.collections.a.P(arrayList);
                    IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown.AwaitTouchSlop awaitTouchSlop = o.a[indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown2.a.ordinal()] == 1 ? !kVar.W0() ? IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown.AwaitTouchSlop.Yes : IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown.AwaitTouchSlop.No : indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown2.a;
                    indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown2.a = awaitTouchSlop;
                    if (pointerEventPass == PointerEventPass.Initial && awaitTouchSlop == IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown.AwaitTouchSlop.No) {
                        dsvVar3.i = true;
                        indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown2.b = true;
                    }
                    if (pointerEventPass == PointerEventPass.Main) {
                        if (awaitTouchSlop == IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown.AwaitTouchSlop.Yes) {
                            p.c(pVar, dsvVar3, dsvVar3.a, 0L, 12);
                            return;
                        }
                        if (indirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown2.b) {
                            pVar.f(dsvVar3, dsvVar3, new csv(i2), 0L);
                            pVar.e(dsvVar3, new csv(i2), 0L);
                            long j = dsvVar3.a;
                            gsv gsvVar = pVar.c;
                            if (gsvVar == null) {
                                gsvVar = new gsv();
                                gsvVar.a = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                                pVar.c = gsvVar;
                            }
                            gsvVar.a = j;
                            pVar.f = gsvVar;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!(q5b1Var instanceof fsv)) {
                    if (q5b1Var instanceof esv) {
                        esv esvVar = (esv) q5b1Var;
                        if (pointerEventPass != PointerEventPass.Final) {
                            return;
                        }
                        ArrayList arrayList2 = ((y92) bsvVar).a;
                        int size2 = arrayList2.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size2) {
                                break;
                            }
                            if (((dsv) arrayList2.get(i3)).i) {
                                z = false;
                                break;
                            }
                            i3++;
                        }
                        y92 y92Var2 = (y92) bsvVar;
                        int i4 = y92Var2.b;
                        ArrayList arrayList3 = y92Var2.a;
                        int size3 = arrayList3.size();
                        while (true) {
                            if (i >= size3) {
                                break;
                            }
                            if (!((dsv) arrayList3.get(i)).d) {
                                i++;
                            } else if (!arrayList3.isEmpty()) {
                                if (z) {
                                    long e = wu60.e(s5b1.g((dsv) kotlin.collections.a.P(arrayList3), kVar.c, new csv(i4)), s5b1.g(esvVar.a, kVar.c, new csv(i4)));
                                    dsv dsvVar4 = esvVar.a;
                                    if (dsvVar4 != null) {
                                        p.c(pVar, dsvVar4, esvVar.b, e, 8);
                                        return;
                                    } else {
                                        ny61.g("AwaitGesturePickup.initialDown was not initialized.");
                                        return;
                                    }
                                }
                                return;
                            }
                        }
                        pVar.a();
                        return;
                    }
                    if (!(q5b1Var instanceof gsv)) {
                        w511.b();
                        return;
                    }
                    gsv gsvVar2 = (gsv) q5b1Var;
                    if (pointerEventPass != PointerEventPass.Main) {
                        return;
                    }
                    long j2 = gsvVar2.a;
                    ArrayList arrayList4 = ((y92) bsvVar).a;
                    int size4 = arrayList4.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size4) {
                            dsvVar = 0;
                            break;
                        }
                        dsvVar = arrayList4.get(i5);
                        if (ey91.e(((dsv) dsvVar).a, j2)) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    dsv dsvVar5 = dsvVar;
                    if (dsvVar5 == null) {
                        return;
                    }
                    boolean c = s5b1.c(dsvVar5);
                    j9m j9mVar = j9m.a;
                    if (!c) {
                        if (dsvVar5.i) {
                            kVar.P0(j9mVar);
                            return;
                        }
                        Orientation orientation = kVar.c;
                        int i6 = ((y92) bsvVar).b;
                        if (wu60.d(s5b1.f(dsvVar5, orientation, new csv(i6), true)) == 0.0f) {
                            return;
                        }
                        pVar.e(dsvVar5, new csv(i6), s5b1.f(dsvVar5, kVar.c, new csv(i6), false));
                        dsvVar5.i = true;
                        return;
                    }
                    y92 y92Var3 = (y92) bsvVar;
                    ArrayList arrayList5 = y92Var3.a;
                    int size5 = arrayList5.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size5) {
                            obj = null;
                            break;
                        }
                        obj = arrayList5.get(i7);
                        if (((dsv) obj).d) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    dsv dsvVar6 = (dsv) obj;
                    if (dsvVar6 != null) {
                        gsvVar2.a = dsvVar6.a;
                        return;
                    }
                    if (dsvVar5.i || !s5b1.c(dsvVar5)) {
                        kVar.P0(j9mVar);
                    } else {
                        s5b1.b(pVar.d(), dsvVar5, kVar.c, new csv(y92Var3.b), pVar.j, pVar.l);
                        float i8 = ((xp31) npb1.c(kVar, androidx.compose.ui.platform.j.t)).i();
                        long a = pVar.d().a(ma91.a(i8, i8));
                        androidx.compose.ui.input.pointer.util.a aVar = pVar.d().a;
                        VelocityTracker1D velocityTracker1D = aVar.a;
                        f73.q(velocityTracker1D.d, null);
                        velocityTracker1D.e = 0;
                        VelocityTracker1D velocityTracker1D2 = aVar.b;
                        f73.q(velocityTracker1D2.d, null);
                        velocityTracker1D2.e = 0;
                        aVar.c = 0L;
                        kVar.P0(new m9m(l.b(a), true));
                    }
                    pVar.a();
                    return;
                }
                fsv fsvVar = (fsv) q5b1Var;
                if (pointerEventPass == PointerEventPass.Initial) {
                    return;
                }
                ArrayList arrayList6 = ((y92) bsvVar).a;
                int size6 = arrayList6.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size6) {
                        obj2 = null;
                        break;
                    }
                    obj2 = arrayList6.get(i9);
                    int i10 = size6;
                    if (ey91.e(((dsv) obj2).a, fsvVar.b)) {
                        break;
                    }
                    i9++;
                    size6 = i10;
                }
                dsv dsvVar7 = (dsv) obj2;
                if (dsvVar7 == null) {
                    ArrayList arrayList7 = ((y92) bsvVar).a;
                    int size7 = arrayList7.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size7) {
                            dsvVar2 = 0;
                            break;
                        }
                        dsvVar2 = arrayList7.get(i11);
                        if (((dsv) dsvVar2).d) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    dsvVar7 = dsvVar2;
                    if (dsvVar7 == null) {
                        pVar.a();
                        return;
                    }
                    fsvVar.b = dsvVar7.a;
                }
                if (pointerEventPass == PointerEventPass.Main) {
                    if (dsvVar7.i) {
                        dsv dsvVar8 = fsvVar.a;
                        if (dsvVar8 == null) {
                            ny61.g("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j3 = fsvVar.b;
                        gzz0 gzz0Var = pVar.i;
                        if (gzz0Var == null) {
                            ny61.g("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                        pVar.b(dsvVar8, j3, gzz0Var);
                    } else if (s5b1.c(dsvVar7)) {
                        ArrayList arrayList8 = ((y92) bsvVar).a;
                        int size8 = arrayList8.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size8) {
                                obj3 = null;
                                break;
                            }
                            obj3 = arrayList8.get(i12);
                            if (((dsv) obj3).d) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        dsv dsvVar9 = (dsv) obj3;
                        if (dsvVar9 == null) {
                            pVar.a();
                        } else {
                            fsvVar.b = dsvVar9.a;
                        }
                    } else {
                        xp31 xp31Var = (xp31) npb1.c(kVar, androidx.compose.ui.platform.j.t);
                        float f = i.a;
                        float c2 = xp31Var.c();
                        gzz0 gzz0Var2 = pVar.i;
                        if (gzz0Var2 == null) {
                            ny61.g("Touch slop detector not initialized.");
                            return;
                        }
                        Orientation orientation2 = kVar.c;
                        int i13 = ((y92) bsvVar).b;
                        long a2 = gzz0Var2.a(c2, s5b1.f(dsvVar7, orientation2, new csv(i13), true), true);
                        if ((a2 & 9223372034707292159L) != 9205357640488583168L) {
                            dsvVar7.i = true;
                            pVar.f(fsvVar.a, dsvVar7, new csv(i13), a2);
                            pVar.e(dsvVar7, new csv(i13), a2);
                            long j4 = dsvVar7.a;
                            gsv gsvVar3 = pVar.c;
                            if (gsvVar3 == null) {
                                gsvVar3 = new gsv();
                                gsvVar3.a = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                                pVar.c = gsvVar3;
                            }
                            gsvVar3.a = j4;
                            pVar.f = gsvVar3;
                        } else {
                            fsvVar.c = true;
                        }
                    }
                }
                if (pointerEventPass == PointerEventPass.Final && fsvVar.c) {
                    if (!dsvVar7.i) {
                        fsvVar.c = false;
                        return;
                    }
                    dsv dsvVar10 = fsvVar.a;
                    if (dsvVar10 == null) {
                        ny61.g("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j5 = fsvVar.b;
                    gzz0 gzz0Var3 = pVar.i;
                    if (gzz0Var3 != null) {
                        pVar.b(dsvVar10, j5, gzz0Var3);
                    } else {
                        ny61.g("AwaitTouchSlop.touchSlopDetector was not initialized");
                    }
                }
            }
        }
    }

    @Override // defpackage.e530
    public final void onDetach() {
        this.C = false;
        K0();
        this.N = 0L;
        z2t z2tVar = this.z;
        if (z2tVar != null) {
            F0(z2tVar);
        }
        this.z = null;
    }

    @Override // defpackage.x2t
    public final boolean s0(zvd0 zvd0Var) {
        if (kx91.b(zvd0Var)) {
            return this.x;
        }
        if (!kx91.d(zvd0Var)) {
            if (this.L == null) {
                this.L = new gzz0(this.c, 2);
            }
            float c = ((xp31) npb1.c(this, androidx.compose.ui.platform.j.t)).c();
            long g = kx91.g(zvd0Var, false);
            gzz0 gzz0Var = this.L;
            if (gzz0Var == null) {
                ny61.g("Touch slop detector not initialized.");
                return false;
            }
            if (!wu60.c(gzz0Var.a(c, g, false), 9205357640488583168L)) {
                long f = wu60.f(gzz0Var.b, g);
                double atan2 = (((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (f & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))), Math.abs(Float.intBitsToFloat((int) (f >> 32))))) * 180.0f) / 3.141592653589793d;
                Orientation orientation = gzz0Var.a;
                int i = orientation == null ? -1 : fzz0.a[orientation.ordinal()];
                if (i == 1 ? atan2 < 30.0d : !(i != 2 || atan2 <= 30.0d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.isv
    public final void y0() {
        p pVar = this.M;
        if (pVar != null) {
            pVar.a();
            k kVar = pVar.a;
            if (kVar.C) {
                kVar.P0(j9m.a);
            }
            pVar.g = null;
            pv60 pv60Var = pVar.k;
            pv60Var.a = 0;
            pv60Var.b.b = 0;
        }
    }
}
