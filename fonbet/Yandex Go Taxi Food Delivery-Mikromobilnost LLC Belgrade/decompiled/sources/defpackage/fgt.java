package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes12.dex */
public final class fgt {
    public static final egt Companion = new egt();
    public static final i3y[] d = {a.b(LazyThreadSafetyMode.PUBLICATION, new sss(13)), null, null};
    public final Map a;
    public final String b;
    public final String c;

    public /* synthetic */ fgt(int i, String str, String str2, Map map) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, dgt.a.getDescriptor());
            throw null;
        }
        this.a = map;
        this.b = str;
        this.c = str2;
    }

    public fgt(Map map, String str) {
        this.a = map;
        this.b = "32.50.3";
        this.c = str;
    }
}
