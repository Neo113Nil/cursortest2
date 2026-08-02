package defpackage;

import android.location.Location;
import com.yandex.go.navigator.domain.o;

/* loaded from: classes12.dex */
public final class lc50 {
    public final o a;
    public Float b;

    public lc50(o oVar) {
        this.a = oVar;
        Location M = d6z.M();
        this.b = M != null ? Float.valueOf(M.getBearing()) : null;
    }
}
