package xsna;

import android.os.Build;
import android.text.SpannableStringBuilder;
import com.unity3d.services.UnityAdsConstants;
import com.vk.biometrics.lock.api.di.BiometricsLockComponent;
import com.vk.camera.CameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType;
import com.vk.clips.upload.vk.ui.api.ClipsUploadScreenStaticConfig;
import com.vk.clips.upload.vk.ui.impl.ClipsUploadUiVkComponentBase;
import com.vk.im.engine.di.event.ImEventPublisherComponentImpl;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.story.api.di.StoriesComponent;
import com.vk.toggle.b;
import com.vk.toggle.features.SaFeatures;
import com.vk.toggle.features.SmbAdFeatures;
import com.vk.video.ui.upload.impl.publish.presentation.author.fragment.AuthorModalInternalComponent;
import com.vk.video.ui.upload.impl.publish.presentation.description.fragment.DescriptionModalInternalComponent;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.bbv0;
import xsna.nyd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class xu0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ xu0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i;
        double d;
        switch (this.b) {
            case 0:
                return new lc0();
            case 1:
                return com.vk.toggle.d.o();
            case 2:
                AuthorModalInternalComponent.a aVar = AuthorModalInternalComponent.i;
                return fxc0.B();
            case 3:
                return new u1r0();
            case 4:
                bbv0.g.getClass();
                bbv0.a.f().d.i();
                return s3q0.a;
            case 5:
                int i2 = mi9.$EnumSwitchMapping$0[(ij9.a.g() ? CameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType.CAMERA2 : CameraExperiments$CameraFeaturesPerformanceConfig$PerfomanceConfigType.CAMERA1).ordinal()];
                int i3 = 8;
                if (i2 == 1) {
                    i = 26;
                    d = 2180.0d;
                } else if (i2 == 2) {
                    i = 24;
                    i3 = 4;
                    d = 1900.0d;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 29;
                    d = 1700.0d;
                }
                if (i <= Build.VERSION.SDK_INT) {
                    b4k b4kVar = b4k.e;
                    if (i3 <= b4kVar.a) {
                        double d2 = b4kVar.d;
                        if ((d2 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE || d <= d2) && b4kVar.b) {
                            r1 = true;
                        }
                    }
                }
                return Boolean.valueOf(r1);
            case 6:
                b.d i4 = com.vk.toggle.b.A.i(SaFeatures.SA_GAMES_ACHIEVEMENTS_BLOCK);
                return Boolean.valueOf(i4 != null ? p1p0.a(i4) : false);
            case 7:
                return s3q0.a;
            case 8:
                return new u1r0();
            case 9:
                qcy<Object>[] qcyVarArr = ClipsUploadUiVkComponentBase.d;
                return ClipsUploadScreenStaticConfig.m;
            case 10:
                return s3q0.a;
            case 11:
                DescriptionModalInternalComponent.a aVar2 = DescriptionModalInternalComponent.c;
                return v2m.b;
            case 12:
                return (StoriesComponent) ((k7m) m7m.f(m9n.b)).a(fpf0.a(StoriesComponent.class));
            case 13:
                return new laq(28, TimeUnit.SECONDS.toMillis(30L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, TimeUnit.MINUTES.toMillis(10L));
            case 14:
                qcy<Object>[] qcyVarArr2 = FaveFeedFragment.s0;
                return Boolean.valueOf(com.vk.toggle.b.A.a(SmbAdFeatures.FEATURE_SMB_LEAD_ADS));
            case 15:
                return s3q0.a;
            case 16:
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.w, new Object[]{"UserLocationWorkDelegate", "fallback loading action"});
                }
                return s3q0.a;
            case 17:
                return new a710();
            case 18:
                qcy<Object>[] qcyVarArr3 = ImEventPublisherComponentImpl.b;
                a1w a1wVar = q1w.a;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                return new t3w(a1wVar);
            case 19:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 20:
                List<Integer> list = a500.z;
                return "stop waiting for network...";
            case 21:
                return s3q0.a;
            case 22:
                return new SpannableStringBuilder();
            case 23:
                return rl3.I(new zym0[]{crx0.B, crx0.C, crx0.D, crx0.E, crx0.F, crx0.G});
            case 24:
                qcy<Object>[] qcyVarArr4 = NewsfeedFragment.J0;
                return new AtomicReference(ce60.k(ce60.b, 0));
            case 25:
                return ((BiometricsLockComponent) ((k7m) m7m.f(e870.b)).a(fpf0.a(BiometricsLockComponent.class))).b();
            case 26:
                return new no10();
            case 27:
                return s3q0.a;
            case 28:
                return s3q0.a;
            default:
                return new nyd0.i();
        }
    }
}
