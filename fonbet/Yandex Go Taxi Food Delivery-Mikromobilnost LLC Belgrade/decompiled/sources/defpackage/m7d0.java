package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class m7d0 {
    public final List a;

    public m7d0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m7d0) && this.a.equals(((m7d0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.t(new StringBuilder("PlusPanelStubSectionConfig(stubShortcutConfigs="), this.a, ')');
    }
}
