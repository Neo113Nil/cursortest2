package com.yandex.passport.internal.ui.bouncer.loading;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.lightside.visum.layouts.LinearLayoutBuilder;
import com.yandex.passport.R;
import com.yandex.passport.api.ProgressBackground;
import com.yandex.passport.api.n3;
import com.yandex.passport.internal.flags.presentation.s0;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import com.yandex.passport.internal.properties.p;
import defpackage.kp31;
import defpackage.li91;
import defpackage.lzx;
import defpackage.t2y;
import defpackage.uc20;
import defpackage.wj91;

/* loaded from: classes2.dex */
public final class k extends t2y {
    public final ProgressPropertiesImpl c;
    public final View w;
    public final n3 x;
    public final TextView y;
    public final Button z;

    /* JADX WARN: Multi-variable type inference failed */
    public k(Activity activity, ProgressPropertiesImpl progressPropertiesImpl, p pVar) {
        super(activity);
        this.c = progressPropertiesImpl;
        this.w = com.yandex.passport.common.ui.b.b(this, activity, progressPropertiesImpl, pVar.w, 0.0f, 16);
        this.x = progressPropertiesImpl.getSize().toSize();
        View view = (View) WaitConnectionUi$special$$inlined$textView$default$1.b.invoke(wj91.e(0, activity), 0, 0);
        boolean z = this instanceof lzx;
        if (z) {
            ((lzx) this).addToParent(view);
        }
        TextView textView = (TextView) view;
        textView.setText(R.string.passport_webview_coonection_lost_error_text);
        textView.setTextSize(16.0f);
        li91.l(textView, R.color.passport_roundabout_text_primary);
        textView.setSingleLine(false);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        this.y = textView;
        View view2 = (View) WaitConnectionUi$special$$inlined$button$default$1.b.invoke(wj91.e(0, activity), 0, 0);
        if (z) {
            ((lzx) this).addToParent(view2);
        }
        Button button = (Button) view2;
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
        this.z = button;
    }

    @Override // defpackage.t2y
    public final void a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        ProgressPropertiesImpl progressPropertiesImpl = this.c;
        if (progressPropertiesImpl.getBackground() instanceof ProgressBackground.Custom) {
            linearLayout.setBackgroundResource(((ProgressBackground.Custom) progressPropertiesImpl.getBackground()).getBackgroundResId());
        } else {
            li91.g(R.color.passport_roundabout_background, linearLayout);
        }
    }

    @Override // defpackage.t2y
    public final View b(kp31 kp31Var) {
        LinearLayoutBuilder linearLayoutBuilder = new LinearLayoutBuilder(wj91.e(0, kp31Var.getCtx()), 0, 0);
        if (kp31Var instanceof lzx) {
            ((lzx) kp31Var).addToParent(linearLayoutBuilder);
        }
        linearLayoutBuilder.setOrientation(1);
        linearLayoutBuilder.setGravity(17);
        linearLayoutBuilder.invoke(this.w, new s0(11, linearLayoutBuilder, this));
        linearLayoutBuilder.invoke(this.y, new com.yandex.passport.internal.ui.bouncer.error.f(linearLayoutBuilder, 4));
        if (this.c.getShowCancelButton()) {
            linearLayoutBuilder.invoke(this.z, new com.yandex.passport.internal.ui.bouncer.error.f(linearLayoutBuilder, 5));
        }
        return linearLayoutBuilder;
    }
}
