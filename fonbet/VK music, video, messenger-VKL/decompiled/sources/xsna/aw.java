package xsna;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.widget.TextView;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil;
import androidx.media3.exoplayer.video.g;
import com.ironsource.Lf;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import java.util.Iterator;
import one.video.player.OneVideoPlayer;
import org.chromium.net.impl.CronetUrlRequest;
import xsna.kkk0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class aw implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ aw(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                fw fwVar = (fw) obj2;
                fwVar.getClass();
                zv zvVar = new zv(0, fwVar, (StoryEntry) obj);
                if (!gz80.a(34)) {
                    PermissionHelper permissionHelper = PermissionHelper.a;
                    Context context = fwVar.a.i0.getContext();
                    permissionHelper.getClass();
                    if (!permissionHelper.d(context, PermissionHelper.e, R.string.vk_permissions_storage, R.string.vk_permissions_storage, zvVar, new e1(fwVar, 3))) {
                        fwVar.d.b();
                        break;
                    }
                } else {
                    zvVar.invoke();
                    break;
                }
                break;
            case 1:
                ((izs) obj2).invoke((OneVideoPlayer) obj);
                break;
            case 2:
                CronetUrlRequest.lambda$postTaskToExecutor$0((String) obj2, (Runnable) obj);
                break;
            case 3:
                ((zgr) obj2).j.a(VideoFrameProcessingException.a(C.TIME_UNSET, (GlUtil.GlException) obj));
                break;
            case 4:
                Lf.a((TestSuiteActivity) obj2, (LevelPlayBannerAdView) obj);
                break;
            case 5:
                p630 p630Var = (p630) obj2;
                MusicTrack musicTrack = (MusicTrack) obj;
                TextView textView = p630Var.v;
                textView.setText(s490.d(p630Var.getContext(), musicTrack.d, musicTrack.e, R.attr.vk_ui_text_secondary));
                d3m.c(textView, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 6:
                kkk0 kkk0Var = (kkk0) obj2;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                SurfaceTexture surfaceTexture2 = kkk0Var.h;
                Surface surface = kkk0Var.i;
                Surface surface2 = new Surface(surfaceTexture);
                kkk0Var.h = surfaceTexture;
                kkk0Var.i = surface2;
                Iterator<kkk0.b> it = kkk0Var.b.iterator();
                while (it.hasNext()) {
                    it.next().x(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    break;
                }
                break;
            case 7:
                androidx.media3.exoplayer.video.g gVar = ((g.a) obj2).b;
                String str = y2r0.a;
                gVar.onVideoSizeChanged((xgt0) obj);
                break;
            default:
                yads.ul2.a((yads.n7) obj2, (yads.ul2) obj);
                break;
        }
    }
}
