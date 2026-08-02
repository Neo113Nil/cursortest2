package xsna;

import com.vk.catalog2.common.ui.holders.search.SearchState;
import com.vk.core.exceptions.DisposableException;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.clips.ClipMainTabState;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class kv implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.n0i0] */
    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        String str;
        switch (this.b) {
            case 0:
                fw fwVar = (fw) this.c;
                mkm0 mkm0Var = fwVar.a.i0;
                elm0 elm0Var = mkm0Var.c;
                if (elm0Var != null) {
                    elm0Var.q(mkm0Var.getStoriesContainer());
                }
                cmf0.a.c(fwVar.a.i0.getContext(), fwVar.a.i0.getWindow(), fwVar.a.i0.getCurrentStory().d.b > 0 ? R.string.user_has_been_hidden_from_stories : R.string.community_has_been_hidden_from_stories);
                break;
            case 1:
                ((e7w) this.c).a.onDestroy();
                break;
            case 2:
                yp80 yp80Var = (yp80) this.c;
                if (yp80Var != null) {
                    yp80Var.onError(new DisposableException());
                    break;
                }
                break;
            case 3:
                o0i0 o0i0Var = (o0i0) this.c;
                if (o0i0Var.d(SearchState.Suggestion) && (str = o0i0Var.e.e) != null && (!drm0.N(str))) {
                    o0i0Var.b.z0(true, true);
                    break;
                }
                break;
            default:
                VideoFile A = k15.A(((ikd) this.c).a);
                ClipVideoFile clipVideoFile = A instanceof ClipVideoFile ? (ClipVideoFile) A : null;
                if (clipVideoFile != null) {
                    wjs0.a(new fyr0(ClipVideoFile.Kb(clipVideoFile, false, null, null, null, null, null, ClipMainTabState.NOT_ON_TAB, 7340031)));
                    break;
                }
                break;
        }
    }
}
