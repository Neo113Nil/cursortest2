package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import com.yandex.go.masstransit.sdk.camera.ml.b;

/* loaded from: classes4.dex */
public final class jeg0 implements i1k {
    public final /* synthetic */ int a;
    public final /* synthetic */ oz40 b;

    public /* synthetic */ jeg0(int i, oz40 oz40Var) {
        this.a = i;
        this.b = oz40Var;
    }

    @Override // defpackage.i1k
    public final void dispose() {
        int i = this.a;
        oz40 oz40Var = this.b;
        switch (i) {
            case 0:
                b bVar = (b) oz40Var.getValue();
                if (bVar != null) {
                    bVar.b(false);
                }
                b bVar2 = (b) oz40Var.getValue();
                if (bVar2 != null) {
                    bVar2.a();
                    break;
                }
                break;
            default:
                ExoPlayer exoPlayer = (ExoPlayer) oz40Var.getValue();
                if (exoPlayer != null) {
                    exoPlayer.release();
                }
                oz40Var.setValue(null);
                break;
        }
    }
}
