package xsna;

/* compiled from: ChannelFlow.kt */
/* loaded from: classes8.dex */
public final class aok0<T> implements spj<T>, awj {
    public final spj<T> b;
    public final kotlin.coroutines.d c;

    /* JADX WARN: Multi-variable type inference failed */
    public aok0(spj<? super T> spjVar, kotlin.coroutines.d dVar) {
        this.b = spjVar;
        this.c = dVar;
    }

    @Override // xsna.awj
    public final awj getCallerFrame() {
        spj<T> spjVar = this.b;
        if (spjVar instanceof awj) {
            return (awj) spjVar;
        }
        return null;
    }

    @Override // xsna.spj
    public final kotlin.coroutines.d getContext() {
        return this.c;
    }

    @Override // xsna.spj
    public final void resumeWith(Object obj) {
        this.b.resumeWith(obj);
    }
}
