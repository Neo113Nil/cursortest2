package xsna;

import xsna.ja20;

/* compiled from: ProtoData.kt */
/* loaded from: classes12.dex */
public abstract class m8e0<T extends ja20> {
    public abstract T d();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return epx.f(d(), ((m8e0) obj).d());
    }

    public final int hashCode() {
        return d().hashCode();
    }
}
