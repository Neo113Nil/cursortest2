package defpackage;

import java.util.HashMap;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes.dex */
public final class onr0 {
    public final pho a;

    public onr0(pho phoVar) {
        this.a = phoVar;
    }

    public static void a(onr0 onr0Var, String str, String str2, String str3, String str4, String str5, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        onr0Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("delivery_metrics", str);
        }
        if (str2 != null) {
            hashMap.put("button_list", str2);
        }
        hashMap.put("close_reason", str3);
        if (str4 != null) {
            hashMap.put(ClidProvider.STATE, str4);
        }
        if (str5 != null) {
            hashMap.put("tariff_class", str5);
        }
        onr0Var.a.a("SharedOrderCard.Closed", hashMap, 1, new HashMap());
    }

    public static void b(onr0 onr0Var, String str, String str2, String str3, String str4, String str5, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            str5 = null;
        }
        onr0Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("delivery_metrics", str);
        }
        if (str2 != null) {
            hashMap.put("button_list", str2);
        }
        hashMap.put("close_method", str3);
        if (str4 != null) {
            hashMap.put(ClidProvider.STATE, str4);
        }
        if (str5 != null) {
            hashMap.put("tariff_class", str5);
        }
        onr0Var.a.a("SharedOrderCard.Collapsed", hashMap, 1, new HashMap());
    }

    public static void c(onr0 onr0Var, String str, String str2, String str3, String str4, String str5, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        onr0Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("delivery_metrics", str);
        }
        if (str2 != null) {
            hashMap.put("button_list", str2);
        }
        hashMap.put("open_method", str3);
        if (str4 != null) {
            hashMap.put(ClidProvider.STATE, str4);
        }
        if (str5 != null) {
            hashMap.put("tariff_class", str5);
        }
        onr0Var.a.a("SharedOrderCard.Opened", hashMap, 1, new HashMap());
    }
}
