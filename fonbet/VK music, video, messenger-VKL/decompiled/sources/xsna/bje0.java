package xsna;

import com.vk.im.engine.config.PushInfoBarScheduleRepeat;
import java.util.List;

/* compiled from: PushInfoBarSchedule.kt */
/* loaded from: classes.dex */
public final class bje0 {
    public static final bje0 c = new bje0(e43.l(0, 1, 3, 10, 30, 60, 90), PushInfoBarScheduleRepeat.STOP);
    public final List<Integer> a;
    public final PushInfoBarScheduleRepeat b;

    public bje0(List<Integer> list, PushInfoBarScheduleRepeat pushInfoBarScheduleRepeat) {
        this.a = list;
        this.b = pushInfoBarScheduleRepeat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bje0)) {
            return false;
        }
        bje0 bje0Var = (bje0) obj;
        return epx.f(this.a, bje0Var.a) && this.b == bje0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PushInfoBarSchedule(days=" + this.a + ", repeat=" + this.b + ')';
    }
}
