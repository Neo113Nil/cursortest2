package defpackage;

import android.location.Location;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final /* synthetic */ class dfm {
    public static void a(Location location) {
        bfm bfmVar = bfm.i;
        s6z s6zVar = (s6z) bfmVar.e.get();
        if (s6zVar == null) {
            s6zVar = new s6z(location.getLongitude(), location.getLatitude());
        }
        if (jl40.e(bfmVar.e, s6zVar)) {
            Iterator it = bfmVar.g.iterator();
            while (it.hasNext()) {
                ((sls) it.next()).invoke();
            }
        }
    }
}
