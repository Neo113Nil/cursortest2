package com.yandex.passport.internal.ui.bouncer.loading;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import com.lightside.visum.layouts.LinearLayoutBuilder;
import com.yandex.passport.R;
import com.yandex.passport.api.ProgressBackground;
import com.yandex.passport.api.n3;
import com.yandex.passport.internal.flags.presentation.s0;
import com.yandex.passport.internal.n;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import com.yandex.passport.internal.properties.p;
import defpackage.kp31;
import defpackage.li91;
import defpackage.lzx;
import defpackage.t2y;
import defpackage.uc20;
import defpackage.wj91;

/* loaded from: classes2.dex */
public class e extends t2y implements a {
    public final ProgressPropertiesImpl c;
    public final View w;
    public final n3 x;
    public final Button y;

    /* JADX WARN: Multi-variable type inference failed */
    public e(Activity activity, ProgressPropertiesImpl progressPropertiesImpl, p pVar) {
        super(activity);
        this.c = progressPropertiesImpl;
        this.w = com.yandex.passport.common.ui.b.b(this, activity, progressPropertiesImpl, pVar.w, 0.0f, 16);
        this.x = progressPropertiesImpl.getSize().toSize();
        int i = R.id.button_back;
        View view = (View) LoadingUi$special$$inlined$button$default$1.b.invoke(wj91.e(0, activity), 0, 0);
        if (i != -1) {
            view.setId(i);
        }
        if (this instanceof lzx) {
            ((lzx) this).addToParent(view);
        }
        Button button = (Button) view;
        button.setText(R.string.passport_webview_back_button_text);
        button.setTextSize(16.0f);
        li91.l(button, R.color.passport_roundabout_text_primary);
        button.setBackgroundColor(0);
        button.setSingleLine(true);
        button.setAllCaps(false);
        DisplayMetrics displayMetrics = uc20.a;
        button.setPadding(button.getPaddingLeft(), (int) (displayMetrics.density * 14.0f), button.getPaddingRight(), button.getPaddingBottom());
        button.setPadding(button.getPaddingLeft(), button.getPaddingTop(), button.getPaddingRight(), (int) (14.0f * displayMetrics.density));
        button.setGravity(17);
        button.setAlpha(0.0f);
        this.y = button;
    }

    @Override // defpackage.t2y
    public final View b(kp31 kp31Var) {
        final LinearLayoutBuilder linearLayoutBuilder = new LinearLayoutBuilder(wj91.e(0, kp31Var.getCtx()), 0, 0);
        if (kp31Var instanceof lzx) {
            ((lzx) kp31Var).addToParent(linearLayoutBuilder);
        }
        linearLayoutBuilder.setOrientation(1);
        linearLayoutBuilder.setVisibility(8);
        final n nVar = new n(6, linearLayoutBuilder);
        linearLayoutBuilder.postDelayed(nVar, 1000L);
        if (linearLayoutBuilder.isAttachedToWindow()) {
            linearLayoutBuilder.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.passport.internal.ui.bouncer.loading.LoadingUi$layout$lambda$7$$inlined$doOnDetach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    linearLayoutBuilder.removeOnAttachStateChangeListener(this);
                    linearLayoutBuilder.removeCallbacks(nVar);
                }
            });
        } else {
            linearLayoutBuilder.removeCallbacks(nVar);
        }
        linearLayoutBuilder.setGravity(17);
        ProgressPropertiesImpl progressPropertiesImpl = this.c;
        if (progressPropertiesImpl.getBackground() instanceof ProgressBackground.Custom) {
            linearLayoutBuilder.setBackgroundResource(((ProgressBackground.Custom) progressPropertiesImpl.getBackground()).getBackgroundResId());
        } else {
            li91.g(R.color.passport_roundabout_background, linearLayoutBuilder);
        }
        linearLayoutBuilder.invoke(getProgress(), new s0(10, linearLayoutBuilder, this));
        if (progressPropertiesImpl.getShowCancelButton()) {
            linearLayoutBuilder.invoke(this.y, new com.yandex.passport.internal.ui.bouncer.error.f(linearLayoutBuilder, 3));
        }
        return linearLayoutBuilder;
    }

    @Override // com.yandex.passport.internal.ui.bouncer.loading.a
    public View getProgress() {
        return this.w;
    }
}
