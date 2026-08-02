package xsna;

import com.vk.geo.impl.model.BoundingBox;
import com.vk.geo.impl.model.VisibleStyle;
import com.vk.geo.impl.model.id.StringId;

/* compiled from: Intersection.kt */
/* loaded from: classes2.dex */
public final class gox {
    public final String a;
    public final BoundingBox b;
    public final int c;

    public gox(int i, BoundingBox boundingBox, String str) {
        this.a = str;
        this.b = boundingBox;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gox)) {
            return false;
        }
        gox goxVar = (gox) obj;
        return epx.f(this.a, goxVar.a) && epx.f(this.b, goxVar.b) && this.c == goxVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Intersection(id=" + ((Object) StringId.a(this.a)) + ", bbox=" + this.b + ", style=" + ((Object) VisibleStyle.K(this.c)) + ')';
    }
}
