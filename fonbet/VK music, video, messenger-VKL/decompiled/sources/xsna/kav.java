package xsna;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import xsna.ps8;

/* compiled from: HoldersSwipeController.kt */
/* loaded from: classes6.dex */
public final class kav implements ps8.a {
    public final ArrayList<WeakReference<bq6>> b = new ArrayList<>();

    @Override // xsna.ps8.a
    public final void a(int i, int i2, View view) {
        if (i == ((ps8) view).getMaxEndScrollOffset()) {
            ArrayList<WeakReference<bq6>> arrayList = this.b;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                bq6 bq6Var = arrayList.get(i3).get();
                if (bq6Var != null && bq6Var.itemView != view) {
                    bq6Var.h0();
                }
                if (bq6Var == null) {
                    arrayList.remove(i3);
                }
            }
        }
    }

    @Override // xsna.ps8.a
    public final void c() {
    }
}
