package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: HideKeyboardVerticalScrollListener.java */
/* loaded from: classes2.dex */
public final class a4v extends RecyclerView.t {
    public final boolean c;
    public final int e;
    public final izs<View, ?> g;
    public final boolean b = true;
    public boolean d = true;
    public int f = 0;

    public a4v(Context context, izs izsVar, boolean z) {
        this.g = izsVar;
        this.c = z;
        this.e = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 0) {
            this.d = true;
            this.f = 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3 = this.f;
        if ((i3 < 0 && i2 > 0) || (i3 > 0 && i2 < 0)) {
            this.f = 0;
        }
        int i4 = this.f + i2;
        this.f = i4;
        int i5 = this.e;
        boolean z = i4 <= (-i5);
        boolean z2 = i4 >= i5;
        if (this.d) {
            if ((z && this.b) || (z2 && this.c)) {
                this.g.invoke(recyclerView);
                this.d = false;
            }
        }
    }
}
