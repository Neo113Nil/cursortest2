package xsna;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PreferenceRecyclerViewAccessibilityDelegate.java */
@Deprecated
/* loaded from: classes12.dex */
public final class ryc0 extends androidx.recyclerview.widget.l0 {
    public final RecyclerView b;
    public final hk c;
    public final a d;

    /* compiled from: PreferenceRecyclerViewAccessibilityDelegate.java */
    public class a extends hk {
        public a() {
        }

        @Override // xsna.hk
        public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
            ryc0 ryc0Var = ryc0.this;
            ryc0Var.c.onInitializeAccessibilityNodeInfo(view, amVar);
            int childAdapterPosition = ryc0Var.b.getChildAdapterPosition(view);
            RecyclerView.Adapter adapter = ryc0Var.b.getAdapter();
            if (adapter instanceof androidx.preference.c) {
                ((androidx.preference.c) adapter).z0(childAdapterPosition);
            }
        }

        @Override // xsna.hk
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return ryc0.this.c.performAccessibilityAction(view, i, bundle);
        }
    }

    public ryc0(@NonNull RecyclerView recyclerView) {
        super(recyclerView);
        this.c = super.getItemDelegate();
        this.d = new a();
        this.b = recyclerView;
    }

    @Override // androidx.recyclerview.widget.l0
    @NonNull
    public final hk getItemDelegate() {
        return this.d;
    }
}
