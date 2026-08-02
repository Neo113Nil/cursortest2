package defpackage;

import androidx.compose.ui.semantics.c;
import androidx.compose.ui.semantics.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.logistics.sdk.tracking.impl.rover.data.RoverApi;

/* loaded from: classes6.dex */
public abstract class g9b1 {
    public static List a(v46 v46Var) {
        pg70 pg70Var = v46Var.b;
        u2t u2tVar = v46Var.a;
        if (pg70Var != null) {
            Integer num = pg70Var.c;
            String str = pg70Var.b;
            String str2 = pg70Var.a;
            if (str2 != null && str != null && num != null && u2tVar != null) {
                List<List> list = u2tVar.a;
                if (u2tVar.b != null && list != null) {
                    int Q = q5z.Q(0, str2);
                    int Q2 = q5z.Q(0, str);
                    String str3 = v46Var.e;
                    int intValue = num.intValue();
                    int[] iArr = pg70Var.d;
                    if (iArr == null || iArr.length != 2) {
                        ny61.r("wrong zoom range");
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (List list2 : list) {
                        c56 c56Var = new c56();
                        c56Var.a = Q2;
                        c56Var.b = Q;
                        c56Var.d = list2;
                        c56Var.c = intValue;
                        c56Var.e = iArr;
                        c56Var.f = str3;
                        arrayList.add(new d56(c56Var));
                    }
                    return arrayList;
                }
            }
        }
        return EmptyList.a;
    }

    public static final boolean b(c cVar) {
        cnq0 k = cVar.k();
        return k.a.b(d.B);
    }

    public static RoverApi c(t0k0 t0k0Var) {
        return (RoverApi) t0k0Var.b(RoverApi.class);
    }
}
