package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.TextView;
import androidx.media.MediaBrowserServiceCompat;
import com.vk.api.external.exceptions.VKWebAuthException;
import com.vk.api.generated.friends.dto.FriendsDeleteResponseDto;
import com.vk.auth.main.SignUpRouter;
import com.vk.auth.restore.RestoreReason;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.catalog2.feature.music.holders.MusicTrackCellVh;
import com.vk.clips.design.view.filter.CorrectionsView;
import com.vk.clips.design.view.preview.ClipsVideoAndPhotoView;
import com.vk.clips.sdk.common.provider.ClipsComposeImageLoader;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.dto.user.RequestUserProfile;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.ecomm.fave.api.models.FaveMarketItem;
import com.vk.friends.impl.followers.presentation.fragments.AbsFollowersListFragment;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastAuthor;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastStream;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySource;
import com.vk.music.playlist.display.domain.LoadPlaylistTracksRequest;
import com.vk.music.playlist.display.domain.e;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.newsfeed.impl.posting.settings.mvi.PostingSettingsState;
import com.vk.newsfeed.impl.posting.settings.mvi.e;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vk.subscription.api.SubscribeStatus;
import com.vk.superapp.api.dto.identity.WebIdentityLabel;
import com.vk.superapp.auth.js.bridge.api.events.GetAuthToken$Error;
import com.vk.superapp.base.js.bridge.Responses$AuthError;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.builders.SetBuilder;
import xsna.c0v0;
import xsna.jvv;
import xsna.k840;
import xsna.ksc;
import xsna.ksf;
import xsna.o360;
import xsna.pin0;
import xsna.qvq;
import xsna.tra0;
import xsna.wk50;
import xsna.xbo0;
import xsna.ypt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ma implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ma(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x039f, code lost:
    
        if (r3.getHeight() != r0.getHeight()) goto L126;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.vk.libvideo.live.api.broadcast_settings.models.BroadcastStream] */
    /* JADX WARN: Type inference failed for: r7v11, types: [com.vk.libvideo.live.api.broadcast_settings.models.BroadcastAuthor] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object obj2;
        UIBlockMusicTrack uIBlockMusicTrack;
        int i = 3;
        Object obj3 = null;
        boolean z = true;
        int i2 = 0;
        switch (this.b) {
            case 0:
                TextView textView = (TextView) this.c;
                AbsFollowersListFragment absFollowersListFragment = (AbsFollowersListFragment) this.d;
                int i3 = AbsFollowersListFragment.Y;
                textView.setText(j03.g(absFollowersListFragment.mo2getContext(), (Throwable) obj, R.string.error));
                return s3q0.a;
            case 1:
                UserId userId = (UserId) this.c;
                Integer num = (Integer) this.d;
                Triple triple = (Triple) obj;
                UserProfile userProfile = (UserProfile) triple.d();
                List list = (List) triple.g();
                List list2 = (List) triple.h();
                List D0 = j5g.D0(new ti8(userId, i2), list);
                List D02 = j5g.D0(new si8(i2), list2);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj4 : D02) {
                    UserId a = fkq0.a(((VideoFile) obj4).I0());
                    ?? r12 = linkedHashMap.get(a);
                    if (r12 == null) {
                        r12 = new ArrayList();
                        linkedHashMap.put(a, r12);
                    }
                    ((List) r12).add(obj4);
                }
                BroadcastAuthor.CurrentUser currentUser = new BroadcastAuthor.CurrentUser(userProfile);
                ArrayList a2 = ui8.a(currentUser, linkedHashMap);
                List list3 = D0;
                ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(new BroadcastAuthor.Group((Group) it.next()));
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(ui8.a((BroadcastAuthor.Group) it2.next(), linkedHashMap));
                }
                ArrayList u0 = j5g.u0(arrayList, Collections.singletonList(currentUser));
                HashMap hashMap = new HashMap();
                hashMap.put(currentUser, a2);
                int size = arrayList.size();
                while (i2 < size) {
                    hashMap.put(arrayList.get(i2), arrayList2.get(i2));
                    i2++;
                }
                Iterator it3 = u0.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj2 = it3.next();
                        if (kd8.a((BroadcastAuthor) obj2).equals(userId)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                ?? r7 = (BroadcastAuthor) obj2;
                if (r7 != 0) {
                    currentUser = r7;
                }
                BroadcastStream.New r0 = BroadcastStream.New.b;
                List list4 = (List) hashMap.get(currentUser);
                if (list4 != null) {
                    Iterator it4 = list4.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            Object next = it4.next();
                            if (epx.f(yj8.a((BroadcastStream) next), num)) {
                                obj3 = next;
                            }
                        }
                    }
                    ?? r6 = (BroadcastStream) obj3;
                    if (r6 != 0) {
                        r0 = r6;
                    }
                }
                return new ri8(u0, hashMap, currentUser, r0);
            case 2:
                return laa.s((laa) this.c, (String) this.d, null, null, null, null, null, (List) obj, null, null, 446);
            case 3:
                ArrayList arrayList3 = (ArrayList) this.c;
                l22 l22Var = (l22) this.d;
                wow wowVar = new wow(arrayList3);
                ((nvy) obj).e(arrayList3.size(), new dr8(new rf(18), wowVar), new n8c(wowVar, i2), new jai(802480018, new o8c(wowVar, l22Var), true));
                return s3q0.a;
            case 4:
                ((rzq0) obj).b(j5g.H0(((ksc.b) ((ksc) this.c)).c, 2), new yrc((ClipsComposeImageLoader) this.d));
                return s3q0.a;
            case 5:
                whf whfVar = (whf) this.c;
                return new xhf(whfVar.getState(), whfVar.b(), ((dhf) this.d).b);
            case 6:
                k8 k8Var = (k8) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                Bitmap bitmap2 = (Bitmap) obj;
                float f = ClipsVideoAndPhotoView.e;
                if (bitmap2 != null) {
                    bitmap = bitmap2;
                }
                k8Var.invoke(bitmap);
                return s3q0.a;
            case 7:
                wuf wufVar = (wuf) this.c;
                ksf ksfVar = (ksf) this.d;
                int i4 = ClipsWrapperFragment.Q0;
                qgi0.h((tgi0) obj, wufVar.getTopBar().getContext().getString(((ksf.b) ksfVar).c));
                return s3q0.a;
            case 8:
                CorrectionsView correctionsView = (CorrectionsView) this.c;
                lwj lwjVar = (lwj) this.d;
                correctionsView.t.h.H0(new dxh(lwjVar.a, i), new nh2(((Float) obj).floatValue(), 1));
                izs<? super lwj, s3q0> izsVar = correctionsView.w;
                if (izsVar != null) {
                    izsVar.invoke(lwjVar);
                }
                return s3q0.a;
            case 9:
                psm psmVar = (psm) this.c;
                Set set = (Set) this.d;
                oum oumVar = (oum) obj;
                oum a3 = oum.a(oumVar, null, null, null, null, set, null, null, null, null, null, null, null, 4079);
                SetBuilder setBuilder = new SetBuilder();
                Set<Peer> set2 = oumVar.e;
                ArrayList arrayList4 = new ArrayList(c5g.u(set2, 10));
                Iterator it5 = set2.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(Long.valueOf(((Peer) it5.next()).b));
                }
                setBuilder.addAll(arrayList4);
                Set set3 = set;
                ArrayList arrayList5 = new ArrayList(c5g.u(set3, 10));
                Iterator it6 = set3.iterator();
                while (it6.hasNext()) {
                    arrayList5.add(Long.valueOf(((Peer) it6.next()).b));
                }
                setBuilder.addAll(arrayList5);
                s3q0 s3q0Var = s3q0.a;
                return psmVar.w(a3, setBuilder.d());
            case 10:
                ((com.vk.music.playlist.display.domain.b) this.c).T(new e.b(LoadPlaylistTracksRequest.a((LoadPlaylistTracksRequest) this.d, 0, LoadPlaylistTracksRequest.State.COMPLETED, 47), (List) obj));
                return s3q0.a;
            case 11:
                Context context = (Context) this.c;
                gzs gzsVar = (gzs) this.d;
                enj.q(R.string.document_error_unable_to_download, 0, context);
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 12:
                String str = (String) this.c;
                String str2 = (String) this.d;
                hyg0 hyg0Var = (hyg0) obj;
                qyg0 V0 = hyg0Var.V0("DELETE FROM podcast_to_episodes WHERE uid = ? AND mid = ?");
                try {
                    V0.D3(1, str);
                    V0.D3(2, str2);
                    V0.step();
                    int p = sv1.p(hyg0Var);
                    V0.close();
                    return Integer.valueOf(p);
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 13:
                ((wk50.a) this.c).a(new qvq.b.a((qvq.i) ((qvq) this.d), (Throwable) obj));
                return s3q0.a;
            case 14:
                ypt yptVar = (ypt) this.c;
                ypt.a aVar = (ypt.a) this.d;
                Throwable th2 = (Throwable) obj;
                rvp rvpVar = yptVar.e;
                Throwable cause = th2.getCause();
                if (cause == null) {
                    cause = th2;
                }
                if (cause instanceof VKWebAuthException) {
                    VKWebAuthException vKWebAuthException = (VKWebAuthException) cause;
                    String d = vKWebAuthException.d();
                    if (d == null) {
                        d = "";
                    }
                    String g = vKWebAuthException.g();
                    if (g == null) {
                        g = "";
                    }
                    String h = vKWebAuthException.h();
                    rvpVar.a(GetAuthToken$Error.Data.Type.AUTH_ERROR, new Responses$AuthError(null, new Responses$AuthError.ErrorData(d, h != null ? h : "", g), 1, null), null);
                } else {
                    ypt.b(rvpVar, fco0.h(aVar.b, th2));
                }
                return s3q0.a;
            case 15:
                jvv.a aVar2 = (jvv.a) this.c;
                jvv jvvVar = (jvv) this.d;
                int adapterPosition = aVar2.getAdapterPosition();
                List<WebIdentityLabel> list5 = jvvVar.c;
                c0v0.b bVar = jvvVar.d;
                if (adapterPosition >= list5.size()) {
                    bVar.invoke(new WebIdentityLabel(0, ""));
                } else {
                    bVar.invoke(list5.get(aVar2.getAdapterPosition()));
                }
                return s3q0.a;
            case 16:
                wh50 wh50Var = (wh50) this.c;
                wh50Var.setValue(zbo0.a((zbo0) wh50Var.getValue(), ((Boolean) obj).booleanValue() ? (xbo0.a) this.d : null, null, false, false, false, 30));
                return s3q0.a;
            case 17:
                a1z a1zVar = (a1z) this.c;
                MediaBrowserServiceCompat.g gVar = (MediaBrowserServiceCompat.g) this.d;
                bn40.c((Throwable) obj, new Object[0]);
                gVar.f(null);
                g0z g0zVar = a1zVar.d;
                if (g0zVar != null) {
                    g0zVar.c(a1zVar.a.getApplicationContext(), "net_error");
                }
                return s3q0.a;
            case 18:
                pz00 pz00Var = (pz00) this.c;
                FaveMarketItem faveMarketItem = (FaveMarketItem) ((gmq) this.d);
                boolean z2 = faveMarketItem.b.J;
                pz00Var.E.T4(new MarketProductTileConfig.b(z2, true));
                faveMarketItem.b.J = z2;
                return s3q0.a;
            case 19:
                Playlist playlist = (Playlist) this.c;
                nk40 nk40Var = (nk40) this.d;
                UIBlock uIBlock = (UIBlock) obj;
                if ((uIBlock.Cb() == CatalogDataType.DATA_TYPE_MUSIC_PLAYLISTS || uIBlock.Cb() == CatalogDataType.DATA_TYPE_MUSIC_RECOMMENDED_PLAYLISTS) && (uIBlock instanceof UIBlockMusicPlaylist)) {
                    UIBlockMusicPlaylist uIBlockMusicPlaylist = (UIBlockMusicPlaylist) uIBlock;
                    if (epx.f(uIBlockMusicPlaylist.Ub(), playlist)) {
                        Thumb thumb = uIBlockMusicPlaylist.Ub().m;
                        Thumb thumb2 = playlist.m;
                        nk40Var.getClass();
                        if (thumb != null) {
                            if (thumb2 != null) {
                                if (thumb.getWidth() == thumb2.getWidth()) {
                                    break;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 20:
                MusicTrackCellVh musicTrackCellVh = (MusicTrackCellVh) this.c;
                View view = (View) this.d;
                Set<String> set4 = MusicTrackCellVh.A;
                if (!musicTrackCellVh.d() && (uIBlockMusicTrack = musicTrackCellVh.p) != null) {
                    MusicTrack musicTrack = uIBlockMusicTrack.z;
                    int i5 = 6;
                    if (musicTrackCellVh.e().i(musicTrack)) {
                        MusicPlaybackLaunchContext Cb = MusicPlaybackLaunchContext.Fb(uIBlockMusicTrack.f).Bb(uIBlockMusicTrack.b).Cb(jnj.a(musicTrack.V));
                        (musicTrack.P ? musicTrackCellVh.e().p1(musicTrack, true, false).L(new tuz(new go6(musicTrackCellVh, musicTrack, Cb, i5), 5), false) : musicTrackCellVh.e().e1(musicTrack, Cb, true)).F(new rt10(new x00(musicTrackCellVh, view, r5), i5)).subscribe();
                    } else if (musicTrackCellVh.e().i0(musicTrack)) {
                        io.reactivex.rxjava3.core.q<List<String>> u1 = musicTrackCellVh.e().u1(musicTrack, true);
                        cl30 cl30Var = new cl30(new yd6(musicTrackCellVh, view, musicTrack, i), r5);
                        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                        u1.E(cl30Var, lVar, kVar, kVar).F(new skz(new yw5(musicTrackCellVh, view, musicTrack, i5), 7)).F(new fsq(new ra50(musicTrackCellVh, view), 11)).subscribe();
                    }
                }
                return s3q0.a;
            case 21:
                m060 m060Var = (m060) this.c;
                RequestUserProfile requestUserProfile = (RequestUserProfile) this.d;
                FriendsDeleteResponseDto friendsDeleteResponseDto = (FriendsDeleteResponseDto) obj;
                m060Var.e.a(requestUserProfile);
                requestUserProfile.i0 = Boolean.FALSE;
                r5 = friendsDeleteResponseDto.d() != FriendsDeleteResponseDto.FriendDeletedDto.OK ? (friendsDeleteResponseDto.e() == FriendsDeleteResponseDto.InRequestDeletedDto.OK || friendsDeleteResponseDto.f() == FriendsDeleteResponseDto.OutRequestDeletedDto.OK) ? 0 : requestUserProfile.v : 2;
                if (requestUserProfile.v != r5) {
                    requestUserProfile.v = r5;
                    g2r0 g2r0Var = m060Var.d;
                    SubscribeStatus.Companion.getClass();
                    kym0 kym0Var = new kym0(SubscribeStatus.a.a(r5), requestUserProfile.c, requestUserProfile.t0, null, 8);
                    g2r0Var.c.add(kym0Var);
                    g2r0Var.b.b(kym0Var);
                }
                return s3q0.a;
            case 22:
                o360.c cVar = (o360.c) this.c;
                o360 o360Var = (o360) this.d;
                lkw lkwVar = (lkw) obj;
                if (lkwVar.e == null) {
                    lkwVar.e = Long.valueOf(cVar.b);
                }
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = o360Var.a;
                lkwVar.b = mobileOfficialAppsCoreNavStat$EventScreen != null ? com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen) : null;
                return s3q0.a;
            case 23:
                wh50 wh50Var2 = (wh50) this.c;
                tra0.a aVar3 = (tra0.a) obj;
                g720 g720Var = new g720((ArrayList) this.d, r5);
                aVar3.b = true;
                g720Var.invoke(aVar3);
                aVar3.b = false;
                wh50Var2.getValue();
                return s3q0.a;
            case 24:
                CheckPresenterInfo checkPresenterInfo = (CheckPresenterInfo) this.c;
                SignUpRouter signUpRouter = (SignUpRouter) this.d;
                String str3 = (String) obj;
                if (checkPresenterInfo instanceof CheckPresenterInfo.SignUp) {
                    if (signUpRouter != null) {
                        signUpRouter.S0(new RestoreReason.AlreadyUsedPhone(str3));
                    }
                } else if ((checkPresenterInfo instanceof CheckPresenterInfo.Validation) && signUpRouter != null) {
                    signUpRouter.X0(new pin0.a(((CheckPresenterInfo.Validation) checkPresenterInfo).c));
                }
                return s3q0.a;
            case 25:
                e4b0 e4b0Var = (e4b0) this.c;
                MusicPlaybackLaunchContext musicPlaybackLaunchContext = (MusicPlaybackLaunchContext) this.d;
                ArrayList arrayList6 = (ArrayList) obj;
                if (arrayList6.isEmpty()) {
                    enj.q(R.string.post_not_found, 0, e4b0Var.a);
                }
                if (k840.a.h() && !jnj.b(((MusicTrack) j5g.Y(arrayList6)).V)) {
                    return s3q0.a;
                }
                if (!e4b0Var.d) {
                    MusicTrack musicTrack2 = (MusicTrack) j5g.Y(arrayList6);
                    arrayList6.clear();
                    arrayList6.add(musicTrack2);
                }
                int i6 = e4b0Var.f;
                e4b0Var.f = -1;
                int i7 = 0;
                for (Object obj5 : e4b0Var.b) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        e43.t();
                        throw null;
                    }
                    if (((List) ((Pair) obj5).j()).contains(Integer.valueOf(i6))) {
                        e4b0Var.f = i7;
                    }
                    i7 = i8;
                }
                if (e4b0Var.f == -1) {
                    e4b0Var.f = 0;
                }
                e4b0Var.g.N0(new lqk0((StartPlaySource) null, (MusicTrack) arrayList6.get(e4b0Var.f), arrayList6, musicPlaybackLaunchContext, 0, (ShuffleMode) null, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 1009));
                if (e4b0Var.c) {
                    i0q0.d(200L, e4b0Var.i);
                }
                yp80 yp80Var = e4b0Var.e;
                if (yp80Var != null) {
                    yp80Var.onSuccess();
                }
                return s3q0.a;
            case 26:
                ((mnb0) this.c).b.g((hyg0) obj, (List) this.d);
                return s3q0.a;
            case 27:
                p8c0 p8c0Var = (p8c0) this.c;
                c7g0 c7g0Var = (c7g0) this.d;
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                p8c0Var.a();
                try {
                    c7g0Var.a().invoke();
                } catch (Throwable th3) {
                    com.vk.metrics.eventtracking.b.a.a(th3);
                }
                return s3q0.a;
            case 28:
                ((com.vk.newsfeed.impl.posting.settings.mvi.b) this.c).T(new e.c((PostingSettingsState.CommentsGlobalState) this.d));
                return s3q0.a;
            default:
                tfc tfcVar = (tfc) this.c;
                UiTrackingScreen uiTrackingScreen = (UiTrackingScreen) this.d;
                List list6 = (List) obj;
                u6m u6mVar = (u6m) list6.get(0);
                u6m u6mVar2 = (u6m) list6.get(1);
                float f2 = u6mVar2.a - u6mVar.a;
                float f3 = u6mVar2.c;
                float f4 = u6mVar.c;
                float f5 = f3 - f4;
                int i9 = u6mVar2.b;
                int i10 = u6mVar.b;
                int i11 = i9 - i10;
                zch0 zch0Var = (zch0) tfcVar.c;
                if (f2 >= zch0Var.c || f5 >= zch0Var.d || i11 >= zch0Var.e) {
                    l5m l5mVar = new l5m(null, null, 3);
                    l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.SCREEN_THERMAL_STATUS_CHANGE.h(), null, uiTrackingScreen.a.name(), Integer.valueOf(i10), String.valueOf(u6mVar.a), Integer.valueOf(i9), String.valueOf(f4), null, String.valueOf(u6mVar2.a), null, String.valueOf(f3), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1406, 3, null);
                    l5mVar.q();
                }
                return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }
    }

    public /* synthetic */ ma(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj2;
        this.d = obj3;
    }
}
