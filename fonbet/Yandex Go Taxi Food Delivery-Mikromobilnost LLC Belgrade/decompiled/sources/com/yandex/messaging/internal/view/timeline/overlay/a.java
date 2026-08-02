package com.yandex.messaging.internal.view.timeline.overlay;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.bricks.BrickBoundHelper;
import com.yandex.messaging.core.net.entities.proto.message.MessageRef;
import defpackage.b190;
import defpackage.c1o;
import defpackage.i3y;
import defpackage.ike;
import defpackage.ip31;
import defpackage.j5o;
import defpackage.kjs0;
import defpackage.lg;
import defpackage.lj91;
import defpackage.lun;
import defpackage.vse;
import defpackage.yj6;
import defpackage.yln;

/* loaded from: classes15.dex */
public final class a extends lun implements b190, yj6 {
    public final ViewGroup B;
    public boolean C;
    public boolean D;
    public final ike E;
    public final BrickBoundHelper F;
    public lg G;
    public final yln H;
    public final i3y I;
    public int J;

    public a(vse vseVar, ViewGroup viewGroup, ip31 ip31Var) {
        super(viewGroup, ip31Var);
        this.B = viewGroup;
        this.D = true;
        this.E = vseVar.c(true);
        this.F = new BrickBoundHelper(this);
        this.H = new yln(1, this);
        this.I = kotlin.a.a(new c1o(1, this));
    }

    @Override // defpackage.yj6
    public final void C() {
        q();
    }

    @Override // defpackage.b190
    public final void e(int i) {
        this.J = i;
        q();
    }

    @Override // defpackage.b190
    public final Integer getWidth() {
        if (this.C) {
            return Integer.valueOf(lj91.a(o().a).getWidth());
        }
        return null;
    }

    @Override // defpackage.b190
    public final void i(lg lgVar) {
        this.G = lgVar;
    }

    @Override // defpackage.b190
    public final lg m() {
        return this.G;
    }

    public final j5o o() {
        return (j5o) this.I.getValue();
    }

    @Override // defpackage.yj6, defpackage.ak6
    public final void onBrickAttach() {
        q();
    }

    @Override // defpackage.yj6, defpackage.ak6
    public final void onBrickDetach() {
        kotlinx.coroutines.a.g(this.E.a, null);
    }

    public final void p() {
        lg lgVar = this.G;
        if (lgVar != null) {
            lgVar.h((o().a.getWidth() - o().a.getPaddingStart()) - o().a.getPaddingEnd());
        }
    }

    public final void q() {
        View view = o().a;
        yln ylnVar = this.H;
        view.removeOnLayoutChangeListener(ylnVar);
        if (!this.C || !this.D) {
            c();
            lg lgVar = this.G;
            if (lgVar != null) {
                lgVar.h(0);
            }
            lg lgVar2 = this.G;
            if (lgVar2 != null) {
                lgVar2.d = null;
                return;
            }
            return;
        }
        this.B.setClipChildren(false);
        View view2 = o().a;
        if (!this.w) {
            this.z = view2;
        }
        n();
        g(o().a.getPaddingEnd() - this.J, o().a.getPaddingBottom() + kjs0.b(16));
        lg lgVar3 = this.G;
        if (lgVar3 != null) {
            lgVar3.d = new EphemeralDecorationsHelper$ClickDelegate(o().a);
        }
        o().a.addOnLayoutChangeListener(ylnVar);
        p();
    }

    @Override // defpackage.yj6
    public final boolean t(Object obj, Object obj2) {
        return ((MessageRef) obj).equals((MessageRef) obj2);
    }
}
