package xsna;

import android.view.ViewGroup;
import java.util.List;
import xsna.mks;

/* compiled from: ProfileViewTypeDelegate.kt */
/* loaded from: classes15.dex */
public final class x0e0<T extends mks> extends p1u0<T> {
    public final ris a;
    public final hss b;
    public final Class<T> c;

    public x0e0(ris risVar, hss hssVar, Class<T> cls) {
        this.a = risVar;
        this.b = hssVar;
        this.c = cls;
    }

    @Override // xsna.p1u0
    public final void a(vfz vfzVar, hfz hfzVar, List list) {
        mks mksVar = (mks) hfzVar;
        if (list == null) {
            vfzVar.W5(mksVar);
        } else {
            ((qxd0) vfzVar).l.W5(mksVar.getProfile(), list);
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends T> b(ViewGroup viewGroup) {
        return new qxd0(this.a.a(viewGroup, this.b));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return this.c.isAssignableFrom(hfzVar.getClass());
    }
}
