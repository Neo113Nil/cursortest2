package yads;

import java.io.Serializable;

/* loaded from: classes10.dex */
public final class w51 implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object[] b;

    public w51(Object[] objArr) {
        this.b = objArr;
    }

    public Object readResolve() {
        Object[] objArr = this.b;
        int length = objArr.length;
        return length != 0 ? length != 1 ? x51.b(objArr.length, (Object[]) objArr.clone()) : new b13(objArr[0]) : zn2.j;
    }
}
