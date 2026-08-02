package defpackage;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;
import ru.yandex.taxi.persuggest.api.finalsuggest.Type;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lg8u;", "Layd;", "Companion", "f8u", "d8u", "e8u", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class g8u extends ayd {
    public static final e8u Companion = new e8u();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new mvt(16))};
    public final Map a;

    public g8u(int i, Map map) {
        if ((i & 1) == 0) {
            this.a = b.f();
        } else {
            this.a = map;
        }
    }

    @Override // defpackage.ayd
    public final Type a() {
        return Type.HAS_WHITELISTED_REQUIREMENTS;
    }

    @Override // defpackage.ayd
    public final boolean b(xxd xxdVar) {
        if (!(xxdVar instanceof f8u)) {
            return false;
        }
        Map map = ((f8u) xxdVar).a;
        Set keySet = map.keySet();
        Map map2 = this.a;
        LinkedHashSet<String> U = kotlin.collections.a.U(keySet, map2.keySet());
        if (U.isEmpty()) {
            return false;
        }
        for (String str : U) {
            Object obj = map2.get(str);
            if (obj != null) {
                Number number = obj instanceof Number ? (Number) obj : null;
                if (number == null) {
                    return true;
                }
                Object obj2 = map.get(str);
                if (obj2 != null && obj2.equals(Integer.valueOf(number.intValue()))) {
                    return true;
                }
            }
        }
        return false;
    }

    public g8u() {
        this.a = b.f();
    }
}
