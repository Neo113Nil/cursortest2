package xsna;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.messages.dto.MessagesChatSettingsDto;
import com.vk.api.generated.messages.dto.MessagesChatSettingsPhotoDto;
import com.vk.api.generated.messages.dto.MessagesConversationWithMessageDto;
import com.vk.api.generated.messages.dto.MessagesGetConversationMembersDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoGetCommentsExtendedResponseDto;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicArtistNew;
import com.vk.catalog2.feature.music.holders.artist.ArtistInfoNewVh;
import com.vk.channels.impl.list.loader.ChannelsListItemsLoader;
import com.vk.clips.entrypoints.feature.c;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.item.clip.ClipItemAction;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.content.design.view.camera.ShutterButton;
import com.vk.core.preference.Preference;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.WritePermission;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Thumb;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.activities.Activity;
import com.vk.dto.newsfeed.activities.LikesActivity;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.edu.common.api.di.EduCommonComponent;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.events.channels.OnChannelsCacheInvalidateEvent;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.log.L;
import com.vk.money.createtransfer.people.VkPayInfo;
import com.vk.music.bottomsheets.audiobook.presentation.model.AudioBookModel;
import com.vk.music.view.ThumbsImageView;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.photos.root.albums.presentation.g;
import com.vk.stickers.autosuggest.AutoSuggestStickersPopupWindow;
import com.vk.voip.ui.broadcast.fragments.scheduled.BroadcastScheduledFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.g0v;
import xsna.ogb;
import xsna.ta7;
import xsna.tj50;
import xsna.xn50;
import xsna.y5c;
import xsna.zy6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class pd implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pd(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        CharSequence string$lambda$0;
        o3c0 o3c0Var;
        MessagesChatSettingsPhotoDto e;
        Integer d;
        String title;
        com.vk.im.engine.models.dialogs.c ic;
        ChatSettings Hb;
        int i = this.b;
        r2 = null;
        String str = null;
        boolean z = true;
        z = true;
        z = true;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                string$lambda$0 = qd.toString$lambda$0((qd) obj2, obj);
                return string$lambda$0;
            case 1:
                sl0 sl0Var = (sl0) obj2;
                NewsEntry newsEntry = (NewsEntry) obj;
                Activity activity = sl0Var.b.get(new Pair(Long.valueOf(k9q0.o(newsEntry).b), Integer.valueOf(di60.n(newsEntry))));
                if (activity != null && (newsEntry instanceof Post) && (activity instanceof LikesActivity)) {
                    LikesActivity likesActivity = (LikesActivity) activity;
                    if (likesActivity.f == LikesActivity.Position.DEFAULT) {
                        o3c0Var = new o3c0((Post) newsEntry, likesActivity);
                        return pn60.c(sl0Var.a, newsEntry, o3c0Var, null, 12);
                    }
                }
                o3c0Var = null;
                return pn60.c(sl0Var.a, newsEntry, o3c0Var, null, 12);
            case 2:
                kp0 kp0Var = (kp0) obj2;
                izs<VkPayInfo.VkPayState, s3q0> izsVar = kp0Var.l;
                jp0 jp0Var = kp0Var.m;
                throw null;
            case 3:
                com.vk.photos.root.albums.presentation.e eVar = (com.vk.photos.root.albums.presentation.e) obj2;
                tj50.a aVar = (tj50.a) obj;
                kp1 kp1Var = new kp1(eVar, 0);
                ao8 ao8Var = ao8.d;
                return new g.a(aVar.a(kp1Var, ao8Var), aVar.a(new com.vk.photos.root.albums.presentation.d(1, eVar, com.vk.photos.root.albums.presentation.e.class, "buildAlbumsListState", "buildAlbumsListState(Lcom/vk/photos/root/albums/presentation/AlbumsState;)Lcom/vk/photos/root/albums/presentation/AlbumsViewState$ListState;", 0), ao8Var));
            case 4:
                JSONObject jSONObject = (JSONObject) obj;
                return vj90.a(jSONObject, (Owner) ((LongSparseArray) obj2).get(jSONObject.optLong("owner_id")));
            case 5:
                ArtistInfoNewVh artistInfoNewVh = (ArtistInfoNewVh) obj2;
                uq3 uq3Var = (uq3) obj;
                if (epx.f(uq3Var.a.b, artistInfoNewVh.D)) {
                    UIBlockMusicArtistNew uIBlockMusicArtistNew = artistInfoNewVh.o;
                    UIBlockMusicArtistNew uIBlockMusicArtistNew2 = uIBlockMusicArtistNew != null ? uIBlockMusicArtistNew : null;
                    if (uIBlockMusicArtistNew2 != null) {
                        Artist artist = uIBlockMusicArtistNew2.z;
                        boolean z2 = uq3Var.b;
                        artist.i = z2;
                        artistInfoNewVh.j(z2, artist.h);
                    }
                }
                return s3q0.a;
            case 6:
                ju3 ju3Var = (ju3) obj2;
                g0v g0vVar = ((iyu0) obj).f;
                if (epx.f(g0vVar, g0v.b.a)) {
                    ju3Var.h(true);
                } else {
                    if (!(g0vVar instanceof g0v.a) && !(g0vVar instanceof g0v.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ju3Var.h(false);
                }
                return s3q0.a;
            case 7:
                wd4 wd4Var = (wd4) obj;
                vd4 vd4Var = ((nh4) obj2).i1;
                vd4 vd4Var2 = vd4Var != null ? vd4Var : null;
                ThumbsImageView thumbsImageView = vd4Var2.i;
                wc4 wc4Var = vd4Var2.n;
                RecyclerView recyclerView = vd4Var2.m;
                AudioBookModel audioBookModel = wd4Var.b;
                View view = vd4Var2.d;
                view.addOnAttachStateChangeListener(vd4Var2.f);
                com.vk.music.player.d dVar = vd4Var2.e;
                boolean b = dVar.b();
                vd4Var2.g.setVisibility(b ? 0 : 8);
                vd4Var2.h.setVisibility(b ? 0 : 8);
                view.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
                recyclerView.setAdapter(wc4Var);
                p4g.n(wc4Var.d, wd4Var.c);
                wc4Var.notifyDataSetChanged();
                vd4Var2.j.setText(audioBookModel.d);
                vd4Var2.l.setVisibility(audioBookModel.c ? 0 : 8);
                vd4Var2.k.setText(audioBookModel.e);
                Image image = audioBookModel.f;
                if (image == null) {
                    thumbsImageView.setThumb(lso0.a);
                } else {
                    thumbsImageView.setThumb(new Thumb(image));
                }
                vd4Var2.s0(dVar.d.b);
                return s3q0.a;
            case 8:
                AutoSuggestStickersPopupWindow autoSuggestStickersPopupWindow = (AutoSuggestStickersPopupWindow) obj2;
                nxc0 nxc0Var = (nxc0) autoSuggestStickersPopupWindow.u.c.getValue();
                nxc0Var.c = "";
                nxc0Var.d = false;
                nxc0Var.e = null;
                nxc0Var.f.clear();
                autoSuggestStickersPopupWindow.c.post(new iv1(autoSuggestStickersPopupWindow, z ? 1 : 0));
                return s3q0.a;
            case 9:
                ((mp5) obj2).l.set(false);
                L.G("error: " + ((Throwable) obj));
                return s3q0.a;
            case 10:
                MessagesConversationWithMessageDto messagesConversationWithMessageDto = (MessagesConversationWithMessageDto) obj2;
                MessagesGetConversationMembersDto messagesGetConversationMembersDto = (MessagesGetConversationMembersDto) obj;
                long j = messagesConversationWithMessageDto.d().g().d().b;
                MessagesChatSettingsDto f = messagesConversationWithMessageDto.d().f();
                String str2 = (f == null || (title = f.getTitle()) == null) ? "" : title;
                MessagesChatSettingsDto f2 = messagesConversationWithMessageDto.d().f();
                if (f2 != null && (d = f2.d()) != null) {
                    r4 = d.intValue();
                }
                int i2 = r4;
                MessagesChatSettingsDto f3 = messagesConversationWithMessageDto.d().f();
                if (f3 != null && (e = f3.e()) != null) {
                    str = e.g();
                }
                ox6 ox6Var = new ox6(i2, str2, str, j);
                List<UsersUserFullDto> g = messagesGetConversationMembersDto.g();
                if (g == null) {
                    g = EmptyList.b;
                }
                List<UsersUserFullDto> list = g;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (UsersUserFullDto usersUserFullDto : list) {
                    Serializer.c<ProfileFriendItem> cVar = ProfileFriendItem.CREATOR;
                    arrayList.add(ProfileFriendItem.a.b(usersUserFullDto));
                }
                return new jsj(ox6Var, arrayList);
            case 11:
                ((y17) obj2).b.L2(new zy6.a(((Integer) obj).intValue()));
                return s3q0.a;
            case 12:
                qa7 qa7Var = (qa7) obj;
                ((ma7) obj2).T(new ta7.c.b(new la7(qa7Var.a, qa7Var.b)));
                return s3q0.a;
            case 13:
                int i3 = BroadcastScheduledFragment.U;
                ((BroadcastScheduledFragment) obj2).tn();
                return s3q0.a;
            case 14:
                ((ze00) obj2).b.c.invoke();
                return s3q0.a;
            case 15:
                CameraUIView cameraUIView = (CameraUIView) obj2;
                float f4 = CameraUIView.w1;
                ShutterButton shutter = cameraUIView.getShutter();
                cameraUIView.g(shutter != null ? shutter.getPosCur() : -1);
                return s3q0.a;
            case 16:
                ((pua) obj2).c.a1();
                return s3q0.a;
            case 17:
                sxp sxpVar = (sxp) obj;
                ((lxa) obj2).getClass();
                if (!(sxpVar instanceof r280) && !(sxpVar instanceof OnChannelsCacheInvalidateEvent) && !(sxpVar instanceof p680)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 18:
                ((ChannelsListItemsLoader) obj2).g.onNext(new ogb.b.a((Throwable) obj));
                return s3q0.a;
            case 19:
                ChatFragment chatFragment = (ChatFragment) obj2;
                ChatFragment.d dVar2 = ChatFragment.w1;
                Dialog dialog = (Dialog) ((ipm) obj).a.c.get(Long.valueOf(chatFragment.ho()));
                if (dialog != null && (Hb = dialog.Hb()) != null && Hb.J) {
                    lqb.a(chatFragment.requireContext(), new rp1(4, chatFragment, dialog.Zb()), chatFragment.mo().x());
                    chatFragment.kn().onNavigateUp();
                    return s3q0.a;
                }
                if (dialog != null) {
                    Peer a = chatFragment.ko().a();
                    long ho = chatFragment.ho();
                    Serializer.c<Peer> cVar2 = Peer.CREATOR;
                    Peer b2 = Peer.a.b(ho);
                    WritePermission.State state = dialog.oc().a;
                    if (((Boolean) chatFragment.g1.getValue()).booleanValue()) {
                        b2.getClass();
                        if (b2.Ab(Peer.Type.USER) && !chatFragment.i0) {
                            u6p ue = ((EduCommonComponent) chatFragment.h1.getValue()).ue();
                            e43.l(a, b2);
                            io.reactivex.rxjava3.internal.operators.single.x a2 = ue.a();
                            asu0 asu0Var = asu0.a;
                            chatFragment.N.b(hg1.i(a2.q(asu0Var.c()).m(asu0Var.d()), new rqb(state, chatFragment, b2, a, 0)));
                        }
                    }
                }
                if (dialog != null && (ic = dialog.ic()) != null) {
                    alm almVar = chatFragment.c1;
                    (almVar != null ? almVar : null).d(ic);
                }
                return s3q0.a;
            case 20:
                ((qrb) obj2).a.d();
                return s3q0.a;
            case 21:
                y5c.a aVar2 = ((y5c) obj2).i;
                gm0 gm0Var = new gm0((ViewGroup) obj, aVar2);
                jjc.g(gm0Var.itemView, new fm0(aVar2, r4));
                return gm0Var;
            case 22:
                ((io.reactivex.rxjava3.subjects.g) obj2).onNext(((ixw) obj).d);
                return s3q0.a;
            case 23:
                j03.j(((gwc) obj2).f, (Throwable) obj);
                return s3q0.a;
            case 24:
                int i4 = ClipFeedListFragment.a2;
                ((axc) ((ClipFeedListFragment) obj2).t1.getValue()).b(k15.z((SdkClipVideoFile) obj));
                return s3q0.a;
            case 25:
                o1d o1dVar = (o1d) obj2;
                ClipItemAction.v vVar = new ClipItemAction.v(true, false);
                o1dVar.getClass();
                xn50.a.c(o1dVar, vVar);
                return s3q0.a;
            case 26:
                und undVar = (und) obj2;
                return fae.b(undVar.j, (VideoGetCommentsExtendedResponseDto) obj, undVar.a, undVar.g, undVar.f == 1, 24);
            case 27:
                ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
                ((ClipsDraftPersistentStore) obj).getClass();
                ClipsDraftPersistentStore.p(true);
                ClipsDraftPersistentStore.s();
                atd atdVar = ((lsd) obj2).d.k;
                atdVar.getClass();
                ClipsDraftPersistentStore clipsDraftPersistentStore2 = ClipsDraftPersistentStore.b;
                ka kaVar = new ka(atdVar, 22);
                clipsDraftPersistentStore2.getClass();
                ClipsDraftPersistentStore.o(kaVar);
                return s3q0.a;
            case 28:
                io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.core.q) ((iz) obj2).invoke((com.vk.clips.editor.state.model.a) obj);
                if (qVar != null) {
                }
                return s3q0.a;
            default:
                com.vk.clips.entrypoints.feature.b bVar = (com.vk.clips.entrypoints.feature.b) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean z3 = !booleanValue;
                if (!booleanValue) {
                    bVar.f.getClass();
                    nsd nsdVar = fvr.c;
                    r4 = nsdVar != null ? nsdVar.b() : (int) Preference.m(0L, "clips_draft_prefs", "unseen_drafts_pref");
                }
                bVar.T(new c.d(z3, r4));
                return s3q0.a;
        }
    }

    public /* synthetic */ pd(wx6 wx6Var, MessagesConversationWithMessageDto messagesConversationWithMessageDto) {
        this.b = 10;
        this.c = messagesConversationWithMessageDto;
    }
}
