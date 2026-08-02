package xsna;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.bridges.ImageViewer;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.search.CatalogSearchSpellcheckResult;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.friend.FriendsItemListVh;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicArtistNew;
import com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockNewVh;
import com.vk.catalog2.feature.search.dto.ui.UIBlockSearchSpellcheck;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.market.api.ctabutton.ProductTileCtaButtonType;
import com.vk.im.engine.models.SearchMode;
import com.vk.im.ui.components.chat_profile.interactors.UserProfileAvatarsInteractor;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stories.design.view.stickers.music.MusicStickerStyleSwitchingView;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.webrtc.opengl.CallOpenGLContext;
import ru.ok.android.webrtc.opengl.CallOpenGLDrawer;
import ru.ok.android.webrtc.opengl.CallOpenGLRenderer;
import xsna.fha;
import xsna.ksd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class zo8 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zo8(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.ref.WeakReference] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        io.reactivex.rxjava3.core.q U;
        String str = null;
        switch (this.b) {
            case 0:
                bp8 bp8Var = (bp8) this.c;
                Context context = bp8Var.b;
                View view = (View) this.d;
                ImageList imageList = (ImageList) this.e;
                Throwable th = (Throwable) obj;
                if (sp.m(th)) {
                    ImageViewer imageViewer = bp8Var.h;
                    List singletonList = Collections.singletonList(rwv.c(imageList));
                    bpn0 bpn0Var = enj.a;
                    ImageViewer.b(imageViewer, 0, singletonList, e3m.h(context), new ap8(view), false, null, 496);
                } else if (th instanceof UserProfileAvatarsInteractor.NoAvatarsException) {
                    edw edwVar = edw.a;
                    edw.g(R.string.vkim_chat_profile_no_photos, context);
                } else {
                    zk70.e(th);
                }
                return s3q0.a;
            case 1:
                return CallOpenGLRenderer.a((CallOpenGLDrawer) this.c, this.d, (CallOpenGLRenderer) this.e, (CallOpenGLContext) obj);
            case 2:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                WeakReference weakReference = (WeakReference) this.d;
                ou5 ou5Var = (ou5) this.e;
                ref$ObjectRef.element = new WeakReference((etv0) obj);
                View view2 = (View) weakReference.get();
                if (view2 != null) {
                    view2.postDelayed(ou5Var, 5000L);
                }
                return s3q0.a;
            case 3:
                FriendsItemListVh friendsItemListVh = (FriendsItemListVh) this.c;
                UserProfile userProfile = (UserProfile) this.d;
                friendsItemListVh.b.j(new fha.a((View) obj, new StoryOwner.User(userProfile, null, 2, null), MobileOfficialAppsConStoriesStat$ViewEntryPoint.AVATAR, MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS, new xah(friendsItemListVh, (UIBlockProfile) this.e, userProfile, 4)));
                return s3q0.a;
            case 4:
                List list = (List) this.c;
                izs izsVar = (izs) this.d;
                kh00 kh00Var = (kh00) this.e;
                wow wowVar = new wow(list);
                ((nvy) obj).e(list.size(), null, new ih00(new y8(28), wowVar), new jai(802480018, new jh00(wowVar, izsVar, kh00Var), true));
                return s3q0.a;
            case 5:
                MusicPageInfoBlockNewVh musicPageInfoBlockNewVh = (MusicPageInfoBlockNewVh) this.c;
                UIBlockMusicArtistNew uIBlockMusicArtistNew = (UIBlockMusicArtistNew) this.d;
                Context context2 = (Context) this.e;
                musicPageInfoBlockNewVh.p = null;
                uIBlockMusicArtistNew.z.i = true;
                musicPageInfoBlockNewVh.j(true, true);
                musicPageInfoBlockNewVh.d(context2);
                return s3q0.a;
            case 6:
                MusicStickerStyleSwitchingView musicStickerStyleSwitchingView = (MusicStickerStyleSwitchingView) this.c;
                View view3 = (View) this.d;
                View view4 = (View) this.e;
                if (!musicStickerStyleSwitchingView.d) {
                    musicStickerStyleSwitchingView.removeView(view3);
                    musicStickerStyleSwitchingView.addView(view4);
                }
                return s3q0.a;
            case 7:
                CatalogBlock catalogBlock = (CatalogBlock) this.c;
                w060 w060Var = (w060) this.d;
                bi20 bi20Var = (bi20) this.e;
                CatalogSearchSpellcheckResult catalogSearchSpellcheckResult = (CatalogSearchSpellcheckResult) obj;
                boolean f = epx.f(catalogBlock.i.h.getString(TtmlNode.TAG_STYLE), "large");
                w060Var.getClass();
                UIBlockSearchSpellcheck uIBlockSearchSpellcheck = new UIBlockSearchSpellcheck(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, catalogSearchSpellcheckResult);
                uIBlockSearchSpellcheck.z = f;
                return uIBlockSearchSpellcheck;
            case 8:
                lsd0 lsd0Var = (lsd0) this.c;
                ksd0.b bVar = (ksd0.b) this.d;
                izs izsVar2 = (izs) this.e;
                if (((BaseOkResponseDto) obj) == BaseOkResponseDto.OK) {
                    lsd0Var.c.b(new gu00(bVar.b, bVar.a, bVar.d));
                    izsVar2.invoke(ProductTileCtaButtonType.GO_TO_CART);
                }
                return s3q0.a;
            case 9:
                x9k x9kVar = (x9k) this.c;
                izs izsVar3 = (izs) this.d;
                wh50 wh50Var = (wh50) this.e;
                tho0 tho0Var = (tho0) obj;
                tho0 tho0Var2 = (tho0) wh50Var.getValue();
                int i = x9kVar.b;
                us2 us2Var = tho0Var.a;
                if (us2Var.c.length() <= i || tho0Var2.a.c.length() < i) {
                    String str2 = us2Var.c;
                    tho0Var2 = tho0.a(tho0Var, str2.substring(0, Math.min(str2.length(), i)));
                }
                wh50Var.setValue(tho0Var2);
                izsVar3.invoke(((tho0) wh50Var.getValue()).a.c);
                return s3q0.a;
            case 10:
                uun0 uun0Var = (uun0) this.c;
                String str3 = (String) this.d;
                String str4 = (String) this.e;
                tgi0 tgi0Var = (tgi0) obj;
                if (uun0Var.e) {
                    str3 = v1v.a(' ', str3, str4);
                }
                qgi0.h(tgi0Var, str3);
                return s3q0.a;
            case 11:
                mkr0 mkr0Var = (mkr0) this.c;
                String str5 = (String) this.d;
                SearchMode searchMode = (SearchMode) this.e;
                if (mkr0Var != null) {
                    mkr0Var.U(str5, searchMode);
                }
                return s3q0.a;
            case 12:
                final s0s0 s0s0Var = (s0s0) this.c;
                VideoAdvertisementsRepository.AdType adType = (VideoAdvertisementsRepository.AdType) this.d;
                final String str6 = (String) this.e;
                Pair pair = (Pair) obj;
                final String str7 = (String) pair.d();
                final String str8 = (String) pair.g();
                if (str8 == null || drm0.N(str8)) {
                    return io.reactivex.rxjava3.core.q.T(new VideoAdvertisementsRepository.a.C1194a(true));
                }
                String a = v1v.a('-', str7, str8);
                LinkedHashMap linkedHashMap = s0s0Var.l;
                Object obj2 = linkedHashMap.get(a);
                if (obj2 == null) {
                    if (WebView.getCurrentWebViewPackage() == null) {
                        U = io.reactivex.rxjava3.core.q.T(new VideoAdvertisementsRepository.a.C1194a(true));
                    } else {
                        U = (adType != VideoAdvertisementsRepository.AdType.SPORT_ODDS ? s0s0Var.h(str7, str8, adType, str6).t0(1L) : new io.reactivex.rxjava3.internal.operators.observable.t(new io.reactivex.rxjava3.functions.n() { // from class: xsna.r0s0
                            @Override // io.reactivex.rxjava3.functions.n
                            public final Object get() {
                                VideoAdvertisementsRepository.AdType adType2 = VideoAdvertisementsRepository.AdType.SPORT_ODDS;
                                s0s0 s0s0Var2 = s0s0.this;
                                String str9 = str7;
                                String str10 = str8;
                                String str11 = str6;
                                return s0s0Var2.h(str9, str10, adType2, str11).t0(1L).L(new did0(new ysq(s0s0Var2, str9, str10, str11, 3), 15), false);
                            }
                        })).U(new b630(new kpk0(7, s0s0Var, adType), 18));
                    }
                    obj2 = U.g0().O0();
                    linkedHashMap.put(a, obj2);
                }
                return (io.reactivex.rxjava3.core.q) obj2;
            default:
                VideoFileOld videoFileOld = (VideoFileOld) this.c;
                bu70 bu70Var = (bu70) this.d;
                String str9 = (String) this.e;
                VideoFile videoFile = (VideoFile) obj;
                Iterator it = j5g.s0(VideoUrl.k(), VideoUrl.EMBED_URL).iterator();
                while (true) {
                    if (it.hasNext()) {
                        VideoUrl videoUrl = (VideoUrl) it.next();
                        if (videoFileOld.f.Ab(videoUrl) != null && videoFile.w9().Ab(videoUrl) != null) {
                            str = videoFile.w9().Ab(videoUrl);
                        }
                    }
                }
                if (str == null) {
                    return s3q0.a;
                }
                synchronized (bu70Var) {
                    bu70.e().e(str9, str);
                }
                return s3q0.a;
        }
    }
}
