package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;

/* loaded from: classes5.dex */
public final class j00 {
    public final e a;

    public /* synthetic */ j00(e eVar) {
        this.a = eVar;
    }

    public static ArrayList b(gri griVar) {
        return a.m0(griVar.e, griVar.d);
    }

    public static List c(x701 x701Var) {
        return x701Var instanceof t701 ? b(((t701) x701Var).a) : EmptyList.a;
    }

    public List a() {
        return c((x701) this.a.e.a.getValue());
    }

    public Map d() {
        ncz0 ncz0Var;
        v9z0 v9z0Var;
        qfc qfcVar;
        String str;
        Object value = this.a.e.a.getValue();
        t701 t701Var = value instanceof t701 ? (t701) value : null;
        if (t701Var == null || (ncz0Var = t701Var.a.p) == null || (v9z0Var = ncz0Var.c) == null || (qfcVar = v9z0Var.d) == null || (str = qfcVar.a) == null) {
            return null;
        }
        return g8e.z("order_status_color", str);
    }
}
