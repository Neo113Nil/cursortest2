package sg.bigo.ads.core.player;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import sg.bigo.ads.bo.g;
import sg.bigo.ads.bp.e;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.dh.n;
import sg.bigo.ads.dh.p;

/* loaded from: classes9.dex */
public final class c {
    public final p a;
    public boolean b;
    public boolean c;
    public boolean d;

    @NonNull
    public final sg.bigo.ads.df.b e;

    @Nullable
    public sg.bigo.ads.cv.b f;
    public boolean g;
    public final Context h;
    public final List<Integer> j;
    public final List<Integer> k;
    private boolean l = false;
    public boolean i = false;

    public c(Context context, @NonNull p pVar, @NonNull sg.bigo.ads.df.b bVar) {
        ArrayList arrayList = new ArrayList(4);
        this.j = arrayList;
        ArrayList arrayList2 = new ArrayList(5);
        this.k = arrayList2;
        this.h = context;
        this.a = pVar;
        this.e = bVar;
        arrayList.add(0);
        arrayList.add(25);
        arrayList.add(50);
        arrayList.add(75);
        arrayList2.add(2000);
        arrayList2.add(Integer.valueOf(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED));
        arrayList2.add(5000);
        arrayList2.add(8000);
        arrayList2.add(10000);
    }

    public static String a(String str) {
        if (r.a((CharSequence) str)) {
            return "";
        }
        String a = r.a(str, "[TIMESTAMP]", new SimpleDateFormat(AppUpdateInfo.Factory.UPDATED_FORMAT, Locale.getDefault()).format(new Date()), true);
        StringBuilder sb = new StringBuilder();
        sb.append(((int) (Math.random() * 9.0E7d)) + 10000000);
        return r.a(a, "[CACHEBUSTING]", sb.toString(), true);
    }

    private static String b(String str, int i) {
        if (r.a((CharSequence) str)) {
            return "";
        }
        try {
            return r.a(str, "ad_click_indx=__ad_click_indx__", "ad_click_indx=".concat(String.valueOf(i)), true);
        } catch (Throwable unused) {
            return str;
        }
    }

    private static String a(String str, int i) {
        if (r.a((CharSequence) str)) {
            return "";
        }
        try {
            return r.a(str, "ad_imp_indx=__ad_imp_indx__", "ad_imp_indx=".concat(String.valueOf(i)), true);
        } catch (Throwable unused) {
            return str;
        }
    }

    public final void a() {
        a(this.a.y, "va_cpn_imp");
    }

    public static void a(Context context, List<n> list) {
        if (list != null) {
            for (n nVar : list) {
                if (nVar != null) {
                    String str = nVar.b;
                    if (r.a((CharSequence) str) || (nVar.c && !nVar.d)) {
                        sg.bigo.ads.bn.a.a(0, "VASTController", "invalidate tracking url or is tracked");
                    } else {
                        sg.bigo.ads.bs.a aVar = new sg.bigo.ads.bs.a(new sg.bigo.ads.bs.d(str), context);
                        aVar.l = e.g();
                        g.a(aVar, null);
                    }
                }
            }
        }
    }

    public final void a(sg.bigo.ads.api.core.b bVar, int i, int i2) {
        if (this.l) {
            return;
        }
        a(bVar, this.a.j, "va_cli", i, i2);
    }

    public static void a(sg.bigo.ads.cp.a aVar, int i) {
        sg.bigo.ads.da.b.a(aVar, i, aVar.aS(), aVar.aU());
    }

    public final void a(@NonNull n nVar, String str) {
        String str2 = nVar.b;
        if (r.a((CharSequence) str2) || (nVar.c && !nVar.d)) {
            sg.bigo.ads.bn.a.a(0, "VASTController", "invalidate tracking url or is tracked");
            return;
        }
        String a = a(str2);
        nVar.c = true;
        if (r.a((CharSequence) a)) {
            return;
        }
        this.e.a(this.h, str, a, "bigoad", nVar.e);
    }

    public final void a(@NonNull n nVar, String str, sg.bigo.ads.api.core.b bVar, int i, int i2) {
        String str2 = nVar.b;
        if (r.a((CharSequence) str2) || (nVar.c && !nVar.d)) {
            sg.bigo.ads.bn.a.a(0, "VASTController", "invalidate tracking url or is tracked");
            return;
        }
        String a = a(str2);
        if ("va_show".equals(str) && (bVar instanceof sg.bigo.ads.cp.a) && a.contains("ad_imp_indx=__ad_imp_indx__")) {
            a = a(a, ((sg.bigo.ads.cp.a) bVar).bw());
        }
        if (("va_cli".equals(str) || "va_cpn_cli".equals(str)) && (bVar instanceof sg.bigo.ads.cp.a)) {
            if (a.contains("ad_click_indx=__ad_click_indx__")) {
                a = b(a, ((sg.bigo.ads.cp.a) bVar).bx());
            }
            if (a.contains("ad_imp_indx=__ad_imp_indx__")) {
                a = a(a, ((sg.bigo.ads.cp.a) bVar).bw());
            }
            if (a.contains("click_source=__click_source__")) {
                a = r.a(a, "click_source=__click_source__", "click_source=".concat(String.valueOf(i)), true);
            }
            if (a.contains("click_module=__click_module__")) {
                a = r.a(a, "click_module=__click_module__", "click_module=".concat(String.valueOf(i2)), true);
            }
        }
        String str3 = a;
        nVar.c = true;
        if (r.a((CharSequence) str3)) {
            return;
        }
        this.e.a(this.h, str, str3, "bigoad", nVar.e);
    }

    public final boolean a(@NonNull List<? extends n> list, String str) {
        Iterator<? extends n> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (str.equals("va_cpn_cli")) {
                this.l = true;
            }
            a(it.next(), str);
            it.remove();
            z = true;
        }
        return z;
    }

    public final boolean a(sg.bigo.ads.api.core.b bVar) {
        return a(bVar, this.a.z, "va_cpn_cli", 6, 13);
    }

    private boolean a(sg.bigo.ads.api.core.b bVar, @NonNull List<? extends n> list, String str, int i, int i2) {
        Iterator<? extends n> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (str.equals("va_cpn_cli")) {
                this.l = true;
            }
            a(it.next(), str, bVar, i, i2);
            it.remove();
            z = true;
        }
        return z;
    }
}
