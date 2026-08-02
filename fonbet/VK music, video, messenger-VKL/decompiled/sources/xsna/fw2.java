package xsna;

import com.vk.antispam.SpammerModel;
import java.util.List;

/* compiled from: AntispamState.kt */
/* loaded from: classes14.dex */
public final class fw2 implements km50 {
    public final List<lhk0> b;
    public final SpammerModel c;

    public fw2(List<lhk0> list, SpammerModel spammerModel) {
        this.b = list;
        this.c = spammerModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fw2)) {
            return false;
        }
        fw2 fw2Var = (fw2) obj;
        return epx.f(this.b, fw2Var.b) && epx.f(this.c, fw2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "AntispamState(spamActions=" + this.b + ", spammerModel=" + this.c + ')';
    }
}
