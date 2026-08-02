package defpackage;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.DispatchException;

/* loaded from: classes9.dex */
public final class p3y extends qoh {
    public final Continuation y;

    public p3y(fse fseVar, wls wlsVar) {
        super(fseVar, false);
        this.y = dvw.a(wlsVar, this, this);
    }

    @Override // kotlinx.coroutines.c
    public final void Z() {
        try {
            bvf0.P(zy11.a, dvw.b(this.y));
        } catch (Throwable th) {
            th = th;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).getCause();
            }
            resumeWith(new Result.Failure(th));
            throw th;
        }
    }
}
