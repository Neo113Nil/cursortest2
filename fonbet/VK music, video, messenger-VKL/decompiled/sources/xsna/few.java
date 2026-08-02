package xsna;

import android.content.Context;
import android.media.AudioManager;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.vk.log.L;
import com.vk.music.player.PauseReason;
import kotlin.Result;
import xsna.k840;
import xsna.n6q0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class few implements Runnable {
    public final /* synthetic */ int b;

    public /* synthetic */ few(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object failure;
        f370 f370Var;
        Object failure2;
        switch (this.b) {
            case 0:
                try {
                    n6q0.b bVar = hew.h;
                    if (bVar != null) {
                        n6q0 n6q0Var = bVar.a;
                        ViewParent parent = n6q0Var.getParent();
                        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                        if (viewGroup != null) {
                            viewGroup.removeView(n6q0Var);
                        }
                        failure = s3q0.a;
                    } else {
                        failure = null;
                    }
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null && (f370Var = hew.e) != null) {
                    f370Var.n(a);
                }
                hew.h = null;
                d6q0.f(hew.b);
                break;
            default:
                atw0.a.getClass();
                Context context = null;
                atw0.c = null;
                try {
                    u2b0 b = k840.a.g().b();
                    if (!b.h()) {
                        r6m.a.getClass();
                        Context context2 = r6m.e;
                        if (context2 != null) {
                            context = context2;
                        }
                        if (((AudioManager) context.getSystemService("audio")).isMusicActive()) {
                        }
                    }
                    b.t1(3, PauseReason.FOCUS_LOST, new x9o0(1));
                    failure2 = s3q0.a;
                } catch (Throwable th2) {
                    failure2 = new Result.Failure(th2);
                }
                Throwable a2 = Result.a(failure2);
                if (a2 != null) {
                    L.f("VoipMusicPlaybackFallback", "Failed to pause music playback on incoming call fallback", a2);
                    break;
                }
                break;
        }
    }
}
