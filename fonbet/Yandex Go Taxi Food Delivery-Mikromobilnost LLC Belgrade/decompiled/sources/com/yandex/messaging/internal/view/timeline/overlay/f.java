package com.yandex.messaging.internal.view.timeline.overlay;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.ThreadChat;
import defpackage.b190;
import defpackage.e9h0;
import defpackage.i3y;
import defpackage.ifq0;
import defpackage.ike;
import defpackage.ip31;
import defpackage.jcz0;
import defpackage.kjs0;
import defpackage.lg;
import defpackage.lj91;
import defpackage.lun;
import defpackage.oew0;
import defpackage.ons0;
import defpackage.oyh0;
import defpackage.p4t;
import defpackage.ph;
import defpackage.sls;
import defpackage.vse;
import defpackage.wh;
import defpackage.wxy0;

/* loaded from: classes15.dex */
public final class f extends lun implements b190 {
    public final p4t B;
    public final com.yandex.messaging.domain.personal.mentions.a C;
    public final ViewGroup D;
    public jcz0 E;
    public boolean F;
    public ThreadChat G;
    public ServerMessageRef H;
    public boolean I;
    public boolean J;
    public sls K;
    public int L;
    public boolean M;
    public boolean N;
    public final ike O;
    public lg P;
    public final ons0 Q;
    public final i3y R;
    public int S;

    public f(p4t p4tVar, com.yandex.messaging.domain.personal.mentions.a aVar, vse vseVar, ViewGroup viewGroup, ip31 ip31Var) {
        super(viewGroup, ip31Var);
        this.B = p4tVar;
        this.C = aVar;
        this.D = viewGroup;
        int i = 9;
        androidx.core.view.b.p(viewGroup, new ifq0(i, this));
        this.F = true;
        this.O = vseVar.c(true);
        this.Q = new ons0(i, this);
        this.R = kotlin.a.a(new oew0(23, this));
    }

    @Override // defpackage.b190
    public final void e(int i) {
        if (this.S == i) {
            return;
        }
        this.S = i;
        u();
    }

    @Override // defpackage.b190
    public final Integer getWidth() {
        if (p()) {
            return Integer.valueOf(lj91.a(q().a).getWidth());
        }
        return null;
    }

    @Override // defpackage.b190
    public final void i(lg lgVar) {
        this.P = lgVar;
    }

    @Override // defpackage.b190
    public final lg m() {
        return this.P;
    }

    public final void o(wh whVar) {
        boolean p = p();
        ViewGroup viewGroup = this.D;
        if (p) {
            whVar.b(new ph(e9h0.action_open_thread, viewGroup.getResources().getString(oyh0.thread_counter_open_button_content_desc, q().b.getText())));
        } else {
            if (this.I || this.H == null || !this.F) {
                return;
            }
            whVar.b(new ph(e9h0.action_open_thread, viewGroup.getResources().getString(oyh0.thread_counter_open_thread_action_content_desc)));
        }
    }

    public final boolean p() {
        return this.L > 0 && this.F;
    }

    public final wxy0 q() {
        return (wxy0) this.R.getValue();
    }

    public final void r() {
        lg lgVar = this.P;
        if (lgVar != null) {
            lgVar.h((q().a.getWidth() - q().a.getPaddingStart()) - q().a.getPaddingEnd());
        }
    }

    public final boolean s(int i) {
        jcz0 jcz0Var;
        if (i != e9h0.action_open_thread) {
            return false;
        }
        if (p()) {
            q().a.performClick();
            return true;
        }
        ServerMessageRef serverMessageRef = this.H;
        if (serverMessageRef == null || (jcz0Var = this.E) == null) {
            return true;
        }
        jcz0Var.v(serverMessageRef);
        return true;
    }

    public final void u() {
        boolean p = p();
        View view = q().a;
        ons0 ons0Var = this.Q;
        view.removeOnLayoutChangeListener(ons0Var);
        if (p) {
            if (this.M) {
                TextView textView = q().b;
                textView.setPaddingRelative(textView.getPaddingStart(), textView.getPaddingTop(), q().e, textView.getPaddingBottom());
                q().b.setCompoundDrawablesRelative(null, null, q().d, null);
                q().c.setVisibility(8);
            } else {
                TextView textView2 = q().b;
                textView2.setPaddingRelative(textView2.getPaddingStart(), textView2.getPaddingTop(), q().f, textView2.getPaddingBottom());
                q().b.setCompoundDrawablesRelative(null, null, null, null);
                q().c.setVisibility(this.N ? 0 : 8);
            }
            this.D.setClipChildren(false);
            lg lgVar = this.P;
            if (lgVar != null) {
                lgVar.d = new ThreadCounterHelper$ClickDelegate(q().a);
            }
            View view2 = q().a;
            if (!this.w) {
                this.z = view2;
            }
            n();
            g(q().a.getPaddingEnd() - this.S, q().a.getPaddingBottom() + kjs0.b(16));
            q().a.addOnLayoutChangeListener(ons0Var);
            r();
        } else {
            c();
            lg lgVar2 = this.P;
            if (lgVar2 != null) {
                lgVar2.h(0);
            }
            lg lgVar3 = this.P;
            if (lgVar3 != null) {
                lgVar3.d = null;
            }
        }
        if (this.J != p) {
            this.J = p;
            sls slsVar = this.K;
            if (slsVar != null) {
                slsVar.invoke();
            }
        }
    }
}
