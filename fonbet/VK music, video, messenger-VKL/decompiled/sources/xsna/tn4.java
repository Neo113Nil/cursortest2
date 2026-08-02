package xsna;

import androidx.media3.exoplayer.source.j;
import com.vk.music.player.PauseReason;
import com.vk.music.playerservice.api.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class tn4 implements a.b, j7j {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tn4(int i, PauseReason pauseReason, Runnable runnable, String str) {
        this.b = i;
        this.c = pauseReason;
        this.d = runnable;
        this.e = str;
    }

    @Override // com.vk.music.playerservice.api.a.b
    public void a(kza0 kza0Var) {
        kza0Var.K(this.b, (PauseReason) this.c, (Runnable) this.d, (String) this.e);
    }

    @Override // xsna.j7j
    public void accept(Object obj) {
        j.a aVar = (j.a) this.c;
        ((androidx.media3.exoplayer.source.j) obj).F(aVar.a, aVar.b, (bpz) this.d, (pr10) this.e, this.b);
    }

    public /* synthetic */ tn4(j.a aVar, bpz bpzVar, pr10 pr10Var, int i) {
        this.c = aVar;
        this.d = bpzVar;
        this.e = pr10Var;
        this.b = i;
    }
}
