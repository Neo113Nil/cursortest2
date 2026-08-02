package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class c5h implements ruy {
    public final /* synthetic */ int a;
    public final /* synthetic */ h42 b;
    public final /* synthetic */ int c;

    public /* synthetic */ c5h(h42 h42Var, int i, int i2) {
        this.a = i2;
        this.b = h42Var;
        this.c = i;
    }

    @Override // defpackage.ruy
    public final void invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        h42 h42Var = this.b;
        j42 j42Var = (j42) obj;
        switch (i) {
            case 0:
                j42Var.onDrmSessionAcquired(h42Var);
                j42Var.onDrmSessionAcquired(h42Var, i2);
                break;
            case 1:
                j42Var.onTimelineChanged(h42Var, i2);
                break;
            case 2:
                j42Var.onPlaybackSuppressionReasonChanged(h42Var, i2);
                break;
            case 3:
                j42Var.onPlaybackStateChanged(h42Var, i2);
                break;
            case 4:
                j42Var.onRepeatModeChanged(h42Var, i2);
                break;
            default:
                j42Var.onAudioSessionIdChanged(h42Var, i2);
                break;
        }
    }
}
