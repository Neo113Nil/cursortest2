package com.yandex.messaging.internal.urlpreview.impl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.yandex.messaging.internal.net.Error;
import com.yandex.messaging.internal.urlpreview.UrlPreviewBackgroundStyle;
import com.yandex.messaging.internal.urlpreview.impl.d;
import com.yandex.messaging.internal.urlpreview.reporter.UrlPreviewReporter$Element;
import defpackage.bvf0;
import defpackage.e9h0;
import defpackage.ike;
import defpackage.ip31;
import defpackage.iv31;
import defpackage.jcz0;
import defpackage.jft;
import defpackage.kjs0;
import defpackage.ly4;
import defpackage.oh21;
import defpackage.olh0;
import defpackage.otx;
import defpackage.pzt0;
import defpackage.sh21;
import defpackage.tje;
import defpackage.x3;
import defpackage.ye0;
import defpackage.z83;
import defpackage.z9z0;

/* loaded from: classes15.dex */
public final class d extends x3 {
    public final com.yandex.messaging.internal.avatar.a A;
    public final sh21 B;
    public final jft C;
    public final com.yandex.messaging.domain.user.b D;
    public final Context E;
    public final int F;
    public final View G;
    public final ImageView H;
    public final TextView I;
    public final TextView J;
    public final View K;
    public final ike L;
    public pzt0 M;
    public UrlPreviewBackgroundStyle N;
    public final String c;
    public final View w;
    public final com.yandex.messaging.internal.storage.contacts.a x;
    public final jcz0 y;
    public final otx z;

    public d(oh21 oh21Var, String str, View view, com.yandex.messaging.internal.storage.contacts.a aVar, jcz0 jcz0Var, otx otxVar, com.yandex.messaging.internal.avatar.a aVar2, sh21 sh21Var, jft jftVar, com.yandex.messaging.domain.user.b bVar) {
        super(17, oh21Var);
        this.c = str;
        this.w = view;
        this.x = aVar;
        this.y = jcz0Var;
        this.z = otxVar;
        this.A = aVar2;
        this.B = sh21Var;
        this.C = jftVar;
        this.D = bVar;
        this.E = view.getContext();
        this.F = kjs0.b(48);
        View a = new iv31(e9h0.user_url_preview_container_stub, e9h0.user_url_preview_container, olh0.msg_v_url_preview_user, view).a();
        this.G = a;
        this.H = (ImageView) a.findViewById(e9h0.user_preview_avatar);
        this.I = (TextView) a.findViewById(e9h0.user_preview_name);
        this.J = (TextView) a.findViewById(e9h0.user_last_seen);
        View findViewById = a.findViewById(e9h0.user_preview_navigation_button);
        this.K = findViewById;
        this.L = bvf0.b();
        this.N = UrlPreviewBackgroundStyle.LowHalfCorners;
        findViewById.setOnLongClickListener(new ly4(12, this));
    }

    @Override // defpackage.x3
    public final void Dg() {
        View view = this.G;
        view.setVisibility(8);
        view.setOnClickListener(null);
        this.K.setOnClickListener(null);
        pzt0 pzt0Var = this.M;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.M = null;
    }

    @Override // defpackage.x3
    public final View Ig() {
        return this.G.findViewById(e9h0.user_url_preview_message_status);
    }

    @Override // defpackage.x3
    public final View Jg() {
        return this.G;
    }

    @Override // defpackage.x3
    public final void Rg() {
        Dg();
    }

    @Override // defpackage.x3
    public final void Sg(UrlPreviewBackgroundStyle urlPreviewBackgroundStyle) {
        this.N = urlPreviewBackgroundStyle;
    }

    @Override // defpackage.x3
    public final void Tg(ip31 ip31Var, z9z0 z9z0Var, Canvas canvas, boolean z, boolean z2, boolean z3) {
        View view = this.w;
        Drawable b = z9z0.b(z9z0Var, view.getContext(), this.N.a(z3, z, z2));
        int a = kjs0.a(2.0f);
        int f = ip31Var.f();
        int g = ip31Var.g();
        b.setLayoutDirection(view.getLayoutDirection());
        View view2 = this.G;
        b.setBounds(f + a, view2.getTop() + a, g - a, view2.getBottom() - a);
        b.draw(canvas);
    }

    @Override // defpackage.x3
    public final void show() {
        z83.i();
        View view = this.G;
        final int i = 0;
        view.setVisibility(0);
        Long l = ((oh21) ((ye0) this.b)).y;
        TextView textView = this.J;
        if (l != null) {
            textView.setVisibility(0);
            textView.setText(this.z.a(this.E, l.longValue()));
        } else {
            textView.setVisibility(8);
        }
        view.setOnClickListener(new View.OnClickListener(this) { // from class: ou21
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Error error;
                int i2 = i;
                d dVar = this.b;
                switch (i2) {
                    case 0:
                        ye0 ye0Var = (ye0) dVar.b;
                        oh21 oh21Var = (oh21) ye0Var;
                        String str = oh21Var.b;
                        oyj0 oyj0Var = (oyj0) dVar.C.a.j(str);
                        Error error2 = null;
                        if (oyj0Var != null && (error = (Error) oyj0Var.a()) != null && error == Error.PRIVACY_RESTRICTIONS) {
                            error2 = error;
                        }
                        if (error2 != null) {
                            Toast.makeText(dVar.E, oyh0.user_restricted, 0).show();
                            break;
                        } else {
                            dVar.y.y(oh21Var.a, str, dVar.c);
                            dVar.B.a(ye0Var, UrlPreviewReporter$Element.Body);
                            break;
                        }
                        break;
                    default:
                        jcz0 jcz0Var = dVar.y;
                        ye0 ye0Var2 = (ye0) dVar.b;
                        oh21 oh21Var2 = (oh21) ye0Var2;
                        jcz0Var.i(oh21Var2.a, oh21Var2.b);
                        dVar.B.a(ye0Var2, UrlPreviewReporter$Element.OpenButton);
                        break;
                }
            }
        });
        final int i2 = 1;
        this.K.setOnClickListener(new View.OnClickListener(this) { // from class: ou21
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Error error;
                int i22 = i2;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        ye0 ye0Var = (ye0) dVar.b;
                        oh21 oh21Var = (oh21) ye0Var;
                        String str = oh21Var.b;
                        oyj0 oyj0Var = (oyj0) dVar.C.a.j(str);
                        Error error2 = null;
                        if (oyj0Var != null && (error = (Error) oyj0Var.a()) != null && error == Error.PRIVACY_RESTRICTIONS) {
                            error2 = error;
                        }
                        if (error2 != null) {
                            Toast.makeText(dVar.E, oyh0.user_restricted, 0).show();
                            break;
                        } else {
                            dVar.y.y(oh21Var.a, str, dVar.c);
                            dVar.B.a(ye0Var, UrlPreviewReporter$Element.Body);
                            break;
                        }
                        break;
                    default:
                        jcz0 jcz0Var = dVar.y;
                        ye0 ye0Var2 = (ye0) dVar.b;
                        oh21 oh21Var2 = (oh21) ye0Var2;
                        jcz0Var.i(oh21Var2.a, oh21Var2.b);
                        dVar.B.a(ye0Var2, UrlPreviewReporter$Element.OpenButton);
                        break;
                }
            }
        });
        this.M = tje.N(this.L, null, null, new UserUrlPreview$show$4(this, null), 3);
    }
}
