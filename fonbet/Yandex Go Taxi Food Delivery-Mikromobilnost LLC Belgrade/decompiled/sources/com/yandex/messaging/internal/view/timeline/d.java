package com.yandex.messaging.internal.view.timeline;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.MessageSpan;
import defpackage.a7b;
import defpackage.dmt0;
import defpackage.dx10;
import defpackage.e9h0;
import defpackage.evu0;
import defpackage.fxa1;
import defpackage.gl;
import defpackage.h3y;
import defpackage.ht10;
import defpackage.i3y;
import defpackage.j6m;
import defpackage.jl40;
import defpackage.jng0;
import defpackage.jqr;
import defpackage.jwf;
import defpackage.llg0;
import defpackage.lqo;
import defpackage.m6;
import defpackage.mw10;
import defpackage.ooy0;
import defpackage.p8b;
import defpackage.sbb;
import defpackage.tb5;
import defpackage.tz10;
import defpackage.uds0;
import defpackage.ult0;
import defpackage.uv10;
import defpackage.v3k0;
import defpackage.vb5;
import defpackage.x3;
import defpackage.yab;
import defpackage.z9z0;
import java.util.List;

/* loaded from: classes15.dex */
public abstract class d extends c implements llg0 {
    public final AppCompatTextView B2;
    public String C2;
    public a0 H2;
    public final i3y N2;
    public final jwf x2;
    public final ht10 y2;

