package com.yandex.messaging.internal.urlpreview.impl;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.alicekit.core.views.EllipsizingTextView;
import com.yandex.messaging.internal.urlpreview.UrlPreviewBackgroundStyle;
import defpackage.bvf0;
import defpackage.e9h0;
import defpackage.h3y;
import defpackage.ike;
import defpackage.ip31;
import defpackage.iv31;
import defpackage.jcz0;
import defpackage.kh21;
import defpackage.kjs0;
import defpackage.kse;
import defpackage.ly4;
import defpackage.nh21;
import defpackage.noy0;
import defpackage.olh0;
import defpackage.ph21;
import defpackage.pzt0;
import defpackage.sh21;
import defpackage.tje;
import defpackage.x3;
import defpackage.ye0;
import defpackage.yhl;
import defpackage.z5z;
import defpackage.z83;
import defpackage.z9z0;

/* loaded from: classes15.dex */
public final class c extends x3 {
    public final jcz0 A;
    public final int B;
    public final sh21 C;
    public final String D;
    public final h3y E;
    public final z5z F;
    public final int G;
    public final View H;
    public final ImageView I;
    public final TextView J;
    public final EllipsizingTextView K;
    public final Button L;
    public final ike M;
    public pzt0 N;
    public final View O;
    public UrlPreviewBackgroundStyle P;
    public final View c;
    public final com.yandex.messaging.internal.storage.contacts.a w;
    public final com.yandex.messaging.internal.avatar.a x;
    public final kse y;
    public final noy0 z;

    public c(nh21 nh21Var, View view, com.yandex.messaging.internal.storage.contacts.a aVar, com.yandex.messaging.internal.avatar.a aVar2, kse kseVar, noy0 noy0Var, jcz0 jcz0Var, int i, sh21 sh21Var, String str, h3y h3yVar, z5z z5zVar) {
        super(17, nh21Var);
        this.c = view;
        this.w = aVar;
        this.x = aVar2;
        this.y = kseVar;
        this.z = noy0Var;
        this.A = jcz0Var;
        this.B = i;
        this.C = sh21Var;
        this.D = str;
        this.E = h3yVar;
        this.F = z5zVar;
        this.G = kjs0.b(48);
        View a = new iv31(e9h0.message_url_preview_container_stub, e9h0.message_url_preview_container, olh0.msg_v_url_preview_message, view).a();
        this.H = a;
        this.I = (ImageView) a.findViewById(e9h0.author_avatar);
        this.J = (TextView) a.findViewById(e9h0.author_info);
        this.K = (EllipsizingTextView) a.findViewById(e9h0.message_text);
        Button button = (Button) a.findViewById(e9h0.message_preview_navigation_button);
        this.L = button;
        this.M = bvf0.b();
        this.O = a.findViewById(e9h0.message_url_preview_message_status);
        this.P = UrlPreviewBackgroundStyle.LowHalfCorners;
        button.setOnLongClickListener(new ly4(8, this));
    }

    @Override // defpackage.x3
    public final void Dg() {
        this.H.setVisibility(8);
        pzt0 pzt0Var = this.N;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.N = null;
        this.L.setOnClickListener(null);
    }

    @Override // defpackage.x3
    public final View Ig() {
        return this.O;
    }

    @Override // defpackage.x3
    public final View Jg() {
        return this.H;
    }

    @Override // defpackage.x3
    public final void Rg() {
        Dg();
    }

    @Override // defpackage.x3
    public final void Sg(UrlPreviewBackgroundStyle urlPreviewBackgroundStyle) {
        this.P = urlPreviewBackgroundStyle;
    }

    @Override // defpackage.x3
    public final void Tg(ip31 ip31Var, z9z0 z9z0Var, Canvas canvas, boolean z, boolean z2, boolean z3) {
        View view = this.c;
        Drawable b = z9z0.b(z9z0Var, view.getContext(), this.P.a(z3, z, z2));
        int a = kjs0.a(2.0f);
        int f = ip31Var.f();
        int g = ip31Var.g();
        b.setLayoutDirection(view.getLayoutDirection());
        View view2 = this.H;
        b.setBounds(f + a, view2.getTop() + a, g - a, view2.getBottom() - a);
        b.draw(canvas);
    }

    @Override // defpackage.x3
    public final void show() {
        pzt0 N;
        z83.i();
        this.H.setVisibility(0);
        ye0 ye0Var = (ye0) this.b;
        nh21 nh21Var = (nh21) ye0Var;
        boolean z = nh21Var instanceof ph21;
        ike ikeVar = this.M;
        if (z) {
            N = tje.N(ikeVar, null, null, new MessageUrlPreview$bindUserMessageJob$1((ph21) ye0Var, this, null), 3);
        } else {
            if (!(nh21Var instanceof kh21)) {
                yhl.d(ye0Var, "Unsupported message url type ");
                return;
            }
            N = tje.N(ikeVar, null, null, new MessageUrlPreview$bindChatMessageJob$1((kh21) ye0Var, this, null), 3);
        }
        this.N = N;
    }
}
