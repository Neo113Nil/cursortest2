package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes9.dex */
public final class bti0 extends kr {
    public static final ati0 Companion = new ati0();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new lqi0(2))};
    public final List a;

    public /* synthetic */ bti0(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, zsi0.a.getDescriptor());
            throw null;
        }
    }
}
