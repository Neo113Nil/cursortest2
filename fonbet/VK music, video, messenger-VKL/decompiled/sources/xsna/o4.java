package xsna;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.source.h;
import com.ironsource.P2;
import com.vk.appredirects.activity.BaseLinkRedirectActivity;
import com.vk.clips.design.view.component.video.seekbar.ClipSeekBarView;
import com.vk.clips.sdk.shared.feed.controller.mvi.state.spinner.ScreenSpinnerViewState;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.mediapicker.views.FastScrollerView;
import com.vk.dto.music.Playlist;
import com.vk.ecomm.catalog.impl.catalog.root.ClassifiedsCatalogRootVh;
import com.vk.instantjobs.services.JobsForegroundService;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.media.player.video.view.SimpleVideoView;
import com.vk.music.player.PlayerTrack;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.chromium.net.impl.CronetBidirectionalStream;
import ru.mail.libverify.controls.VerificationController;
import ru.ok.tracer.crash.report.CrashLoggerInternal;
import xsna.d5h;
import xsna.k840;
import xsna.n7r0;
import xsna.we9;
import xsna.z4h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class o4 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((FragmentImpl) this.c).dismiss();
                break;
            case 1:
                ((gzs) this.c).invoke();
                break;
            case 2:
                BaseLinkRedirectActivity baseLinkRedirectActivity = (BaseLinkRedirectActivity) this.c;
                int i = BaseLinkRedirectActivity.g;
                baseLinkRedirectActivity.finishAndRemoveTask();
                break;
            case 3:
                we9.f.b bVar = (we9.f.b) this.c;
                if (!bVar.c) {
                    obr.f(null, we9.this.e == we9.e.REOPENING);
                    we9.this.x(true);
                    break;
                }
                break;
            case 4:
                ClassifiedsCatalogRootVh classifiedsCatalogRootVh = (ClassifiedsCatalogRootVh) this.c;
                mzp0 mzp0Var = classifiedsCatalogRootVh.H;
                if (mzp0Var != null) {
                    mzp0Var.a();
                }
                g3a.a(classifiedsCatalogRootVh.z, classifiedsCatalogRootVh);
                break;
            case 5:
                Iterator it = ((ClipSeekBarView) this.c).j.iterator();
                while (it.hasNext()) {
                    ((g4i0) it.next()).getClass();
                }
                break;
            case 6:
                d5h.c cVar = (d5h.c) this.c;
                cVar.n.invoke(new CommunityProfileAction.CommunityInternalMenuAction(CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.SHARE, (z4h.a) cVar.m, Integer.valueOf(((wak0) cVar.o).getIntValue())));
                break;
            case 7:
                CrashLoggerInternal.reportNonFatal$lambda$1((CrashLoggerInternal) this.c);
                break;
            case 8:
                ((CronetBidirectionalStream) this.c).onRequestFinished();
                break;
            case 9:
                ((Animatable) ((Drawable) this.c)).start();
                break;
            case 10:
                ((FastScrollerView) this.c).b.setVisibility(0);
                break;
            case 11:
                ((n4r) this.c).b(ScreenSpinnerViewState.a.b);
                break;
            case 12:
                ((CountDownLatch) this.c).countDown();
                break;
            case 13:
                JobsForegroundService jobsForegroundService = (JobsForegroundService) this.c;
                JobsForegroundService.f = false;
                if (JobsForegroundService.g) {
                    JobsForegroundService.g = false;
                    jobsForegroundService.stopForeground(1);
                    jobsForegroundService.stopSelf();
                    break;
                }
                break;
            case 14:
                Playlist playlist = (Playlist) this.c;
                r5v0 r5v0Var = k840.a.h;
                (r5v0Var != null ? r5v0Var : null).b(new xeb0(playlist));
                break;
            case 15:
                P2.b((P2) this.c);
                break;
            case 16:
                com.vk.music.player.playback.c cVar2 = (com.vk.music.player.playback.c) this.c;
                PlayerTrack playerTrack = cVar2.i;
                if (playerTrack != null) {
                    cVar2.c.j(playerTrack);
                    break;
                }
                break;
            case 17:
                androidx.media3.exoplayer.source.m mVar = (androidx.media3.exoplayer.source.m) this.c;
                if (!mVar.R) {
                    h.a aVar = mVar.t;
                    aVar.getClass();
                    aVar.d(mVar);
                    break;
                }
                break;
            case 18:
                vzg0 vzg0Var = (vzg0) this.c;
                n7r0.c cVar3 = vzg0.p1;
                FragmentActivity activity = vzg0Var.getActivity();
                Object systemService = activity != null ? activity.getSystemService("input_method") : null;
                InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(vzg0Var.f1, 0);
                    break;
                }
                break;
            case 19:
                SimpleVideoView simpleVideoView = (SimpleVideoView) this.c;
                int i2 = SimpleVideoView.V;
                simpleVideoView.u();
                break;
            case 20:
                etv0 etv0Var = ((zim0) this.c).m;
                if (etv0Var != null) {
                    etv0Var.b(false);
                    break;
                }
                break;
            case 21:
                ((VerificationController) this.c).internalCheckProfileVerification();
                break;
            case 22:
                VideoView videoView = (VideoView) this.c;
                qcy<Object>[] qcyVarArr = VideoView.T0;
                TextView textView = videoView.getViewBinding().B;
                if (textView != null) {
                    d3m.e(textView, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
                    break;
                }
                break;
            case 23:
                b7z0.b((Context) this.c).c("sdk_flags", khy0.a);
                break;
            case 24:
                ((one.video.calls.sdk_private.x) this.c).h();
                break;
            case 25:
                ((izy0) this.c).e();
                break;
            case 26:
                ((ru.mail.libverify.api.s) this.c).z();
                break;
            default:
                yads.vu1.a((yads.l00) this.c);
                break;
        }
    }
}
