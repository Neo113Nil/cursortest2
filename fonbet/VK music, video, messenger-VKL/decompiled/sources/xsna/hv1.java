package xsna;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import com.vk.core.ui.CircularProgressView;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.ui.BookingNavHostFragment;
import com.vk.libvideo.design.view.seek.VideoFastSeekView;
import com.vk.libvideo.ui.dialog.single.VideoDialog;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.photogallery.view.WrapContentAutoSizingTextView;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import kotlin.text.Regex;
import one.video.player.OneVideoPlayer;
import ru.mail.libverify.controls.VerificationController;
import ru.ok.gl.effects.media.controller.audio.ExtraAudioSupplier;
import ru.ok.proto.okmp.OkmpPublisher;
import ru.ok.segmentation_full.segmentation.SegmenterRecurrent;
import xsna.gqb0;
import xsna.im00.a;
import xsna.ocz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class hv1 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hv1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OneVideoPlayer player;
        Context mo2getContext;
        int i = this.b;
        ProgressBar progressBar = null;
        Object obj = this.c;
        switch (i) {
            case 0:
                jv1 jv1Var = (jv1) obj;
                jv1Var.a();
                View view = jv1Var.a;
                view.setVisibility(8);
                view.setAlpha(1.0f);
                break;
            case 1:
                int i2 = BookingNavHostFragment.S;
                ((BookingNavHostFragment) obj).ho();
                break;
            case 2:
                String a = ((xdd) obj).a();
                Regex regex = com.vk.core.files.a.a;
                vhk0.c(a);
                break;
            case 3:
                com.vk.clips.editor.templates.impl.player.a aVar = com.vk.clips.editor.templates.impl.player.a.this;
                player = aVar.getPlayer();
                if (player != null) {
                    player.setVolume(aVar.M);
                    break;
                }
                break;
            case 4:
                lvo lvoVar = (lvo) obj;
                if (lvoVar.e) {
                    lvoVar.e = false;
                    lvoVar.a();
                    break;
                }
                break;
            case 5:
                EditText editText = ((u4q) obj).A;
                if (editText != null) {
                    t65.a(editText);
                    break;
                }
                break;
            case 6:
                ((ExtraAudioSupplier) obj).lambda$syncAms$6();
                break;
            case 7:
                try {
                    ProgressBar progressBar2 = ((com.vk.folders.impl.configure.h) obj).k;
                    if (progressBar2 != null) {
                        progressBar = progressBar2;
                    }
                    bwt0.p0(progressBar, true);
                    s3q0 s3q0Var = s3q0.a;
                    break;
                } catch (Throwable unused) {
                    return;
                }
            case 8:
                d3m.e(((xcx) obj).a.L, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
                break;
            case 9:
                im00 im00Var = (im00) obj;
                om00 om00Var = im00Var.q;
                om00Var.h();
                om00Var.c(im00Var.new a());
                break;
            case 10:
                com.vk.newsfeed.posting.market_picker.presentation.base.view.e eVar = (com.vk.newsfeed.posting.market_picker.presentation.base.view.e) obj;
                eVar.g.removeCallbacksAndMessages(null);
                eVar.q.setSystemUiVisibility(CoverVideoUploadTask.y);
                break;
            case 11:
                ((OkmpPublisher) obj).lambda$start$0();
                break;
            case 12:
                gqb0.a aVar2 = (gqb0.a) obj;
                aVar2.c.e(120, aVar2.b);
                break;
            case 13:
                ((b2c0) obj).D0(0);
                break;
            case 14:
                ((b2e0) obj).c();
                break;
            case 15:
                ((SegmenterRecurrent) obj).lambda$initGPUResources$2();
                break;
            case 16:
                afi0 afi0Var = (afi0) obj;
                RecyclerPaginatedView recyclerPaginatedView = afi0Var.j;
                if (recyclerPaginatedView != null) {
                    recyclerPaginatedView.post(new tnf(afi0Var, 9));
                    break;
                }
                break;
            case 17:
                com.vk.sharing.core.view.f.J0((com.vk.sharing.core.view.f) obj);
                break;
            case 18:
                ((v8o0) obj).a.removeCallbacksAndMessages(null);
                break;
            case 19:
                ((VerificationController) obj).requestIvrCall();
                break;
            case 20:
                CircularProgressView circularProgressView = (CircularProgressView) obj;
                circularProgressView.setIndeterminate(true);
                circularProgressView.b();
                break;
            case 21:
                VideoDialog videoDialog = (VideoDialog) obj;
                if (videoDialog.B0 && (mo2getContext = videoDialog.mo2getContext()) != null) {
                    videoDialog.wo(mo2getContext.getResources().getConfiguration());
                    break;
                }
                break;
            case 22:
                VideoFastSeekView.b bVar = ((VideoFastSeekView) obj).B;
                if (bVar != null) {
                    bVar.p();
                    break;
                }
                break;
            case 23:
                int i3 = ylw0.x1;
                ((ylw0) obj).On(3);
                break;
            case 24:
                WrapContentAutoSizingTextView.setText$lambda$0((WrapContentAutoSizingTextView) obj);
                break;
            case 25:
                ocz0.c cVar = ((mxy0) obj).c.W;
                if (cVar != null) {
                    h8z0.e(cVar.a, "interactionStarted", 999, null);
                    break;
                }
                break;
            case 26:
                mfz0.this.b.dismiss();
                break;
            default:
                phz0 phz0Var = (phz0) obj;
                nuy0 nuy0Var = phz0Var.e;
                if (phz0Var.q) {
                    phz0Var.o();
                    nuy0Var.d(false);
                    nuy0Var.f();
                    phz0Var.q = false;
                    break;
                }
                break;
        }
    }
}
