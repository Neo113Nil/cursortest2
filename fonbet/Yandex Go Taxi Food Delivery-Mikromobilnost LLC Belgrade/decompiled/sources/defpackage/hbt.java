package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes5.dex */
public final class hbt {
    public static final gbt Companion = new gbt();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new sss(9))};
    public final Map a;

    public /* synthetic */ hbt(int i, Map map) {
        if (1 == (i & 1)) {
            this.a = map;
        } else {
            qje.Z(i, 1, fbt.a.getDescriptor());
            throw null;
        }
    }

    public hbt(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }
}
