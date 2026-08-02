package com.yandex.go.scooters.utils;

import android.content.Context;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.TextView;
import defpackage.jst;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011¸\u0006\u0010"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Lzy11;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "androidx/core/view/ViewKt$doOnLayout$$inlined$doOnNextLayout$1", "core-ktx_release"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TextUtilsKt$setAndFitTextByWidth$$inlined$doOnLayout$1 implements View.OnLayoutChangeListener {
    final /* synthetic */ CharSequence $text$inlined;
    final /* synthetic */ TextView $this_setAndFitTextByWidth$inlined;

    public TextUtilsKt$setAndFitTextByWidth$$inlined$doOnLayout$1(TextView textView, CharSequence charSequence) {
        this.$this_setAndFitTextByWidth$inlined = textView;
        this.$text$inlined = charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.text.Spannable, android.text.SpannableString, android.text.Spanned, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.CharSequence] */
    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        view.removeOnLayoutChangeListener(this);
        ?? r3 = this.$this_setAndFitTextByWidth$inlined;
        Context context = r3.getContext();
        ?? r5 = this.$text$inlined;
        int width = this.$this_setAndFitTextByWidth$inlined.getWidth();
        if (width > 0) {
            r5 = SpannableString.valueOf(r5);
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(12.0f);
            textPaint.density = context.getResources().getDisplayMetrics().density;
            float f = 0.0f;
            float f2 = 1.0f;
            while (f <= f2) {
                float f3 = (f + f2) / 2.0f;
                if (r5 != 0) {
                    for (Object obj : r5.getSpans(0, r5.length(), RelativeSizeSpan.class)) {
                        r5.removeSpan(obj);
                    }
                }
                r5.setSpan(new RelativeSizeSpan(f3), 0, r5.length(), 17);
                float lineWidth = StaticLayout.Builder.obtain(r5, 0, r5.length(), textPaint, Integer.MAX_VALUE).build().getLineWidth(0);
                float f4 = width;
                if (lineWidth < f4) {
                    f = f3 + 0.05f;
                } else if (lineWidth <= f4) {
                    break;
                } else {
                    f2 = f3 - 0.05f;
                }
            }
        } else {
            jst.e.k(new IllegalArgumentException(), "maxWidth must be positive");
        }
        r3.setText(r5);
    }
}
