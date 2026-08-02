package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class p4h implements ruy {
    public final /* synthetic */ int a;
    public final /* synthetic */ h42 b;
    public final /* synthetic */ String c;

    public /* synthetic */ p4h(h42 h42Var, String str, int i) {
        this.a = i;
        this.b = h42Var;
        this.c = str;
    }

    @Override // defpackage.ruy
    public final void invoke(Object obj) {
        int i = this.a;
        String str = this.c;
        h42 h42Var = this.b;
        j42 j42Var = (j42) obj;
        switch (i) {
            case 0:
                j42Var.onVideoDecoderReleased(h42Var, str);
                break;
            default:
                j42Var.onAudioDecoderReleased(h42Var, str);
                break;
        }
    }
}
