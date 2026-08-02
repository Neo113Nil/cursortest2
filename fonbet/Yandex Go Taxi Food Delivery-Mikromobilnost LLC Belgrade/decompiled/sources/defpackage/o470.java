package defpackage;

import java.util.Comparator;
import ru.yandex.taxi.costcenters.api.CostCenterField;

/* loaded from: classes5.dex */
public final class o470 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Boolean.valueOf(((CostCenterField) obj2).d).compareTo(Boolean.valueOf(((CostCenterField) obj).d));
    }
}
