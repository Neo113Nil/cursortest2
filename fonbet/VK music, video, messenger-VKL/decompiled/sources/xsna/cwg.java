package xsna;

import androidx.core.app.NotificationCompat;
import com.vk.dto.common.Peer;
import com.vk.dto.user.RequestUserProfile;
import com.vk.ecomm.checklist.impl.presentation.CommunityCheckListFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.friends.impl.cleanup.presentation.fragment.FriendsCleanupFragment;
import com.vk.games.presentation.catalog.GamesCatalogFragment;
import com.vk.geo.impl.di.GeoComponentImpl;
import com.vk.im.ui.fragments.ImDialogsSelectionFragment;
import com.vk.music.playlist.display.presentation.DisplayMusicPlaylistFragment;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import xsna.dzh;
import xsna.fss;
import xsna.mvg;
import xsna.wih;
import xsna.xn50;
import xsna.yns;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class cwg implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cwg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                CommunityCheckListFragment communityCheckListFragment = (CommunityCheckListFragment) obj;
                int i2 = CommunityCheckListFragment.Y;
                mvg.h hVar = mvg.h.b;
                communityCheckListFragment.getClass();
                xn50.a.c(communityCheckListFragment, hVar);
                break;
            case 1:
                d4h d4hVar = (d4h) obj;
                ((d3h) d4hVar.c.invoke()).j(d4hVar.d, false);
                break;
            case 2:
                h5h h5hVar = (h5h) obj;
                h5hVar.B6(false);
                h5hVar.A6(true);
                break;
            case 3:
                gzs<s3q0> gzsVar = ((wih.a) obj).t;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
            case 4:
                ((CommunityReviewsFragment) obj).R.c(dzh.j.a);
                break;
            case 5:
                break;
            case 6:
                qcy<Object>[] qcyVarArr = fck.t1;
                break;
            case 7:
                x1l x1lVar = (x1l) obj;
                j1a0 j1a0Var = x1lVar.E;
                NotificationCompat.l lVar = new NotificationCompat.l(j1a0Var);
                lVar.f(new NotificationCompat.l.d(x1lVar.p, System.currentTimeMillis(), j1a0Var));
                break;
            case 8:
                qkr0 qkr0Var = ((zam) obj).h;
                if (qkr0Var != null) {
                    qkr0Var.a();
                }
                break;
            case 9:
                break;
            case 10:
                ksm ksmVar = (ksm) obj;
                break;
            case 11:
                break;
            case 12:
                DiscoverSimilarFeedFragment discoverSimilarFeedFragment = (DiscoverSimilarFeedFragment) obj;
                qcy<Object>[] qcyVarArr2 = DiscoverSimilarFeedFragment.s0;
                break;
            case 13:
                int i3 = DisplayMusicPlaylistFragment.b0;
                break;
            case 14:
                break;
            case 15:
                m5p m5pVar = (m5p) obj;
                break;
            case 16:
                int i4 = EntriesListFragment.m0;
                break;
            case 17:
                ror rorVar = (ror) obj;
                rorVar.requestLayout();
                rorVar.invalidate();
                break;
            case 18:
                Peer peer = ((nzr) obj).n.r().a.c;
                peer.getClass();
                break;
            case 19:
                ((zak0) ((fxt0) obj).l).setValue("");
                break;
            case 20:
                yis yisVar = (yis) obj;
                yisVar.n.a(new fss.a((RequestUserProfile) yisVar.m));
                break;
            case 21:
                ((FriendsCleanupFragment) obj).U.a(yns.a.a);
                break;
            case 22:
                int i5 = GamesCatalogFragment.i0;
                break;
            case 23:
                bft bftVar = (bft) obj;
                bftVar.j1.invoke();
                bftVar.dismiss();
                break;
            case 24:
                okt oktVar = (okt) obj;
                ont ontVar = oktVar.d;
                if (ontVar == null || (r0 = ontVar.a) == null) {
                    ewy ewyVar = oktVar.b.b;
                    qcy<Object> qcyVar = GeoComponentImpl.f[0];
                    break;
                }
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                ImDialogsSelectionFragment imDialogsSelectionFragment = (ImDialogsSelectionFragment) obj;
                int i6 = ImDialogsSelectionFragment.n0;
                l7m d = m7m.d(imDialogsSelectionFragment);
                break;
            case 28:
                gzs<s3q0> onLogDump = ((h5x) obj).getOnLogDump();
                if (onLogDump != null) {
                    onLogDump.invoke();
                }
                break;
            default:
                ntx presenter = ((stx) obj).getPresenter();
                if (presenter != null) {
                    presenter.P1();
                }
                break;
        }
        return s3q0.a;
    }
}
