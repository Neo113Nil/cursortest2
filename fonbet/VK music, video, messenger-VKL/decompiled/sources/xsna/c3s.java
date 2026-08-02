package xsna;

import android.view.ViewGroup;
import java.util.List;
import xsna.hss;
import xsna.v3s;

/* compiled from: FollowerViewTypeDelegate.kt */
/* loaded from: classes15.dex */
public final class c3s extends p1u0<v3s.a> {
    public final ris a;

    public c3s(ris risVar) {
        this.a = risVar;
    }

    @Override // xsna.p1u0
    public final void a(vfz<v3s.a> vfzVar, v3s.a aVar, List list) {
        v3s.a aVar2 = aVar;
        if (list == null) {
            vfzVar.W5(aVar2);
        } else {
            ((b3s) vfzVar).l.W5(aVar2.b, list);
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends v3s.a> b(ViewGroup viewGroup) {
        return new b3s(this.a.a(viewGroup, hss.c.a));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof v3s.a;
    }
}
