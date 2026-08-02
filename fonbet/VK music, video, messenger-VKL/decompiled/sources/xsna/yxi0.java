package xsna;

import java.util.ArrayList;
import java.util.List;
import xsna.usi0;

/* compiled from: SessionsExt.kt */
/* loaded from: classes6.dex */
public final class yxi0 {
    public static final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((usi0.a) obj) instanceof usi0.a.b)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
