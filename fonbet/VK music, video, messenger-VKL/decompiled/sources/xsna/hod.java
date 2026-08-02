package xsna;

import android.content.Context;
import android.os.Handler;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.ironsource.Wd;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration;
import com.vk.im.ui.views.InfoBarView;
import com.vk.log.L;
import com.vk.overlaymenu.launcher.OverlayMenuActivity;
import com.vk.permission.PermissionHelper;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.video.profile.presentation.catalog.pager.VideoLargeSliderHorizontalPagerVh;
import com.vkontakte.android.R;
import com.yandex.div.core.view2.animations.DivTransitionHandler;
import java.util.HashMap;
import one.video.controls20.SimpleControlsView;
import one.video.player.OneVideoPlayer;
import one.video.view.debug.VideoDebugInfoView;
import org.chromium.base.Flag;
import ru.ok.android.webrtc.protocol.screenshare.send.ScreenshareSender;
import ru.ok.gl.tf.Tensorflow;
import ru.ok.gl.tf.gestures.TensorflowGestureDetector;
import xsna.skm0;
import xsna.zmw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class hod implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hod(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                iod iodVar = (iod) this.c;
                bm9 presenter = iodVar.b.getPresenter();
                if (presenter != null) {
                    presenter.t4(false, false);
                }
                iodVar.h--;
                ((Handler) iodVar.j.getValue()).postDelayed(iodVar.l, 1000L);
                return;
            case 1:
                ((oal) this.c).f();
                return;
            case 2:
                DivTransitionHandler.postTransitions$lambda$0((DivTransitionHandler) this.c);
                return;
            case 3:
                Flag.sFlagsCreatedForTesting = (HashMap) this.c;
                return;
            case 4:
                ((l1t) this.c).d.f();
                return;
            case 5:
                InfoBarView infoBarView = (InfoBarView) this.c;
                TextView textView = infoBarView.w;
                boolean z = textView.getLineCount() == 1;
                ViewParent parent = textView.getParent();
                ConstraintLayout constraintLayout = parent instanceof ConstraintLayout ? (ConstraintLayout) parent : null;
                if (constraintLayout == null) {
                    return;
                }
                androidx.constraintlayout.widget.b a = pq.a(constraintLayout);
                a.h(textView.getId(), 3);
                a.h(textView.getId(), 4);
                a.k(textView.getId(), 3, R.id.top_barrier, 3);
                if (z && infoBarView.x.getVisibility() == 8) {
                    a.f(textView.getId(), 0);
                    a.f(infoBarView.u.getId(), textView.getId());
                    a.f(infoBarView.y.getId(), textView.getId());
                }
                a.b(constraintLayout);
                return;
            case 6:
                com.vk.media.ok.b bVar = (com.vk.media.ok.b) this.c;
                Tensorflow tensorflow = bVar.M;
                if (tensorflow != null) {
                    tensorflow.release();
                }
                bVar.M = null;
                TensorflowGestureDetector tensorflowGestureDetector = bVar.N;
                if (tensorflowGestureDetector != null) {
                    tensorflowGestureDetector.release();
                }
                bVar.N = null;
                Runnable runnable = bVar.m;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                ((y780) this.c).c(true);
                return;
            case 8:
                OverlayMenuActivity overlayMenuActivity = (OverlayMenuActivity) this.c;
                int i = OverlayMenuActivity.m;
                overlayMenuActivity.finish();
                return;
            case 9:
                com.vk.attachpicker.fragment.gallery.h hVar = (com.vk.attachpicker.fragment.gallery.h) this.c;
                hVar.g.c(false);
                if (hVar.g.l) {
                    GalleryFragmentImpl galleryFragmentImpl = hVar.c.a;
                    if (galleryFragmentImpl.B() != null) {
                        r3t r3tVar = galleryFragmentImpl.S;
                        GalleryPickerSourceConfiguration galleryPickerSourceConfiguration = r3tVar.e;
                        if ((galleryPickerSourceConfiguration != null ? galleryPickerSourceConfiguration.d : null) == GalleryPickerSourceConfiguration.EntryPoint.STORY) {
                            nf9.j(StoryPublishEvent.GALLERY_ACCESS_REQUESTED, null, null, null, new h6g(r3tVar, 19), 30);
                        }
                    }
                }
                if (gz80.a(29)) {
                    Fragment fragment = hVar.e.get();
                    Context mo2getContext = fragment != null ? fragment.mo2getContext() : null;
                    if (mo2getContext == null) {
                        return;
                    }
                    PermissionHelper permissionHelper = PermissionHelper.a;
                    permissionHelper.getClass();
                    if (PermissionHelper.b(mo2getContext, PermissionHelper.e)) {
                        String[] strArr = PermissionHelper.p;
                        if (PermissionHelper.b(mo2getContext, strArr)) {
                            return;
                        }
                        PermissionHelper.l(permissionHelper, hVar.a(), strArr, null, null, 28);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                zwm0 zwm0Var = (zwm0) this.c;
                try {
                    zwm0Var.g.invoke();
                    return;
                } catch (Throwable th) {
                    sdy.j(true);
                    if (th instanceof InterruptedException) {
                        throw th;
                    }
                    i0q0.c(new RuntimeException("Unhandled exception during queue event processing: " + zwm0Var.a.b(), th));
                    return;
                }
            case 11:
                ((ScreenshareSender) this.c).a();
                return;
            case 12:
                OneVideoPlayer oneVideoPlayer = ((SimpleControlsView) this.c).x;
                if (oneVideoPlayer != null) {
                    oneVideoPlayer.e();
                    return;
                }
                return;
            case 13:
                ((ry3) this.c).invoke();
                return;
            case 14:
                ((c5l0) this.c).c.dismiss();
                return;
            case 15:
                ((skm0.a) this.c).q();
                return;
            case 16:
                ((com.vk.sharing.core.view.k) this.c).getClass();
                return;
            case 17:
                ((Tensorflow) this.c).lambda$handlePrepare$5();
                return;
            case 18:
                ((w1q0) this.c).m();
                return;
            case 19:
                VideoDebugInfoView videoDebugInfoView = (VideoDebugInfoView) this.c;
                OneVideoPlayer oneVideoPlayer2 = videoDebugInfoView.f;
                if (oneVideoPlayer2 != null) {
                    videoDebugInfoView.i(oneVideoPlayer2);
                    videoDebugInfoView.e();
                    return;
                }
                return;
            case 20:
                VideoLargeSliderHorizontalPagerVh videoLargeSliderHorizontalPagerVh = (VideoLargeSliderHorizontalPagerVh) this.c;
                videoLargeSliderHorizontalPagerVh.w();
                hbt0 hbt0Var = videoLargeSliderHorizontalPagerVh.A;
                if (hbt0Var != null) {
                    hbt0Var.n();
                    return;
                }
                return;
            case 21:
                zmw0.b bVar2 = (zmw0.b) this.c;
                com.vk.voip.ui.c.b.getClass();
                L.A("VoipViewModel", "onRemoteCamStateChanged newState=" + bVar2);
                com.vk.voip.ui.c.e1(bVar2);
                return;
            default:
                Wd.a((Wd) this.c);
                return;
        }
    }
}
