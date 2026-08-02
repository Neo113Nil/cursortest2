package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.scooters.data.model.EvolveState;

@gsq0
/* loaded from: classes6.dex */
public final class djo {
    public static final cjo Companion = new cjo();
    public static final i3y[] f = {a.b(LazyThreadSafetyMode.PUBLICATION, new cao(10)), null, null, null, null};
    public final EvolveState a;
    public final String b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;

    public /* synthetic */ djo(int i, EvolveState evolveState, String str, Boolean bool, Boolean bool2, Boolean bool3) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, bjo.a.getDescriptor());
            throw null;
        }
        this.a = evolveState;
        this.b = str;
        this.c = bool;
        this.d = bool2;
        this.e = bool3;
    }

    public djo(EvolveState evolveState, String str, Boolean bool, Boolean bool2, Boolean bool3) {
        this.a = evolveState;
        this.b = str;
        this.c = bool;
        this.d = bool2;
        this.e = bool3;
    }
}
