package androidx.compose.foundation.gestures;

import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.c9y;
import defpackage.fwi;
import defpackage.gnq0;
import defpackage.hkp0;
import defpackage.hxg;
import defpackage.jcb1;
import defpackage.jl40;
import defpackage.jwd0;
import defpackage.kgx;
import defpackage.lix;
import defpackage.lvr;
import defpackage.m9m;
import defpackage.mhx;
import defpackage.mnq0;
import defpackage.qje;
import defpackage.ryh;
import defpackage.snr;
import defpackage.tje;
import defpackage.tse;
import defpackage.tvd0;
import defpackage.tyo0;
import defpackage.vk6;
import defpackage.vm2;
import defpackage.wkp0;
import defpackage.wls;
import defpackage.wor0;
import defpackage.z2t;
import defpackage.zvd0;
import defpackage.zx40;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class x extends k implements lix, gnq0 {
    public androidx.compose.foundation.c O;
    public snr P;
    public final NestedScrollDispatcher Q;
    public final g R;
    public final y S;
    public final v T;
    public final lvr U;
    public final f V;
    public w W;
    public wls Z;
    public q a0;
    public a0 b0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [androidx.compose.foundation.gestures.x, lqh] */
    /* JADX WARN: Type inference failed for: r1v2, types: [snr] */
    public x(vk6 vk6Var, snr snrVar, zx40 zx40Var, wkp0 wkp0Var, androidx.compose.foundation.c cVar, Orientation orientation, boolean z, boolean z2) {
        super(u.a, z, zx40Var, orientation);
        this.O = cVar;
        this.P = snrVar;
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        this.Q = nestedScrollDispatcher;
        g gVar = new g(new hxg(new wor0((fwi) u.d)));
        this.R = gVar;
        androidx.compose.foundation.c cVar2 = this.O;
        ?? r1 = this.P;
        y yVar = new y(wkp0Var, cVar2, r1 == 0 ? gVar : r1, orientation, z2, nestedScrollDispatcher, this, new hkp0(this, 0));
        this.S = yVar;
        v vVar = new v(yVar, z);
        this.T = vVar;
        androidx.compose.ui.focus.d dVar = new androidx.compose.ui.focus.d(2, 10, null);
        E0(dVar);
        this.U = dVar;
        f fVar = new f(orientation, yVar, z2, vk6Var, new hkp0(this, 1));
        E0(fVar);
        this.V = fVar;
        E0(new androidx.compose.ui.input.nestedscroll.c(vVar, nestedScrollDispatcher));
        androidx.compose.foundation.relocation.b bVar = new androidx.compose.foundation.relocation.b();
        bVar.a = fVar;
        E0(bVar);
    }

    @Override // androidx.compose.foundation.gestures.k
    public final Object L0(wls wlsVar, Continuation continuation) {
        MutatePriority mutatePriority = MutatePriority.UserInput;
        y yVar = this.S;
        Object f = yVar.f(mutatePriority, new ScrollableNode$drag$2$1(wlsVar, yVar, null), (ContinuationImpl) continuation);
        return f == CoroutineSingletons.COROUTINE_SUSPENDED ? f : zy11.a;
    }

    @Override // androidx.compose.foundation.gestures.k
    public final void Q0(long j) {
    }

    @Override // androidx.compose.foundation.gestures.k
    public final void R0(m9m m9mVar) {
        tje.N(this.Q.c(), null, null, new ScrollableNode$onDragStopped$1(m9mVar, this, null), 3);
    }

    @Override // androidx.compose.foundation.gestures.k
    public final boolean W0() {
        y yVar = this.S;
        if (yVar.a.a()) {
            return true;
        }
        androidx.compose.foundation.c cVar = yVar.b;
        if (cVar == null) {
            return false;
        }
        androidx.compose.foundation.f fVar = cVar.c;
        EdgeEffect edgeEffect = fVar.d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? vm2.e(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = fVar.e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? vm2.e(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = fVar.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? vm2.e(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = fVar.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? vm2.e(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    public final void Z0(vk6 vk6Var, snr snrVar, zx40 zx40Var, wkp0 wkp0Var, androidx.compose.foundation.c cVar, Orientation orientation, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = true;
        boolean z5 = false;
        if (this.x != z) {
            this.T.b = z;
            z3 = true;
        } else {
            z3 = false;
        }
        snr snrVar2 = snrVar == null ? this.R : snrVar;
        y yVar = this.S;
        if (!jl40.l(yVar.a, wkp0Var)) {
            yVar.a = wkp0Var;
            z5 = true;
        }
        yVar.b = cVar;
        if (yVar.d != orientation) {
            yVar.d = orientation;
            z5 = true;
        }
        if (yVar.e != z2) {
            yVar.e = z2;
        } else {
            z4 = z5;
        }
        yVar.c = snrVar2;
        yVar.f = this.Q;
        f fVar = this.V;
        fVar.a = orientation;
        fVar.c = z2;
        fVar.w = vk6Var;
        this.O = cVar;
        this.P = snrVar;
        tyo0 tyo0Var = u.a;
        Orientation orientation2 = yVar.d;
        Orientation orientation3 = Orientation.Vertical;
        if (orientation2 != orientation3) {
            orientation3 = Orientation.Horizontal;
        }
        Y0(tyo0Var, z, zx40Var, orientation3, z4);
        if (z3) {
            this.W = null;
            this.Z = null;
            qje.P(this).D();
        }
    }

    @Override // defpackage.e530
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.foundation.gestures.k, defpackage.gwd0
    public final void m0(tvd0 tvd0Var, PointerEventPass pointerEventPass, long j) {
        int i;
        List list = tvd0Var.a;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (((Boolean) this.w.invoke(new jwd0(((zvd0) list.get(i2)).i))).booleanValue()) {
                super.m0(tvd0Var, pointerEventPass, j);
                break;
            }
            i2++;
        }
        if (this.z == null) {
            z2t z2tVar = new z2t(this);
            E0(z2tVar);
            this.z = z2tVar;
        }
        if (this.x) {
            PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
            y yVar = this.S;
            if (pointerEventPass == pointerEventPass2 && tvd0Var.f == 6) {
                if (this.a0 == null) {
                    this.a0 = new q(yVar, new ryh(16, ViewConfiguration.get(tje.V(this).getContext())), new ScrollableNode$ensureMouseWheelScrollingLogicInitialized$1(2, this, x.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4), qje.P(this).R);
                }
                q qVar = this.a0;
                if (qVar != null) {
                    tse coroutineScope = getCoroutineScope();
                    if (qVar.h == null) {
                        qVar.h = tje.N(coroutineScope, null, null, new MouseWheelScrollingLogic$startReceivingEvents$1(qVar, null), 3);
                    }
                }
            }
            q qVar2 = this.a0;
            if (qVar2 != null && tvd0Var.f == 6) {
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        if (pointerEventPass == PointerEventPass.Initial && qVar2.d) {
                            qVar2.f(tvd0Var);
                            r.a(tvd0Var);
                        }
                        if (pointerEventPass == PointerEventPass.Main && !qVar2.d && qVar2.f(tvd0Var)) {
                            r.a(tvd0Var);
                        }
                    } else if (((zvd0) list.get(i3)).j()) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            if (pointerEventPass == PointerEventPass.Initial && ((i = tvd0Var.f) == 10 || i == 11 || i == 12)) {
                if (this.b0 == null) {
                    this.b0 = new a0(yVar, new ScrollableNode$ensureTrackpadScrollingLogicInitialized$1(2, this, x.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4), qje.P(this).R);
                }
                a0 a0Var = this.b0;
                if (a0Var != null) {
                    tse coroutineScope2 = getCoroutineScope();
                    if (a0Var.g == null) {
                        a0Var.g = tje.N(coroutineScope2, null, null, new TrackpadScrollingLogic$startReceivingEvents$1(a0Var, null), 3);
                    }
                }
            }
            a0 a0Var2 = this.b0;
            if (a0Var2 != null) {
                int i4 = tvd0Var.f;
                if (i4 == 10 || i4 == 11 || i4 == 12) {
                    int size3 = list.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        if (((zvd0) list.get(i5)).j()) {
                            return;
                        }
                    }
                    if (pointerEventPass == PointerEventPass.Initial && a0Var2.d) {
                        a0Var2.d(tvd0Var);
                        r.a(tvd0Var);
                    }
                    if (pointerEventPass == PointerEventPass.Main && !a0Var2.d && a0Var2.d(tvd0Var)) {
                        r.a(tvd0Var);
                    }
                }
            }
        }
    }

    @Override // defpackage.lix
    public final boolean o0(KeyEvent keyEvent) {
        long floatToRawIntBits;
        if (!this.x || ((!mhx.a(c9y.c(keyEvent), mhx.D) && !mhx.a(jcb1.a(keyEvent.getKeyCode()), mhx.C)) || c9y.f(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.S.d == Orientation.Vertical;
        f fVar = this.V;
        if (z) {
            int F0 = (int) (fVar.F0() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & Float.floatToRawIntBits(mhx.a(jcb1.a(keyEvent.getKeyCode()), mhx.C) ? F0 : -F0));
        } else {
            int F02 = (int) (fVar.F0() >> 32);
            floatToRawIntBits = (Float.floatToRawIntBits(0.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(mhx.a(jcb1.a(keyEvent.getKeyCode()), mhx.C) ? F02 : -F02) << 32);
        }
        tje.N(getCoroutineScope(), null, null, new ScrollableNode$onKeyEvent$1(this, floatToRawIntBits, null), 3);
        return true;
    }

    @Override // defpackage.e530
    public final void onAttach() {
        if (isAttached()) {
            fwi fwiVar = qje.P(this).R;
            g gVar = this.R;
            gVar.getClass();
            gVar.a = new hxg(new wor0(fwiVar));
        }
        q qVar = this.a0;
        if (qVar != null) {
            qVar.c = qje.P(this).R;
        }
        a0 a0Var = this.b0;
        if (a0Var != null) {
            a0Var.c = qje.P(this).R;
        }
    }

    @Override // defpackage.cqh, defpackage.gwd0
    public final void onDensityChange() {
        D();
        if (isAttached()) {
            fwi fwiVar = qje.P(this).R;
            g gVar = this.R;
            gVar.getClass();
            gVar.a = new hxg(new wor0(fwiVar));
        }
        q qVar = this.a0;
        if (qVar != null) {
            qVar.c = qje.P(this).R;
        }
        a0 a0Var = this.b0;
        if (a0Var != null) {
            a0Var.c = qje.P(this).R;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.foundation.gestures.w] */
    @Override // defpackage.gnq0
    public final void u(mnq0 mnq0Var) {
        if (this.x && (this.W == null || this.Z == null)) {
            this.W = new wls() { // from class: androidx.compose.foundation.gestures.w
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    float floatValue = ((Float) obj).floatValue();
                    float floatValue2 = ((Float) obj2).floatValue();
                    x xVar = x.this;
                    tje.N(xVar.getCoroutineScope(), null, null, new ScrollableNode$setScrollSemanticsActions$1$1(xVar, floatValue, floatValue2, null), 3);
                    return Boolean.TRUE;
                }
            };
            this.Z = new ScrollableNode$setScrollSemanticsActions$2(this, null);
        }
        w wVar = this.W;
        if (wVar != null) {
            androidx.compose.ui.semantics.f.i(mnq0Var, wVar);
        }
        wls wlsVar = this.Z;
        if (wlsVar != null) {
            kgx[] kgxVarArr = androidx.compose.ui.semantics.f.a;
            mnq0Var.a(androidx.compose.ui.semantics.a.e, wlsVar);
        }
    }

    @Override // defpackage.lix
    public final boolean y(KeyEvent keyEvent) {
        return false;
    }
}
