package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.promotions.model.Promotion;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lftf0;", "", "Companion", "dtf0", "etf0", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ftf0 {
    public static final etf0 Companion = new etf0();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new pmf0(18))};
    public Set a;

    public ftf0(int i) {
        this.a = null;
    }

    public final List a() {
        Set<Promotion> set = this.a;
        if (set == null) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Promotion promotion : set) {
            if (promotion == null) {
                promotion = null;
            }
            if (promotion != null) {
                arrayList.add(promotion);
            }
        }
        return arrayList;
    }

    public ftf0() {
        this(0);
    }
}
