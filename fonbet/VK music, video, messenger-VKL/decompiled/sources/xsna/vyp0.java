package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import xsna.kjf0;

/* compiled from: UiGroupBlockDecorator.kt */
/* loaded from: classes18.dex */
public final class vyp0 {
    public final void a(ArrayList arrayList) {
        if (arrayList.size() == 1) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((kjf0.a) it.next()).c = 6;
            }
        } else if (arrayList.size() > 1) {
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                ((kjf0.a) obj).c = i == 0 ? 2 : i == arrayList.size() - 1 ? 4 : 1;
                i = i2;
            }
        }
    }
}
