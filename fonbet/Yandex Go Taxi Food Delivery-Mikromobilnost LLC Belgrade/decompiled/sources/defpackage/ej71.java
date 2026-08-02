package defpackage;

import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class ej71 {
    public static final int[] a = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    public static final cf71 b = new cf71(new yx61(8));
    public static final cf71 c = new cf71(new yx61(9));

    public static void a(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new yn61());
                break;
            case 1:
                arrayList.add(new m571());
                break;
            case 2:
                arrayList.add(new d071());
                break;
            case 3:
                arrayList.add(new rh61());
                break;
            case 4:
                n771 i2 = b.i(0);
                if (i2 == null) {
                    arrayList.add(new xv81());
                    break;
                } else {
                    arrayList.add(i2);
                    break;
                }
            case 5:
                arrayList.add(new un71());
                break;
            case 6:
                arrayList.add(new if81(0));
                break;
            case 7:
                arrayList.add(new qt71());
                break;
            case 8:
                arrayList.add(new dw81());
                arrayList.add(new zz71());
                break;
            case 9:
                arrayList.add(new co81());
                break;
            case 10:
                arrayList.add(new ka71());
                break;
            case 11:
                arrayList.add(new ur71());
                break;
            case 12:
                arrayList.add(new jz71());
                break;
            case 14:
                arrayList.add(new o371());
                break;
            case 15:
                n771 i3 = c.i(new Object[0]);
                if (i3 != null) {
                    arrayList.add(i3);
                    break;
                }
                break;
            case 16:
                arrayList.add(new pc81());
                break;
        }
    }
}
