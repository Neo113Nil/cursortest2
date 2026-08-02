package defpackage;

import androidx.core.view.AccessibilityDelegateCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.z0;

/* loaded from: classes6.dex */
public final class ib31 extends z0 {
    public final RecyclerView c;

    public ib31(RecyclerView recyclerView) {
        super(recyclerView);
        this.c = recyclerView;
    }

    @Override // androidx.recyclerview.widget.z0
    public final AccessibilityDelegateCompat a() {
        return new hb31(this);
    }
}
