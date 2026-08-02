package xsna;

import android.content.Context;
import android.content.Intent;
import androidx.constraintlayout.motion.widget.MotionLayoutWithFixedTouches;
import com.vk.clips.attachments.impl.di.ClipsAttachmentsComponentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.core.apps.BuildInfo;
import com.vk.games.presentation.detail.GamesCatalogDetailFragment;
import com.vk.geo.impl.di.GeoComponentImpl;
import com.vk.geo.impl.presentation.staticpreview.GeoStaticPreview;
import com.vk.metrics.reporters.AnrAppExitExceptions;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vk.search.ui.impl.catalog.GlobalSearchVideosCatalogFragment;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.SaFeatures;
import com.vk.toggle.features.SoccomFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.discovery.minimizable.motion.scene.transition.DiscoveryScreenTransitions$Landscape;
import com.vk.video.ui.discovery.minimizable.motion.scene.transition.DiscoveryScreenTransitions$Portrait;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.text.Regex;
import one.video.ad.ux.playpause.PlayPauseFrameView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class dv2 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ dv2(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z = false;
        switch (this.b) {
            case 0:
                bpn0 bpn0Var = AnrAppExitExceptions.b;
                return "bg anr";
            case 1:
                return Boolean.valueOf(fxc0.B().i().g());
            case 2:
                return s3q0.a;
            case 3:
                qcy<Object>[] qcyVarArr = ClipsAttachmentsComponentImpl.f;
                return new jmf();
            case 4:
                Object obj = ClipsOwnerSwipeFragment.k0;
                return new AtomicInteger(0);
            case 5:
                return new com.vk.clips.attachments.impl.publish.links.a();
            case 6:
                qcy<Object>[] qcyVarArr2 = ClipsViewerComponentImpl.o0;
                return new vjx();
            case 7:
                SoccomFeatures soccomFeatures = SoccomFeatures.MULTI_INTEGRATION;
                soccomFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(soccomFeatures));
            case 8:
                VideoFeatures videoFeatures = VideoFeatures.COMMUNITY_LIVE_BLOCK;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 9:
                return s3q0.a;
            case 10:
                return Long.valueOf(TimeUnit.SECONDS.toMillis(com.vk.toggle.d.f().c));
            case 11:
                if (!gz80.a(26)) {
                    Intent intent = new Intent("android.intent.action.MAIN");
                    intent.addCategory("android.intent.category.HOME");
                    intent.setFlags(268435456);
                    Context context = e43.a;
                    (context != null ? context : null).startActivity(intent);
                }
                return s3q0.a;
            case 12:
                return new GlobalSearchVideosCatalogFragment.a(GlobalSearchVideosCatalogFragment.class, null, null).f();
            case 13:
                return new com.vk.notifications.dnd.impl.a(new es());
            case 14:
                return s3q0.a;
            case 15:
                return Boolean.valueOf(BuildInfo.s());
            case 16:
                return new hqp();
            case 17:
                qcy<Object>[] qcyVarArr3 = FaveFeedFragment.s0;
                return new y3v();
            case 18:
                x290.i.setEnabled(false);
                return s3q0.a;
            case 19:
                int i = GamesCatalogDetailFragment.d0;
                if (e370.s != null && com.vk.toggle.b.A.a(SaFeatures.SA_GAMES_WAIT_PREV_REQUEST)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 20:
                qcy<Object>[] qcyVarArr4 = GeoComponentImpl.f;
                return GeoStaticPreview.n;
            case 21:
                return new Regex("^/link/");
            case 22:
                return s3q0.a;
            case 23:
                int i2 = MotionLayoutWithFixedTouches.O0;
                HashMap hashMap = new HashMap();
                zrp<DiscoveryScreenTransitions$Portrait> i3 = DiscoveryScreenTransitions$Portrait.i();
                ArrayList arrayList = new ArrayList(c5g.u(i3, 10));
                for (DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait : i3) {
                    arrayList.add(new Pair(Integer.valueOf(discoveryScreenTransitions$Portrait.h()), discoveryScreenTransitions$Portrait));
                }
                pn00.p(hashMap, arrayList);
                zrp<DiscoveryScreenTransitions$Landscape> i4 = DiscoveryScreenTransitions$Landscape.i();
                ArrayList arrayList2 = new ArrayList(c5g.u(i4, 10));
                for (DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape : i4) {
                    arrayList2.add(new Pair(Integer.valueOf(discoveryScreenTransitions$Landscape.h()), discoveryScreenTransitions$Landscape));
                }
                pn00.p(hashMap, arrayList2);
                return hashMap;
            case 24:
                return Calendar.getInstance();
            case 25:
                return new k550();
            case 26:
                return Boolean.valueOf(MusicFeatures.AUDIO_PLAYER_VIDEO_BUFFERING.h());
            case 27:
                int i5 = PlayPauseFrameView.e;
                return s3q0.a;
            case 28:
                return new p4r();
            default:
                return new rru(6);
        }
    }
}
