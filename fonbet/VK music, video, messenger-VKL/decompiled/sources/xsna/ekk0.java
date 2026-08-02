package xsna;

import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.editor.speed.SpeedView;
import com.vk.clips.editor.base.api.ClipsEditorScreen;
import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.luc;
import xsna.wzd;

/* compiled from: SpeedModificationView.kt */
/* loaded from: classes16.dex */
public final class ekk0 extends huj0 {
    public final bpn0 m;

    /* compiled from: SpeedModificationView.kt */
    public final class a {
        public a() {
        }
    }

    public ekk0(ViewGroup viewGroup, uy50 uy50Var, wn2 wn2Var, udl0 udl0Var, hwd hwdVar, guj0 guj0Var) {
        super(viewGroup, R.layout.layout_clips_speed_screen, uy50Var, wn2Var, udl0Var, hwdVar, guj0Var);
        this.m = new bpn0(new f880(this, 22));
    }

    public static kyd f(kyd kydVar, float f) {
        if (kydVar instanceof ClipsEditorAudioItem) {
            ClipsEditorAudioItem clipsEditorAudioItem = (ClipsEditorAudioItem) kydVar;
            ClipsEditorMusicInfo clipsEditorMusicInfo = clipsEditorAudioItem.a;
            float f2 = clipsEditorMusicInfo.d;
            float f3 = clipsEditorAudioItem.c;
            return ClipsEditorAudioItem.a(clipsEditorAudioItem, ClipsEditorMusicInfo.zb(clipsEditorMusicInfo, null, null, (int) ((f2 * f3) / f), (int) ((clipsEditorMusicInfo.e * f3) / f), 0, null, 0, 2035), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, null, 26);
        }
        if (!(kydVar instanceof com.vk.clips.editor.state.model.c)) {
            if (kydVar instanceof com.vk.clips.editor.state.model.b) {
                return kydVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        com.vk.clips.editor.state.model.c cVar = (com.vk.clips.editor.state.model.c) kydVar;
        if (cVar.l) {
            return cVar;
        }
        float f4 = cVar.b;
        float f5 = cVar.s;
        return com.vk.clips.editor.state.model.c.a(cVar, null, (long) ((f4 * f5) / f), (long) ((cVar.c * f5) / f), null, null, null, null, null, null, null, f, 262137);
    }

    @Override // xsna.huj0
    public final <T extends kyd> T a(T t, T t2) {
        return ((t2 instanceof ClipsEditorAudioItem) && (t instanceof ClipsEditorAudioItem)) ? (T) f(t2, ((ClipsEditorAudioItem) t).c) : ((t2 instanceof com.vk.clips.editor.state.model.c) && (t instanceof com.vk.clips.editor.state.model.c)) ? (T) f(t2, ((com.vk.clips.editor.state.model.c) t).s) : t2;
    }

    @Override // xsna.huj0
    public final List<wzd> c() {
        return Collections.singletonList(new wzd.a(luc.j.a, 1));
    }

    @Override // xsna.huj0
    public final void e(kyd kydVar) {
        float f;
        if (kydVar instanceof ClipsEditorAudioItem) {
            f = ((ClipsEditorAudioItem) kydVar).c;
        } else if (kydVar instanceof com.vk.clips.editor.state.model.c) {
            f = ((com.vk.clips.editor.state.model.c) kydVar).s;
        } else {
            if (!(kydVar instanceof com.vk.clips.editor.state.model.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f = 1.0f;
        }
        ((SpeedView) this.m.getValue()).X4(kydVar.getDurationMs() / 1000.0f, f, bzd.z, new a());
    }

    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final ClipsEditorScreen.State getState() {
        return ClipsEditorScreen.State.SPEED;
    }
}
