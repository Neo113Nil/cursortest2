package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.scooters.data.model.ScootersCard;
import ru.yandex.taxi.scooters.data.model.ScootersPassesListServiceDto;

@gsq0
/* loaded from: classes6.dex */
public final class cm90 {
    public static final bm90 Companion = new bm90();
    public static final i3y[] c;
    public final ScootersCard a;
    public final ScootersPassesListServiceDto b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{a.b(lazyThreadSafetyMode, new nk90(1)), a.b(lazyThreadSafetyMode, new nk90(2))};
    }

    public /* synthetic */ cm90(int i, ScootersCard scootersCard, ScootersPassesListServiceDto scootersPassesListServiceDto) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, am90.a.getDescriptor());
            throw null;
        }
        this.a = scootersCard;
        this.b = scootersPassesListServiceDto;
    }

    public cm90(ScootersCard scootersCard, ScootersPassesListServiceDto scootersPassesListServiceDto) {
        this.a = scootersCard;
        this.b = scootersPassesListServiceDto;
    }
}
