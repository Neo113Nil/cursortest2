package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.eatskit.dto.OpenYbParams$ScreenType;
import ru.yandex.taxi.eatskit.dto.YbDepositType;

@gsq0
/* loaded from: classes5.dex */
public final class da70 {
    public static final ba70 Companion = new ba70();
    public static final i3y[] e;
    public final OpenYbParams$ScreenType a;
    public final os51 b;
    public final YbDepositType c;
    public final String d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{a.b(lazyThreadSafetyMode, new y570(20)), null, a.b(lazyThreadSafetyMode, new y570(21)), null};
    }

    public /* synthetic */ da70(int i, OpenYbParams$ScreenType openYbParams$ScreenType, os51 os51Var, YbDepositType ybDepositType, String str) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, aa70.a.getDescriptor());
            throw null;
        }
        this.a = openYbParams$ScreenType;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = os51Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = ybDepositType;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
    }
}
