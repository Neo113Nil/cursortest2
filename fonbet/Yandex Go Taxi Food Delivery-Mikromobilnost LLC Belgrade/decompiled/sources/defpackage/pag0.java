package defpackage;

import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.view.ImageToolbarView;
import com.ybsdk.widgets.common.MoneyInputEditView;

/* loaded from: classes3.dex */
public final class pag0 {
    public static final int f = kp50.r(12);
    public final ImageToolbarView a;
    public final MoneyInputEditView b;
    public final View c;
    public boolean d;
    public final float e;

    public pag0(NestedScrollView nestedScrollView, ImageToolbarView imageToolbarView, MoneyInputEditView moneyInputEditView, View view) {
        this.a = imageToolbarView;
        this.b = moneyInputEditView;
        this.c = view;
        this.e = ty01.a(imageToolbarView).height();
        nestedScrollView.setOnScrollChangeListener(new gk1(5, this));
    }

    public final void a() {
        RectF a = ty01.a(this.b);
        float height = a.height();
        float f2 = 0.0f;
        float c = y6i0.c(height == 0.0f ? 0.0f : 1.0f - ((height - (a.bottom - this.e)) / (-height)), 0.0f, 1.0f);
        q161 binding = this.a.getBinding();
        float f3 = c < 0.5f ? c * 2.0f : 1.0f;
        if (c > 0.5f) {
            f2 = (c - 0.5f) * 2.0f;
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
        }
        ImageView imageView = binding.e;
        ImageView imageView2 = binding.g;
        AppCompatTextView appCompatTextView = binding.d;
        SpoilerTextView spoilerTextView = binding.f;
        imageView.setAlpha(1.0f - f3);
        ImageView imageView3 = binding.e;
        float f4 = f;
        imageView3.setTranslationY((-f3) * f4);
        spoilerTextView.setAlpha(f2);
        appCompatTextView.setAlpha(f2);
        imageView2.setAlpha(f2);
        float f5 = f4 - (f2 * f4);
        spoilerTextView.setTranslationY(f5);
        appCompatTextView.setTranslationY(f5);
        imageView2.setTranslationY(f5);
        this.c.setAlpha(c);
    }

    public final void b() {
        this.d = true;
        a();
    }
}
