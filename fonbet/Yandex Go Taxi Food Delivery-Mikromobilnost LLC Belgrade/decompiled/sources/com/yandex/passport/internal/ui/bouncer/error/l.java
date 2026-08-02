package com.yandex.passport.internal.ui.bouncer.error;

import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.yandex.passport.R;
import defpackage.li91;
import defpackage.uc20;
import defpackage.y4h0;

/* loaded from: classes2.dex */
public final class l {
    public final void a(View view) {
        TextView textView = (TextView) view;
        textView.setTextSize(14.0f);
        li91.l(textView, R.color.passport_error_slab_text_primary);
        li91.k(textView, y4h0.ya_regular);
        textView.setLineSpacing(TypedValue.applyDimension(2, 1.0f, uc20.a), textView.getLineSpacingMultiplier());
    }
}
