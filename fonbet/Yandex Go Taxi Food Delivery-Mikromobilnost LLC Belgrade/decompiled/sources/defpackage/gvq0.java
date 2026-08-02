package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes5.dex */
public final class gvq0 {
    public static final fvq0 Companion = new fvq0();
    public static final i3y[] d = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new xiq0(14))};
    public final f0t a;
    public final xzs b;
    public final List c;

    public /* synthetic */ gvq0(int i, f0t f0tVar, xzs xzsVar, List list) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, evq0.a.getDescriptor());
            throw null;
        }
        this.a = f0tVar;
        this.b = xzsVar;
        this.c = list;
    }

    public gvq0(f0t f0tVar, xzs xzsVar, List list) {
        this.a = f0tVar;
        this.b = xzsVar;
        this.c = list;
    }
}
