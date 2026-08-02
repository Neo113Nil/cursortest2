package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Size;
import android.view.Surface;
import androidx.media3.transformer.ExportException;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.config.component.style.StyleCpt;
import com.vk.catalog2.feature.music.ui.holder.MusicMyAudiosCatalogRootVh;
import com.vk.core.files.ExternalDirType;
import com.vk.core.files.a;
import com.vk.core.view.VKViewPager;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.debug.ui.user.DebugUserSettingsFragment;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.log.L;
import com.vk.toggle.features.VideoFeatures;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Locale;
import org.chromium.base.BundleUtils;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.internal.upload.UploadStarter;
import ru.ok.face.morphing.FaceMorphingProcessor;
import ru.ok.tracer.crash.report.AnrWatchdogThread;
import xsna.ikv0;
import xsna.jwj0;
import xsna.skm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class gv2 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gv2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        InputStream inputStream;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (this.b) {
            case 0:
                ((AnrWatchdogThread) this.c).onMain();
                break;
            case 1:
                k84 k84Var = (k84) this.c;
                com.vk.writebar.c cVar = k84Var.b;
                WriteBar writeBar = k84Var.a;
                cVar.g(cVar.d().size() > 0);
                writeBar.I();
                writeBar.J(true);
                s0y0 s0y0Var = k84Var.b.g;
                if (s0y0Var != null) {
                    s0y0Var.f();
                    break;
                }
                break;
            case 2:
                bwt0.p0(((fp6) this.c).m, false);
                break;
            case 3:
                BundleUtils.sHasSplits = (Boolean) this.c;
                break;
            case 4:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
                String[] strArr = DebugDevSettingsFragment.t0;
                debugDevSettingsFragment.ko();
                break;
            case 5:
                DebugUserSettingsFragment debugUserSettingsFragment = (DebugUserSettingsFragment) this.c;
                int i = DebugUserSettingsFragment.l0;
                L.a.getClass();
                String z = L.z();
                if (z != null) {
                    File file = new File(z);
                    String name = file.getName();
                    seq seqVar = com.vk.core.files.a.b;
                    Context context = e43.a;
                    ExternalDirType externalDirType = ExternalDirType.DOWNLOADS;
                    seqVar.getClass();
                    Uri c = seq.c(context, name, externalDirType);
                    Context requireContext = debugUserSettingsFragment.requireContext();
                    try {
                        inputStream = sua.k(requireContext, Uri.fromFile(file));
                    } catch (IOException e) {
                        e.getMessage();
                        inputStream = null;
                    }
                    a.b.d(inputStream, a.c.c(requireContext, c), null);
                    vhk0.b(file);
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("*/*");
                    intent.putExtra("android.intent.extra.STREAM", c);
                    intent.addFlags(1);
                    debugUserSettingsFragment.startActivity(Intent.createChooser(intent, ""));
                    break;
                }
                break;
            case 6:
                androidx.media3.exoplayer.video.a.this.h.d();
                break;
            case 7:
                ((jwj0.a.C3151a) this.c).invoke();
                break;
            case 8:
                ((FaceMorphingProcessor) this.c).lambda$initGPUResources$2();
                break;
            case 9:
                ((zj20) this.c).a = false;
                break;
            case 10:
                MusicMyAudiosCatalogRootVh musicMyAudiosCatalogRootVh = (MusicMyAudiosCatalogRootVh) this.c;
                mzp0 mzp0Var = musicMyAudiosCatalogRootVh.V;
                if (mzp0Var != null) {
                    mzp0Var.a();
                }
                g3a.a(musicMyAudiosCatalogRootVh.I, musicMyAudiosCatalogRootVh);
                break;
            case 11:
                li70 li70Var = (li70) this.c;
                ikv0.a aVar = new ikv0.a(li70Var.getContext());
                aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_accent_green), (Size) (objArr3 == true ? 1 : 0), 12);
                aVar.u = new ikv0.d(li70Var.getContext().getString(R.string.notify_csat_toast), (String) (objArr2 == true ? 1 : 0), (ikv0.d.a) (objArr == true ? 1 : 0), 6);
                aVar.d = true;
                aVar.n();
                break;
            case 12:
                ((u76) this.c).f7();
                break;
            case 13:
                ((skm0.a) this.c).p0();
                break;
            case 14:
                ((StyleCpt) this.c).m();
                break;
            case 15:
                UploadStarter.startUpload$lambda$0((EventChannel) this.c);
                break;
            case 16:
                foq0 foq0Var = (foq0) this.c;
                int i2 = foq0.J;
                RecyclerView.o layoutManager = foq0Var.w.getRecyclerView().getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.scrollToPosition(0);
                    break;
                }
                break;
            case 17:
                VKViewPager vKViewPager = (VKViewPager) this.c;
                int i3 = VKViewPager.c;
                if (!vKViewPager.isFakeDragging()) {
                    vKViewPager.beginFakeDrag();
                    if (vKViewPager.isFakeDragging()) {
                        vKViewPager.endFakeDrag();
                        break;
                    }
                }
                break;
            case 18:
                ((Surface) this.c).release();
                break;
            case 19:
                VideoView videoView = (VideoView) this.c;
                qcy<Object>[] qcyVarArr = VideoView.T0;
                boolean z2 = rts0.b.a().P0() instanceof VideoMinimizableState.Collapsed;
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
                videoFeatures.getClass();
                if (com.vk.toggle.b.A.a(videoFeatures)) {
                    yg5 yg5Var = videoView.I;
                    if ((yg5Var != null && !yg5Var.isPaused() && !videoView.u0 && videoView.I != null) || z2) {
                        videoView.G0(false, false);
                        u8l u8lVar = videoView.q;
                        if (u8lVar != null) {
                            u8lVar.zb(false);
                        }
                    }
                } else {
                    yg5 yg5Var2 = videoView.I;
                    if ((yg5Var2 != null && !yg5Var2.isPaused() && !videoView.u0) || z2) {
                        videoView.G0(false, false);
                        u8l u8lVar2 = videoView.q;
                        if (u8lVar2 != null) {
                            u8lVar2.zb(false);
                        }
                    }
                }
                videoView.o0 = null;
                break;
            case 20:
                androidx.media3.transformer.a0 a0Var = (androidx.media3.transformer.a0) ((hkc0) this.c).c;
                long j = a0Var.g;
                LinkedHashMap linkedHashMap = a7l.a;
                synchronized (a7l.class) {
                }
                Locale locale = Locale.US;
                ExportException exportException = new ExportException("Muxer error", new IllegalStateException(qlb0.a(j, "Abort: no output sample written in the last ", " milliseconds. DebugTrace: \"Tracing disabled\"")), 7002, null);
                androidx.media3.transformer.b0 b0Var = a0Var.u;
                b0Var.getClass();
                b0Var.d(exportException);
                break;
            default:
                yads.v61.a((yads.v61) this.c);
                break;
        }
    }
}
