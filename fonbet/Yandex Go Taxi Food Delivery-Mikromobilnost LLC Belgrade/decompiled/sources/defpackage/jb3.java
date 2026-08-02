package defpackage;

import android.media.MediaCodec;
import androidx.media3.exoplayer.mediacodec.a;
import androidx.media3.exoplayer.mediacodec.e;

/* loaded from: classes10.dex */
public final /* synthetic */ class jb3 implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ob10 b;
    public final /* synthetic */ pb10 c;

    public /* synthetic */ jb3(pb10 pb10Var, ob10 ob10Var, int i) {
        this.a = i;
        this.c = pb10Var;
        this.b = ob10Var;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        int i = this.a;
        pb10 pb10Var = this.c;
        switch (i) {
            case 0:
                this.b.onFrameRendered((a) pb10Var, j, j2);
                break;
            case 1:
                this.b.onFrameRendered((e) pb10Var, j, j2);
                break;
            case 2:
                this.b.onFrameRendered((tis0) pb10Var, j, j2);
                break;
            default:
                this.b.onFrameRendered((zxs0) pb10Var, j, j2);
                break;
        }
    }
}
