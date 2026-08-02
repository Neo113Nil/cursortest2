package defpackage;

import androidx.core.view.AccessibilityDelegateCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y0;
import androidx.recyclerview.widget.z0;

/* loaded from: classes10.dex */
public final class ime0 extends z0 {
    public final RecyclerView c;
    public final y0 w;
    public final hme0 x;

    public ime0(RecyclerView recyclerView) {
        super(recyclerView);
        this.w = this.b;
        this.x = new hme0(this);
        this.c = recyclerView;
    }

    @Override // androidx.recyclerview.widget.z0
    public final AccessibilityDelegateCompat a() {
        return this.x;
    }
}
