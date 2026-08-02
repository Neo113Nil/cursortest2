package sg.bigo.ads.r;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import sg.bigo.ads.ai.o;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.bj.g;
import sg.bigo.ads.bj.h;
import sg.bigo.ads.common.utils.l;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes9.dex */
public final class b {
    public final o a;
    public final d b;
    public final boolean c;
    public final c d;
    public final boolean e;
    List<a> f;
    public int g;

    @NonNull
    final sg.bigo.ads.y.b h;
    private final HashSet<String> i = new HashSet<>();

    public static class a {
        public final String a;
        public int b;

        private a(String str) {
            this.a = str;
            this.b = 0;
        }

        public /* synthetic */ a(String str, byte b) {
            this(str);
        }
    }

    private b(@NonNull sg.bigo.ads.y.b bVar, o oVar, d dVar, int i, c cVar, boolean z, boolean z2, List<a> list) {
        this.h = bVar;
        this.a = oVar;
        this.b = dVar;
        this.d = cVar;
        this.c = z;
        this.e = z2;
        this.f = list;
        this.g = i;
    }

    @Nullable
    public static b b(sg.bigo.ads.y.b bVar, @NonNull o oVar) {
        d dVar;
        c cVar;
        int i;
        if (bVar == null || oVar == null) {
            return null;
        }
        int a2 = oVar.a("video_play_page.multi_img_load");
        switch (oVar.a("video_play_page.ad_component_layout")) {
            case 13:
            case 18:
                dVar = d.TILE;
                cVar = c.FILL_MATCH_SELF;
                i = 1;
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                dVar = d.a(oVar.a("video_play_page.multi_img"));
                cVar = c.a(oVar.a("video_play_page.multi_render_way"));
                i = oVar.a("video_play_page.multi_method");
                break;
            default:
                return null;
        }
        return a(bVar, oVar, a2, dVar, cVar, i == 1, false);
    }

    public static b c(sg.bigo.ads.y.b bVar, @NonNull o oVar) {
        return a(bVar, oVar, oVar.a("video_play_page.multi_img_load", 1), d.a(oVar.a("video_play_page.multi_img")), c.FILL_MATCH_SELF, true, false);
    }

