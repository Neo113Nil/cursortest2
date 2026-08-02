package xsna;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.bridges.di.BridgeComponent;
import com.vk.comments.api.di.CommentsComponent;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dialogsscreen.impl.GroupDialogsScreenFragment;
import com.vk.dzenarticle.impl.ui.entity.DzenArticleState;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.MarketItemReviewRepliesFragment;
import com.vk.friends.impl.di.FeedFriendsComponentImpl;
import com.vk.games.presentation.catalog.GamesCatalogFragment;
import com.vk.geo.impl.di.GeoComponentImpl;
import com.vk.money.createtransfer.chat.CreateChatTransferFragment;
import com.vk.music.model.di.AudioModelsComponent;
import com.vk.music.player.api.di.PlayerUIComponent;
import com.vk.music.playlist.display.presentation.DisplayMusicPlaylistFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.superapp.ui.shimmer.ShimmerFrameLayout;
import com.vk.voip.ui.avatars.VoipAvatarViewContainer;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.gtn;
import xsna.w1g0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class z3i implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z3i(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        AppBarLayout appBarLayout;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) ((mtk0) obj).getValue();
                bool.booleanValue();
                return bool;
            case 1:
                return (VoipAvatarViewContainer) ((c1j) obj).itemView.findViewById(R.id.voip_room_participant_avatar);
            case 2:
                LayoutNode f = itl.f((puj) obj);
                if (!f.u) {
                    voy.a(f).e(f);
                }
                return s3q0.a;
            case 3:
                CreateChatTransferFragment createChatTransferFragment = (CreateChatTransferFragment) obj;
                int i2 = CreateChatTransferFragment.F0;
                Object obj2 = createChatTransferFragment.m0;
                ((d7k) (obj2 != null ? obj2 : null)).g();
                dw20 dw20Var = createChatTransferFragment.B0;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
            case 4:
                return new ivw(((ksm) obj).a);
            case 5:
                return ((NewsFeedComponent) ((k7m) m7m.c(((aym) obj).itemView)).a(fpf0.a(NewsFeedComponent.class))).l0();
            case 6:
                qcy<Object>[] qcyVarArr = DiscoverSimilarFeedFragment.s0;
                return ((DiscoverSimilarFeedFragment) obj).getActivity();
            case 7:
                int i3 = DisplayMusicPlaylistFragment.b0;
                return ((PlayerUIComponent) m7m.d((DisplayMusicPlaylistFragment) obj).a(fpf0.a(PlayerUIComponent.class))).Ne();
            case 8:
                return ((gtn.a) obj).l.b(VkCell.Region.LeftMain);
            case 9:
                return new DzenArticleState(((oro) obj).e(), null, null, null, null, null, false, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null);
            case 10:
                ((xuo) obj).c();
                return s3q0.a;
            case 11:
                return (ShimmerFrameLayout) ((qxo) obj).c.findViewById(R.id.ecosystem_switcher_loading_layout);
            case 12:
                qcy<Object>[] qcyVarArr2 = FeedFriendsComponentImpl.f;
                return new tns(new z4f((FeedFriendsComponentImpl) obj, 20));
            case 13:
                return ((CommentsComponent) ((k7m) m7m.c(((f6s) obj).G)).mo408a(fpf0.a(CommentsComponent.class))).jd();
            case 14:
                ((ufs) obj).i = new lqj0("precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                return s3q0.a;
            case 15:
                int i4 = GamesCatalogFragment.i0;
                return ((BridgeComponent) m7m.d((GamesCatalogFragment) obj).a(fpf0.a(BridgeComponent.class))).H2();
            case 16:
                ewy ewyVar = ((okt) obj).b.e;
                qcy<Object> qcyVar = GeoComponentImpl.f[3];
                return (s6r) ewyVar.c();
            case 17:
                int i5 = GroupDialogsScreenFragment.e0;
                View view = ((GroupDialogsScreenFragment) obj).getView();
                if (view != null && (appBarLayout = (AppBarLayout) view.findViewById(R.id.dialogs_toolbar_container)) != null) {
                    appBarLayout.g(true, false, true);
                }
                return s3q0.a;
            case 18:
                ((zak0) ((uku) obj).b).setValue(Boolean.valueOf(!((Boolean) ((zak0) r0).getValue()).booleanValue()));
                return s3q0.a;
            case 19:
                return new cr4((AudioModelsComponent) ((k7m) m7m.f((pdv) obj)).a(fpf0.a(AudioModelsComponent.class)));
            case 20:
                return new zcw((und0) obj);
            case 21:
                return (MarketComponent) ((gxw) obj).c().a(fpf0.a(MarketComponent.class));
            case 22:
                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.c cVar = (com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.c) obj;
                cVar.c.a();
                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.d dVar = cVar.c;
                dVar.f(false);
                dVar.c();
                return s3q0.a;
            case 23:
                return new qvp(((q1y) obj).c);
            case 24:
                return new s1n0(((u5y) obj).c);
            case 25:
                qcy<Object>[] qcyVarArr3 = MarketItemReviewRepliesFragment.b0;
                ((MarketItemReviewRepliesFragment) obj).eo(w1g0.h.b);
                return s3q0.a;
            case 26:
                ((zak0) ((su10) obj).l).setValue(Boolean.valueOf(!((Boolean) ((zak0) r0).getValue()).booleanValue()));
                return s3q0.a;
            case 27:
                int i6 = c430.h1;
                ((c430) obj).dismiss();
                return s3q0.a;
            case 28:
                com.vk.im.ui.formatters.spans.dialogitem.a aVar = (com.vk.im.ui.formatters.spans.dialogitem.a) obj;
                return Integer.valueOf(e3m.f((aVar.b && aVar.d) ? R.attr.vk_ui_text_accent_themed : aVar.c ? R.attr.vk_ui_text_subhead : R.attr.vk_ui_text_accent, aVar.a));
            default:
                Context context = ((yr30) obj).d;
                return (context != null ? context : null).getResources().getString(R.string.vkim_msg_link_single);
        }
    }
}
