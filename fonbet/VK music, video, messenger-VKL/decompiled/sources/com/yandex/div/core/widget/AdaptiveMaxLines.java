package com.yandex.div.core.widget;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.yandex.div.core.view.DrawingPassOverrideStrategy;
import com.yandex.div.core.view.OnPreDrawListeners;
import com.yandex.div.core.widget.AdaptiveMaxLines;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.epx;
import xsna.gzs;
import xsna.iut0;
import xsna.vu5;

/* compiled from: AdaptiveMaxLines.kt */
/* loaded from: classes7.dex */
public final class AdaptiveMaxLines {
    private final DrawingPassOverrideStrategy drawingPassOverrideStrategy;
    private boolean isAdaptLinesRequested;
    private Params params;
    private ViewTreeObserver.OnPreDrawListener preDrawListener;
    private final TextView textView;
    private View.OnAttachStateChangeListener viewAttachListener;

    /* compiled from: AdaptiveMaxLines.kt */
    public static final class Params {
        private final int maxLines;
        private final int minHiddenLines;

        public Params(int i, int i2) {
            this.maxLines = i;
            this.minHiddenLines = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return this.maxLines == params.maxLines && this.minHiddenLines == params.minHiddenLines;
        }

        public final int getMaxLines() {
            return this.maxLines;
        }

        public final int getTotalVisibleLines() {
            return this.maxLines + this.minHiddenLines;
        }

        public int hashCode() {
            return Integer.hashCode(this.minHiddenLines) + (Integer.hashCode(this.maxLines) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Params(maxLines=");
            sb.append(this.maxLines);
            sb.append(", minHiddenLines=");
            return vu5.b(sb, this.minHiddenLines, ')');
        }
    }

    public AdaptiveMaxLines(TextView textView, DrawingPassOverrideStrategy drawingPassOverrideStrategy) {
        this.textView = textView;
        this.drawingPassOverrideStrategy = drawingPassOverrideStrategy;
    }

    private final void addAttachListener() {
        if (this.viewAttachListener != null) {
            return;
        }
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.widget.AdaptiveMaxLines$addAttachListener$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                AdaptiveMaxLines.this.addPreDrawListener();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                AdaptiveMaxLines.this.removePreDrawListener();
            }
        };
        this.textView.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.viewAttachListener = onAttachStateChangeListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addPreDrawListener() {
        if (this.preDrawListener != null) {
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = OnPreDrawListeners.onPreDrawListener(this.drawingPassOverrideStrategy, new gzs<Boolean>() { // from class: com.yandex.div.core.widget.AdaptiveMaxLines$addPreDrawListener$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // xsna.gzs
            public final Boolean invoke() {
                AdaptiveMaxLines.Params params;
                TextView textView;
                boolean z;
                TextView textView2;
                TextView textView3;
                TextView textView4;
                params = AdaptiveMaxLines.this.params;
                if (params == null) {
                    return Boolean.TRUE;
                }
                textView = AdaptiveMaxLines.this.textView;
                if (TextUtils.isEmpty(textView.getText())) {
                    return Boolean.TRUE;
                }
                z = AdaptiveMaxLines.this.isAdaptLinesRequested;
                boolean z2 = false;
                if (z) {
                    AdaptiveMaxLines.this.removePreDrawListener();
                    AdaptiveMaxLines.this.isAdaptLinesRequested = false;
                    return Boolean.TRUE;
                }
                textView2 = AdaptiveMaxLines.this.textView;
                Integer num = textView2.getLineCount() > params.getTotalVisibleLines() ? null : Integer.MAX_VALUE;
                int intValue = num != null ? num.intValue() : params.getMaxLines();
                textView3 = AdaptiveMaxLines.this.textView;
                if (intValue != textView3.getMaxLines()) {
                    textView4 = AdaptiveMaxLines.this.textView;
                    textView4.setMaxLines(intValue);
                    AdaptiveMaxLines.this.isAdaptLinesRequested = true;
                } else {
                    AdaptiveMaxLines.this.removePreDrawListener();
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
        });
        this.textView.getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
        this.preDrawListener = onPreDrawListener;
    }

    private final void removeAttachListener() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.viewAttachListener;
        if (onAttachStateChangeListener != null) {
            this.textView.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        this.viewAttachListener = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removePreDrawListener() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.preDrawListener;
        if (onPreDrawListener != null) {
            this.textView.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
        this.preDrawListener = null;
    }

    public final void apply(Params params) {
        if (epx.f(this.params, params)) {
            return;
        }
        this.params = params;
        TextView textView = this.textView;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (textView.isAttachedToWindow()) {
            addPreDrawListener();
        }
        addAttachListener();
    }

    public final void reset() {
        removeAttachListener();
        removePreDrawListener();
    }
}
