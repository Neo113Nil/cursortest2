package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: CommunityLiveCoverReducerDelegate.kt */
/* loaded from: classes5.dex */
public final class a9h {
    public static r8h a(r8h r8hVar, boolean z) {
        int i = r8hVar.c + 1;
        List<gwh<?, ?>> list = r8hVar.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            arrayList.add(((gwh) obj).a(i2 == (r8hVar.c + 1) % r8hVar.l));
            i2 = i3;
        }
        return r8h.a(r8hVar, arrayList, i, false, z ? false : r8hVar.e, z ? true : r8hVar.f, false, false, 202);
    }
}
