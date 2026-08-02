package xsna;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.h0x;

/* compiled from: InlineCommentWatcher.kt */
/* loaded from: classes4.dex */
public final class h0x {
    public final b a = new b();
    public int b;
    public a c;
    public boolean d;

    /* compiled from: InlineCommentWatcher.kt */
    public interface a {
        void a(List<? extends NewsEntry> list);

        void b(List<? extends NewsEntry> list);

        long c();

        long d();

        float e();
    }

    /* compiled from: InlineCommentWatcher.kt */
    public static final class b implements Runnable {
        public RecyclerView b;
        public a c;
        public final Handler d = new Handler(Looper.getMainLooper());
        public final Rect e = new Rect();

        @Override // java.lang.Runnable
        public final void run() {
            final a aVar;
            NewsEntry t6;
            RecyclerView recyclerView = this.b;
            if (recyclerView != null && (aVar = this.c) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    RecyclerView.e0 findContainingViewHolder = recyclerView.findContainingViewHolder(recyclerView.getChildAt(i));
                    qi6 qi6Var = findContainingViewHolder instanceof qi6 ? (qi6) findContainingViewHolder : null;
                    if (qi6Var != null && (t6 = qi6Var.t6()) != null) {
                        View view = qi6Var.itemView;
                        if (linkedHashMap.containsKey(t6)) {
                            List list = (List) linkedHashMap.get(t6);
                            if (list != null) {
                                list.add(view);
                            }
                        } else {
                            linkedHashMap.put(t6, e43.o(view));
                        }
                    }
                }
                float e = aVar.e();
                Rect rect = this.e;
                recyclerView.getLocalVisibleRect(rect);
                int height = rect.height() - iah0.a(60);
                float f = height >= 0 ? height : 0;
                float f2 = f - (e * f);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    View view2 = (View) j5g.k0((List) entry.getValue());
                    if (view2 != null) {
                        float bottom = view2.getBottom();
                        if (bottom >= f2 && bottom <= f) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                final List O0 = j5g.O0(linkedHashMap2.keySet());
                if (!O0.isEmpty()) {
                    long c = aVar.c();
                    long d = aVar.d();
                    final ls2 ls2Var = new ls2(5, aVar, O0);
                    long j = d - c;
                    final long j2 = j < 0 ? 0L : j;
                    long j3 = c - 300;
                    this.d.postDelayed(new Runnable() { // from class: xsna.i0x
                        @Override // java.lang.Runnable
                        public final void run() {
                            h0x.a.this.b(O0);
                            this.d.postDelayed(ls2Var, j2);
                        }
                    }, "CANCELLABLE_TASK_TAG", j3 >= 0 ? j3 : 0L);
                }
            }
        }
    }

    public final void a(RecyclerView recyclerView, int i) {
        int i2 = this.b;
        b bVar = this.a;
        if (i2 != i && i2 == 0) {
            bVar.b = null;
            bVar.c = null;
            bVar.d.removeCallbacksAndMessages("CANCELLABLE_TASK_TAG");
        } else if (i2 != i && i == 0 && this.d) {
            a aVar = this.c;
            bVar.b = recyclerView;
            bVar.c = aVar;
            bVar.d.postDelayed(bVar, "CANCELLABLE_TASK_TAG", 300L);
        }
        this.b = i;
    }
}
