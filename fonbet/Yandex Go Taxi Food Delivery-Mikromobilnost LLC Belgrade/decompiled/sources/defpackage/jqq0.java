package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.eatskit.dto.BleError;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ljqq0;", "", "Companion", "hqq0", "iqq0", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class jqq0 {
    public static final iqq0 Companion = new iqq0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new xiq0(10))};
    public final Boolean a;
    public final BleError b;

    public /* synthetic */ jqq0(int i, Boolean bool, BleError bleError) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bleError;
        }
    }

    public jqq0(Boolean bool, BleError bleError) {
        this.a = bool;
        this.b = bleError;
    }

    public jqq0() {
        this(null, null);
    }
}
