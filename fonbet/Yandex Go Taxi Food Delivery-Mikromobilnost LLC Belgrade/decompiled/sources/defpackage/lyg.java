package defpackage;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes14.dex */
public final class lyg {
    public final String a;
    public final Map b;
    public final Throwable c;

    public lyg(String str, String str2, String str3, Throwable th) {
        Map r = b.r(kotlin.sequences.b.i(j73.v(new Pair[]{str3 != null ? new Pair("elementId", str3) : null, str2 != null ? new Pair("elementType", str2) : null})));
        this.a = str;
        this.b = r;
        this.c = th;
    }

    public final Throwable a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public /* synthetic */ lyg(String str, Throwable th, int i) {
        this(str, (i & 8) != 0 ? null : "section", null, (i & 32) != 0 ? null : th);
    }
}
