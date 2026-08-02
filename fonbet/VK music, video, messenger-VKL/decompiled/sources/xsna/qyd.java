package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.vk.clips.editor.templates.impl.player.MusicPlayerState;
import com.vk.dto.clips.music.ClipsEditorMusicTrack;
import xsna.y7f;

/* compiled from: ClipsEditorMusicPlayer.kt */
/* loaded from: classes16.dex */
public final class qyd {
    public final som0 a;
    public ClipsEditorMusicTrack b;
    public int c;
    public int d;
    public int e;
    public int f;
    public long g;
    public boolean h;
    public boolean i;
    public final Handler j;

    public qyd(Context context, xsi xsiVar, y7f.k kVar) {
        som0 som0Var = new som0(context);
        this.a = som0Var;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1L;
        this.j = new Handler(Looper.getMainLooper());
        xsiVar.a(new io.reactivex.rxjava3.internal.operators.observable.c0(((q850) som0Var.b).e.a0(io.reactivex.rxjava3.android.schedulers.a.b()).U(new pr(new u4u(15), 27)), io.reactivex.rxjava3.internal.functions.a.d, new gsa(this, 1)).subscribe(new pf1(new ng3(6, this, kVar), 9)));
    }

    public final void a(long j, boolean z) {
        ClipsEditorMusicTrack clipsEditorMusicTrack;
        if (this.c < 0) {
            return;
        }
        this.i = false;
        b(Long.valueOf(j));
        int i = this.c;
        int max = Math.max(i, (i - this.e) + ((int) j));
        som0 som0Var = this.a;
        if (som0Var.p(max) || !z) {
            return;
        }
        if (t850.a(((q850) som0Var.b).i) == MusicPlayerState.STOPPED && (clipsEditorMusicTrack = this.b) != null) {
            int i2 = this.c;
            int i3 = this.d;
            int i4 = this.e;
            this.j.removeCallbacksAndMessages(null);
            this.b = clipsEditorMusicTrack;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            ((q850) som0Var.b).G(hxd.c(clipsEditorMusicTrack), i2, i3);
        }
        this.f = max;
    }

    public final void b(Long l) {
        this.g = l.longValue() + (this.c - this.e);
    }

    public final void c(final boolean z) {
        boolean z2 = this.h;
        som0 som0Var = this.a;
        if (!z2) {
            ((q850) som0Var.b).d.g(z);
            return;
        }
        Thread currentThread = Thread.currentThread();
        Handler handler = this.j;
        if (!epx.f(currentThread, handler.getLooper().getThread())) {
            handler.post(new Runnable() { // from class: xsna.pyd
                @Override // java.lang.Runnable
                public final void run() {
                    qyd.this.c(z);
                }
            });
            return;
        }
        handler.removeCallbacksAndMessages(null);
        if (!z) {
            if (z) {
                return;
            }
            ((q850) som0Var.b).d.g(false);
            return;
        }
        long j = this.g;
        if (j > this.d) {
            return;
        }
        long j2 = this.c;
        if (j >= j2) {
            ((q850) som0Var.b).d.g(true);
            handler.postDelayed(new wk(this, 6), this.d - this.g);
        } else {
            long j3 = (int) (j2 - j);
            handler.postDelayed(new r44(this, 8), j3);
            handler.postDelayed(new kv3(this, 4), (j3 + this.d) - this.c);
        }
    }
}
