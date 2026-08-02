package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes12.dex */
public final class cd01 {
    public final List a;

    public cd01(int i) {
        this.a = EmptyList.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cd01) && jl40.l(this.a, ((cd01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 961;
    }

    public final String toString() {
        return tse0.k("TrainTariffData(title=null, buttonTitle=null, items=", ", selectedTariffId=null, propertyName=null)", this.a);
    }

    public cd01() {
        this(0);
    }
}
