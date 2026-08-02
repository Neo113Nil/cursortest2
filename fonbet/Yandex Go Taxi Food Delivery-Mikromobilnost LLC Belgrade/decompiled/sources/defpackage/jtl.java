package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes9.dex */
public final class jtl {
    public static final itl Companion = new itl();
    public static final i3y[] d = {a.b(LazyThreadSafetyMode.PUBLICATION, new xyi(23)), null, null};
    public final Map a;
    public final String b;
    public final String c;

    public /* synthetic */ jtl(int i, String str, String str2, Map map) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, htl.a.getDescriptor());
            throw null;
        }
        this.a = map;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }
}
