package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import defpackage.akk0;
import defpackage.f83;
import defpackage.ibk0;
import defpackage.ijk0;
import defpackage.ink0;
import defpackage.jnk0;
import defpackage.nqs0;
import defpackage.p9y0;
import defpackage.wys;
import defpackage.z8k0;
import ru.yandex.taxi.design.SliderButtonView;

/* loaded from: classes14.dex */
public final class w extends wys {
    public static final /* synthetic */ int U = 0;
    public final SliderButtonView R;
    public final p9y0 S;
    public final com.yandex.go.taxi.order.details.v2.analytics.g T;

    public w(SliderButtonView sliderButtonView, p9y0 p9y0Var, com.yandex.go.taxi.order.details.v2.analytics.g gVar) {
        super(sliderButtonView);
        this.R = sliderButtonView;
        this.S = p9y0Var;
        this.T = gVar;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        jnk0 jnk0Var = (jnk0) obj;
        akk0 akk0Var = jnk0Var.f;
        View view = this.a;
        OneShotPreDrawListener.add(view, new z8k0(view, view, SystemClock.elapsedRealtimeNanos(), this, akk0Var, 20));
        b0(new RideCardSliderViewHolder$processAnalytics$2(this, akk0Var, null));
        nqs0 nqs0Var = jnk0Var.e;
        akk0 akk0Var2 = jnk0Var.f;
        ibk0 a = ijk0.a(nqs0Var);
        SliderButtonView sliderButtonView = this.R;
        sliderButtonView.setSlideFinishedListener(a != null ? new f83(sliderButtonView, this, a, akk0Var2, 11) : null);
        c0(jnk0Var.c);
        d0(jnk0Var.d);
    }

    public final void c0(ink0 ink0Var) {
        Drawable drawable;
        CharSequence charSequence;
        CharSequence charSequence2;
        SliderButtonView sliderButtonView = this.R;
        if (ink0Var != null && (charSequence2 = ink0Var.a) != null) {
            sliderButtonView.setTitleIdle(charSequence2);
        }
        if (ink0Var != null && (charSequence = ink0Var.b) != null) {
            sliderButtonView.setSubtitleIdle(charSequence);
        }
        if (ink0Var == null || (drawable = ink0Var.c) == null) {
            return;
        }
        sliderButtonView.setStartIcon(drawable);
    }

    public final void d0(ink0 ink0Var) {
        Drawable drawable;
        CharSequence charSequence;
        CharSequence charSequence2;
        SliderButtonView sliderButtonView = this.R;
        if (ink0Var != null && (charSequence2 = ink0Var.a) != null) {
            sliderButtonView.setTitleProgress(charSequence2);
        }
        if (ink0Var != null && (charSequence = ink0Var.b) != null) {
            sliderButtonView.setSubtitleProgress(charSequence);
        }
        if (ink0Var == null || (drawable = ink0Var.c) == null) {
            return;
        }
        sliderButtonView.setProgressIcon(drawable);
    }
}
