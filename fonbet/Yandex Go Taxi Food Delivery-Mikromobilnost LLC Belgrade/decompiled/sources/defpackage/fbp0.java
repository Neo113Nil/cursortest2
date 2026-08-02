package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes9.dex */
public class fbp0 extends c7 implements wse {
    public final Continuation y;

    public fbp0(fse fseVar, Continuation continuation) {
        super(fseVar, true);
        this.y = continuation;
    }

    @Override // kotlinx.coroutines.c
    public final boolean S() {
        return true;
    }

    @Override // defpackage.wse
    public final wse getCallerFrame() {
        Continuation continuation = this.y;
        if (continuation instanceof wse) {
            return (wse) continuation;
        }
        return null;
    }

    public void n0() {
    }

    @Override // kotlinx.coroutines.c
    public void p(Object obj) {
        bvf0.P(udq0.M(obj), dvw.b(this.y));
    }

    @Override // kotlinx.coroutines.c
    public void r(Object obj) {
        this.y.resumeWith(udq0.M(obj));
    }
}
