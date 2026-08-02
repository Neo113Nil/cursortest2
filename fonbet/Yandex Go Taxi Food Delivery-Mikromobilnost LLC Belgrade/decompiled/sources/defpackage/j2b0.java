package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class j2b0 extends na implements siv {
    public final b2b0 a;

    public j2b0(b2b0 b2b0Var) {
        this.a = b2b0Var;
    }

    @Override // defpackage.z6, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        b2b0 b2b0Var = this.a;
        Object obj2 = b2b0Var.get(key);
        return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && b2b0Var.containsKey(entry.getKey());
    }

    @Override // defpackage.z6
    public final int getSize() {
        b2b0 b2b0Var = this.a;
        b2b0Var.getClass();
        return b2b0Var.b;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ce11 ce11Var = this.a.a;
        de11[] de11VarArr = new de11[8];
        for (int i = 0; i < 8; i++) {
            de11VarArr[i] = new ee11();
        }
        return new k2b0(ce11Var, de11VarArr);
    }
}
