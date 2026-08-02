package com.yandex.go.places.impl.ui.bookings.adapter;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.e3h0;
import defpackage.i3y;
import defpackage.l5c0;
import defpackage.lys;
import defpackage.m5c0;
import defpackage.n5c0;
import defpackage.nac;
import defpackage.pav;
import defpackage.t9b0;
import defpackage.tls;
import defpackage.tt2;
import defpackage.xw90;
import defpackage.zo31;
import kotlin.LazyThreadSafetyMode;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes13.dex */
public final class a extends lys {
    public static final /* synthetic */ int W = 0;
    public final pav S;
    public final tt2 T;
    public final tls U;
    public final i3y V;

    public a(m5c0 m5c0Var, pav pavVar, tt2 tt2Var, tls tlsVar) {
        super(m5c0Var);
        this.S = pavVar;
        this.T = tt2Var;
        this.U = tlsVar;
        this.V = kotlin.a.b(LazyThreadSafetyMode.NONE, new t9b0(13, this));
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        l5c0 l5c0Var = (l5c0) obj;
        m5c0 m5c0Var = (m5c0) ((zo31) this.R);
        n5c0 n5c0Var = m5c0Var.b;
        n5c0Var.d.setText(l5c0Var.b);
        b0(new PlacesBookingViewHolder$bind$1$1(n5c0Var, l5c0Var, this, null));
        ImageView imageView = new ImageView(m5c0Var.a.getContext());
        i3y i3yVar = this.V;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
        imageView.setBackgroundResource(e3h0.rounded_image_background);
        imageView.setClipToOutline(true);
        imageView.setLayoutParams(layoutParams);
        ((nac) this.S.a(imageView)).c(l5c0Var.d);
        n5c0Var.b.addView(imageView);
        GoLinearLayout goLinearLayout = n5c0Var.a;
        goLinearLayout.setBackgroundResource(e3h0.dark_rounded_booking_background);
        c.z(new xw90(19, this, l5c0Var), goLinearLayout);
    }
}
