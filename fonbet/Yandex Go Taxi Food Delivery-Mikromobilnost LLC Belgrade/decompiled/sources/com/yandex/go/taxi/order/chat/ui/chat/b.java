package com.yandex.go.taxi.order.chat.ui.chat;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;
import defpackage.i3y0;
import defpackage.jv10;
import defpackage.n8h0;
import defpackage.rp31;
import defpackage.tai0;
import java.text.DateFormat;
import java.util.WeakHashMap;
import java.util.function.Consumer;

/* loaded from: classes14.dex */
public abstract class b extends x0 {
    public final DateFormat N;
    public final TaxiOrderMessageViewHolder$PendingAnimationListener O;
    public final TextView P;
    public final TextView Q;
    public final View R;

    public b(View view) {
        super(view);
        this.N = DateFormat.getTimeInstance(3);
        this.O = new TaxiOrderMessageViewHolder$PendingAnimationListener(this);
        int i = n8h0.time;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.P = (TextView) ((View) rp31.d(view, i));
        this.Q = (TextView) view.findViewById(n8h0.retry_text);
        this.R = view.findViewById(n8h0.error_container);
    }

    public void W(jv10 jv10Var, Consumer consumer) {
        TextView textView;
        this.P.setText(this.N.format(jv10Var.c));
        int i = i3y0.a[jv10Var.w.ordinal()];
        if (i != 1) {
            if (i != 2) {
                Y();
                Animation animation = X().getAnimation();
                if (animation == null || animation.hasEnded()) {
                    return;
                }
                animation.setRepeatCount(0);
                return;
            }
            Y();
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.5f);
            alphaAnimation.setDuration(900L);
            alphaAnimation.setInterpolator(new LinearInterpolator());
            alphaAnimation.setRepeatCount(-1);
            alphaAnimation.setRepeatMode(2);
            X().startAnimation(alphaAnimation);
            return;
        }
        Animation animation2 = X().getAnimation();
        if (animation2 != null && !animation2.hasEnded()) {
            animation2.setRepeatCount(0);
        }
        View view = this.R;
        if (view == null || (textView = this.Q) == null) {
            return;
        }
        view.setVisibility(0);
        textView.setOnClickListener(new tai0(28, consumer, jv10Var));
        TaxiOrderMessageViewHolder$PendingAnimationListener taxiOrderMessageViewHolder$PendingAnimationListener = this.O;
        taxiOrderMessageViewHolder$PendingAnimationListener.setFinalAlpha(0.5f);
        if (taxiOrderMessageViewHolder$PendingAnimationListener.getIsAnimating()) {
            return;
        }
        X().setAlpha(0.5f);
    }

    public abstract View X();

    public final void Y() {
        TextView textView;
        View view = this.R;
        if (view == null || (textView = this.Q) == null) {
            return;
        }
        textView.setOnClickListener(null);
        textView.setClickable(false);
        view.setVisibility(8);
        TaxiOrderMessageViewHolder$PendingAnimationListener taxiOrderMessageViewHolder$PendingAnimationListener = this.O;
        taxiOrderMessageViewHolder$PendingAnimationListener.setFinalAlpha(1.0f);
        if (taxiOrderMessageViewHolder$PendingAnimationListener.getIsAnimating()) {
            return;
        }
        X().setAlpha(1.0f);
    }
}
