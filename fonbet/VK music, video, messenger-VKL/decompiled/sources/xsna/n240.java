package xsna;

import android.content.Context;
import com.vk.newsfeed.impl.discover.themed.ThemedFeedToolbarFragment;
import com.vk.search.fragment.RestoreSearchFragment;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vk.story.viewer.impl.presentation.stories.view.TimelineThumbsView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class n240 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n240(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((i37) this.c).invoke(obj);
                break;
            case 1:
                ((ioh) this.c).invoke(obj);
                break;
            case 2:
                ((ux40) this.c).invoke(obj);
                break;
            case 3:
                ((uw4) this.c).invoke(obj);
                break;
            case 4:
                ((ux40) this.c).invoke(obj);
                break;
            case 5:
                ((ux40) this.c).invoke(obj);
                break;
            case 6:
                ((hs00) this.c).invoke(obj);
                break;
            case 7:
                ((ux40) this.c).invoke(obj);
                break;
            case 8:
                ((o83) this.c).invoke(obj);
                break;
            case 9:
                ((ux40) this.c).invoke(obj);
                break;
            case 10:
                ((x4g) this.c).invoke(obj);
                break;
            case 11:
                ((y8m) this.c).invoke(obj);
                break;
            case 12:
                ((y8m) this.c).invoke(obj);
                break;
            case 13:
                ((p99) this.c).invoke(obj);
                break;
            case 14:
                ((oqe0) this.c).invoke(obj);
                break;
            case 15:
                RestoreSearchFragment restoreSearchFragment = (RestoreSearchFragment) this.c;
                VkPeopleSearchParams vkPeopleSearchParams = restoreSearchFragment.e0;
                mru0 mru0Var = (mru0) obj;
                vkPeopleSearchParams.h5(mru0Var.a);
                Context requireContext = restoreSearchFragment.requireContext();
                bxz a = ((ywz) restoreSearchFragment.g0.getValue()).a(vkPeopleSearchParams);
                restoreSearchFragment.io(a != null ? a.a(requireContext) : null, vkPeopleSearchParams.I());
                if (mru0Var.b) {
                    RestoreSearchFragment.b bVar = restoreSearchFragment.a0;
                    (bVar != null ? bVar : null).clear();
                    com.vk.lists.c cVar = restoreSearchFragment.b0;
                    if (cVar != null) {
                        cVar.p(false);
                        break;
                    }
                }
                break;
            case 16:
                ((zsl0) this.c).invoke(obj);
                break;
            case 17:
                ((lmu) this.c).invoke(obj);
                break;
            case 18:
                ((jng) this.c).invoke(obj);
                break;
            case 19:
                ((lyl0) this.c).invoke(obj);
                break;
            case 20:
                ((zsl0) this.c).invoke(obj);
                break;
            case 21:
                ((whi0) this.c).invoke(obj);
                break;
            case 22:
                ((lyl0) this.c).invoke(obj);
                break;
            case 23:
                ((l4o0) this.c).k = true;
                break;
            case 24:
                o83 o83Var = (o83) this.c;
                int i = ThemedFeedToolbarFragment.a0;
                o83Var.invoke(obj);
                break;
            case 25:
                lyl0 lyl0Var = (lyl0) this.c;
                int i2 = TimelineThumbsView.h;
                lyl0Var.invoke(obj);
                break;
            case 26:
                ((izs) this.c).invoke(obj);
                break;
            case 27:
                ((lyl0) this.c).invoke(obj);
                break;
            case 28:
                ((sf4) this.c).invoke(obj);
                break;
            default:
                ((h2h0) this.c).invoke(obj);
                break;
        }
    }
}
