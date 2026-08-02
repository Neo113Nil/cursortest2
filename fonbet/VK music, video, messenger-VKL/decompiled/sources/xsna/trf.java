package xsna;

import android.os.Bundle;
import android.widget.TextView;
import com.unity3d.ads.adplayer.FullScreenWebViewDisplay;
import com.unity3d.ads.core.data.model.AdObject;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.community.design.view.cover.CommunityStaticCover;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.user.RequestUserProfile;
import com.vk.dzenarticle.impl.ui.store.DzenArticleInlineActor;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.fave.fragments.FavesTabSearchFragment;
import com.vk.log.L;
import com.vk.music.player.core.di.EqualizerControllerComponentImpl;
import com.vk.music.playlist.display.domain.a;
import com.vk.music.playlist.display.presentation.DisplayMusicPlaylistFragment;
import com.vk.photo.editor.features.markup.draw.model.stat.DrawStatEvent;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.core.scheduled_clips.b;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchAllCatalogRootVh;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import xsna.d5h;
import xsna.fss;
import xsna.j0j;
import xsna.nbx;
import xsna.ugl;
import xsna.ugl.a;
import xsna.v1j;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class trf implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ trf(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        AdObject adObject_delegate$lambda$2;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ClipsWrapperInputArguments.a aVar = ClipsWrapperInputArguments.r;
                Bundle a = ((ClipsWrapperInputArguments) obj).a();
                aVar.getClass();
                return ClipsWrapperInputArguments.a.d(a);
            case 1:
                dw20 dw20Var = ((pog) obj).e;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return Boolean.TRUE;
            case 2:
                return Boolean.valueOf(((double) ((Number) ((c1h) obj).t.getValue()).floatValue()) > 0.5d);
            case 3:
                d5h.c cVar = (d5h.c) obj;
                if (epx.f((String) ((zak0) cVar.r).getValue(), "market_cart") && ((wak0) cVar.s).getIntValue() > 0) {
                    r3 = true;
                }
                return Boolean.valueOf(r3);
            case 4:
                CommunityProfileFragment communityProfileFragment = (CommunityProfileFragment) obj;
                int i2 = CommunityProfileFragment.k0;
                CommunityProfileAction.e.b bVar = CommunityProfileAction.e.b.b;
                communityProfileFragment.getClass();
                xn50.a.c(communityProfileFragment, bVar);
                return s3q0.a;
            case 5:
                return (MarketComponent) ((k7m) m7m.f((vvh) obj)).a(fpf0.a(MarketComponent.class));
            case 6:
                com.vk.profile.core.scheduled_clips.h hVar = (com.vk.profile.core.scheduled_clips.h) obj;
                hVar.d.invoke(new b.a(hVar.c, true));
                return s3q0.a;
            case 7:
                int i3 = CommunityStaticCover.g;
                return Float.valueOf(((CommunityStaticCover) obj).getTransformFraction());
            case 8:
                nek0 nek0Var = (nek0) obj;
                if (nek0Var != null) {
                    nek0Var.show();
                }
                return s3q0.a;
            case 9:
                return (TextView) ((s5i) obj).a.findViewById(R.id.nativeads_description);
            case 10:
                L.A("Room participants update completed");
                ((s0j) obj).C(j0j.b.b);
                return s3q0.a;
            case 11:
                v1j.a aVar2 = (v1j.a) obj;
                L.e("Move participant " + aVar2.b + " to room " + aVar2.c + " completed");
                return s3q0.a;
            case 12:
                return ((j1z) obj).d();
            case 13:
                y6k y6kVar = (y6k) obj;
                y6kVar.j.k().y(y6kVar.k, y6kVar.q);
                return s3q0.a;
            case 14:
                qcy<Object>[] qcyVarArr = fck.t1;
                return ((BridgeComponent) m7m.d((fck) obj).a(fpf0.a(BridgeComponent.class))).C1();
            case 15:
                return Integer.valueOf(((xvy) obj).h());
            case 16:
                ugl uglVar = (ugl) obj;
                ugl.a aVar3 = uglVar.new a();
                return new nbx(uglVar.b, uglVar.c, new nbx.b(aVar3, aVar3, aVar3, aVar3, aVar3, aVar3, aVar3, aVar3, aVar3, aVar3, aVar3, aVar3, aVar3, aVar3, aVar3, aVar3, aVar3, aVar3), uglVar.e, uglVar.f, new nbx.f(new pce(uglVar, 18), new dof(uglVar, 16), new b1h(uglVar, 8)));
            case 17:
                int i4 = DisplayMusicPlaylistFragment.b0;
                ((com.vk.music.playlist.display.domain.b) obj).C(a.InterfaceC1338a.b.b);
                return s3q0.a;
            case 18:
                return (VkImage) ((u1o) obj).findViewById(R.id.donut_post_video_cover);
            case 19:
                wio wioVar = (wio) obj;
                wioVar.c.c(true);
                iio iioVar = wioVar.e.c;
                if (iioVar == null) {
                    iioVar = null;
                }
                hio hioVar = (hio) iioVar.b.b.getValue();
                vlo vloVar = hioVar.e.get(hioVar.c);
                c5p c5pVar = wioVar.y;
                List<uap> list = vloVar.a;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    Object meta = ((uap) it.next()).getMeta();
                    DrawStatEvent.b bVar2 = meta instanceof DrawStatEvent.b ? (DrawStatEvent.b) meta : null;
                    if (bVar2 != null) {
                        arrayList.add(bVar2);
                    }
                }
                c5pVar.b(new DrawStatEvent.d(arrayList));
                return s3q0.a;
            case 20:
                rdi.y((DzenArticleInlineActor) obj, new yy(26));
                return s3q0.a;
            case 21:
                return new bb4(((mqp) obj).d().y7().a(), new jr3(15));
            case 22:
                EqualizerControllerComponentImpl equalizerControllerComponentImpl = (EqualizerControllerComponentImpl) obj;
                qcy<Object>[] qcyVarArr2 = EqualizerControllerComponentImpl.d;
                return (MusicFeatures.AUDIO_LOUDNESS_NORMALIZATION.h() && fg40.a() == null) ? new qtp(equalizerControllerComponentImpl.b.f0()) : new ptp(equalizerControllerComponentImpl.a.Q0());
            case 23:
                int i5 = FavesTabSearchFragment.k0;
                return ((StoryViewerComponent) m7m.d((FavesTabSearchFragment) obj).a(fpf0.a(StoryViewerComponent.class))).tb();
            case 24:
                com.vk.folders.impl.configure.c cVar2 = (com.vk.folders.impl.configure.c) obj;
                return new dyr(cVar2.q, new dof(cVar2, 23));
            case 25:
                qfs qfsVar = qfs.this;
                OneVideoPlayer.State state = OneVideoPlayer.State.PAUSED;
                vw3 vw3Var = BaseVideoPlayer.H;
                qfsVar.s0(state, null);
                return s3q0.a;
            case 26:
                yis yisVar = (yis) obj;
                yisVar.n.a(new fss.b.C2893b((RequestUserProfile) yisVar.m));
                return s3q0.a;
            case 27:
                adObject_delegate$lambda$2 = FullScreenWebViewDisplay.adObject_delegate$lambda$2((FullScreenWebViewDisplay) obj);
                return adObject_delegate$lambda$2;
            case 28:
                return ((GlobalSearchAllCatalogRootVh) obj).k0().ck();
            default:
                return ((y4u) obj).e.xa();
        }
    }
}
