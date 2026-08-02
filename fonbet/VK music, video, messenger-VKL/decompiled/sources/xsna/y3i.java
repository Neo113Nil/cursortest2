package xsna;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dialogsscreen.impl.GroupDialogsScreenFragment;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.Peer;
import com.vk.dto.common.actions.Action;
import com.vk.dto.discover.carousel.apps.AppCarousel;
import com.vk.ecomm.catalog.impl.di.MarketCatalogComponent;
import com.vk.friends.impl.friends.presentation.fragment.FriendsSelectionFragment;
import com.vk.im.edu.common.api.di.EduCommonComponent;
import com.vk.im.engine.event.publisher.di.ImEventPublisherComponent;
import com.vk.im.reporters.api.msg.OpenMessagesHistoryReporter;
import com.vk.im.ui.fragments.ImDialogsSelectionFragment;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.music.analytics.api.di.MusicAnalyticsComponent;
import com.vk.music.playlist.display.presentation.DisplayMusicPlaylistFragment;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import com.vk.onboarding.api.stat.VkOnboardingStat$Type;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.search.params.api.VkFeedSearchParams;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class y3i implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y3i(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        LinkButton linkButton;
        Action action;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((y89) obj).invoke(CommunityProfileAction.e.i.c.b);
                return s3q0.a;
            case 1:
                return ((EduCommonComponent) ((k7m) m7m.f((com.vk.im.ui.components.contacts.a) obj)).mo408a(fpf0.a(EduCommonComponent.class))).x7();
            case 2:
                qcy<Object>[] qcyVarArr = fck.t1;
                return ((AuthBridgeComponent) m7m.d((fck) obj).a(fpf0.a(AuthBridgeComponent.class))).s();
            case 3:
                Peer peer = ((dsm) obj).t.r().a.c;
                peer.getClass();
                return String.valueOf(peer.Ab(Peer.Type.GROUP));
            case 4:
                com.vk.im.ui.components.dialogs_list.c cVar = (com.vk.im.ui.components.dialogs_list.c) obj;
                if (cVar.e.j.invoke().booleanValue()) {
                    cau0 cau0Var = cVar.d.r().h;
                }
                return false;
            case 5:
                int i2 = DisplayMusicPlaylistFragment.b0;
                return ((MusicAnalyticsComponent) m7m.d((DisplayMusicPlaylistFragment) obj).a(fpf0.a(MusicAnalyticsComponent.class))).Bd();
            case 6:
                qxo qxoVar = (qxo) obj;
                RecyclerView recyclerView = (RecyclerView) qxoVar.c.findViewById(R.id.vk_multi_account_switcher_recycler);
                recyclerView.setAdapter(qxoVar.f);
                return recyclerView;
            case 7:
                qcy<Object>[] qcyVarArr2 = FaveFeedFragment.s0;
                return new boq(new g4g((FaveFeedFragment) obj, 16));
            case 8:
                wh50<VkFeedSearchParams> wh50Var = ((o4r) obj).j1;
                boolean z = !((VkFeedSearchParams) ((zak0) wh50Var).getValue()).c;
                zak0 zak0Var = (zak0) wh50Var;
                VkFeedSearchParams copy = ((VkFeedSearchParams) zak0Var.getValue()).copy();
                copy.c = z;
                zak0Var.setValue(copy);
                return s3q0.a;
            case 9:
                ((yis) obj).q6();
                return s3q0.a;
            case 10:
                return (VkOnboardingStat$Delegate) ((lrs) obj).b.invoke(VkOnboardingStat$Type.Tooltip, "com:ctlg_friends");
            case 11:
                Object obj2 = ((FriendsSelectionFragment) obj).h0;
                ((md6) (obj2 != null ? obj2 : null)).h();
                return s3q0.a;
            case 12:
                int i3 = GalleryFragmentImpl.R0;
                ((com.vk.lists.c) obj).p(false);
                return s3q0.a;
            case 13:
                y4u y4uVar = (y4u) obj;
                return new hc10(y4uVar.j.c, y4uVar.n.ob());
            case 14:
                int i4 = GroupDialogsScreenFragment.e0;
                return ((VkClientMultiAccountComponent) m7m.d((GroupDialogsScreenFragment) obj).a(fpf0.a(VkClientMultiAccountComponent.class))).a();
            case 15:
                return Boolean.valueOf(o25.b(((ImDialogsSelectionFragment) obj).V));
            case 16:
                return (ImEventPublisherComponent) ((g8m) obj).a(fpf0.a(ImEventPublisherComponent.class));
            case 17:
                return new a9w((z8w) obj);
            case 18:
                VkCell vkCell = (VkCell) ((ViewStub) obj).inflate();
                bwt0.Z(R.attr.vk_ui_background_content, vkCell);
                return vkCell;
            case 19:
                h5x h5xVar = (h5x) obj;
                h5xVar.setAreViewsClickable(!h5xVar.getAreViewsClickable());
                izs<Boolean, s3q0> onChangeViewsAreClickable = h5xVar.getOnChangeViewsAreClickable();
                if (onChangeViewsAreClickable != null) {
                    onChangeViewsAreClickable.invoke(Boolean.valueOf(h5xVar.getAreViewsClickable()));
                }
                return s3q0.a;
            case 20:
                return new e2n0(((n1y) obj).c);
            case 21:
                MarketCatalogComponent marketCatalogComponent = (MarketCatalogComponent) obj;
                return new zu00(marketCatalogComponent.a, marketCatalogComponent.b, marketCatalogComponent.c);
            case 22:
                return ((mdz) ((bg20) obj).f.getValue()).a(OpenMessagesHistoryReporter.Span.LOAD_MESSAGES);
            case 23:
                yq20 yq20Var = (yq20) obj;
                AppCarousel appCarousel = (AppCarousel) yq20Var.q6();
                if (appCarousel != null && (linkButton = appCarousel.i) != null && (action = linkButton.c) != null) {
                    hd60.a().v(action, yq20Var.itemView.getContext(), (r20 & 4) != 0 ? null : null, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? null : null, (r20 & 32) != 0 ? null : null, null, (r20 & 128) != 0 ? null : 423);
                }
                return s3q0.a;
            case 24:
                iy20.g(8, (Context) obj);
                return s3q0.a;
            case 25:
                return ((jl30) obj).k().a(OpenMessagesHistoryReporter.Span.LOAD_MUTUAL_FRIENDS);
            case 26:
                ((com.vk.movika.sdk.base.logic.processor.actions.e) obj).invoke();
                return s3q0.a;
            case 27:
                return ((zn30) obj).e().getString(R.string.vkim_accessibility_icon_play);
            case 28:
                Context context = ((qr30) obj).d;
                return (context != null ? context : null).getString(R.string.vkim_msg_story_single);
            default:
                xv40 xv40Var = (xv40) obj;
                if (gz80.a(26)) {
                    return new AudioFocusRequest.Builder(1).setOnAudioFocusChangeListener(xv40Var).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).setLegacyStreamType(3).build()).build();
                }
                return null;
        }
    }

    public /* synthetic */ y3i(iy20 iy20Var, Context context) {
        this.b = 24;
        this.c = context;
    }
}
