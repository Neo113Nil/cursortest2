package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.vk.ads.yandex.impl.YandexAdFeatureImpl;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.friends.dto.FriendsFriendStatusStatusDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.catalog2.common.dto.api.music.CatalogMusicTrackLocalState;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.user.RequestUserProfile;
import com.vk.dto.user.SocialButtonType;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import com.vk.music.offline.api.exception.DownloadingMusicAtWrongNetworkStateException;
import com.vk.music.offline.api.exception.SubscriptionExpiredException;
import com.vk.photos.ui.editalbum.presentation.EditAlbumPrivacyFragment;
import com.vk.subscription.api.SubscribeStatus;
import com.yandex.mobile.ads.common.MobileAds;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.c2r;
import xsna.fss;
import xsna.gm50;
import xsna.gss;
import xsna.k840;
import xsna.n1j;
import xsna.qvq;
import xsna.r2j;
import xsna.r7k0;
import xsna.rv9;
import xsna.srs0;
import xsna.tg40;
import xsna.tra0;
import xsna.wk50;
import xsna.wqs0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ab6 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ab6(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v80, types: [xsna.e5z, xsna.mrs0] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Boolean T2;
        BaseBoolIntDto D;
        FriendsFriendStatusStatusDto V0;
        BaseBoolIntDto g3;
        UserId s1;
        int i = this.b;
        int i2 = 20;
        int i3 = 6;
        int i4 = 3;
        boolean z = false;
        r7 = false;
        boolean z2 = false;
        z = false;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                com.vk.auth.verification.base.b bVar = (com.vk.auth.verification.base.b) obj4;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj3;
                com.vk.auth.verification.base.c cVar = (com.vk.auth.verification.base.c) obj2;
                bVar.y = ((pno0) obj).d().toString();
                bVar.N0();
                if (bVar.y.length() > 0 && ref$BooleanRef.element) {
                    inr0 inr0Var = bVar.E;
                    inr0Var.getClass();
                    inr0Var.d(new l9b(com.vk.registration.funnels.b.a, 2));
                    ref$BooleanRef.element = false;
                }
                cVar.aj();
                if (bVar.D0()) {
                    bVar.O0(bVar.y);
                }
                return s3q0.a;
            case 1:
                ldf ldfVar = (ldf) obj4;
                gzs gzsVar = (gzs) obj2;
                nvy nvyVar = (nvy) obj;
                ArrayList arrayList = ldfVar.a;
                wow wowVar = new wow(arrayList);
                nvyVar.e(arrayList.size(), new cid(new whd(0), wowVar), new did(wowVar, 0), new jai(2039820996, new eid(wowVar, ldfVar, (izs) obj3), true));
                if (ldfVar.d) {
                    nvyVar.e(3, new nk(10), new rf(20), d370.h);
                }
                s61 s61Var = ldfVar.b;
                if (s61Var != null) {
                    nvyVar.h("after_authors_item", "after_authors_item", new jai(-1105830212, new xhd(z ? 1 : 0, s61Var, gzsVar), true));
                }
                return s3q0.a;
            case 2:
                L.i((Throwable) obj);
                ((cpg) obj4).b((wk50.a) obj3, ((rv9.a.C3634a) obj2).b);
                return s3q0.a;
            case 3:
                o1j o1jVar = (o1j) obj3;
                lak lakVar = (lak) obj2;
                r2j.b bVar2 = (r2j.b) obj;
                int i5 = n1j.k1;
                ((n1j) obj4).bo(o1jVar, n1j.a.CREATE);
                o1jVar.setContentView(lakVar);
                gm50.a.a(lakVar, bVar2.g, new kak(1, lakVar, lak.class, "renderError", "renderError(Lcom/vk/voip/ui/sessionrooms/dialog/admin/configure/feature/ConfigureSessionRoomsViewState$Error;)V", 0));
                gm50.a.a(lakVar, bVar2.a, new yad(lakVar, 17));
                gm50.a.a(lakVar, bVar2.b, new cvh(lakVar, 2));
                int i6 = 4;
                gm50.a.a(lakVar, bVar2.c, new bhh(lakVar, i6));
                gm50.a.a(lakVar, bVar2.f, new qqe(lakVar, 7));
                gm50.a.a(lakVar, bVar2.d, new r3h(lakVar, i6));
                gm50.a.a(lakVar, bVar2.e, new w5x0(lakVar, 1));
                return s3q0.a;
            case 4:
                ArrayList arrayList2 = (ArrayList) obj4;
                gzs gzsVar2 = (gzs) obj3;
                EditAlbumPrivacyFragment editAlbumPrivacyFragment = (EditAlbumPrivacyFragment) obj2;
                UserProfile userProfile = (UserProfile) obj;
                int i7 = EditAlbumPrivacyFragment.X0;
                if (userProfile != null) {
                    arrayList2.remove(userProfile);
                    gzsVar2.invoke();
                    editAlbumPrivacyFragment.q();
                    editAlbumPrivacyFragment.Q0 = true;
                }
                return s3q0.a;
            case 5:
                return Integer.valueOf(wsp.q((String) obj3, (String) obj2, (wsp) obj4));
            case 6:
                tra0.a aVar = (tra0.a) obj;
                tra0.a.x(aVar, (tra0) obj4, 0, an10.b(((szm) obj3).a.b()));
                tra0.a.x(aVar, (tra0) obj2, 0, 0);
                return s3q0.a;
            case 7:
                wk50.a aVar2 = (wk50.a) obj2;
                SdkVideoFile sdkVideoFile = (SdkVideoFile) obj;
                sdkVideoFile.setTrackCode(((FeedItem.d) obj4).k().r());
                aVar2.b(new c2r.h.d(Collections.singletonList(myc.d(((swq) obj3).b, sdkVideoFile, null, 6)), PaginationKey.Initial.b, null, null));
                aVar2.a(new qvq.i.b(true));
                return s3q0.a;
            case 8:
                Playlist playlist = (Playlist) obj4;
                vh40 vh40Var = (vh40) obj3;
                Context context = (Context) obj2;
                List list = (List) obj;
                if (playlist.b == -1) {
                    vh40Var.g(context, Playlist.zb(playlist, null, null, list, null, -8388609, 255));
                } else {
                    if (!vh40Var.a()) {
                        throw new DownloadingMusicAtWrongNetworkStateException();
                    }
                    if (!k840.a.i.c()) {
                        throw new SubscriptionExpiredException();
                    }
                    tg40.a.a(new io.reactivex.rxjava3.internal.operators.mixed.q(io.reactivex.rxjava3.core.x.k(list).q(asu0.a.c()), new j630(new com.vk.libvideo.b(i2, playlist, vh40Var), i4)).F(new ez(new zf1(19, vh40Var, playlist), 29)).subscribe(), vh40Var.i, playlist.Ib());
                }
                return s3q0.a;
            case 9:
                String str = (String) obj4;
                MusicTrack musicTrack = (MusicTrack) obj3;
                MusicTrack musicTrack2 = (MusicTrack) obj2;
                UIBlock uIBlock = (UIBlock) obj;
                if (uIBlock instanceof UIBlockMusicTrack) {
                    if (str.equals("music_audios_add") && epx.f(musicTrack.y, ((UIBlockMusicTrack) uIBlock).z.y)) {
                        z2 = true;
                    }
                    UIBlockMusicTrack uIBlockMusicTrack = (UIBlockMusicTrack) uIBlock;
                    return new UIBlockMusicTrack(uIBlockMusicTrack, musicTrack2, CatalogMusicTrackLocalState.zb(uIBlockMusicTrack.C, z2, !r1.d, 2), null, 8, null);
                }
                if (!(uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryTrack)) {
                    return uIBlock;
                }
                if (str.equals("music_audios_add") && epx.f(musicTrack.y, ((UIBlockSearchHistory.UIBlockSearchHistoryTrack) uIBlock).A.y)) {
                    z = true;
                }
                UIBlockSearchHistory.UIBlockSearchHistoryTrack uIBlockSearchHistoryTrack = (UIBlockSearchHistory.UIBlockSearchHistoryTrack) uIBlock;
                return new UIBlockSearchHistory.UIBlockSearchHistoryTrack(uIBlockSearchHistoryTrack, musicTrack2, CatalogMusicTrackLocalState.zb(uIBlockSearchHistoryTrack.C, z, !r2.d, 2));
            case 10:
                uzb0 uzb0Var = (uzb0) obj4;
                RequestUserProfile requestUserProfile = (RequestUserProfile) obj3;
                fss.d dVar = (fss.d) obj2;
                sgg sggVar = uzb0Var.d;
                kss kssVar = uzb0Var.g;
                sggVar.a(requestUserProfile);
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) j5g.a0((List) obj);
                if (usersUserFullDto != null && (s1 = usersUserFullDto.s1()) != null) {
                    requestUserProfile.c = s1;
                }
                if (usersUserFullDto != null && (g3 = usersUserFullDto.g3()) != null) {
                    requestUserProfile.j = g3 == BaseBoolIntDto.YES;
                }
                if (usersUserFullDto != null && (V0 = usersUserFullDto.V0()) != null) {
                    requestUserProfile.v = V0.i();
                }
                if (usersUserFullDto != null && (D = usersUserFullDto.D()) != null) {
                    requestUserProfile.a0(D == BaseBoolIntDto.YES);
                }
                if (usersUserFullDto != null && (T2 = usersUserFullDto.T2()) != null) {
                    requestUserProfile.z = T2.booleanValue();
                }
                requestUserProfile.i0 = Boolean.TRUE;
                int i8 = requestUserProfile.v;
                Object[] objArr = i8 == 3;
                Object[] objArr2 = i8 == 1 ? 1 : null;
                if (requestUserProfile.e0 != SocialButtonType.FOLLOW || objArr2 == null) {
                    if (objArr != false && kssVar != null) {
                        kssVar.c(new gss.b(requestUserProfile.c));
                    }
                } else if (kssVar != null) {
                    kssVar.c(new gss.d(requestUserProfile.c));
                }
                if (uzb0Var.b && !uzb0Var.k) {
                    uzb0Var.f.b(r7k0.b.a, requestUserProfile, dVar.b);
                    uzb0Var.k = true;
                }
                g2r0 g2r0Var = uzb0Var.e;
                SubscribeStatus.a aVar3 = SubscribeStatus.Companion;
                int i9 = requestUserProfile.v;
                aVar3.getClass();
                kym0 kym0Var = new kym0(SubscribeStatus.a.a(i9), requestUserProfile.c, requestUserProfile.t0, null, 8);
                g2r0Var.c.add(kym0Var);
                g2r0Var.b.b(kym0Var);
                return s3q0.a;
            case 11:
                ((ncl0) obj4).f1((StickerStockItem) obj3, (izs) obj2);
                return s3q0.a;
            case 12:
                Lifecycle lifecycle = (Lifecycle) obj4;
                final izs izsVar = (izs) obj3;
                final xrs0 xrs0Var = (xrs0) obj2;
                ?? r1 = new androidx.lifecycle.l() { // from class: xsna.mrs0
                    @Override // androidx.lifecycle.l
                    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
                        izs.this.invoke(new wqs0.i(xrs0Var.b, event.h()));
                    }
                };
                lifecycle.addObserver(r1);
                return new srs0.c(lifecycle, r1, izsVar, xrs0Var);
            default:
                YandexAdFeatureImpl yandexAdFeatureImpl = (YandexAdFeatureImpl) obj4;
                Activity activity = (Activity) obj3;
                y2 y2Var = (y2) obj2;
                g2q0 g2q0Var = (g2q0) obj;
                if (g2q0Var == null) {
                    yandexAdFeatureImpl.c.c();
                    MobileAds.initialize(activity, new qat0(yandexAdFeatureImpl, i3));
                } else {
                    y2Var.invoke(Integer.valueOf(g2q0Var.a), "YandexAd. Consent form error: " + g2q0Var.b);
                }
                return s3q0.a;
        }
    }
}
