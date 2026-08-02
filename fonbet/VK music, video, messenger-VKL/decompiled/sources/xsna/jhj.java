package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ContentItemCallbacks.kt */
/* loaded from: classes5.dex */
public final class jhj {
    public final FunctionReferenceImpl a;
    public final FunctionReferenceImpl b;
    public final FunctionReferenceImpl c;
    public final FunctionReferenceImpl d;
    public final FunctionReferenceImpl e;

    public jhj() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jhj(izs izsVar, izs izsVar2, izs izsVar3, izs izsVar4, izs izsVar5) {
        this.a = (FunctionReferenceImpl) izsVar;
        this.b = (FunctionReferenceImpl) izsVar2;
        this.c = (FunctionReferenceImpl) izsVar3;
        this.d = (FunctionReferenceImpl) izsVar4;
        this.e = (FunctionReferenceImpl) izsVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhj)) {
            return false;
        }
        jhj jhjVar = (jhj) obj;
        return epx.f(this.a, jhjVar.a) && epx.f(this.b, jhjVar.b) && epx.f(this.c, jhjVar.c) && epx.f(this.d, jhjVar.d) && epx.f(this.e, jhjVar.e);
    }

    public final int hashCode() {
        return (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "ContentItemCallbacks(onScroll=" + this.a + ", onScrolledToBottom=" + this.b + ", onLoadRetryClick=" + this.c + ", onLoadMoreRetryClick=" + this.d + ", onAddContentClick=" + this.e + ", onInfoBlockClick=null)";
    }
}
