package yads;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes10.dex */
public final class u51 implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object[] b;
    public final Object[] c;

    public u51(v51 v51Var) {
        yn2 yn2Var = (yn2) v51Var;
        Object[] objArr = new Object[yn2Var.size()];
        Object[] objArr2 = new Object[yn2Var.size()];
        nb3 it = yn2Var.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        this.b = objArr;
        this.c = objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object readResolve() {
        Object[] objArr = this.b;
        int i = 0;
        if (objArr instanceof x51) {
            x51 x51Var = (x51) objArr;
            m51 m51Var = (m51) this.c;
            Object[] objArr2 = new Object[x51Var.size() * 2];
            nb3 it = x51Var.iterator();
            nb3 it2 = m51Var.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Object next2 = it2.next();
                int i2 = i + 1;
                int i3 = i2 * 2;
                if (i3 > objArr2.length) {
                    objArr2 = Arrays.copyOf(objArr2, l51.a(objArr2.length, i3));
                }
                kx.a(next, next2);
                int i4 = i * 2;
                objArr2[i4] = next;
                objArr2[i4 + 1] = next2;
                i = i2;
            }
            return yn2.a(i, objArr2);
        }
        Object[] objArr3 = this.c;
        Object[] objArr4 = new Object[objArr.length * 2];
        int i5 = 0;
        while (i < objArr.length) {
            Object[] objArr5 = objArr[i];
            Object obj = objArr3[i];
            int i6 = i5 + 1;
            int i7 = i6 * 2;
            if (i7 > objArr4.length) {
                objArr4 = Arrays.copyOf(objArr4, l51.a(objArr4.length, i7));
            }
            kx.a(objArr5, obj);
            int i8 = i5 * 2;
            objArr4[i8] = objArr5;
            objArr4[i8 + 1] = obj;
            i++;
            i5 = i6;
            objArr4 = objArr4;
        }
        return yn2.a(i5, objArr4);
    }
}
