package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.editor.base.api.ClipsEditorScreen;
import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import com.vk.dto.clips.morphing.AudioEffectType;
import com.vk.lists.ListDataSet;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.luc;
import xsna.wzd;

/* compiled from: AudioEffectsModificationView.kt */
/* loaded from: classes16.dex */
public final class hn4 extends huj0 {
    public final ListDataSet<cn4> m;

    public hn4(ViewGroup viewGroup, uy50 uy50Var, wn2 wn2Var, udl0 udl0Var, hwd hwdVar, guj0 guj0Var) {
        super(viewGroup, R.layout.layout_clips_audio_effects_screen, uy50Var, wn2Var, udl0Var, hwdVar, guj0Var);
        ListDataSet<cn4> listDataSet = new ListDataSet<>();
        for (AudioEffectType audioEffectType : AudioEffectType.values()) {
            listDataSet.s(new cn4(audioEffectType, this.h.getContext()));
        }
        this.m = listDataSet;
        an4 an4Var = new an4(listDataSet, new q8(1, this, hn4.class, "onEffectClicked", "onEffectClicked(I)V", 0, 1));
        RecyclerView recyclerView = (RecyclerView) this.h.findViewById(R.id.rv_effects);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(an4Var);
        recyclerView.setHasFixedSize(true);
    }

    @Override // xsna.huj0
    public final <T extends kyd> T a(T t, T t2) {
        return ((t2 instanceof ClipsEditorAudioItem) && (t instanceof ClipsEditorAudioItem)) ? ClipsEditorAudioItem.a((ClipsEditorAudioItem) t2, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((ClipsEditorAudioItem) t).d, 23) : ((t2 instanceof com.vk.clips.editor.state.model.c) && (t instanceof com.vk.clips.editor.state.model.c)) ? com.vk.clips.editor.state.model.c.a((com.vk.clips.editor.state.model.c) t2, null, 0L, 0L, null, null, null, null, ((com.vk.clips.editor.state.model.c) t).m, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 520191) : t2;
    }

    @Override // xsna.huj0
    public final List<wzd> c() {
        return Collections.singletonList(new wzd.a(luc.i.a, 1));
    }

    @Override // xsna.huj0
    public final void e(kyd kydVar) {
        AudioEffectType audioEffectType;
        if (kydVar instanceof ClipsEditorAudioItem) {
            audioEffectType = ((ClipsEditorAudioItem) kydVar).d;
        } else if (kydVar instanceof com.vk.clips.editor.state.model.c) {
            audioEffectType = ((com.vk.clips.editor.state.model.c) kydVar).m;
        } else {
            if (!(kydVar instanceof com.vk.clips.editor.state.model.b)) {
                throw new NoWhenBranchMatchedException();
            }
            audioEffectType = null;
        }
        if (audioEffectType != null) {
            f(audioEffectType);
        }
    }

    public final void f(AudioEffectType audioEffectType) {
        int i;
        ListDataSet<cn4> listDataSet = this.m;
        ListDataSet.ArrayListImpl<cn4> arrayListImpl = listDataSet.d;
        ListDataSet.ArrayListImpl<cn4> arrayListImpl2 = listDataSet.d;
        Iterator<cn4> it = arrayListImpl.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i3 = -1;
                break;
            } else if (it.next().b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            arrayListImpl2.get(i3).b = false;
            listDataSet.d(i3);
        }
        Iterator<cn4> it2 = arrayListImpl2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (it2.next().a == audioEffectType) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i >= 0) {
            arrayListImpl2.get(i).b = true;
            listDataSet.d(i);
        }
    }

    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final ClipsEditorScreen.State getState() {
        return ClipsEditorScreen.State.AUDIO_EFFECTS;
    }
}
