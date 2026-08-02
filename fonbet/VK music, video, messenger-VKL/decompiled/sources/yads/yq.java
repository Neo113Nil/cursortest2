package yads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes10.dex */
public abstract class yq {
    public static tn2 a(wq wqVar, ArrayList arrayList) {
        p51 p51Var = s51.c;
        kx.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i = 0;
        int i2 = 0;
        while (i < arrayList.size()) {
            Bundle bundle = (Bundle) arrayList.get(i);
            bundle.getClass();
            xq fromBundle = wqVar.fromBundle(bundle);
            fromBundle.getClass();
            int i3 = i2 + 1;
            if (objArr.length < i3) {
                objArr = Arrays.copyOf(objArr, l51.a(objArr.length, i3));
            }
            objArr[i2] = fromBundle;
            i++;
            i2 = i3;
        }
        return s51.b(i2, objArr);
    }
}
