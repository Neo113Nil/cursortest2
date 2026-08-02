package com.yandex.messaging.internal.view.timeline;

import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.messaging.base.rights.ChatRightsFlag;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.view.timeline.common.MessageSendStatus;
import com.yandex.messaging.views.AppCompatEmojiTextView;
import defpackage.ak51;
import defpackage.arg;
import defpackage.b4b;
import defpackage.b64;
import defpackage.e190;
import defpackage.e45;
import defpackage.e9h0;
import defpackage.ex0;
import defpackage.f45;
import defpackage.fxa1;
import defpackage.g45;
import defpackage.g62;
import defpackage.g8e;
import defpackage.gl;
import defpackage.gvg0;
import defpackage.gw10;
import defpackage.h3y;
import defpackage.ht10;
import defpackage.hw10;
import defpackage.i3y;
import defpackage.ip31;
import defpackage.iv31;
import defpackage.iw10;
import defpackage.j3b;
import defpackage.jl40;
import defpackage.jn3;
import defpackage.jng0;
import defpackage.job1;
import defpackage.jwf;
import defpackage.kb;
import defpackage.kgx;
import defpackage.kjs0;
import defpackage.m6;
import defpackage.mg;
import defpackage.mw10;
import defpackage.nw10;
import defpackage.o501;
import defpackage.okb1;
import defpackage.oyh0;
import defpackage.oyr;
import defpackage.pj91;
import defpackage.pm5;
import defpackage.pv10;
import defpackage.pw10;
import defpackage.q0k;
import defpackage.qp3;
import defpackage.qw10;
import defpackage.s8b;
import defpackage.t190;
import defpackage.tf;
import defpackage.tje;
import defpackage.tm1;
import defpackage.tmt0;
import defpackage.tu10;
import defpackage.u0r;
import defpackage.ub5;
import defpackage.ul6;
import defpackage.vb5;
import defpackage.wkb1;
import defpackage.wtb1;
import defpackage.wwg0;
import defpackage.x4b0;
import defpackage.xkb1;
import defpackage.yab;
import defpackage.ymu;
import defpackage.z83;
import defpackage.z9z0;
import defpackage.zf0;
import defpackage.zoy0;
import defpackage.zyj;
import java.util.ArrayList;
import java.util.Date;

