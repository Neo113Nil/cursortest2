package defpackage;

/* loaded from: classes9.dex */
public final class ike implements tse {
    public final fse a;

    public ike(fse fseVar) {
        this.a = fseVar;
    }

    @Override // defpackage.tse
    public final fse getCoroutineContext() {
        return this.a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.a + ')';
    }
}
