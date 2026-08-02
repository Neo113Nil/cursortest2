package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.swipes.ButtonsSwipeView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: ButtonsSwipeStateListener.kt */
/* loaded from: classes17.dex */
public final class os8 extends RecyclerView.t implements ButtonsSwipeView.a {
    public final ArrayList<WeakReference<phh0>> b;

    public os8(ArrayList<WeakReference<phh0>> arrayList) {
        this.b = arrayList;
    }

    @Override // com.vk.core.ui.swipes.ButtonsSwipeView.a
    public final void a(int i, int i2, View view) {
        if (i2 == ((ButtonsSwipeView) view).getInitialScrollOffset()) {
            l((ButtonsSwipeView) view);
        }
    }

    public final void l(ButtonsSwipeView buttonsSwipeView) {
        ArrayList<WeakReference<phh0>> arrayList = this.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            phh0 phh0Var = arrayList.get(size).get();
            if (phh0Var != null && phh0Var.M4() != buttonsSwipeView) {
                phh0Var.h0();
            }
            if (phh0Var == null) {
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

    @Override // com.vk.core.ui.swipes.ButtonsSwipeView.a
    public final void c() {
    }
}
