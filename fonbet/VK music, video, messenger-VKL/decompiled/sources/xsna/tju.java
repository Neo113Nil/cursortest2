package xsna;

import android.content.Context;
import android.view.View;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.dialogsscreen.impl.GroupDialogsScreenFragment;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.im.reactions.impl.set_reaction.list.ReactionListController;
import com.vk.libvideo.design.view.live.LiveView;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.posting.PostingFragment;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.toggle.features.MusicFeatures;
import com.vk.video.playlist.playlistscreen.di.PlaylistScreenFragmentInternalComponent;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsFragmentInternalComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsListFragment;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class tju implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tju(GroupDialogsScreenFragment groupDialogsScreenFragment, View view) {
        this.b = 0;
        this.c = view;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        boolean z = true;
        Object obj = this.c;
        switch (i) {
            case 0:
                View view = (View) obj;
                int i2 = GroupDialogsScreenFragment.e0;
                zdw zdwVar = i7o0.b;
                (zdwVar != null ? zdwVar : null).k.getClass();
                dhr0.a.e0(R.attr.vk_ui_background_content, view.findViewById(R.id.dialogs_toolbar_container));
                return s3q0.a;
            case 1:
                return ((NewsFeedComponent) ((k7m) m7m.f((pdv) obj)).a(fpf0.a(NewsFeedComponent.class))).G2();
            case 2:
                return new azv((und0) obj);
            case 3:
                ((h5x) obj).setStyleChooserExpanded(!r4.getStyleChooserExpanded());
                return s3q0.a;
            case 4:
                return new v1n0(((q1y) obj).c);
            case 5:
                return new nvp(((u5y) obj).c);
            case 6:
                int i3 = LiveView.p0;
                ((LiveView) obj).s(true);
                return s3q0.a;
            case 7:
                ((zak0) ((su10) obj).m).setValue(Boolean.valueOf(!((Boolean) ((zak0) r0).getValue()).booleanValue()));
                return s3q0.a;
            case 8:
                com.vk.im.ui.formatters.spans.dialogitem.a aVar = (com.vk.im.ui.formatters.spans.dialogitem.a) obj;
                Context context = aVar.a;
                boolean z2 = aVar.b;
                int i4 = R.attr.vk_ui_text_accent_themed;
                if ((!z2 || !aVar.d) && aVar.c) {
                    i4 = R.attr.vk_ui_text_subhead;
                }
                return Integer.valueOf(e3m.f(i4, context));
            case 9:
                Context context2 = ((yr30) obj).d;
                return (context2 != null ? context2 : null).getResources().getString(R.string.vkim_msg_list_market_desc);
            case 10:
                ((wh50) obj).setValue(Boolean.FALSE);
                return s3q0.a;
            case 11:
                return ((MarketComponent) ((k7m) m7m.f((com.vk.newsfeed.common.helpers.a) obj)).a(fpf0.a(MarketComponent.class))).I8();
            case 12:
                return Integer.valueOf(((mc90) obj).r());
            case 13:
                return new fn30(((yk70) obj).b);
            case 14:
                if (((Boolean) ((nt70) obj).b.getValue()).booleanValue()) {
                    eqy<bek0> eqyVar = com.vk.toggle.d.a;
                    z = com.vk.toggle.b.A.a(MusicFeatures.AUDIO_NEW_KIDS_DOWNLOADED_SECTION);
                }
                return Boolean.valueOf(z);
            case 15:
                return ((xk80) obj).y;
            case 16:
                return Integer.valueOf(((yn80) obj).r);
            case 17:
                return Integer.valueOf(((VkPeopleSearchParams) ((zak0) ((lv90) obj).l1).getValue()).c);
            case 18:
                PlaylistScreenFragmentInternalComponent playlistScreenFragmentInternalComponent = (PlaylistScreenFragmentInternalComponent) obj;
                PlaylistScreenFragmentInternalComponent.a aVar2 = PlaylistScreenFragmentInternalComponent.x;
                cea Ef = playlistScreenFragmentInternalComponent.Ef();
                nwy nwyVar = playlistScreenFragmentInternalComponent.u;
                qcy<Object> qcyVar = PlaylistScreenFragmentInternalComponent.y[11];
                return Ef.e((tda) nwyVar.c());
            case 19:
                NewsfeedRouter f = ((y1c0) obj).f();
                e2c0 e2c0Var = new e2c0();
                e2c0Var.a = new p580(f);
                return e2c0Var;
            case 20:
                int i5 = PostingFragment.s0;
                return ((NewsFeedComponent) m7m.d((PostingFragment) obj).a(fpf0.a(NewsFeedComponent.class))).Vb();
            case 21:
                i0d0 i0d0Var = (i0d0) obj;
                return new w0d0(i0d0Var.d, i0d0Var.c, i0d0Var.a);
            case 22:
                return ((kiu) obj).a.a;
            case 23:
                ReactionListController reactionListController = (ReactionListController) obj;
                Integer num = reactionListController.f.e;
                return Integer.valueOf(num != null ? num.intValue() : e3m.a(R.dimen.vkim_legacy_reactions_item_padding, reactionListController.a.getContext()));
            case 24:
                com.vk.registration.funnels.b.z(com.vk.registration.funnels.b.a, SchemeStatSak$EventScreen.REGISTRATION_INFO_ABOUT_YOURSELF_ADD, (ArrayList) obj, null, null, 28);
                return s3q0.a;
            case 25:
                koh0 koh0Var = (koh0) obj;
                koh0Var.r(koh0Var.g, koh0Var.h);
                return s3q0.a;
            case 26:
                SearchResultsImplVh searchResultsImplVh = (SearchResultsImplVh) obj;
                if (searchResultsImplVh.g.a) {
                    searchResultsImplVh.d.clear();
                }
                searchResultsImplVh.f(false);
                return s3q0.a;
            case 27:
                zli0 zli0Var = (zli0) obj;
                return Integer.valueOf(znk0.A(zli0Var, zli0Var.k));
            case 28:
                return ((SettingsFragmentInternalComponent) obj).b.A();
            default:
                int i6 = SettingsListFragment.X0;
                return ((VkClientMultiAccountComponent) m7m.d((SettingsListFragment) obj).a(fpf0.a(VkClientMultiAccountComponent.class))).a();
        }
    }

    public /* synthetic */ tju(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
