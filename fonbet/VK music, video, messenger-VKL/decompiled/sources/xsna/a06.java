package xsna;

import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.auth.passport.VkPassportView;
import com.vk.balance.BalanceFragment;
import com.vk.dto.common.Attachment;
import com.vk.ecomm.market.album.MarketEditAlbumCoverFragment;
import com.vk.im.ui.fragments.ImRequestsFragment;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.search.model.VideoSearchFiltersImpl;
import com.vk.stories.StorySettingsActivity;
import xsna.evr0;
import xsna.iv9;
import xsna.ptw0;
import xsna.sw50;
import xsna.yfu0;
import xsna.zn30;
import xsna.zuu0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class a06 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a06(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        uz5 uz5Var;
        x64 x64Var;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                BalanceFragment balanceFragment = (BalanceFragment) obj;
                if (!balanceFragment.g0) {
                    balanceFragment.g0 = true;
                    View view2 = balanceFragment.U;
                    if (view2 == null) {
                        view2 = null;
                    }
                    view2.setEnabled(false);
                    View view3 = balanceFragment.T;
                    if (view3 == null) {
                        view3 = null;
                    }
                    view3.setEnabled(false);
                    View view4 = balanceFragment.U;
                    if (view4 == null) {
                        view4 = null;
                    }
                    if (!view.equals(view4)) {
                        View view5 = balanceFragment.T;
                        if (view.equals(view5 != null ? view5 : null) && (uz5Var = (uz5) balanceFragment.S) != null) {
                            uz5Var.n6(balanceFragment);
                            break;
                        }
                    } else {
                        uz5 uz5Var2 = (uz5) balanceFragment.S;
                        if (uz5Var2 != null) {
                            uz5Var2.h6(balanceFragment);
                            break;
                        }
                    }
                }
                break;
            case 1:
                mh7 mh7Var = (mh7) obj;
                Attachment attachment = mh7Var.d;
                if (attachment != null && (x64Var = mh7Var.p) != null) {
                    x64Var.f(attachment);
                    break;
                }
                break;
            case 2:
                hv9 hv9Var = (hv9) obj;
                iv9.a aVar = hv9Var.o;
                if (aVar != null) {
                    hv9Var.l.c(aVar);
                    break;
                }
                break;
            case 3:
                RecyclerView recyclerView = ((cai) obj).c;
                if (recyclerView != null) {
                    recyclerView.scrollToPosition(0);
                    break;
                }
                break;
            case 4:
                ((t3r) obj).a();
                break;
            case 5:
                qcy<Object>[] qcyVarArr = ImRequestsFragment.Z;
                ((ImRequestsFragment) obj).finish();
                break;
            case 6:
                MarketEditAlbumCoverFragment marketEditAlbumCoverFragment = (MarketEditAlbumCoverFragment) obj;
                int i2 = MarketEditAlbumCoverFragment.d0;
                ((sw50) marketEditAlbumCoverFragment.c0.getValue()).g().d(marketEditAlbumCoverFragment, 4, 1, new sw50.f.a(null, null, 31));
                break;
            case 7:
                zn30.a aVar2 = ((us30) obj).k;
                if (aVar2 != null) {
                    aVar2.c();
                    break;
                }
                break;
            case 8:
                ((s1x) obj).invoke();
                break;
            case 9:
                ((cqc0) obj).a1();
                break;
            case 10:
                int i3 = ProfileFriendsFragment.k0;
                ((EditText) obj).getText().clear();
                break;
            case 11:
                bth0 bth0Var = (bth0) obj;
                VideoSearchFiltersImpl videoSearchFiltersImpl = bth0Var.v;
                if (!videoSearchFiltersImpl.f || !videoSearchFiltersImpl.e) {
                    bth0Var.P4(bth0Var.F, bth0Var.u.c.a, new mi10(bth0Var, 21));
                    break;
                }
                break;
            case 12:
                int i4 = StorySettingsActivity.P;
                ((StorySettingsActivity) obj).U1();
                break;
            case 13:
                ((evr0.a) obj).a();
                break;
            case 14:
                yfu0.a aVar3 = ((yfu0) obj).f;
                if (aVar3 != null) {
                    aVar3.b();
                    break;
                }
                break;
            case 15:
                zuu0.a aVar4 = ((zuu0) obj).f;
                if (aVar4 != null) {
                    aVar4.b();
                    break;
                }
                break;
            case 16:
                int i5 = VkPassportView.A;
                ((q3s0) obj).invoke(view);
                break;
            default:
                ((cuw0) obj).c.invoke(ptw0.f.b);
                break;
        }
    }
}
