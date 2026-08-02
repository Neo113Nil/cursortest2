package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes6.dex */
public final class acv0 {
    public static final zbv0 Companion = new zbv0();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new w0v0(19))};
    public final List a;

    public /* synthetic */ acv0(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, ybv0.a.getDescriptor());
            throw null;
        }
    }

    public acv0(List list) {
        this.a = list;
    }
}
