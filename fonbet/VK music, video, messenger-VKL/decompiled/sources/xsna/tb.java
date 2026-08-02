package xsna;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.api.photos.PhotosGetAlbums;
import com.vk.catalog.mvi.block.music.impl.artists.mix.ArtistMix$ArtistMixState;
import com.vk.catalog.mvi.block.music.impl.entity.PlayingState;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.im.MsgType;
import com.vk.dto.polls.Poll;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.friends.impl.friends.presentation.fragment.AbsFriendsFragment;
import com.vk.im.channelcreation.impl.e;
import com.vk.im.channelcreation.impl.i;
import com.vk.im.reporters.api.analytics.click.ImChatManagementClickAnalyticsItem;
import com.vk.libvideo.live.impl.views.chat.a;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.photos.root.albumdetails.presentation.i;
import com.vk.photos.ui.album_list.AlbumsListFragment;
import com.vk.superapp.api.dto.auth.UserItem;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.feature.entity.AlbumChooseState;
import com.vk.voip.ui.broadcast.fragments.info.StreamInfoFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.ca9;
import xsna.kd0;
import xsna.m30;
import xsna.o9c;
import xsna.ph4;
import xsna.rfb;
import xsna.sr0;
import xsna.tj50;
import xsna.uxd0;
import xsna.wgb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class tb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        z84 z84Var;
        ly30 ly30Var;
        int i = 14;
        boolean z = true;
        int i2 = 0;
        switch (this.b) {
            case 0:
                AbsFriendsFragment absFriendsFragment = (AbsFriendsFragment) this.c;
                View view = absFriendsFragment.c0;
                if (view == null) {
                    view = null;
                }
                RecyclerPaginatedView recyclerPaginatedView = absFriendsFragment.Z;
                View progressView = (recyclerPaginatedView != null ? recyclerPaginatedView : null).getProgressView();
                if (progressView != null && progressView.getVisibility() == 0) {
                    i2 = 8;
                }
                view.setVisibility(i2);
                absFriendsFragment.so();
                return s3q0.a;
            case 1:
                bqh0 bqh0Var = (bqh0) this.c;
                qcy<Object>[] qcyVarArr = ph.n1;
                bqh0Var.b(bqh0Var.g);
                return s3q0.a;
            case 2:
                m30 m30Var = (m30) this.c;
                return new m30.a(LayoutInflater.from(m30Var.h).inflate(R.layout.im_channel_actions_item, (ViewGroup) obj, false), m30Var.i);
            case 3:
                jd0 jd0Var = (jd0) obj;
                kd0.a aVar = ((ld0) this.c).b;
                if (aVar != null) {
                    aVar.a(jd0Var);
                }
                return s3q0.a;
            case 4:
                ((jr0) this.c).T(new sr0.g());
                return s3q0.a;
            case 5:
                return AlbumChooseState.a((AlbumChooseState) obj, null, (List) this.c, 0, false, false, false, 125);
            case 6:
                ((gg1) this.c).p.b(i.C1485i.a);
                return s3q0.a;
            case 7:
                PhotosGetAlbums.a aVar2 = (PhotosGetAlbums.a) obj;
                AlbumsListFragment albumsListFragment = ((qo1) this.c).b;
                dm1 dm1Var = albumsListFragment.Y;
                if (dm1Var == null) {
                    dm1Var = null;
                }
                dm1Var.clear();
                dm1 dm1Var2 = albumsListFragment.Y;
                if (dm1Var2 == null) {
                    dm1Var2 = null;
                }
                dm1Var2.n0(aVar2.a);
                dm1 dm1Var3 = albumsListFragment.Y;
                if (dm1Var3 == null) {
                    dm1Var3 = null;
                }
                dm1Var3.n0(aVar2.b);
                aq2 aq2Var = albumsListFragment.T;
                if (aq2Var == null) {
                    aq2Var = null;
                }
                aq2Var.f0();
                aq2 aq2Var2 = albumsListFragment.T;
                if (aq2Var2 == null) {
                    aq2Var2 = null;
                }
                aq2Var2.getRecyclerView().setVerticalScrollBarEnabled(false);
                aq2 aq2Var3 = albumsListFragment.T;
                (aq2Var3 != null ? aq2Var3 : null).Mk();
                return s3q0.a;
            case 8:
                com.vk.articles.a aVar3 = (com.vk.articles.a) this.c;
                Poll poll = (Poll) obj;
                if (aVar3 != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("votingId", poll.b);
                    jSONObject.put("isBoard", poll.j ? 1 : 0);
                    s3q0 s3q0Var = s3q0.a;
                    aVar3.f("pollUpdate", jSONObject);
                }
                return s3q0.a;
            case 9:
                ArtistMix$ArtistMixState artistMix$ArtistMixState = (ArtistMix$ArtistMixState) obj;
                return new ArtistMix$ArtistMixState(artistMix$ArtistMixState.b, artistMix$ArtistMixState.c, artistMix$ArtistMixState.d, artistMix$ArtistMixState.e, (PlayingState) this.c, artistMix$ArtistMixState.g, artistMix$ArtistMixState.h, artistMix$ArtistMixState.i, artistMix$ArtistMixState.j);
            case 10:
                b94 b94Var = (b94) this.c;
                boolean z2 = b94Var.r;
                ArrayList arrayList = b94Var.s;
                if (z2) {
                    o64 o64Var = b94Var.m.C;
                    s64 s64Var = o64Var instanceof s64 ? (s64) o64Var : null;
                    if (s64Var != null) {
                        s64Var.a();
                    }
                } else {
                    b94Var.r = true;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        b94Var.d((List) it.next());
                    }
                }
                if (!arrayList.isEmpty() && (z84Var = b94Var.t) != null) {
                    z84Var.b.Na();
                }
                return s3q0.a;
            case 11:
                ((ng4) this.c).j.b(new ph4.l(false));
                return s3q0.a;
            case 12:
                lj5 lj5Var = (lj5) this.c;
                shh0 shh0Var = (shh0) obj;
                if (!lj5Var.a(shh0Var.c) && !lj5Var.b(shh0Var.c)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                r46 r46Var = (r46) this.c;
                int intValue = ((Integer) obj).intValue();
                r46Var.d.r().getClass();
                if (intValue < 5) {
                    r46Var.d.D(r46Var, new iim(r46Var.c.f));
                    r46Var.d.r().O.x().a(new ImChatManagementClickAnalyticsItem.b(true, ImChatManagementClickAnalyticsItem.Source.CHAT_PROFILE));
                } else {
                    r46Var.k(new uxd0.f0());
                }
                return s3q0.a;
            case 14:
                UserItem userItem = (UserItem) obj;
                ((al6) this.c).y.put(userItem.b.b, Integer.valueOf(userItem.i));
                return s3q0.a;
            case 15:
                ((z37) this.c).b((com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.a) obj);
                return s3q0.a;
            case 16:
                ((j58) this.c).h.setForeground((Drawable) obj);
                return s3q0.a;
            case 17:
                zjw0 zjw0Var = (zjw0) this.c;
                l7s l7sVar = zjw0Var.h;
                ng8 ng8Var = new ng8(l7sVar.getString(R.string.voip_broadcast_label_stats), l7sVar.getString(R.string.voip_broadcast_label_main), Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                int i3 = StreamInfoFragment.S;
                StreamInfoFragment.a.a(zjw0Var.i, ng8Var);
                return s3q0.a;
            case 18:
                return ca9.c.a((ca9.c) obj, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, ((Boolean) this.c).booleanValue(), null, false, null, false, null, -1, 510);
            case 19:
                m99 m99Var = (m99) this.c;
                Set set = (Set) obj;
                ca9 ca9Var = m99Var.j().c;
                if (ca9Var instanceof ca9.c) {
                    m99Var.f(s99.a(m99Var.j(), null, null, ca9.c.a((ca9.c) ca9Var, null, null, null, null, null, null, set, null, null, null, false, null, null, null, null, false, null, false, null, false, null, -262145, ApiInvocationException.ErrorCodes.IDS_BLOCKED), null, null, null, null, false, 251));
                }
                return s3q0.a;
            case 20:
                b.d dVar = (b.d) obj;
                Integer num = ((am9) this.c).b;
                if (num != null) {
                    nf9 nf9Var = nf9.b;
                    nf9.n(dVar, num);
                }
                return s3q0.a;
            case 21:
                return Boolean.valueOf(((LinkedHashSet) this.c).contains(((UIBlock) obj).Fb()));
            case 22:
                ((com.vk.im.channelcreation.impl.b) this.c).n(new i.d(new e.f(R.string.im_channel_removal)));
                return s3q0.a;
            case 23:
                int i4 = ChannelFragment.a1;
                ((ChannelFragment) this.c).zo((PopupStickerAnimation) obj);
                return s3q0.a;
            case 24:
                wgb wgbVar = (wgb) this.c;
                wgb.b bVar = (wgb.b) obj;
                int i5 = 10;
                if (!bVar.e) {
                    wgbVar.b.a(new g5(wgbVar, i5));
                    return s3q0.a;
                }
                wgbVar.b.a(new i70(wgbVar, i));
                sfb a = wgbVar.f.a(new rfb.a.b(aeb.e, wgbVar.a, Math.max(bVar.a.f.size() + 1, 10)));
                List<dcf0> list = bVar.c;
                if (list != null && !bVar.h) {
                    list = j5g.O0(wgbVar.h.b().b.c.values());
                }
                wgbVar.e(wgb.b.a(bVar, a.a, a.b, list, 0, false, false, false, 248));
                wgbVar.b.a(new j70(wgbVar, 13));
                return s3q0.a;
            case 25:
                oob oobVar = (oob) this.c;
                MsgType msgType = (MsgType) obj;
                if (msgType != null) {
                    oobVar.g.getClass();
                    if (msgType instanceof MsgType.Silent) {
                        ly30Var = new ly30(null, null, null, 14);
                    } else if (msgType instanceof MsgType.WithTtl) {
                        ly30Var = new ly30(null, Long.valueOf(((MsgType.WithTtl) msgType).b), null, 11);
                    } else {
                        if (!msgType.equals(MsgType.Delayed.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ly30Var = new ly30(null, null, null, 15);
                    }
                    oobVar.G(ly30Var);
                }
                return s3q0.a;
            case 26:
                ((usb) this.c).a.a();
                return s3q0.a;
            case 27:
                ((a.j) this.c).invoke((AdminLeaveAction) obj);
                return s3q0.a;
            case 28:
                return new o9c.d(((tj50.a) obj).a(new pz((w7c) this.c, i), ao8.d));
            default:
                tad tadVar = (tad) this.c;
                Integer num2 = (Integer) obj;
                num2.intValue();
                tadVar.f.invoke(num2);
                return s3q0.a;
        }
    }
}
