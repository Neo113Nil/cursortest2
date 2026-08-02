package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final /* synthetic */ class dp71 implements ov71, ly71, pn71 {
    public final /* synthetic */ int a;

    public /* synthetic */ dp71(int i) {
        this.a = i;
    }

    @Override // defpackage.pn71
    public kq71 a(Bundle bundle) {
        pr71[] pr71VarArr;
        switch (this.a) {
            case 26:
                long j = bundle.getLong(Integer.toString(0, 36));
                int i = bundle.getInt(Integer.toString(1, 36), -1);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(2, 36));
                int[] intArray = bundle.getIntArray(Integer.toString(3, 36));
                long[] longArray = bundle.getLongArray(Integer.toString(4, 36));
                long j2 = bundle.getLong(Integer.toString(5, 36));
                boolean z = bundle.getBoolean(Integer.toString(6, 36));
                if (intArray == null) {
                    intArray = new int[0];
                }
                int[] iArr = intArray;
                Uri[] uriArr = parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]);
                if (longArray == null) {
                    longArray = new long[0];
                }
                return new pr71(j, i, iArr, uriArr, longArray, j2, z);
            case 27:
                wp71 wp71Var = new wp71();
                long j3 = bundle.getLong(Integer.toString(0, 36), 0L);
                if (j3 < 0) {
                    w511.q();
                    return null;
                }
                wp71Var.a = j3;
                long j4 = bundle.getLong(Integer.toString(1, 36), Long.MIN_VALUE);
                if (j4 != Long.MIN_VALUE && j4 < 0) {
                    w511.q();
                    return null;
                }
                wp71Var.b = j4;
                wp71Var.c = bundle.getBoolean(Integer.toString(2, 36), false);
                wp71Var.d = bundle.getBoolean(Integer.toString(3, 36), false);
                wp71Var.e = bundle.getBoolean(Integer.toString(4, 36), false);
                return new dw71(wp71Var);
            case 28:
                if (bundle.getInt(Integer.toString(0, 36), -1) != 2) {
                    w511.q();
                    return null;
                }
                int i2 = bundle.getInt(Integer.toString(1, 36), 5);
                float f = bundle.getFloat(Integer.toString(2, 36), -1.0f);
                return f == -1.0f ? new ju71(i2) : new ju71(i2, f);
            default:
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(Integer.toString(1, 36));
                if (parcelableArrayList2 == null) {
                    pr71VarArr = new pr71[0];
                } else {
                    pr71[] pr71VarArr2 = new pr71[parcelableArrayList2.size()];
                    for (int i3 = 0; i3 < parcelableArrayList2.size(); i3++) {
                        pr71VarArr2[i3] = (pr71) pr71.A.a((Bundle) parcelableArrayList2.get(i3));
                    }
                    pr71VarArr = pr71VarArr2;
                }
                return new uu71(pr71VarArr, bundle.getLong(Integer.toString(2, 36), 0L), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getInt(Integer.toString(4, 36)));
        }
    }

    @Override // defpackage.ly71
    public void c(Object obj, hh71 hh71Var) {
    }

    @Override // defpackage.ov71
    public void invoke(Object obj) {
        b171 b171Var = (b171) obj;
        switch (this.a) {
            case 0:
                b171Var.getClass();
                break;
            case 1:
                b171Var.getClass();
                break;
            case 2:
                b171Var.getClass();
                break;
            case 3:
                b171Var.getClass();
                break;
            case 4:
                b171Var.getClass();
                break;
            case 5:
                b171Var.getClass();
                break;
            case 6:
                b171Var.getClass();
                break;
            case 7:
                b171Var.getClass();
                break;
            case 8:
                b171Var.getClass();
                break;
            case 9:
                b171Var.getClass();
                break;
            case 10:
                b171Var.getClass();
                break;
            case 11:
                b171Var.getClass();
                break;
            case 12:
                b171Var.getClass();
                break;
            case 13:
                b171Var.getClass();
                break;
            case 14:
                b171Var.getClass();
                break;
            case 15:
                b171Var.getClass();
                break;
            case 16:
                b171Var.getClass();
                break;
            case 17:
                b171Var.getClass();
                break;
            case 18:
                b171Var.getClass();
                break;
            case 19:
                b171Var.getClass();
                break;
            case 20:
                b171Var.getClass();
                break;
            case 21:
                b171Var.getClass();
                break;
            case 22:
                b171Var.getClass();
                break;
            case 23:
                b171Var.getClass();
                break;
            default:
                b171Var.getClass();
                break;
        }
    }
}
