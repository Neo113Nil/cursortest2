package xsna;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import com.facebook.drawee.generic.RoundingParams;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.catalog.mvi.section.di.CatalogComponent;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.ecomm.catalog.impl.catalog.root.ClassifiedsCatalogRootVh;
import com.vk.ecomm.catalog.impl.catalog.simple.ClassifiedsCatalogSimpleRootVh;
import com.vk.im.reporters.api.msg.OpenMessagesHistoryReporter;
import com.vk.im.ui.views.MentionCounterView;
import com.vk.imageloader.view.VKImageView;
import com.vk.music.api.di.MusicPlaybackQueueComponent;
import com.vk.music.player.api.di.PlayerUIComponent;
import com.vk.music.player.cache.MusicPlayerCacheComponentImpl;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.search.ui.impl.catalog.roots.MusicSearchCatalogRootVh;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.video.playlist.playlistscreen.di.PlaylistScreenFragmentInternalComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.d960;
import xsna.jia0;
import xsna.n1y;
import xsna.xn50;
import xsna.z31;
import xsna.z710;
import xsna.z8w;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class f5x implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f5x(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, xsna.dhg] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        String c;
        q0c q0cVar;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                h5x h5xVar = (h5x) obj;
                wh50 wh50Var = h5xVar.o;
                h5xVar.setFABVisible(!((Boolean) ((zak0) wh50Var).getValue()).booleanValue());
                izs<Boolean, s3q0> onChangeFABVisible = h5xVar.getOnChangeFABVisible();
                if (onChangeFABVisible != null) {
                    Boolean bool = (Boolean) ((zak0) wh50Var).getValue();
                    bool.booleanValue();
                    onChangeFABVisible.invoke(bool);
                }
                return s3q0.a;
            case 1:
                n1y n1yVar = (n1y) obj;
                r31 r31Var = new r31();
                l0q l0qVar = new l0q(n1yVar.l(), (e2n0) n1yVar.k.getValue());
                d41 d41Var = new d41(r31Var, n1yVar.d, n1yVar.j(), l0qVar, new z0h(n1yVar, 24));
                i16 i16Var = new i16(n1yVar.c, r31Var, new drg(n1yVar, 23), new wqf(n1yVar, 29), n1yVar.j(), l0qVar, n1yVar.d);
                n1y.a aVar = n1yVar.e;
                z31.a aVar2 = new z31.a(d41Var, i16Var, aVar.a, aVar.b, aVar.c);
                t9l t9lVar = n1yVar.f;
                mm6 mm6Var = new mm6(n1yVar, 21);
                t9lVar.getClass();
                return new z31(aVar2, r31Var, mm6Var);
            case 2:
                w9z w9zVar = (w9z) obj;
                w9zVar.j1.invoke(null);
                w9zVar.hide();
                return s3q0.a;
            case 3:
                zu00 zu00Var = (zu00) obj;
                return rl3.y0(new String[]{fpf0.a(ClassifiedsCatalogRootVh.class).a().getCanonicalName(), fpf0.a(ClassifiedsCatalogSimpleRootVh.class).a().getCanonicalName(), ((pfc) zu00Var.a).a().getCanonicalName(), ((pfc) zu00Var.b).a().getCanonicalName()});
            case 4:
                int i2 = MarketItemCommentsFragment.j0;
                return ((SharingComponent) m7m.d((MarketItemCommentsFragment) obj).a(fpf0.a(SharingComponent.class))).P8();
            case 5:
                f910 f910Var = (f910) obj;
                xn50.a.c(f910Var.d, z710.a.b);
                f910Var.e.invoke();
                return s3q0.a;
            case 6:
                tc10 tc10Var = (tc10) obj;
                Float e = ((dc10) tc10Var.a).e();
                return Boolean.valueOf(e != null && Float.compare(e.floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 1 && (c = ((dc10) tc10Var.a).c()) != null && c.length() > 0);
            case 7:
                return MentionCounterView.f((MentionCounterView) obj);
            case 8:
                return ((mdz) ((bg20) obj).f.getValue()).a(OpenMessagesHistoryReporter.Span.LOAD_PROFILES);
            case 9:
                return (vq20) ((yq20) obj).C;
            case 10:
                return new bhg(((wv20) obj).b.Mb());
            case 11:
                iy20.g(20, (Context) obj);
                return s3q0.a;
            case 12:
                return ((jl30) obj).k().a(OpenMessagesHistoryReporter.Span.BUILD_ADAPTER_ENTRY_LIST);
            case 13:
                return ((zn30) obj).e().getString(R.string.vkim_accessibility_icon_pause);
            case 14:
                z8w.a aVar3 = ((j140) obj).n.h;
                if (aVar3 != null) {
                    return aVar3.a();
                }
                return null;
            case 15:
                qcy<Object>[] qcyVarArr = MusicPlayerCacheComponentImpl.d;
                return new r9g0(((MusicPlayerCacheComponentImpl) obj).v0().a() * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            case 16:
                return ((MusicSearchCatalogRootVh) obj).k0().V();
            case 17:
                VKImageView vKImageView = (VKImageView) ((y750) obj).findViewById(R.id.ivTrack);
                vKImageView.getHierarchy().u(RoundingParams.b(y750.j));
                vKImageView.getHierarchy().q(150);
                return vKImageView;
            case 18:
                bpn0 bpn0Var = ((yx50) obj).C;
                return new mxa0(((AuthBridgeComponent) j6i.b((h7m) bpn0Var.getValue(), AuthBridgeComponent.class)).s(), ((MusicPlaybackQueueComponent) j6i.b((h7m) bpn0Var.getValue(), MusicPlaybackQueueComponent.class)).za(), (PlayerUIComponent) j6i.b((h7m) bpn0Var.getValue(), PlayerUIComponent.class));
            case 19:
                return new d960.b((d960) obj);
            case 20:
                qcy<Object>[] qcyVarArr2 = NewsfeedFragment.J0;
                return ((NewsfeedFragment) obj).getActivity();
            case 21:
                return new p960(((mo60) obj).j);
            case 22:
                return (qz60) ((dv60) obj).b.getCurrentState();
            case 23:
                vx6 vx6Var = (vx6) obj;
                if (vx6Var != null && (q0cVar = (q0c) ((r0c) vx6Var.c).a) != null) {
                    q0cVar.e();
                }
                return s3q0.a;
            case 24:
                List list = (List) ((yn80) obj).B.getValue();
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    cms0 d = fr10.d((androidx.media3.common.a) it.next());
                    arrayList.add(new one.video.player.tracks.c(hr80.x(d), d, true));
                }
                return arrayList;
            case 25:
                ((lv90) obj).lo(1);
                return s3q0.a;
            case 26:
                PhotoVideoAttachActivity photoVideoAttachActivity = (PhotoVideoAttachActivity) obj;
                int i3 = PhotoVideoAttachActivity.g0;
                GalleryFragmentImpl galleryFragmentImpl = (GalleryFragmentImpl) photoVideoAttachActivity.n().f(R.id.fl_container);
                if (galleryFragmentImpl != null) {
                    galleryFragmentImpl.P = photoVideoAttachActivity.Q.getBottom();
                }
                return s3q0.a;
            case 27:
                return ((PhotosComponent) ((k7m) m7m.f((com.vk.photos.root.presentation.h) obj)).a(fpf0.a(PhotosComponent.class))).z8();
            case 28:
                qia0 qia0Var = (qia0) obj;
                ((f4z) qia0Var.c.getFeature().U()).b(jia0.a.a);
                qia0Var.a();
                return s3q0.a;
            default:
                PlaylistScreenFragmentInternalComponent playlistScreenFragmentInternalComponent = (PlaylistScreenFragmentInternalComponent) obj;
                CatalogComponent catalogComponent = playlistScreenFragmentInternalComponent.d;
                nwy nwyVar = playlistScreenFragmentInternalComponent.r;
                qcy<Object> qcyVar = PlaylistScreenFragmentInternalComponent.y[8];
                return catalogComponent.i8((com.vk.video.playlist.playlistscreen.catalog.a) nwyVar.c());
        }
    }

    public /* synthetic */ f5x(iy20 iy20Var, Context context) {
        this.b = 11;
        this.c = context;
    }
}
