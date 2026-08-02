package xsna;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class rez0 extends njz0 {
    public final HashMap b;

    public rez0() {
        HashMap hashMap = new HashMap();
        this.b = hashMap;
        hashMap.put("preroll", new pjz0("preroll"));
        hashMap.put("pauseroll", new pjz0("pauseroll"));
        hashMap.put("midroll", new pjz0("midroll"));
        hashMap.put("postroll", new pjz0("postroll"));
    }

    @Override // xsna.njz0
    public final int a() {
        Iterator it = this.b.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((pjz0) it.next()).d.size();
        }
        return i;
    }

    public final pjz0 b(String str) {
        return (pjz0) this.b.get(str);
    }

    public final ArrayList c() {
        return new ArrayList(this.b.values());
    }
}
