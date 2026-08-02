package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.masstransit.main.router.a;

/* loaded from: classes12.dex */
public final class e410 implements nu {
    public final a a;
    public final v4c b = new v4c(6, this);
    public final mu c = new mu("MasstransitRouteInputAction", qoi0.a(bw30.class), new kr00(19), kotlin.a.b(LazyThreadSafetyMode.NONE, new xyz(15, this)), EmptyList.a, false);

    public e410(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.nu
    public final mu create() {
        return this.c;
    }
}
