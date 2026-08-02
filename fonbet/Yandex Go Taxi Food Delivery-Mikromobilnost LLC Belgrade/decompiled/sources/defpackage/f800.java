package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.z0;
import core.flex.ui.OrientationAwareRecyclerView;

/* loaded from: classes.dex */
public final class f800 extends z0 {
    public final OrientationAwareRecyclerView c;

    public f800(OrientationAwareRecyclerView orientationAwareRecyclerView) {
        super(orientationAwareRecyclerView);
        this.c = orientationAwareRecyclerView;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        OrientationAwareRecyclerView orientationAwareRecyclerView = this.c;
        Boolean valueOf = (orientationAwareRecyclerView.isInLayout() || orientationAwareRecyclerView.isComputingLayout()) ? null : Boolean.valueOf(super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent));
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return false;
    }
}
