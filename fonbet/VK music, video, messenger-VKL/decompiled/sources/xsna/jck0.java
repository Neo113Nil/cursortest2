package xsna;

import android.os.Handler;
import android.os.Looper;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlayerMode;
import com.vk.music.player.e;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.LazyThreadSafetyMode;
import xsna.kck0;

/* compiled from: SnippetPlayerUiCommunicator.kt */
/* loaded from: classes3.dex */
public final class jck0 implements kck0 {
    public final eck0 a;
    public final LinkedHashSet b = new LinkedHashSet();
    public final Handler c = new Handler(Looper.getMainLooper());
    public final Object d;
    public final Object e;

    /* compiled from: SnippetPlayerUiCommunicator.kt */
    public final class a extends e.a {

        /* compiled from: SnippetPlayerUiCommunicator.kt */
        /* renamed from: xsna.jck0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3114a {
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

        public a() {
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, com.vk.music.player.f fVar) {
            jck0 jck0Var = jck0.this;
            LinkedHashSet linkedHashSet = jck0Var.b;
            if (((u2b0) jck0Var.d.getValue()).x1() != PlayerMode.ADVERTISEMENT) {
                jck0Var.c.post(new q86(jck0Var, 9));
                return;
            }
            int i = playState == null ? -1 : C3114a.$EnumSwitchMapping$0[playState.ordinal()];
            if (i == 1 || i == 2) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((kck0.a) it.next()).s1(true);
                }
            } else {
                if (i != 3) {
                    return;
                }
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    ((kck0.a) it2.next()).n4(0L, true);
                }
            }
        }
    }

    public jck0(eck0 eck0Var) {
        this.a = eck0Var;
        gwd0 gwd0Var = new gwd0(5);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, gwd0Var);
        this.e = msy.a(lazyThreadSafetyMode, new qkd0(this, 8));
    }

    @Override // xsna.kck0
    public final void a(adk0 adk0Var) {
        this.b.add(adk0Var);
    }

    @Override // xsna.kck0
    public final boolean b(MusicTrack musicTrack, String str) {
        return d(musicTrack, str) && this.a.c.getState().j();
    }

    @Override // xsna.kck0
    public final void c(adk0 adk0Var) {
        this.b.remove(adk0Var);
    }

    @Override // xsna.kck0
    public final boolean d(MusicTrack musicTrack, String str) {
        jx4 q = this.a.q();
        m80 m80Var = q instanceof m80 ? (m80) q : null;
        return m80Var != null && m80Var.b.equals(str) && m80Var.h.c.equals(musicTrack);
    }
}
