package defpackage;

import com.google.gson.internal.LinkedTreeMap;

/* loaded from: classes11.dex */
public final class jdx extends pcx {
    public final LinkedTreeMap a;

    public jdx() {
        rvr rvrVar = LinkedTreeMap.a;
        this.a = new LinkedTreeMap(false);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof jdx) && ((jdx) obj).a.equals(this.a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
