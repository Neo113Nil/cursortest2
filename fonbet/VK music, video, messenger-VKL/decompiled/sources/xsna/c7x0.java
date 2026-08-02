package xsna;

import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.seek.ClipsSeekBar;
import com.vk.clips.editor.base.api.ClipsEditorScreen;
import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.clips.model.ClipsEditorVideoVolumeItem;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.ixd;
import xsna.luc;
import xsna.wzd;

/* compiled from: VolumeModificationView.kt */
/* loaded from: classes16.dex */
public final class c7x0 extends huj0 {
    public final VkText m;
    public final ClipsSeekBar n;

    public c7x0(ViewGroup viewGroup, uy50 uy50Var, wn2 wn2Var, udl0 udl0Var, hwd hwdVar, guj0 guj0Var) {
        super(viewGroup, R.layout.layout_clips_volume_screen, uy50Var, wn2Var, udl0Var, hwdVar, guj0Var);
        this.m = (VkText) this.h.findViewById(R.id.editor_volume_percent_text);
        ClipsSeekBar clipsSeekBar = (ClipsSeekBar) this.h.findViewById(R.id.editor_volume_seek_bar);
        ixd ixdVar = ad0.g;
        ixd.a aVar = (ixdVar == null ? null : ixdVar).b;
        clipsSeekBar.setSelectedColor(R.color.vk_blue_400);
        clipsSeekBar.setThumbColor(R.color.vk_white);
        this.n = clipsSeekBar;
        clipsSeekBar.setOnSeekBarChangeListener(new mv8(this, guj0Var));
    }

    @Override // xsna.huj0
    public final <T extends kyd> T a(T t, T t2) {
        return ((t2 instanceof ClipsEditorAudioItem) && (t instanceof ClipsEditorAudioItem)) ? ClipsEditorAudioItem.a((ClipsEditorAudioItem) t2, null, ((ClipsEditorAudioItem) t).b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 29) : ((t2 instanceof com.vk.clips.editor.state.model.c) && (t instanceof com.vk.clips.editor.state.model.c)) ? com.vk.clips.editor.state.model.c.a((com.vk.clips.editor.state.model.c) t2, null, 0L, 0L, null, null, null, null, null, null, ((com.vk.clips.editor.state.model.c) t).r, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 393215) : t2;
    }

    @Override // xsna.huj0
    public final List<wzd> c() {
        return Collections.singletonList(new wzd.a(luc.l.a, 1));
    }

    @Override // xsna.huj0
    public final void e(kyd kydVar) {
        float f;
        if (kydVar instanceof ClipsEditorAudioItem) {
            f = ((ClipsEditorAudioItem) kydVar).b;
        } else {
            if (kydVar instanceof com.vk.clips.editor.state.model.c) {
                ClipsEditorVideoVolumeItem clipsEditorVideoVolumeItem = ((com.vk.clips.editor.state.model.c) kydVar).r;
                if (!clipsEditorVideoVolumeItem.c) {
                    f = clipsEditorVideoVolumeItem.b;
                }
            } else if (!(kydVar instanceof com.vk.clips.editor.state.model.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f = 0.0f;
        }
        this.m.setText(String.valueOf((int) ((an10.b(((int) r0) * f) / ((float) Math.pow(10.0f, 2))) * 100)));
        this.n.setValue(f);
    }

    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final ClipsEditorScreen.State getState() {
        return ClipsEditorScreen.State.VOLUME;
    }
}
