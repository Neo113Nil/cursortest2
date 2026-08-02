package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.i;
import com.ironsource.C4405kb;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.vk.catalog2.common.ui.holders.video.VideoProfileHorizontallScrollItemWithHighlightVh;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh;
import com.vk.catalog2.feature.music.ui.holder.MusicHidingToolbarVh;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.core.view.search.ModernSearchView;
import com.vk.dto.masks.Mask;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.media.recorder.h;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.text.Regex;
import ru.ok.face.gpu.BaseFaceProcessor;
import ru.ok.gl.objects.FrameBuffer;
import ru.ok.gl.objects.SimpleGLProgram;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.mxy0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class to2 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ to2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        Throwable th;
        RecyclerView recyclerView;
        int i2 = this.b;
        int i3 = 0;
        Object obj = this.c;
        switch (i2) {
            case 0:
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                AppStartTrace appStartTrace = (AppStartTrace) obj;
                i.b bVar = appStartTrace.e;
                if (appStartTrace.m != null) {
                    return;
                }
                Timer b = AppStartTrace.b();
                appStartTrace.m = new Timer();
                i.b z = com.google.firebase.perf.v1.i.z();
                z.p("_experiment_preDraw");
                z.n(b.b);
                z.o(b.e(appStartTrace.m));
                bVar.f(z.build());
                i.b z2 = com.google.firebase.perf.v1.i.z();
                z2.p("_experiment_preDraw_uptimeMillis");
                z2.n(b.b);
                z2.o(appStartTrace.m.d - b.d);
                bVar.f(z2.build());
                if (appStartTrace.m == null || appStartTrace.l == null) {
                    return;
                }
                AppStartTrace.r.execute(new o93(appStartTrace, i3));
                if (appStartTrace.b) {
                    appStartTrace.d();
                    return;
                }
                return;
            case 2:
                ((BaseFaceProcessor) obj).lambda$initGPUResources$0();
                return;
            case 3:
                ((gzs) obj).invoke();
                return;
            case 4:
                com.vk.clips.editor.templates.impl.player.a.i((com.vk.clips.editor.templates.impl.player.a) obj);
                return;
            case 5:
                l2l l2lVar = (l2l) obj;
                ReentrantLock reentrantLock = l2lVar.k;
                String str = l2lVar.h;
                fh50<T> fh50Var = l2lVar.i;
                fh50<T> fh50Var2 = l2lVar.j;
                reentrantLock.lock();
                try {
                    try {
                    } catch (Throwable th2) {
                        try {
                            L.i(th2);
                            l2lVar.g = false;
                            fh50Var.m();
                            if (fh50Var2.g()) {
                                L l = L.a;
                                l.getClass();
                                if (!L.m(LoggerOutputTarget.NONE)) {
                                    L.u(l, L.LogType.d, new Object[]{str, " runnable reservePendingItems is not empty"});
                                }
                                fh50Var.l(fh50Var2);
                            }
                        } catch (Throwable th3) {
                            l2lVar.g = false;
                            fh50Var.m();
                            if (fh50Var2.g()) {
                                L l2 = L.a;
                                l2.getClass();
                                if (!L.m(LoggerOutputTarget.NONE)) {
                                    L.u(l2, L.LogType.d, new Object[]{str, " runnable reservePendingItems is not empty"});
                                }
                                fh50Var.l(fh50Var2);
                                fh50Var2.m();
                            }
                            throw th3;
                        }
                    }
                    if (!l2lVar.d && !Thread.interrupted()) {
                        if (fh50Var.f()) {
                            l2lVar.g = false;
                            fh50Var.m();
                            if (fh50Var2.g()) {
                                L l3 = L.a;
                                l3.getClass();
                                if (!L.m(LoggerOutputTarget.NONE)) {
                                    L.u(l3, L.LogType.d, new Object[]{str, " runnable reservePendingItems is not empty"});
                                }
                                fh50Var.l(fh50Var2);
                                fh50Var2.m();
                            }
                            s3q0 s3q0Var = s3q0.a;
                            return;
                        }
                        l2lVar.g = true;
                        L l4 = L.a;
                        l4.getClass();
                        if (L.m(LoggerOutputTarget.NONE)) {
                            i = 1;
                            th = null;
                        } else {
                            L.LogType logType = L.LogType.d;
                            StringBuilder sb = new StringBuilder("fire! ");
                            i = 1;
                            th = null;
                            sb.append(System.currentTimeMillis() - l2lVar.e);
                            sb.append(UcumUtils.UCUM_MILLISECODS);
                            L.u(l4, logType, new Object[]{str, sb.toString()});
                        }
                        if (fh50Var.f()) {
                            alk.E("ObjectList is empty.");
                            throw th;
                        }
                        T t = fh50Var.a[fh50Var.b - i];
                        if (l2lVar.c.a(t, l2lVar.l, fh50Var)) {
                            l2lVar.l = t;
                        }
                        l2lVar.g = false;
                        fh50Var.m();
                        if (fh50Var2.g()) {
                            L l5 = L.a;
                            l5.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l5, L.LogType.d, new Object[]{str, " runnable reservePendingItems is not empty"});
                            }
                            fh50Var.l(fh50Var2);
                            fh50Var2.m();
                        }
                        s3q0 s3q0Var2 = s3q0.a;
                        return;
                    }
                    L l6 = L.a;
                    l6.getClass();
                    LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
                    if (!L.m(loggerOutputTarget)) {
                        L.u(l6, L.LogType.d, new Object[]{str, "break"});
                    }
                    l2lVar.g = false;
                    fh50Var.m();
                    if (fh50Var2.g()) {
                        if (!L.m(loggerOutputTarget)) {
                            L.u(l6, L.LogType.d, new Object[]{str, " runnable reservePendingItems is not empty"});
                        }
                        fh50Var.l(fh50Var2);
                        fh50Var2.m();
                    }
                    s3q0 s3q0Var22 = s3q0.a;
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            case 6:
                ((com.vk.newsfeed.common.recycler.holders.attachments.a) obj).invoke();
                return;
            case 7:
                LevelPlayNativeAd.a((LevelPlayNativeAd) obj);
                return;
            case 8:
                File n = f9t.n(((Mask) obj).Db());
                Regex regex = com.vk.core.files.a.a;
                vhk0.d(n);
                return;
            case 9:
                mhy.j(((ModernSearchView) obj).j);
                return;
            case 10:
                l4v0 l4v0Var = ((MusicHidingToolbarVh) obj).n;
                if (l4v0Var != null) {
                    l4v0Var.e();
                    return;
                }
                return;
            case 11:
                mhy.j(((com.vk.photogallery.c) obj).q);
                return;
            case 12:
                h.b bVar2 = (h.b) obj;
                bVar2.c(null);
                nv70 nv70Var = bVar2.c;
                if (nv70Var != null) {
                    ((FrameBuffer) nv70Var.c).release();
                    ((SimpleGLProgram) nv70Var.d).release();
                }
                bVar2.c = null;
                return;
            case 13:
                VerticalListVh verticalListVh = (VerticalListVh) obj;
                RecyclerPaginatedView l7 = verticalListVh.l();
                if (l7 == null || (recyclerView = l7.getRecyclerView()) == null) {
                    return;
                }
                ib80 ib80Var = verticalListVh.x;
                if (ib80Var.o) {
                    return;
                }
                ib80Var.f = recyclerView;
                ib80Var.o = true;
                ib80Var.n = false;
                ib80Var.j.postDelayed(ib80Var.r, 300L);
                return;
            case 14:
                ((v2s0) obj).e();
                return;
            case 15:
                VkOnboardingHighlighter vkOnboardingHighlighter = ((VideoProfileHorizontallScrollItemWithHighlightVh) obj).i;
                (vkOnboardingHighlighter != null ? vkOnboardingHighlighter : null).c(true);
                return;
            case 16:
                ((ru.mail.libverify.b0.a) obj).c();
                return;
            case 17:
                com.vungle.ads.internal.session.b.b((com.vungle.ads.internal.session.b) obj);
                return;
            case 18:
                com.vungle.ads.internal.omsdk.c.a((com.vungle.ads.internal.omsdk.c) obj);
                return;
            case 19:
                mxy0.a aVar = ((mxy0) obj).i;
                if (aVar.d != 0) {
                    return;
                }
                aVar.d = 2;
                tnf tnfVar = aVar.e;
                if (tnfVar != null) {
                    o8z0.g.removeCallbacks(tnfVar);
                    aVar.e = null;
                }
                aVar.a.run();
                return;
            case 20:
                C4405kb.a((C4405kb) obj);
                return;
            default:
                ((yads.uj) obj).b();
                return;
        }
    }
}
