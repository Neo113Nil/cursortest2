package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.newsfeed.impl.util.NewsEntryWatcherMode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Pair;
import xsna.hb60;

/* compiled from: NewsEntryWatcher.kt */
/* loaded from: classes4.dex */
public final class ib60 {
    public final HashMap<NewsEntryWatcherMode, hb60> a;

    public ib60() {
        NewsEntryWatcherMode newsEntryWatcherMode = NewsEntryWatcherMode.FAST;
        Pair pair = new Pair(newsEntryWatcherMode, new hb60(newsEntryWatcherMode.h(), newsEntryWatcherMode.i()));
        NewsEntryWatcherMode newsEntryWatcherMode2 = NewsEntryWatcherMode.NORMAL;
        Pair pair2 = new Pair(newsEntryWatcherMode2, new hb60(newsEntryWatcherMode2.h(), newsEntryWatcherMode2.i()));
        NewsEntryWatcherMode newsEntryWatcherMode3 = NewsEntryWatcherMode.HALF;
        this.a = pn00.i(pair, pair2, new Pair(newsEntryWatcherMode3, new hb60(newsEntryWatcherMode3.h(), newsEntryWatcherMode3.i())));
    }

    public final void a(hb60.a aVar, NewsEntryWatcherMode newsEntryWatcherMode) {
        hb60 hb60Var = this.a.get(newsEntryWatcherMode);
        if (hb60Var != null) {
            hb60Var.c.add(aVar);
        }
    }

    public final void c() {
        Iterator<T> it = this.a.values().iterator();
        while (it.hasNext()) {
            ((hb60) it.next()).b.a();
        }
    }

    public final void d(RecyclerView recyclerView, int i) {
        for (hb60 hb60Var : this.a.values()) {
            hb60.b bVar = hb60Var.b;
            int i2 = hb60Var.a;
            if (i2 != i && i2 == 0) {
                bVar.a();
            } else if (i2 != i && i == 0 && hb60Var.d) {
                HashSet<hb60.a> hashSet = hb60Var.c;
                bVar.e = recyclerView;
                bVar.f = hashSet;
                bVar.g.postDelayed(bVar, bVar.b);
            }
            hb60Var.a = i;
        }
    }

    public final void e() {
        Iterator<T> it = this.a.values().iterator();
        while (it.hasNext()) {
            ((hb60) it.next()).c.clear();
        }
    }

    public final void f() {
        Iterator<T> it = this.a.values().iterator();
        while (it.hasNext()) {
            ((hb60) it.next()).d = true;
        }
    }

    public final void g(RecyclerView recyclerView) {
        for (hb60 hb60Var : this.a.values()) {
            hb60.b bVar = hb60Var.b;
            HashSet<hb60.a> hashSet = hb60Var.c;
            bVar.e = recyclerView;
            bVar.f = hashSet;
            bVar.g.postDelayed(bVar, bVar.b);
        }
    }

    public final void h() {
        for (hb60 hb60Var : this.a.values()) {
            hb60Var.b.a();
            hb60Var.d = false;
        }
    }
}
