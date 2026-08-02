package yads;

import java.io.Serializable;

/* loaded from: classes10.dex */
public final class n51 extends b0 implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object b;
    public final Object c;

    public n51(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
