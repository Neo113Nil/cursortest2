package defpackage;

import android.util.SizeF;
import android.view.View;
import androidx.recyclerview.widget.t0;
import com.vk.bridges.di.BridgeComponent;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.section.domain.CatalogSectionDo;
import com.vk.catalog.mvi.section.ui.entity.CatalogBlockData;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.catalog2.feature.music.holders.view.CatalogErrorViewWithImage;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.attachments.impl.publish.links.ClipsLinksControllerRootFragment;
import com.vk.clips.editor.state.model.c;
import com.vk.clips.editor.templates.impl.views.main.ClipsTemplateEditorFragment;
import com.vk.clips.sdk.models.SdkTrendingHashtag;
import com.vk.clips.sdk.shared.api.di.ClipsViewersSdkComponent;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.clips.viewer.impl.di.ClipsViewersSdkComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.common.links.LaunchContext;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.dto.clips.external.VideoToClipInfo;
import com.vk.dto.common.clips.TrendingHashtag;
import com.vk.ecomm.cart.impl.cart.CartFragment;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.im.reporters.api.msg.OpenMessagesHistoryReporter;
import com.vk.libvideo.ui.ad.AdvertBannerView;
import com.vk.movika.sdk.base.observable.w;
import com.vk.musc.kidsmode.api.di.MusicKidsModeComponent;
import com.vk.photo.editor.features.collage.view.CollageSlotView;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.photos.root.albumdetails.presentation.i;
import com.vk.video.profile.presentation.a;
import com.vk.voip.miniapps.api.di.VoipMiniAppCallComponent;
import io.reactivex.rxjava3.internal.operators.single.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.a0a;
import xsna.a6x0;
import xsna.b94;
import xsna.b96;
import xsna.bzd;
import xsna.c5g;
import xsna.c9d;
import xsna.cfa;
import xsna.cr4;
import xsna.ec;
import xsna.f12;
import xsna.feb0;
import xsna.fpf0;
import xsna.gg1;
import xsna.gzs;
import xsna.h31;
import xsna.i5s;
import xsna.j53;
import xsna.j5g;
import xsna.j7f;
import xsna.k7m;
import xsna.l0f;
import xsna.m7m;
import xsna.mu;
import xsna.mzp0;
import xsna.o1d;
import xsna.q0e;
import xsna.qcy;
import xsna.r46;
import xsna.r66;
import xsna.rx9;
import xsna.s0e;
import xsna.s3q0;
import xsna.spx0;
import xsna.svp;
import xsna.u7e;
import xsna.uy0;
import xsna.va9;
import xsna.wgb;
import xsna.wlg;
import xsna.x8;
import xsna.xwk;
import xsna.y440;
import xsna.y7f;
import xsna.ys;
import xsna.z84;
import xsna.zd9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class e implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = 1;
        switch (this.b) {
            case 0:
                return new svp(((l0) this.c).e);
            case 1:
                return new mu(((uy0) this.c).a);
            case 2:
                h31 h31Var = (h31) this.c;
                AdvertBannerView advertBannerView = h31Var.f;
                if (advertBannerView != null) {
                    advertBannerView.a();
                }
                h31Var.a.removeView(h31Var.f);
                h31Var.f = null;
                return s3q0.a;
            case 3:
                ((gg1) this.c).C(new a.h(i.n.a.c.a));
                return s3q0.a;
            case 4:
                f12 f12Var = (f12) this.c;
                return new Pair(f12Var.c(), f12Var.i.getValue());
            case 5:
                return ((j53) this.c).G;
            case 6:
                z84 z84Var = ((b94) this.c).t;
                if (z84Var != null) {
                    z84Var.z();
                }
                return s3q0.a;
            case 7:
                cr4 cr4Var = (cr4) this.c;
                return new feb0(cr4Var.a(), cr4Var.b());
            case 8:
                r46 r46Var = (r46) this.c;
                b0 F = r46Var.d.F(r46Var, new ys(r46Var.c.f));
                x8 x8Var = new x8(r46Var, i);
                int i2 = 6;
                r46Var.L(F, x8Var, new n(new w(r46Var, i2), 7));
                r46Var.j.i(new ec(r46Var, i2));
                return s3q0.a;
            case 9:
                return new b96((y440) this.c);
            case 10:
                return new a6x0(new r66((va9) this.c));
            case 11:
                CameraUIView cameraUIView = (CameraUIView) this.c;
                float f = CameraUIView.w1;
                zd9 camera1View = cameraUIView.getCamera1View();
                if (camera1View != null) {
                    camera1View.O(true);
                }
                return s3q0.a;
            case 12:
                CartFragment cartFragment = (CartFragment) this.c;
                qcy<Object>[] qcyVarArr = CartFragment.Y;
                return new rx9(((MarketComponent) ((k7m) m7m.f(cartFragment)).a(fpf0.a(MarketComponent.class))).U1());
            case 13:
                CatalogErrorViewWithImage catalogErrorViewWithImage = (CatalogErrorViewWithImage) this.c;
                int i3 = CatalogErrorViewWithImage.j;
                return ((MusicKidsModeComponent) ((k7m) m7m.c(catalogErrorViewWithImage)).a(fpf0.a(MusicKidsModeComponent.class))).T9();
            case 14:
                CatalogSectionDo catalogSectionDo = ((cfa) this.c).a;
                String str = catalogSectionDo.b;
                List<CatalogBlockState> list = catalogSectionDo.c;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new CatalogBlockData((CatalogBlockState) it.next()));
                }
                return new CatalogSectionState(false, str, arrayList, null, false, false, null, null, false, null, null, catalogSectionDo.d, null, 6137, null);
            case 15:
                return ((ChannelFragment) this.c).j0.a(OpenMessagesHistoryReporter.Span.ON_CREATE_VIEW);
            case 16:
                return i5s.a(new StringBuilder(), ((wgb) this.c).s, " destroyed");
            case 17:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) this.c;
                int i4 = ClipFeedListFragment.a2;
                return new l0f(new ClipFeedListFragment.j(1, clipFeedListFragment, ClipFeedListFragment.class, "onItemFocused", "onItemFocused(I)V", 0));
            case 18:
                return (ClipsViewersSdkComponentImpl) ((k7m) m7m.f((o1d) this.c)).a(fpf0.a(ClipsViewersSdkComponent.class));
            case 19:
                List<TrendingHashtag> list2 = ((ClipVideoFileAdapter) this.c).m.Q1;
                ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                for (TrendingHashtag trendingHashtag : list2) {
                    arrayList2.add(new SdkTrendingHashtag(trendingHashtag.b, trendingHashtag.c));
                }
                return arrayList2;
            case 20:
                bzd bzdVar = (bzd) this.c;
                c9d c9dVar = bzdVar.n;
                c9dVar.i(bzdVar.q);
                q0e q0eVar = bzdVar.h;
                s0e s0eVar = q0eVar.l;
                if (s0eVar == null) {
                    s0eVar = null;
                }
                s0eVar.d();
                q0eVar.V(true);
                c cVar = (c) j5g.b0(0, bzdVar.g().c);
                if (cVar != null && cVar.j != null) {
                    q0eVar.K(bzdVar.g().c.get(0).j);
                }
                c9dVar.seekTo(1L);
                VideoToClipInfo videoToClipInfo = bzdVar.b.c.w;
                if (videoToClipInfo != null && videoToClipInfo.d) {
                    ((CameraClipsComponent) ((k7m) m7m.f(bzdVar.e.f)).a(fpf0.a(CameraClipsComponent.class))).a5().a(bzdVar.c.getCtx());
                }
                mzp0 mzp0Var = bzdVar.f;
                if (mzp0Var != null) {
                    mzp0Var.d(null);
                }
                bzdVar.w.onComplete();
                return s3q0.a;
            case 21:
                return (t0) ((u7e) this.c).g.getValue();
            case 22:
                ClipsLinksControllerRootFragment clipsLinksControllerRootFragment = (ClipsLinksControllerRootFragment) this.c;
                int i5 = ClipsLinksControllerRootFragment.Q;
                xwk.d().getBrowser().f(clipsLinksControllerRootFragment.requireContext(), null, new LaunchContext(false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108863), i5s.a(new StringBuilder("https://"), a0a.d, "/@vkclippers-pravila-prikrepleniya-ssylok"));
                return s3q0.a;
            case 23:
                return Boolean.valueOf(((spx0) this.c).b());
            case 24:
                ClipsTemplateEditorFragment clipsTemplateEditorFragment = (ClipsTemplateEditorFragment) this.c;
                int i6 = ClipsTemplateEditorFragment.h0;
                return new y7f(clipsTemplateEditorFragment, new j7f(m7m.d(clipsTemplateEditorFragment)));
            case 25:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.c;
                int i7 = ClipsWrapperFragment.Q0;
                return clipsWrapperFragment.io().Of();
            case 26:
                CollageSlotView collageSlotView = (CollageSlotView) this.c;
                SizeF sizeF = collageSlotView.n;
                if (sizeF != null) {
                    return sizeF;
                }
                SizeF sizeF2 = new SizeF(((View) collageSlotView.getParent()).getWidth(), ((View) collageSlotView.getParent()).getHeight());
                collageSlotView.n = sizeF2;
                return sizeF2;
            case 27:
                return ((BridgeComponent) this.c).t();
            case 28:
                ((wlg) this.c).c.invoke(a.d0.b);
                return s3q0.a;
            default:
                return ((VoipMiniAppCallComponent) this.c).P();
        }
    }
}
