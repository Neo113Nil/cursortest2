package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lh9o;", "", "Companion", "f9o", "g9o", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class h9o {
    public static final g9o Companion = new g9o();
    public static final i3y[] d = {a.b(LazyThreadSafetyMode.PUBLICATION, new fgn(29)), null, null};
    public final ScootersErrorCode a;
    public final Boolean b;
    public final String c;

    public /* synthetic */ h9o(int i, ScootersErrorCode scootersErrorCode, Boolean bool, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = scootersErrorCode;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }

    public h9o() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
