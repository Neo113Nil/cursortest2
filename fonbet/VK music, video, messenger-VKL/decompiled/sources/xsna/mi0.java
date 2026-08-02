package xsna;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.vk.clips.sdk.stats.pixels.models.AdStatPixel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: AdStatPixelTrackerImpl.kt */
/* loaded from: classes17.dex */
public final class mi0 implements ki0 {
    public final ti0 a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final HashMap<AdStatPixel, Runnable> c = new HashMap<>();

    public mi0(ti0 ti0Var) {
        this.a = ti0Var;
    }

    public static SparseArray p(List list) {
        SparseArray sparseArray = new SparseArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AdStatPixel adStatPixel = (AdStatPixel) it.next();
            if (adStatPixel instanceof AdStatPixel.ViewabilityDuration) {
                AdStatPixel.ViewabilityDuration viewabilityDuration = (AdStatPixel.ViewabilityDuration) adStatPixel;
                int i = viewabilityDuration.e;
                Object arrayList = new ArrayList();
                Object obj = sparseArray.get(i);
                if (obj != null) {
                    arrayList = obj;
                }
                ArrayList arrayList2 = (List) arrayList;
                arrayList2.add(adStatPixel);
                sparseArray.put(viewabilityDuration.e, arrayList2);
            }
        }
        return sparseArray;
    }

    @Override // xsna.ki0
    public final void a(Map<AdStatPixel.Type, ? extends List<? extends AdStatPixel>> map) {
        o(map.get(AdStatPixel.Type.IMPRESSION));
    }

    @Override // xsna.ki0
    public final void b(Map<AdStatPixel.Type, ? extends List<? extends AdStatPixel>> map) {
        List<? extends AdStatPixel> list = map.get(AdStatPixel.Type.VIEWABILITY_DURATION);
        if (list == null) {
            return;
        }
        i0q0.j(new li0(0, p(list), this));
    }

    @Override // xsna.ki0
    public final void c(Map<AdStatPixel.Type, ? extends List<? extends AdStatPixel>> map) {
        o(map.get(AdStatPixel.Type.CLICK_ON_LIKE));
    }

    @Override // xsna.ki0
    public final void d(Map<AdStatPixel.Type, ? extends List<? extends AdStatPixel>> map) {
        o(map.get(AdStatPixel.Type.CLICK_ON_ACTION));
    }

    @Override // xsna.ki0
    public final void e(Map<AdStatPixel.Type, ? extends List<? extends AdStatPixel>> map) {
        o(map.get(AdStatPixel.Type.VIEW_IN));
        List<? extends AdStatPixel> list = map.get(AdStatPixel.Type.VIEWABILITY_DURATION);
        if (list == null) {
            return;
        }
        i0q0.j(new e0(1, p(list), this));
    }

    @Override // xsna.ki0
    public final void f(Map<AdStatPixel.Type, ? extends List<? extends AdStatPixel>> map) {
        o(map.get(AdStatPixel.Type.CLICK_ON_SHARE));
    }

    @Override // xsna.ki0
    public final void g(Map<AdStatPixel.Type, ? extends List<? extends AdStatPixel>> map) {
        o(map.get(AdStatPixel.Type.CLICK_ON_SUBSCRIBE));
    }

    @Override // xsna.ki0
    public final void h(Map<AdStatPixel.Type, ? extends List<? extends AdStatPixel>> map) {
        o(map.get(AdStatPixel.Type.VIDEO_ERROR));
    }

    @Override // xsna.ki0
    public final void i(Map<AdStatPixel.Type, ? extends List<? extends AdStatPixel>> map) {
        o(map.get(AdStatPixel.Type.CLICK_ON_COMMENTS));
    }

    @Override // xsna.ki0
    public final void j(Map<AdStatPixel.Type, ? extends List<? extends AdStatPixel>> map) {
        o(map.get(AdStatPixel.Type.CLICK_ON_AUTHOR));
    }

    @Override // xsna.ki0
    public final void k(Map<AdStatPixel.Type, ? extends List<? extends AdStatPixel>> map) {
        o(map.get(AdStatPixel.Type.RENDER));
        o(map.get(AdStatPixel.Type.VIEWABILITY_MEASURABLE));
    }

    @Override // xsna.ki0
    public final void l(Map<AdStatPixel.Type, ? extends List<? extends AdStatPixel>> map) {
        o(map.get(AdStatPixel.Type.CLICK_ON_FAVORITE));
    }

    @Override // xsna.ki0
    public final void m(Map<AdStatPixel.Type, ? extends List<? extends AdStatPixel>> map) {
        o(map.get(AdStatPixel.Type.CLOSED_BY_USER));
    }

    @Override // xsna.ki0
    public final void n(Map<AdStatPixel.Type, ? extends List<? extends AdStatPixel>> map) {
        o(map.get(AdStatPixel.Type.CLICK_DEEPLINK));
    }

    public final void o(List<? extends AdStatPixel> list) {
        List<? extends AdStatPixel> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        this.a.c.onNext(list);
    }
}
