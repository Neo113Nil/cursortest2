package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Size;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.internal.data.LaunchForResultInfo;
import com.vk.dto.clips.filters.HslInfo;
import com.vk.feed.design.view.newsfeed.reaction.FeedAnimatedView;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vk.friends.requests.impl.requests.presentation.FriendsRequestsPaginatedView;
import com.vk.im.ui.fragments.ImRequestsFragment;
import com.vk.log.L;
import com.vk.photogallery.LocalGalleryProvider;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.search.params.api.City;
import com.vk.story.viewer.impl.presentation.ideas.ui.IdeasStoryAvatarView;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.video.ui.upload.impl.publish.domain.model.CoverDo;
import com.vk.video.ui.upload.impl.publish.domain.model.VideoInfoDo;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.gleffects.impl.EffectNativeSink;
import xsna.bex0;
import xsna.cs00;
import xsna.cwb0;
import xsna.cxi;
import xsna.fa90;
import xsna.ikv0;
import xsna.mcz;
import xsna.osp;
import xsna.pq00;
import xsna.qr60;
import xsna.qxl;
import xsna.t7n;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class l2k implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l2k(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        s3q0 reloadFromMediaStore$lambda$23;
        Object obj2;
        int i = this.b;
        int i2 = 12;
        int i3 = 5;
        int i4 = 3;
        int i5 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                Bitmap bitmap = (Bitmap) obj3;
                PublishState publishState = (PublishState) obj;
                VideoInfoDo videoInfoDo = publishState.c;
                VideoInfoDo videoInfoDo2 = videoInfoDo != null ? new VideoInfoDo(videoInfoDo.b, videoInfoDo.c, videoInfoDo.d, videoInfoDo.e, videoInfoDo.f, bitmap) : null;
                CoverDo coverDo = publishState.d;
                if (coverDo instanceof CoverDo.Preview) {
                    ((CoverDo.Preview) coverDo).getClass();
                    coverDo = new CoverDo.Preview(bitmap);
                }
                return PublishState.a(publishState, null, videoInfoDo2, coverDo, null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, false, false, false, false, -7, 2047);
            case 1:
                uik uikVar = (uik) obj3;
                uikVar.a.addOnLayoutChangeListener(new byt0(new ozf(uikVar, 13)));
                return s3q0.a;
            case 2:
                oio.x1((oio) obj, (y7z) obj3, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                return s3q0.a;
            case 3:
                twl twlVar = (twl) obj;
                ((fxl) obj3).T(new qxl.g.c(twlVar.d, twlVar.b));
                return s3q0.a;
            case 4:
                ((s0n) obj3).dismiss();
                return s3q0.a;
            case 5:
                List<? extends vcr<?>> list = (List) obj;
                mcr<vcr<?>> mcrVar = ((DiscoverSearchFragment) obj3).d0;
                if (mcrVar != null) {
                    mcrVar.b(list);
                }
                return s3q0.a;
            case 6:
                h8n h8nVar = (h8n) obj3;
                List<ol60> list2 = ((l8n) h8nVar.b.getCurrentState()).e.b.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list2) {
                    if (obj4 instanceof z1c0) {
                        arrayList.add(obj4);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((z1c0) it.next()).h.h);
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (next instanceof vt80) {
                        arrayList3.add(next);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    x9v0 x9v0Var = ((vt80) it3.next()).m.m;
                    if (x9v0Var != null) {
                        arrayList4.add(x9v0Var);
                    }
                }
                h8nVar.c(new t7n.a(new yo60.i.a(arrayList4)));
                return s3q0.a;
            case 7:
                Boolean value = ((pdn) obj3).e.isEnabled().getValue();
                value.getClass();
                return value;
            case 8:
                ((tdu) obj).n(((wfo) obj3).h.d().floatValue());
                return s3q0.a;
            case 9:
                ((osp.a) obj3).o.setItems((List) obj);
                return s3q0.a;
            case 10:
                return ((gpq) obj3).b.e(new hpq((qr60.a) obj));
            case 11:
                FeedAnimatedView feedAnimatedView = (FeedAnimatedView) obj3;
                feedAnimatedView.r = false;
                a780 a780Var = feedAnimatedView.b;
                if (a780Var != null) {
                    a780Var.a();
                }
                if (feedAnimatedView.k.getAndIncrement() < 3 && (str = feedAnimatedView.j) != null && str.length() != 0) {
                    feedAnimatedView.c(str);
                }
                feedAnimatedView.invalidate();
                return s3q0.a;
            case 12:
                return Boolean.valueOf(epx.f(((LaunchForResultInfo) obj).c, ((FragmentEntry) obj3).d));
            case 13:
                ((fhs) obj3).Y();
                return s3q0.a;
            case 14:
                FriendRequestsFragment friendRequestsFragment = (FriendRequestsFragment) obj3;
                Throwable th = (Throwable) obj;
                int i6 = FriendRequestsFragment.d0;
                com.vk.metrics.eventtracking.b.a.a(th);
                FriendsRequestsPaginatedView friendsRequestsPaginatedView = friendRequestsFragment.Z;
                if (friendsRequestsPaginatedView != null) {
                    u1e0 u1e0Var = friendsRequestsPaginatedView.N;
                    if (u1e0Var == null) {
                        u1e0Var = null;
                    }
                    f4m.j(u1e0Var);
                }
                Context requireContext = friendRequestsFragment.requireContext();
                String g = j03.g(requireContext, th, R.string.error);
                ikv0.a aVar = new ikv0.a(requireContext);
                aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_24, Integer.valueOf(R.attr.vk_ui_background_negative), (Size) (objArr3 == true ? 1 : 0), i2);
                aVar.u = new ikv0.d(g, (String) (objArr2 == true ? 1 : 0), (ikv0.d.a) (objArr == true ? 1 : 0), 6);
                ikv0 b = aVar.b();
                pkv0.d(b, requireContext, g);
                pkv0.b(b, friendRequestsFragment);
                return s3q0.a;
            case 15:
                return ((fws) obj3).b.c(0, (String) obj);
            case 16:
                qav qavVar = (qav) obj3;
                cxi cxiVar = (cxi) obj;
                L.e("config loaded " + cxiVar);
                if (cxiVar instanceof cxi.a) {
                    return io.reactivex.rxjava3.internal.operators.single.a0.b;
                }
                if (!(cxiVar instanceof cxi.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                cxi.b bVar = (cxi.b) cxiVar;
                qavVar.getClass();
                com.vk.voip.ui.c.b.getClass();
                v2x0 v2x0Var = com.vk.voip.ui.c.r0;
                if (v2x0Var == null) {
                    v2x0Var = null;
                }
                bbv bbvVar = v2x0Var.f;
                return (bbvVar.a.b() ? new io.reactivex.rxjava3.internal.operators.single.r(rsg0.y0(new fym(EffectNativeSink.getLibVersionCode() + 1000000, bVar.y), null, null, 3).U(new i3u(new d4r(i3), i5)).K(), new rx0(new ept(bbvVar, i4), 27)) : sn.b("Holiday event resource download is not supported for anonymous user")).l(new vx6(new d05(21, bVar, qavVar), 16));
            case 17:
                HslInfo hslInfo = (HslInfo) obj3;
                w9y w9yVar = (w9y) obj;
                w9yVar.g("red", hslInfo.b);
                w9yVar.g("orange", hslInfo.c);
                w9yVar.g("yellow", hslInfo.d);
                w9yVar.g("green", hslInfo.e);
                w9yVar.g("cyan", hslInfo.f);
                w9yVar.g("blue", hslInfo.g);
                w9yVar.g("purple", hslInfo.h);
                w9yVar.g("magenta", hslInfo.i);
                return s3q0.a;
            case 18:
                quv quvVar = (quv) obj3;
                fa90 fa90Var = (fa90) obj;
                ImageButton imageButton = quvVar.n;
                IdeasStoryAvatarView ideasStoryAvatarView = quvVar.m;
                if (epx.f(fa90Var, fa90.b.a) || epx.f(fa90Var, fa90.c.a) || epx.f(fa90Var, fa90.a.a)) {
                    ideasStoryAvatarView.setVisibility(8);
                    ideasStoryAvatarView.setAvatar(null);
                    imageButton.setVisibility(8);
                } else {
                    if (!(fa90Var instanceof fa90.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ideasStoryAvatarView.setVisibility(0);
                    fa90.d dVar = (fa90.d) fa90Var;
                    ideasStoryAvatarView.setAvatar(dVar.a);
                    imageButton.setVisibility(dVar.b ? 0 : 8);
                }
                return s3q0.a;
            case 19:
                return new gu90(((vzv) obj3).b, ((x8j) obj).a);
            case 20:
                qcy<Object>[] qcyVarArr = ImRequestsFragment.Z;
                g9e0 g9e0Var = ((ImRequestsFragment) obj3).Y;
                qcy<Object> qcyVar = ImRequestsFragment.Z[0];
                ((bzb0) g9e0Var.b()).c(cwb0.n0.e, new fbh((io.reactivex.rxjava3.disposables.c) obj, 29));
                return s3q0.a;
            case 21:
                wzx wzxVar = (wzx) obj3;
                Throwable th2 = (Throwable) obj;
                wzxVar.b(0);
                sp.g(wzxVar.g.h, 1);
                t89 v = d370.v(th2);
                izx izxVar = new izx(wzxVar.h);
                izxVar.e = v.a;
                izxVar.f = v.b;
                if ((th2 instanceof VKApiExecutionException) && ((VKApiExecutionException) th2).s() == 954) {
                    izxVar.g = Integer.valueOf(dhr0.t.c(R.attr.vk_ui_icon_tertiary));
                }
                izxVar.a0(new qzg(wzxVar, 26));
                izxVar.S0().Td(wzxVar.d, "JOIN_CALL_ERROR_BOTTOM_SHEET_TAG");
                return s3q0.a;
            case 22:
                bex0.a.b(((p7y) obj3).a, JsApiMethodType.SECURE_TOKEN_REQUEST_ACCESS, com.vk.movika.sdk.android.defaultplayer.interactive.c.b("result", true), null, 12);
                return s3q0.a;
            case 23:
                ((zcz) obj3).e.onNext(mcz.i.a);
                return s3q0.a;
            case 24:
                reloadFromMediaStore$lambda$23 = LocalGalleryProvider.reloadFromMediaStore$lambda$23((LocalGalleryProvider) obj3, (io.reactivex.rxjava3.disposables.c) obj);
                return reloadFromMediaStore$lambda$23;
            case 25:
                return ((oq00) obj3).a.a((pq00.a) obj);
            case 26:
                ps00 ps00Var = (ps00) obj3;
                int intValue = ((Integer) obj).intValue();
                os00 os00Var = ps00Var.u;
                if (os00Var != null) {
                    ps00Var.l.a(new cs00.g(intValue, os00Var.b));
                }
                return s3q0.a;
            case 27:
                City city = (City) obj3;
                List list3 = (List) obj;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : list3) {
                    if (obj5 instanceof nmo) {
                        arrayList5.add(obj5);
                    }
                }
                Iterator it4 = arrayList5.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj2 = it4.next();
                        if (((nmo) obj2).g == 5) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                nmo nmoVar = (nmo) obj2;
                if (nmoVar != null) {
                    nmoVar.e = city != null ? new wqd0(city.b, 100, city.c) : null;
                }
                return list3;
            case 28:
                return new n810((ViewGroup) obj, ((i810) obj3).i);
            default:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "PostingToolbarPickerMarket");
                qgi0.h(tgi0Var, (String) obj3);
                return s3q0.a;
        }
    }

    public /* synthetic */ l2k(uy00 uy00Var, City city) {
        this.b = 27;
        this.c = city;
    }
}
