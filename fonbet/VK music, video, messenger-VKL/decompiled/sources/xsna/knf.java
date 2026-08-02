package xsna;

import android.content.Context;
import com.vk.auth.DefaultAuthActivity;
import com.vk.catalog.mvi.block.api.CatalogViewComponent;
import com.vk.catalog.mvi.block.music.api.di.CatalogMusicViewComponent;
import com.vk.catalog.mvi.block.video.api.CatalogVideoViewComponent;
import com.vk.catalog.mvi.section.di.CatalogComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.preference.Preference;
import com.vk.ecomm.reviews.impl.di.ReviewsComponentImpl;
import com.vk.ecomm.storefront.impl.di.StorefrontComponentImpl;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.im.engine.di.ImConfigurationComponentImpl;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.mediastore.storage.ClipsVideoStorage;
import com.vk.mytarget.di.AdsSdkComponentImpl;
import com.vk.profile.community.address.impl.di.CommunityAddressComponentImpl;
import com.vk.push.rustore.impl.di.RuStoreComponentImpl;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.superapp.di.SuperAppServicesComponent;
import com.vk.toggle.Features;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.di.VoipCallComponentImpl;
import com.vkontakte.android.VKApplication;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class knf implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ knf(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        long j;
        switch (this.b) {
            case 0:
                Context context = null;
                ClipsVideoStorage clipsVideoStorage = ClipsVideoStorage.a;
                clipsVideoStorage.getClass();
                Context context2 = e43.a;
                if (context2 == null) {
                    context2 = null;
                }
                swk b = ClipsVideoStorage.b(context2, true);
                PrivateFiles.a b2 = e8r.a.b(PrivateSubdir.CLIPS, ukd.a(com.vk.toggle.d.g().a), true);
                if (b == null) {
                    return null;
                }
                File file = b2.a;
                int i = ClipsVideoStorage.a.$EnumSwitchMapping$0[b2.b.ordinal()];
                if (i == 1 || i == 2) {
                    j = 16777216;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j = 104857600;
                }
                long j2 = j;
                Context context3 = e43.a;
                if (context3 != null) {
                    context = context3;
                }
                return new j7q(context, file, j2, true, 0L, b, new nnf(2, clipsVideoStorage, ClipsVideoStorage.class, "downloadClip", "downloadClip(Landroidx/media3/exoplayer/offline/DownloadRequest;Landroidx/media3/datasource/cache/CacheDataSource$Factory;)Landroidx/media3/exoplayer/offline/Downloader;", 0), (yw8) ClipsVideoStorage.f.getValue(), 784);
            case 1:
                return new CommunityAddressComponentImpl.a();
            case 2:
                return new AdsSdkComponentImpl.a();
            case 3:
                DefaultAuthActivity defaultAuthActivity = DefaultAuthActivity.U;
                return Boolean.valueOf(SakFeatures.Type.VKC_SMARTFLOW_INTERNAL_ANDROID.h());
            case 4:
                return com.vk.toggle.b.A.i(Features.Type.FEATURE_NET_OPTIONS);
            case 5:
                uy2 uy2Var = DialogTheme.f;
                return (DialogTheme) (uy2Var != null ? uy2Var : null).invoke();
            case 6:
                int i2 = ((aky) gjv.c.getValue()).e;
                throw null;
            case 7:
                qcy<Object>[] qcyVarArr = ImConfigurationComponentImpl.c;
                return mbw.a;
            case 8:
                return ddg0.a;
            case 9:
                mbw.a.getClass();
                String str = "im_remote_config_prefs_" + o25.a().c().b;
                Context context4 = e43.a;
                return Preference.h(context4 != null ? context4 : null, 0, str);
            case 10:
                return ((SuperAppServicesComponent) ((k7m) m7m.f(new w7m())).mo408a(fpf0.a(SuperAppServicesComponent.class))).w5();
            case 11:
                qcy<Object>[] qcyVarArr2 = ReviewsComponentImpl.l;
                return new wig0();
            case 12:
                return new StorefrontComponentImpl.a();
            case 13:
                qcy<Object>[] qcyVarArr3 = StoriesComponentImpl.N;
                return new o3t();
            case 14:
                return dgn0.c().a;
            case 15:
                VKApplication.a aVar = VKApplication.c;
                CatalogMusicViewComponent catalogMusicViewComponent = (CatalogMusicViewComponent) m7m.e().a(fpf0.a(CatalogMusicViewComponent.class));
                CatalogVideoViewComponent catalogVideoViewComponent = (CatalogVideoViewComponent) m7m.e().a(fpf0.a(CatalogVideoViewComponent.class));
                CatalogViewComponent catalogViewComponent = (CatalogViewComponent) m7m.e().a(fpf0.a(CatalogViewComponent.class));
                catalogViewComponent.P9(BuildInfo.h());
                catalogViewComponent.W6(new oji0(catalogVideoViewComponent, 1));
                catalogViewComponent.K9(new cir(catalogVideoViewComponent, 2));
                catalogViewComponent.y();
                catalogMusicViewComponent.Q();
                catalogMusicViewComponent.y();
                catalogVideoViewComponent.Q();
                catalogVideoViewComponent.y();
                CatalogComponent catalogComponent = (CatalogComponent) m7m.e().a(fpf0.a(CatalogComponent.class));
                catalogComponent.q9(catalogMusicViewComponent.H5());
                catalogComponent.q9(catalogVideoViewComponent.Oa());
                return s3q0.a;
            case 16:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_AVATAR_LIVE_BADGE;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 17:
                return new RuStoreComponentImpl.a(new e3c0(14));
            case 18:
                asu0.a.getClass();
                return asu0.n();
            case 19:
                return NetworkClient.ClientType.CLIENT_PLAYER;
            case 20:
                return new jig();
            case 21:
                r55 r55Var = r55.a;
                Context context5 = e43.a;
                return f35.a(context5 != null ? context5 : null);
            case 22:
                qcy<Object>[] qcyVarArr4 = VoipCallComponentImpl.B;
                return new tfw0();
            case 23:
                return new l5x0(com.vk.voip.ui.c.b);
            case 24:
                return new kit();
            default:
                hhx0.a();
                return s3q0.a;
        }
    }

    public /* synthetic */ knf(VKApplication vKApplication) {
        this.b = 15;
    }
}
