package xsna;

import java.util.ArrayList;
import xsna.ocz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class lhz0 {
    public final ocz0.d a;
    public final kbz0 b;
    public final ArrayList c;

    public lhz0(ocz0.d dVar) {
        this.a = dVar;
        String str = dVar.V;
        ArrayList arrayList = dVar.Y;
        this.b = new kbz0(kiw.b(dVar.W, dVar.X, str));
        this.c = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            this.c.add(new fgz0((ocz0.e) arrayList.get(i)));
        }
    }

    public final float a() {
        return this.a.D;
    }

    public final String b() {
        return this.a.U;
    }

    public final ArrayList c() {
        return this.c;
    }

    public final kbz0 d() {
        return this.b;
    }
}
