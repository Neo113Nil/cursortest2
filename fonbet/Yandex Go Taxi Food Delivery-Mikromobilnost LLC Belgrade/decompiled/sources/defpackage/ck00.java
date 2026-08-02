package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class ck00 extends dk00 {
    public final LinkedHashMap a;
    public String b = null;

    public ck00(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final String toString() {
        return b64.p(new StringBuilder("Map ("), this.b, ')');
    }
}
