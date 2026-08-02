package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.ironsource.X3;
import com.my.target.common.MyTargetActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.VKTabLayout;
import com.vk.core.view.mediapicker.views.FastScrollerView;
import com.vk.reactions.fragments.ReactionsFragment;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.rewarded.RewardedAdLoader;
import java.util.WeakHashMap;
import ru.mail.libverify.api.VerificationApi;
import xsna.ctb0;
import xsna.mez0;
import xsna.tts0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class vrl implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vrl(int i, Object obj, Object obj2) {
        this.b = i;
        this.d = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                DeferrableSurface deferrableSurface = (DeferrableSurface) this.d;
                String str = (String) this.c;
                try {
                    deferrableSurface.e.get();
                    DeferrableSurface.g.decrementAndGet();
                    DeferrableSurface.f.get();
                    deferrableSurface.toString();
                    return;
                } catch (Exception e) {
                    s100.a("DeferrableSurface", "Unexpected surface termination for " + deferrableSurface + "\nStack Trace:\n" + str, null);
                    synchronized (deferrableSurface.a) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", deferrableSurface, Boolean.valueOf(deferrableSurface.c), Integer.valueOf(deferrableSurface.b)), e);
                    }
                }
            case 1:
                ((FastScrollerView) this.d).b.setText((String) this.c);
                return;
            case 2:
                ((ufs) this.d).n((Surface) this.c);
                return;
            case 3:
                MediaCodecRenderer mediaCodecRenderer = (MediaCodecRenderer) this.d;
                mediaCodecRenderer.F.set(mediaCodecRenderer.B((w8s) this.c, mediaCodecRenderer.z, 0));
                return;
            case 4:
                ViewPager2 viewPager2 = (ViewPager2) this.d;
                ctb0.b bVar = (ctb0.b) this.c;
                int i = ji80.n1;
                viewPager2.setCurrentItem(((ctb0.b.C2682b) bVar).a);
                return;
            case 5:
                ReactionsFragment reactionsFragment = (ReactionsFragment) this.d;
                ViewPager viewPager = (ViewPager) this.c;
                VKTabLayout vKTabLayout = reactionsFragment.X;
                if (vKTabLayout != null) {
                    vKTabLayout.d(viewPager.getCurrentItem(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, true);
                    return;
                }
                return;
            case 6:
                tts0.b bVar2 = (tts0.b) this.d;
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) this.c;
                int i2 = VideoMinimizableDiscoveryFragment.p1;
                CharSequence text = bVar2.d.getText();
                if (text == null || text.length() == 0) {
                    return;
                }
                videoMinimizableDiscoveryFragment.Z0.a();
                return;
            case 7:
                ((RewardedAdLoader) this.d).loadAd((AdRequestConfiguration) this.c);
                return;
            case 8:
                ((ru.mail.libverify.api.q) this.d).a((VerificationApi.PhoneAccountSearchListener) this.c);
                return;
            default:
                mez0.f fVar = (mez0.f) this.d;
                Context context = (Context) this.c;
                String str2 = fVar.b;
                nez0 nez0Var = new nez0(fVar);
                WeakHashMap weakHashMap = mez0.e;
                giz0 giz0Var = fVar.c;
                Uri parse = Uri.parse(str2);
                xey0 xey0Var = fVar.a;
                boolean a = giz0Var.a(nez0Var, parse, xey0Var.T, context);
                if (!a) {
                    giz0Var.a();
                }
                if (a) {
                    return;
                }
                giz0Var.a();
                if (X3.i.U.equals(xey0Var.p) || !s770.i(str2)) {
                    de.L(str2, null, null, null, context);
                    return;
                }
                MyTargetActivity.f = new mez0.g(str2);
                Intent intent = new Intent(context, (Class<?>) MyTargetActivity.class);
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                return;
        }
    }
}
