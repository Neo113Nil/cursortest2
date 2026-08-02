package xsna;

import androidx.preference.Preference;
import com.vk.api.base.VkPaginationList;
import com.vk.attachpicker.adapter.PhotoSmallAdapter;
import com.vk.attachpicker.b;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.external.miniapp.net.ad.AdvertisementConfig;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.AbsFriendsAndFollowersTabFragment;
import com.vk.im.engine.models.dialogs.Dialog;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.net.impl.JavaUploadDataSinkBase;
import org.chromium.net.impl.JavaUrlRequestUtils;
import xsna.bls;
import xsna.c4u;
import xsna.fit;
import xsna.jw00;
import xsna.ogb;
import xsna.rls;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class q7 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.c, mw, a0i, Preference.b, io.reactivex.rxjava3.functions.m, b.d, JavaUrlRequestUtils.CheckedRunnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        Preference preference2 = (Preference) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        preference2.F(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // xsna.mw
    public void a(boolean z) {
        ((i1d) this.c).b.a(new j3d(z));
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (ogb.a) ((vg3) this.c).invoke((ogb.a) obj, obj2);
    }

    public void b(rls rlsVar) {
        AbsFriendsAndFollowersTabFragment absFriendsAndFollowersTabFragment = (AbsFriendsAndFollowersTabFragment) this.c;
        int i = AbsFriendsAndFollowersTabFragment.X;
        if (rlsVar instanceof rls.b) {
            xn50.a.c(absFriendsAndFollowersTabFragment, bls.b.C2612b.b);
            return;
        }
        if (rlsVar instanceof rls.c) {
            xn50.a.c(absFriendsAndFollowersTabFragment, bls.b.a.b);
            return;
        }
        if (rlsVar instanceof rls.d) {
            xn50.a.c(absFriendsAndFollowersTabFragment, bls.c.a.b);
        } else if (rlsVar instanceof rls.a) {
            xn50.a.c(absFriendsAndFollowersTabFragment, bls.c.b.b);
        } else {
            if (!(rlsVar instanceof sls)) {
                throw new NoWhenBranchMatchedException();
            }
            xn50.a.c(absFriendsAndFollowersTabFragment, yks.b);
        }
    }

    @Override // xsna.a0i
    public void c(zzh zzhVar) {
        CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) this.c;
        communityReviewsFragment.Q.getClass();
        com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[] a = c0i.a(zzhVar);
        xn50.a.d(communityReviewsFragment, (kj50[]) Arrays.copyOf(a, a.length));
    }

    @Override // com.vk.attachpicker.b.d
    public List e() {
        return ((PhotoSmallAdapter) this.c).L0();
    }

    @Override // org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable
    public void run() {
        ((JavaUploadDataSinkBase) this.c).lambda$readFromProvider$3();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((ht) this.c).invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (List) ((s8) obj2).invoke(obj);
            case 1:
            case 3:
            case 8:
            case 14:
            case 15:
            case 17:
            case 18:
            case 22:
            default:
                return (jw00.c) ((pey) obj2).invoke(obj);
            case 2:
                int i2 = ym0.k1;
                return (io.reactivex.rxjava3.core.b0) ((rm0) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.t) ((sf1) obj2).invoke(obj);
            case 5:
                return (List) ((ff5) obj2).invoke(obj);
            case 6:
                return (k08) ((ht) obj2).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.t) ((sf1) obj2).invoke(obj);
            case 9:
                return (ncq0) ((sf1) obj2).invoke(obj);
            case 10:
                return (ClipsEditorMusicInfo) ((ht) obj2).invoke(obj);
            case 11:
                return (iag) ((mmf) obj2).invoke(obj);
            case 12:
                return (s3q0) ((t1e) obj2).invoke(obj);
            case 13:
                return (b4g0) ((izs) obj2).invoke(obj);
            case 16:
                return (vqt) ((rm0) obj2).invoke(obj);
            case 19:
                return (List) ((ht) obj2).invoke(obj);
            case 20:
                return (Optional) ((mmf) obj2).invoke(obj);
            case 21:
                return (VkPaginationList) ((f2s) obj2).invoke(obj);
            case 23:
                return (AdvertisementConfig) ((fit.l) obj2).invoke(obj);
            case 24:
                return (c4u.a) ((f2s) obj2).invoke(obj);
            case 25:
                return (VkPaginationList) ((s2v) obj2).invoke(obj);
            case 26:
                return (Dialog) ((j1w) obj2).invoke(obj);
        }
    }
}
