package com.yandex.messaging.input;

import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.TextView;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.views.KeyboardAwareEmojiEditText;
import defpackage.bgc;
import defpackage.cdu0;
import defpackage.e1w;
import defpackage.e9h0;
import defpackage.f02;
import defpackage.ftn;
import defpackage.gym;
import defpackage.h3y;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.mp11;
import defpackage.mtn;
import defpackage.ntn;
import defpackage.pb;
import defpackage.rtn;
import defpackage.tf;
import defpackage.tsn;
import defpackage.tt31;
import defpackage.u1n;
import defpackage.usn;
import defpackage.v5a1;
import defpackage.vse;
import defpackage.w05;
import defpackage.wjm;
import defpackage.x22;
import defpackage.y4t;
import defpackage.yvf0;
import defpackage.z83;

/* loaded from: classes15.dex */
public final class b {
    public final SharedPreferences a;
    public final yvf0 b;
    public final mp11 c;
    public final x22 d;
    public View e;
    public final wjm f;
    public tt31 g;
    public w05 h;
    public boolean i;
    public rtn j;
    public boolean k;
    public Boolean l;
    public final ike m;
    public final bgc n = new bgc(12);
    public final ChatRequest o;
    public final cdu0 p;
    public final h3y q;
    public final y4t r;
    public e1w s;

    public b(Activity activity, ChatRequest chatRequest, SharedPreferences sharedPreferences, cdu0 cdu0Var, h3y h3yVar, yvf0 yvf0Var, mp11 mp11Var, x22 x22Var, y4t y4tVar, vse vseVar) {
        this.a = sharedPreferences;
        this.b = yvf0Var;
        this.c = mp11Var;
        this.d = x22Var;
        this.f = new wjm(sharedPreferences);
        this.m = vseVar.c(true);
        this.o = chatRequest;
        this.p = cdu0Var;
        this.q = h3yVar;
        this.r = y4tVar;
    }

    public final void a(View view, KeyboardAwareEmojiEditText keyboardAwareEmojiEditText) {
        this.e = view;
        this.f.x = keyboardAwareEmojiEditText;
        view.setVisibility(8);
        view.setOnClickListener(new tf(14, this));
        if (!ftn.e()) {
            z83.i();
        } else if (this.h != null || this.i) {
            b();
        } else {
            ftn a = ftn.a();
            if (a.c() == 1) {
                this.i = true;
                b();
            } else {
                w05 w05Var = new w05(this);
                a.k(w05Var);
                this.h = w05Var;
            }
        }
        kotlinx.coroutines.flow.e.H(this.m, new jqr(kotlinx.coroutines.flow.e.t(new pb(this.r.a(this.o), 25)), new ChatEmojiController$onAttach$2(this, null), 3));
    }

    public final void b() {
        View view;
        View view2;
        View view3;
        tsn u1nVar;
        Boolean bool = this.l;
        if (bool != null) {
            boolean z = this.k;
            wjm wjmVar = this.f;
            if (z && (this.i || jl40.l(bool, Boolean.TRUE))) {
                View view4 = this.e;
                if (view4 != null) {
                    view4.setVisibility(0);
                }
                tt31 tt31Var = this.g;
                if (tt31Var != null) {
                    rtn rtnVar = this.j;
                    if (rtnVar == null) {
                        if (this.i) {
                            rtnVar = (rtn) this.b.get();
                            KeyboardAwareEmojiEditText keyboardAwareEmojiEditText = (KeyboardAwareEmojiEditText) wjmVar.x;
                            if (keyboardAwareEmojiEditText != null) {
                                u1nVar = new gym(keyboardAwareEmojiEditText);
                            } else {
                                View view5 = this.e;
                                u1nVar = new u1n(6, view5 instanceof TextView ? (TextView) view5 : null, new f02(21, this));
                            }
                            rtnVar.b = u1nVar;
                            mtn mtnVar = rtnVar.d;
                            mtnVar.c = u1nVar;
                            u1n a = v5a1.a(usn.a, usn.c);
                            rtnVar.c = a;
                            mtnVar.w = (ntn[]) a.b;
                            mtnVar.notifyDataSetChanged();
                            this.j = rtnVar;
                        } else {
                            rtnVar = null;
                        }
                    }
                    if (rtnVar != null && (view3 = rtnVar.a) != tt31Var.d) {
                        tt31Var.d = view3;
                        tt31Var.c();
                    }
                    boolean z2 = this.k;
                    View view6 = this.e;
                    if (z2) {
                        if (view6 != null) {
                            view6.setVisibility(0);
                        }
                    } else if (view6 != null) {
                        view6.setVisibility(8);
                    }
                    rtn rtnVar2 = this.j;
                    View findViewById = (rtnVar2 == null || (view2 = rtnVar2.a) == null) ? null : view2.findViewById(e9h0.emoji_divider);
                    if (findViewById != null) {
                        findViewById.setVisibility(8);
                    }
                }
            } else {
                View view7 = this.e;
                if (view7 != null) {
                    view7.setVisibility(8);
                }
                wjmVar.d();
            }
        }
        boolean l = jl40.l(this.l, Boolean.TRUE);
        tt31 tt31Var2 = this.g;
        if (l) {
            if (tt31Var2 == null || (view = ((com.yandex.messaging.internal.view.stickers.panel.a) this.q.get()).E) == tt31Var2.e) {
                return;
            }
            tt31Var2.e = view;
            tt31Var2.c();
            return;
        }
        if (tt31Var2 == null || tt31Var2.e == null) {
            return;
        }
        tt31Var2.e = null;
        tt31Var2.c();
    }
}
