package kotlin.jvm.internal;

import java.io.Serializable;
import xsna.fpf0;
import xsna.h0t;
import xsna.hpf0;

/* compiled from: Lambda.kt */
/* loaded from: classes11.dex */
public abstract class Lambda<R> implements h0t<R>, Serializable {
    private final int arity;

    public Lambda(int i) {
        this.arity = i;
    }

    @Override // xsna.h0t
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        fpf0.a.getClass();
        return hpf0.a(this);
    }
}
