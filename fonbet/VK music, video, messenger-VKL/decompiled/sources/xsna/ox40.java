package xsna;

import android.content.Context;
import android.content.Intent;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.LoopMode;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.service.MusicPlayerAction;
import com.vk.music.playerservice.impl.PlayerService;
import java.util.ArrayList;
import xsna.k840;

/* compiled from: MusicPlayerIntents.kt */
/* loaded from: classes3.dex */
public final class ox40 {
    public static final tib a;
    public static final bpn0 b;

    static {
        y6l y6lVar = k840.d;
        if (y6lVar == null) {
            y6lVar = null;
        }
        y6lVar.getClass();
        a = new tib(PlayerService.class);
        b = new bpn0(new pr6(19));
    }

    public static final void a(vo0 vo0Var, String str, MusicPlaybackLaunchContext musicPlaybackLaunchContext, PlaybackActionMeta playbackActionMeta) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        tib tibVar = a;
        tibVar.getClass();
        Intent a2 = tibVar.a(context, MusicPlayerAction.ACTION_PLAY_NEXT, str);
        a2.putExtra("MUSIC_FILES", new ArrayList(vo0Var.b));
        StartPlaySource startPlaySource = vo0Var.a;
        a2.putExtra("MUSIC_SOURCE", startPlaySource != null ? startPlaySource : null);
        a2.putExtra("LAUNCH_CONTEXT", musicPlaybackLaunchContext.t());
        a2.putExtra("NEED_ADD_TO_AND", vo0Var.c);
        a2.putExtra("EXTRA_ACTION_META", playbackActionMeta);
        c(a2, true);
    }

    public static u2b0 b() {
        return (u2b0) b.getValue();
    }

    public static void c(Intent intent, boolean z) {
        if (z) {
            c45 c45Var = k840.a.k;
            if (c45Var == null) {
                c45Var = null;
            }
            c45Var.invoke(intent);
            return;
        }
        try {
            r6m.a.getClass();
            b4z.E(intent, r6m.b);
        } catch (IllegalStateException e) {
            bn40.d("PlayerIntents", e);
        }
    }

    public static final void d(String str) {
        if (b().isActive()) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            c(a.a(context, MusicPlayerAction.ACTION_LOAD_MORE_TRACKS, str), true);
        }
    }

    public static final void e(PlaybackActionMeta playbackActionMeta, String str) {
        if (b().isActive()) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            tib tibVar = a;
            tibVar.getClass();
            Intent a2 = tibVar.a(context, MusicPlayerAction.ACTION_NEXT, str);
            a2.putExtra("EXTRA_ACTION_META", playbackActionMeta);
            c(a2, true);
        }
    }

    public static final void f(PlaybackActionMeta playbackActionMeta, String str) {
        if (b().isActive()) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            tib tibVar = a;
            tibVar.getClass();
            Intent a2 = tibVar.a(context, MusicPlayerAction.ACTION_NEXT_15, str);
            a2.putExtra("EXTRA_ACTION_META", playbackActionMeta);
            c(a2, true);
        }
    }

    public static final void g(PlaybackActionMeta playbackActionMeta, String str, String str2, boolean z) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        tib tibVar = a;
        tibVar.getClass();
        Intent a2 = tibVar.a(context, MusicPlayerAction.ACTION_PLAY_UUID, null);
        a2.putExtra(IronSourceConstants.TYPE_UUID, str);
        a2.putExtra("PRESERVE_STATE", z);
        a2.putExtra("EXTRA_ACTION_META", playbackActionMeta);
        a2.putExtra("EXTRA_REASON", str2);
        c(a2, true);
    }

    public static final void h(boolean z, PlaybackActionMeta playbackActionMeta, String str) {
        if (b().isActive()) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            c(a.c(context, z, playbackActionMeta, str), true);
        }
    }

    public static final void i(PlaybackActionMeta playbackActionMeta, String str) {
        if (b().isActive()) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            tib tibVar = a;
            tibVar.getClass();
            Intent a2 = tibVar.a(context, MusicPlayerAction.ACTION_PREV_15, str);
            a2.putExtra("EXTRA_ACTION_META", playbackActionMeta);
            c(a2, true);
        }
    }

    public static final void j(PlaybackActionMeta playbackActionMeta, String str) {
        if (b().isActive()) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            tib tibVar = a;
            tibVar.getClass();
            Intent a2 = tibVar.a(context, MusicPlayerAction.ACTION_RESUME, str);
            a2.putExtra("EXTRA_ACTION_META", playbackActionMeta);
            c(a2, true);
        }
    }

    public static final void k(float f, boolean z) {
        if (b().isActive()) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            tib tibVar = a;
            tibVar.getClass();
            Intent a2 = tibVar.a(context, MusicPlayerAction.ACTION_SET_PODCAST_PLAYBACK_SPEED, null);
            a2.putExtra("PLAYBACK_SPEED", f);
            a2.putExtra("SAVE_PLAYBACK_SPEED", z);
            c(a2, true);
        }
    }

    public static final void l(PlaybackActionMeta playbackActionMeta, String str) {
        if (b().isActive()) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            tib tibVar = a;
            tibVar.getClass();
            Intent a2 = tibVar.a(context, MusicPlayerAction.ACTION_STOP, str);
            a2.putExtra("EXTRA_ACTION_META", playbackActionMeta);
            c(a2, false);
        }
    }

    public static final void m(LoopMode loopMode) {
        if (b().isActive()) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            tib tibVar = a;
            tibVar.getClass();
            c(tibVar.a(context, MusicPlayerAction.ACTION_TOGGLE_REPEAT, null), true);
        }
    }

    public static final void n(PlaybackActionMeta playbackActionMeta, String str) {
        if (b().isActive()) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            tib tibVar = a;
            tibVar.getClass();
            Intent a2 = tibVar.a(context, MusicPlayerAction.ACTION_TOGGLE_RESUME_PAUSE, str);
            a2.putExtra("EXTRA_ACTION_META", playbackActionMeta);
            c(a2, true);
        }
    }

    public static final void o() {
        if (b().isActive()) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            tib tibVar = a;
            tibVar.getClass();
            c(tibVar.a(context, MusicPlayerAction.ACTION_TOGGLE_SHUFFLE, null), true);
        }
    }
}
