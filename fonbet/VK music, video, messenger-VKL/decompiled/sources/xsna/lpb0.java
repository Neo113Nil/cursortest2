package xsna;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PollEditorScreen.kt */
/* loaded from: classes17.dex */
public final class lpb0 implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ hpb0 b;

    public lpb0(hpb0 hpb0Var) {
        this.b = hpb0Var;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        hpb0.a(this.b);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        hpb0.a(this.b);
    }
}
