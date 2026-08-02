package defpackage;

import androidx.media3.common.PlaybackException;

/* loaded from: classes10.dex */
public final /* synthetic */ class h5h implements ruy {
    public final /* synthetic */ int a;
    public final /* synthetic */ h42 b;
    public final /* synthetic */ PlaybackException c;

    public /* synthetic */ h5h(h42 h42Var, PlaybackException playbackException, int i) {
        this.a = i;
        this.b = h42Var;
        this.c = playbackException;
    }

    @Override // defpackage.ruy
    public final void invoke(Object obj) {
        int i = this.a;
        PlaybackException playbackException = this.c;
        h42 h42Var = this.b;
        j42 j42Var = (j42) obj;
        switch (i) {
            case 0:
                j42Var.onPlayerErrorChanged(h42Var, playbackException);
                break;
            default:
                j42Var.onPlayerError(h42Var, playbackException);
                break;
        }
    }
}
