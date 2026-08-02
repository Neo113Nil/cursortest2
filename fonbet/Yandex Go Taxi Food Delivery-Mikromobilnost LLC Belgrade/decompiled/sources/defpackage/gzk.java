package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.main.api.ui.DivListReporter$Screen;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class gzk {
    public final DivListReporter$Screen a;
    public final AppAnalyticsReporter b;
    public final LinkedHashMap c = new LinkedHashMap();

    public gzk(DivListReporter$Screen divListReporter$Screen, AppAnalyticsReporter appAnalyticsReporter) {
        this.a = divListReporter$Screen;
        this.b = appAnalyticsReporter;
    }

    public final void a(RecyclerView recyclerView, List list) {
        RecyclerView.e layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int K1 = linearLayoutManager.K1();
        int M1 = linearLayoutManager.M1();
        if (K1 == -1) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (K1 <= M1) {
            while (true) {
                View X = linearLayoutManager.X(K1);
                Object parent = recyclerView.getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view != null && X != null) {
                    int[] iArr = new int[2];
                    X.getLocationInWindow(iArr);
                    int i = iArr[1];
                    int height = X.getHeight() + i;
                    int[] iArr2 = new int[2];
                    view.getLocationInWindow(iArr2);
                    int i2 = iArr2[1];
                    int height2 = view.getHeight() + i2;
                    float height3 = X.getHeight() * 0.33f;
                    if (i2 + height3 < height && height2 - height3 > i && list.size() - 1 >= K1) {
                        Object obj = list.get(K1);
                        jpl jplVar = obj instanceof jpl ? (jpl) obj : null;
                        kpl kplVar = jplVar != null ? jplVar.f : null;
                        ih90 ih90Var = kplVar instanceof ih90 ? (ih90) kplVar : null;
                        if (ih90Var != null) {
                            linkedHashMap.put(ih90Var.a, ih90Var);
                        }
                    }
                }
                if (K1 == M1) {
                    break;
                } else {
                    K1++;
                }
            }
        }
        LinkedHashMap linkedHashMap2 = this.c;
        Iterator it = linkedHashMap2.entrySet().iterator();
        while (it.hasNext()) {
            String str = (String) ((Map.Entry) it.next()).getKey();
            if (!linkedHashMap.containsKey(str)) {
                c(str);
                it.remove();
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            ih90 ih90Var2 = (ih90) ((Map.Entry) it2.next()).getValue();
            String str2 = ih90Var2.a;
            String str3 = ih90Var2.b;
            if (!linkedHashMap2.containsKey(str2)) {
                linkedHashMap2.put(str2, new ezk(str2, str3, System.currentTimeMillis()));
                em3 em3Var = this.b.N;
                int i3 = fzk.a[this.a.ordinal()];
                if (i3 == 1) {
                    LinkedHashMap w = g8e.w(2, "card_id", str2);
                    if (str3 != null) {
                        w.put("request_id", str3);
                    }
                    em3Var.a.a("products_screen.div.shown", w);
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return;
                    }
                    LinkedHashMap w2 = g8e.w(2, "card_id", str2);
                    if (str3 != null) {
                        w2.put("request_id", str3);
                    }
                    em3Var.a.a("merchant_offers.banner.shown", w2);
                }
            }
        }
    }

    public final void b() {
        LinkedHashMap linkedHashMap = this.c;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            c((String) ((Map.Entry) it.next()).getKey());
        }
        linkedHashMap.clear();
    }

    public final void c(String str) {
        ezk ezkVar = (ezk) this.c.get(str);
        if (ezkVar != null) {
            em3 em3Var = this.b.N;
            long currentTimeMillis = System.currentTimeMillis();
            long j = ezkVar.c;
            String str2 = ezkVar.b;
            String str3 = ezkVar.a;
            String valueOf = String.valueOf(currentTimeMillis - j);
            int i = fzk.a[this.a.ordinal()];
            if (i == 1) {
                LinkedHashMap w = g8e.w(3, "card_id", str3);
                if (str2 != null) {
                    w.put("request_id", str2);
                }
                w.put("duration", valueOf);
                em3Var.a.a("products_screen.div.hidden", w);
                return;
            }
            if (i != 2) {
                w511.b();
                return;
            }
            LinkedHashMap w2 = g8e.w(3, "card_id", str3);
            if (str2 != null) {
                w2.put("request_id", str2);
            }
            w2.put("duration", valueOf);
            em3Var.a.a("merchant_offers.banner.hidden", w2);
        }
    }
}
