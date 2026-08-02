package xsna;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: RecyclerHolderWatcher.kt */
/* loaded from: classes4.dex */
public final class yif0 {
    public int a;
    public final b b = new b();
    public final ArrayList<a> c = new ArrayList<>();

    /* compiled from: RecyclerHolderWatcher.kt */
    public interface a {
        void a(RecyclerView.e0 e0Var);
    }

    /* compiled from: RecyclerHolderWatcher.kt */
    public static final class b implements Runnable {
        public RecyclerView c;
        public ArrayList<a> d;
        public final Rect b = new Rect();
        public final Handler e = new Handler(Looper.getMainLooper());

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList<a> arrayList;
            RecyclerView recyclerView = this.c;
            if (recyclerView == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView.e0 findContainingViewHolder = recyclerView.findContainingViewHolder(recyclerView.getChildAt(i));
                if (findContainingViewHolder != null) {
                    View view = findContainingViewHolder.itemView;
                    Rect rect = this.b;
                    view.getGlobalVisibleRect(rect);
                    if (!rect.isEmpty() && rect.height() == view.getHeight() && (arrayList = this.d) != null) {
                        int size = arrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            a aVar = arrayList.get(i2);
                            w9j w9jVar = new w9j(7, aVar, findContainingViewHolder);
                            aVar.getClass();
                            this.e.postDelayed(w9jVar, 0L);
                        }
                    }
                }
            }
        }
    }

    public final void a(RecyclerView recyclerView, int i) {
        int i2 = this.a;
        b bVar = this.b;
        if (i2 != i && i2 == 0) {
            bVar.c = null;
            bVar.d = null;
            i0q0.h(bVar);
            bVar.e.removeCallbacksAndMessages(null);
        } else if (i2 != i && i == 0) {
            bVar.c = recyclerView;
            bVar.d = this.c;
            i0q0.d(1000L, bVar);
        }
        this.a = i;
    }
}
