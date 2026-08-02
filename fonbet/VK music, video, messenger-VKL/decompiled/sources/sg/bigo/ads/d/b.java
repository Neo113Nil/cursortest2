package sg.bigo.ads.d;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import sg.bigo.ads.ai.j;
import sg.bigo.ads.ai.k;
import sg.bigo.ads.ai.n;
import sg.bigo.ads.api.Ad;

/* loaded from: classes9.dex */
public final class b {
    private Map<String, List<Ad>> a;
    private final List<Map<String, List<Ad>>> b;

    public static class a {
        public static b a = new b(0);
    }

    /* renamed from: sg.bigo.ads.d.b$b, reason: collision with other inner class name */
    public interface InterfaceC2475b {
        boolean a(Ad ad);
    }

    private b() {
        this.a = new ConcurrentHashMap();
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(this.a);
    }

    private int a(String str, @NonNull Map<String, List<Ad>> map) {
        return a(str, map, new InterfaceC2475b() { // from class: sg.bigo.ads.d.b.1
            @Override // sg.bigo.ads.d.b.InterfaceC2475b
            public final boolean a(Ad ad) {
                return ad != null && ad.isExpired();
            }
        });
    }

    private static String b(n nVar) {
        if (nVar == null) {
            return null;
        }
        String l = nVar.l();
        if (TextUtils.isEmpty(l)) {
            return null;
        }
        return l + BundleUtil.UNDERLINE_TAG + nVar.v() + BundleUtil.UNDERLINE_TAG + nVar.b();
    }

    public /* synthetic */ b(byte b) {
        this();
    }

    private int a(String str, @NonNull Map<String, List<Ad>> map, @NonNull InterfaceC2475b interfaceC2475b) {
        List<Ad> list = map.get(str);
        int i = 0;
        if (list != null && !list.isEmpty()) {
            for (Ad ad : list) {
                if (interfaceC2475b.a(ad)) {
                    a(ad);
                    list.remove(ad);
                    i++;
                }
            }
        }
        return i;
    }

    private static String b(Ad ad) {
        return ad == null ? "null" : ad.toString();
    }

    public final Ad a(n nVar) {
        String b = b(nVar);
        Ad ad = null;
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        a(b, this.a);
        List<Ad> list = this.a.get(b);
        if (list != null && !list.isEmpty()) {
            int i = 0;
            while (i < list.size()) {
                try {
                    Ad ad2 = list.get(i);
                    i++;
                    ad = ad2;
                } catch (Exception e) {
                    sg.bigo.ads.bn.a.a(0, "AdCacheManager", "AdCacheManager:getAd end error= " + e.getMessage());
                }
            }
            if (ad != null) {
                list.remove(ad);
            }
            list.size();
            b(ad);
        }
        return ad;
    }

    public final void a(n nVar, Ad ad) {
        j jVar;
        List<Ad> list;
        if (nVar == null) {
            return;
        }
        String l = nVar.l();
        String b = b(nVar);
        if (TextUtils.isEmpty(b) || (jVar = k.a) == null) {
            return;
        }
        int h = jVar.q().h(l);
        Map<String, List<Ad>> map = this.a;
        a(b, map);
        List<Ad> list2 = map.get(b);
        if (list2 == null) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            copyOnWriteArrayList.add(ad);
            map.put(b, copyOnWriteArrayList);
            list = copyOnWriteArrayList;
        } else {
            int indexOf = list2.indexOf(ad);
            if (indexOf >= 0) {
                list2.set(indexOf, ad);
                list = list2;
            } else {
                list2.add(ad);
                list = list2;
            }
        }
        sg.bigo.ads.api.core.b[] a2 = sg.bigo.ads.controller.loader.a.a(ad);
        for (int i = 0; a2 != null && i < a2.length; i++) {
            sg.bigo.ads.api.core.b bVar = a2[i];
            bVar.U();
            bVar.T();
        }
        Object[] array = list.toArray();
        if (array != null) {
            List asList = Arrays.asList(array);
            Collections.sort(asList, Collections.reverseOrder());
            list.clear();
            list.addAll(asList);
        }
        int size = list.size();
        if (h > 0 && size > h) {
            try {
                Ad remove = list.remove(h);
                b(remove);
                a(remove);
            } catch (Exception e) {
                sg.bigo.ads.bn.a.a(0, "AdCacheManager", "AdCacheManager:doAdPut, error = " + e.getMessage());
            }
        }
        b(ad);
        list.size();
    }

    private void a(final Ad ad) {
        if (ad == null) {
            return;
        }
        sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.d.b.2
            @Override // java.lang.Runnable
            public final void run() {
                ad.destroy();
            }
        });
    }
}
