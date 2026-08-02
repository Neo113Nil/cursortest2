package xsna;

import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.media3.exoplayer.video.g;
import com.ironsource.C4267cg;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Attachment;
import com.vk.dto.music.MusicTrack;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import java.io.File;
import kotlin.jvm.internal.Ref$FloatRef;
import org.webrtc.CandidatePairChangeEvent;
import ru.ok.android.externcalls.sdk.dev.MediaDumpManager;
import ru.ok.android.webrtc.PeerConnectionClient;
import xsna.p4x0;
import xsna.zv90;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class ugr implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ugr(int i, Object obj, Object obj2) {
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
                jxj0 jxj0Var = (jxj0) obj;
                ((zgr) obj2).j.c(jxj0Var.a, jxj0Var.b);
                break;
            case 1:
                com.vk.stickers.keyboard.navigation.f fVar = (com.vk.stickers.keyboard.navigation.f) obj2;
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj;
                if (fVar.m.getTranslationX() != ref$FloatRef.element) {
                    fVar.m.animate().translationX(ref$FloatRef.element);
                    break;
                }
                break;
            case 2:
                p630 p630Var = (p630) obj;
                if (((MusicTrack) obj2).Lb()) {
                    d3m.c(p630Var.w, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                }
                break;
            case 3:
                ((PeerConnectionClient) obj2).b((CandidatePairChangeEvent) obj);
                break;
            case 4:
                ((View) obj2).getViewTreeObserver().removeOnDrawListener((zv90.b) obj);
                break;
            case 5:
                c5d0 c5d0Var = (c5d0) obj2;
                PostingAttachment postingAttachment = (PostingAttachment) obj;
                pcc0 pcc0Var = c5d0Var.d;
                if (pcc0Var != null) {
                    Attachment attachment = pcc0Var.o;
                    if (attachment != null) {
                        pcc0Var.O0(attachment, false);
                        pcc0Var.o = null;
                        break;
                    } else if (postingAttachment != null) {
                        if (!hg10.l(c5d0Var.c)) {
                            c5d0Var.n.postDelayed(new ch5(2, c5d0Var, postingAttachment), 200L);
                        }
                        c5d0Var.g = false;
                        break;
                    }
                }
                break;
            case 6:
                androidx.media3.exoplayer.video.g gVar = ((g.a) obj2).b;
                String str = y2r0.a;
                gVar.t((Exception) obj);
                break;
            case 7:
                String str2 = (String) obj2;
                p4x0.b bVar = (p4x0.b) obj;
                MediaDumpManager.Source source = bVar.d;
                if (source != null) {
                    File file = new File(str2);
                    try {
                        if (file.isDirectory()) {
                            File[] listFiles = file.listFiles();
                            if (listFiles != null) {
                                for (File file2 : listFiles) {
                                    L.e("VoipViewModelAudioDumpDelegate", "dump state found: " + file2.getName() + ": " + com.vk.core.files.a.I(file2));
                                }
                            }
                            p4x0.a(file, bVar, source);
                            break;
                        }
                    } catch (Throwable th) {
                        L.f("VoipViewModelAudioDumpDelegate", "Audio dump data extraction did fail", th);
                        return;
                    }
                }
                break;
            case 8:
                com.vungle.ads.internal.load.c.a((com.vungle.ads.internal.load.g) obj2, (com.vungle.ads.internal.model.b) obj);
                break;
            case 9:
                C4267cg.a((C4267cg) obj2, (String) obj);
                break;
            default:
                ycz0 ycz0Var = (ycz0) obj2;
                kiw kiwVar = (kiw) obj;
                ycz0Var.getClass();
                int i2 = kiwVar.b;
                int i3 = kiwVar.c;
                if (ycz0Var.p != null) {
                    Size c = ycz0Var.c(i2, i3);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c.getWidth(), c.getHeight());
                    layoutParams.gravity = 17;
                    ycz0Var.p.getVideoView().b(c.getWidth(), c.getHeight());
                    ycz0Var.p.getPreviewView().setLayoutParams(layoutParams);
                    ycz0Var.p.getPreviewView().setScaleType(ImageView.ScaleType.CENTER_CROP);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ugr(p4x0 p4x0Var, String str, p4x0.b bVar) {
        this.b = 7;
        this.c = str;
        this.d = bVar;
    }
}
