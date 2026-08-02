package defpackage;

import ru.yandex.taxi.costcenters.api.CostCenterField;

/* loaded from: classes5.dex */
public abstract class dwe {
    public static final String a(CostCenterField.InputFormat inputFormat) {
        int i = cwe.a[inputFormat.ordinal()];
        if (i == 1) {
            return "text";
        }
        if (i == 2) {
            return "mixed";
        }
        if (i == 3) {
            return "select";
        }
        w511.b();
        return null;
    }
}
