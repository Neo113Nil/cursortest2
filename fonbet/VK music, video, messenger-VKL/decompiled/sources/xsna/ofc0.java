package xsna;

import android.app.Activity;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.editor.common.di.CommonEditorComponent;
import com.vk.camera.editor.stories.impl.di.StoryEditorComponentImpl;
import com.vk.cast.api.di.CastComponent;
import com.vk.catalog2.common.ui.mvp.holder.clip.VideoCatalogSearchRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderDebrandedVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemSliderVh;
import com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.BaseBadgeHolder;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.ecomm.market.attached.TaggedItemsBottomSheet;
import com.vk.ecomm.storefront.impl.community.presentation.fragment.StorefrontFragment;
import com.vk.ecomm.verifiedseller.api.di.VerifiedSellerComponent;
import com.vk.ecomm.verifiedseller.impl.screens.selectgroupverification.SelectGroupVerificationFragment;
import com.vk.gallerypicker.di.PhotoEditorComponent;
import com.vk.im.engine.models.messages.MsgPin;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.libvideo.api.promo.DownloadRedirectionDelegateComponent;
import com.vk.log.L;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.movika.impl.VideoInteractiveFullscreenFragment;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.newsfeed.impl.fragments.video.thread.VideoCommentsThreadInPlayerFragment;
import com.vk.newsfeed.impl.posting.PostingFragment;
import com.vk.reefton.observers.receivers.ReefNetworkReceiver;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.profile.presentation.a;
import com.vk.video.profile.presentation.catalog.holders.VideoProfileCatalogContentVh;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsFragmentInternalComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import xsna.c9p0;
import xsna.mih0;
import xsna.sx40;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ofc0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ofc0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v125, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.vk.search.params.api.SearchParamsWithCity] */
    @Override // xsna.gzs
    public final Object invoke() {
        TelephonyManager telephonyManager;
        Peer peer;
        pk30 pk30Var;
        l7m c;
        switch (this.b) {
            case 0:
                PostingFragment postingFragment = (PostingFragment) this.c;
                int i = PostingFragment.s0;
                return ((PhotoEditorComponent) m7m.d(postingFragment).a(fpf0.a(PhotoEditorComponent.class))).k4();
            case 1:
                List<VideoFile> list = ((PublishState) this.c).w;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((VideoFile) it.next()).a1());
                }
                return arrayList;
            case 2:
                dof0 dof0Var = (dof0) this.c;
                synchronized (dof0Var) {
                    if (dof0Var.g.isEmpty() && dof0Var.h) {
                        try {
                            ReefNetworkReceiver reefNetworkReceiver = dof0Var.f;
                            reefNetworkReceiver.a.unregisterReceiver(reefNetworkReceiver);
                            reefNetworkReceiver.b = null;
                            jof0 jof0Var = dof0Var.j;
                            if (jof0Var != null && (telephonyManager = dof0Var.b) != null) {
                                telephonyManager.listen(jof0Var, 0);
                            }
                        } catch (Throwable unused) {
                            dof0Var.d.b();
                        }
                        dof0Var.h = false;
                    }
                }
                return s3q0.a;
            case 3:
                dxh0 dxh0Var = (dxh0) this.c;
                dw20 dw20Var = dxh0Var.c;
                om6<?> om6Var = dxh0Var.a;
                dw20Var.Tn(om6Var.getSearchParams().I() ? 8 : 0);
                if (!om6Var.e()) {
                    TextView Kn = dw20Var.Kn();
                    Object parent = Kn != null ? Kn.getParent() : null;
                    View view = parent instanceof View ? (View) parent : null;
                    if (view != null) {
                        view.setBackgroundColor(dhr0.t.c(R.attr.vk_ui_background_content));
                    }
                }
                ysg0<Object> ysg0Var = ysg0.b;
                io.reactivex.rxjava3.internal.operators.observable.m1 a0 = ysg0Var.a.b0(kru0.class).U(new fhb0(cxh0.b, 6)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
                int i2 = 13;
                be50 be50Var = new be50(new ou1(dxh0Var, 9), i2);
                L l = L.a;
                io.reactivex.rxjava3.disposables.c subscribe = a0.subscribe(be50Var, new jsb0(new hv7(l, 6), 9));
                io.reactivex.rxjava3.disposables.b bVar = dxh0Var.b;
                bVar.b(subscribe);
                io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0Var.a;
                io.reactivex.rxjava3.internal.operators.mixed.j jVar = new io.reactivex.rxjava3.internal.operators.mixed.j(23);
                fVar.getClass();
                bVar.b(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, jVar).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new d120(dxh0Var, i2), new s520(new xa9(l, 12), 17)));
                return s3q0.a;
            case 4:
                return ((o0i0) this.c).c().b.ck();
            case 5:
                SelectGroupVerificationFragment selectGroupVerificationFragment = (SelectGroupVerificationFragment) this.c;
                qcy<Object>[] qcyVarArr = SelectGroupVerificationFragment.U;
                return ((VerifiedSellerComponent) ((k7m) m7m.f(selectGroupVerificationFragment)).a(fpf0.a(VerifiedSellerComponent.class))).a();
            case 6:
                ((io.reactivex.rxjava3.core.b) this.c).onComplete();
                return s3q0.a;
            case 7:
                return new o2j0(((SettingsFragmentInternalComponent) this.c).b.A());
            case 8:
                ((com.vk.sharing.core.view.f) this.c).Z1();
                return s3q0.a;
            case 9:
                Integer num = ((mih0.p) this.c).j;
                if (num != null) {
                    return new BaseBadgeHolder.a.C0709a(num.intValue(), R.attr.vk_ui_icon_contrast);
                }
                return null;
            case 10:
                ((xsk0) this.c).getPresenter().Q1();
                return s3q0.a;
            case 11:
                StorefrontFragment storefrontFragment = (StorefrontFragment) this.c;
                qcy<Object>[] qcyVarArr2 = StorefrontFragment.S;
                nzw nzwVar = storefrontFragment.P;
                qcy<Object> qcyVar = StorefrontFragment.S[0];
                return new aml0(new StorefrontFragment.c(1, (cpl0) nzwVar.getValue(), cpl0.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0), (ull0) storefrontFragment.O.getValue());
            case 12:
                CommonEditorComponent commonEditorComponent = (CommonEditorComponent) this.c;
                qcy<Object>[] qcyVarArr3 = StoryEditorComponentImpl.h;
                commonEditorComponent.Wc();
                return new wwf0();
            case 13:
                ymn0 ymn0Var = (ymn0) this.c;
                wh50 wh50Var = ymn0Var.l;
                wh50 wh50Var2 = ymn0Var.e;
                Object value = ((zak0) wh50Var).getValue();
                if (value != null) {
                    return value;
                }
                Float f = (Float) ((zak0) ymn0Var.g).getValue();
                return f != null ? ymn0Var.b(f.floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((zak0) wh50Var2).getValue()) : ((zak0) wh50Var2).getValue();
            case 14:
                TaggedItemsBottomSheet taggedItemsBottomSheet = (TaggedItemsBottomSheet) this.c;
                int i3 = TaggedItemsBottomSheet.o1;
                return m7m.d(taggedItemsBottomSheet);
            case 15:
                e6p0 e6p0Var = (e6p0) this.c;
                ((zak0) e6p0Var.k).setValue(Boolean.valueOf(true ^ e6p0Var.j()));
                return s3q0.a;
            case 16:
                c9p0.e eVar = (c9p0.e) this.c;
                wh50 wh50Var3 = eVar.d;
                com.vk.core.utils.newtork.b.a.getClass();
                if (com.vk.core.utils.newtork.b.d()) {
                    ((izs) ((zak0) wh50Var3).getValue()).invoke(new sx40.m0(((Boolean) ((zak0) eVar.b).getValue()).booleanValue(), PlayerContext.TOP));
                } else {
                    ((izs) ((zak0) wh50Var3).getValue()).invoke(sx40.o.b);
                }
                return s3q0.a;
            case 17:
                return (zhf0) ((wh50) ((Ref$ObjectRef) this.c).element).getValue();
            case 18:
                hgr0 hgr0Var = (hgr0) this.c;
                Regex regex = hgr0.X;
                return hgr0Var.Jn();
            case 19:
                return (TextView) ((lor0) this.c).a.findViewById(R.id.nativeads_age_restrictions);
            case 20:
                eur0 eur0Var = (eur0) this.c;
                MsgPin msgPin = eur0Var.r;
                if (msgPin != null && (peer = msgPin.h) != null && (pk30Var = eur0Var.s) != null) {
                    pk30Var.L(peer);
                }
                return s3q0.a;
            case 21:
                View view2 = ((VideoCatalogHeaderDebrandedVh) this.c).k;
                if (view2 == null || (c = m7m.c(view2)) == null) {
                    return null;
                }
                CastComponent castComponent = (CastComponent) ((k7m) c).a(fpf0.a(CastComponent.class));
                if (castComponent != null) {
                    return castComponent.L7();
                }
                return null;
            case 22:
                Activity activity = (Activity) this.c;
                int i4 = VideoCatalogSearchRootVh.S;
                return s200.v(activity);
            case 23:
                VideoCommentsThreadInPlayerFragment videoCommentsThreadInPlayerFragment = (VideoCommentsThreadInPlayerFragment) this.c;
                int i5 = VideoCommentsThreadInPlayerFragment.Q;
                return ((AttachmentMappersComponent) m7m.d(videoCommentsThreadInPlayerFragment).mo408a(fpf0.a(AttachmentMappersComponent.class))).f3();
            case 24:
                VideoInteractiveFullscreenFragment videoInteractiveFullscreenFragment = (VideoInteractiveFullscreenFragment) this.c;
                int i6 = VideoInteractiveFullscreenFragment.Q0;
                return ((VideoMinimizablePlayerComponent) m7m.d(videoInteractiveFullscreenFragment).a(fpf0.a(VideoMinimizablePlayerComponent.class))).b3();
            case 25:
                return ((DonutVideoComponent) ((VideoItemSliderVh) this.c).b0.getValue()).wb();
            case 26:
                return (DownloadRedirectionDelegateComponent) ((f8m) this.c).a(fpf0.a(DownloadRedirectionDelegateComponent.class));
            case 27:
                VideoProfileCatalogContentVh videoProfileCatalogContentVh = (VideoProfileCatalogContentVh) this.c;
                if (videoProfileCatalogContentVh.r != null) {
                    return new c7t0(videoProfileCatalogContentVh);
                }
                return null;
            case 28:
                VideoProfileFragmentOld videoProfileFragmentOld = (VideoProfileFragmentOld) this.c;
                int i7 = VideoProfileFragmentOld.p0;
                xn50.a.c(videoProfileFragmentOld, new a.k(true));
                return s3q0.a;
            default:
                uxt0 uxt0Var = (uxt0) this.c;
                return new r0d(uxt0Var.s, uxt0Var.g);
        }
    }
}
