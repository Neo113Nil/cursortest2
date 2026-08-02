package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.scooters.data.model.EvolveState;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ld1r0;", "", "Companion", "b1r0", "c1r0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class d1r0 {
    public static final c1r0 Companion = new c1r0();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new iwq0(6)), null};
    public final EvolveState a;
    public final g1r0 b;

    public /* synthetic */ d1r0(int i, EvolveState evolveState, g1r0 g1r0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = evolveState;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = g1r0Var;
        }
    }

    /* renamed from: a, reason: from getter */
    public final EvolveState getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final g1r0 getB() {
        return this.b;
    }

    public d1r0() {
        this.a = null;
        this.b = null;
    }
}
