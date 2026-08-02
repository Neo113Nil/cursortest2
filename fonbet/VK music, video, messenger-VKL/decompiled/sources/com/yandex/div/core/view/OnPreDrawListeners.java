package com.yandex.div.core.view;

import android.view.ViewTreeObserver;
import com.yandex.div.core.view.DrawingPassOverrideStrategy;
import com.yandex.div.core.view.OnPreDrawListeners;
import xsna.gzs;

/* compiled from: OnPreDrawListeners.kt */
/* loaded from: classes7.dex */
public final class OnPreDrawListeners {
    public static final ViewTreeObserver.OnPreDrawListener onPreDrawListener(DrawingPassOverrideStrategy drawingPassOverrideStrategy, final gzs<Boolean> gzsVar) {
        return new OverridableOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: xsna.ga80
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean onPreDrawListener$lambda$0;
                onPreDrawListener$lambda$0 = OnPreDrawListeners.onPreDrawListener$lambda$0(gzs.this);
                return onPreDrawListener$lambda$0;
            }
        }, drawingPassOverrideStrategy);
    }

    public static /* synthetic */ ViewTreeObserver.OnPreDrawListener onPreDrawListener$default(DrawingPassOverrideStrategy drawingPassOverrideStrategy, gzs gzsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            drawingPassOverrideStrategy = DrawingPassOverrideStrategy.Safe.INSTANCE;
        }
        return onPreDrawListener(drawingPassOverrideStrategy, gzsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onPreDrawListener$lambda$0(gzs gzsVar) {
        return ((Boolean) gzsVar.invoke()).booleanValue();
    }
}
