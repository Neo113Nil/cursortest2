package com.yandex.passport.internal.ui.bouncer.error;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.lightside.visum.layouts.LinearLayoutBuilder;
import com.yandex.passport.R;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import defpackage.kp31;
import defpackage.li91;
import defpackage.lzx;
import defpackage.t2y;
import defpackage.uc20;
import defpackage.wj91;
import defpackage.y4h0;

/* loaded from: classes2.dex */
public final class g extends t2y {
    public final ProgressPropertiesImpl c;
    public final ImageView w;
    public final TextView x;
    public final Button y;

    /* JADX WARN: Multi-variable type inference failed */
    public g(Activity activity, ProgressPropertiesImpl progressPropertiesImpl) {
        super(activity);
        this.c = progressPropertiesImpl;
        int i = R.id.passport_error_image;
        View view = (View) ErrorSlabMessageUi$special$$inlined$imageView$default$1.b.invoke(wj91.e(0, activity), 0, 0);
        if (i != -1) {
            view.setId(i);
        }
        boolean z = this instanceof lzx;
        if (z) {
            ((lzx) this).addToParent(view);
        }
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.passport_domik_webam_unexpected_error);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.w = imageView;
        int i2 = R.id.text_error_message;
        View view2 = (View) ErrorSlabMessageUi$special$$inlined$textView$default$1.b.invoke(wj91.e(0, activity), 0, 0);
        if (i2 != -1) {
            view2.setId(i2);
        }
        if (z) {
            ((lzx) this).addToParent(view2);
        }
        TextView textView = (TextView) view2;
        textView.setText(R.string.passport_webview_unexpected_error_text);
        textView.setTextSize(16.0f);
        li91.l(textView, R.color.passport_error_slab_text_primary);
        li91.k(textView, y4h0.ya_regular);
        textView.setSingleLine(false);
        textView.setGravity(17);
        this.x = textView;
        int i3 = R.id.button_back;
        View view3 = (View) ErrorSlabMessageUi$special$$inlined$button$default$1.b.invoke(wj91.e(0, activity), 0, 0);
        if (i3 != -1) {
            view3.setId(i3);
        }
        if (z) {
            ((lzx) this).addToParent(view3);
        }
        Button button = (Button) view3;
        button.setText(R.string.passport_webview_cancel_button_text);
        button.setTextSize(16.0f);
        li91.l(button, R.color.passport_error_slab_text_secondary);
        li91.k(button, y4h0.ya_regular);
        button.setSingleLine(true);
        button.setAllCaps(false);
        button.setBackgroundColor(com.yandex.passport.internal.ui.c.q(android.R.attr.selectableItemBackground, button.getContext()));
        DisplayMetrics displayMetrics = uc20.a;
        button.setPadding(button.getPaddingLeft(), (int) (displayMetrics.density * 14.0f), button.getPaddingRight(), button.getPaddingBottom());
        button.setPadding(button.getPaddingLeft(), button.getPaddingTop(), button.getPaddingRight(), (int) (14.0f * displayMetrics.density));
        button.setGravity(17);
        this.y = button;
    }

    @Override // defpackage.t2y
    public final View b(kp31 kp31Var) {
        int i = R.id.passport_zero_page;
        LinearLayoutBuilder linearLayoutBuilder = new LinearLayoutBuilder(wj91.e(0, kp31Var.getCtx()), 0, 0);
        if (i != -1) {
            linearLayoutBuilder.setId(i);
        }
        if (kp31Var instanceof lzx) {
            ((lzx) kp31Var).addToParent(linearLayoutBuilder);
        }
        linearLayoutBuilder.setOrientation(1);
        linearLayoutBuilder.setGravity(17);
        linearLayoutBuilder.invoke(this.w, new f(linearLayoutBuilder, 0));
        linearLayoutBuilder.invoke(this.x, new f(linearLayoutBuilder, 1));
        if (this.c.getShowCancelButton()) {
            linearLayoutBuilder.invoke(this.y, new f(linearLayoutBuilder, 2));
        }
        return linearLayoutBuilder;
    }
}
