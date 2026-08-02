package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import xsna.ps8;

/* compiled from: ButtonsSwipeStateListener.kt */
/* loaded from: classes6.dex */
public final class ns8 extends RecyclerView.t implements ps8.a {
    public final ArrayList<WeakReference<RecyclerView.e0>> b;

    public ns8(ArrayList<WeakReference<RecyclerView.e0>> arrayList) {
        this.b = arrayList;
    }

    @Override // xsna.ps8.a
    public final void a(int i, int i2, View view) {
        if (i2 == ((ps8) view).getInitialScrollOffset()) {
            l((ps8) view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(ps8 ps8Var) {
        ArrayList<WeakReference<RecyclerView.e0>> arrayList = this.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            RecyclerView.e0 e0Var = arrayList.get(size).get();
            if (e0Var != 0 && e0Var.itemView != ps8Var && (e0Var instanceof wgh0)) {
                ((wgh0) e0Var).h0();
            }
            if (e0Var == 0) {
                arrayList.remove(size);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 1) {
            l(null);
        }
    }

    @Override // xsna.ps8.a
    public final void c() {
    }
}
