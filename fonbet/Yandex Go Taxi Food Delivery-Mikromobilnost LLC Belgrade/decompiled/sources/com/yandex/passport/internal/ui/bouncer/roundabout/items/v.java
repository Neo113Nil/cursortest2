package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import android.app.Activity;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.lightside.visum.layouts.LinearLayoutBuilder;
import com.yandex.passport.R;
import com.yandex.passport.internal.ui.bouncer.roundabout.c0;
import defpackage.kp31;
import defpackage.lzx;
import defpackage.t2y;
import defpackage.uc20;
import defpackage.wj91;

/* loaded from: classes2.dex */
public final class v extends t2y {
    public final ImageView c;
    public final TextView w;

    /* JADX WARN: Multi-variable type inference failed */
    public v(Activity activity) {
        super(activity);
        View view = (View) PhonishUi$special$$inlined$imageView$default$1.b.invoke(wj91.e(0, activity), 0, 0);
        boolean z = this instanceof lzx;
        if (z) {
            ((lzx) this).addToParent(view);
        }
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.passport_icon_user_unknown);
        DisplayMetrics displayMetrics = uc20.a;
        imageView.setPaddingRelative(imageView.getPaddingStart(), imageView.getPaddingTop(), (int) (displayMetrics.density * 4.0f), imageView.getPaddingBottom());
        imageView.setPadding(imageView.getPaddingLeft(), imageView.getPaddingTop(), imageView.getPaddingRight(), (int) (4.0f * displayMetrics.density));
        this.c = imageView;
        View view2 = (View) PhonishUi$special$$inlined$textView$default$1.b.invoke(wj91.e(0, activity), 0, 0);
        if (z) {
            ((lzx) this).addToParent(view2);
        }
        TextView textView = (TextView) view2;
        textView.setId(R.id.passport_roundabout_phonish_title);
        c0.a.a(textView);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        this.w = textView;
    }

    @Override // defpackage.t2y
    public final void a(View view) {
        ((LinearLayout) view).setBackgroundResource(R.drawable.passport_roundabout_account);
    }

    @Override // defpackage.t2y
    public final View b(kp31 kp31Var) {
        LinearLayoutBuilder linearLayoutBuilder = new LinearLayoutBuilder(wj91.e(0, kp31Var.getCtx()), 0, 0);
        if (kp31Var instanceof lzx) {
            ((lzx) kp31Var).addToParent(linearLayoutBuilder);
        }
        linearLayoutBuilder.setOrientation(0);
        linearLayoutBuilder.invoke(this.c, new com.yandex.passport.internal.ui.bouncer.error.f(linearLayoutBuilder, 6));
        linearLayoutBuilder.invoke(this.w, new com.yandex.passport.internal.ui.bouncer.error.f(linearLayoutBuilder, 7));
        return linearLayoutBuilder;
    }
}
