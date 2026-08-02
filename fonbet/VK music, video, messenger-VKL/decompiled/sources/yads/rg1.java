package yads;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes10.dex */
public abstract class rg1 {
    public static ArrayList a(Object... objArr) {
        objArr.getClass();
        int length = objArr.length;
        kx.a(length, "arraySize");
        ArrayList arrayList = new ArrayList(wd1.b(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }
}
