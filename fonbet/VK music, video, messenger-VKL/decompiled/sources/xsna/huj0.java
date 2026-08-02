package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.clips.editor.base.api.ClipsEditorScreen;
import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.button.tool.VkToolButton;
import com.vk.core.view.components.checkbox.VkCheckboxItem;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.guj0;
import xsna.tlo0;
import xsna.wn2;

/* compiled from: SingleFragmentModificationScreen.kt */
/* loaded from: classes16.dex */
public abstract class huj0 implements ClipsEditorScreen {
    public final ViewGroup b;
    public final com.vk.clips.editor.base.api.b c;
    public final wn2 d;
    public final tdl0 e;
    public final hwd f;
    public final guj0 g;
    public final ViewGroup h;
    public final View i;
    public final VkToolButton j;
    public final VkCheckboxItem k;
    public final VkButton l;

    public huj0(ViewGroup viewGroup, int i, com.vk.clips.editor.base.api.b bVar, wn2 wn2Var, tdl0 tdl0Var, hwd hwdVar, guj0 guj0Var) {
        this.b = viewGroup;
        this.c = bVar;
        this.d = wn2Var;
        this.e = tdl0Var;
        this.f = hwdVar;
        this.g = guj0Var;
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(i, (ViewGroup) null);
        this.h = viewGroup2;
        this.i = viewGroup2.findViewById(R.id.editor_overlay_view);
        this.j = (VkToolButton) viewGroup2.findViewById(R.id.go_back_btn);
        this.k = (VkCheckboxItem) viewGroup2.findViewById(R.id.apply_to_all_checkbox);
        this.l = (VkButton) viewGroup2.findViewById(R.id.done_btn);
    }

    public abstract <T extends kyd> T a(T t, T t2);

    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final boolean a0() {
        this.g.b();
        return true;
    }

    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final void b(boolean z, ClipsEditorScreen.a aVar) {
        guj0 guj0Var = this.g;
        guj0Var.c = this;
        jjc.g(this.j, new ba40(this, 26));
        jjc.g(this.l, new pod0(this, 7));
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ViewGroup viewGroup = this.b;
        ViewGroup viewGroup2 = this.h;
        viewGroup.addView(viewGroup2, layoutParams);
        wn2.a.a(this.d, this.h, this.i, new wn2.b(z, true), null, 24);
        rzd rzdVar = guj0Var.b;
        x8d x8dVar = guj0Var.a;
        Integer num = null;
        String string = aVar != null ? aVar.a.getString("fragment_id") : null;
        if (string == null) {
            lyd.a.c(new IllegalArgumentException("SingleFragmentModificationDelegate: passed fragment_id is null"));
            huj0 huj0Var = guj0Var.c;
            if (huj0Var == null) {
                huj0Var = null;
            }
            huj0Var.d();
        } else {
            kyd d = rzdVar.getState().d(string);
            if (d == null) {
                lyd.a.c(new IllegalArgumentException("SingleFragmentModificationDelegate: there is not item with passed fragment_id"));
                huj0 huj0Var2 = guj0Var.c;
                if (huj0Var2 == null) {
                    huj0Var2 = null;
                }
                huj0Var2.d();
            } else {
                guj0Var.d = d;
                guj0Var.e = d;
                x8dVar.d(true);
                x8dVar.m(string);
                Long b = rzdVar.getState().b(x8dVar.n(), string);
                if (b != null) {
                    x8dVar.seekTo(b.longValue());
                }
                huj0 huj0Var3 = guj0Var.c;
                if (huj0Var3 == null) {
                    huj0Var3 = null;
                }
                kyd kydVar = guj0Var.d;
                if (kydVar == null) {
                    kydVar = null;
                }
                huj0Var3.e(kydVar);
            }
        }
        kyd kydVar2 = guj0Var.d;
        if (kydVar2 == null) {
            kydVar2 = null;
        }
        if (kydVar2 instanceof com.vk.clips.editor.state.model.c) {
            num = Integer.valueOf(R.string.clips_editor_apply_to_all_videos);
        } else if (kydVar2 instanceof ClipsEditorAudioItem) {
            int i = guj0.a.$EnumSwitchMapping$0[((ClipsEditorAudioItem) kydVar2).d().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    num = Integer.valueOf(R.string.clips_editor_apply_to_all_imported_audio);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    num = Integer.valueOf(R.string.clips_editor_apply_to_all_voiceover);
                }
            }
        } else if (!(kydVar2 instanceof com.vk.clips.editor.state.model.b)) {
            throw new NoWhenBranchMatchedException();
        }
        if (num != null) {
            tlo0.a aVar2 = tlo0.Companion;
            int intValue = num.intValue();
            aVar2.getClass();
            tlo0.f fVar = new tlo0.f(intValue);
            VkCheckboxItem vkCheckboxItem = this.k;
            vkCheckboxItem.setTitle(fVar);
            vkCheckboxItem.setContentDescription(viewGroup2.getContext().getString(num.intValue()));
            vkCheckboxItem.setVisibility(0);
        }
        this.e.b(true);
    }

    public abstract List<wzd> c();

    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public void close() {
        this.g.a.m(null);
        this.d.d(this.h, new odc0(this, 14));
        this.e.b(false);
    }

    public final void d() {
        this.c.b(ClipsEditorScreen.State.VIDEO_CROPPER, null);
    }

    public abstract void e(kyd kydVar);
}
