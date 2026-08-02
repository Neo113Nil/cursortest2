package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.layers.api.StateRequirementsFailedType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lm5u0;", "", "Companion", "k5u0", "l5u0", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class m5u0 {
    public static final l5u0 Companion = new l5u0();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new fet0(18)), null};
    public final StateRequirementsFailedType a;
    public final p5u0 b;

    public /* synthetic */ m5u0(int i, StateRequirementsFailedType stateRequirementsFailedType, p5u0 p5u0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = stateRequirementsFailedType;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = p5u0Var;
        }
    }

    public m5u0() {
        this.a = null;
        this.b = null;
    }
}
