package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.c;
import kotlin.coroutines.d;
import xsna.c8i;
import xsna.spj;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes11.dex */
public abstract class ContinuationImpl extends BaseContinuationImpl {
    private final d _context;
    private transient spj<Object> intercepted;

    public ContinuationImpl(spj<Object> spjVar, d dVar) {
        super(spjVar);
        this._context = dVar;
    }

    @Override // xsna.spj
    public d getContext() {
        return this._context;
    }

    public final spj<Object> intercepted() {
        spj<Object> spjVar = this.intercepted;
        if (spjVar == null) {
            c cVar = (c) getContext().get(c.a.b);
            spjVar = cVar != null ? cVar.L(this) : this;
            this.intercepted = spjVar;
        }
        return spjVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        spj<?> spjVar = this.intercepted;
        if (spjVar != null && spjVar != this) {
            ((c) getContext().get(c.a.b)).v(spjVar);
        }
        this.intercepted = c8i.b;
    }

    public ContinuationImpl(spj<Object> spjVar) {
        this(spjVar, spjVar != null ? spjVar.getContext() : null);
    }
}
