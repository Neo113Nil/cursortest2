package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.media3.exoplayer.audio.b;
import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalScrollableListVh;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.photo.editor.views.ToolButton;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeDebugStatsItem;
import com.vkontakte.android.R;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.protocol.screenshare.send.FrameEncoder;
import ru.ok.android.webrtc.protocol.screenshare.send.impl.FrameEncoderImpl;
import ru.ok.gl.tf.Tensorflow;
import ru.ok.gpu.GlThreadWithSharedContext;
import ru.ok.tensorflow.util.async.ConditionLock;
import xsna.m8v0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class wv4 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wv4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Fragment F0;
        switch (this.b) {
            case 0:
                b.a aVar = (b.a) this.c;
                g8l g8lVar = (g8l) this.d;
                synchronized (g8lVar) {
                }
                androidx.media3.exoplayer.audio.b bVar = aVar.b;
                String str = y2r0.a;
                bVar.n(g8lVar);
                break;
            case 1:
                ((com.vk.superapp.base.js.bridge.b) this.c).q((x9y) this.d);
                break;
            case 2:
                ((Call) this.c).f((JSONObject) this.d);
                break;
            case 3:
                ((gg9) this.c).b((he9) this.d);
                break;
            case 4:
                ViewPager2 viewPager2 = (ViewPager2) this.c;
                ClipsOwnerSwipeFragment clipsOwnerSwipeFragment = (ClipsOwnerSwipeFragment) this.d;
                RecyclerView.Adapter adapter = viewPager2.getAdapter();
                yoe yoeVar = adapter instanceof yoe ? (yoe) adapter : null;
                if (yoeVar != null && (F0 = yoeVar.F0(viewPager2.getCurrentItem())) != null) {
                    if (!F0.isAdded()) {
                        F0 = null;
                    }
                    if (F0 != null) {
                        UiTracker uiTracker = UiTracker.a;
                        UiTracker.f(clipsOwnerSwipeFragment.kn()).a(null, F0, true);
                        break;
                    }
                }
                break;
            case 5:
                ((DownloadHelper.a) this.d).a((DownloadHelper) this.c, false);
                break;
            case 6:
                com.vk.attachpicker.screen.h hVar = (com.vk.attachpicker.screen.h) this.c;
                ToolButton toolButton = (ToolButton) this.d;
                Activity d = hVar.d();
                b5p b5pVar = new b5p();
                if (!b5pVar.a) {
                    f5z f5zVar = d instanceof f5z ? (f5z) d : null;
                    if (f5zVar != null) {
                        if (f5zVar instanceof z1h0) {
                            lyd.h(toolButton, (z1h0) f5zVar);
                        }
                        int i = m8v0.M;
                        Lifecycle lifecycle = f5zVar.getLifecycle();
                        Context context = e43.a;
                        int i2 = 27;
                        m8v0.a.a(toolButton, (context != null ? context : null).getString(R.string.editor_spoiler_onboarding_title), null, VkTooltip$MarkerStyle.Style3, VkTooltip$MarkerSize.Size96, null, VkTooltip$BalloonPosition.BottomLeft, VkTooltip$BalloonTilt.Left, new yy(i2), new d37(13), new oc0(20), new la2(i2), new uoh(b5pVar, 10), new zkh(toolButton, 11), null, 0, true, lifecycle, f5zVar, false, null, false, 7389220);
                        break;
                    }
                }
                break;
            case 7:
                ((FrameEncoderImpl) this.c).a((FrameEncoder.SenderBackpressure) this.d);
                break;
            case 8:
                GlThreadWithSharedContext.lambda$syncCall$0((Runnable) this.c, (ConditionLock) this.d);
                break;
            case 9:
                TransitionDrawable transitionDrawable = (TransitionDrawable) this.c;
                View view = (View) this.d;
                transitionDrawable.startTransition(400);
                view.setTag(R.id.tag_comment_highlight, null);
                break;
            case 10:
                HorizontalScrollableListVh horizontalScrollableListVh = (HorizontalScrollableListVh) this.c;
                View view2 = (View) this.d;
                HorizontalScrollView horizontalScrollView = horizontalScrollableListVh.j;
                if (horizontalScrollView == null) {
                    horizontalScrollView = null;
                }
                int left = view2.getLeft();
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                horizontalScrollView.scrollTo(left - (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0), 0);
                break;
            case 11:
                String str2 = (String) this.c;
                Map map = (Map) this.d;
                fsk0 fsk0Var = qsk0.a;
                fsk0Var.p.await(5L, TimeUnit.SECONDS);
                if (fsk0Var.f()) {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                    }
                    s3q0 s3q0Var = s3q0.a;
                    new x6l(new SchemeStatSak$TypeDebugStatsItem(str2, null, null, jSONObject.toString(), 6, null), false).q();
                    break;
                }
                break;
            case 12:
                ((Tensorflow) this.c).lambda$runPreparePipelines$9((Runnable) this.d);
                break;
            default:
                yads.ps.a((yads.ps) this.c, (yads.g9) this.d);
                break;
        }
    }
}