    @NonNull
    public final List<String> a() {
        ArrayList arrayList = new ArrayList();
        if (!l.a((Collection) this.f)) {
            Iterator<a> it = this.f.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a);
            }
        }
        return arrayList;
    }

    @Nullable
    public static b a(sg.bigo.ads.y.b bVar, o oVar) {
        if (bVar == null || oVar == null) {
            return null;
        }
        switch (oVar.a("endpage.ad_component_layout")) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return a(bVar, oVar, oVar.a("endpage.multi_img_load"), d.a(oVar.a("endpage.multi_img")), c.a(oVar.a("endpage.multi_render_way")), true, true);
            default:
                return null;
        }
    }

    public final void b() {
        h hVar;
        if (l.a((Collection) this.f)) {
            return;
        }
        for (final a aVar : this.f) {
            String str = aVar.a;
            if (!sg.bigo.ads.bj.e.a(this.h.b.e, str)) {
                hVar = h.a.a;
                if (hVar.a(str)) {
                    return;
                }
                sg.bigo.ads.y.b bVar = this.h;
                sg.bigo.ads.bj.e.a(bVar.b.e, str, ((sg.bigo.ads.cp.a) bVar.f()).am(), new g() { // from class: sg.bigo.ads.r.b.2
                    @Override // sg.bigo.ads.bj.g
                    public final void a(int i, @NonNull String str2, @Nullable sg.bigo.ads.bj.f fVar) {
                        aVar.b = 2;
                    }

                    @Override // sg.bigo.ads.bj.g
                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.bj.f fVar) {
                        aVar.b = 1;
                    }
                });
            }
        }
    }

    @NonNull
    private static b a(@NonNull sg.bigo.ads.y.b bVar, @NonNull o oVar, int i, d dVar, c cVar, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        byte b = 0;
        if (dVar != d.NONE || z2) {
            b.d popPage = bVar.getPopPage();
            if (popPage != null) {
                String[] e = popPage.e();
                if (!l.a(e)) {
                    arrayList2 = new ArrayList();
                    for (String str : e) {
                        arrayList2.add(new a(str, b));
                    }
                }
            }
            if (l.a((Collection) arrayList2) && (z || z2)) {
                arrayList2 = new ArrayList();
                o.a[] aF = ((sg.bigo.ads.cp.a) bVar.f()).aF();
                for (int i2 = 0; !l.a(aF) && i2 < aF.length; i2++) {
                    o.a aVar = aF[i2];
                    if (aVar != null && !r.a((CharSequence) aVar.c())) {
                        arrayList2.add(new a(aF[i2].c(), b));
                    }
                }
            }
            if (l.a((Collection) arrayList2) && ((z || z2) && ((sg.bigo.ads.cp.a) bVar.f()).aZ())) {
                ArrayList arrayList3 = new ArrayList();
                String aH = ((sg.bigo.ads.cp.a) bVar.f()).aH();
                if (!r.a((CharSequence) aH)) {
                    arrayList3.add(new a(aH, b));
                }
                arrayList2 = arrayList3;
            }
            if (l.a((Collection) arrayList2) && (z || z2)) {
                z3 = true;
                d dVar2 = (l.a((Collection) arrayList2) || z3) ? dVar : d.NONE;
                if (dVar == d.NONE || !z2) {
                    z4 = z3;
                } else {
                    if (!l.a((Collection) arrayList2)) {
                        arrayList = new ArrayList(arrayList2.subList(0, 1));
                        z4 = z3;
                        return new b(bVar, oVar, dVar2, i, cVar, z, z4, arrayList);
                    }
                    z4 = true;
                }
                arrayList = arrayList2;
                return new b(bVar, oVar, dVar2, i, cVar, z, z4, arrayList);
            }
        }
        z3 = false;
        if (l.a((Collection) arrayList2)) {
        }
        if (dVar == d.NONE) {
        }
        z4 = z3;
        arrayList = arrayList2;
        return new b(bVar, oVar, dVar2, i, cVar, z, z4, arrayList);
    }

    public final void a(final int i, final int i2) {
        String str = i + BundleUtil.UNDERLINE_TAG + i2;
        if (this.i.contains(str)) {
            return;
        }
        this.i.add(str);
        sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.r.b.1
            /* JADX WARN: Type inference failed for: r5v0, types: [sg.bigo.ads.api.core.b] */
            @Override // java.lang.Runnable
            public final void run() {
                int i3;
                int i4;
                int i5;
                String[] e;
                h hVar;
                int i6 = 0;
                if (l.a((Collection) b.this.f)) {
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                } else {
                    int i7 = 0;
                    int i8 = 0;
                    int i9 = 0;
                    for (a aVar : b.this.f) {
                        String str2 = aVar.a;
                        if (!sg.bigo.ads.bj.e.a(b.this.h.b.e, str2)) {
                            hVar = h.a.a;
                            if (!hVar.a(str2)) {
                                int i10 = aVar.b;
                                if (i10 != 1) {
                                    if (i10 == 2) {
                                        i9++;
                                    }
                                }
                            }
                            i7++;
                        }
                        i8++;
                    }
                    i3 = i7;
                    i4 = i8;
                    i5 = i9;
                }
                ?? f = b.this.h.f();
                int i11 = i;
                int i12 = i2;
                b.d popPage = b.this.h.getPopPage();
                if (popPage != null && (e = popPage.e()) != null) {
                    i6 = e.length;
                }
                sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) f, i11, i12, i6, i3, i4, i5);
            }
        });
    }

    public final void a(String str, int i) {
        if (l.a((Collection) this.f) || r.a((CharSequence) str)) {
            return;
        }
        for (a aVar : this.f) {
            if (str.equalsIgnoreCase(aVar.a)) {
                aVar.b = i;
                return;
            }
        }
    }
}
