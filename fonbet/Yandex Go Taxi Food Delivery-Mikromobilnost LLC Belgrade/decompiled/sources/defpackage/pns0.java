package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes12.dex */
public final /* synthetic */ class pns0 implements g18 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ View.OnLayoutChangeListener c;

    public /* synthetic */ pns0(RecyclerView recyclerView, View.OnLayoutChangeListener onLayoutChangeListener, int i) {
        this.a = i;
        this.b = recyclerView;
        this.c = onLayoutChangeListener;
    }

    @Override // defpackage.g18
    public final void cancel() {
        int i = this.a;
        View.OnLayoutChangeListener onLayoutChangeListener = this.c;
        RecyclerView recyclerView = this.b;
        switch (i) {
            case 0:
                recyclerView.removeOnLayoutChangeListener(onLayoutChangeListener);
                break;
            default:
                recyclerView.removeOnLayoutChangeListener(onLayoutChangeListener);
                break;
        }
    }
}
