package defpackage;

/* loaded from: classes8.dex */
public final class cez0 implements tse {
    public final /* synthetic */ tse a;
    public final sls b;
    public volatile long c;

    public cez0(tse tseVar, long j, sls slsVar) {
        this.a = tseVar;
        this.b = slsVar;
        this.c = j;
    }

    @Override // defpackage.tse
    public final fse getCoroutineContext() {
        return this.a.getCoroutineContext();
    }
}
