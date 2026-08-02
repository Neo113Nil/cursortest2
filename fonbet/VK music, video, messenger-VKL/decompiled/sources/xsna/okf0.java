package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ViewExt.kt */
/* loaded from: classes7.dex */
public final class okf0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public okf0(RecyclerView recyclerView, int i, int i2) {
        this.b = recyclerView;
        this.c = i;
        this.d = i2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        int i9 = this.c;
        int i10 = this.d;
        RecyclerView recyclerView = this.b;
        recyclerView.postDelayed(new qkf0(recyclerView, i9, i10), 150L);
    }
}
