package com.yandex.messaging.internal.view.timeline.suggest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.yandex.messaging.core.net.entities.directives.Button;
import com.yandex.messaging.core.net.entities.proto.message.CustomPayload;
import defpackage.acb;
import defpackage.e9h0;
import defpackage.enm;
import defpackage.fxa1;
import defpackage.g8e;
import defpackage.hi91;
import defpackage.ike;
import defpackage.j73;
import defpackage.jng0;
import defpackage.kgx;
import defpackage.l7b;
import defpackage.o400;
import defpackage.o4v0;
import defpackage.ocz0;
import defpackage.olh0;
import defpackage.p4v0;
import defpackage.pzt0;
import defpackage.rbv0;
import defpackage.rp3;
import defpackage.sjh;
import defpackage.sz01;
import defpackage.tje;
import defpackage.tls;
import defpackage.tz10;
import defpackage.uge;
import defpackage.uyj;
import defpackage.vbz0;
import defpackage.wab;
import defpackage.yab;
import defpackage.yw01;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;

/* loaded from: classes15.dex */
public final class a {
    public final ocz0 a;
    public final rbv0 b;
    public l7b c;

    public a(ocz0 ocz0Var, rbv0 rbv0Var) {
        this.a = ocz0Var;
        this.b = rbv0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011b A[LOOP:0: B:40:0x0115->B:42:0x011b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(yab yabVar, final c cVar) {
        p4v0 p4v0Var;
        Iterator it;
        cVar.f0();
        cVar.F0 = null;
        if (!this.b.c || (yabVar.R().regularSuggests == null && yabVar.R().layoutSuggestsRows == null)) {
            cVar.O = new vbz0(yabVar.Z());
            acb e0 = cVar.e0();
            cVar.I0 = e0.l;
            cVar.J0 = e0.p;
            sz01 sz01Var = cVar.e0().b.p;
            cVar.K0 = (sz01Var != null ? sz01Var.a : null) != null;
            boolean z = e0.q.w && cVar.D0.b.a(tz10.s);
            tje.e();
            if (!yabVar.a1()) {
                CustomPayload e = yabVar.e();
                Button[] buttonArr = e != null ? e.suggests : null;
                if (buttonArr != null && buttonArr.length != 0) {
                    ArrayList A0 = yabVar.A0();
                    long G = yabVar.G();
                    cVar.P0 = Integer.valueOf(yabVar.a.getInt(11));
                    cVar.O0 = Long.valueOf(yabVar.U());
                    p4v0Var = new p4v0(G, buttonArr, A0);
                    cVar.N0 = p4v0Var;
                    sjh sjhVar = uyj.a;
                    cVar.H0 = g8e.f(o400.a.x);
                    if (cVar.N0 == null && z && cVar.K0) {
                        wab F0 = yabVar.F0();
                        cVar.S0 = F0 != null ? F0.a : null;
                        cVar.T0 = false;
                        ike ikeVar = cVar.H0;
                        pzt0 N = ikeVar != null ? tje.N(ikeVar, null, null, new ButtonsViewHolder$bind$1(e0, cVar, null), 3) : null;
                        rp3 rp3Var = cVar.L0;
                        kgx kgxVar = c.v1[0];
                        rp3Var.a(N);
                    } else {
                        cVar.T0 = true;
                    }
                    p4v0 p4v0Var2 = cVar.N0;
                    Iterable s = p4v0Var2 == null ? kotlin.sequences.b.s(new yw01(new enm(j73.v(p4v0Var2.b), new uge(p4v0Var2, cVar.p1, 9), 2), new tls() { // from class: com.yandex.messaging.internal.view.timeline.suggest.b
                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            o4v0 o4v0Var = (o4v0) obj;
                            c cVar2 = c.this;
                            View inflate = LayoutInflater.from(cVar2.G0.getContext()).inflate(olh0.msg_vh_chat_item_suggset_buttons_button, (ViewGroup) cVar2.G0, false);
                            TextView textView = (TextView) inflate.findViewById(e9h0.dialog_item_bot_button);
                            textView.setText(o4v0Var.c);
                            if (cVar2.T0) {
                                textView.setTextColor(fxa1.c(jng0.messagingCommonAccentTextColor, textView.getContext()).data);
                                textView.setEnabled(true);
                            } else {
                                textView.setTextColor(0);
                                textView.setEnabled(false);
                            }
                            hi91.g(new ButtonsViewHolder$updateViews$views$1$1$1$1(cVar2, o4v0Var, null), textView);
                            return inflate;
                        }
                    })) : EmptyList.a;
                    FlexboxLayout flexboxLayout = cVar.G0;
                    flexboxLayout.removeAllViews();
                    it = s.iterator();
                    while (it.hasNext()) {
                        flexboxLayout.addView((View) it.next());
                    }
                    flexboxLayout.setVisibility(flexboxLayout.getChildCount() == 0 ? 8 : 0);
                    cVar.F0 = this.c;
                }
            }
            p4v0Var = null;
            cVar.N0 = p4v0Var;
            sjh sjhVar2 = uyj.a;
            cVar.H0 = g8e.f(o400.a.x);
            if (cVar.N0 == null) {
            }
            cVar.T0 = true;
            p4v0 p4v0Var22 = cVar.N0;
            if (p4v0Var22 == null) {
            }
            FlexboxLayout flexboxLayout2 = cVar.G0;
            flexboxLayout2.removeAllViews();
            it = s.iterator();
            while (it.hasNext()) {
            }
            flexboxLayout2.setVisibility(flexboxLayout2.getChildCount() == 0 ? 8 : 0);
            cVar.F0 = this.c;
        }
    }
}
