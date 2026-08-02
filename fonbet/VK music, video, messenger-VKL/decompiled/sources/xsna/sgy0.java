package xsna;

import java.util.ArrayList;
import xsna.fxy0;
import xsna.igz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class sgy0 {
    public final fxy0 a;
    public final ArrayList b = new ArrayList();
    public igz0.a c;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a implements fxy0.a {
        public a() {
        }
    }

    public sgy0(ArrayList arrayList, fxy0 fxy0Var) {
        this.a = fxy0Var;
        fxy0Var.setCarouselListener(new a());
        for (int i : fxy0Var.getNumbersOfCurrentShowingCards()) {
            if (i < arrayList.size() && i >= 0) {
                wfy0 wfy0Var = (wfy0) arrayList.get(i);
                this.b.add(wfy0Var);
                h8z0.e(wfy0Var.a, "show", 1, null);
            }
        }
    }
}
