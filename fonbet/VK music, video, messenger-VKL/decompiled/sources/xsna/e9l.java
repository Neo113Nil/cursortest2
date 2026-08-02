package xsna;

import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Deduplicator.kt */
/* loaded from: classes4.dex */
public final class e9l {
    public final int a;

    /* compiled from: Deduplicator.kt */
    public static abstract class a {

        /* compiled from: Deduplicator.kt */
        /* renamed from: xsna.e9l$a$a, reason: collision with other inner class name */
        public static final class C2788a extends a {
            public static final C2788a a = new C2788a();
        }

        /* compiled from: Deduplicator.kt */
        public static final class b extends a {
            public static final b a = new b();
        }
    }

    public e9l(int i) {
        this.a = i;
    }

    public final void a(a aVar, ArrayList arrayList, ArrayList arrayList2, awq awqVar) {
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((NewsEntry) it.next()) instanceof Html5Entry) {
                i++;
            }
        }
        boolean x = aVar instanceof a.C2788a ? di60.x((NewsEntry) j5g.k0(arrayList)) : false;
        Iterator it2 = arrayList2.iterator();
        Iterator it3 = null;
        while (it2.hasNext()) {
            NewsEntry newsEntry = (NewsEntry) it2.next();
            boolean x2 = di60.x(newsEntry);
            if (x && x2) {
                it2.remove();
            } else if (arrayList.contains(newsEntry)) {
                it2.remove();
                if (awqVar != null) {
                    awqVar.m(newsEntry);
                }
            } else {
                if (newsEntry instanceof Html5Entry) {
                    if (i < this.a) {
                        i++;
                    } else {
                        it2.remove();
                    }
                }
                it3 = it2;
                x = x2;
            }
        }
        if (aVar instanceof a.b) {
            boolean x3 = di60.x((NewsEntry) j5g.a0(arrayList));
            if (x && x3 && it3 != null) {
                it3.remove();
            }
        }
    }

    public final void b(a aVar, ArrayList arrayList, List list, boolean z, awq awqVar) {
        int i = this.a;
        boolean z2 = false;
        if (!z) {
            Iterator it = list.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                NewsEntry newsEntry = (NewsEntry) it.next();
                boolean x = di60.x(newsEntry);
                if (z2 && x) {
                    it.remove();
                } else {
                    if (newsEntry instanceof Html5Entry) {
                        if (i2 < i) {
                            i2++;
                        } else {
                            it.remove();
                        }
                    }
                    z2 = x;
                }
            }
            return;
        }
        Iterator it2 = arrayList.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            if (((NewsEntry) it2.next()) instanceof Html5Entry) {
                i3++;
            }
        }
        boolean x2 = aVar instanceof a.C2788a ? di60.x((NewsEntry) j5g.k0(arrayList)) : false;
        Iterator it3 = list.iterator();
        Iterator it4 = null;
        while (it3.hasNext()) {
            NewsEntry newsEntry2 = (NewsEntry) it3.next();
            boolean x3 = di60.x(newsEntry2);
            if (x2 && x3) {
                it3.remove();
            } else {
                Iterator it5 = arrayList.iterator();
                int i4 = 0;
                while (true) {
                    if (!it5.hasNext()) {
                        i4 = -1;
                        break;
                    } else if (epx.f((NewsEntry) it5.next(), newsEntry2)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 >= 0) {
                    it3.remove();
                    if (awqVar != null) {
                        awqVar.m(newsEntry2);
                    }
                } else {
                    if (newsEntry2 instanceof Html5Entry) {
                        if (i3 < i) {
                            i3++;
                        } else {
                            it3.remove();
                        }
                    }
                    it4 = it3;
                    x2 = x3;
                }
            }
        }
        if (aVar instanceof a.b) {
            boolean x4 = di60.x((NewsEntry) j5g.a0(arrayList));
            if (x2 && x4 && it4 != null) {
                it4.remove();
            }
        }
    }
}
