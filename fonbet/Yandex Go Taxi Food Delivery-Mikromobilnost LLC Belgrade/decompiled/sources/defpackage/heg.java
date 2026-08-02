package defpackage;

import com.yandex.plus.core.graphql.type.SECTION_VIEW_TYPE;
import java.util.List;

/* loaded from: classes2.dex */
public final class heg {
    public final List a;
    public final SECTION_VIEW_TYPE b;

    public heg(List list, SECTION_VIEW_TYPE section_view_type) {
        this.a = list;
        this.b = section_view_type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof heg)) {
            return false;
        }
        heg hegVar = (heg) obj;
        return jl40.l(this.a, hegVar.a) && this.b == hegVar.b;
    }

    public final int hashCode() {
        List list = this.a;
        return this.b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "DarkConfigurationSectionFragment(metaShortcuts=" + this.a + ", viewType=" + this.b + ')';
    }
}
