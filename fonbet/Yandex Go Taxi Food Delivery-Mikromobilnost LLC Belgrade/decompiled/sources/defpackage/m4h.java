package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class m4h implements ruy {
    public final /* synthetic */ int a;
    public final /* synthetic */ h42 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long w;
    public final /* synthetic */ long x;

    public /* synthetic */ m4h(h42 h42Var, int i, long j, long j2, int i2) {
        this.a = i2;
        this.b = h42Var;
        this.c = i;
        this.w = j;
        this.x = j2;
    }

    @Override // defpackage.ruy
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((j42) obj).onBandwidthEstimate(this.b, this.c, this.w, this.x);
                break;
            default:
                ((j42) obj).onAudioUnderrun(this.b, this.c, this.w, this.x);
                break;
        }
    }
}
