package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class mpb {
    public static final ArrayList a = new ArrayList();

    public static String a(int i) {
        ArrayList arrayList = a;
        if (arrayList.size() <= i) {
            arrayList.ensureCapacity(i + 1);
            int size = arrayList.size();
            if (size <= i) {
                while (true) {
                    arrayList.add(size, "child#" + size);
                    if (size == i) {
                        break;
                    }
                    size++;
                }
            }
        }
        return (String) arrayList.get(i);
    }
}
