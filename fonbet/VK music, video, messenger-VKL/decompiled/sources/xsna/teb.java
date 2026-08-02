package xsna;

/* compiled from: ChannelsCountersObserverImpl.kt */
/* loaded from: classes.dex */
public final class teb implements seb {
    public final d1w a;
    public final iv3 b;
    public final f9w c;

    public teb(d1w d1wVar, iv3 iv3Var, f9w f9wVar) {
        this.a = d1wVar;
        this.b = iv3Var;
        this.c = f9wVar;
    }

    @Override // xsna.seb
    public final reb create() {
        return new veb(this.a, this.b, this.c);
    }
}
