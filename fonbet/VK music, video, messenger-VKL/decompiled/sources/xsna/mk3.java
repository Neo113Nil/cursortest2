package xsna;

import com.ironsource.B5;
import java.util.Arrays;

/* compiled from: ArrayBasedContext.java */
/* loaded from: classes11.dex */
public final class mk3 implements wmj {
    public static final mk3 b = new mk3(new Object[0]);
    public final Object[] a;

    public mk3(Object[] objArr) {
        this.a = objArr;
    }

    @Override // xsna.wmj
    public final mk3 a(rll rllVar, ohk0 ohk0Var) {
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 2);
                copyOf[copyOf.length - 2] = rllVar;
                copyOf[copyOf.length - 1] = ohk0Var;
                return new mk3(copyOf);
            }
            if (objArr[i] == rllVar) {
                int i2 = i + 1;
                if (objArr[i2] == ohk0Var) {
                    return this;
                }
                Object[] objArr2 = (Object[]) objArr.clone();
                objArr2[i2] = ohk0Var;
                return new mk3(objArr2);
            }
            i += 2;
        }
    }

    @Override // xsna.wmj
    public final <V> V c(rll rllVar) {
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                return null;
            }
            if (objArr[i] == rllVar) {
                return (V) objArr[i + 1];
            }
            i += 2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                break;
            }
            sb.append(objArr[i]);
            sb.append(B5.U);
            sb.append(objArr[i + 1]);
            sb.append(", ");
            i += 2;
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }
        sb.append('}');
        return sb.toString();
    }
}
