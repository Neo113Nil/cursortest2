package xsna;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.channels.impl.post_settings.PostSettingsFragment;
import com.vk.clips.design.view.camera.widgets.TabsRecycler;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vkontakte.android.actionlinks.views.holders.link.ItemLinkView;
import xsna.djo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ra6 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ra6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        gzs<s3q0> J0;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ta6 ta6Var = (ta6) obj;
                otu0 un = ta6Var.un();
                Context requireContext = ta6Var.requireContext();
                SchemeStatSak$EventScreen u5 = ta6Var.u5();
                un.getClass();
                otu0.b(requireContext, u5);
                break;
            case 1:
                float f = CameraUIView.w1;
                TabsRecycler tabs = ((CameraUIView) obj).getTabs();
                if (tabs != null) {
                    tabs.d(StoryCameraMode.QR_SCANNER.ordinal(), true);
                    break;
                }
                break;
            case 2:
                djo djoVar = (djo) obj;
                djoVar.H = new djo.a.C2740a(false);
                ((u76) djoVar.d.b).D5();
                break;
            case 3:
                q7r q7rVar = (q7r) obj;
                mkm0 mkm0Var = q7rVar.i0;
                if (mkm0Var.getCurrentStory() != null) {
                    mkm0Var.getDependencies().o.a(mkm0Var.getCurrentStory().c);
                }
                q50 q50Var = q7rVar.s0;
                int currentIndex = mkm0Var.getCurrentIndex();
                q50Var.getClass();
                q50.i(q50Var, currentIndex, 6);
                break;
            case 4:
                int i2 = ItemLinkView.f;
                uux presenter = ((ItemLinkView) obj).getPresenter();
                if (presenter != null && (J0 = presenter.J0()) != null) {
                    J0.invoke();
                    break;
                }
                break;
            case 5:
                int i3 = PostSettingsFragment.Y;
                ((PostSettingsFragment) obj).finish();
                break;
            case 6:
                ss3 ss3Var = ((cqc0) obj).k;
                if (ss3Var != null) {
                    ss3Var.invoke();
                    break;
                }
                break;
            case 7:
                qcy<Object>[] qcyVarArr = PostponedPostsFragment.q0;
                RecyclerView recyclerView = ((PostponedPostsFragment) obj).Z;
                RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.K(0, 0);
                    break;
                }
                break;
            case 8:
                ((cmo0) obj).d();
                break;
            default:
                ((rju0) obj).toggle();
                break;
        }
    }
}
