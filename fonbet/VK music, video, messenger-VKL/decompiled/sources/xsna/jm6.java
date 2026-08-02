package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import xsna.fb80;

/* compiled from: BaseScreenTimeChecker.kt */
/* loaded from: classes17.dex */
public abstract class jm6<K> extends fb80<K> {
    public final pvx d;
    public final HashMap<K, List<gvo0>> e;
    public final HashMap<K, Long> f;
    public final HashMap<K, Boolean> g;
    public final HashSet<K> h;
    public final ArrayList<K> i;
    public final ArrayList j;

    public jm6(RecyclerView recyclerView, fb80.b<K> bVar, pvx pvxVar) {
        super(recyclerView, bVar);
        this.d = pvxVar;
        this.e = new HashMap<>();
        this.f = new HashMap<>();
        this.g = new HashMap<>();
        this.h = new HashSet<>();
        this.i = new ArrayList<>();
        this.j = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a() {
        HashMap<K, Boolean> hashMap;
        HashSet<K> hashSet;
        HashMap<K, Long> hashMap2;
        ArrayList<K> arrayList;
        ArrayList arrayList2;
        this.d.a();
        long currentTimeMillis = System.currentTimeMillis();
        int i = 0;
        while (true) {
            RecyclerView recyclerView = this.b;
            int childCount = recyclerView.getChildCount();
            hashMap = this.g;
            if (i >= childCount) {
                break;
            }
            RecyclerView.e0 findContainingViewHolder = recyclerView.findContainingViewHolder(recyclerView.getChildAt(i));
            if (findContainingViewHolder == null) {
                i++;
            }
            if (findContainingViewHolder != null) {
                RecyclerView.e0 e0Var = findContainingViewHolder;
                RecyclerView.e0 findContainingViewHolder2 = i < recyclerView.getChildCount() + (-1) ? recyclerView.findContainingViewHolder(recyclerView.getChildAt(i + 1)) : null;
                while (true) {
                    arrayList2 = this.j;
                    if (findContainingViewHolder2 == null || !f(e0Var, findContainingViewHolder2)) {
                        break;
                    }
                    arrayList2.add(e0Var);
                    int i2 = i + 1;
                    RecyclerView.e0 e0Var2 = findContainingViewHolder2;
                    findContainingViewHolder2 = i2 < recyclerView.getChildCount() + (-1) ? recyclerView.findContainingViewHolder(recyclerView.getChildAt(i + 2)) : null;
                    i = i2;
                    e0Var = e0Var2;
                }
                arrayList2.add(e0Var);
                i++;
                Object c = c(e0Var);
                if (c != null) {
                    Boolean bool = (Boolean) hashMap.get(c);
                    if (!(bool != null ? bool.booleanValue() : false)) {
                        hashMap.put(c, Boolean.valueOf(e(recyclerView, c, arrayList2)));
                    }
                    arrayList2.clear();
                }
            }
        }
        Iterator it = hashMap.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashSet = this.h;
            hashMap2 = this.f;
            arrayList = this.i;
            if (!hasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            if (((Boolean) entry.getValue()).booleanValue()) {
                if (hashMap2.get(key) == null) {
                    hashMap2.put(key, Long.valueOf(currentTimeMillis));
                }
                hashSet.add(key);
            } else {
                Long l = (Long) hashMap2.remove(key);
                if (l != null) {
                    h(key, l.longValue(), currentTimeMillis);
                    arrayList.add(key);
                }
            }
        }
        hashMap.clear();
        if (!arrayList.isEmpty()) {
            g(arrayList);
            arrayList.clear();
        }
        if (hashMap2.size() != hashSet.size()) {
            for (Map.Entry entry2 : hashMap2.entrySet()) {
                if (!hashSet.contains(entry2.getKey())) {
                    h(entry2.getKey(), ((Number) entry2.getValue()).longValue(), currentTimeMillis);
                    arrayList.add(entry2.getKey());
                }
            }
        }
        if (!arrayList.isEmpty()) {
            hashMap2.keySet().removeAll(arrayList);
            g(arrayList);
            arrayList.clear();
        }
        hashSet.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b() {
        long currentTimeMillis = System.currentTimeMillis();
        HashMap<K, Long> hashMap = this.f;
        Iterator<T> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            h(entry.getKey(), ((Long) entry.getValue()).longValue(), currentTimeMillis);
        }
        this.c.getClass();
        HashMap<K, List<gvo0>> hashMap2 = this.e;
        Iterator<T> it2 = hashMap2.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            Object key = entry2.getKey();
            for (gvo0 gvo0Var : (List) entry2.getValue()) {
                this.c.n(key, gvo0Var.a, gvo0Var.b);
                Math.max(0L, gvo0Var.b - gvo0Var.a);
            }
        }
        hashMap.clear();
        hashMap2.clear();
    }

    public abstract K c(RecyclerView.e0 e0Var);

    public boolean d(RecyclerView recyclerView, View view) {
        return this.d.b(recyclerView, view);
    }

    public boolean e(RecyclerView recyclerView, K k, List<? extends RecyclerView.e0> list) {
        RecyclerView.e0 e0Var = (RecyclerView.e0) j5g.a0(list);
        if (e0Var == null) {
            return false;
        }
        return d(recyclerView, e0Var.itemView);
    }

    public boolean f(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
        return false;
    }

    public final void h(K k, long j, long j2) {
        gvo0 gvo0Var = new gvo0(j, j2);
        HashMap<K, List<gvo0>> hashMap = this.e;
        List<gvo0> list = hashMap.get(k);
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(gvo0Var);
        hashMap.put(k, list);
    }

    public void onPause(f5z f5zVar) {
        b();
    }

    public void onResume(f5z f5zVar) {
        a();
    }

    public void g(List<? extends K> list) {
    }
}
