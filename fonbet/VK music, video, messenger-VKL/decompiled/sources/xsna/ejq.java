package xsna;

import com.vk.im.engine.exceptions.ImEngineUnrecoverableException;

/* compiled from: FailedImEngineCmd.kt */
/* loaded from: classes2.dex */
public final class ejq<T> extends le6<T> {
    public final ImEngineUnrecoverableException b;
    public final e1w<T> c;

    public ejq(ImEngineUnrecoverableException imEngineUnrecoverableException, e1w<T> e1wVar) {
        this.b = imEngineUnrecoverableException;
        this.c = e1wVar;
        d(e1wVar);
    }

    @Override // xsna.le6
    public final T e(w2w w2wVar) {
        throw this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejq)) {
            return false;
        }
        ejq ejqVar = (ejq) obj;
        return epx.f(this.b, ejqVar.b) && epx.f(this.c, ejqVar.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "FailedImEngineCmd(reason=" + this.b + ", delegate=" + this.c + ')';
    }
}
