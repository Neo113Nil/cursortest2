package xsna;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.config.dynamic.baseview.cusview.MoreOfferContainerView;
import com.vk.articles.ArticleFragment;
import com.vk.catalog2.common.dto.api.CatalogUserMeta;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.core.analytics.tracking.FriendsAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.friend.FriendsItemSearchListVh;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.a;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.superapp.browser.internal.ui.shortcats.ShortcutActivity;
import one.video.controls.view.ErrorView;
import xsna.o0r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ko3 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ko3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                ArticleFragment articleFragment = (ArticleFragment) this.c;
                Article article = articleFragment.T;
                if (article != null) {
                    articleFragment.R2(new ArticleAttachment(article));
                    break;
                }
                break;
            case 1:
                ((ttb) this.c).e.onClose();
                break;
            case 2:
                ((x6d) this.c).e.a.a(ClipItemViewEvent.o.b);
                break;
            case 3:
                ((k8p) this.c).a.invoke(a.C1768a.b);
                break;
            case 4:
                zop zopVar = (zop) this.c;
                otu0 un = zopVar.un();
                Context requireContext = zopVar.requireContext();
                SchemeStatSak$EventScreen u5 = zopVar.u5();
                un.getClass();
                otu0.b(requireContext, u5);
                break;
            case 5:
                ((ErrorView) this.c).t.run();
                break;
            case 6:
                FriendsItemSearchListVh friendsItemSearchListVh = (FriendsItemSearchListVh) this.c;
                UIBlockProfile uIBlockProfile = friendsItemSearchListVh.i;
                if (uIBlockProfile != null) {
                    UserProfile userProfile = uIBlockProfile.A;
                    CatalogUserMeta catalogUserMeta = uIBlockProfile.y;
                    UserId userId = catalogUserMeta.c;
                    friendsItemSearchListVh.g(uIBlockProfile, new FriendsAnalyticsInfo(FriendsAnalyticsInfo.ClickTarget.Open));
                    friendsItemSearchListVh.d.b(new ap0(userId), false);
                    SearchStatInfoProvider searchStatInfoProvider = friendsItemSearchListVh.e;
                    o0r0.a aVar = new o0r0.a(false, "friends", catalogUserMeta.d, null, searchStatInfoProvider != null ? searchStatInfoProvider.b(SchemeStat$EventItem.Type.USER, catalogUserMeta.d, false) : null, null, null, false, false, false, false, null, null, null, 65504);
                    o0r0 e = xwk.e();
                    VkRichCell vkRichCell = friendsItemSearchListVh.g;
                    e.m((vkRichCell != null ? vkRichCell : null).getContext(), userProfile.c, aVar);
                    break;
                }
                break;
            case 7:
                ((MoreOfferContainerView) this.c).b(view);
                break;
            case 8:
                View view2 = (View) this.c;
                if (view2 != null) {
                    view2.performClick();
                    break;
                }
                break;
            case 9:
                god0 god0Var = (god0) this.c;
                ncr<vcr<?>> ncrVar = god0Var.b;
                if (ncrVar != null && ncrVar.t()) {
                    god0Var.a.i();
                    break;
                }
                break;
            default:
                ehj0 ehj0Var = ((ShortcutActivity) this.c).f;
                if (ehj0Var == null) {
                    ehj0Var = null;
                }
                ehj0Var.a();
                break;
        }
    }
}
