package xsna;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: AsyncPosterRecyclerViewObserver.kt */
/* loaded from: classes4.dex */
public final class py3<T> implements zjf0<T> {
    public final ArrayList<WeakReference<gac0>> b;
    public final qy3 c;

    /* compiled from: AsyncPosterRecyclerViewObserver.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ py3<T> b;
        public final /* synthetic */ RecyclerView.e0 c;

        public a(py3<T> py3Var, RecyclerView.e0 e0Var) {
            this.b = py3Var;
            this.c = e0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            py3<T> py3Var = this.b;
            ArrayList<WeakReference<gac0>> arrayList = py3Var.b;
            RecyclerView.e0 e0Var = this.c;
            arrayList.add(new WeakReference<>(e0Var));
            qy3 qy3Var = py3Var.c;
            Context context = e0Var.itemView.getContext();
            int i = qy3Var.d + 1;
            qy3Var.d = i;
            if (i > 0) {
                qy3Var.a(context);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            py3<T> py3Var = this.b;
            ArrayList<WeakReference<gac0>> arrayList = py3Var.b;
            int size = arrayList.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    break;
                }
                WeakReference weakReference = (WeakReference) j5g.b0(size, arrayList);
                if (this.c == (weakReference != null ? (gac0) weakReference.get() : null)) {
                    arrayList.remove(size);
                }
            }
            qy3 qy3Var = py3Var.c;
            int i = qy3Var.d - 1;
            qy3Var.d = i;
            if (i <= 0) {
                qy3Var.e = false;
                io.reactivex.rxjava3.disposables.g gVar = qy3Var.c;
                if (gVar != null && !gVar.h()) {
                    gVar.dispose();
                }
                qy3Var.c = null;
            }
        }
    }

    public py3(ArrayList arrayList, qy3 qy3Var) {
        this.b = arrayList;
        this.c = qy3Var;
    }

    @Override // xsna.zjf0
    public final void e(RecyclerView.e0 e0Var) {
        if (e0Var instanceof gac0) {
            e0Var.itemView.addOnAttachStateChangeListener(new a(this, e0Var));
        }
    }

    @Override // xsna.zjf0
    public final void b(RecyclerView.e0 e0Var) {
    }

    @Override // xsna.zjf0
    public final void d(RecyclerView.e0 e0Var, T t) {
    }
}
