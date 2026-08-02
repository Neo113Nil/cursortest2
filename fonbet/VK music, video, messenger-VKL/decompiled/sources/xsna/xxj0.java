package xsna;

/* compiled from: AnimatedContent.kt */
/* loaded from: classes11.dex */
public final class xxj0 implements wxj0 {
    public final wzs<q9x, q9x, phr<q9x>> a;

    public xxj0(wzs wzsVar) {
        this.a = wzsVar;
    }

    @Override // xsna.wxj0
    public final boolean a() {
        return true;
    }

    @Override // xsna.wxj0
    public final phr<q9x> b(long j, long j2) {
        return this.a.invoke(new q9x(j), new q9x(j2));
    }
}
