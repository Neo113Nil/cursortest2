package xsna;

import com.vk.music.player.PlayerTrack;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class bya0 implements izs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ com.vk.music.player.playback.c c;
    public final /* synthetic */ y1b0 d;
    public final /* synthetic */ String e;

    public /* synthetic */ bya0(boolean z, com.vk.music.player.playback.c cVar, y1b0 y1b0Var, String str) {
        this.b = z;
        this.c = cVar;
        this.d = y1b0Var;
        this.e = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z = this.b;
        com.vk.music.player.playback.c cVar = this.c;
        if (z) {
            izs<String, s3q0> izsVar = cVar.e;
            PlayerTrack playerTrack = cVar.i;
            izsVar.invoke(playerTrack != null ? playerTrack.f : null);
        } else {
            String str = this.e;
            if (str == null) {
                PlayerTrack b = cVar.q.b();
                if (b != null) {
                    r1 = b.f;
                }
            } else {
                r1 = str;
            }
            this.d.invoke(r1);
        }
        return s3q0.a;
    }
}
