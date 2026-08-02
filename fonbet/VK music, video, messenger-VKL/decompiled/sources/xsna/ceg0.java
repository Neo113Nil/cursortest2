package xsna;

import androidx.annotation.NonNull;
import java.util.HashMap;

/* compiled from: ResumableNetworkRequest.java */
/* loaded from: classes13.dex */
public abstract class ceg0 extends a560 {
    public ceg0(@NonNull nhl0 nhl0Var, @NonNull vhr vhrVar) {
        this.i = new HashMap();
        exc0.i(vhrVar);
        this.b = nhl0Var;
        vhrVar.a();
        this.c = vhrVar.a;
        vhrVar.a();
        m("x-firebase-gmpid", vhrVar.c.b);
    }
}
