package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.Playlist;
import java.util.HashMap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a2e implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a2e(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                c2e c2eVar = (c2e) this.c;
                kym0 kym0Var = (kym0) obj;
                c2eVar.b.b(new buz(12, new com.vk.movika.sdk.base.observable.m(c2eVar, 25), new fy7(c2eVar, kym0Var.b(), kym0Var.a(), 1)), false);
                break;
            case 1:
                jq40 jq40Var = (jq40) this.c;
                Playlist playlist = ((n8b0) obj).a;
                DownloadingState downloadingState = playlist.H;
                if ((downloadingState instanceof DownloadingState.Downloaded) || (downloadingState instanceof DownloadingState.NotLoaded)) {
                    jq40Var.j.remove(playlist.Ib());
                    String Hb = playlist.Hb();
                    if (Hb != null) {
                        jq40Var.j.remove(Hb);
                    }
                } else {
                    jq40Var.j.put(playlist.Ib(), playlist.H);
                    String Hb2 = playlist.Hb();
                    if (Hb2 != null) {
                        jq40Var.j.put(Hb2, playlist.H);
                    }
                }
                break;
            default:
                ((ayx0) this.c).a((HashMap) obj);
                break;
        }
        return s3q0.a;
    }
}
