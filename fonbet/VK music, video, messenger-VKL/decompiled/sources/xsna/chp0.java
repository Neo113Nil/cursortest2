package xsna;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.k;
import androidx.media3.exoplayer.source.i;

/* compiled from: TrackSelector.java */
/* loaded from: classes12.dex */
public abstract class chp0 {

    @Nullable
    public b a;

    @Nullable
    public p06 b;

    /* compiled from: TrackSelector.java */
    public interface a {
    }

    /* compiled from: TrackSelector.java */
    public interface b {
        void onTrackSelectionsInvalidated();
    }

    public ahp0 a() {
        return ahp0.y;
    }

    @Nullable
    public k.a b() {
        return null;
    }

    public final void c(b bVar, p06 p06Var) {
        fxc0.z(this.a == null);
        this.a = bVar;
        this.b = p06Var;
    }

    public boolean d() {
        return false;
    }

    public abstract void e(@Nullable Object obj);

    public void f() {
        this.a = null;
        this.b = null;
    }

    public abstract ehp0 g(androidx.media3.exoplayer.k[] kVarArr, qfp0 qfp0Var, i.b bVar, ewo0 ewo0Var) throws ExoPlaybackException;

    public void h(nc4 nc4Var) {
    }

    public void i(ahp0 ahp0Var) {
    }
}
