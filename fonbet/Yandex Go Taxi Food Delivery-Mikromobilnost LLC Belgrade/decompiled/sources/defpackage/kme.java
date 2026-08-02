package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.scooters.data.model.ControlAction;

@gsq0
/* loaded from: classes6.dex */
public final class kme {
    public static final jme Companion = new jme();
    public static final i3y[] d = {a.b(LazyThreadSafetyMode.PUBLICATION, new m3e(16)), null, null};
    public final ControlAction a;
    public final String b;
    public final Boolean c;

    public /* synthetic */ kme(int i, ControlAction controlAction, String str, Boolean bool) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, ime.a.getDescriptor());
            throw null;
        }
        this.a = controlAction;
        this.b = str;
        this.c = bool;
    }

    public kme(ControlAction controlAction, String str, Boolean bool) {
        this.a = controlAction;
        this.b = str;
        this.c = bool;
    }
}
