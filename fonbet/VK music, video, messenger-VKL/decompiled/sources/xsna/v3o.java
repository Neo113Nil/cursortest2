package xsna;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.community.design.view.donut.teaser.DonutTeaserView;
import com.vk.im.ui.fragments.ImChatSettingsFragment;
import com.vk.music.subscription.MusicSubscriptionDetailsContainer;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.superapp.browser.ui.dialogs.DialogResultState;
import com.vk.superapp.ui.toolbar.VkAuthToolbar;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class v3o implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v3o(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                gzs<s3q0> gzsVar = ((DonutTeaserView) obj).f;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 1:
                Object obj2 = ((pop) obj).o;
                ((qop) (obj2 != null ? obj2 : null)).J1();
                break;
            case 2:
                int i2 = vvs.C;
                ((vvs) obj).Dn(DialogResultState.EXIT);
                break;
            case 3:
                qcy<Object>[] qcyVarArr = GeoPostsFragment.q0;
                RecyclerView recyclerView = ((GeoPostsFragment) obj).Z;
                RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.K(0, 0);
                    break;
                }
                break;
            case 4:
                int i3 = ImChatSettingsFragment.V;
                ((ImChatSettingsFragment) obj).finish();
                break;
            case 5:
                int i4 = MusicSubscriptionDetailsContainer.A;
                ((f950) obj).a(view, null);
                break;
            case 6:
                ((bga0) obj).a();
                break;
            case 7:
                com.vk.music.podcast.impl.ui.episode.b bVar = ((bhb0) obj).n;
                bVar.k = true;
                zgb0 zgb0Var = bVar.b.X;
                if (zgb0Var != null) {
                    zgb0Var.notifyDataSetChanged();
                    break;
                }
                break;
            case 8:
                ord0 ord0Var = (ord0) obj;
                ird0 ird0Var = ord0Var.t;
                if (ird0Var != null) {
                    ord0Var.s = true;
                    ord0Var.q6(ird0Var);
                    f4m.j(ord0Var.p);
                    break;
                }
                break;
            case 9:
                ybk0 ybk0Var = (ybk0) obj;
                ImageView imageView = ybk0Var.N;
                if (imageView != null) {
                    ybk0Var.G6(imageView);
                    break;
                }
                break;
            default:
                int i5 = VkAuthToolbar.k;
                ((izs) obj).invoke(view);
                break;
        }
    }
}
