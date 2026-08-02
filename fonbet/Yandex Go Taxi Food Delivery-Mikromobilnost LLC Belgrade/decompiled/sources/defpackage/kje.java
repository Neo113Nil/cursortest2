package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class kje {
    public d6x d;
    public t5x e;
    public b5x f;
    public Object[] a = new Object[16];
    public Object[] b = new Object[16];
    public int c = -1;
    public final ArrayList g = new ArrayList();

    public final Object a() {
        Object[] objArr = this.b;
        int i = this.c;
        this.c = i - 1;
        return objArr[i];
    }

    public final void b(Object obj) {
        int i = this.c;
        Object[] objArr = this.b;
        if (i >= objArr.length) {
            this.b = Arrays.copyOf(objArr, objArr.length * 2);
        }
        Object[] objArr2 = this.b;
        int i2 = this.c + 1;
        this.c = i2;
        objArr2[i2] = obj;
    }
}
