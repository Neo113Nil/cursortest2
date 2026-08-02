package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import java.util.Objects;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes10.dex */
public final class omh extends r001 {
    public static final omh F = new omh(new nmh());
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final SparseArray D;
    public final SparseBooleanArray E;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    static {
        x4e.x(1000, 1001, 1002, 1003, 1004);
        x4e.x(1005, 1006, 1007, Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND, Constants.RESULT_CHECK_ERROR_CARRIER_NOT_FOUND);
        x4e.x(1010, 1011, 1012, 1013, 1014);
        tw21.Q(1015);
        tw21.Q(1016);
        tw21.Q(1017);
        tw21.Q(1018);
    }

    public omh(nmh nmhVar) {
        super(nmhVar);
        this.w = nmhVar.v;
        this.x = nmhVar.w;
        this.y = nmhVar.x;
        this.z = nmhVar.y;
        this.A = nmhVar.z;
        this.B = nmhVar.A;
        this.C = nmhVar.B;
        this.D = nmhVar.C;
        this.E = nmhVar.D;
    }

    @Override // defpackage.r001
    public final q001 a() {
        return new nmh(this);
    }

    @Override // defpackage.r001
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && omh.class == obj.getClass()) {
            omh omhVar = (omh) obj;
            if (super.equals(omhVar) && this.w == omhVar.w && this.x == omhVar.x && this.y == omhVar.y && this.z == omhVar.z && this.A == omhVar.A && this.B == omhVar.B && this.C == omhVar.C) {
                SparseBooleanArray sparseBooleanArray = omhVar.E;
                SparseBooleanArray sparseBooleanArray2 = this.E;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = omhVar.D;
                            SparseArray sparseArray2 = this.D;
                            int size2 = sparseArray2.size();
                            if (sparseArray.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray2.valueAt(i2);
                                        Map map2 = (Map) sparseArray.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                yzz0 yzz0Var = (yzz0) entry.getKey();
                                                if (map2.containsKey(yzz0Var) && Objects.equals(entry.getValue(), map2.get(yzz0Var))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.r001
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.w ? 1 : 0)) * 961) + (this.x ? 1 : 0)) * 961) + (this.y ? 1 : 0)) * 28629151) + (this.z ? 1 : 0)) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 961) + (this.C ? 1 : 0)) * 31;
    }
}
