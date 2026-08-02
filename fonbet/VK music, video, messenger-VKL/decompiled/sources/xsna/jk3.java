package xsna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: ArrayBackedAttributes.java */
/* loaded from: classes11.dex */
public final class jk3 extends uow<i94<?>, Object> implements q94 {
    public static final Comparator<i94<?>> d = Comparator.comparing(new ik3());
    public static final jk3 e;

    static {
        ArrayList arrayList = new ArrayList();
        e = (arrayList.size() != 2 || arrayList.get(0) == null) ? b(arrayList.toArray()) : new jk3(arrayList.toArray());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static jk3 b(Object... objArr) {
        for (int i = 0; i < objArr.length; i += 2) {
            i94 i94Var = (i94) objArr[i];
            if (i94Var != null && i94Var.getKey().isEmpty()) {
                objArr[i] = null;
            }
        }
        myc0.c("You must provide an even number of key/value pair arguments.", objArr.length % 2 == 0);
        if (objArr.length != 0) {
            Object[] objArr2 = new Object[objArr.length];
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            int length = objArr.length;
            Comparator<i94<?>> comparator = d;
            uow.a(objArr2, 0, length, objArr, comparator);
            int i2 = 0;
            Object obj = null;
            for (int i3 = 0; i3 < objArr.length; i3 += 2) {
                Object obj2 = objArr[i3];
                Object obj3 = objArr[i3 + 1];
                if (obj2 != null) {
                    if (obj != null && comparator.compare(obj2, obj) == 0) {
                        i2 -= 2;
                    }
                    if (obj3 == null) {
                        obj = null;
                    } else {
                        int i4 = i2 + 1;
                        objArr[i2] = obj2;
                        i2 += 2;
                        objArr[i4] = obj3;
                        obj = obj2;
                    }
                }
            }
            if (objArr.length != i2) {
                Object[] objArr3 = new Object[i2];
                System.arraycopy(objArr, 0, objArr3, 0, i2);
                objArr = objArr3;
            }
        }
        return new jk3(objArr);
    }

    @Override // xsna.q94
    public final lk3 toBuilder() {
        return new lk3(new ArrayList(Arrays.asList(this.b)));
    }
}
