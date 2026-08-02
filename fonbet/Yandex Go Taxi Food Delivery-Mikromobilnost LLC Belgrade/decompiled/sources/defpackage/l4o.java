package defpackage;

import com.yandex.alicekit.core.experiments.ExperimentFlag$Type;

/* loaded from: classes.dex */
public final class l4o extends oqo {
    public final Class c;

    public l4o(String str, Class cls, Enum r3) {
        super(str, r3);
        this.c = cls;
    }

    @Override // defpackage.oqo
    public final ExperimentFlag$Type a() {
        return ExperimentFlag$Type.ENUM;
    }

    @Override // defpackage.oqo
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l4o.class == obj.getClass() && super.equals(obj)) {
            return this.c.equals(((l4o) obj).c);
        }
        return false;
    }

    @Override // defpackage.oqo
    public final int hashCode() {
        return this.c.hashCode() + (this.a.hashCode() * 31);
    }
}
