package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes2.dex */
public final class alz extends RecyclerView.g {
    public final /* synthetic */ FloatingActionButton a;

    public alz(FloatingActionButton floatingActionButton) {
        this.a = floatingActionButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        FloatingActionButton floatingActionButton = this.a;
        if (i2 > 0) {
            floatingActionButton.show();
        } else {
            floatingActionButton.hide();
        }
    }
}
