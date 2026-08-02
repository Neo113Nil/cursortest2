package xsna;

import androidx.datastore.core.DataStoreImpl;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: DataStoreFactory.jvm.kt */
/* loaded from: classes.dex */
public final class gvk {
    public static DataStoreImpl a(qmi0 qmi0Var, x0g0 x0g0Var, List list, hpj hpjVar, gzs gzsVar, int i) {
        twj twjVar = x0g0Var;
        if ((i & 2) != 0) {
            twjVar = null;
        }
        if ((i & 4) != 0) {
            list = EmptyList.b;
        }
        if ((i & 8) != 0) {
            bdn bdnVar = bdn.a;
            hpjVar = zvj.a(wgl.c.plus(whn0.a()));
        }
        nar narVar = new nar(qmi0Var, gzsVar);
        twj twjVar2 = twjVar;
        if (twjVar == null) {
            twjVar2 = new po40(4);
        }
        return new DataStoreImpl(narVar, Collections.singletonList(new guk(list, null)), twjVar2, hpjVar);
    }
}