/* loaded from: classes15.dex */
public abstract class c extends e {
    public final jwf B0;
    public final View B1;
    public final jn3 C0;
    public final a C1;
    public final q0k D0;
    public zyj E0;
    public String F0;
    public boolean G0;
    public String H0;
    public final ip31 H1;
    public final tmt0 I0;
    public final h3y J0;
    public final i3y K0;
    public final gl L0;
    public final i3y M0;
    public final iw10 N0;
    public zyj N1;
    public mw10 O0;
    public x4b0 P0;
    public final i3y Q0;
    public final ImageView R0;
    public boolean S0;
    public boolean T0;
    public ServerMessageRef T1;
    public MessageData V1;
    public final o501 X1;
    public final int p1;
    public boolean p2;
    public final int v1;
    public final com.yandex.messaging.internal.view.timeline.overlay.b v2;
    public final iv31 x1;
    public final ViewGroup y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z, View view, jwf jwfVar) {
        super(z, view, jwfVar);
        kb kbVar = (kb) jwfVar.M;
        e190 e190Var = (e190) jwfVar.n;
        this.B0 = jwfVar;
        this.C0 = (jn3) jwfVar.h;
        this.D0 = (q0k) jwfVar.r;
        this.I0 = (tmt0) jwfVar.t;
        this.J0 = (h3y) jwfVar.u;
        this.K0 = kotlin.a.a(new e45(this, 0));
        Context context = view.getContext();
        arg argVar = (arg) jwfVar.v;
        gl glVar = new gl();
        glVar.b = context;
        glVar.c = argVar;
        glVar.a = z;
        glVar.w = new gw10(0);
        this.L0 = glVar;
        this.M0 = kotlin.a.a(new e45(this, 1));
        int i = 3;
        this.Q0 = kotlin.a.a(new ex0(view, this, z, i));
        this.R0 = (ImageView) view.findViewById(e9h0.dialog_item_error_icon);
        i3y a = kotlin.a.a(new e45(this, 2));
        i3y a2 = kotlin.a.a(new e45(this, i));
        this.X1 = o501.x;
        this.p2 = true;
        z83.h(null, view instanceof b4b);
        int i2 = e9h0.forwarded_message;
        this.x1 = new iv31(view, i2, i2);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(e9h0.timeline_message_container);
        this.y1 = viewGroup;
        if (z || !(((Boolean) a.getValue()).booleanValue() || ((Boolean) a2.getValue()).booleanValue())) {
            ip31 ip31Var = new ip31(viewGroup);
            this.H1 = ip31Var;
            this.v2 = e190Var.a((ViewGroup) view, ip31Var, this.z0);
        } else {
            ul6 ul6Var = new ul6(viewGroup);
            this.H1 = ul6Var;
            t190 t190Var = new t190(viewGroup);
            com.yandex.messaging.internal.view.timeline.overlay.b a3 = e190Var.a((ViewGroup) view, t190Var, this.z0);
            this.v2 = a3;
            tm1 tm1Var = new tm1(kbVar.b(this, this.t0.g), kbVar.a(this));
            iw10 iw10Var = new iw10();
            this.N0 = iw10Var;
            zoy0 zoy0Var = a.i;
            pm5 pm5Var = new pm5(7, new g62[]{ul6Var, t190Var});
            e45 e45Var = new e45(this, 4);
            zoy0Var.getClass();
            this.C1 = new a(viewGroup, pm5Var, a3, tm1Var, iw10Var, jwfVar, e45Var);
        }
        View findViewById = view.findViewById(e9h0.message_status_and_time_group);
        this.B1 = findViewById;
        TypedValue typedValue = new TypedValue();
        TypedValue typedValue2 = new TypedValue();
        ViewGroup viewGroup2 = (ViewGroup) view;
        viewGroup2.getResources().getValue(gvg0.inner_container_small_radii, typedValue, true);
        viewGroup2.getResources().getValue(gvg0.inner_container_bare_radii, typedValue2, true);
        this.p1 = (int) typedValue.getFloat();
        this.v1 = (int) typedValue2.getFloat();
        if (findViewById != null) {
            glVar.k(findViewById);
        }
        viewGroup2.setBackground(new RippleDrawable(ColorStateList.valueOf(job1.g(fxa1.c(jng0.messagingCommonAccentColor, viewGroup2.getContext()).data, 0.1f)), null, new ColorDrawable(-1)));
    }

    public Drawable A0(z9z0 z9z0Var, boolean z, boolean z2) {
        return null;
    }

    public abstract int B0();

    public abstract View C0();

    public ServerMessageRef D0() {
        if (e0().b.i && e0().b.e && this.C0.c() && this.t0.c) {
            return this.T1;
        }
        return null;
    }

    public final pv10 E0() {
        return (pv10) this.Q0.getValue();
    }

    public ak51 F0() {
        return this.X1;
    }

    public final boolean G0() {
        com.yandex.messaging.internal.view.timeline.translations.c cVar = (com.yandex.messaging.internal.view.timeline.translations.c) this.M0.getValue();
        return cVar != null && cVar.n;
    }

    public void H0() {
        zf0 zf0Var = this.T;
        zf0Var.a = true;
        zf0Var.b();
        this.R0.setOnClickListener(new tf(16, this));
    }

    public void I0(boolean z) {
        this.p2 = z;
    }

    public abstract void J0(String str, boolean z);

    @Override // com.yandex.messaging.internal.view.timeline.e
    public void X(yab yabVar, vb5 vb5Var) {
        String W;
        super.X(yabVar, vb5Var);
        tje.N(this.v0, null, null, new BaseMessageViewHolder$bind$1(this, null), 3);
        this.T1 = yabVar.q0();
        ub5 ub5Var = this.t0;
        gl glVar = this.L0;
        glVar.getClass();
        gw10 gw10Var = (gw10) glVar.w;
        Cursor cursor = yabVar.a;
        MessageSendStatus messageSendStatus = yabVar.U() <= yabVar.b ? MessageSendStatus.Seen : yabVar.W0() ? MessageSendStatus.Sent : MessageSendStatus.Pending;
        gw10Var.a = messageSendStatus;
        hw10 hw10Var = (hw10) glVar.x;
        if (hw10Var != null) {
            MessageSendStatus messageSendStatus2 = MessageSendStatus.Seen;
            hw10Var.b(messageSendStatus == MessageSendStatus.Sent || messageSendStatus == messageSendStatus2, messageSendStatus == messageSendStatus2);
        }
        if (ub5Var.f) {
            Date T = yabVar.T();
            gw10Var.e = T;
            hw10 hw10Var2 = (hw10) glVar.x;
            if (hw10Var2 != null) {
                ht10 ht10Var = hw10Var2.g;
                TextView textView = (TextView) ht10Var.c;
                textView.setVisibility(0);
                textView.setText(((arg) ht10Var.b).a.format(T));
            }
            int i = (int) cursor.getLong(13);
            gw10Var.d = i;
            hw10 hw10Var3 = (hw10) glVar.x;
            if (hw10Var3 != null) {
                TextView textView2 = hw10Var3.d.a;
                textView2.setVisibility(i != 0 ? 0 : 8);
                textView2.setText(wtb1.a(i));
            }
            int i2 = (int) cursor.getLong(17);
            gw10Var.c = i2;
            hw10 hw10Var4 = (hw10) glVar.x;
            if (hw10Var4 != null) {
                TextView textView3 = hw10Var4.c.a;
                textView3.setVisibility(i2 != 0 ? 0 : 8);
                textView3.setText(wtb1.a(i2));
            }
            boolean k = wkb1.k(cursor.getLong(2), 8L);
            gw10Var.b = k;
            hw10 hw10Var5 = (hw10) glVar.x;
            if (hw10Var5 != null) {
                ((ImageView) hw10Var5.f.c).setVisibility(k ? 0 : 8);
            }
        } else {
            gw10Var.e = null;
            hw10 hw10Var6 = (hw10) glVar.x;
            if (hw10Var6 != null) {
                TextView textView4 = (TextView) hw10Var6.g.c;
                textView4.setVisibility(4);
                textView4.setText((CharSequence) null);
            }
            gw10Var.d = 0;
            hw10 hw10Var7 = (hw10) glVar.x;
            if (hw10Var7 != null) {
                TextView textView5 = hw10Var7.d.a;
                textView5.setVisibility(8);
                textView5.setText(wtb1.a(0));
            }
            gw10Var.c = 0;
            hw10 hw10Var8 = (hw10) glVar.x;
            if (hw10Var8 != null) {
                TextView textView6 = hw10Var8.c.a;
                textView6.setVisibility(8);
                textView6.setText(wtb1.a(0));
            }
            gw10Var.b = false;
            hw10 hw10Var9 = (hw10) glVar.x;
            if (hw10Var9 != null) {
                ((ImageView) hw10Var9.f.c).setVisibility(8);
            }
        }
        glVar.l();
        zyj zyjVar = this.N1;
        if (zyjVar != null) {
            zyjVar.close();
        }
        this.N1 = null;
        this.S0 = yabVar.n0() != null;
        this.T0 = yabVar.R0();
        MessageData R = yabVar.R();
        this.V1 = R;
        if (!cursor.isFirst() && (yabVar.n() || yabVar.R0())) {
            Long D0 = yabVar.D0();
            yabVar.moveToPrevious();
            Long D02 = yabVar.D0();
            yabVar.moveToNext();
            jl40.l(D0, D02);
        }
        if (!cursor.isLast() && (yabVar.n() || yabVar.R0())) {
            Long D03 = yabVar.D0();
            yabVar.moveToNext();
            Long D04 = yabVar.D0();
            yabVar.moveToPrevious();
            jl40.l(D03, D04);
        }
        if (B0() != 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) C0().getLayoutParams();
            int b = (this.S0 || this.T0) ? kjs0.b(B0()) : kjs0.b(0);
            if (b != marginLayoutParams.topMargin) {
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, b, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                C0().setLayoutParams(marginLayoutParams);
            }
        }
        pv10 E0 = E0();
        E0.getClass();
        E0.I = yabVar.d();
        E0.K = yabVar.n0();
        E0.P = yabVar.q0();
        E0.Q = Boolean.valueOf(yabVar.a1());
        E0.d();
        String str = this.c0;
        q0k q0kVar = this.D0;
        iv31 iv31Var = this.x1;
        if (str != null) {
            boolean R0 = yabVar.R0();
            String k2 = yabVar.k();
            String f0 = yabVar.f0();
            Long g0 = yabVar.g0();
            if (!R0 || k2 == null) {
                iv31Var.c(8);
            } else {
                this.N1 = q0kVar.b(k2, gvg0.avatar_size_24, new m6(15, this));
                iv31Var.c(0);
                ((AppCompatEmojiTextView) iv31Var.a()).setOnClickListener(new g45(this, str, f0, k2, g0, 0));
            }
        }
        pv10 E02 = E0();
        View view = E02.a;
        boolean z = E02.c;
        if (E02.I != null && E02.K != null) {
            int i3 = z ? fxa1.c(jng0.messagingOutgoingPrimaryColor, view.getContext()).data : fxa1.c(jng0.messagingIncomingPrimaryColor, view.getContext()).data;
            View view2 = E02.a;
            int i4 = z ? fxa1.c(jng0.messagingOutgoingSecondaryColor, view2.getContext()).data : fxa1.c(jng0.messagingIncomingSecondaryColor, view2.getContext()).data;
            E02.a().b.setBackgroundResource(z ? wwg0.msg_reply_line_own : wwg0.msg_reply_line_other);
            E02.a().c.setTextColor(i3);
            E02.a().a.setTextColor(i4);
            E02.a().e.setColorFilter((z ? fxa1.c(jng0.dsTextBrand, view.getContext()) : fxa1.c(jng0.messagingCommonIconsSecondaryColor, view.getContext())).data);
        }
        pv10 E03 = E0();
        boolean z2 = E03.c;
        View view3 = E03.a;
        int i5 = z2 ? fxa1.c(jng0.messagingOutgoingSecondaryColor, view3.getContext()).data : fxa1.c(jng0.messagingIncomingSecondaryColor, view3.getContext()).data;
        if (iv31Var.b()) {
            ((AppCompatEmojiTextView) iv31Var.a()).setTextColor(i5);
        }
        if (R.detentionReason != 0) {
            H0();
        }
        String str2 = this.c0;
        if (str2 != null && (W = yabVar.W()) != null) {
            F0().j(str2, W);
        }
        String a = yabVar.a();
        zyj zyjVar2 = this.E0;
        if (zyjVar2 != null) {
            zyjVar2.close();
        }
        this.E0 = null;
        this.F0 = null;
        boolean b1 = yabVar.b1();
        this.G0 = b1;
        this.H0 = a;
        if (this.R) {
            J0(a, b1);
        } else {
            this.E0 = q0kVar.b(a, 0, new f45(this, b1, a));
        }
        this.v2.z.K = new e45(this, 5);
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public boolean Y() {
        return this.p2;
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public void f0() {
        super.f0();
        pv10 E0 = E0();
        if (E0.K != null) {
            E0.K = null;
            ymu ymuVar = E0.N;
            kgx[] kgxVarArr = pv10.T;
            ymuVar.setValue(E0, kgxVarArr[2], null);
            qp3 qp3Var = E0.L;
            kgx kgxVar = kgxVarArr[0];
            qp3Var.b(null);
            E0.P = null;
            qp3 qp3Var2 = E0.M;
            kgx kgxVar2 = kgxVarArr[1];
            qp3Var2.b(null);
            E0.O = null;
            E0.a().c.setAlpha(1.0f);
            TextView textView = E0.a().c;
            textView.setTypeface(textView.getTypeface(), 0);
            E0.b();
            ((u0r) E0.H.getValue()).a();
        }
        zyj zyjVar = this.N1;
        if (zyjVar != null) {
            zyjVar.close();
        }
        this.N1 = null;
        zyj zyjVar2 = this.E0;
        if (zyjVar2 != null) {
            zyjVar2.close();
        }
        this.E0 = null;
        this.F0 = null;
        this.V1 = null;
        this.G0 = false;
        this.H0 = null;
        this.v2.z.K = null;
        ((b4b) this.a).cleanup();
        F0().cleanup();
        kotlinx.coroutines.a.g(this.v0.a, null);
        kotlinx.coroutines.a.g(this.w0.a, null);
        com.yandex.messaging.internal.view.timeline.translations.c cVar = (com.yandex.messaging.internal.view.timeline.translations.c) this.M0.getValue();
        if (cVar != null) {
            cVar.e(pw10.c);
            cVar.r = null;
            kotlinx.coroutines.a.g(cVar.o.a, null);
        }
        a aVar = this.C1;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public void i0(Canvas canvas, z9z0 z9z0Var, boolean z, boolean z2) {
        Drawable A0 = A0(z9z0Var, z, z2);
        if (A0 != null) {
            A0.setLayoutDirection(this.a.getLayoutDirection());
            ip31 ip31Var = this.H1;
            A0.setBounds(ip31Var.f(), ip31Var.h(), ip31Var.g(), ip31Var.d());
            A0.draw(canvas);
        }
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final String k0() {
        com.yandex.messaging.internal.view.timeline.translations.c cVar = (com.yandex.messaging.internal.view.timeline.translations.c) this.M0.getValue();
        if (cVar != null) {
            xkb1 xkb1Var = cVar.P;
            qw10 qw10Var = xkb1Var instanceof qw10 ? (qw10) xkb1Var : null;
            String str = qw10Var != null ? qw10Var.a : null;
            if (str != null) {
                return str;
            }
        }
        return this.r0;
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public void q0(j3b j3bVar) {
        this.u0 = j3bVar;
        s8b b = okb1.b(j3bVar);
        ChatRightsFlag chatRightsFlag = ChatRightsFlag.Share;
        kgx kgxVar = s8b.d[22];
        I0(chatRightsFlag.c(b).booleanValue());
        pv10 E0 = E0();
        E0.J = j3bVar;
        E0.d();
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final void u0(yab yabVar, MessageData messageData) {
        nw10 b;
        i3y i3yVar = this.M0;
        com.yandex.messaging.internal.view.timeline.translations.c cVar = (com.yandex.messaging.internal.view.timeline.translations.c) i3yVar.getValue();
        if (cVar != null) {
            cVar.a(yabVar, this.O0, this.N0, e0());
        }
        String W = yabVar.W();
        a aVar = this.C1;
        if (W == null || !this.t0.h || this.R || aVar == null) {
            if (aVar != null) {
                aVar.c();
                return;
            }
            return;
        }
        tu10 tu10Var = new tu10(yabVar.a.getPosition(), yabVar.w0(), W, this.c0, jl40.l(messageData.persistentSuggests, Boolean.TRUE));
        ArrayList arrayList = new ArrayList();
        com.yandex.messaging.internal.view.timeline.translations.c cVar2 = (com.yandex.messaging.internal.view.timeline.translations.c) i3yVar.getValue();
        if (cVar2 != null && (b = cVar2.b(pj91.f(this.a).getLayoutInflater())) != null) {
            arrayList.add(b);
        }
        aVar.a(messageData.aiBotActions, arrayList, messageData.layoutSuggestsRows, messageData.regularSuggests, tu10Var);
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final boolean x0() {
        return true;
    }

    public final void y0(View... viewArr) {
        if (this.t0.a) {
            return;
        }
        mg mgVar = new mg(5, this);
        for (View view : viewArr) {
            androidx.core.view.b.p(view, mgVar);
        }
    }

    public final String z0(String str, boolean z) {
        String str2;
        View view = this.a;
        boolean z2 = this.R;
        String j = (z2 || (str2 = this.F0) == null || str2.length() == 0) ? z2 ? b64.j(view.getContext().getString(oyh0.messenger_own_message_prefix), ". ") : "" : b64.j(this.F0, ". ");
        com.yandex.messaging.internal.view.timeline.overlay.f fVar = this.v2.z;
        String string = !fVar.p() ? null : fVar.D.getResources().getString(oyh0.thread_counter_hint_content_desc, fVar.q().b.getText());
        String concat = string != null ? ". ".concat(string) : "";
        return (!z || str == null || str.length() == 0) ? (str == null || str.length() == 0) ? str : g8e.p(j, str, concat) : oyr.q(j, str, concat, ". ", view.getContext().getString(oyh0.important_message_accessibility_suffix_content_desc));
    }
}
