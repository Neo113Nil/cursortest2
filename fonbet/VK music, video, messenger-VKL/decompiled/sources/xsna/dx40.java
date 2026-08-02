package xsna;

import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.PlayerAction;
import java.util.List;
import xsna.cz40;
import xsna.fx40;
import xsna.ry40;

/* compiled from: MusicPlayerHelper.kt */
/* loaded from: classes3.dex */
public interface dx40 extends ex40 {
    public static final a a = a.a;

    boolean f(PlaybackActionMeta playbackActionMeta);

    int getAudioSessionId();

    int getBufferedPercentage();

    long getCurrentPosition();

    ry40 getState();

    boolean isRunning();

    boolean j(int i, PlaybackActionMeta playbackActionMeta);

    List<PlayerAction> k();

    void p(px40 px40Var);

    boolean pause(int i);

    void release(int i);

    void stop(int i);

    void u(kx40 kx40Var);

    boolean z();

    /* compiled from: MusicPlayerHelper.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final dx40 STUB = new C2767a();

        public final dx40 getSTUB() {
            return STUB;
        }

        /* compiled from: MusicPlayerHelper.kt */
        /* renamed from: xsna.dx40$a$a, reason: collision with other inner class name */
        public static final class C2767a implements dx40 {
            public float c;
            public final float b = 1.0f;
            public final x6b0 d = x6b0.d.getSTUB();
            public final fx40.a e = new fx40.a(null, null, null, null, 127);

            @Override // xsna.ex40
            public final float C() {
                return this.c;
            }

            @Override // xsna.ex40
            public final x6b0 H() {
                return this.d;
            }

            @Override // xsna.ex40
            public final float b() {
                return this.b;
            }

            @Override // xsna.ex40
            public final cz40 c() {
                return cz40.b.a.a;
            }

            @Override // xsna.dx40
            public final boolean f(PlaybackActionMeta playbackActionMeta) {
                return false;
            }

            @Override // xsna.ex40
            public final boolean g() {
                return false;
            }

            @Override // xsna.dx40
            public final int getAudioSessionId() {
                return 0;
            }

            @Override // xsna.dx40
            public final int getBufferedPercentage() {
                return 0;
            }

            @Override // xsna.ex40
            public final fx40 getConfig() {
                return this.e;
            }

            @Override // xsna.dx40
            public final long getCurrentPosition() {
                return 0L;
            }

            @Override // xsna.dx40
            public final ry40 getState() {
                return ry40.c.d;
            }

            @Override // xsna.ex40
            public final String h() {
                return "";
            }

            @Override // xsna.dx40
            public final boolean isRunning() {
                return false;
            }

            @Override // xsna.dx40
            public final boolean j(int i, PlaybackActionMeta playbackActionMeta) {
                return false;
            }

            @Override // xsna.dx40
            public final boolean pause(int i) {
                return false;
            }

            @Override // xsna.ex40
            public final void s(float f) {
                this.c = f;
            }

            @Override // xsna.ex40
            public final boolean x() {
                return false;
            }

            @Override // xsna.dx40
            public final boolean z() {
                return false;
            }

            @Override // xsna.dx40
            public final void p(px40 px40Var) {
            }

            @Override // xsna.dx40
            public final void release(int i) {
            }

            @Override // xsna.dx40
            public final void stop(int i) {
            }

            @Override // xsna.dx40
            public final void u(kx40 kx40Var) {
            }
        }
    }
}
