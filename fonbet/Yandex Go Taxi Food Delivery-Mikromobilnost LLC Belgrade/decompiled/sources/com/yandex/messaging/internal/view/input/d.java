package com.yandex.messaging.internal.view.input;

import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.alicekit.core.views.animator.DslAnimatorBuilder;
import com.yandex.bricks.Brick;
import defpackage.g8e;
import defpackage.hi91;
import defpackage.ike;
import defpackage.ipg0;
import defpackage.kse;
import defpackage.oyh0;
import defpackage.vqc;
import defpackage.wuj0;
import defpackage.wwg0;

/* loaded from: classes15.dex */
public final class d extends Brick {
    public static final long y = vqc.a(0, 0, 200, 7);
    public final c a;
    public final ike b;
    public final b c;
    public DslAnimatorBuilder w;
    public final AppCompatImageView x;

    public d(Activity activity, kse kseVar, SharedPreferences sharedPreferences, c cVar) {
        this.a = cVar;
        this.b = g8e.f(kseVar.b);
        this.c = new b(oyh0.messaging_tooltip_starred, sharedPreferences, "IS_STARRED_MESSAGE_ALREADY_SENT");
        AppCompatImageView appCompatImageView = new AppCompatImageView(activity);
        appCompatImageView.setImageResource(wwg0.msg_ic_star_selector);
        appCompatImageView.setImageTintList(wuj0.a(activity.getResources(), ipg0.msg_star_selector, activity.getTheme()));
        appCompatImageView.setVisibility(8);
        hi91.g(new StarBrick$view$1$1(this, appCompatImageView, null), appCompatImageView);
        appCompatImageView.setContentDescription(appCompatImageView.getContext().getString(oyh0.chat_input_important_message_button_content_desc));
        this.x = appCompatImageView;
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        return this.x;
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickAttach() {
        super.onBrickAttach();
        kotlinx.coroutines.flow.e.H(getBrickScope(), kotlinx.coroutines.flow.e.I(this.a.f, new StarBrick$onBrickAttach$1(this, null)));
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        this.c.a(true);
    }
}
