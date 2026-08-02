package defpackage;

import com.yandex.go.plus.api.purchase.AddCardResolution;
import java.util.LinkedHashMap;
import java.util.Locale;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes13.dex */
public final class k29 {
    public final c06 a;

    public k29(c06 c06Var) {
        this.a = c06Var;
    }

    public final void a(AddCardResolution addCardResolution, String str) {
        i d = ((j) ((lx4) this.a.a)).d("CashbackCard.AddCard");
        String lowerCase = addCardResolution.name().toLowerCase(Locale.US);
        LinkedHashMap linkedHashMap = d.a;
        linkedHashMap.put("resolution", lowerCase);
        if (str != null) {
            linkedHashMap.put("open_reason", str);
        } else {
            linkedHashMap.put("open_reason", "");
        }
        d.m();
    }
}
