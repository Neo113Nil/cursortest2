package xsna;

import com.vk.voip.ui.onboarding.features.FeatureId;
import java.util.Map;

/* compiled from: CallOnboardingState.kt */
/* loaded from: classes7.dex */
public final class o69 {
    public final boolean a;
    public final Map<FeatureId, suq> b;

    public o69() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o69)) {
            return false;
        }
        o69 o69Var = (o69) obj;
        return this.a == o69Var.a && epx.f(this.b, o69Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallOnboardingState(isVisible=");
        sb.append(this.a);
        sb.append(", items=");
        return cjl0.a(sb, this.b, ')');
    }

    public o69(Map map, boolean z) {
        this.a = z;
        this.b = map;
    }

    public /* synthetic */ o69(int i) {
        this(jgp.b, false);
    }
}
