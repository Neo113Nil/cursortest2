package xsna;

import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;
import xsna.y0j;

/* compiled from: ConfigureRoomParticipantViewTypeDelegate.kt */
/* loaded from: classes7.dex */
public final class i0j extends p1u0<hfz> {
    public final g1j a;

    public i0j(g1j g1jVar) {
        this.a = g1jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [xsna.vfz, xsna.vfz<xsna.hfz>] */
    @Override // xsna.p1u0
    public final void a(vfz<hfz> vfzVar, hfz hfzVar, List<? extends Object> list) {
        y0j y0jVar;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                y0jVar = it.next();
                if (y0jVar instanceof y0j) {
                    break;
                }
            }
        }
        y0jVar = 0;
        y0j y0jVar2 = y0jVar instanceof y0j ? y0jVar : null;
        if (y0jVar2 == null || !(vfzVar instanceof y0j.a)) {
            vfzVar.W5(hfzVar);
        } else {
            ((y0j.a) vfzVar).z2(y0jVar2);
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends hfz> b(ViewGroup viewGroup) {
        return new c1j(viewGroup, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof x0j;
    }
}
