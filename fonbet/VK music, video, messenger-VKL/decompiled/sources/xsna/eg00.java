package xsna;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: MainThreadCompositeRecyclerViewObserver.kt */
/* loaded from: classes4.dex */
public abstract class eg00<T> implements zjf0<T> {
    public final ArrayList<zjf0<T>> b = new ArrayList<>();

    @Override // xsna.zjf0
    public void b(RecyclerView.e0 e0Var) {
        ArrayList<zjf0<T>> arrayList = this.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                arrayList.get(size).b(e0Var);
            }
        }
    }

    @Override // xsna.zjf0
    public void d(RecyclerView.e0 e0Var, T t) {
        ArrayList<zjf0<T>> arrayList = this.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                arrayList.get(size).d(e0Var, t);
            }
        }
    }

    @Override // xsna.zjf0
    public void e(RecyclerView.e0 e0Var) {
        ArrayList<zjf0<T>> arrayList = this.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                arrayList.get(size).e(e0Var);
            }
        }
    }
}
