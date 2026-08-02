package xsna;

import android.animation.Animator;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import com.vk.ads.api.di.AdsComponent;
import com.vk.api.generated.market.dto.MarketItemLabelActionDto;
import com.vk.attachpicker.di.PhotoEditorComponentImpl;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupRedesignCardWithBottomBtnVh;
import com.vk.catalog2.common.ui.mvp.holder.header.FriendsSearchQueryVh;
import com.vk.clips.favorites.api.di.ClipsFavoritesComponent;
import com.vk.common.links.LaunchContext;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.fave.fragments.FavesFragment;
import com.vk.feed.core.models.dzen.DzenStory;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.gallerypicker.di.PhotoEditorComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeDzenStoryItemClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import xsna.bsm;
import xsna.gfu.a;
import xsna.tps0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class mxj implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mxj(FragmentImpl fragmentImpl, Animator animator) {
        this.b = 16;
        this.c = fragmentImpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        xto xtoVar;
        izs<? super MarketItemLabelActionDto, s3q0> izsVar;
        int i = this.b;
        boolean z = true;
        Object obj = this.c;
        switch (i) {
            case 0:
                dw20 dw20Var = ((nxj) obj).c;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 1:
                return new bsm.h((bsm) obj);
            case 2:
                return "removeDialogs: " + ((n580) obj) + ' ';
            case 3:
                return (jtm) ((fum) obj).s.getValue();
            case 4:
                Bundle bundle = (Bundle) obj;
                ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("posts", NewsEntry.class) : bundle.getParcelableArrayList("posts");
                return parcelableArrayList != null ? parcelableArrayList : EmptyList.b;
            case 5:
                return (VkPlaceholder) ((o1o) obj).findViewById(R.id.donut_post_overlay_placeholder);
            case 6:
                vto vtoVar = (vto) obj;
                if (!jjc.b() && (xtoVar = (xto) vtoVar.C) != null) {
                    DzenStory.DzenStoryItem dzenStoryItem = xtoVar.l;
                    maz.c(xwk.d().e(), vtoVar.itemView.getContext(), dzenStoryItem.e.c, LaunchContext.A, null, null, 24);
                    String str = dzenStoryItem.f;
                    if (str != null) {
                        int i2 = xtoVar.m;
                        UiTracker uiTracker = UiTracker.a;
                        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.DZEN_STORY_ITEM, null, null, null, str, null, 46, null), Integer.valueOf(i2), new MobileOfficialAppsFeedStat$TypeDzenStoryItemClick(str))).q();
                    }
                }
                return s3q0.a;
            case 7:
                nwy nwyVar = ((PhotoEditorComponentImpl) ((k7m) m7m.f((com.vk.attachpicker.screen.h) obj)).a(fpf0.a(PhotoEditorComponent.class))).c;
                qcy<Object> qcyVar = PhotoEditorComponentImpl.e[1];
                return (naa0) nwyVar.c();
            case 8:
                return ((View) ((i7p) obj).c.getValue()).findViewById(R.id.scheduleChevron);
            case 9:
                return (AdsComponent) ((k7m) m7m.f((mqp) obj)).mo408a(fpf0.a(AdsComponent.class));
            case 10:
                ftp ftpVar = (ftp) obj;
                ftpVar.d.T(ftpVar.e);
                return s3q0.a;
            case 11:
                ((zak0) ((c9q) obj).c).setValue(Boolean.TRUE);
                return s3q0.a;
            case 12:
                qcy<Object>[] qcyVarArr = FaveFeedFragment.s0;
                return ((FaveFeedFragment) obj).getActivity();
            case 13:
                int i3 = FavesFragment.j0;
                return (ClipsFavoritesComponent) m7m.d((FavesFragment) obj).mo408a(fpf0.a(ClipsFavoritesComponent.class));
            case 14:
                return "StatConfig is invalid: config= " + ((mrk0) obj);
            case 15:
                return ((NewsFeedComponent) ((k7m) m7m.f((com.vk.newsfeed.common.recycler.holders.a) obj)).a(fpf0.a(NewsFeedComponent.class))).l0();
            case 16:
                FragmentImpl fragmentImpl = (FragmentImpl) obj;
                fragmentImpl.x = false;
                if (fragmentImpl.isVisible()) {
                    fragmentImpl.Vn();
                }
                return s3q0.a;
            case 17:
                ((FriendsSearchQueryVh) obj).e.invoke();
                return s3q0.a;
            case 18:
                return (y5u0) ((com.vk.geo.impl.presentation.b) obj).s.b().h.getValue();
            case 19:
                qcy<Object>[] qcyVarArr2 = GeoPostsFragment.q0;
                return m7m.d((GeoPostsFragment) obj);
            case 20:
                return ((gfu) obj).new a();
            case 21:
                com.vk.catalog2.common.ui.holders.group.a.c(((GroupRedesignCardWithBottomBtnVh) obj).l, false);
                return s3q0.a;
            case 22:
                xuy xuyVar = (xuy) j5g.a0(((fxu) obj).b.j().f());
                if (xuyVar == null || (xuyVar.getIndex() <= 0 && xuyVar.getOffset() >= 0)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 23:
                return new tps0.a(((gex) obj).e, -1, null, 1, iah0.a(12), null, 224);
            case 24:
                fvv0 M = ((x6y) obj).M();
                return Boolean.valueOf(rl3.G(x6y.C, M != null ? Long.valueOf(M.getAppId()) : null));
            case 25:
                whz whzVar = (whz) obj;
                VkImageSimple vkImageSimple = (VkImageSimple) whzVar.getView().findViewById(R.id.replay);
                bwt0.i0(vkImageSimple, new i4h(whzVar, 29));
                f4m.j(vkImageSimple);
                return vkImageSimple;
            case 26:
                d010 d010Var = (d010) obj;
                MarketItemLabelActionDto marketItemLabelActionDto = ((e010) ((zak0) d010Var.n).getValue()).b;
                if (marketItemLabelActionDto != null && (izsVar = d010Var.m) != null) {
                    izsVar.invoke(marketItemLabelActionDto);
                }
                return s3q0.a;
            case 27:
                kr20 kr20Var = ((pr20) obj).o;
                (kr20Var != null ? kr20Var : null).x0(-1);
                return s3q0.a;
            case 28:
                TextPaint textPaint = new TextPaint();
                com.vk.typography.b.c(textPaint, ((hk30) obj).a, FontFamily.MEDIUM, Float.valueOf(17.0f), TextSizeUnit.SP);
                return textPaint;
            default:
                Context context = ((uu30) obj).d;
                return (context != null ? context : null).getString(R.string.vkim_msg_list_wall_reply_title_primary);
        }
    }

    public /* synthetic */ mxj(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
