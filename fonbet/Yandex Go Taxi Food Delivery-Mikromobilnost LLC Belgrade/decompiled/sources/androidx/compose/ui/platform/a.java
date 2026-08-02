package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.layout.x;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import defpackage.aa10;
import defpackage.bcb1;
import defpackage.bmm0;
import defpackage.bur;
import defpackage.c9y;
import defpackage.cji0;
import defpackage.cqh;
import defpackage.dd11;
import defpackage.e530;
import defpackage.fcb1;
import defpackage.fia1;
import defpackage.gnq0;
import defpackage.k851;
import defpackage.lix;
import defpackage.loz;
import defpackage.lqa1;
import defpackage.mhx;
import defpackage.mnq0;
import defpackage.nk6;
import defpackage.oz40;
import defpackage.rzx;
import defpackage.sls;
import defpackage.tls;
import defpackage.v0y;
import defpackage.wwg;
import defpackage.wx40;
import defpackage.x910;
import defpackage.xtr;
import defpackage.xy40;
import defpackage.z5w;
import defpackage.zii0;
import defpackage.zy11;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public final class a extends e530 implements nk6, gnq0, lix, v0y, dd11, cqh {
    public int a = -1;
    public final tls b = new tls() { // from class: androidx.compose.ui.platform.AndroidComposeView$RootModifierNode$rulerLambda$1
        {
            super(1);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            loz lozVar = (loz) obj;
            a aVar = a.this;
            aVar.a = aVar.c.getInsetsListener().getGeneration().getIntValue();
            a aVar2 = a.this;
            int i = aVar2.a;
            AndroidComposeView androidComposeView = aVar2.c;
            if (i > 0) {
                wx40 wx40Var = x.a;
                lozVar.a = true;
                LookaheadCapablePlaceable lookaheadCapablePlaceable = lozVar.w;
                rzx H0 = lookaheadCapablePlaceable.H0();
                if (z5w.a(lozVar.b, 9223372034707292159L)) {
                    lozVar.b = wwg.V(H0.mo43localToScreenMKHz9U(0L));
                    lozVar.c = H0.e();
                }
                lookaheadCapablePlaceable.Q().b0.b();
                long e = H0.e();
                bmm0 insetsValues = androidComposeView.getInsetsListener().getInsetsValues();
                int i2 = (int) (e >> 32);
                int i3 = (int) (e & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                for (androidx.compose.ui.layout.v vVar : x.b) {
                    k851 k851Var = (k851) insetsValues.d(vVar);
                    x.a(lozVar, ((androidx.compose.ui.layout.w) vVar).c, k851Var.h, i2, i3);
                    if (((Boolean) k851Var.b.getValue()).booleanValue()) {
                        x.a(lozVar, k851Var.f, k851Var.j, i2, i3);
                        x.a(lozVar, k851Var.g, k851Var.k, i2, i3);
                    }
                    x.a(lozVar, ((androidx.compose.ui.layout.w) vVar).d, k851Var.i, i2, i3);
                }
                xy40 displayCutouts = androidComposeView.getInsetsListener().getDisplayCutouts();
                if (displayCutouts.e()) {
                    SnapshotStateList<cji0> displayCutoutRulers = androidComposeView.getInsetsListener().getDisplayCutoutRulers();
                    Object[] objArr = displayCutouts.a;
                    int i4 = displayCutouts.b;
                    for (int i5 = 0; i5 < i4; i5++) {
                        oz40 oz40Var = (oz40) objArr[i5];
                        cji0 cji0Var = displayCutoutRulers.get(i5);
                        Rect rect = (Rect) oz40Var.getValue();
                        lozVar.a(cji0Var.c(), rect.left);
                        lozVar.a(cji0Var.d(), rect.top);
                        lozVar.a(cji0Var.b(), rect.right);
                        lozVar.a(cji0Var.a(), rect.bottom);
                    }
                }
            }
            return zy11.a;
        }
    };
    public final /* synthetic */ AndroidComposeView c;

    public a(AndroidComposeView androidComposeView) {
        this.c = androidComposeView;
    }

    @Override // defpackage.dd11
    public final Object V() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.v0y
    public final aa10 e(androidx.compose.ui.layout.k kVar, x910 x910Var, long j) {
        final androidx.compose.ui.layout.o l0 = x910Var.l0(j);
        return kVar.E(l0.a, l0.b, kotlin.collections.b.f(), this.b, new tls() { // from class: androidx.compose.ui.platform.AndroidComposeView$RootModifierNode$measure$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                ((o.a) obj).g(androidx.compose.ui.layout.o.this, 0, 0, 0.0f);
                return zy11.a;
            }
        });
    }

    @Override // defpackage.lix
    public final boolean o0(KeyEvent keyEvent) {
        final xtr a;
        int[] iArr = bur.a;
        long c = c9y.c(keyEvent);
        int i = mhx.O;
        if (mhx.a(c, bcb1.j())) {
            a = xtr.a(2);
        } else if (mhx.a(c, bcb1.i())) {
            a = xtr.a(1);
        } else if (mhx.a(c, bcb1.n())) {
            a = xtr.a(c9y.g(keyEvent) ? 2 : 1);
        } else {
            a = mhx.a(c, bcb1.e()) ? xtr.a(4) : mhx.a(c, bcb1.d()) ? xtr.a(3) : (mhx.a(c, bcb1.f()) || mhx.a(c, bcb1.m())) ? xtr.a(5) : (mhx.a(c, bcb1.c()) || mhx.a(c, bcb1.l())) ? xtr.a(6) : (mhx.a(c, bcb1.b()) || mhx.a(c, bcb1.g()) || mhx.a(c, bcb1.k())) ? xtr.a(7) : (mhx.a(c, bcb1.a()) || mhx.a(c, bcb1.h())) ? xtr.a(8) : null;
        }
        if (a == null || !fcb1.b(c9y.f(keyEvent), 2)) {
            return false;
        }
        AndroidComposeView androidComposeView = this.c;
        androidx.compose.ui.focus.d i2 = ((androidx.compose.ui.focus.c) androidComposeView.getFocusOwner()).i();
        if (i2 == null || !i2.a || !androidComposeView.mo67moveFocusInChildren3ESFkO8(a.d())) {
            Boolean h = ((androidx.compose.ui.focus.c) androidComposeView.getFocusOwner()).h(a.d(), androidComposeView.getEmbeddedViewFocusRect(), new tls() { // from class: androidx.compose.ui.platform.AndroidComposeView$RootModifierNode$onKeyEvent$focusWasMovedOrCancelled$1
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(((androidx.compose.ui.focus.d) obj).L0(xtr.this.a));
                }
            });
            if (!(h != null ? h.booleanValue() : true)) {
                if (!lqa1.c(a.d())) {
                    return false;
                }
                Integer c2 = bur.c(a.d());
                View findNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) androidComposeView.getRootView(), androidComposeView.getView(), c2 != null ? c2.intValue() : 2);
                if (findNextFocus == null || findNextFocus.equals(androidComposeView)) {
                    return ((androidx.compose.ui.focus.c) androidComposeView.getFocusOwner()).k(a.d());
                }
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.gnq0
    public final void u(mnq0 mnq0Var) {
    }

    @Override // defpackage.lix
    public final boolean y(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.nk6
    public final Object z0(androidx.compose.ui.node.s sVar, sls slsVar, ContinuationImpl continuationImpl) {
        long v = sVar.v(0L);
        zii0 zii0Var = (zii0) slsVar.invoke();
        zii0 j = zii0Var != null ? zii0Var.j(v) : null;
        if (j != null) {
            this.c.requestRectangleOnScreen(fia1.e(j), false);
        }
        return zy11.a;
    }
}
