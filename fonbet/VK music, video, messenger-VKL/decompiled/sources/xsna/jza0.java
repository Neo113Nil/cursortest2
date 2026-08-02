package xsna;

import android.util.SparseBooleanArray;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.List;
import java.util.Objects;
import xsna.vnr;

/* compiled from: Player.java */
/* loaded from: classes12.dex */
public interface jza0 {

    /* compiled from: Player.java */
    public static final class a {
        public final vnr a;

        /* compiled from: Player.java */
        /* renamed from: xsna.jza0$a$a, reason: collision with other inner class name */
        public static final class C3154a {
            public final vnr.a a = new vnr.a();

            public final void a(int i, boolean z) {
                vnr.a aVar = this.a;
                if (z) {
                    aVar.a(i);
                } else {
                    aVar.getClass();
                }
            }
        }

        static {
            new SparseBooleanArray();
            fxc0.z(!false);
            y2r0.L(0);
        }

        public a(vnr vnrVar) {
            this.a = vnrVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.a.equals(((a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }
    }

    /* compiled from: Player.java */
    public static final class c {

        @Nullable
        public final Object a;
        public final int b;

        @Nullable
        public final kr10 c;

        @Nullable
        public final Object d;
        public final int e;
        public final long f;
        public final long g;
        public final int h;
        public final int i;

        static {
            cq.h(0, 1, 2, 3, 4);
            y2r0.L(5);
            y2r0.L(6);
        }

        public c(@Nullable Object obj, int i, @Nullable kr10 kr10Var, @Nullable Object obj2, int i2, long j, long j2, int i3, int i4) {
            fxc0.p(i >= 0);
            fxc0.p(i2 >= 0);
            this.a = obj;
            this.b = i;
            this.c = kr10Var;
            this.d = obj2;
            this.e = i2;
            this.f = j;
            this.g = j2;
            this.h = i3;
            this.i = i4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (this.b == cVar.b && this.e == cVar.e && this.f == cVar.f && this.g == cVar.g && this.h == cVar.h && this.i == cVar.i && Objects.equals(this.c, cVar.c) && Objects.equals(this.a, cVar.a) && Objects.equals(this.d, cVar.d)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
        }

        public final String toString() {
            String str = "mediaItem=" + this.b + ", period=" + this.e + ", pos=" + this.f;
            int i = this.h;
            if (i == -1) {
                return str;
            }
            StringBuilder b = ho8.b(str, ", contentPos=");
            b.append(this.g);
            b.append(", adGroup=");
            b.append(i);
            b.append(", ad=");
            b.append(this.i);
            return b.toString();
        }
    }

    long a();

    @Nullable
    ExoPlaybackException b();

    void c(b bVar);

    boolean d();

    boolean e();

    void f(List list);

    int g();

    long getBufferedPosition();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    ewo0 getCurrentTimeline();

    long getDuration();

    boolean getPlayWhenReady();

    int getPlaybackState();

    int getRepeatMode();

    void getShuffleModeEnabled();

    float getVolume();

    boolean h();

    boolean isPlaying();

    boolean isPlayingAd();

    dip0 j();

    void k();

    void l(b bVar);

    boolean m();

    void n();

    boolean o();

    a p();

    void prepare();

    int s();

    void setPlayWhenReady(boolean z);

    void setVideoSurfaceView(@Nullable SurfaceView surfaceView);

    void setVideoTextureView(@Nullable TextureView textureView);

    void setVolume(float f);

    void stop();

    /* compiled from: Player.java */
    /* loaded from: classes.dex */
    public interface b {
        default void M() {
        }

        default void onRenderedFirstFrame() {
        }

        default void E(a aVar) {
        }

        default void I(@Nullable PlaybackException playbackException) {
        }

        default void N(dip0 dip0Var) {
        }

        default void a(int i) {
        }

        default void a0(nc4 nc4Var) {
        }

        default void d(ukk ukkVar) {
        }

        default void k(fi20 fi20Var) {
        }

        @Deprecated
        default void onCues(List<rkk> list) {
        }

        default void onIsLoadingChanged(boolean z) {
        }

        default void onIsPlayingChanged(boolean z) {
        }

        @Deprecated
        default void onLoadingChanged(boolean z) {
        }

        default void onPlaybackStateChanged(int i) {
        }

        default void onPlaybackSuppressionReasonChanged(int i) {
        }

        default void onPlayerError(PlaybackException playbackException) {
        }

        default void onRepeatModeChanged(int i) {
        }

        default void onSkipSilenceEnabledChanged(boolean z) {
        }

        default void onVideoSizeChanged(xgt0 xgt0Var) {
        }

        default void onVolumeChanged(float f) {
        }

        default void v(jwa0 jwa0Var) {
        }

        default void y(vr10 vr10Var) {
        }

        default void f0(@Nullable kr10 kr10Var, int i) {
        }

        default void onPlayWhenReadyChanged(boolean z, int i) {
        }

        @Deprecated
        default void onPlayerStateChanged(boolean z, int i) {
        }

        default void onSurfaceSizeChanged(int i, int i2) {
        }

        default void z(ewo0 ewo0Var, int i) {
        }

        default void D(int i, c cVar, c cVar2) {
        }
    }
}
