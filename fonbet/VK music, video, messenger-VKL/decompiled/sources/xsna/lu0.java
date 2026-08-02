package xsna;

import com.ironsource.Hb;
import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.PageHistory;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: AdsAnomalyDetector.kt */
/* loaded from: classes4.dex */
public final class lu0 implements ht2 {
    public final ArrayList<NewsEntry> a = new ArrayList<>();
    public final ArrayList<PageHistory> b = new ArrayList<>();

    public static int b(List list) {
        List list2 = list;
        if (!(list2 instanceof List) || !(list2 instanceof RandomAccess)) {
            Iterator it = list2.iterator();
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                i = di60.x((NewsEntry) it.next()) ? i + 1 : 0;
                i2 = Math.max(i, i2);
            }
            return i2;
        }
        List list3 = list2;
        int size = list3.size();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 = di60.x((NewsEntry) list3.get(i5)) ? i4 + 1 : 0;
            i3 = Math.max(i4, i3);
        }
        return i3;
    }

    @Override // xsna.ht2
    public final synchronized boolean a(List<? extends NewsEntry> list, String str, String str2, long j, long j2, awq awqVar) {
        boolean z;
        ArrayList arrayList;
        try {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            z = true;
            boolean z2 = true;
            for (int i = 0; i < size; i++) {
                if (!this.a.contains(list.get(i))) {
                    arrayList2.add(list.get(i));
                    if (z2 && !di60.x(list.get(i))) {
                        z2 = false;
                    }
                }
            }
            if (this.a.isEmpty()) {
                arrayList = arrayList2;
            } else {
                int max = Math.max(0, this.a.size() - 5);
                int size2 = this.a.size();
                arrayList = new ArrayList((size2 - max) + arrayList2.size());
                arrayList.addAll(this.a.subList(max, size2));
                arrayList.addAll(arrayList2);
            }
            ArrayList<PageHistory> arrayList3 = this.b;
            Serializer.c<PageHistory> cVar = PageHistory.CREATOR;
            arrayList3.add(PageHistory.a.a(list, str, str2, j, j2));
            int b = b(arrayList);
            boolean z3 = !arrayList2.isEmpty() && z2;
            if (b >= 2 || z3) {
                String str3 = z3 ? "only_ads_after_filter" : (di60.x((NewsEntry) j5g.k0(this.a)) && di60.x((NewsEntry) j5g.a0(list))) ? "merge" : b(list) >= 2 ? Hb.a : "filter";
                if (awqVar != null) {
                    awqVar.l(b, str3.equals("merge"));
                }
                String str4 = com.vk.newsfeed.common.util.k.a;
                com.vk.newsfeed.common.util.k.c(this.a, list, arrayList2, str, str2, j, j2, str3, b, this.b);
            }
            this.a.addAll(arrayList2);
            if (b < 4 && !z3) {
                z = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    @Override // xsna.ht2
    public final synchronized void reset() {
        this.b.clear();
        this.a.clear();
    }
}
