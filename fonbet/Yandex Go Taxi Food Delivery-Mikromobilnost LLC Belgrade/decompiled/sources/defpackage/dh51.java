package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes2.dex */
public class dh51 extends fh51 {
    public final String b;
    public final Map c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dh51(String str, Map map) {
        super(r0);
        LinkedHashMap l = b.l(new Pair(str, "scenario"));
        l.putAll(map);
        this.b = str;
        this.c = map;
    }

    public final String toString() {
        return getClass().getSimpleName() + ":\nscenario=" + this.b + "\nparams=" + this.c;
    }
}
