package xsna;

import com.vk.music.player.PlayState;
import com.vk.music.player.e;
import com.vk.music.view.MusicRoundPlayView;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MusicPlayViewController.kt */
/* loaded from: classes3.dex */
public final class bv40 {
    public final u2b0 a;
    public final FunctionReferenceImpl b;
    public MusicRoundPlayView c;
    public final b d = new b();

    /* compiled from: MusicPlayViewController.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayState.values().length];
            try {
                iArr[PlayState.PAUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayState.STOPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayState.PLAYING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: MusicPlayViewController.kt */
    public static final class b extends e.a {
        public b() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, com.vk.music.player.f fVar) {
            bv40.this.d(playState);
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void onError(String str) {
            MusicRoundPlayView musicRoundPlayView = bv40.this.c;
            if (musicRoundPlayView != null) {
                musicRoundPlayView.b(MusicRoundPlayView.State.PAUSE);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bv40(u2b0 u2b0Var, gzs<Boolean> gzsVar) {
        this.a = u2b0Var;
        this.b = (FunctionReferenceImpl) gzsVar;
    }

    public final void a(MusicRoundPlayView musicRoundPlayView) {
        this.c = musicRoundPlayView;
        this.a.P0(this.d, false);
    }

    public final void b() {
        this.c = null;
        this.a.n0(this.d);
    }

    public final void c() {
        MusicRoundPlayView musicRoundPlayView = this.c;
        if (musicRoundPlayView != null) {
            musicRoundPlayView.b(MusicRoundPlayView.State.BUFFERING);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    public final void d(PlayState playState) {
        MusicRoundPlayView musicRoundPlayView;
        MusicRoundPlayView musicRoundPlayView2;
        if (!((Boolean) this.b.invoke()).booleanValue()) {
            if (this.a.m0() == PlayState.IDLE || (musicRoundPlayView2 = this.c) == null) {
                return;
            }
            musicRoundPlayView2.b(MusicRoundPlayView.State.PAUSE);
            return;
        }
        int i = playState == null ? -1 : a.$EnumSwitchMapping$0[playState.ordinal()];
        if (i == 1 || i == 2) {
            MusicRoundPlayView musicRoundPlayView3 = this.c;
            if (musicRoundPlayView3 != null) {
                musicRoundPlayView3.b(MusicRoundPlayView.State.PAUSE);
                return;
            }
            return;
        }
        if (i == 3 && (musicRoundPlayView = this.c) != null) {
            musicRoundPlayView.b(MusicRoundPlayView.State.PLAY);
        }
    }

    public final void e() {
        d(this.a.m0());
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    public final void f() {
        if (this.a.m0().h() && ((Boolean) this.b.invoke()).booleanValue()) {
            MusicRoundPlayView musicRoundPlayView = this.c;
            if (musicRoundPlayView != null) {
                musicRoundPlayView.b(MusicRoundPlayView.State.PLAY);
                return;
            }
            return;
        }
        MusicRoundPlayView musicRoundPlayView2 = this.c;
        if (musicRoundPlayView2 != null) {
            musicRoundPlayView2.b(MusicRoundPlayView.State.PAUSE);
        }
    }
}
