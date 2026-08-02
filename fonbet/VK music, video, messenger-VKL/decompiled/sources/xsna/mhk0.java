package xsna;

import com.vk.antispam.SpamAction;
import xsna.tlo0;

/* compiled from: SpamActionUIModel.kt */
/* loaded from: classes14.dex */
public final class mhk0 {
    public final tlo0.f a;
    public final tlo0 b;
    public final boolean c;
    public final SpamAction d;

    public mhk0(tlo0.f fVar, tlo0 tlo0Var, boolean z, SpamAction spamAction) {
        this.a = fVar;
        this.b = tlo0Var;
        this.c = z;
        this.d = spamAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhk0)) {
            return false;
        }
        mhk0 mhk0Var = (mhk0) obj;
        return this.a.equals(mhk0Var.a) && epx.f(this.b, mhk0Var.b) && this.c == mhk0Var.c && epx.f(this.d, mhk0Var.d);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a.a) * 31;
        tlo0 tlo0Var = this.b;
        return this.d.hashCode() + qoy.b((hashCode + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return "SpamActionUIModel(titleTextSource=" + this.a + ", subtitleTextSource=" + this.b + ", isSelected=" + this.c + ", action=" + this.d + ')';
    }
}
