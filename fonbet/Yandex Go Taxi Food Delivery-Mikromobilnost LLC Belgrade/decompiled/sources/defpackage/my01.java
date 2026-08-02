package defpackage;

import defpackage.od60;

/* loaded from: classes10.dex */
public abstract class my01 implements Cloneable {
    public final od60.a a = od60.b;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final my01 clone() {
        try {
            return (my01) super.clone();
        } catch (CloneNotSupportedException e) {
            ny61.j(e);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof my01) {
            return pw21.b(this.a, ((my01) obj).a);
        }
        return false;
    }

    public int hashCode() {
        od60.a aVar = this.a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }
}
