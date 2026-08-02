package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.wty0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class egz0 {
    public final kbz0 a;
    public final ArrayList b = new ArrayList();

    public egz0(wty0 wty0Var) {
        this.a = new kbz0(wty0Var.a);
        List list = wty0Var.c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.b.add(new ufy0((wty0.a) it.next()));
            }
        }
    }
}
