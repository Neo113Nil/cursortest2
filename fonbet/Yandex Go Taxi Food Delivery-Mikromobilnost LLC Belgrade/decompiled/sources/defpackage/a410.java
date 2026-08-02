package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.masstransit.main.router.a;

/* loaded from: classes12.dex */
public final class a410 implements nu {
    public final a a;
    public final q210 b;
    public final v4c c = new v4c(5, this);
    public final mu d = new mu("MasstransitPaymentFlowAction", qoi0.a(z310.class), new kr00(18), kotlin.a.b(LazyThreadSafetyMode.NONE, new xyz(14, this)), EmptyList.a, false);

    public a410(a aVar, q210 q210Var) {
        this.a = aVar;
        this.b = q210Var;
    }

    @Override // defpackage.nu
    public final mu create() {
        return this.d;
    }
}
