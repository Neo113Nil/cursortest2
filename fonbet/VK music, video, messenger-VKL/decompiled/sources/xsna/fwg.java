package xsna;

import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.api.generated.account.dto.AccountSetPrivacyKeyDto;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.core.view.components.spinner.VkScreenSpinner;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.checklist.impl.presentation.CommunityCheckListFragment;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import xsna.gm50;
import xsna.x9m0;
import xsna.xwg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class fwg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fwg(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 5;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                CommunityCheckListFragment communityCheckListFragment = (CommunityCheckListFragment) obj5;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) obj3;
                int i3 = CommunityCheckListFragment.Y;
                gm50.a.a(communityCheckListFragment, ((xwg.a) obj).a, new a5(i2, communityCheckListFragment, (RecyclerView) obj2));
                ((VkScreenSpinner) obj4).setVisibility(8);
                swipeRefreshLayout.setRefreshing(false);
                VkPlaceholder vkPlaceholder = communityCheckListFragment.W;
                (vkPlaceholder != null ? vkPlaceholder : null).setVisibility(8);
                swipeRefreshLayout.setEnabled(true);
                break;
            case 1:
                p9m0 p9m0Var = (p9m0) obj4;
                HashSet M0 = j5g.M0((List) obj5);
                M0.addAll((List) obj2);
                List<UserId> O0 = j5g.O0(M0);
                p9m0Var.T(new x9m0.f(O0));
                p9m0Var.U(O0, new hij0(p9m0Var, 5));
                hg1.e(p9m0Var.e, hg1.m(rsg0.y0(yfb.x(bs.n((bs) p9m0Var.g.getValue(), AccountSetPrivacyKeyDto.STORIES, Collections.singletonList("friends"), null, 120)), null, null, 3), p9m0Var.f, 0L, false, 62).subscribe(new eeh0(new bwg(p9m0Var, O0, (List) obj3, 8), i2), new c120(new n9m0(p9m0Var, 0), 29)));
                break;
            default:
                com.vk.qrcode.d dVar = com.vk.qrcode.d.b;
                com.vk.qrcode.d.l((Activity) obj5, (String) obj4, (String) obj3, (String) obj2, "vk_app");
                break;
        }
        return s3q0.a;
    }
}
