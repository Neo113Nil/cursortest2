package xsna;

import kotlin.Result;
import xsna.pyx;

/* compiled from: JobSupport.kt */
/* loaded from: classes11.dex */
public final class keg0<T> extends jyx {
    public final pyx.a f;

    public keg0(pyx.a aVar) {
        this.f = aVar;
    }

    @Override // xsna.jyx
    public final boolean h() {
        return false;
    }

    @Override // xsna.jyx
    public final void i(Throwable th) {
        pyx pyxVar = this.e;
        if (pyxVar == null) {
            pyxVar = null;
        }
        pyxVar.getClass();
        Object obj = pyx.b.get(pyxVar);
        boolean z = obj instanceof d8i;
        pyx.a aVar = this.f;
        if (z) {
            aVar.resumeWith(new Result.Failure(((d8i) obj).a));
        } else {
            aVar.resumeWith(tyx.d(obj));
        }
    }
}
