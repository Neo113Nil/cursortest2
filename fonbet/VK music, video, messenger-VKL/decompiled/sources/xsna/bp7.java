package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import com.vk.api.generated.market.dto.MarketProductLinkedContentItemDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockHideBlockButton;
import com.vk.catalog2.common.ui.mvp.holder.NavigationTabVh;
import com.vk.clips.design.view.filter.HslView;
import com.vk.clips.design.view.hsl.HslRecyclerView;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerFragment;
import com.vk.clips.playlists.ui.picker.f;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.Good;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.market.catalog.CatalogMarketSorting;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.ecomm.market.api.marketlinkedcontent.router.LinkedContentAnalyticsParams;
import com.vk.ecomm.market.good.linkedcontent.mvi2.ui.MarketLinkedContentFragment;
import com.vk.ecomm.market.good.ui.holder.contentholder.MediaContentItem;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.a;
import com.vk.editor.filters.correction.entity.HslColorType;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList;
import com.vk.profile.user.impl.ui.b;
import com.vk.voip.ui.asr.ui.list.PastAsrListFragment;
import com.vk.voip.ui.asr.ui.list.a;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.externcalls.sdk.ml.MLFeaturesManagerImpl;
import ru.ok.android.webrtc.noisesuppressor.NoiseSuppressorActiveState;
import ru.ok.media.OkmpStreamPublisher;
import ru.ok.proto.okmp.OkmpPublisherNative;
import xsna.f0r;
import xsna.gm50;
import xsna.hc10;
import xsna.ikv0;
import xsna.j0j;
import xsna.ksf;
import xsna.m1j;
import xsna.n9q0;
import xsna.nsf;
import xsna.snx;
import xsna.t610;
import xsna.uuf;
import xsna.wk50;
import xsna.wzd;
import xsna.ybb;
import xsna.zjh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class bp7 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bp7(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        snx.b cVar;
        Window window;
        NoiseSuppressorActiveState nsParams$lambda$1;
        s3q0 startNetworkMonitor$lambda$2;
        int i2 = this.b;
        int i3 = 4;
        int i4 = 14;
        int i5 = 8;
        int i6 = 3;
        VkTopBar.c.a aVar = null;
        char c = 1;
        char c2 = 1;
        byte b = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i2) {
            case 0:
                gp7 gp7Var = (gp7) obj3;
                yvj yvjVar = (yvj) obj2;
                ljo0 ljo0Var = (ljo0) obj;
                fp7 fp7Var = gp7Var.i;
                if (fp7Var.c && (i = ljo0Var.b.f) != fp7Var.a) {
                    fp7Var.c = false;
                    fp7Var.a = i;
                    if (fp7Var.b) {
                        myc0.h(yvjVar, null, null, new ep7(gp7Var, null), 3);
                    }
                }
                return s3q0.a;
            case 1:
                String str = (String) obj;
                return Boolean.valueOf((((Set) obj3).contains(str) || ((ArrayList) obj2).contains(str)) ? false : true);
            case 2:
                w2w w2wVar = (w2w) obj3;
                k8b k8bVar = (k8b) obj2;
                uib a = w2wVar.I0().a();
                long j = k8bVar.c.b;
                bdb c3 = a.c(j);
                if (c3 != null) {
                    vcb vcbVar = c3.i;
                    w2wVar.I0().a().x(j, vcb.b(vcbVar, vcbVar.b.j(k8bVar.d), 0L, 2));
                }
                xgl0 I0 = w2wVar.I0();
                List singletonList = Collections.singletonList(Long.valueOf(j));
                return (aeb) (singletonList.isEmpty() ? jgp.b : (Map) I0.u(new beb((Collection) singletonList, (boolean) (c == true ? 1 : 0), I0))).get(Long.valueOf(j));
            case 3:
                ((zbb) obj3).O(new ybb.f((MsgFromChannel) obj2, (ChannelMsgSendConfig) obj, false));
                return s3q0.a;
            case 4:
                ((gwc) obj3).j((String) obj2);
                ((ikv0) obj).a();
                return s3q0.a;
            case 5:
                szd szdVar = (szd) obj2;
                ((defpackage.e) obj3).invoke();
                szdVar.m.addLast(new com.vk.clips.editor.state.model.d(szdVar.o.a, e43.l(new wzd.c(b), new wzd.b(null))));
                return s3q0.a;
            case 6:
                ClipsPlaylistPickerFragment.a aVar2 = (ClipsPlaylistPickerFragment.a) obj3;
                ClipsPlaylistPickerFragment clipsPlaylistPickerFragment = (ClipsPlaylistPickerFragment) obj2;
                f.a aVar3 = (f.a) obj;
                int i7 = ClipsPlaylistPickerFragment.V;
                aVar2.c.setVisibility(0);
                aVar2.e.setVisibility(8);
                aVar2.f.setVisibility(8);
                gm50.a.a(clipsPlaylistPickerFragment, aVar3.a, new lbe(clipsPlaylistPickerFragment, c2 == true ? 1 : 0));
                gm50.a.a(clipsPlaylistPickerFragment, aVar3.b, new z5a(i3, clipsPlaylistPickerFragment, aVar2));
                return s3q0.a;
            case 7:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) obj2;
                wuf wufVar = (wuf) obj;
                int i8 = ClipsWrapperFragment.Q0;
                ksf o = ((uuf.g) obj3).o();
                wufVar.getTopBar().setBack(o instanceof ksf.a ? new VkTopBar.b(new hn9(i3, clipsWrapperFragment, (ksf.a) o), tq.h(tlo0.Companion, ((ksf.a) o).c), null, null, com.vk.core.compose.component.semantics.b.a(null, new lt0(19), 3), 12) : null);
                VkTopBar topBar = wufVar.getTopBar();
                if (o instanceof ksf.b) {
                    nsf nsfVar = ((ksf.b) o).d;
                    if (nsfVar instanceof nsf.a) {
                        cVar = new snx.b.C3683b(new gko(R.drawable.vk_icon_arrow_left_outline_28), null, 6);
                    } else {
                        if (!(nsfVar instanceof nsf.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String str2 = ((nsf.b) nsfVar).a;
                        cVar = new snx.b.c(new vlw(str2 != null ? str2 : "", null), null, null, 14);
                    }
                    ksf.b bVar = (ksf.b) o;
                    aVar = new VkTopBar.c.a(new snx(cVar), new rp1(5, clipsWrapperFragment, bVar), null, new mk(i6, bVar, clipsWrapperFragment), com.vk.core.compose.component.semantics.b.a(null, new ma(7, wufVar, bVar), 3), 4);
                }
                topBar.setBefore(aVar);
                return s3q0.a;
            case 8:
                VkPicture vkPicture = ((zjh.b) obj3).a;
                ImageSize Cb = ((PhotoAlbum) obj2).u.Cb(vkPicture.getWidth(), true, true);
                vkPicture.o0(Cb != null ? Cb.d.d : null, null);
                return s3q0.a;
            case 9:
                ((i1j) obj3).e.invoke(new j0j.f(((m1j.e.b.c) ((m1j.e.b) obj2)).b.a, ((lvi0) obj).a.a));
                return s3q0.a;
            case 10:
                ((cjj) obj3).eo(((yjj) obj2).a);
                return s3q0.a;
            case 11:
                ((f0r.f) obj3).h((wk50.a) obj2, (Throwable) obj);
                return s3q0.a;
            case 12:
                return i2w.a().C((h0s) obj3, new jqm(Source.CACHE)).l(new ft0(new srg((FolderType) obj2, i4), 23));
            case 13:
                wh50 wh50Var = (wh50) obj2;
                tho0 tho0Var = (tho0) obj;
                ((wh50) obj3).setValue(tho0Var);
                wh50Var.setValue(tho0Var.a.c.length() > 10 ? "Too large" : "");
                return s3q0.a;
            case 14:
                ((ruu) obj3).L().invoke((b.r) obj2);
                return s3q0.a;
            case 15:
                wjs0.a(new uwr0(((UIBlockHideBlockButton) obj3).B, false));
                Activity h = e3m.h((Context) obj2);
                if (h != null && (window = h.getWindow()) != null) {
                    int i9 = ikv0.e;
                    ikv0.b.a(window);
                }
                return s3q0.a;
            case 16:
                HslView hslView = (HslView) obj3;
                wgv wgvVar = (wgv) obj2;
                float floatValue = ((Float) obj).floatValue();
                HslRecyclerView hslRecyclerView = hslView.t;
                HslColorType hslColorType = wgvVar.a;
                ugv ugvVar = hslRecyclerView.c;
                final x2e x2eVar = new x2e(hslColorType, 21);
                wgv wgvVar2 = (wgv) ((ListDataSet) ugvVar.c).t(new Predicate() { // from class: xsna.ahv
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj4) {
                        int i10 = HslRecyclerView.e;
                        return ((Boolean) x2e.this.invoke(obj4)).booleanValue();
                    }
                });
                if (wgvVar2 != null) {
                    wgvVar2.c = floatValue;
                }
                izs<? super wgv, s3q0> izsVar = hslView.x;
                if (izsVar != null) {
                    izsVar.invoke(wgvVar);
                }
                return s3q0.a;
            case 17:
                String str3 = (String) obj2;
                ((l2y) obj3).w0().l(str3 != null ? fco0.h(str3, (Throwable) obj) : null);
                return s3q0.a;
            case 18:
                nsParams$lambda$1 = MLFeaturesManagerImpl.setNsParams$lambda$1((sd) obj3, (String) obj2, (NoiseSuppressorActiveState.Builder) obj);
                return nsParams$lambda$1;
            case 19:
                fh9 fh9Var = (fh9) obj2;
                ((gw00) obj3).a((UIBlock) fh9Var.b, (Good) fh9Var.c, true);
                return s3q0.a;
            case 20:
                MarketLinkedContentFragment marketLinkedContentFragment = (MarketLinkedContentFragment) obj3;
                ComposeView composeView = (ComposeView) obj2;
                t610 t610Var = (t610) obj;
                qcy<Object>[] qcyVarArr = MarketLinkedContentFragment.R;
                if (t610Var.equals(t610.a.a)) {
                    marketLinkedContentFragment.finish();
                } else {
                    if (!(t610Var instanceof t610.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Context context = composeView.getContext();
                    if (context != null) {
                        hc10 hc10Var = (hc10) marketLinkedContentFragment.P.getValue();
                        MediaContentItem mediaContentItem = ((t610.b) t610Var).a;
                        u1h0 u1h0Var = marketLinkedContentFragment.Q;
                        qcy<Object> qcyVar = MarketLinkedContentFragment.R[0];
                        LinkedContentAnalyticsParams linkedContentAnalyticsParams = ((m710) u1h0Var.getValue()).getCurrentState().k;
                        hc10Var.getClass();
                        MarketProductLinkedContentItemDto marketProductLinkedContentItemDto = mediaContentItem.b;
                        int i10 = hc10.a.$EnumSwitchMapping$0[marketProductLinkedContentItemDto.d().ordinal()];
                        if (i10 == 1) {
                            hc10Var.d(context, mediaContentItem, linkedContentAnalyticsParams);
                        } else {
                            if (i10 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (marketProductLinkedContentItemDto.f() == null) {
                                hc10Var.b(context, mediaContentItem, linkedContentAnalyticsParams);
                            } else {
                                hc10.c(context, mediaContentItem, linkedContentAnalyticsParams);
                            }
                        }
                    }
                }
                return s3q0.a;
            case 21:
                return ((vh40) obj3).o((MusicTrack) obj2, (List) obj);
            case 22:
                ((nk40) obj3).getClass();
                return Boolean.valueOf(k5a.b((UIBlockList) obj, new dxh((UserId) obj2, 28)));
            case 23:
                ((qs40) obj3).T(new ut40((MusicPickerList) obj2, (ta90) obj));
                return s3q0.a;
            case 24:
                NavigationTabVh navigationTabVh = (NavigationTabVh) obj3;
                pll pllVar = (pll) obj2;
                u4a u4aVar = navigationTabVh.b;
                av00.a(new nu00(u4aVar.b.a, new CatalogMarketSorting(null, ((dfk0) obj).b, 1, null)));
                String str4 = u4aVar.b.a;
                String str5 = navigationTabVh.n;
                if (str5 == null) {
                    str5 = null;
                }
                av00.a(new pu00(str4, str5));
                dw20 dw20Var = (dw20) pllVar.b;
                (dw20Var != null ? dw20Var : null).dismiss();
                return s3q0.a;
            case 25:
                startNetworkMonitor$lambda$2 = OkmpStreamPublisher.startNetworkMonitor$lambda$2((OkmpStreamPublisher) obj3, (OkmpPublisherNative) obj2, (qox) obj);
                return startNetworkMonitor$lambda$2;
            case 26:
                nvy nvyVar = (nvy) obj;
                nvy.g(nvyVar, null, null, gji.a, 3);
                List list = ((a.d) obj3).b;
                wow wowVar = new wow(list);
                nvyVar.e(list.size(), new zv80(new nq2(b, i5), wowVar), new aw80(wowVar), new jai(2039820996, new bw80(wowVar, (izs) obj2), true));
                return s3q0.a;
            case 27:
                int i11 = PastAsrListFragment.U;
                ((PastAsrListFragment) obj3).fo((a.C2010a) obj, (PastAsrListFragment.b) obj2);
                return s3q0.a;
            case 28:
                myb0.d().a(hyb0.a((hyb0) ((Ref$ObjectRef) obj3).element, false, ((Ref$IntRef) obj2).element, 3));
                L.i((Throwable) obj);
                return io.reactivex.rxjava3.core.x.k(Boolean.FALSE);
            default:
                i0q0.f(new crf((n9q0.a) obj, (u6c0) obj3, (s6c0) obj2, i6));
                return s3q0.a;
        }
    }

    public /* synthetic */ bp7(myb0 myb0Var, Ref$ObjectRef ref$ObjectRef, Ref$IntRef ref$IntRef) {
        this.b = 28;
        this.c = ref$ObjectRef;
        this.d = ref$IntRef;
    }
}
