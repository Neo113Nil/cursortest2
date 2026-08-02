package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.TextView;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.market.dto.MarketSearchResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsResponseDto;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacement;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacementResponse;
import com.vk.catalog2.common.ui.core.view.CatalogErrorView;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Good;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.hints.Hint;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProduct;
import com.vk.feed.core.models.feedback.ButtonsFeedback;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.ui.components.common.MemberAction;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.log.L;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.photos.root.albumdetails.presentation.d;
import com.vk.photos.root.albumdetails.presentation.i;
import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.c;
import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.e;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.core.js.bridge.api.events.GetLaunchParams$Error;
import com.vk.superapp.core.js.bridge.api.events.GetLaunchParams$Parameters;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.connection.BadNetworkIndicatorConfig;
import ru.ok.android.webrtc.topology.direct.P2PNetworkStatusReporter;
import xsna.b9a0;
import xsna.e8v0;
import xsna.fve;
import xsna.izh;
import xsna.nue;
import xsna.p810;
import xsna.tlo0;
import xsna.v8v;
import xsna.wk50;
import xsna.xgd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k8 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k8(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        tlo0.a aVar;
        int i;
        Object obj2;
        MultipickerProduct.Owner owner;
        xkm0 analyticsParams;
        String str = null;
        Object[] objArr = 0;
        int i2 = 0;
        switch (this.b) {
            case 0:
                t8 t8Var = (t8) this.c;
                String str2 = (String) this.d;
                List list = (List) obj;
                t8Var.getClass();
                if (fxc0.B().J().J1()) {
                    List<VideoFile> list2 = list;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    for (VideoFile videoFile : list2) {
                        arrayList.add(new AboutVideoItem.SimilarVideoRedesign(new noj0(videoFile, str2, null, null), false, false, fxc0.B().c(videoFile), AboutVideoItem.SimilarVideoRedesign.Source.SIMILAR_VIDEOS, false, AboutVideoItem.SimilarVideoRedesign.Style.NORMAL));
                    }
                    io.reactivex.rxjava3.internal.operators.observable.g1 T = io.reactivex.rxjava3.core.q.T(arrayList);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(arrayList.size());
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        linkedHashMap.put(((AboutVideoItem.SimilarVideoRedesign) next).b.a.r1(), next);
                    }
                    return io.reactivex.rxjava3.core.q.q(T, wjs0.b.L(new b8(new a8(linkedHashMap, i2), i2), false));
                }
                List<VideoFile> list3 = list;
                ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                for (VideoFile videoFile2 : list3) {
                    arrayList2.add(new AboutVideoItem.v(new noj0(videoFile2, str2, null, null), false, fxc0.B().c(videoFile2)));
                }
                io.reactivex.rxjava3.internal.operators.observable.g1 T2 = io.reactivex.rxjava3.core.q.T(arrayList2);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(arrayList2.size());
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    linkedHashMap2.put(((AboutVideoItem.v) next2).b.a.r1(), next2);
                }
                return io.reactivex.rxjava3.core.q.q(T2, wjs0.b.L(new c8(new com.vk.movika.sdk.base.observable.a(linkedHashMap2, r6 ? 1 : 0), i2), false));
            case 1:
                gg1 gg1Var = (gg1) this.c;
                List list4 = (List) this.d;
                Integer num = (Integer) obj;
                f4z f4zVar = gg1Var.p;
                f4zVar.b(i.e.a);
                if (num.intValue() > 0) {
                    r6 = num.intValue() == list4.size();
                    if (r6) {
                        aVar = tlo0.Companion;
                        i = R.string.selected_photos_deleted;
                    } else {
                        aVar = tlo0.Companion;
                        i = R.string.selected_photos_deleted_partial;
                    }
                    tlo0.f h = tq.h(aVar, i);
                    if (r6) {
                        gg1Var.T(d.b.b);
                        gg1Var.b0(null, null, h);
                    } else {
                        gg1Var.Z(null, null, h);
                    }
                    f4zVar.b(i.C1485i.a);
                } else {
                    gg1Var.W();
                }
                return s3q0.a;
            case 2:
                ((ds8) this.c).T6((ButtonsFeedback) this.d);
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 3:
                by2 by2Var = (by2) this.c;
                CatalogErrorView catalogErrorView = (CatalogErrorView) this.d;
                int i3 = CatalogErrorView.f;
                izs<Context, s3q0> izsVar = by2Var.c;
                if (izsVar != null) {
                    izsVar.invoke(catalogErrorView.getContext());
                } else {
                    gzs<s3q0> gzsVar = catalogErrorView.e;
                    if (gzsVar != null) {
                        gzsVar.invoke();
                    }
                }
                return s3q0.a;
            case 4:
                laa laaVar = (laa) this.c;
                String str3 = (String) this.d;
                List<MusicTrack> list5 = (List) obj;
                ld20 ld20Var = laaVar.s;
                nt70 nt70Var = new nt70((String) ld20Var.b);
                nt70Var.d = true;
                nt70Var.l = list5;
                List singletonList = Collections.singletonList(new CatalogReplacement(Collections.singletonList(((laa) ((defpackage.h) ld20Var.c).c).h), lu70.d(nt70Var.a(str3))));
                List<MusicTrack> list6 = list5;
                HashMap hashMap = new HashMap(list6.size());
                for (MusicTrack musicTrack : list6) {
                    hashMap.put(musicTrack.Fb(), musicTrack);
                }
                CatalogReplacementResponse catalogReplacementResponse = new CatalogReplacementResponse(singletonList, new CatalogExtendedData(null, null, null, null, null, null, null, null, null, null, null, null, null, new LinkedHashMap(hashMap), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8193, -1, 7, null), null);
                laaVar.h = str3;
                return catalogReplacementResponse;
            case 5:
                Collection<Attach> collection = (Collection) this.c;
                g2b g2bVar = (g2b) this.d;
                for (Attach attach : collection) {
                    Msg msg = (Msg) j5g.a0(g2bVar.b(Collections.singletonList(Integer.valueOf(attach.xb()))));
                    if (msg instanceof MsgFromChannel) {
                        ((MsgFromChannel) msg).L2(attach);
                        com.vk.im.engine.internal.storage.delegates.channel_messages.b bVar = g2bVar.e;
                        bVar.getClass();
                        bVar.a(Collections.singletonList(msg));
                    }
                }
                return s3q0.a;
            case 6:
                MusicTrack musicTrack2 = (MusicTrack) this.c;
                ugd ugdVar = (ugd) this.d;
                ta40 ta40Var = (ta40) obj;
                int i4 = ta40Var.c;
                int min = Integer.min(musicTrack2.c0 - i4, ynd.d);
                ugdVar.T(new xgd.c(min / 1000.0f));
                ugdVar.T(new xgd.d(i4, false, i4 + min, false, ta40Var.c));
                return s3q0.a;
            case 7:
                ((io.reactivex.rxjava3.core.r) this.c).onNext(new Pair((Bitmap) obj, Long.valueOf(((zld) this.d).n)));
                return s3q0.a;
            case 8:
                uue uueVar = (uue) this.c;
                fve.b bVar2 = (fve.b) this.d;
                uueVar.C(new nue.b((ShortVideoGetPlaylistsResponseDto) obj, bVar2.b, bVar2.c));
                return s3q0.a;
            case 9:
                mdg mdgVar = (mdg) this.c;
                io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.core.q) this.d;
                mdgVar.n8((NewsComment) obj);
                return qVar;
            case 10:
                wzs wzsVar = (wzs) this.c;
                pak pakVar = (pak) this.d;
                Integer num2 = (Integer) obj;
                num2.intValue();
                return (owt) wzsVar.invoke(pakVar, num2);
            case 11:
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a aVar2 = (com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a) this.c;
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.a.d((wk50.a) this.d, false);
                aVar2.d.b(new izh.a((String) obj));
                return s3q0.a;
            case 12:
                gkj gkjVar = (gkj) this.c;
                Exception exc = (Exception) this.d;
                mkj mkjVar = (mkj) obj;
                boolean isEmpty = mkjVar.c.isEmpty();
                boolean isEmpty2 = mkjVar.d.isEmpty();
                Context context = gkjVar.c;
                return mkj.a(mkjVar, (!isEmpty || isEmpty2) ? context.getString(R.string.content_product_products_in_post_title) : context.getString(R.string.content_product_products_in_shop_title), null, null, false, exc, false, 0, null, 230);
            case 13:
                w2w w2wVar = (w2w) this.c;
                emm emmVar = (emm) this.d;
                hpm c = sn.c(w2wVar);
                Peer peer = emmVar.c;
                c.C(0, peer.b);
                xgl0 I0 = w2wVar.I0();
                long j = peer.b;
                return (gkx0) ((Map) I0.u(new mmm(I0, Collections.singletonList(Long.valueOf(j)), r6, i2))).get(Long.valueOf(j));
            case 14:
                Peer peer2 = (Peer) this.c;
                com.vk.folders.impl.model.a aVar3 = (com.vk.folders.impl.model.a) this.d;
                Iterable iterable = (Collection) ((Map) obj).get(peer2);
                if (iterable == null) {
                    iterable = EmptyList.b;
                }
                return aVar3.b.C(aVar3, new jqm(Source.CACHE)).l(new pb(new wpg(j5g.S0(iterable), 13), 19));
            case 15:
                ((lrs) this.c).a.a((VkOnboardingCampaign) this.d, VkOnboardingType.Tooltip, ((Boolean) obj).booleanValue() ? e8v0.i.b : e8v0.g.b);
                return s3q0.a;
            case 16:
                aws awsVar = (aws) this.c;
                com.vk.lists.c cVar = (com.vk.lists.c) this.d;
                VKList vKList = (VKList) obj;
                jw30 jw30Var = awsVar.g;
                gws gwsVar = awsVar.b;
                if (((Boolean) jw30Var.invoke()).booleanValue()) {
                    cVar.r(vKList.k() == 1);
                    cVar.q(vKList.size() + cVar.i());
                    ArrayList arrayList3 = new ArrayList(gwsVar.c);
                    arrayList3.addAll(vKList);
                    gwsVar.c = j5g.O0(arrayList3);
                    p00 p00Var = awsVar.f;
                    Boolean bool = Boolean.TRUE;
                    p00Var.invoke(bool, bool);
                }
                return s3q0.a;
            case 17:
                o8u o8uVar = (o8u) this.c;
                o8uVar.o.invoke((Good) this.d, Integer.valueOf(o8uVar.getAbsoluteAdapterPosition()));
                return s3q0.a;
            case 18:
                cn cnVar = (cn) this.c;
                String str4 = (String) this.d;
                View view = (View) obj;
                AvatarBorderType avatarBorderType = cnVar.j ? AvatarBorderType.HEXAGON : AvatarBorderType.CIRCLE;
                ImAvatarView imAvatarView = (ImAvatarView) view.findViewById(R.id.voip_caller_image);
                Serializer.c<ImageList> cVar2 = ImageList.CREATOR;
                imAvatarView.p1(ImageList.a.c(-1, -1, cnVar.c), null, avatarBorderType);
                TextView textView = (TextView) view.findViewById(R.id.voip_title);
                if (str4 == null) {
                    str4 = cnVar.b;
                }
                textView.setText(str4);
                at.d(view, R.string.voip_change_name_profile_description, (TextView) view.findViewById(R.id.voip_description));
                return s3q0.a;
            case 19:
                p3y p3yVar = (p3y) this.c;
                GetLaunchParams$Parameters getLaunchParams$Parameters = (GetLaunchParams$Parameters) this.d;
                Throwable th = (Throwable) obj;
                if (fco0.d(th)) {
                    p3yVar.L0().d(fco0.h(getLaunchParams$Parameters.c(), th));
                } else {
                    com.vk.superapp.base.js.bridge.b.o(p3yVar.L0().a, new JsMethod("VKWebAppGetLaunchParams"), new GetLaunchParams$Error(str, new GetLaunchParams$Error.Data(GetLaunchParams$Error.Data.Type.API_ERROR, getLaunchParams$Parameters.c(), null, fco0.g(th), 4, null), r6 ? 1 : 0, objArr == true ? 1 : 0), null, null, 12);
                }
                return s3q0.a;
            case 20:
                pfy pfyVar = (pfy) this.c;
                sfy sfyVar = (sfy) this.d;
                y4l0 y4l0Var = pfyVar.l;
                if (y4l0Var != null) {
                    y4l0Var.i(null, sfyVar.d, "stickers_keyboard");
                }
                return s3q0.a;
            case 21:
                p810.k kVar = (p810.k) this.c;
                f810 f810Var = (f810) this.d;
                MarketSearchResponseDto marketSearchResponseDto = (MarketSearchResponseDto) obj;
                List<MarketMarketItemDto> d = marketSearchResponseDto.d();
                ArrayList arrayList4 = new ArrayList(c5g.u(d, 10));
                for (MarketMarketItemDto marketMarketItemDto : d) {
                    boolean z = f810Var.k;
                    List<glu> list7 = kVar.b;
                    UserId q = marketMarketItemDto.q();
                    Iterator<T> it3 = list7.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj2 = it3.next();
                            if (epx.f(((glu) obj2).b, fkq0.a(q))) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    glu gluVar = (glu) obj2;
                    if (gluVar != null) {
                        UserId userId = gluVar.b;
                        String str5 = gluVar.d;
                        Boolean bool2 = gluVar.f;
                        owner = new MultipickerProduct.Owner(userId, str5, bool2 != null ? bool2.booleanValue() : false);
                    } else {
                        owner = null;
                    }
                    arrayList4.add(new ha10(fno.a(marketMarketItemDto, z, owner)));
                }
                return new p810.k(kVar.b, arrayList4, marketSearchResponseDto.getCount(), 20, kVar.f, kVar.g, kVar.h, kVar.i);
            case 22:
                f2s f2sVar = (f2s) this.c;
                pw4 pw4Var = (pw4) this.d;
                v8v v8vVar = (v8v) obj;
                if (v8vVar instanceof v8v.b) {
                    f2sVar.invoke(((v8v.b) v8vVar).a);
                } else {
                    if (!(v8vVar instanceof v8v.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pw4Var.invoke(((v8v.a) v8vVar).a);
                }
                return s3q0.a;
            case 23:
                izs izsVar2 = (izs) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                izsVar2.invoke(MemberAction.h().get(((Integer) obj).intValue()));
                dw20 dw20Var = (dw20) ref$ObjectRef.element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 24:
                yi70 yi70Var = (yi70) this.c;
                yi70Var.a.a(((View) this.d).getContext());
                yi70Var.c.setText((CharSequence) null);
                return s3q0.a;
            case 25:
                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.b bVar3 = (com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.b) this.c;
                zpl0 zpl0Var = (zpl0) this.d;
                ykm0 ykm0Var = bVar3.f.a;
                boolean z2 = zpl0Var.e;
                boolean z3 = zpl0Var.d;
                uov uovVar = (uov) ykm0Var.a;
                if (uovVar != null && (analyticsParams = uovVar.getAnalyticsParams()) != null) {
                    ((anm0) ((bpn0) ykm0Var.c).getValue()).n(z2, z3, analyticsParams);
                }
                bVar3.T(c.e.b);
                bVar3.g.b(e.b.a);
                return s3q0.a;
            case 26:
                return P2PNetworkStatusReporter.Companion.a((BadNetworkIndicatorConfig) this.c, (RTCLog) this.d, (String) obj);
            case 27:
                ((com.vk.photos.root.photoflow.presentation.b) this.d).h.b(new b9a0.k(new j7k0(tq.h(tlo0.Companion, ((List) this.c).size() == 1 ? R.string.photo_flow_photo_archive_error : R.string.photo_flow_photos_archive_error), Integer.valueOf(R.drawable.vk_icon_warning_triangle_outline_28), Integer.valueOf(R.attr.vk_ui_accent_orange), null, null, null, 32)));
                return s3q0.a;
            case 28:
                c8a0 c8a0Var = (c8a0) this.c;
                c8a0Var.g.invoke(new b9a0.k(new j7k0(tq.h(tlo0.Companion, R.string.photo_flow_photo_pin_error), Integer.valueOf(R.drawable.vk_icon_warning_triangle_outline_28), Integer.valueOf(R.attr.vk_ui_accent_orange), new tlo0.f(R.string.photos_retry), new ew3(18, c8a0Var, (Photo) this.d), null, 32)));
                L.i((Throwable) obj);
                return s3q0.a;
            default:
                o0e0 o0e0Var = (o0e0) this.c;
                Hint hint = (Hint) this.d;
                ((Boolean) obj).getClass();
                h7v h7vVar = o0e0Var.a;
                h7vVar.detach();
                h7vVar.b(hint.b);
                return s3q0.a;
        }
    }
}
