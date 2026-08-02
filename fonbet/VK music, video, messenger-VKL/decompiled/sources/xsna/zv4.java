package xsna;

import android.hardware.camera2.TotalCaptureResult;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.b;
import androidx.media3.exoplayer.offline.DownloadHelper;
import com.ironsource.Wd;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.fragment.gallery.FastScroller;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalScrollableListVh;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.traffic.TrafficLightAsyncImpl;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.libvideo.design.view.video.VideoView;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import ru.ok.gleffects.dto.UserInfo;
import xsna.m8v0;
import xsna.n3d0;
import xsna.re9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class zv4 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zv4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Hint p;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                androidx.media3.exoplayer.audio.b bVar = ((b.a) obj2).b;
                String str = y2r0.a;
                bVar.p((AudioSink.a) obj);
                break;
            case 1:
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = ((re9.b) obj2).a;
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    re9.c cVar = (re9.c) it.next();
                    if (cVar.a(totalCaptureResult)) {
                        hashSet.add(cVar);
                    }
                }
                if (!hashSet.isEmpty()) {
                    hashSet2.removeAll(hashSet);
                    break;
                }
                break;
            case 2:
                UserInfo userInfo = (UserInfo) obj;
                com.vk.media.ok.b bVar2 = ((xk9) obj2).B;
                if (bVar2 != null) {
                    boolean z = bVar2.M0.selfAvatarRequired;
                    if (!z || userInfo.userAvatarFile != null) {
                        if (bVar2.y() || z) {
                            bVar2.H.setUserData(userInfo);
                            break;
                        }
                    }
                }
                break;
            case 3:
                DownloadHelper.a aVar = ((DownloadHelper) obj2).k;
                aVar.getClass();
                aVar.b((IOException) obj);
                break;
            case 4:
                int i2 = FastScroller.v;
                ((TextView) obj2).setText((CharSequence) obj);
                break;
            case 5:
                View view = (View) obj;
                HorizontalScrollView horizontalScrollView = ((HorizontalScrollableListVh) obj2).j;
                if (horizontalScrollView == null) {
                    horizontalScrollView = null;
                }
                int left = view.getLeft();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                horizontalScrollView.smoothScrollTo(left - (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0), 0);
                break;
            case 6:
                ((PreviewView.a) ((n3d0.d) obj2)).a((zjn0) obj);
                break;
            case 7:
                qvn0 qvn0Var = (qvn0) obj2;
                j58 j58Var = (j58) obj;
                if (j58Var.isShown() && j58Var.isAttachedToWindow() && j58Var.getWindowVisibility() == 0 && j58Var.getAlpha() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && j58Var.getMeasuredWidth() > 0 && j58Var.getMeasuredHeight() > 0 && bwt0.D(j58Var) >= 1.0f && (p = qvn0Var.d.p(HintId.GROUP_MANAGED_GROUP.getId())) != null) {
                    int i3 = m8v0.M;
                    VkTooltip$BalloonPosition vkTooltip$BalloonPosition = VkTooltip$BalloonPosition.TopLeft;
                    Map<String, String> map = p.e;
                    String str2 = map != null ? map.get("onboarding_tooltip_text") : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    m8v0.a.a(j58Var, str2, null, null, null, null, vkTooltip$BalloonPosition, null, new b140(j58Var, 27), new h3e0(9), new gda0(j58Var, 23), null, null, new iyd0(qvn0Var, 8), null, 0, true, null, null, false, null, false, 16701628);
                    break;
                }
                break;
            case 8:
                ((TrafficLightAsyncImpl) obj2).f((String) obj);
                break;
            case 9:
                VideoView videoView = (VideoView) obj2;
                yg5 yg5Var = (yg5) obj;
                videoView.setAlpha(1.0f);
                if (!yg5Var.a()) {
                    yg5Var.z0(videoView.getViewBinding().c, videoView.getVideoConfig(), null);
                    yg5Var.l0();
                    yg5Var.play();
                    break;
                }
                break;
            default:
                Wd.a((Wd) obj2, (IronSourceError) obj);
                break;
        }
    }
}
