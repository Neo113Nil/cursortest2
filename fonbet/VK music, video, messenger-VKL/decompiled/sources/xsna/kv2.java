package xsna;

import android.os.Looper;
import android.os.Trace;
import androidx.media3.transformer.ExportException;
import androidx.media3.transformer.y;
import com.ironsource.Wd;
import com.vk.attachpicker.fragment.gallery.FastScroller;
import com.vk.catalog2.feature.music.ui.holder.MusicArtistCatalogRootVh;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.libvideo.live.impl.views.menubutton.MenuButtonNewView;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.sync.online.VkOnlineService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.ok.android.webrtc.mediaadaptation.PeriodicalNetworkStateProvider;
import ru.ok.android.webrtc.mediaadaptation.PeriodicalNetworkStateProvider$scheduleNextState$1;
import ru.ok.call_effects.internal.CallEffectsRenderer;
import ru.ok.gl.tf.Tensorflow;
import xsna.o7w0;
import xsna.q5o0;
import xsna.skm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class kv2 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kv2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                VkInputSelect vkInputSelect = (VkInputSelect) this.c;
                int i = com.vk.profile.questions.impl.a.o1;
                mhy.j(vkInputSelect);
                return;
            case 1:
                ((CallEffectsRenderer) this.c).releaseInternal();
                return;
            case 2:
                FastScroller.a((FastScroller) this.c);
                return;
            case 3:
                q5o0 q5o0Var = ((n3w) this.c).m;
                q5o0Var.getClass();
                Trace.beginSection(ndp0.f("TaskExecutor.shutDown"));
                try {
                    synchronized (q5o0Var.e) {
                        q5o0Var.f = true;
                        s3q0 s3q0Var = s3q0.a;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, q5o0.c> entry : q5o0Var.h.entrySet()) {
                        q5o0Var.h(entry.getValue().a, entry.getKey(), linkedHashMap);
                    }
                    q5o0Var.h(((q5o0.c) q5o0Var.i.getValue()).a, "cached", linkedHashMap);
                    for (Map.Entry<String, q5o0.c> entry2 : q5o0Var.h.entrySet()) {
                        q5o0Var.a(entry2.getValue().a, entry2.getKey(), linkedHashMap);
                    }
                    q5o0Var.a(((q5o0.c) q5o0Var.i.getValue()).a, "cached", linkedHashMap);
                    q5o0Var.k.clear();
                    q5o0Var.h.clear();
                    s3q0 s3q0Var2 = s3q0.a;
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 4:
                ((w800) this.c).c();
                return;
            case 5:
                MenuButtonNewView menuButtonNewView = (MenuButtonNewView) this.c;
                dw20 dw20Var = menuButtonNewView.g;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                menuButtonNewView.g = null;
                return;
            case 6:
                MusicArtistCatalogRootVh musicArtistCatalogRootVh = (MusicArtistCatalogRootVh) this.c;
                g3a.a(musicArtistCatalogRootVh.M, musicArtistCatalogRootVh);
                return;
            case 7:
                com.vk.media.ok.a aVar = ((com.vk.media.ok.b) this.c).h;
                if (aVar != null) {
                    aVar.u(true);
                    return;
                }
                return;
            case 8:
                PeriodicalNetworkStateProvider$scheduleNextState$1.a((PeriodicalNetworkStateProvider) this.c);
                return;
            case 9:
                ((ord0) this.c).q.requestLayout();
                return;
            case 10:
                y.c cVar = (y.c) this.c;
                try {
                    if (cVar.d.v) {
                        return;
                    }
                    cVar.d.h();
                    cVar.c += cVar.d.x;
                    cVar.d.n.release();
                    androidx.media3.transformer.y yVar = cVar.d;
                    yVar.l = false;
                    int i2 = yVar.m + 1;
                    yVar.m = i2;
                    com.google.common.collect.g gVar = yVar.a;
                    if (i2 == gVar.e) {
                        yVar.m = 0;
                        yVar.r++;
                    }
                    androidx.media3.transformer.m mVar = (androidx.media3.transformer.m) gVar.get(yVar.m);
                    androidx.media3.transformer.y yVar2 = cVar.d;
                    y.a aVar2 = yVar2.c;
                    Looper myLooper = Looper.myLooper();
                    myLooper.getClass();
                    androidx.media3.transformer.y yVar3 = cVar.d;
                    yVar2.n = aVar2.a(mVar, myLooper, yVar3, yVar3.d);
                    cVar.d.n.start();
                    return;
                } catch (RuntimeException e) {
                    cVar.d.a(ExportException.a(1000, e));
                    return;
                }
            case 11:
                ((skm0.a) this.c).h();
                return;
            case 12:
                ((Tensorflow) this.c).lambda$initIfNeeded$1();
                return;
            case 13:
                ((lb6) this.c).invoke();
                return;
            case 14:
                ((gzs) this.c).invoke();
                return;
            case 15:
                ((vtt0) this.c).h(false);
                return;
            case 16:
                VkOnlineService vkOnlineService = (VkOnlineService) this.c;
                bpn0 bpn0Var = VkOnlineService.f;
                synchronized (vkOnlineService) {
                    try {
                        if (((Boolean) VkOnlineService.g.getValue()).booleanValue()) {
                            wyk0 wyk0Var = VkOnlineService.h;
                            if (wyk0Var != null && wyk0Var.a) {
                                wyk0Var.b.interrupt();
                                wyk0Var.c.interrupt();
                                wyk0Var.a = false;
                                wyk0Var.b = null;
                                wyk0Var.c = null;
                            }
                            VkOnlineService.h = null;
                        } else {
                            wyk0 wyk0Var2 = vkOnlineService.d;
                            if (wyk0Var2 != null && wyk0Var2.a) {
                                wyk0Var2.b.interrupt();
                                wyk0Var2.c.interrupt();
                                wyk0Var2.a = false;
                                wyk0Var2.b = null;
                                wyk0Var2.c = null;
                            }
                            vkOnlineService.d = null;
                        }
                        s3q0 s3q0Var3 = s3q0.a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 17:
                o7w0 o7w0Var = (o7w0) this.c;
                o7w0.a aVar3 = o7w0Var.m;
                int measuredWidth = o7w0Var.l.getMeasuredWidth() / cn70.b(72);
                aVar3.getClass();
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < measuredWidth; i3++) {
                    arrayList.add(n9w0.b);
                }
                aVar3.setItems(arrayList);
                return;
            case 18:
                Wd.d((Wd) this.c);
                return;
            case 19:
                WriteBar.o((WriteBar) this.c);
                return;
            case 20:
                ((ru.mail.libverify.e0.a) this.c).i();
                return;
            case 21:
                ((yads.zc0) this.c).a((yads.pk0) null);
                return;
            default:
                ((ru.mail.libverify.api.q) this.c).o();
                return;
        }
    }
}
