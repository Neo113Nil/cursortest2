package xsna;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.holders.group.GroupVh;
import com.vk.clips.sdk.shared.item.common.error.ErrorOverlayRenderDelegate;
import com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.BaseBadgeHolder;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.dialogsscreen.impl.DialogsScreenFragment;
import com.vk.dialogstoolbar.impl.di.DialogsToolbarInternalFeatureComponent;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.storefront.api.di.StorefrontComponent;
import com.vk.feed.design.view.newsfeed.list.FeedRecyclerView;
import com.vk.feed.design.view.newsfeed.reactionstack.FeedReactionsStack;
import com.vk.games.presentation.catalog.GamesCatalogFragment;
import com.vk.home.HomeFragment2;
import com.vk.imageloader.view.VKImageView;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.music.playlist.display.audiobook.presentation.fragment.DisplayAudioBookChaptersFragment;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.notifications.list.api.di.NotificationListComponent;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.toggle.features.SmbAdFeatures;
import com.vk.voip.ui.join.directly.withpreview.JoinCallFragment;
import com.vkontakte.android.R;
import java.util.LinkedList;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.dzh;
import xsna.mih0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class krh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ krh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int intValue;
        ViewPager2 viewPager2;
        int i = this.b;
        int i2 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                lrh lrhVar = (lrh) obj;
                return new zeh(lrhVar.s(), (afh) lrhVar.j.getValue());
            case 1:
                ((ryh) obj).b.c(dzh.n.a.a);
                return s3q0.a;
            case 2:
                ((m6h) obj).b(true, false, null);
                return s3q0.a;
            case 3:
                int i3 = com.vk.profile.community.impl.ui.trust_mark.a.p1;
                return ((StorefrontComponent) m7m.d((com.vk.profile.community.impl.ui.trust_mark.a) obj).a(fpf0.a(StorefrontComponent.class))).a();
            case 4:
                RecyclerView recyclerView = ((fhl) obj).a;
                if (recyclerView instanceof UsableRecyclerView) {
                    i2 = ((UsableRecyclerView) recyclerView).getTotalScrollDy();
                } else if (recyclerView instanceof FeedRecyclerView) {
                    i2 = ((FeedRecyclerView) recyclerView).getTotalScrollDy();
                }
                return Integer.valueOf(i2);
            case 5:
                enm enmVar = (enm) obj;
                Toast.makeText(enmVar.itemView.getContext(), "Yep", 0).show();
                dw20 dw20Var = enmVar.l;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                enmVar.l = null;
                return s3q0.a;
            case 6:
                int i4 = DialogsScreenFragment.p0;
                return (DialogsToolbarInternalFeatureComponent) m7m.d((DialogsScreenFragment) obj).mo408a(fpf0.a(DialogsToolbarInternalFeatureComponent.class));
            case 7:
                return ((DiscoverMediaTabFragment2) obj).r0;
            case 8:
                DiscoverSearchFragment discoverSearchFragment = (DiscoverSearchFragment) obj;
                Integer num = discoverSearchFragment.V;
                if (num != null && (intValue = num.intValue()) >= 0 && (viewPager2 = discoverSearchFragment.g0) != null) {
                    viewPager2.e(intValue, false);
                }
                return s3q0.a;
            case 9:
                int i5 = DisplayAudioBookChaptersFragment.b0;
                return (BridgeComponent) m7m.d((DisplayAudioBookChaptersFragment) obj).a(fpf0.a(BridgeComponent.class));
            case 10:
                djo djoVar = (djo) obj;
                oak0.d(djoVar.b, null, new ifg(djoVar, 12));
                return s3q0.a;
            case 11:
                f0p f0pVar = (f0p) obj;
                if (!f0pVar.a0()) {
                    f0pVar.R.finish();
                }
                return s3q0.a;
            case 12:
                int i6 = EntriesListFragment.m0;
                return ((EntriesListFragment) obj).no();
            case 13:
                ((ErrorOverlayRenderDelegate) obj).b.invoke(ErrorOverlayRenderDelegate.ErrorOverlayAction.ButtonClick);
                return s3q0.a;
            case 14:
                int i7 = FeedReactionsStack.r;
                return new b04((FeedReactionsStack) obj, 4);
            case 15:
                ((udr) obj).a = null;
                return s3q0.a;
            case 16:
                return (VKImageView) ((wls) obj).itemView.findViewById(R.id.background_image_view);
            case 17:
                int i8 = GamesCatalogFragment.i0;
                return ((VkClientMultiAccountComponent) m7m.d((GamesCatalogFragment) obj).a(fpf0.a(VkClientMultiAccountComponent.class))).getExperiments();
            case 18:
                ofg ofgVar = (ofg) obj;
                qcy<Object>[] qcyVarArr = GoodFragment.U0;
                return ofgVar;
            case 19:
                return ((y4u) obj).m.d4();
            case 20:
                ((mih0.d) obj).getClass();
                return new BaseBadgeHolder.a.C0709a(R.drawable.vk_icon_chevron_down_small_12, R.attr.vk_ui_icon_contrast);
            case 21:
                return ((piu) obj).findViewById(R.id.texts_container);
            case 22:
                View view = ((GroupVh) obj).E;
                if (view != null) {
                    view.performClick();
                }
                return s3q0.a;
            case 23:
                int i9 = HomeFragment2.x0;
                return ((NotificationListComponent) m7m.d((HomeFragment2) obj).a(fpf0.a(NotificationListComponent.class))).a();
            case 24:
                RecyclerView recyclerView2 = ((jxw) obj).a;
                SmbAdFeatures smbAdFeatures = SmbAdFeatures.FEATURE_SMB_DISCLAIMER_REPOSITION;
                smbAdFeatures.getClass();
                return com.vk.toggle.b.A.a(smbAdFeatures) ? new x0n(recyclerView2) : new v0n(recyclerView2);
            case 25:
                FrameLayout frameLayout = new FrameLayout(((zbx) obj).a.getCtx());
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                return frameLayout;
            case 26:
                int i10 = JoinCallFragment.U;
                ((JoinCallFragment) obj).finish();
                return s3q0.a;
            case 27:
                return ((g7y) obj).l;
            case 28:
                iv00 iv00Var = (iv00) obj;
                int i11 = iv00.p1;
                LinkedList linkedList = new LinkedList(iv00Var.m1);
                iv00Var.m1.clear();
                while (!linkedList.isEmpty()) {
                    ((gzs) linkedList.removeFirst()).invoke();
                }
                return s3q0.a;
            default:
                int i12 = MarketItemCommentsFragment.j0;
                return new u010((MarketItemCommentsFragment) obj);
        }
    }
}
