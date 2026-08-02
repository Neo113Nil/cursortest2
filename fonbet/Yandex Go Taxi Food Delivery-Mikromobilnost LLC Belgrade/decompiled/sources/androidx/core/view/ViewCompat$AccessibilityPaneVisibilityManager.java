package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
class ViewCompat$AccessibilityPaneVisibilityManager implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
    private final WeakHashMap<View, Boolean> mPanesToVisible = new WeakHashMap<>();

    private void checkPaneVisibility(Map.Entry<View, Boolean> entry) {
        View key = entry.getKey();
        boolean booleanValue = entry.getValue().booleanValue();
        boolean z = key.isShown() && key.getWindowVisibility() == 0;
        if (booleanValue != z) {
            b.j(z ? 16 : 32, key);
            entry.setValue(Boolean.valueOf(z));
        }
    }

    private void registerForLayoutCallback(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    private void unregisterForLayoutCallback(View view) {
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    public void addAccessibilityPane(View view) {
        this.mPanesToVisible.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            registerForLayoutCallback(view);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        registerForLayoutCallback(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }

    public void removeAccessibilityPane(View view) {
        this.mPanesToVisible.remove(view);
        view.removeOnAttachStateChangeListener(this);
        unregisterForLayoutCallback(view);
    }
}
