package xsna;

import android.os.Handler;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class dya0 implements izs {
    public final /* synthetic */ com.vk.music.player.playback.c b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ izs f;

    public /* synthetic */ dya0(com.vk.music.player.playback.c cVar, int i, int i2, int i3, izs izsVar) {
        this.b = cVar;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        final com.vk.music.player.playback.c cVar = this.b;
        Handler handler = cVar.k;
        final int i = this.c;
        final int i2 = this.d;
        final int i3 = this.e;
        final izs izsVar = this.f;
        handler.post(new Runnable() { // from class: xsna.aya0
            @Override // java.lang.Runnable
            public final void run() {
                int i4 = i + 1;
                com.vk.music.player.playback.c cVar2 = com.vk.music.player.playback.c.this;
                int i5 = i2;
                int i6 = i3;
                izs izsVar2 = izsVar;
                if (i4 == i6) {
                    cVar2.F(i5 % 250, izsVar2, false);
                } else {
                    cVar2.F(250, new dya0(cVar2, i4, i5, i6, izsVar2), false);
                }
            }
        });
        return s3q0.a;
    }
}
