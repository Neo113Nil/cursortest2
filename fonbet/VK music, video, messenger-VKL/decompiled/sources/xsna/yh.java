package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.b;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.antispam.di.AntispamComponent;
import com.vk.articles.ArticleFragment;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.BiometricsLockPinFragment;
import com.vk.bridges.di.BridgeComponent;
import com.vk.censoredsettings.di.CensoredSettingsInnerComponent;
import com.vk.clips.tool.view.newsfeed.overlay.ClipEndOverlayView;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.ecomm.clipproductattaches.di.ClipProductAttachesComponent;
import com.vk.ecomm.storefront.api.di.StorefrontComponent;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.music.playerservice.impl.PlayerService;
import com.vk.photos.root.archive.presentation.ArchiveFragment;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vkontakte.android.R;
import one.video.player.BaseVideoPlayer;
import ru.ok.android.externcalls.sdk.analytics.CallAnalyticsInitializer;
import xsna.f24;
import xsna.q7e;
import xsna.r2c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class yh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v113, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Integer init$lambda$3;
        switch (this.b) {
            case 0:
                return ((zh) this.c).i;
            case 1:
                Boolean bool = ((com.vk.superapp.browser.internal.ui.menu.action.c) this.c).l;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 2:
                ArchiveFragment archiveFragment = (ArchiveFragment) this.c;
                int i = ArchiveFragment.e0;
                return archiveFragment.fo().Od();
            case 3:
                ArticleFragment articleFragment = (ArticleFragment) this.c;
                int i2 = ArticleFragment.E0;
                articleFragment.uo(false);
                return s3q0.a;
            case 4:
                io.reactivex.rxjava3.disposables.c cVar = ((on4) this.c).d;
                if (cVar != null) {
                    cVar.dispose();
                }
                return s3q0.a;
            case 5:
                y440 y440Var = (y440) this.c;
                u76 requirePresenter = y440Var.getRequirePresenter();
                StickersDrawingViewGroup stickersDrawingView = y440Var.getStickersDrawingView();
                b96 animationsDelegate = y440Var.getAnimationsDelegate();
                return new djo(y440Var, stickersDrawingView, new vd7(requirePresenter), new y3j(animationsDelegate, stickersDrawingView), new vfe(animationsDelegate));
            case 6:
                one.video.player.l lVar = (one.video.player.l) this.c;
                vw3 vw3Var = BaseVideoPlayer.H;
                return "setSurfaceHolder() - surfaceHolder= " + lVar;
            case 7:
                BiometricsLockPinFragment biometricsLockPinFragment = (BiometricsLockPinFragment) this.c;
                int i3 = BiometricsLockPinFragment.c0;
                return BiometricsLockPinFragment.fo(biometricsLockPinFragment.getArguments());
            case 8:
                fx8 fx8Var = (fx8) this.c;
                int max = Math.max(((Number) fx8Var.i.getValue()).intValue(), ((Number) fx8Var.j.getValue()).intValue());
                b.a aVar = new b.a();
                z9l z9lVar = new z9l(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                fxc0.z(!aVar.o);
                aVar.b = z9lVar;
                aVar.b(max, max, 0, 0);
                aVar.c(true);
                androidx.media3.exoplayer.b a = aVar.a();
                PlayerService playerService = fx8Var.a;
                ExoPlayer.b bVar = new ExoPlayer.b(playerService);
                bVar.d(fx8Var.d.e(playerService));
                bVar.b(a);
                androidx.media3.exoplayer.c a2 = bVar.a();
                ex8 ex8Var = fx8Var.m;
                zw1 zw1Var = a2.t;
                ex8Var.getClass();
                zw1Var.G(ex8Var);
                return a2;
            case 9:
                init$lambda$3 = CallAnalyticsInitializer.init$lambda$3((i70) this.c);
                return init$lambda$3;
            case 10:
                final w89 w89Var = (w89) this.c;
                io.reactivex.rxjava3.core.a a3 = a201.b().b().a();
                io.reactivex.rxjava3.functions.n nVar = new io.reactivex.rxjava3.functions.n() { // from class: xsna.u89
                    @Override // io.reactivex.rxjava3.functions.n
                    public final Object get() {
                        return w89.this.a;
                    }
                };
                a3.getClass();
                return new io.reactivex.rxjava3.internal.operators.completable.c0(a3, nVar, null);
            case 11:
                return (xdw0) this.c;
            case 12:
                return io.reactivex.rxjava3.subjects.d.O0(Boolean.valueOf(((hj9) this.c).g));
            case 13:
                return (ClipsViewerComponent) ((nmg0) this.c).a(fpf0.a(ClipsViewerComponent.class));
            case 14:
                return ((StorefrontComponent) m7m.d(((yw9) this.c).d).a(fpf0.a(StorefrontComponent.class))).a();
            case 15:
                BridgeComponent bridgeComponent = (BridgeComponent) this.c;
                qcy<Object>[] qcyVarArr = CensoredSettingsInnerComponent.c;
                return new qpa(bridgeComponent.s().i(), bridgeComponent.s().A());
            case 16:
                vm30 vm30Var = ((gza) this.c).b().o;
                View view = vm30Var != null ? vm30Var.t : null;
                if (view != null) {
                    return bwt0.C(view);
                }
                return null;
            case 17:
                return i5s.a(new StringBuilder(), ((wgb) this.c).s, ": loadRecommendations: load from cache failed, start loading from network");
            case 18:
                ChatFragment chatFragment = (ChatFragment) this.c;
                ChatFragment.d dVar = ChatFragment.w1;
                return ((AntispamComponent) m7m.d(chatFragment).mo408a(fpf0.a(AntispamComponent.class))).ae();
            case 19:
                k3c k3cVar = (k3c) this.c;
                mzp0 mzp0Var = k3cVar.g;
                if (mzp0Var != null) {
                    mzp0Var.d(k3cVar.c());
                }
                return s3q0.a;
            case 20:
                ((q5c) this.c).b.a(new r2c.x(true));
                return s3q0.a;
            case 21:
                return new mjj0(((ylc) this.c).e);
            case 22:
                ClipEndOverlayView clipEndOverlayView = (ClipEndOverlayView) this.c;
                int i4 = ClipEndOverlayView.u;
                return (FrameLayout) clipEndOverlayView.findViewById(R.id.products_container);
            case 23:
                cfd cfdVar = (cfd) this.c;
                ClipProductAttachesComponent clipProductAttachesComponent = (ClipProductAttachesComponent) ((k7m) m7m.f(cfdVar)).mo408a(fpf0.a(ClipProductAttachesComponent.class));
                Context context = cfdVar.itemView.getContext();
                ClipProductAttachesComponent.Companion companion = ClipProductAttachesComponent.Companion;
                return clipProductAttachesComponent.C0(context, false, f24.a.a);
            case 24:
                return cmd.P4((cmd) this.c);
            case 25:
                d8e d8eVar = (d8e) this.c;
                q7e.b bVar2 = d8eVar.g.p;
                gxp0 gxp0Var = bVar2.b;
                b1r b1rVar = bVar2.c;
                ClipFeedListFragment.h hVar = bVar2.a;
                w6e w6eVar = new w6e();
                w6eVar.b = gxp0Var;
                w6eVar.c = b1rVar;
                return new bsr(new lh3(new o85(d8eVar, 2), 5), d8eVar, new com.vk.movika.tools.controls.seekbar.v(w6eVar, 3), new jzc(w6eVar), hVar, new j60(w6eVar, 7));
            case 26:
                return eug.C((eug) this.c);
            case 27:
                izg izgVar = (izg) this.c;
                dw20 dw20Var = izgVar.c;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                izgVar.c = null;
                return s3q0.a;
            case 28:
                j5h j5hVar = (j5h) this.c;
                j5hVar.B6(false);
                j5hVar.A6(true);
                return s3q0.a;
            default:
                return new qmq0((htq0) ((ynh) this.c).M.getValue());
        }
    }
}
