package com.yandex.messaging.internal.view.timeline.overlay;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.bricks.BrickBoundHelper;
import com.yandex.messaging.core.net.entities.proto.message.MessageRef;
import defpackage.b0u0;
import defpackage.b190;
import defpackage.fzw;
import defpackage.gas0;
import defpackage.i3y;
import defpackage.ike;
import defpackage.ip31;
import defpackage.jcz0;
import defpackage.kjs0;
import defpackage.lg;
import defpackage.lj91;
import defpackage.lun;
import defpackage.mth;
import defpackage.ons0;
import defpackage.ota0;
import defpackage.u4t;
import defpackage.vse;
import defpackage.yj6;

/* loaded from: classes15.dex */
public final class e extends lun implements b190, yj6 {
    public final u4t B;
    public final com.yandex.messaging.data.a C;
    public final ViewGroup D;
    public jcz0 E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final ike K;
    public final BrickBoundHelper L;
    public lg M;
    public final ons0 N;
    public final i3y O;
    public int P;

    public e(u4t u4tVar, com.yandex.messaging.data.a aVar, vse vseVar, ViewGroup viewGroup, ip31 ip31Var) {
        super(viewGroup, ip31Var);
        this.B = u4tVar;
        this.C = aVar;
        this.D = viewGroup;
        this.H = true;
        this.K = vseVar.c(true);
        this.L = new BrickBoundHelper(this);
        this.N = new ons0(3, this);
        this.O = kotlin.a.a(new gas0(27, this));
    }

    @Override // defpackage.yj6
    public final void C() {
        s();
    }

    @Override // defpackage.b190
    public final void e(int i) {
        this.P = i;
        r();
    }

    @Override // defpackage.b190
    public final Integer getWidth() {
        if (((Boolean) this.L.data()).booleanValue()) {
            return Integer.valueOf(lj91.a(o().a).getWidth());
        }
        return null;
    }

    @Override // defpackage.b190
    public final void i(lg lgVar) {
        this.M = lgVar;
    }

    @Override // defpackage.b190
    public final lg m() {
        return this.M;
    }

    public final b0u0 o() {
        return (b0u0) this.O.getValue();
    }

    @Override // defpackage.yj6, defpackage.ak6
    public final void onBrickAttach() {
        s();
        com.yandex.messaging.extension.flow.c.b(new fzw(25, new mth(this.C.a((MessageRef) this.L.key()), 6), this), this.K, new StarDecorationsHelper$onBrickAttach$2(this, null));
    }

    @Override // defpackage.yj6, defpackage.ak6
    public final void onBrickDetach() {
        kotlinx.coroutines.a.g(this.K.a, null);
    }

    public final void p() {
        lg lgVar = this.M;
        if (lgVar != null) {
            lgVar.h((o().a.getWidth() - o().a.getPaddingStart()) - o().a.getPaddingEnd());
        }
    }

    public final void q(boolean z) {
        if (this.J == z) {
            return;
        }
        this.J = z;
        if (z) {
            o().b.setText("");
            TextView textView = o().b;
            textView.setPaddingRelative(textView.getPaddingStart(), textView.getPaddingTop(), o().c - o().e, textView.getPaddingBottom());
        } else {
            o().b.setText(o().f);
            TextView textView2 = o().b;
            textView2.setPaddingRelative(textView2.getPaddingStart(), textView2.getPaddingTop(), o().d, textView2.getPaddingBottom());
        }
        r();
    }

    public final void r() {
        boolean z = this.F && this.H;
        View view = o().a;
        ons0 ons0Var = this.N;
        view.removeOnLayoutChangeListener(ons0Var);
        if (!z) {
            c();
            lg lgVar = this.M;
            if (lgVar != null) {
                lgVar.h(0);
            }
            lg lgVar2 = this.M;
            if (lgVar2 != null) {
                lgVar2.d = null;
                return;
            }
            return;
        }
        this.D.setClipChildren(false);
        View view2 = o().a;
        if (!this.w) {
            this.z = view2;
        }
        n();
        g(o().a.getPaddingEnd() - this.P, o().a.getPaddingBottom() + kjs0.b(16));
        lg lgVar3 = this.M;
        if (lgVar3 != null) {
            lgVar3.d = new StarDecorationsHelper$ClickDelegate(o().a);
        }
        o().a.addOnLayoutChangeListener(ons0Var);
        p();
    }

    public final void s() {
        ota0 ota0Var = (ota0) this.C.d.get((MessageRef) this.L.key());
        Boolean valueOf = ota0Var != null ? Boolean.valueOf(ota0Var.b) : null;
        boolean booleanValue = valueOf != null ? valueOf.booleanValue() : this.I;
        if (booleanValue != this.F) {
            this.F = booleanValue;
            r();
        }
    }

    @Override // defpackage.yj6
    public final boolean t(Object obj, Object obj2) {
        return ((MessageRef) obj).equals((MessageRef) obj2);
    }
}
