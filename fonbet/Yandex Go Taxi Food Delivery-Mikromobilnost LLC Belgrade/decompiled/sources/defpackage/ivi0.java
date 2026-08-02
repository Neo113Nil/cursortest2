package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes9.dex */
public final class ivi0 extends kr {
    public static final hvi0 Companion = new hvi0();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new lqi0(3)), null};
    public final List a;
    public final String b;

    public /* synthetic */ ivi0(int i, List list, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, gvi0.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = str;
    }
}
