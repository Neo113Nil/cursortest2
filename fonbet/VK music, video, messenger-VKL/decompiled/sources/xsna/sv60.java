package xsna;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: NewsfeedPostLikesActivityScrollController.kt */
/* loaded from: classes4.dex */
public final class sv60 {
    public int a;
    public a c;
    public boolean e;
    public final Handler b = new Handler(Looper.getMainLooper());
    public WeakReference<RecyclerView> d = new WeakReference<>(null);

    /* compiled from: NewsfeedPostLikesActivityScrollController.kt */
    public final class a implements Runnable {
        public final Rect b = new Rect();

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view;
            RecyclerView recyclerView = sv60.this.d.get();
            if (recyclerView == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            int childCount = recyclerView.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                Object findContainingViewHolder = recyclerView.findContainingViewHolder(recyclerView.getChildAt(i));
                iis iisVar = findContainingViewHolder instanceof iis ? (iis) findContainingViewHolder : null;
                if (iisVar != null) {
                    arrayList.add(iisVar);
                }
                i++;
            }
            Rect rect = this.b;
            recyclerView.getLocalVisibleRect(rect);
            int height = rect.height() - iah0.a(60);
            float f = height >= 0 ? height : 0;
            float f2 = f - (0.75f * f);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Object obj = (iis) next;
                qi6 qi6Var = obj instanceof qi6 ? (qi6) obj : null;
                if (qi6Var != null && (view = qi6Var.itemView) != null) {
                    float bottom = view.getBottom();
                    if (bottom >= f2 && bottom <= f) {
                        arrayList2.add(next);
                    }
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((iis) it2.next()).X4();
            }
        }
    }
}
