package defpackage;

import com.yandex.go.deeplinks.generated.chargers.ChargersDiscountsSection;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class mw9 {
    public static ChargersDiscountsSection a(String str) {
        Object obj;
        Iterator<E> it = ChargersDiscountsSection.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((ChargersDiscountsSection) obj).getValue(), str, true)) {
                break;
            }
        }
        return (ChargersDiscountsSection) obj;
    }
}
