package xsna;

import java.util.HashMap;

/* compiled from: ClipsYandexAdParamsConfig.kt */
/* loaded from: classes16.dex */
public final class yuf {
    public static final yuf b = new yuf(null);
    public final HashMap<String, Object> a;

    public yuf(HashMap<String, Object> hashMap) {
        this.a = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yuf) && epx.f(this.a, ((yuf) obj).a);
    }

    public final int hashCode() {
        HashMap<String, Object> hashMap = this.a;
        if (hashMap == null) {
            return 0;
        }
        return hashMap.hashCode();
    }

    public final String toString() {
        return "ClipsYandexAdParamsConfig(params=" + this.a + ')';
    }
}