    public d(boolean z, View view, jwf jwfVar) {
        super(z, view, jwfVar);
        this.x2 = jwfVar;
        this.y2 = (ht10) jwfVar.x;
        this.B2 = (AppCompatTextView) view.findViewById(e9h0.chat_message_text);
        this.N2 = kotlin.a.a(new tb5(this, 0));
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final Drawable A0(z9z0 z9z0Var, boolean z, boolean z2) {
        mw10 mw10Var = this.O0;
        if (mw10Var != null && mw10Var.A) {
            return null;
        }
        return z9z0Var.a(z, z2, this.R, this.v2.x.F, G0());
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final int B0() {
        return 0;
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final /* bridge */ /* synthetic */ View C0() {
        return this.B2;
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final void I0(boolean z) {
        this.p2 = z;
        mw10 mw10Var = this.O0;
        if (mw10Var == null || mw10Var.w == z) {
            return;
        }
        mw10Var.w = z;
        mw10Var.d();
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final void J0(String str, boolean z) {
        AppCompatTextView appCompatTextView = this.B2;
        CharSequence text = appCompatTextView.getText();
        appCompatTextView.setContentDescription(z0(text != null ? text.toString() : null, z));
        y0(appCompatTextView);
    }

    public final dx10 K0() {
        return (dx10) this.N2.getValue();
    }

    @Override // defpackage.qdz0
    public final boolean W() {
        return this.v2.b();
    }

    @Override // com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public void X(yab yabVar, vb5 vb5Var) {
        AppCompatTextView appCompatTextView;
        CharSequence text;
        String obj;
        String spannableStringBuilder;
        int H;
        boolean z;
        super.X(yabVar, vb5Var);
        mw10 mw10Var = this.O0;
        if (mw10Var != null) {
            mw10Var.a.setVisibility(0);
        }
        MessageData R = yabVar.R();
        gl glVar = this.L0;
        int l = glVar.l();
        m6 m6Var = new m6(18, this);
        l lVar = e0().g;
        jwf jwfVar = this.x2;
        this.O0 = new mw10(this.B2, m6Var, this.I0, lVar, (v3k0) ((ooy0) jwfVar.q).b(e0().g), (ult0) jwfVar.o, (lqo) jwfVar.i, ((j6m) ((h3y) jwfVar.R).get()).c ? new tb5(this, 1) : null, 128);
        MessageData R2 = yabVar.R();
        String str = R2.text;
        if (!jl40.l(R2.urlPreviewDisabled, Boolean.TRUE) && str != null) {
            dx10 K0 = K0();
            String d = yabVar.d();
            long z0 = yabVar.z0();
            List<MessageSpan> list = R2.textSpans;
            boolean R0 = yabVar.R0();
            boolean z2 = yabVar.n0() != null;
            K0.h = glVar;
            K0.d = this;
            K0.i = d;
            K0.j = z0;
            K0.k = str;
            K0.l = list;
            K0.m = l;
            K0.n = R0;
            K0.o = z2;
            x3 x3Var = K0.f;
            if (x3Var != null) {
                x3Var.Rg();
            }
            K0.f = null;
        }
        mw10 mw10Var2 = this.O0;
        if (mw10Var2 != null && mw10Var2.x != (z = this.t0.i)) {
            mw10Var2.x = z;
            mw10Var2.d();
        }
        String str2 = this.c0;
        if (str2 != null) {
            kotlinx.coroutines.flow.e.H(this.w0, new jqr(e0().s.a(p8b.a(str2)), new BaseTextMessageViewHolder$bind$3$1(this, R, l, null), 3));
        }
        mw10 mw10Var3 = this.O0;
        if (mw10Var3 != null) {
            mw10Var3.e(R, l);
            if (mw10Var3.A) {
                glVar.p();
            } else {
                glVar.o();
            }
        }
        this.v2.a(this.t0, yabVar, e0().f);
        String str3 = this.C2;
        if (str3 == null || (text = (appCompatTextView = this.B2).getText()) == null || (obj = text.toString()) == null || (H = evu0.H(obj, (spannableStringBuilder = ((v3k0) ((ooy0) jwfVar.q).a()).b(0, str3).toString()), 0, false, 6)) < 0) {
            return;
        }
        int length = spannableStringBuilder.length() + H;
        int i = fxa1.c(jng0.dsTextBrand, appCompatTextView.getContext()).data;
        a0 a0Var = new a0(appCompatTextView);
        this.H2 = a0Var;
        a0.b(a0Var, H, length, i);
        this.C2 = null;
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final boolean b0() {
        return true;
    }

    @Override // com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public final void f0() {
        super.f0();
        a0 a0Var = this.H2;
        if (a0Var != null) {
            a0Var.a();
        }
        this.H2 = null;
        mw10 mw10Var = this.O0;
        if (mw10Var != null) {
            mw10Var.a();
        }
        this.O0 = null;
        this.v2.e();
        K0().a();
        View view = this.B1;
        if (view != null) {
            this.L0.k(view);
        }
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final void g0() {
        f0();
        dx10 K0 = K0();
        uds0 uds0Var = K0.e;
        if (uds0Var != null) {
            uds0Var.close();
        }
        K0.e = null;
        x3 x3Var = K0.f;
        if (x3Var != null) {
            x3Var.Rg();
        }
        K0.f = null;
    }

    @Override // defpackage.llg0
    public final void i(a7b a7bVar, sbb sbbVar, boolean z) {
        mw10 mw10Var = this.O0;
        if (mw10Var == null) {
            return;
        }
        mw10Var.c(new QuoteTextSelectionCallback(this.B2, (dmt0) this.x2.p, a7bVar, sbbVar, new BaseTextMessageViewHolder$enableQuoteTextSelection$callback$1(0, this, d.class, "disableQuoteTextSelection", "disableQuoteTextSelection()V", 0)), z);
    }

    @Override // com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public void i0(Canvas canvas, z9z0 z9z0Var, boolean z, boolean z2) {
        mw10 mw10Var;
        super.i0(canvas, z9z0Var, z, z2);
        if (!((lqo) this.x2.i).a(tz10.D) || (mw10Var = this.O0) == null) {
            return;
        }
        mw10Var.b(canvas, this.H1);
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final ht10 j0() {
        return this.y2;
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final m l0() {
        return e0().a;
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final boolean n0() {
        ServerMessageRef serverMessageRef;
        String str;
        boolean n0 = super.n0();
        if (n0 && p0()) {
            uv10 uv10Var = this.m0.a;
            if ((uv10Var != null ? uv10Var.b.a.size() : 0) <= 1 && (serverMessageRef = this.T1) != null && (str = this.c0) != null) {
                e0().f.r(str, serverMessageRef);
            }
        }
        return n0;
    }

    @Override // defpackage.llg0
    public final ServerMessageRef r() {
        return this.T1;
    }

    @Override // defpackage.llg0
    public final void z(String str) {
        this.C2 = str;
    }
}
