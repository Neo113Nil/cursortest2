package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dialogslist.api.list.DialogsListConfigToken;
import com.vk.dialogslist.impl.di.DialogsListInternalFeatureComponent;
import com.vk.dialogsscreen.impl.GroupDialogsScreenFragment;
import com.vk.dto.common.Peer;
import com.vk.dto.user.RequestUserProfile;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.friends.groupinvite.api.di.InviteFriendsComponent;
import com.vk.friends.impl.cleanup.presentation.fragment.FriendsCleanupFragment;
import com.vk.im.engine.di.ImConfigurationComponent;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.dialog_header.DialogHeaderController;
import com.vk.im.ui.fragments.ImDialogsSelectionFragment;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.importcontacts.impl.presentation.details.fragment.ImportContactsDetailsFragment;
import com.vk.music.playlist.api.di.MusicClickByPlaylistItemHandlerComponent;
import com.vk.music.playlist.display.presentation.DisplayMusicPlaylistFragment;
import com.vk.newsfeed.common.views.header.CompactHeaderAvatarView;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vkontakte.android.R;
import xsna.fss;
import xsna.jtm;
import xsna.mem;
import xsna.yns;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class x5i implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x5i(Context context, CompactHeaderAvatarView compactHeaderAvatarView) {
        this.b = 0;
        this.c = compactHeaderAvatarView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        DialogHeaderController.b bVar;
        a1w a1wVar;
        Object obj;
        Object parcelable;
        int i = 12;
        r2 = null;
        a1w a1wVar2 = null;
        switch (this.b) {
            case 0:
                CompactHeaderAvatarView compactHeaderAvatarView = (CompactHeaderAvatarView) this.c;
                int i2 = CompactHeaderAvatarView.j;
                return Integer.valueOf(compactHeaderAvatarView.getResources().getDimensionPixelSize(R.dimen.post_header_avatar_size));
            case 1:
                return (TextView) ((a1j) this.c).itemView.findViewById(R.id.voip_empty_room_placeholder);
            case 2:
                return ((o8j) this.c).g;
            case 3:
                return ((ImConfigurationComponent) ((k7m) m7m.f((com.vk.im.ui.components.contacts.a) this.c)).a(fpf0.a(ImConfigurationComponent.class))).b0();
            case 4:
                com.vk.profile.questions.impl.b bVar2 = (com.vk.profile.questions.impl.b) this.c;
                int i3 = com.vk.profile.questions.impl.b.q1;
                bVar2.hide();
                return s3q0.a;
            case 5:
                fck fckVar = (fck) this.c;
                qcy<Object>[] qcyVarArr = fck.t1;
                return ((InviteFriendsComponent) m7m.d(fckVar).mo408a(fpf0.a(InviteFriendsComponent.class))).a();
            case 6:
                return new com.vk.im.popup.b(((zam) this.c).a);
            case 7:
                mem.a aVar = ((sem) this.c).l;
                if (aVar != null) {
                    mem memVar = mem.this;
                    DialogHeaderController.b bVar3 = memVar.t;
                    if (bVar3 != null) {
                        bVar3.a();
                    }
                    Msg msg = (Msg) j5g.a0(memVar.r.f);
                    if (msg != null && (bVar = memVar.t) != null) {
                        com.vk.im.ui.components.msg_list.a aVar2 = ChatFragment.this.H0;
                        (aVar2 != null ? aVar2 : null).n2(msg);
                    }
                }
                return s3q0.a;
            case 8:
                dsm dsmVar = (dsm) this.c;
                DialogsListConfigToken dialogsListConfigToken = dsmVar.o;
                if (dialogsListConfigToken != null) {
                    Peer peer = dsmVar.t.r().a.c;
                    peer.getClass();
                    return (esm) ((gsm) dsmVar.e(hsm.class, String.valueOf(peer.Ab(Peer.Type.GROUP)), new w9(i))).e(dialogsListConfigToken);
                }
                a1w a1wVar3 = dsmVar.t;
                mxv mxvVar = dsmVar.u;
                b25 a = o25.a();
                jtm.a.getClass();
                return new ism(a1wVar3, mxvVar, a, jtm.a.b, dsmVar.p, ((DialogsListInternalFeatureComponent) m7m.d(dsmVar.n).mo408a(fpf0.a(DialogsListInternalFeatureComponent.class))).O5());
            case 9:
                r3n r3nVar = (r3n) this.c;
                return new g7o(new q3n(r3nVar, r3n.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), new x3i(r3nVar, 6));
            case 10:
                DiscoverSimilarFeedFragment discoverSimilarFeedFragment = (DiscoverSimilarFeedFragment) this.c;
                qcy<Object>[] qcyVarArr2 = DiscoverSimilarFeedFragment.s0;
                h3p0.b(discoverSimilarFeedFragment);
                return s3q0.a;
            case 11:
                DisplayMusicPlaylistFragment displayMusicPlaylistFragment = (DisplayMusicPlaylistFragment) this.c;
                int i4 = DisplayMusicPlaylistFragment.b0;
                return (MusicClickByPlaylistItemHandlerComponent) m7m.d(displayMusicPlaylistFragment).mo408a(fpf0.a(MusicClickByPlaylistItemHandlerComponent.class));
            case 12:
                qxo qxoVar = (qxo) this.c;
                RecyclerView recyclerView = (RecyclerView) qxoVar.c.findViewById(R.id.vk_multi_account_loading_switcher_recycler);
                recyclerView.setAdapter(qxoVar.g);
                recyclerView.setItemAnimator(null);
                return recyclerView;
            case 13:
                EntriesListFragment entriesListFragment = (EntriesListFragment) this.c;
                int i5 = EntriesListFragment.m0;
                return (MarketComponent) m7m.d(entriesListFragment).a(fpf0.a(MarketComponent.class));
            case 14:
                ((Runnable) this.c).run();
                return s3q0.a;
            case 15:
                FaveFeedFragment faveFeedFragment = (FaveFeedFragment) this.c;
                qcy<Object>[] qcyVarArr3 = FaveFeedFragment.s0;
                int i6 = 9;
                return new xq60(new tbh(faveFeedFragment, 13), new s1m(faveFeedFragment, i6), new mxj(faveFeedFragment, i), new gbj(faveFeedFragment, i6));
            case 16:
                qor qorVar = (qor) this.c;
                qorVar.requestLayout();
                qorVar.invalidate();
                return s3q0.a;
            case 17:
                RecyclerView recyclerView2 = ((r2s) this.c).f;
                return new com.vk.im.popup.b((recyclerView2 != null ? recyclerView2 : null).getContext());
            case 18:
                ((zak0) ((fxt0) this.c).h).setValue("");
                return s3q0.a;
            case 19:
                yis yisVar = (yis) this.c;
                yisVar.n.a(new fss.a((RequestUserProfile) yisVar.m));
                return s3q0.a;
            case 20:
                ((FriendsCleanupFragment) this.c).U.a(yns.c.a);
                return s3q0.a;
            case 21:
                return Integer.valueOf(((GalleryFragmentImpl) this.c).m0);
            case 22:
                bft bftVar = (bft) this.c;
                bftVar.j1.invoke();
                bftVar.dismiss();
                return s3q0.a;
            case 23:
                ((uut) this.c).j();
                return s3q0.a;
            case 24:
                ((wh50) this.c).setValue(Boolean.TRUE);
                return s3q0.a;
            case 25:
                return ((fgu) this.c).itemView.findViewById(R.id.voip_fullscreen_loading_group);
            case 26:
                GroupDialogsScreenFragment groupDialogsScreenFragment = (GroupDialogsScreenFragment) this.c;
                int i7 = GroupDialogsScreenFragment.e0;
                Peer lo = GroupDialogsScreenFragment.lo(groupDialogsScreenFragment.getArguments());
                if (!BuildInfo.s() || !lo.Ab(Peer.Type.GROUP) ? (a1wVar = q1w.a) != null : (a1wVar = q1w.b) != null) {
                    a1wVar2 = a1wVar;
                }
                groupDialogsScreenFragment.mo(lo);
                return a1wVar2;
            case 27:
                Bundle bundle = ((ImDialogsSelectionFragment) this.c).Y;
                if (bundle == null) {
                    bundle = null;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = bundle.getParcelable("owner_id", Peer.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = bundle.getParcelable("owner_id");
                    obj = (Peer) (parcelable2 instanceof Peer ? parcelable2 : null);
                }
                Peer peer2 = (Peer) obj;
                if (peer2 != null) {
                    return peer2;
                }
                Serializer.c<Peer> cVar = Peer.CREATOR;
                return Peer.Unknown.e;
            case 28:
                return ((z8w) this.c).h();
            default:
                ImportContactsDetailsFragment importContactsDetailsFragment = (ImportContactsDetailsFragment) this.c;
                int i8 = ImportContactsDetailsFragment.O;
                importContactsDetailsFragment.Mf(-1, null);
                return s3q0.a;
        }
    }

    public /* synthetic */ x5i(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
