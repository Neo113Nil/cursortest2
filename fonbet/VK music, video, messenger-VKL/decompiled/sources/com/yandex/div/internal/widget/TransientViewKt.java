package com.yandex.div.internal.widget;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: TransientView.kt */
/* loaded from: classes7.dex */
public final class TransientViewKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean isInTransientHierarchy(View view) {
        if (!(view instanceof TransientView)) {
            return false;
        }
        if (((TransientView) view).isTransient()) {
            return true;
        }
        return (view.getParent() instanceof ViewGroup) && isInTransientHierarchy(view.getParent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean isInTransientHierarchy(ViewParent viewParent) {
        return (viewParent instanceof TransientView) && isInTransientHierarchy((View) viewParent);
    }
}
