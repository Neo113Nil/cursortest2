package defpackage;

import java.util.ArrayList;

/* loaded from: classes9.dex */
public class adc extends zcc {
    public static ArrayList D(Iterable iterable, Class cls) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
