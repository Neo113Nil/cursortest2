package xsna;

import java.util.HashMap;

/* compiled from: ReefState.kt */
/* loaded from: classes5.dex */
public final class yzq0 extends wof0 {
    public final HashMap<String, Boolean> a;

    public yzq0(HashMap<String, Boolean> hashMap) {
        this.a = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yzq0) && epx.f(this.a, ((yzq0) obj).a);
    }

    public final int hashCode() {
        HashMap<String, Boolean> hashMap = this.a;
        if (hashMap == null) {
            return 0;
        }
        return hashMap.hashCode();
    }

    public final String toString() {
        return "UserState(features=" + this.a + ")";
    }
}
