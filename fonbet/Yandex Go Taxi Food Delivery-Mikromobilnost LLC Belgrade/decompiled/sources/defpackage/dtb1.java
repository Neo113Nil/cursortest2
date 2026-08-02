package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state.ItemType;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.a;

/* loaded from: classes3.dex */
public abstract class dtb1 {
    public static final byte[] a(String str) {
        if (str.length() % 2 != 0) {
            str = gvu0.t0(1, str);
        }
        ArrayList q0 = gvu0.q0(2, str);
        ArrayList arrayList = new ArrayList(tcc.n(q0, 10));
        Iterator it = q0.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            rza.a(16);
            arrayList.add(Byte.valueOf((byte) Integer.parseInt(str2, 16)));
        }
        return a.D0(arrayList);
    }

    public static final String b(tq01 tq01Var, ItemType itemType) {
        vqj0 c = tq01Var.c(itemType);
        String str = c != null ? c.c : null;
        return str == null ? "" : str;
    }
}
