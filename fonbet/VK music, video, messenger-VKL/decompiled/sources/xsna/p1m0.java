package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.vk.dto.music.MusicTrack;
import xsna.u850;

/* compiled from: StoryEditorMusicPlayer.kt */
/* loaded from: classes16.dex */
public final class p1m0 {
    public final q850 a;
    public MusicTrack b;
    public int c;
    public int d;
    public int e;
    public final Handler f;

    public p1m0(Context context, u440 u440Var, com.vk.movika.sdk.base.hooks.k kVar) {
        q850 q850Var = new q850(context);
        this.a = q850Var;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = new Handler(Looper.getMainLooper());
        u440Var.a(new io.reactivex.rxjava3.internal.operators.observable.c0(q850Var.e.a0(io.reactivex.rxjava3.android.schedulers.a.b()), io.reactivex.rxjava3.internal.functions.a.d, new w97(this, 4)).subscribe(new q440(new s1f0(2, this, kVar), 20)));
    }

    public final void a() {
        this.f.removeCallbacksAndMessages(null);
        q850 q850Var = this.a;
        if (!epx.f(q850Var.h(), u850.i.a)) {
            q850Var.stop(32);
        }
        bn40.f(new Object[0]);
        q850Var.d.e();
    }

    public final void b(boolean z) {
        this.a.d.g(z);
    }

    public final void c(MusicTrack musicTrack, int i, int i2, int i3) {
        this.f.removeCallbacksAndMessages(null);
        this.b = musicTrack;
        this.c = i;
        this.d = i3;
        this.a.G(musicTrack, i, i2);
    }

    public final void d() {
        this.f.removeCallbacksAndMessages(null);
        this.a.stop(26);
    }
}
