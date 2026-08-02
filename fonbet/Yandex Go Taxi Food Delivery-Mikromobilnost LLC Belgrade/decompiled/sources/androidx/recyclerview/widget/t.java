package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.oyr;

/* loaded from: classes10.dex */
public final class t {
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean h;
    public boolean i;
    public boolean a = true;
    public int f = 0;
    public int g = 0;

    public final boolean a(RecyclerView.k kVar) {
        int i = this.c;
        return i >= 0 && i < kVar.b();
    }

    public final View b(r0 r0Var) {
        View e = r0Var.e(this.c);
        this.c += this.d;
        return e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LayoutState{mAvailable=");
        sb.append(this.b);
        sb.append(", mCurrentPosition=");
        sb.append(this.c);
        sb.append(", mItemDirection=");
        sb.append(this.d);
        sb.append(", mLayoutDirection=");
        sb.append(this.e);
        sb.append(", mStartLine=");
        sb.append(this.f);
        sb.append(", mEndLine=");
        return oyr.s(sb, this.g, '}');
    }
}
