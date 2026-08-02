package defpackage;

import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.m;
import com.vk.articleeditor.api.di.ArticleComponent;
import com.vk.articles.ArticleFragment;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipGlobalSearchFeatureRootVh;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.attachments.api.di.ClipsAttachmentsComponent;
import com.vk.clips.attachments.impl.publish.links.ClipsLinksControllerRootFragment;
import com.vk.clips.design.view.editor.TransformOverlayView;
import com.vk.clips.sdk.drafts.api.ClipsDraftComponent;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment.b;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment.f;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.donut.design.view.badge.SmallOneTimeDonutBadge;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.ecomm.cart.impl.checkout.fragment.CheckoutFragment;
import com.vk.im.settings.appearance.AppearanceSettingsWithBackgroundsFragment;
import com.vk.im.ui.components.common.DndPeriodAndSound;
import com.vk.im.ui.views.settings.CheckableLabelSettingsView;
import com.vk.newsfeed.common.recycler.holders.videos.clips.ClipsHolderViewImpl;
import com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment;
import com.vk.photos.legacy.EditAlbumFragment;
import com.vk.photos.ui.album_list.AlbumsListFragment;
import com.vk.sharing.im_engine_impl.BaseSharingExternalActivity;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeShareItem;
import com.vk.stat.scheme.t0;
import com.vk.superapp.base.js.bridge.b;
import com.vk.toggle.d;
import com.vkontakte.android.R;
import com.vkontakte.android.TabletDialogActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import xsna.ar90;
import xsna.b94;
import xsna.bm9;
import xsna.bpn0;
import xsna.bzd;
import xsna.c1y;
import xsna.d2n0;
import xsna.dhr0;
import xsna.dw20;
import xsna.e0f;
import xsna.e2e;
import xsna.e6a;
import xsna.f94;
import xsna.fpf0;
import xsna.fsk;
import xsna.fz5;
import xsna.gzs;
import xsna.i5s;
import xsna.ig3;
import xsna.k7m;
import xsna.kbj0;
import xsna.kca;
import xsna.kd0;
import xsna.l36;
import xsna.ld0;
import xsna.m5p0;
import xsna.m63;
import xsna.m6e;
import xsna.m7m;
import xsna.m900;
import xsna.mg6;
import xsna.mgk0;
import xsna.mxd;
import xsna.nr4;
import xsna.nzl;
import xsna.o1d;
import xsna.o6e;
import xsna.o7a;
import xsna.oz50;
import xsna.p7a;
import xsna.pnf;
import xsna.pxv;
import xsna.qcy;
import xsna.qz50;
import xsna.r46;
import xsna.r4c;
import xsna.rh3;
import xsna.s0e;
import xsna.s3q0;
import xsna.s8d;
import xsna.u86;
import xsna.w6d;
import xsna.wgb;
import xsna.xqd;
import xsna.xy5;
import xsna.y440;
import xsna.zi3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class g implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Image image;
        int i = this.b;
        boolean z = false;
        Object obj = this.c;
        switch (i) {
            case 0:
                l0 l0Var = (l0) obj;
                return new c1y(l0Var.L0(), l0Var.w0(), l0Var.f);
            case 1:
                kd0.a aVar = ((ld0) obj).b;
                if (aVar != null) {
                    aVar.b();
                }
                return s3q0.a;
            case 2:
                AlbumsListFragment albumsListFragment = (AlbumsListFragment) obj;
                int i2 = AlbumsListFragment.a0;
                Bundle bundle = new Bundle();
                bundle.putParcelable("owner_id", albumsListFragment.Z);
                oz50 oz50Var = new oz50(EditAlbumFragment.class, null, bundle);
                TabletDialogActivity.a aVar2 = new TabletDialogActivity.a(0);
                aVar2.b();
                qz50.a(oz50Var, aVar2);
                oz50Var.g(8295, albumsListFragment);
                return s3q0.a;
            case 3:
                Uri uri = (Uri) obj;
                ar90 b = d.z0.b();
                if (b == null) {
                    ar90.b.getClass();
                    b = ar90.c;
                }
                List<Regex> list = b.a;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((Regex) it.next()).a(uri.toString())) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 4:
                AppearanceSettingsWithBackgroundsFragment appearanceSettingsWithBackgroundsFragment = (AppearanceSettingsWithBackgroundsFragment) obj;
                int i3 = AppearanceSettingsWithBackgroundsFragment.b0;
                if (dhr0.R()) {
                    appearanceSettingsWithBackgroundsFragment.go();
                    appearanceSettingsWithBackgroundsFragment.fo();
                    appearanceSettingsWithBackgroundsFragment.eo();
                } else {
                    CheckableLabelSettingsView checkableLabelSettingsView = appearanceSettingsWithBackgroundsFragment.Z;
                    (checkableLabelSettingsView != null ? checkableLabelSettingsView : null).setChecked(true);
                }
                return s3q0.a;
            case 5:
                rh3 rh3Var = (rh3) obj;
                if (rh3Var.m) {
                    rh3Var.C(ig3.b.b);
                } else {
                    rh3Var.o.b(new zi3.d.b(rh3Var.f));
                }
                return s3q0.a;
            case 6:
                int i4 = ArticleFragment.E0;
                return ((ArticleComponent) m7m.d((ArticleFragment) obj).mo408a(fpf0.a(ArticleComponent.class))).d0();
            case 7:
                return new f94((b94) obj);
            case 8:
                return (SmallOneTimeDonutBadge) ((xy5) obj).itemView.findViewById(R.id.comment_donut_small_badge);
            case 9:
                ((r46) obj).w(DndPeriodAndSound.NEVER);
                return s3q0.a;
            case 10:
                return u86.F((y440) obj);
            case 11:
                return new d2n0((b) ((mg6) obj).b);
            case 12:
                int i5 = BaseSharingExternalActivity.Z;
                nr4.b().d(new kbj0.a(-1, SchemeStat$TypeShareItem.ShareType.MESSAGE, Long.valueOf(((UserId) obj).b)));
                return s3q0.a;
            case 13:
                nzl.a aVar3 = BottomSheetCommentsFragment.f1;
                return Boolean.valueOf(!((BottomSheetCommentsFragment) obj).t2());
            case 14:
                float f = CameraUIView.w1;
                bm9 presenter = ((CameraUIView) obj).getPresenter();
                if (presenter != null) {
                    presenter.v4();
                }
                return s3q0.a;
            case 15:
                ((o7a) obj).T(p7a.a.b);
                return s3q0.a;
            case 16:
                ChannelFragment channelFragment = (ChannelFragment) obj;
                int i6 = ChannelFragment.a1;
                if (channelFragment.isResumed() && channelFragment.isAdded() && channelFragment.isVisible()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 17:
                return i5s.a(new StringBuilder(), ((wgb) obj).s, ": loadRecommendations: skip, loading in progress");
            case 18:
                int i7 = CheckoutFragment.T;
                return new r4c(m7m.d((CheckoutFragment) obj));
            case 19:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) obj;
                int i8 = ClipFeedListFragment.a2;
                pxv pxvVar = m63.e;
                ((pnf) (pxvVar != null ? pxvVar : null).invoke()).getClass();
                final int a = pnf.a();
                mgk0 mgk0Var = new mgk0(clipFeedListFragment);
                ClipFeedListFragment.k kVar = clipFeedListFragment.g1;
                m mVar = ((o6e) clipFeedListFragment.d1.getValue()).c;
                ClipFeedListFragment.f fVar = clipFeedListFragment.new f();
                Object obj2 = (xqd) clipFeedListFragment.I0.getValue();
                if (obj2 == null) {
                    obj2 = new fsk(16);
                }
                m6e m6eVar = new m6e(mgk0Var, kVar, mVar, fVar, new l36(obj2, new gzs() { // from class: xsna.hxc
                    @Override // xsna.gzs
                    public final Object invoke() {
                        int i9 = ClipFeedListFragment.a2;
                        return Integer.valueOf(a);
                    }
                }));
                ((ArrayList) m6eVar.h.b).add(clipFeedListFragment.new b());
                return m6eVar;
            case 20:
                ClipGlobalSearchFeatureRootVh clipGlobalSearchFeatureRootVh = (ClipGlobalSearchFeatureRootVh) obj;
                e6a e6aVar = new e6a(clipGlobalSearchFeatureRootVh.m.b.s.N(), (kca) clipGlobalSearchFeatureRootVh.u.getValue());
                e6aVar.s = t0.a(MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_CLIPS);
                return e6aVar;
            case 21:
                return ((ClipsAttachmentsComponent) ((k7m) m7m.f((o1d) obj)).a(fpf0.a(ClipsAttachmentsComponent.class))).H1();
            case 22:
                w6d w6dVar = (w6d) obj;
                return new m5p0(w6dVar.n, w6dVar.e);
            case 23:
                ((s8d) obj).f.decrementAndGet();
                return s3q0.a;
            case 24:
                qcy<Object>[] qcyVarArr = ClipVideoFileAdapter.B;
                m900<String, ImageSize> m900Var = ImageSize.e;
                ClipVideoFile clipVideoFile = ((ClipVideoFileAdapter) obj).m;
                ImageSize b2 = ImageSize.b.b(clipVideoFile.q0);
                if (b2 != null) {
                    image = new Image((List<ImageSize>) Collections.singletonList(b2));
                } else {
                    Owner owner = clipVideoFile.v0;
                    image = owner != null ? owner.g : null;
                }
                return image != null ? fz5.C(image) : new SdkImages(EmptyList.b, null, 2, null);
            case 25:
                bzd bzdVar = (bzd) obj;
                ClipsDraftComponent clipsDraftComponent = (ClipsDraftComponent) ((bpn0) bzdVar.g.d).getValue();
                e2e e2eVar = bzdVar.e;
                return new mxd(clipsDraftComponent, e2eVar.i.b(), e2eVar.i.e());
            case 26:
                return (TransformOverlayView) ((s0e) obj).i().findViewById(R.id.video_transform_overlay);
            case 27:
                int i9 = ClipsHolderViewImpl.d0;
                return (BridgeComponent) ((k7m) m7m.c((ClipsHolderViewImpl) obj)).a(fpf0.a(BridgeComponent.class));
            case 28:
                ClipsLinksControllerRootFragment clipsLinksControllerRootFragment = (ClipsLinksControllerRootFragment) obj;
                dw20 dw20Var = clipsLinksControllerRootFragment.P;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                clipsLinksControllerRootFragment.P = null;
                clipsLinksControllerRootFragment.dismiss();
                return s3q0.a;
            default:
                return ((e0f.a) obj).itemView.findViewById(R.id.video_wrap);
        }
    }
}
