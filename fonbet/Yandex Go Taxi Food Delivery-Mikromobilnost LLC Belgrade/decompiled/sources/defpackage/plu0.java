package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes5.dex */
public final class plu0 {
    public static final llu0 Companion = new llu0();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new fet0(28))};
    public final List a;

    public /* synthetic */ plu0(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, klu0.a.getDescriptor());
            throw null;
        }
    }

    public plu0(List list) {
        this.a = list;
    }
}
