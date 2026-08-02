package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;

/* loaded from: classes6.dex */
public final class d1o0 extends GridLayoutManager.b {
    public final bys d;

    public d1o0(bys bysVar) {
        this.d = bysVar;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.b
    public final int c(int i) {
        int itemCount = this.d.getItemCount();
        if (itemCount == 1) {
            return 12;
        }
        if (itemCount == 2) {
            return 6;
        }
        if (itemCount == 3) {
            return i < 2 ? 6 : 12;
        }
        if (itemCount != 4) {
            if (itemCount == 5 && i >= 3) {
                return 6;
            }
        } else if (i >= 3) {
            return 12;
        }
        return 4;
    }
}
