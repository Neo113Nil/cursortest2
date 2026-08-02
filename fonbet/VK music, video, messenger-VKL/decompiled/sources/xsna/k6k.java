package xsna;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.attachpicker.widget.GalleryRecyclerView;
import com.vk.auth.ui.VkAuthPhoneView;
import com.vk.catalog2.common.ui.mvp.friend.FriendsCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.container.FirstPinnedTabLayoutVh;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalLoopVh;
import com.vk.clips.internal.nps.api.di.ClipsInternalNpsComponent;
import com.vk.clips.internal.nps.impl.di.ClipsInternalNpsComponentImpl;
import com.vk.core.view.components.text.VkText;
import com.vk.draftslist.impl.ui.DraftsListFragment;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.api.marketlinkedcontent.router.LinkedContentAnalyticsParams;
import com.vk.ecomm.market.good.linkedcontent.mvi2.ui.MarketLinkedContentFragment;
import com.vk.log.L;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.narratives.impl.highlights.HighlightEditFragment;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.photos.ui.editalbum.presentation.CreateAlbumFragment;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.sharing.core.picker.GroupPickerActivity;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.fragments.friends.FriendsFragment;
import java.util.Iterator;
import xsna.ii00;
import xsna.wu1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class k6k implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k6k(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Object obj;
        Object obj2;
        Object parcelable;
        Object parcelable2;
        int i = this.b;
        boolean z = true;
        z = true;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                int i2 = CreateAlbumFragment.Z;
                return Boolean.valueOf(((CreateAlbumFragment) obj3).requireArguments().getBoolean("RESTORE", false));
            case 1:
                return new xlm(((pdm) obj3).b);
            case 2:
                return new VkText(((egm) obj3).d, null, 6, 0);
            case 3:
                RecyclerView recyclerView = ((DiscoverMediaTabFragment2) obj3).n0;
                Object layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.K(0, 0);
                }
                return s3q0.a;
            case 4:
                DraftsListFragment draftsListFragment = (DraftsListFragment) obj3;
                qcy<Object>[] qcyVarArr = DraftsListFragment.Q;
                Iterator<Integer> it = eeo.c.iterator();
                while (it.hasNext()) {
                    ((DraftsListFragment.b) draftsListFragment.N.getValue()).f.b(it.next().intValue(), (eeo) draftsListFragment.P.getValue());
                }
                return s3q0.a;
            case 5:
                ((io.reactivex.rxjava3.subjects.d) obj3).onComplete();
                return s3q0.a;
            case 6:
                kmp kmpVar = (kmp) obj3;
                kmpVar.j.setAlpha(1.0f);
                kmpVar.k.setAlpha(1.0f);
                fyt0.d(kmpVar.i, null, 5);
                return s3q0.a;
            case 7:
                VkAuthPhoneView vkAuthPhoneView = ((dpp) obj3).t;
                return (vkAuthPhoneView != null ? vkAuthPhoneView : null).getPhoneWithoutCode();
            case 8:
                ((Activity) obj3).finish();
                return s3q0.a;
            case 9:
                fxc0.B().d(((VideoAttachment) obj3).k);
                return s3q0.a;
            case 10:
                return ((uqd) obj3).a();
            case 11:
                wu1.a.c cVar = (wu1.a.c) ((wu1) obj3);
                long j = cVar.a;
                long j2 = cVar.b;
                StringBuilder b = fp.b(j, "Required ", " bytes, but maxAllocationSize is ");
                b.append(j2);
                return b.toString();
            case 12:
                SchemeStat$EventItem schemeStat$EventItem = FirstPinnedTabLayoutVh.F;
                ((tlr) obj3).a();
                return s3q0.a;
            case 13:
                int i3 = FriendsCatalogFragment.V;
                return ((VkClientMultiAccountComponent) m7m.d((FriendsCatalogFragment) obj3).a(fpf0.a(VkClientMultiAccountComponent.class))).a();
            case 14:
                FriendsFragment friendsFragment = (FriendsFragment) obj3;
                if ((friendsFragment.W || friendsFragment.b0) && !friendsFragment.c0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                GalleryRecyclerView galleryRecyclerView = ((GalleryFragmentImpl) obj3).a0;
                return Integer.valueOf(galleryRecyclerView != null ? galleryRecyclerView.getSpanCount() : 1);
            case 16:
                qcy<Object>[] qcyVarArr2 = GeoPostsFragment.q0;
                return new elt(((GeoPostsFragment) obj3).requireArguments().getInt("arg_place_id"));
            case 17:
                int i4 = GroupPickerActivity.G;
                return (SharingComponent) m7m.a((GroupPickerActivity) obj3).a(fpf0.a(SharingComponent.class));
            case 18:
                mtk0<? extends Object> mtk0Var = ((w1v) obj3).w;
                if (mtk0Var == null) {
                    throw jq.f("Font resolution state is not set.");
                }
                mtk0Var.getValue();
                return s3q0.a;
            case 19:
                int i5 = HighlightEditFragment.h0;
                return ((HighlightEditFragment) obj3).requireArguments().getString("ref");
            case 20:
                return ((HorizontalLoopVh) obj3).h;
            case 21:
                quv quvVar = (quv) obj3;
                return new qsv(quvVar.f, new fbh(quvVar, 25), new lrk(quvVar, 19));
            case 22:
                ykw ykwVar = (ykw) obj3;
                ykwVar.p();
                ykwVar.p = false;
                ykwVar.n.requestLayout();
                return s3q0.a;
            case 23:
                return (ClipsInternalNpsComponentImpl) ((k7m) m7m.f((mjx) obj3)).a(fpf0.a(ClipsInternalNpsComponent.class));
            case 24:
                return new a3y((r6y) obj3);
            case 25:
                hn50 hn50Var = (hn50) obj3;
                return "[start ticket] New MVI execution task [" + fpf0.a(hn50Var.getClass()).l() + "] with data: " + hn50Var + ' ' + x100.a(null);
            case 26:
                return ((u59) obj3).b.f();
            case 27:
                li00 li00Var = (li00) obj3;
                li00Var.getClass();
                L.e("Managed groups queue invalidated, will update counters via network");
                li00Var.d.onNext(ii00.e.a);
                return s3q0.a;
            case 28:
                ((com.vk.ecomm.catalog.impl.catalog.simple.a) obj3).k.dispose();
                return s3q0.a;
            default:
                qcy<Object>[] qcyVarArr3 = MarketLinkedContentFragment.R;
                Bundle requireArguments = ((MarketLinkedContentFragment) obj3).requireArguments();
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 33) {
                    parcelable2 = requireArguments.getParcelable("owner_id", UserId.class);
                    obj = (Parcelable) parcelable2;
                } else {
                    Object parcelable3 = requireArguments.getParcelable("owner_id");
                    if (!(parcelable3 instanceof UserId)) {
                        parcelable3 = null;
                    }
                    obj = (UserId) parcelable3;
                }
                UserId userId = (UserId) obj;
                if (userId == null) {
                    return null;
                }
                long j3 = requireArguments.getLong("good_id");
                boolean z2 = requireArguments.getBoolean("is_service", false);
                if (i6 >= 33) {
                    parcelable = requireArguments.getParcelable("analytics_params", LinkedContentAnalyticsParams.class);
                    obj2 = (Parcelable) parcelable;
                } else {
                    Object parcelable4 = requireArguments.getParcelable("analytics_params");
                    if (!(parcelable4 instanceof LinkedContentAnalyticsParams)) {
                        parcelable4 = null;
                    }
                    obj2 = (LinkedContentAnalyticsParams) parcelable4;
                }
                LinkedContentAnalyticsParams linkedContentAnalyticsParams = (LinkedContentAnalyticsParams) obj2;
                if (linkedContentAnalyticsParams == null) {
                    return null;
                }
                return new MarketLinkedContentFragment.LinkedContentArguments(userId, j3, linkedContentAnalyticsParams, z2);
        }
    }

    public /* synthetic */ k6k(hn50 hn50Var, x100 x100Var) {
        this.b = 25;
        this.c = hn50Var;
    }
}
