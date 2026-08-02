package xsna;

import android.view.View;
import android.widget.CheckBox;
import com.vk.camera.drawing.gradient.StoryEditText;
import com.vk.camera.editor.stories.impl.share.content.StoryShareContentType;
import com.vk.clips.favorites.impl.ui.folders.list.ClipsFavoriteFoldersListFragment;
import com.vk.clips.favorites.impl.ui.folders.list.a;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.a;
import com.vk.video.profile.presentation.a;
import kotlin.NoWhenBranchMatchedException;
import xsna.cs00;
import xsna.qdm0;
import xsna.rdm0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class dm7 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dm7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        x7j0 x7j0Var;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                em7 em7Var = (em7) obj;
                if (em7Var.n != null) {
                    em7Var.l.g(!r5.b);
                    return;
                }
                return;
            case 1:
                ClipsFavoriteFoldersListFragment clipsFavoriteFoldersListFragment = (ClipsFavoriteFoldersListFragment) obj;
                int i2 = ClipsFavoriteFoldersListFragment.U;
                clipsFavoriteFoldersListFragment.getClass();
                xn50.a.c(clipsFavoriteFoldersListFragment, a.d.b);
                return;
            case 2:
                ((k8p) obj).a.invoke(a.h.b);
                return;
            case 3:
                ps00 ps00Var = (ps00) obj;
                os00 os00Var = ps00Var.u;
                if (os00Var != null) {
                    ps00Var.l.a(new cs00.i(ps00Var.n, os00Var.b));
                    return;
                }
                return;
            case 4:
                s4m0 s4m0Var = ((n4m0) obj).n;
                if (s4m0Var != null) {
                    s4m0Var.getClass();
                    nf9.b.m();
                    n4m0 n4m0Var = s4m0Var.b;
                    n4m0Var.h(false);
                    StoryEditText storyEditText = n4m0Var.k;
                    if (storyEditText == null) {
                        storyEditText = null;
                    }
                    storyEditText.postDelayed(new m52(s4m0Var, 5), 300L);
                    return;
                }
                return;
            case 5:
                qdm0 qdm0Var = (qdm0) obj;
                StoryShareContentType storyShareContentType = qdm0Var.m;
                CheckBox checkBox = qdm0Var.p;
                int i3 = qdm0.a.$EnumSwitchMapping$0[storyShareContentType.ordinal()];
                if (i3 == 1) {
                    checkBox.setChecked(true);
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bwt0.p0(checkBox, true);
                }
                rdm0.b bVar = qdm0Var.n;
                if (bVar == null || (x7j0Var = bVar.f) == null) {
                    return;
                }
                qdm0Var.l.invoke(x7j0Var);
                return;
            default:
                ((cys0) obj).b0.invoke(a.h.b);
                return;
        }
    }
}
