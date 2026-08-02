package xsna;

import android.graphics.SurfaceTexture;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.C4584ub;
import com.ironsource.Va;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.media.player.video.view.SimpleVideoView;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vk.toggle.features.ComFeatures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import ru.ok.android.webrtc.opengl.CallOpenGLContext;
import ru.ok.tracer.profiler.systrace.SystraceProfiler$onStart$traceListener$1;
import xsna.wqu;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class u69 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u69(int i, Object obj, Object obj2) {
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
                CallOpenGLContext.b((izs) obj2, (CallOpenGLContext) obj);
                break;
            case 1:
                ((u4f) obj2).a.removeView((VkContentBadge) obj);
                break;
            case 2:
                uou uouVar = (uou) obj2;
                UserId userId = (UserId) obj;
                ComFeatures comFeatures = ComFeatures.COM_GROUPS_GETBYID_CODEGEN;
                comFeatures.getClass();
                if (!com.vk.toggle.b.A.a(comFeatures)) {
                    rpu rpuVar = new rpu("groups.getById");
                    rpuVar.F(userId, "group_ids");
                    rpuVar.K("fields", "start_date,members_count,verified,screen_name,activity,trending,can_upload_story,using_vkpay_market_app,has_market_app,donut,leave_mode,has_live_cover,enabled_features,can_upload_story,can_upload_clip,can_upload_video,can_post,wall,trust_mark");
                    ahn.D(rpuVar);
                    new jx2(rpuVar, new wou(uouVar)).b();
                    break;
                } else {
                    fz2 y = yfb.y(wqu.a.a(null, Collections.singletonList(fkq0.a(userId)), uou.h), new wh1(22));
                    ahn.D(y);
                    new jx2(y, new vou(uouVar)).b();
                    break;
                }
            case 3:
                ((View) obj2).setAlpha(1.0f);
                ((gzs) obj).invoke();
                break;
            case 4:
                ArrayList arrayList = (ArrayList) obj2;
                n5f0 n5f0Var = (n5f0) obj;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    RecyclerView.e0 e0Var = (RecyclerView.e0) it.next();
                    View view = e0Var.itemView;
                    ViewPropertyAnimator animate = view.animate();
                    n5f0Var.o.add(e0Var);
                    view.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    animate.scaleX(1.0f).scaleY(1.0f).setDuration(200L).setListener(new o5f0(view, animate, e0Var, n5f0Var)).start();
                }
                arrayList.clear();
                n5f0Var.l.remove(arrayList);
                break;
            case 5:
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                SimpleVideoView simpleVideoView = SimpleVideoView.this;
                if (simpleVideoView.P != null && simpleVideoView.getCurrentState() == 0) {
                    simpleVideoView.s(simpleVideoView.P, false, 0L, true);
                }
                if (surfaceTexture != null) {
                    simpleVideoView.v(surfaceTexture);
                    simpleVideoView.q();
                    break;
                } else {
                    L.G("empty texture, can't play!");
                    break;
                }
                break;
            case 6:
                ((xlo0) obj2).setInEditMode(false);
                ((StickersDrawingViewGroup) obj).invalidate();
                break;
            case 7:
                SystraceProfiler$onStart$traceListener$1.onStart$lambda$0((Thread) obj2, (Runnable) obj);
                break;
            case 8:
                ((rhq0) obj2).e.f((FragmentActivity) obj);
                break;
            case 9:
                int i2 = VkOnboardingHighlighter.m;
                ((VkOnboardingHighlighter) obj2).removeView((no00) obj);
                break;
            case 10:
                yads.bu1.a((yads.bu1) obj2, (yads.fp2) obj);
                break;
            default:
                C4584ub.a((LevelPlayInitListener) obj2, (Va) obj);
                break;
        }
    }
}
