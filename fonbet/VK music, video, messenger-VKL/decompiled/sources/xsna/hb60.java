package xsna;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: NewsEntryWatcher.kt */
/* loaded from: classes4.dex */
public final class hb60 {
    public int a;
    public final b b;
    public final HashSet<a> c;
    public boolean d;

    /* compiled from: NewsEntryWatcher.kt */
    public static final class b implements Runnable {
        public final long b;
        public final float c;
        public RecyclerView e;
        public Collection<? extends a> f;
        public final Rect d = new Rect();
        public final Handler g = new Handler(Looper.getMainLooper());
        public final LinkedHashMap<NewsEntry, Boolean> h = new LinkedHashMap<>();
        public final LinkedHashMap i = new LinkedHashMap();

        public b(long j, float f) {
            this.b = j;
            this.c = f;
        }

        public final void a() {
            this.e = null;
            Collection<? extends a> collection = this.f;
            if (collection != null) {
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).dispose();
                }
            }
            this.f = null;
            this.g.removeCallbacksAndMessages(null);
        }

        @Override // java.lang.Runnable
        public final void run() {
            LinkedHashMap linkedHashMap;
            LinkedHashMap<NewsEntry, Boolean> linkedHashMap2;
            qi6 qi6Var;
            qi6 qi6Var2;
            NewsEntry t6;
            RecyclerView recyclerView = this.e;
            if (recyclerView == null) {
                return;
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            int height = recyclerView.getHeight();
            int childCount = recyclerView.getChildCount();
            Integer num = null;
            NewsEntry newsEntry = null;
            int i = 0;
            int i2 = 0;
            while (true) {
                linkedHashMap = this.i;
                linkedHashMap2 = this.h;
                if (i >= childCount) {
                    break;
                }
                RecyclerView.e0 findContainingViewHolder = recyclerView.findContainingViewHolder(recyclerView.getChildAt(i));
                qi6 qi6Var3 = findContainingViewHolder instanceof qi6 ? (qi6) findContainingViewHolder : null;
                if (qi6Var3 != null && (t6 = qi6Var3.t6()) != null) {
                    View view = qi6Var3.itemView;
                    if (!epx.f(newsEntry, t6)) {
                        newsEntry = t6;
                        i2 = 0;
                    }
                    Rect rect = this.d;
                    if (view.getLocalVisibleRect(rect)) {
                        i2 += rect.height();
                        linkedHashMap2.put(newsEntry, Boolean.valueOf(height > 0 && ((float) i2) / ((float) height) > this.c));
                        Object obj = linkedHashMap.get(newsEntry);
                        if (obj == null) {
                            obj = new ArrayList();
                            linkedHashMap.put(newsEntry, obj);
                        }
                        ((List) obj).add(qi6Var3);
                    }
                }
                i++;
            }
            if (linkedHashMap2.keySet().size() > 2) {
                Iterator it = j5g.O0(linkedHashMap2.keySet()).subList(1, linkedHashMap2.keySet().size() - 1).iterator();
                while (it.hasNext()) {
                    linkedHashMap2.put((NewsEntry) it.next(), Boolean.TRUE);
                }
            }
            if (linkedHashMap2.keySet().size() > 1) {
                NewsEntry newsEntry2 = (NewsEntry) j5g.Z(linkedHashMap2.keySet());
                NewsEntry newsEntry3 = (NewsEntry) j5g.j0(linkedHashMap2.keySet());
                List list = (List) linkedHashMap.get(newsEntry2);
                Integer valueOf = (list == null || (qi6Var2 = (qi6) j5g.a0(list)) == null) ? null : Integer.valueOf(qi6Var2.getLayoutPosition());
                List list2 = (List) linkedHashMap.get(newsEntry3);
                if (list2 != null && (qi6Var = (qi6) j5g.k0(list2)) != null) {
                    num = Integer.valueOf(qi6Var.getLayoutPosition());
                }
                if (newsEntry2 != null && !epx.f(linkedHashMap2.get(newsEntry2), Boolean.TRUE)) {
                    linkedHashMap2.put(newsEntry2, Boolean.valueOf(valueOf != null && valueOf.intValue() == 0));
                }
                if (newsEntry3 != null && !epx.f(linkedHashMap2.get(newsEntry3), Boolean.TRUE)) {
                    linkedHashMap2.put(newsEntry3, Boolean.valueOf(num != null && num.intValue() == itemCount - 1));
                }
            }
            Iterator<T> it2 = linkedHashMap2.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                NewsEntry newsEntry4 = (NewsEntry) entry.getKey();
                if (((Boolean) entry.getValue()).booleanValue()) {
                    List list3 = (List) linkedHashMap.get(newsEntry4);
                    if (list3 == null) {
                        break;
                    }
                    Collection<? extends a> collection = this.f;
                    if (collection != null) {
                        boolean z = collection instanceof List;
                        long j = 0;
                        long j2 = this.b;
                        Handler handler = this.g;
                        if (z && (collection instanceof RandomAccess)) {
                            List list4 = (List) collection;
                            int size = list4.size();
                            int i3 = 0;
                            while (i3 < size) {
                                a aVar = (a) list4.get(i3);
                                yqb yqbVar = new yqb(aVar, newsEntry4, list3);
                                long a = aVar.a() - j2;
                                long j3 = j;
                                if (a >= j) {
                                    j = a;
                                }
                                handler.postDelayed(yqbVar, j);
                                i3++;
                                j = j3;
                            }
                        } else {
                            for (a aVar2 : collection) {
                                yqb yqbVar2 = new yqb(aVar2, newsEntry4, list3);
                                long a2 = aVar2.a() - j2;
                                if (a2 < 0) {
                                    a2 = 0;
                                }
                                handler.postDelayed(yqbVar2, a2);
                            }
                        }
                    }
                }
            }
            linkedHashMap2.clear();
            linkedHashMap.clear();
        }
    }

    public hb60() {
        this(300L, 0.45f);
    }

    public hb60(long j, float f) {
        this.b = new b(j, f);
        this.c = new HashSet<>();
    }

    /* compiled from: NewsEntryWatcher.kt */
    public interface a {
        long a();

        void b(NewsEntry newsEntry, List<? extends qi6<?>> list);

        default void dispose() {
        }
    }
}
