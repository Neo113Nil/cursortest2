package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.music.haptic.MusicHapticEvent;
import xsna.i940;
import xsna.qy40;

/* compiled from: MusicPlayerFeature.kt */
/* loaded from: classes3.dex */
public final class sw40 implements i940.c {
    public final /* synthetic */ rw40 a;

    public sw40(rw40 rw40Var) {
        this.a = rw40Var;
    }

    @Override // xsna.i940.c
    public final void a(Throwable th) {
        rw40 rw40Var = this.a;
        f4z f4zVar = rw40Var.x;
        f4z f4zVar2 = rw40Var.w;
        if ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == -1) {
            f4zVar2.b(qy40.a.f.b);
            f4zVar.b(MusicHapticEvent.ERROR);
        } else {
            f4zVar2.b(qy40.a.b.b);
            f4zVar.b(MusicHapticEvent.ERROR);
        }
    }

    @Override // xsna.i940.c
    public final void b() {
        this.a.x.b(MusicHapticEvent.SUCCESS);
    }
}
