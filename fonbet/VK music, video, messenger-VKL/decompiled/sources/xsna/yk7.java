package xsna;

import java.util.List;

/* compiled from: BonusCatalogItems.kt */
/* loaded from: classes5.dex */
public final class yk7 extends bk7 {
    public final List<wk7> c;

    public yk7(List<wk7> list) {
        super(0);
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yk7) && epx.f(this.c, ((yk7) obj).c);
    }

    public final int hashCode() {
        List<wk7> list = this.c;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("BonusCatalogTutorialsItem(tutorials="), this.c);
    }
}
