package xsna;

import android.view.View;
import com.vk.dto.narratives.Narrative;
import java.lang.ref.WeakReference;

/* compiled from: NarrativeClickTarget.kt */
/* loaded from: classes5.dex */
public final class nu50 {
    public final Narrative a;
    public final WeakReference<View> b;
    public final uu50 c;

    public nu50(Narrative narrative, WeakReference<View> weakReference, uu50 uu50Var) {
        this.a = narrative;
        this.b = weakReference;
        this.c = uu50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu50)) {
            return false;
        }
        nu50 nu50Var = (nu50) obj;
        return epx.f(this.a, nu50Var.a) && epx.f(this.b, nu50Var.b) && epx.f(this.c, nu50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "NarrativeLongClickTarget(narrative=" + this.a + ", view=" + this.b + ", contentItem=" + this.c + ')';
    }
}
