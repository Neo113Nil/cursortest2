package xsna;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PostingStep1View.kt */
/* loaded from: classes4.dex */
public final class hoc0 implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ enc0 b;

    public hoc0(enc0 enc0Var) {
        this.b = enc0Var;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        enc0.a(this.b);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        enc0.a(this.b);
    }
}
