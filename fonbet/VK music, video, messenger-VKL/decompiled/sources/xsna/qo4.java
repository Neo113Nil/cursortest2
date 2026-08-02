package xsna;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.design.view.recording.StopwatchView;
import com.vk.core.preference.Preference;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.fave.entities.FaveCategory;
import com.vk.im.ui.components.viewcontrollers.msg_list.MsgLinearLayoutManager;
import com.vk.libvideo.ui.dialog.single.VideoDialog;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stickers.views.particles.ParticleView;
import com.vk.stories.design.view.camera.StoryMediaPickerTabView;
import com.vkontakte.android.R;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.mail.verify.core.utils.VerificationJobService;
import ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;
import xsna.acx;
import xsna.m8v0;
import xsna.rcx;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class qo4 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qo4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i = this.b;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((AudioFocusRequestHelper) obj).requestFocus();
                break;
            case 1:
                gzs gzsVar = (gzs) ((Ref$ObjectRef) obj).element;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 2:
                ((ukq) obj).v.invoke();
                break;
            case 3:
                qsq i3 = ((FaveCategory) obj).i();
                if (i3 == null || (str = i3.h()) == null) {
                    str = "";
                }
                Preference.H("fave_pref", "last_category", str);
                break;
            case 4:
                evs evsVar = (evs) obj;
                evsVar.V(false, true);
                evsVar.a(new acx.j(false));
                evsVar.C(new rcx.d.e(false, false));
                evsVar.C = false;
                break;
            case 5:
                ((quv) obj).g.setVisibility(0);
                break;
            case 6:
                ((s820) obj).g = true;
                break;
            case 7:
                vm30 vm30Var = (vm30) obj;
                zfh0 zfh0Var = vm30Var.V;
                MsgLinearLayoutManager msgLinearLayoutManager = vm30Var.I;
                if (zfh0Var != null) {
                    RecyclerView.o layoutManager = vm30Var.u.getLayoutManager();
                    if (layoutManager == null || !layoutManager.isSmoothScrolling()) {
                        int d = vm30Var.d(zfh0Var);
                        int s = msgLinearLayoutManager.s();
                        int w = msgLinearLayoutManager.w();
                        L l = L.a;
                        l.getClass();
                        LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
                        if (!L.m(loggerOutputTarget)) {
                            L.LogType logType = L.LogType.d;
                            StringBuilder a = odj.a(s, w, "ChatScrollIssue: cancelScrollIfRequired first ", " last ", " pos ");
                            a.append(d);
                            L.u(l, logType, new Object[]{a.toString()});
                        }
                        if (s <= d && d <= w) {
                            if (!L.m(loggerOutputTarget)) {
                                L.u(l, L.LogType.d, new Object[]{"ChatScrollIssue: pendingScrollParams clear"});
                            }
                            vm30Var.V = null;
                            break;
                        }
                    }
                }
                break;
            case 8:
                com.vk.media.ok.b bVar = (com.vk.media.ok.b) obj;
                StopwatchView stopwatchView = bVar.b0;
                if (stopwatchView != null) {
                    stopwatchView.c();
                }
                StopwatchView stopwatchView2 = bVar.b0;
                if (stopwatchView2 != null) {
                    stopwatchView2.c.remove(bVar);
                }
                com.vk.media.ok.a aVar = bVar.h;
                if (aVar != null) {
                    aVar.o(false, null);
                    break;
                }
                break;
            case 9:
                ParticleView.b((ParticleView) obj);
                break;
            case 10:
                iwb0 iwb0Var = ((izb0) obj).b;
                if (iwb0Var != null) {
                    View view = iwb0Var.a;
                    if (iwb0Var.b == null) {
                        if (!bwt0.K(view) || iwb0Var.c != null) {
                            iwb0Var.a();
                            if (view.getMeasuredHeight() <= 0) {
                                f540 f540Var = new f540(iwb0Var, 12);
                                view.setVisibility(4);
                                iwb0Var.d.postDelayed(new jk9(f540Var, 7), 50L);
                                break;
                            } else {
                                iwb0Var.d();
                                break;
                            }
                        }
                    }
                }
                break;
            case 11:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new sd((Context) obj, 11));
                break;
            case 12:
                StereoRoomManagerImpl.revokeAdmin$lambda$0$1((izs) obj);
                break;
            case 13:
                StoryMediaPickerTabView storyMediaPickerTabView = (StoryMediaPickerTabView) obj;
                int i4 = StoryMediaPickerTabView.i;
                int i5 = m8v0.M;
                m8v0.a.a(storyMediaPickerTabView.f, storyMediaPickerTabView.getContext().getString(R.string.stories_template_onboarding), null, VkTooltip$MarkerStyle.Style1, VkTooltip$MarkerSize.Size64, null, VkTooltip$BalloonPosition.Top, VkTooltip$BalloonTilt.Right, new sxl0(storyMediaPickerTabView, i2), new pf40(storyMediaPickerTabView, 28), null, null, null, null, null, 0, false, null, null, false, null, false, 16776228);
                break;
            case 14:
                ((VerificationJobService) obj).a();
                break;
            default:
                VideoDialog videoDialog = ((VideoDialog.j) obj).b;
                videoDialog.x0.setAlpha(1.0f);
                if (!videoDialog.w0.a()) {
                    videoDialog.w0.z0(videoDialog.x0.getViewBinding().c, videoDialog.x0.getVideoConfig(), null);
                    videoDialog.w0.l0();
                    videoDialog.w0.play();
                    break;
                }
                break;
        }
    }
}
