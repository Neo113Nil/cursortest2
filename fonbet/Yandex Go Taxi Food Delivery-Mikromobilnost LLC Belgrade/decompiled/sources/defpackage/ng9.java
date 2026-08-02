package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Pair;
import ru.yandex.taxi.common_models.net.NotificationParams;
import ru.yandex.taxi.common_models.net.map_object.d0;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes5.dex */
public final class ng9 {
    public final wiq0 a;
    public final dqe0 b;
    public final tq1 c;
    public final c4r0 d;
    public final c8r e;

    public ng9(wiq0 wiq0Var, dqe0 dqe0Var, tq1 tq1Var, c4r0 c4r0Var, c8r c8rVar) {
        this.a = wiq0Var;
        this.b = dqe0Var;
        this.c = tq1Var;
        this.d = c4r0Var;
        this.e = c8rVar;
    }

    public final void a(d0 d0Var, SelectionOrigin selectionOrigin, Runnable runnable, Consumer consumer, boolean z) {
        String str;
        if (d0Var == null) {
            return;
        }
        List list = this.b.a.x;
        if (list == null || list.isEmpty()) {
            String str2 = d0Var.a;
            if (str2 == null || str2.length() == 0) {
                jst.e.x(new IllegalArgumentException("missing tariff in action"), "can't show alert");
                return;
            }
            pex0 m = ((k) this.a).m();
            String str3 = (m == null || evu0.J(m.b)) ? null : m.b;
            if (jl40.l(d0Var.a, "default")) {
                mi31 b = c8r.b(this.e, d0Var.a, "", null, 4);
                if (b != null) {
                    this.d.a(new gnx0(new fnx0(b, selectionOrigin), true));
                    runnable.run();
                    b(str3, d0Var.a, d0Var.b, consumer, z);
                    return;
                }
                return;
            }
            if (str3 == null || !evu0.J(str3)) {
                List list2 = d0Var.c;
                if (list2 != null) {
                    List<h290> list3 = list2;
                    int d = gw00.d(tcc.n(list3, 10));
                    if (d < 16) {
                        d = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                    for (h290 h290Var : list3) {
                        Pair pair = new Pair(h290Var.a, h290Var.b);
                        linkedHashMap.put(pair.c(), pair.f());
                    }
                    str = (String) linkedHashMap.get(str3);
                } else {
                    str = null;
                }
                if (str == null || str.length() == 0) {
                    return;
                }
                b(str3, str, d0Var.b, consumer, z);
                c4r0.e(this.d, selectionOrigin, str, null, 12);
                runnable.run();
            }
        }
    }

    public final void b(String str, String str2, pq1 pq1Var, Consumer consumer, boolean z) {
        if (!z || str2 == null || str2.length() == 0 || str == null || str.equals(str2) || pq1Var == null) {
            return;
        }
        String str3 = pq1Var.a;
        if (str3 == null || str3.length() == 0) {
            jst.e.x(new IllegalArgumentException("missing alert id"), "can't show alert");
            return;
        }
        NotificationParams notificationParams = pq1Var.e;
        if (notificationParams == null) {
            jst.e.x(new IllegalArgumentException("missing notification_params"), "can't show tariff_change alert");
            return;
        }
        sq1 a = this.c.a(str3);
        if (a.b(notificationParams)) {
            String str4 = pq1Var.b;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = pq1Var.c;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = pq1Var.d;
            consumer.accept(new uqb0(str4, str5, str6 != null ? str6 : ""));
            a.a();
        }
    }
}
