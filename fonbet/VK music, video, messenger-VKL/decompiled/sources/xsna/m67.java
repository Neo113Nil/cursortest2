package xsna;

import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.service.notification.StatusBarNotification;
import android.view.WindowManager;
import com.vk.clips.design.view.templates.ClipsTemplateEditorCropperView;
import com.vk.core.preference.Preference;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.feed.design.view.posting.preview.spinner.PostingVkSpinnerWrapperView;
import com.vk.feed.tool.view.posting.preview.attachment.PreviewAttachmentWrapper;
import com.vk.media.player.video.view.SimpleVideoView;
import com.vk.music.player.StandalonePlayerFragment;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.photoviewer.PhotoViewer;
import com.vk.photoviewer.PhotoViewerLayout;
import com.vk.push.core.utils.IdleHandler;
import com.vk.video.profile.presentation.catalog.pager.VideoLargeSliderHorizontalPagerVh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import xsna.c2q0;
import xsna.jrp;
import xsna.vr8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class m67 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m67(StatusBarNotification statusBarNotification, n67 n67Var) {
        this.b = 0;
        this.c = statusBarNotification;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                StatusBarNotification statusBarNotification = (StatusBarNotification) obj;
                o970.b.getClass();
                String a = zh70.a(statusBarNotification.getTag(), Integer.valueOf(statusBarNotification.getId()));
                Map<String, ?> all = Preference.f(o970.d).getAll();
                ArrayList arrayList = new ArrayList();
                Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
                while (it.hasNext()) {
                    jrp a2 = jrp.a.a((String) it.next().getValue());
                    o970 o970Var = o970.b;
                    Integer valueOf = Integer.valueOf(a2.a);
                    String str = a2.b;
                    o970Var.getClass();
                    Map<String, String> map = epx.f(zh70.a(str, valueOf), a) ? a2.c : null;
                    if (map != null) {
                        arrayList.add(map);
                    }
                }
                Map map2 = (Map) j5g.a0(arrayList);
                if (map2 != null) {
                    n67.c(map2);
                    break;
                }
                break;
            case 1:
                vr8.b bVar = (vr8.b) obj;
                VkOnboardingHighlighter.e(bVar.c, false, null, !bVar.b, null, 8);
                bVar.b = false;
                break;
            case 2:
                ClipsTemplateEditorCropperView.setCurrentItem$lambda$6((ClipsTemplateEditorCropperView) obj);
                break;
            case 3:
                ((io.reactivex.rxjava3.core.b) obj).onComplete();
                break;
            case 4:
                ((z0h) obj).invoke();
                break;
            case 5:
                final gzs gzsVar = (gzs) obj;
                IdleHandler idleHandler = IdleHandler.INSTANCE;
                Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: xsna.pvv
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        IdleHandler idleHandler2 = IdleHandler.INSTANCE;
                        gzs.this.invoke();
                        return false;
                    }
                });
                break;
            case 6:
                PhotoViewer photoViewer = ((z520) obj).m;
                if (photoViewer != null) {
                    PhotoViewerLayout photoViewerLayout = photoViewer.w;
                    WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) photoViewerLayout.getLayoutParams();
                    layoutParams.flags = 2048;
                    if (photoViewerLayout.isAttachedToWindow()) {
                        photoViewer.v.updateViewLayout(photoViewerLayout, layoutParams);
                        break;
                    }
                }
                break;
            case 7:
                kz30 kz30Var = (kz30) obj;
                kz30Var.R.removeCallbacksAndMessages(kz30.f0);
                kz30Var.H().h(null);
                s3q0 s3q0Var = s3q0.a;
                kz30.K(kz30Var.L);
                kz30.M(kz30Var.M);
                break;
            case 8:
                ((com.vk.photos.root.photoflow.presentation.j) obj).e.invoke(a.l.b);
                break;
            case 9:
                int i2 = PreviewAttachmentWrapper.g;
                PostingVkSpinnerWrapperView postingVkSpinnerWrapperView = ((PreviewAttachmentWrapper) obj).c;
                if (bwt0.K(postingVkSpinnerWrapperView)) {
                    postingVkSpinnerWrapperView.bringToFront();
                    j6r0.d(postingVkSpinnerWrapperView, 8, false, 300, null);
                    break;
                }
                break;
            case 10:
                SimpleVideoView.e((SimpleVideoView) obj);
                break;
            case 11:
                StandalonePlayerFragment standalonePlayerFragment = (StandalonePlayerFragment) obj;
                wf wfVar = standalonePlayerFragment.S;
                if (wfVar == null) {
                    wfVar = null;
                }
                wfVar.c();
                Bundle arguments = standalonePlayerFragment.getArguments();
                String string = arguments != null ? arguments.getString("com.vk.music.common.EXTRA_POSITION") : null;
                Bundle arguments2 = standalonePlayerFragment.getArguments();
                if (arguments2 != null) {
                    arguments2.remove("com.vk.music.common.EXTRA_POSITION");
                }
                wf wfVar2 = standalonePlayerFragment.S;
                (wfVar2 != null ? wfVar2 : null).N0(string);
                break;
            case 12:
                try {
                    ((c2q0) obj).a();
                    s3q0 s3q0Var2 = s3q0.a;
                    break;
                } catch (Throwable unused) {
                    return;
                }
            case 13:
                VideoLargeSliderHorizontalPagerVh videoLargeSliderHorizontalPagerVh = (VideoLargeSliderHorizontalPagerVh) obj;
                videoLargeSliderHorizontalPagerVh.w();
                hbt0 hbt0Var = videoLargeSliderHorizontalPagerVh.A;
                if (hbt0Var != null) {
                    hbt0Var.n();
                    break;
                }
                break;
            default:
                yads.jm.b((yads.jm) obj);
                break;
        }
    }

    public /* synthetic */ m67(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public /* synthetic */ m67(c2q0.a aVar, c2q0 c2q0Var) {
        this.b = 12;
        this.c = c2q0Var;
    }
}
