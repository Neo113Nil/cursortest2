package defpackage;

import android.location.Location;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ofm implements vpr {
    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        s6z s6zVar;
        Location location = (Location) obj;
        bfm bfmVar = bfm.i;
        if (location != null) {
            s6zVar = new s6z(location.getLongitude(), location.getLatitude());
        } else {
            s6zVar = null;
        }
        if (jl40.e(bfmVar.e, s6zVar)) {
            Iterator it = bfmVar.g.iterator();
            while (it.hasNext()) {
                ((sls) it.next()).invoke();
            }
        }
        return zy11.a;
    }
}
