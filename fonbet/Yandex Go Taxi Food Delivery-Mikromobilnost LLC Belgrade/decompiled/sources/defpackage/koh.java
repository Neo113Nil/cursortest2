package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes10.dex */
public final class koh {
    public static final goh Companion = new goh();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new b9h(8))};
    public final joh a;
    public final List b;

    public /* synthetic */ koh(int i, joh johVar, List list) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, foh.a.getDescriptor());
            throw null;
        }
        this.a = johVar;
        this.b = list;
    }

    public koh(joh johVar, List list) {
        this.a = johVar;
        this.b = list;
    }
}
