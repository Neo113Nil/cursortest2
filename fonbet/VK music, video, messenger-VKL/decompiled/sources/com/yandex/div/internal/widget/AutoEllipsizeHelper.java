package com.yandex.div.internal.widget;

import android.view.ViewTreeObserver;
import com.yandex.div.core.view.DrawingPassOverrideStrategy;
import com.yandex.div.core.view.OnPreDrawListeners;
import com.yandex.div.internal.KLog;
import com.yandex.div.logging.Severity;
import xsna.gzs;
import xsna.tgw;
import xsna.zcl;

/* compiled from: AutoEllipsizeHelper.kt */
/* loaded from: classes7.dex */
public final class AutoEllipsizeHelper {
    private static final Companion Companion = new Companion(null);
    private DrawingPassOverrideStrategy drawingPassOverrideStrategy = DrawingPassOverrideStrategy.Safe.INSTANCE;
    private boolean isEnabled;
    private ViewTreeObserver.OnPreDrawListener preDrawListener;
    private final EllipsizedTextView textView;

    /* compiled from: AutoEllipsizeHelper.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public AutoEllipsizeHelper(EllipsizedTextView ellipsizedTextView) {
        this.textView = ellipsizedTextView;
    }

    private final void addListener() {
        if (this.preDrawListener != null) {
            return;
        }
        this.preDrawListener = OnPreDrawListeners.onPreDrawListener(this.drawingPassOverrideStrategy, new gzs<Boolean>() { // from class: com.yandex.div.internal.widget.AutoEllipsizeHelper$addListener$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // xsna.gzs
            public final Boolean invoke() {
                EllipsizedTextView ellipsizedTextView;
                boolean z;
                EllipsizedTextView ellipsizedTextView2;
                EllipsizedTextView ellipsizedTextView3;
                if (!AutoEllipsizeHelper.this.isEnabled()) {
                    return Boolean.TRUE;
                }
                ellipsizedTextView = AutoEllipsizeHelper.this.textView;
                int height = (ellipsizedTextView.getHeight() - ellipsizedTextView.getCompoundPaddingTop()) - ellipsizedTextView.getCompoundPaddingBottom();
                int lineAt = TextViewsKt.lineAt(ellipsizedTextView, height);
                int i = lineAt + 1;
                if (height >= TextViewsKt.textHeight(ellipsizedTextView, i)) {
                    lineAt = i;
                }
                if (lineAt > 0) {
                    ellipsizedTextView2 = AutoEllipsizeHelper.this.textView;
                    if (lineAt < ellipsizedTextView2.getLineCount()) {
                        KLog kLog = KLog.INSTANCE;
                        if (kLog.isAtLeast(Severity.DEBUG)) {
                            kLog.print(3, "AutoEllipsizeHelper", tgw.b(lineAt, "Trying to set new max lines ", ". Current drawing pass is canceled. "));
                        }
                        ellipsizedTextView3 = AutoEllipsizeHelper.this.textView;
                        ellipsizedTextView3.setMaxLines(lineAt);
                        z = false;
                        return Boolean.valueOf(z);
                    }
                }
                AutoEllipsizeHelper.this.removeListener();
                z = true;
                return Boolean.valueOf(z);
            }
        });
        this.textView.getViewTreeObserver().addOnPreDrawListener(this.preDrawListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeListener() {
        if (this.preDrawListener != null) {
            this.textView.getViewTreeObserver().removeOnPreDrawListener(this.preDrawListener);
            this.preDrawListener = null;
        }
    }

    public final DrawingPassOverrideStrategy getDrawingPassOverrideStrategy() {
        return this.drawingPassOverrideStrategy;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void onViewAttachedToWindow() {
        if (this.isEnabled) {
            addListener();
        }
    }

    public final void onViewDetachedFromWindow() {
        removeListener();
    }

    public final void setDrawingPassOverrideStrategy(DrawingPassOverrideStrategy drawingPassOverrideStrategy) {
        this.drawingPassOverrideStrategy = drawingPassOverrideStrategy;
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
    }
}
