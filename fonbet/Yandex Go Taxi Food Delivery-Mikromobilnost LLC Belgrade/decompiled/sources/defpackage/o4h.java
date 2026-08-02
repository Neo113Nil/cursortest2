package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class o4h implements ruy {
    public final /* synthetic */ int a;
    public final /* synthetic */ h42 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long w;
    public final /* synthetic */ long x;

    public /* synthetic */ o4h(h42 h42Var, String str, long j, long j2, int i) {
        this.a = i;
        this.b = h42Var;
        this.c = str;
        this.w = j;
        this.x = j2;
    }

    @Override // defpackage.ruy
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                j42 j42Var = (j42) obj;
                h42 h42Var = this.b;
                String str = this.c;
                long j = this.w;
                j42Var.onAudioDecoderInitialized(h42Var, str, j);
                j42Var.onAudioDecoderInitialized(h42Var, str, this.x, j);
                break;
            default:
                j42 j42Var2 = (j42) obj;
                h42 h42Var2 = this.b;
                String str2 = this.c;
                long j2 = this.w;
                j42Var2.onVideoDecoderInitialized(h42Var2, str2, j2);
                j42Var2.onVideoDecoderInitialized(h42Var2, str2, this.x, j2);
                break;
        }
    }
}
