package yads;

import java.io.Serializable;

/* loaded from: classes10.dex */
public final class q51 implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object[] b;

    public q51(Object[] objArr) {
        this.b = objArr;
    }

    public Object readResolve() {
        return s51.b(this.b);
    }
}
