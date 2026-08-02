package defpackage;

import java.util.Map;

/* loaded from: classes11.dex */
public final class aqy implements Map.Entry {
    public Object A;
    public int B;
    public aqy a;
    public aqy b;
    public aqy c;
    public aqy w;
    public aqy x;
    public final Object y;
    public final boolean z;

    public aqy(boolean z, aqy aqyVar, Object obj, aqy aqyVar2, aqy aqyVar3) {
        this.a = aqyVar;
        this.y = obj;
        this.z = z;
        this.B = 1;
        this.w = aqyVar2;
        this.x = aqyVar3;
        aqyVar3.w = this;
        aqyVar2.x = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.y;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.A;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.A;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.y;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.A;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.z) {
            ny61.t("value == null");
            return null;
        }
        Object obj2 = this.A;
        this.A = obj;
        return obj2;
    }

    public final String toString() {
        return this.y + "=" + this.A;
    }

    public aqy(boolean z) {
        this.y = null;
        this.z = z;
        this.x = this;
        this.w = this;
    }
}
