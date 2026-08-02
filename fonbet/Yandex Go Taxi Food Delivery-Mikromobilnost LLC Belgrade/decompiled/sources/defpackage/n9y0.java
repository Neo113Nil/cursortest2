package defpackage;

import io.appmetrica.analytics.impl.C0553n3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.collections.a;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.promotions.model.Promotion;
import ru.yandex.taxi.promotions.model.PromotionBackground;

/* loaded from: classes9.dex */
public final class n9y0 implements klf0 {
    public final lx4 a;
    public final jc4 b;

    public n9y0(lx4 lx4Var, jc4 jc4Var) {
        this.a = lx4Var;
        this.b = jc4Var;
    }

    public final i a(String str, Promotion promotion, int i, Long l, PromotionBackground.Type type, boolean z) {
        i b = b(str, promotion, z);
        b.a.put(C0553n3.g, type.toString().toLowerCase(Locale.getDefault()));
        if (l != null) {
            b.a(l.longValue() / 1000.0d, "played_time");
        }
        if (promotion.m() != Promotion.Type.FULLSCREEN && promotion.m() != Promotion.Type.STORY) {
            return b;
        }
        b.c(i + 1, "page_number");
        return b;
    }

    public final i b(String str, Promotion promotion, boolean z) {
        i d = ((j) this.a).d(str);
        String b = promotion.getB();
        LinkedHashMap linkedHashMap = d.a;
        linkedHashMap.put("banner_id", b);
        linkedHashMap.put("type", promotion.c());
        if (promotion instanceof shs) {
            d.b(((shs) promotion).l.size(), "page_number_total_count");
        } else if (promotion instanceof Story) {
            d.b(((Story) promotion).i.d.size(), "page_number_total_count");
        }
        ArrayList arrayList = new ArrayList(promotion.getD());
        if (z && !arrayList.isEmpty()) {
            d.d("view", (String) arrayList.get(0));
        }
        return d;
    }

    public final void c(Promotion promotion, String str, String str2, String str3, String str4, Integer num, int i, int i2, long j, PromotionBackground.Type type) {
        i a = a("PromoDidSelectAction", promotion, i, Long.valueOf(j), type, true);
        LinkedHashMap linkedHashMap = a.a;
        linkedHashMap.put("open_reason", str);
        a.b(i2, "page_number_total_count");
        linkedHashMap.put("action", str2 != null ? str2.toLowerCase(Locale.getDefault()) : null);
        linkedHashMap.put("link", str3);
        linkedHashMap.put("button_name", str4);
        linkedHashMap.put("story_position", num != null ? String.valueOf(num.intValue() + 1) : null);
        a.i();
        a.m();
    }

    public final void d(Promotion promotion, String str, PromotionBackground.Type type, int i, Long l) {
        i a = a("PromoTapNext", promotion, i, l, type, true);
        a.a.put("open_reason", str);
        a.i();
        a.m();
    }

    public final void e(Promotion promotion, String str, PromotionBackground.Type type, int i, Long l) {
        i a = a("PromoTapPrevious", promotion, i, l, type, true);
        a.a.put("open_reason", str);
        a.i();
        a.m();
    }

    public final void f(Promotion promotion, String str, PromotionBackground.Type type, int i, Long l) {
        i a = a("PromoDidReceiveClose", promotion, i, l, type, true);
        a.a.put("open_reason", str);
        a.i();
        a.m();
    }

    public final void g(Promotion promotion, String str, Long l) {
        String b = promotion.getB();
        Integer valueOf = promotion instanceof shs ? Integer.valueOf(((shs) promotion).l.size()) : promotion instanceof Story ? Integer.valueOf(((Story) promotion).i.d.size()) : null;
        Double valueOf2 = l != null ? Double.valueOf(l.longValue() / 1000.0d) : null;
        String c = promotion.c();
        String str2 = (String) a.Q(promotion.getD());
        jc4 jc4Var = this.b;
        jc4Var.getClass();
        HashMap hashMap = new HashMap();
        if (b != null) {
            hashMap.put("banner_id", b);
        }
        if (str != null) {
            hashMap.put("open_reason", str);
        }
        if (valueOf != null) {
            hashMap.put("page_number_total_count", valueOf);
        }
        if (valueOf2 != null) {
            hashMap.put("time_since_open_screen", valueOf2);
        }
        hashMap.put("type", c);
        if (str2 != null) {
            hashMap.put("view", str2);
        }
        jc4Var.a.a("FS_SEEN", hashMap, 1, new HashMap());
    }
}
