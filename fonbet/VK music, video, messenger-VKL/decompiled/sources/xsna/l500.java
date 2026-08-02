package xsna;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.vk.ads.api.di.AdsComponent;
import com.vk.ads.yandex.api.di.YandexAdFeatureComponent;
import com.vk.catalog2.feature.music.holders.MusicDynamicGridVh;
import com.vk.channels.impl.post_settings.PostSettingsFragment;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.search.ModernSearchView;
import com.vk.dto.common.Peer;
import com.vk.ecomm.market.album.MarketEditAlbumCoverFragment;
import com.vk.im.engine.di.ImConfigurationScopedComponent;
import com.vk.im.engine.di.scope.ImFeatureScopeProviderComponent;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.fragments.MsgViewFragment;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.newsfeed.impl.stats.PostViewFragmentTimeSpentTracker;
import com.vk.photo.editor.features.mlenhance.b;
import com.vk.photogallery.LocalGalleryProvider;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.superapp.base.js.bridge.data.OnboardingModalArguments;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.ok.android.webrtc.OKDefaultVideoDecoderFactory;
import xsna.e3m;
import xsna.ghc0.a;
import xsna.prm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class l500 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l500(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        vm30 vm30Var;
        vm30 vm30Var2;
        vm30 vm30Var3;
        vm30 vm30Var4;
        vm30 vm30Var5;
        vm30 vm30Var6;
        OnboardingModalArguments onboardingModalArguments;
        switch (this.b) {
            case 0:
                ((zdo0) this.c).onStop();
                return s3q0.a;
            case 1:
                MarketEditAlbumCoverFragment marketEditAlbumCoverFragment = (MarketEditAlbumCoverFragment) this.c;
                int i = MarketEditAlbumCoverFragment.d0;
                FragmentActivity activity = marketEditAlbumCoverFragment.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                return s3q0.a;
            case 2:
                d510 d510Var = (d510) this.c;
                int i2 = MarketItemCommentsFragment.j0;
                return d510Var;
            case 3:
                return (VkText) ((l910) this.c).findViewById(R.id.tv_info_badge);
            case 4:
                dw20 dw20Var = ((su10) this.c).q;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
            case 5:
                v3p v3pVar = ((com.vk.photo.editor.features.mlenhance.c) this.c).c;
                v3pVar.b().b(b.a.a);
                v3pVar.c(false);
                return s3q0.a;
            case 6:
                gzs<Boolean> gzsVar = ((ModernSearchView) this.c).s;
                return Boolean.valueOf(gzsVar != null ? gzsVar.invoke().booleanValue() : false);
            case 7:
                com.vk.im.ui.components.msg_list.a aVar = (com.vk.im.ui.components.msg_list.a) this.c;
                aVar.u2();
                a1w a1wVar = aVar.l;
                Context context = aVar.k;
                mxv mxvVar = aVar.z;
                com.vk.im.ui.components.msg_list.c cVar = aVar.O0;
                Dialog f = cVar.f();
                if (f == null) {
                    f = new Dialog();
                    f.setId(aVar.n);
                }
                DialogExt dialogExt = new DialogExt(f, cVar.h());
                aVar.o0 = new sxv(dialogExt, mxvVar, context, a1wVar.q());
                bpn0 bpn0Var = enj.a;
                aVar.q0 = new uxv(dialogExt, mxvVar, e3m.h(context), a1wVar.q());
                wjs wjsVar = aVar.b0;
                if (com.vk.im.ui.components.msg_list.a.A1(aVar.Y) && (vm30Var6 = aVar.o) != null) {
                    vm30Var6.I();
                }
                if (com.vk.im.ui.components.msg_list.a.A1(aVar.Z) && (vm30Var5 = aVar.o) != null) {
                    com.vk.im.popup.b bVar = vm30Var5.e0;
                    ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
                    imFeatures.getClass();
                    bVar.b(new joa0(com.vk.toggle.b.A.a(imFeatures)), new by20(vm30Var5, 2));
                }
                if (com.vk.im.ui.components.msg_list.a.A1(aVar.a0) && (vm30Var4 = aVar.o) != null) {
                    com.vk.im.popup.b bVar2 = vm30Var4.e0;
                    ImFeatures imFeatures2 = ImFeatures.IM_CHAT_MODALS_REDESIGN;
                    imFeatures2.getClass();
                    bVar2.b(new ji30(com.vk.toggle.b.A.a(imFeatures2)), new btm(vm30Var4, 22));
                }
                if (com.vk.im.ui.components.msg_list.a.A1(aVar.c0) && (vm30Var3 = aVar.o) != null) {
                    com.vk.im.popup.b bVar3 = vm30Var3.e0;
                    ImFeatures imFeatures3 = ImFeatures.IM_CHAT_MODALS_REDESIGN;
                    imFeatures3.getClass();
                    bVar3.b(new b040(com.vk.toggle.b.A.a(imFeatures3)), new w4u(vm30Var3, 13));
                }
                io.reactivex.rxjava3.disposables.c cVar2 = wjsVar.d;
                if (cVar2 != null && !cVar2.h() && (vm30Var2 = aVar.o) != null) {
                    vm30Var2.E(false);
                }
                io.reactivex.rxjava3.disposables.c cVar3 = wjsVar.e;
                if (cVar3 != null && !cVar3.h() && (vm30Var = aVar.o) != null) {
                    com.vk.im.popup.b bVar4 = vm30Var.e0;
                    ImFeatures imFeatures4 = ImFeatures.IM_CHAT_MODALS_REDESIGN;
                    imFeatures4.getClass();
                    bVar4.b(new lis(com.vk.toggle.b.A.a(imFeatures4)), new b010(vm30Var, 4));
                }
                Dialog f2 = cVar.f();
                vm30 vm30Var7 = aVar.o;
                if (vm30Var7 != null) {
                    vm30Var7.z((f2 == null || f2.sc()) ? false : true);
                }
                aVar.l2();
                aVar.J1(cVar.f());
                return s3q0.a;
            case 8:
                fo30 fo30Var = (fo30) this.c;
                if (iah0.w(fo30Var.a()) >= iah0.a(360)) {
                    Context a = fo30Var.a();
                    e3m.a aVar2 = e3m.a;
                    return m33.a(R.drawable.vk_icon_play_36, a);
                }
                Context a2 = fo30Var.a();
                e3m.a aVar3 = e3m.a;
                return m33.a(R.drawable.vk_icon_play_24, a2);
            case 9:
                xx30 xx30Var = (xx30) this.c;
                b25 b25Var = xx30Var.b;
                a1w a1wVar2 = xx30Var.a;
                Peer q = a1wVar2.q();
                cau0 cau0Var = a1wVar2.r().h;
                q.getClass();
                if (q.Ab(Peer.Type.GROUP) || (o25.b(b25Var) && !b25Var.i().S)) {
                    r1 = false;
                }
                return Boolean.valueOf(r1);
            case 10:
                MsgViewFragment msgViewFragment = (MsgViewFragment) this.c;
                int i3 = MsgViewFragment.i0;
                l7m d = m7m.d(msgViewFragment);
                return ((ImConfigurationScopedComponent) xq.f((ImFeatureScopeProviderComponent) d.a(fpf0.a(ImFeatureScopeProviderComponent.class)), (Peer) msgViewFragment.S.getValue(), d).a(fpf0.a(ImConfigurationScopedComponent.class))).b0();
            case 11:
                com.vk.catalog2.feature.music.configuration.b bVar5 = (com.vk.catalog2.feature.music.configuration.b) this.c;
                int i4 = 10;
                return new huh0(new bpn0(new t2l(bVar5, 24)), new bpn0(new cty(bVar5, i4)), new bpn0(new c6(18)), new bpn0(new xsw(bVar5, i4)), new com.vk.music.track.a(), bVar5.v0());
            case 12:
                return new mj40(new w69((MusicDynamicGridVh) this.c, 11));
            case 13:
                Bundle arguments = ((ko40) this.c).getArguments();
                if (arguments != null) {
                    return Integer.valueOf(arguments.getInt("extra_item_position"));
                }
                return null;
            case 14:
                return (TextView) ((g850) this.c).a.findViewById(R.id.nativeads_title);
            case 15:
                return (YandexAdFeatureComponent) ((mo60) this.c).c().a(fpf0.a(YandexAdFeatureComponent.class));
            case 16:
                androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) this.c;
                if (dVar != null) {
                    dVar.dismiss();
                }
                return s3q0.a;
            case 17:
                return OKDefaultVideoDecoderFactory.a((OKDefaultVideoDecoderFactory) this.c);
            case 18:
                zp70 zp70Var = (zp70) this.c;
                prm0.d dVar2 = prm0.d.a;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
                if (drm0.N("kotlin.Unit")) {
                    throw new IllegalArgumentException("Blank serial names are prohibited");
                }
                if (dVar2.equals(prm0.a.a)) {
                    throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                }
                sfc sfcVar = new sfc("kotlin.Unit");
                sfcVar.b = zp70Var.b;
                s3q0 s3q0Var = s3q0.a;
                return new zli0("kotlin.Unit", dVar2, sfcVar.c.size(), rl3.u0(serialDescriptorArr), sfcVar);
            case 19:
                de80 de80Var = (de80) this.c;
                int i5 = de80.p1;
                Bundle arguments2 = de80Var.getArguments();
                return (arguments2 == null || (onboardingModalArguments = (OnboardingModalArguments) arguments2.getParcelable(fpf0.a(OnboardingModalArguments.class).l())) == null) ? new OnboardingModalArguments(EmptyList.b) : onboardingModalArguments;
            case 20:
                return "OneVideoLivePlayer.maybeReportFirstBytes() - state= " + ((wl80) this.c).G;
            case 21:
                k4a0 k4a0Var = ((c4a0) this.c).d;
                return new bhg((k4a0Var != null ? k4a0Var : null).Mb());
            case 22:
                m8a0 m8a0Var = (m8a0) this.c;
                int i6 = m8a0.v1;
                return (PhotosComponent) ((k7m) m7m.f(m8a0Var)).a(fpf0.a(PhotosComponent.class));
            case 23:
                com.vk.photogallery.c cVar4 = (com.vk.photogallery.c) this.c;
                List<f5t> list = cVar4.c;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof LocalGalleryProvider) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((LocalGalleryProvider) it.next()).prefetch(cVar4.a);
                }
                return s3q0.a;
            case 24:
                bca0 bca0Var = (bca0) this.c;
                if (bca0Var.r.isAttachedToWindow()) {
                    bca0Var.r.requestLayout();
                }
                return s3q0.a;
            case 25:
                return (AdsComponent) ((k7m) m7m.f((y1c0) this.c)).mo408a(fpf0.a(AdsComponent.class));
            case 26:
                PostFragment postFragment = (PostFragment) this.c;
                int i7 = PostFragment.S0;
                if (postFragment.zo().l) {
                    return new PostViewFragmentTimeSpentTracker(new uv20(postFragment, 23));
                }
                return null;
            case 27:
                PostSettingsFragment postSettingsFragment = (PostSettingsFragment) this.c;
                int i8 = PostSettingsFragment.Y;
                return postSettingsFragment.requireContext();
            case 28:
                return Long.valueOf(((rbc0) this.c).a.getLong("draft_id_for_editing"));
            default:
                return ((ghc0) this.c).new a();
        }
    }
}
