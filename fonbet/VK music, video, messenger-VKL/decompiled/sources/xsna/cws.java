package xsna;

import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.soloader.MinElf;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.base.VkPaginationList;
import com.vk.attachpicker.adapter.PhotoSmallAdapter;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.catalog2.common.dto.ui.UIBlockGroupFilter;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.group.GroupFilterVh;
import com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicBaseVkMixInteractiveVh;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.geo.GeoLocation;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.feed.settings.impl.presentation.filtered.tab.f;
import com.vk.media.MediaFilteringStrategy;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.photo.editor.features.collage.model.stat.CollageStatEvent;
import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.photogallery.LocalGalleryProvider;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.InteractivePollStickerView;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.superapp.miniapps.picker.PickerItem;
import com.vk.voip.b;
import com.vk.voip.ui.VoipHintsLauncher;
import com.vk.voip.ui.onboarding.features.FeatureId;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.am9;
import xsna.az20;
import xsna.h120;
import xsna.niu;
import xsna.o0r0;
import xsna.oe60;
import xsna.qn60;
import xsna.r69;
import xsna.tj50;
import xsna.vvr0;
import xsna.w0g;
import xsna.xav;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class cws implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cws(UIBlockGroupFilter uIBlockGroupFilter, GroupFilterVh groupFilterVh) {
        this.b = 8;
        this.c = uIBlockGroupFilter;
    }

    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        String str;
        io.reactivex.rxjava3.disposables.c fVar;
        List localAlbums;
        int i2 = this.b;
        int i3 = 16;
        int i4 = 4;
        boolean z = false;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                fws fwsVar = (fws) obj2;
                if (((String) obj).length() > 0 && ((Boolean) fwsVar.j.invoke()).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                GalleryFragmentImpl galleryFragmentImpl = (GalleryFragmentImpl) obj2;
                View view = (View) obj;
                boolean z2 = galleryFragmentImpl.u0;
                galleryFragmentImpl.u0 = !z2;
                if (galleryFragmentImpl.R.E.e) {
                    if (z2) {
                        nf9 nf9Var = nf9.b;
                        StoryCameraParams storyCameraParams = galleryFragmentImpl.J0;
                        String m = (storyCameraParams == null || (str = storyCameraParams.c) == null) ? null : cqm0.m(str);
                        am9.a aVar = new am9.a();
                        aVar.j = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.PHOTO_VIDEO_PICKER);
                        aVar.a = m;
                        nf9.b(nf9Var, StoryPublishEvent.CLICK_TO_PICKER, aVar, null, null, false, null, 108).e();
                        i = R.string.cancel;
                    } else {
                        com.vk.attachpicker.b bVar = galleryFragmentImpl.Q;
                        if (bVar != null) {
                            bVar.clear();
                        }
                        i = R.string.multiselect_mode;
                    }
                    VkButton vkButton = view instanceof VkButton ? (VkButton) view : null;
                    if (vkButton != null) {
                        vkButton.setText(i);
                    }
                }
                PhotoSmallAdapter photoSmallAdapter = galleryFragmentImpl.c0;
                if (photoSmallAdapter != null) {
                    photoSmallAdapter.notifyDataSetChanged();
                }
                return s3q0.a;
            case 2:
                bmt bmtVar = (bmt) obj2;
                VKList vKList = (VKList) obj;
                vmt vmtVar = bmtVar.f;
                return odq.c(vmtVar.b, new xc3(vKList, null, vmtVar.c, bmtVar.g, null, false, null)).l(new iw3(new dwg(vKList, i3), 14));
            case 3:
                ((kot) obj2).l.invoke(new r69.a(FeatureId.GESTURE_FEEDBACK));
                return s3q0.a;
            case 4:
                qcy<Object>[] qcyVarArr = GoodFragment.U0;
                return Boolean.valueOf(((wo) ((GoodFragment) obj2).Lo().X.getValue()).a((UserId) obj));
            case 5:
                ((jcu) obj2).d.invoke(ubu.b);
                return s3q0.a;
            case 6:
                n3g n3gVar = (n3g) obj2;
                int intValue = ((Integer) obj).intValue();
                Map<n2k0, Boolean> map = n3gVar.h;
                if (!map.isEmpty()) {
                    Iterator<Map.Entry<n2k0, Boolean>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        if (it.next().getValue().booleanValue()) {
                            return s3q0.a;
                        }
                    }
                }
                n3gVar.m(null);
                com.vk.photo.editor.ivm.d dVar = n3gVar.b;
                if (dVar == null) {
                    dVar = null;
                }
                bc0 i5 = n3g.i(dVar);
                if (i5 != null) {
                    w0g w0gVar = c3g.a.get(intValue).d;
                    c5p c5pVar = n3gVar.f;
                    if (c5pVar == null) {
                        c5pVar = null;
                    }
                    c5pVar.b(new CollageStatEvent.f(wp80.k(w0gVar)));
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<n2k0, c2g> entry : i5.g.a.entrySet()) {
                        n2k0 key = entry.getKey();
                        c2g value = entry.getValue();
                        if (w0gVar.a().containsKey(key)) {
                            w0g.a aVar2 = w0gVar.a().get(key);
                            value = c2g.a(value, aVar2.b, aVar2.c, aVar2.d, aVar2.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 496);
                        }
                        linkedHashMap.put(key, value);
                    }
                    g2g g2gVar = new g2g(linkedHashMap);
                    com.vk.photo.editor.ivm.d dVar2 = n3gVar.b;
                    (dVar2 != null ? dVar2 : null).a(new EditorMessage.i(w1g.a(i5, w0gVar, null, null, null, null, g2gVar, null, PsExtractor.PRIVATE_STREAM_1), EditorMessage.Source.UserInput, 4));
                }
                return s3q0.a;
            case 7:
                miu miuVar = (miu) obj2;
                Integer num = (Integer) obj;
                jhu P0 = miuVar.d.P0();
                if (P0 != null && !P0.b && num.intValue() > 1) {
                    miuVar.b.onNext(niu.a.a);
                }
                io.reactivex.rxjava3.subjects.d<jhu> dVar3 = miuVar.d;
                jhu P02 = dVar3.P0();
                if (P02 != null) {
                    dVar3.onNext(jhu.a(P02, false, false, false, false, false, num.intValue(), 31));
                }
                return s3q0.a;
            case 8:
                return Boolean.valueOf(GroupFilterVh.t((UIBlockList) obj, (UIBlockGroupFilter) obj2));
            case 9:
                xav xavVar = (xav) obj;
                zav zavVar = ((nav) obj2).b;
                com.vk.voip.ui.c.b.getClass();
                b39 b39Var = com.vk.voip.ui.c.C;
                zavVar.getClass();
                if (xavVar instanceof xav.b) {
                    xav.b bVar2 = (xav.b) xavVar;
                    zavVar.a = b39Var;
                    l5x0 h0 = com.vk.voip.ui.c.h0();
                    xav.b.a aVar3 = bVar2.b;
                    h0.d(new b.a(aVar3.a, aVar3.b, null));
                    bpn0 bpn0Var = vvr0.a;
                    vvr0.h(vvr0.a.HEART_BEAT);
                    new Handler().postDelayed(new yav(), bVar2.a.a);
                } else {
                    if (!xavVar.equals(xav.a.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b39 b39Var2 = zavVar.a;
                    if (b39Var2 != null) {
                        zavVar.a = null;
                        com.vk.voip.ui.c.h0().d(b39Var2.a);
                    }
                    vvr0.g();
                }
                return s3q0.a;
            case 10:
                return Integer.valueOf(((w2w) obj2).I0().system().r(((Long) obj).longValue()));
            case 11:
                l7w l7wVar = (l7w) obj2;
                if (l7wVar.e.incrementAndGet() == 1) {
                    io.reactivex.rxjava3.disposables.b bVar3 = l7wVar.d;
                    xbw xbwVar = l7wVar.a;
                    if (xbwVar == null || (fVar = xbwVar.a().a0(l7wVar.f).subscribe(new defpackage.z(new rlh(l7wVar, i3), 29))) == null) {
                        fVar = new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);
                    }
                    bVar3.b(fVar);
                }
                return s3q0.a;
            case 12:
                ((zrw) obj2).b.a((View) obj, VoipHintsLauncher.Hint.ADD_FRIENDS_TO_CALL, null);
                return s3q0.a;
            case 13:
                ((InteractivePollStickerView) obj2).c(R.string.poll_restrict_unvoting_warning);
                return s3q0.a;
            case 14:
                com.vk.superapp.miniapps.picker.e eVar = (com.vk.superapp.miniapps.picker.e) obj2;
                PickerItem.c cVar = eVar.n;
                if (cVar != null) {
                    eVar.l.f(cVar);
                }
                return s3q0.a;
            case 15:
                return new com.vk.stickers.keyboard.navigation.g((ViewGroup) obj, ((com.vk.stickers.keyboard.navigation.a) obj2).k);
            case 16:
                boz bozVar = (boz) obj2;
                bozVar.g.invoke(bozVar.S0());
                dw20 dw20Var = bozVar.n;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                bozVar.n = null;
                return s3q0.a;
            case 17:
                localAlbums = ((LocalGalleryProvider) obj2).toLocalAlbums((List) obj);
                return localAlbums;
            case 18:
                nxz nxzVar = (nxz) obj2;
                List D0 = j5g.D0(new xx8(i4), ((VkPaginationList) obj).b);
                if (epx.f(nxzVar.n, nxz.s)) {
                    return D0;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : D0) {
                    if (!epx.f(((GeoLocation) obj3).i, nxzVar.n.i)) {
                        arrayList.add(obj3);
                    }
                }
                return new ArrayList(arrayList);
            case 19:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                LinearLayout linearLayout = ((MarketItemReviewsFragment) obj2).d0;
                bwt0.p0(linearLayout != null ? linearLayout : null, booleanValue);
                return s3q0.a;
            case 20:
                h120 h120Var = (h120) obj2;
                h120.a aVar4 = h120Var.k;
                if (aVar4 != null) {
                    xwk.e().m(h120Var.c.getContext(), aVar4.a, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 21:
                ((eg20) obj2).b.a.K((List) obj);
                return s3q0.a;
            case 22:
                ((zak0) ((az20) obj2).i).setValue((az20.d) obj);
                return s3q0.a;
            case 23:
                Intent intent = (Intent) obj;
                intent.putExtra("camera_enabled", true);
                intent.putExtra("media_type", Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE);
                intent.putExtra("video_max_length_ms", TimeUnit.MINUTES.toMillis(3L));
                intent.putExtra("video_filtering_mode", MediaFilteringStrategy.VIDEO_AVC);
                intent.putExtra("selection_limit", 10 - ((u440) obj2).v.size());
                intent.putExtra("long_previews", true);
                intent.putExtra("short_divider", true);
                intent.putExtra("prevent_styling_photo", false);
                intent.putExtra("single_mode", false);
                return s3q0.a;
            case 24:
                ((MusicBaseVkMixInteractiveVh) obj2).n().b();
                return s3q0.a;
            case 25:
                return new oe60.a.C3451a(((tj50.a) obj).a(new f410((ke60) obj2, 15), ao8.d));
            case 26:
                sg60 sg60Var = (sg60) obj2;
                NewsEntriesContainer newsEntriesContainer = (NewsEntriesContainer) obj;
                wg60 wg60Var = sg60Var.j;
                return new io.reactivex.rxjava3.internal.operators.single.b(new hxi(wg60Var.b, new qn60.b[]{new xc3(newsEntriesContainer.c, null, wg60Var.c, sg60Var.l, null, false, null)})).l(new v34(new ayo(newsEntriesContainer, 26), 17));
            case 27:
                ((com.vk.feed.settings.impl.presentation.filtered.tab.c) obj2).V(new f.d.a((Throwable) obj));
                return s3q0.a;
            case 28:
                ((xia0) obj2).b.r0();
                return Boolean.TRUE;
            default:
                qgi0.r((tgi0) obj, (String) obj2);
                return s3q0.a;
        }
    }

    public /* synthetic */ cws(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
