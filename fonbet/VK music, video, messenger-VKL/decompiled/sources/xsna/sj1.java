package xsna;

import android.os.SystemClock;
import android.view.View;
import com.my.target.common.views.Html5View;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.catalog2.feature.music.ui.holder.MusicCuratorCatalogRootVh;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.log.L;
import com.vk.posting.presentation.album.AlbumPickerFragment;
import com.vk.posting.presentation.album.a;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;
import kotlin.text.Regex;
import ru.mail.platform.libverify.sms.SmsRetrieverService;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.android.webrtc.protocol.screenshare.send.impl.FrameCapturerImpl;
import ru.ok.face.mesh.FaceMeshRegressorWithAttentions;
import ru.ok.tracer.opentelemetry.export.TracerOpenTelemetrySpanExporter;
import xsna.c9z0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class sj1 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sj1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        scz0 scz0Var;
        c9z0.a aVar;
        WeakReference weakReference;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                AlbumPickerFragment albumPickerFragment = (AlbumPickerFragment) obj;
                int i2 = AlbumPickerFragment.V;
                a.b bVar = a.b.b;
                albumPickerFragment.getClass();
                xn50.a.c(albumPickerFragment, bVar);
                break;
            case 1:
                p52.N(((p52) obj).getRoot());
                break;
            case 2:
                ((CallsAudioManagerV3Impl) obj).trySetCommunicationDeviceAgain();
                break;
            case 3:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) obj;
                int i3 = ClipFeedListFragment.a2;
                nlh0 so = clipFeedListFragment.so();
                SdkVideoFile k = so != null ? so.k() : null;
                if (k == null || !k.v()) {
                    if (k != null) {
                        clipFeedListFragment.Qo(true);
                        break;
                    } else {
                        clipFeedListFragment.Qo(false);
                        break;
                    }
                } else {
                    clipFeedListFragment.Qo(k.q0());
                    break;
                }
                break;
            case 4:
                psd psdVar = (psd) obj;
                try {
                    List list = (List) psdVar.b.invoke();
                    HashSet hashSet = new HashSet();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        hashSet.addAll(((ClipsDraftVk) it.next()).f());
                    }
                    hashSet.addAll(((ClipsUploadVkComponent) ((k7m) m7m.f(psdVar)).a(fpf0.a(ClipsUploadVkComponent.class))).s0());
                    for (File file : izi0.g(psd.b(), hashSet)) {
                        Regex regex = com.vk.core.files.a.a;
                        vhk0.b(file);
                    }
                    break;
                } catch (Exception e) {
                    L.f("ClipsDraftFilesClearer", "clips files clearing failed", e);
                    return;
                }
            case 5:
                ((FaceMeshRegressorWithAttentions) obj).lambda$initGPUResources$0();
                break;
            case 6:
                ((FrameCapturerImpl) obj).b();
                break;
            case 7:
                Html5View.a aVar2 = ((Html5View.c) obj).b;
                if (aVar2 != null && (aVar = (scz0Var = scz0.this).b) != null && (weakReference = scz0Var.a) != null) {
                    tbz0 tbz0Var = scz0Var.d;
                    View view = (View) weakReference.get();
                    c9z0 c9z0Var = aVar.b;
                    gu8.c(null, "NativeAdEngine: Click on native html CTA received");
                    x1z0 x1z0Var = c9z0Var.d;
                    c9z0Var.d(tbz0Var, x1z0Var.J, 2, view, view.getContext());
                    h8z0.e(x1z0Var.a, "click", 2, null);
                    break;
                }
                break;
            case 8:
                ((zdz) obj).d();
                break;
            case 9:
                ((wzh) obj).invoke();
                break;
            case 10:
                MusicCuratorCatalogRootVh musicCuratorCatalogRootVh = (MusicCuratorCatalogRootVh) obj;
                g3a.a(musicCuratorCatalogRootVh.u, musicCuratorCatalogRootVh);
                break;
            case 11:
                com.vk.media.ok.a aVar3 = ((com.vk.media.ok.b) obj).h;
                if (aVar3 != null) {
                    aVar3.A();
                    break;
                }
                break;
            case 12:
                List list2 = (List) obj;
                List<hyb0> all = myb0.d().getAll();
                ArrayList arrayList = new ArrayList();
                if (all != null) {
                    for (hyb0 hyb0Var : all) {
                        long j = hyb0Var.a;
                        boolean z = hyb0Var.b;
                        if (list2.contains(Long.valueOf(j))) {
                            if (z) {
                                myb0.d().a(hyb0.a(hyb0Var, false, 0, 5));
                            }
                        } else if (!z) {
                            myb0.d().a(hyb0.a(hyb0Var, true, 0, 5));
                        }
                        arrayList.add(Long.valueOf(hyb0Var.a));
                    }
                }
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    long longValue = ((Number) it2.next()).longValue();
                    if (!arrayList.contains(Long.valueOf(longValue))) {
                        myb0.d().a(new hyb0(longValue, 4));
                    }
                }
                break;
            case 13:
                SmsRetrieverService.a((ru.mail.libverify.n.n) obj);
                break;
            case 14:
                View view2 = (View) obj;
                view2.requestLayout();
                view2.invalidate();
                break;
            case 15:
                TracerOpenTelemetrySpanExporter.scheduleUpload$lambda$0((TracerOpenTelemetrySpanExporter) obj);
                break;
            case 16:
                com.vk.metrics.eventtracking.b.a.a((TimeoutException) obj);
                break;
            default:
                e1z0 e1z0Var = (e1z0) obj;
                e1z0Var.getClass();
                e1z0Var.d(SystemClock.elapsedRealtime());
                break;
        }
    }

    public /* synthetic */ sj1(myb0 myb0Var, List list) {
        this.b = 12;
        this.c = list;
    }
}
