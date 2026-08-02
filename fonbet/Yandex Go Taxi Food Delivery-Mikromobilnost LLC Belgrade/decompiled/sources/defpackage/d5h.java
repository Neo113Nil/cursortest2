package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class d5h implements ruy {
    public final /* synthetic */ int a;
    public final /* synthetic */ h42 b;
    public final /* synthetic */ re10 c;

    public /* synthetic */ d5h(h42 h42Var, re10 re10Var, int i) {
        this.a = i;
        this.b = h42Var;
        this.c = re10Var;
    }

    @Override // defpackage.ruy
    public final void invoke(Object obj) {
        int i = this.a;
        re10 re10Var = this.c;
        h42 h42Var = this.b;
        j42 j42Var = (j42) obj;
        switch (i) {
            case 0:
                j42Var.onMediaMetadataChanged(h42Var, re10Var);
                break;
            default:
                j42Var.onPlaylistMetadataChanged(h42Var, re10Var);
                break;
        }
    }
}
