package xsna;

import java.util.ArrayList;
import java.util.List;
import xsna.c8t;
import xsna.sbt;

/* compiled from: GameUserStack.kt */
/* loaded from: classes17.dex */
public final class g8t {
    public static c8t a(sbt.a aVar) {
        String str = aVar.a;
        List<sbt.a.C3659a> H0 = j5g.H0(aVar.b, 2);
        ArrayList arrayList = new ArrayList(c5g.u(H0, 10));
        for (sbt.a.C3659a c3659a : H0) {
            arrayList.add(new c8t.a(c3659a.a, c3659a.b, c3659a.c));
        }
        return new c8t(str, arrayList);
    }
}
