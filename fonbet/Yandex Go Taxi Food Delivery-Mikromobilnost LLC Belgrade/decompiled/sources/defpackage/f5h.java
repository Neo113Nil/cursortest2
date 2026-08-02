package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class f5h implements ruy {
    public final /* synthetic */ int a;
    public final /* synthetic */ h42 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ f5h(h42 h42Var, int i, boolean z) {
        this.a = i;
        this.b = h42Var;
        this.c = z;
    }

    @Override // defpackage.ruy
    public final void invoke(Object obj) {
        int i = this.a;
        boolean z = this.c;
        h42 h42Var = this.b;
        j42 j42Var = (j42) obj;
        switch (i) {
            case 0:
                j42Var.onLoadingChanged(h42Var, z);
                j42Var.onIsLoadingChanged(h42Var, z);
                break;
            case 1:
                j42Var.onIsPlayingChanged(h42Var, z);
                break;
            case 2:
                j42Var.onShuffleModeChanged(h42Var, z);
                break;
            default:
                j42Var.onSkipSilenceEnabledChanged(h42Var, z);
                break;
        }
    }
}
