package xsna;

import com.vk.video.ui.upload.impl.videoviewer.presentation.feature.entity.VideoViewerState;
import com.vungle.ads.internal.protos.Sdk;
import one.video.player.OneVideoPlayer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class tf5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tf5(long j, Object obj, int i) {
        this.b = i;
        this.c = j;
        this.d = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                long j = this.c;
                String str = (String) this.d;
                qyg0 V0 = ((hyg0) obj).V0("UPDATE auto_download_track SET size_in_bytes = ? WHERE mid = ?");
                try {
                    V0.bindLong(1, j);
                    V0.D3(2, str);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 1:
                xk80 xk80Var = (xk80) this.d;
                return VideoViewerState.a((VideoViewerState) obj, null, null, xk80Var.getState() == OneVideoPlayer.State.PLAYING, xk80Var.getDuration(), this.c, 3);
            default:
                oio.P((oio) obj, this.c, 0L, 0L, ((Number) ((wh50) this.d).getValue()).floatValue(), null, 0, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                return s3q0.a;
        }
    }

    public /* synthetic */ tf5(xk80 xk80Var, long j) {
        this.b = 1;
        this.d = xk80Var;
        this.c = j;
    }
}
