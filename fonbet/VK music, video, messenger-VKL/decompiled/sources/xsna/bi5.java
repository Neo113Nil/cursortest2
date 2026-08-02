package xsna;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Size;
import android.view.inputmethod.InputMethodManager;
import androidx.camera.core.impl.r;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.clips.media.ClipsEncoderParameters;
import com.vk.dto.clips.stickers.ISerializableStickerSDK;
import com.vk.dto.clips.upload.ClipEditorSizeParams;
import com.vk.media.MediaUtils;
import com.vk.media.pipeline.di.MediaPipelineComponent;
import com.vk.media.pipeline.metrics.ComparableVideoFragmentInfo;
import com.vk.media.pipeline.metrics.MetricsCalculationConfig;
import com.vk.media.pipeline.model.stat.TranscodeType;
import com.vk.media.pipeline.model.timeline.Timeline;
import com.vk.media.pipeline.model.transform.TransformFormat;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vkontakte.android.fragments.SettingsDomainFragment;
import io.appmetrica.analytics.impl.C5307y0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptyList;
import ru.mail.libverify.controls.VerificationController;
import ru.ok.call_effects.internal.tensorflow.TensorflowConfigurator;
import ru.ok.tracer.opentelemetry.collect.TechStatsCollectorManager$runnable$1;
import xsna.qpa0;
import xsna.rkp0;
import xsna.t4c0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class bi5 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bi5(r.c cVar, androidx.camera.core.impl.r rVar) {
        this.b = 2;
        this.c = cVar;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        List<? extends uq10> singletonList;
        TranscodeType transcodeType;
        final Uri uri;
        Uri uri2;
        String obj;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ci5 ci5Var = (ci5) obj2;
                RecyclerView recyclerView = ci5Var.b;
                if (recyclerView != null) {
                    ci5Var.c.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime() - ci5Var.i;
                    if (recyclerView.getScrollState() == 0 || elapsedRealtime < 500) {
                        return;
                    }
                    ci5Var.d.invoke(ci5Var);
                    return;
                }
                return;
            case 1:
                ((gzs) obj2).invoke();
                return;
            case 2:
                ((r.c) obj2).onError();
                return;
            case 3:
                final com.vk.clips.upload.vk.impl.uploader.f fVar = (com.vk.clips.upload.vk.impl.uploader.f) obj2;
                Handler handler = fVar.g;
                File file = fVar.b;
                MediaPipelineComponent mediaPipelineComponent = fVar.a;
                ClipsEncoderParameters clipsEncoderParameters = fVar.c;
                AtomicBoolean atomicBoolean = fVar.h;
                int i2 = 3;
                if (atomicBoolean.get()) {
                    fVar.b();
                    handler.post(new sc4(fVar, i2));
                    return;
                }
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                hpa0 p6 = mediaPipelineComponent.p6(context);
                List<ISerializableStickerSDK> list = clipsEncoderParameters.h;
                Timeline timeline = clipsEncoderParameters.b;
                ClipEditorSizeParams clipEditorSizeParams = clipsEncoderParameters.d;
                Size size = new Size(clipEditorSizeParams.b, clipEditorSizeParams.c);
                if (list.isEmpty()) {
                    singletonList = EmptyList.b;
                } else {
                    c1f c = new z3l0().c(list, new MediaUtils.d(size));
                    c.f();
                    singletonList = Collections.singletonList(c);
                }
                fVar.j = singletonList;
                hpa0 hpa0Var = (hpa0) p6.c(timeline).d(new d80(3));
                List<? extends uq10> list2 = fVar.j;
                Context context2 = e43.a;
                if (context2 == null) {
                    context2 = null;
                }
                gpa0 build = ((hpa0) hpa0Var.g(new apk(list2, context2, null))).f(fVar.e, "clip_upload").build();
                fVar.i.set(build);
                ClipsEncoderParameters.VideoOutputSettings videoOutputSettings = clipsEncoderParameters.c;
                qpa0 c2 = build.c(new ykm0(file, new TransformFormat(clipsEncoderParameters.e, new TransformFormat.VideoOutputFormat(videoOutputSettings.b, videoOutputSettings.c, null, null, null, 24, null), null), new jkp0(new vmf(fVar))));
                if (epx.f(c2, qpa0.a.a)) {
                    if (atomicBoolean.get()) {
                        fVar.b();
                        handler.post(new sc4(fVar, i2));
                        return;
                    }
                    return;
                }
                if (!(c2 instanceof qpa0.b)) {
                    if (c2 instanceof qpa0.c) {
                        Throwable th = ((qpa0.c) c2).a;
                        fVar.b();
                        handler.post(new y(i2, fVar, th));
                        return;
                    }
                    return;
                }
                qpa0.b bVar = (qpa0.b) c2;
                rkp0 rkp0Var = bVar.a;
                Context context3 = e43.a;
                if (context3 == null) {
                    context3 = null;
                }
                rkp0.b bVar2 = rkp0Var instanceof rkp0.b ? (rkp0.b) rkp0Var : null;
                if (bVar2 != null && (transcodeType = bVar2.a) != null && (transcodeType == TranscodeType.ALL || transcodeType == TranscodeType.VIDEO_ONLY)) {
                    xke xkeVar = fVar.f;
                    final bnf bnfVar = new bnf(mediaPipelineComponent, xkeVar);
                    xke xkeVar2 = bnfVar.b;
                    final int i3 = fVar.e;
                    AtomicBoolean atomicBoolean2 = bnf.d;
                    try {
                        if (atomicBoolean2.compareAndSet(false, true)) {
                            bnfVar.b(context3);
                            if (clipsEncoderParameters.h.isEmpty()) {
                                MetricsCalculationConfig c3 = ((gat0) bnfVar.c.getValue()).c(context3, Uri.fromFile(file), timeline.b);
                                if (c3 instanceof MetricsCalculationConfig.CanNotBeCalculated) {
                                    xkeVar.d("ClipsVideoQualityMetricsProcessor", "Video quality metrics can't be calculated, cause: ".concat(((MetricsCalculationConfig.CanNotBeCalculated) c3).b));
                                    atomicBoolean2.set(false);
                                } else {
                                    try {
                                        uri = Uri.fromFile(bnf.c(context3, ((MetricsCalculationConfig.CanBeCalculated) c3).c));
                                    } catch (Throwable th2) {
                                        xkeVar2.e("ClipsVideoQualityMetricsProcessor", "Failed to copy transcoded file for quality metrics calculation", th2);
                                        uri = null;
                                    }
                                    if (uri == null) {
                                        atomicBoolean2.set(false);
                                    } else {
                                        List<ComparableVideoFragmentInfo> list3 = ((MetricsCalculationConfig.CanBeCalculated) c3).b;
                                        final ArrayList arrayList = new ArrayList();
                                        for (ComparableVideoFragmentInfo comparableVideoFragmentInfo : list3) {
                                            try {
                                                uri2 = Uri.fromFile(bnf.c(context3, comparableVideoFragmentInfo.b));
                                            } catch (Throwable th3) {
                                                xkeVar2.e("ClipsVideoQualityMetricsProcessor", "Failed to copy fragment file for quality metrics calculation", th3);
                                                uri2 = null;
                                            }
                                            ComparableVideoFragmentInfo comparableVideoFragmentInfo2 = uri2 != null ? new ComparableVideoFragmentInfo(uri2, comparableVideoFragmentInfo.c, comparableVideoFragmentInfo.d) : null;
                                            if (comparableVideoFragmentInfo2 != null) {
                                                arrayList.add(comparableVideoFragmentInfo2);
                                            }
                                        }
                                        asu0.a.getClass();
                                        final Context context4 = context3;
                                        asu0.h().submit(new Runnable() { // from class: xsna.anf
                                            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                ArrayList arrayList2 = arrayList;
                                                bnf bnfVar2 = bnfVar;
                                                Context context5 = context4;
                                                Uri uri3 = uri;
                                                int i4 = i3;
                                                AtomicBoolean atomicBoolean3 = bnf.d;
                                                try {
                                                    Iterator it = arrayList2.iterator();
                                                    while (it.hasNext()) {
                                                        qts0 a = bnfVar2.a(context5, uri3, (ComparableVideoFragmentInfo) it.next());
                                                        if (a != null) {
                                                            ((gat0) bnfVar2.c.getValue()).a(a, i4, arrayList2.size());
                                                        }
                                                    }
                                                } catch (Throwable th4) {
                                                    try {
                                                        bnfVar2.b.e("ClipsVideoQualityMetricsProcessor", "Failed to calculate video quality metrics. Unexpected error.", th4);
                                                    } finally {
                                                        atomicBoolean3.set(false);
                                                        try {
                                                            vhk0.b(up2.u(uri3));
                                                        } catch (Throwable unused) {
                                                        }
                                                    }
                                                }
                                                try {
                                                    vhk0.b(up2.u(uri3));
                                                } catch (Throwable unused2) {
                                                }
                                            }
                                        });
                                    }
                                }
                            } else {
                                xkeVar.d("ClipsVideoQualityMetricsProcessor", "Video quality metrics can't be calculated due to layers applying");
                                atomicBoolean2.set(false);
                            }
                        }
                    } catch (Throwable th4) {
                        atomicBoolean2.set(false);
                        xkeVar.e("ClipsVideoQualityMetricsProcessor", "Failed to calculate video quality metrics", th4);
                    }
                }
                final boolean z = bVar.b;
                fVar.b();
                handler.post(new Runnable() { // from class: xsna.smf
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.vk.clips.upload.vk.impl.uploader.f fVar2 = com.vk.clips.upload.vk.impl.uploader.f.this;
                        fVar2.i.set(null);
                        fVar2.d.c(z);
                    }
                });
                return;
            case 4:
                nnz nnzVar = (nnz) obj2;
                nnzVar.f();
                oiz presenter = nnzVar.b.getPresenter();
                if (presenter != null) {
                    presenter.j();
                    return;
                }
                return;
            case 5:
                int i4 = PostFragment.S0;
                ((PostFragment) obj2).Bo().c().b(t4c0.a.C3717a.b);
                return;
            case 6:
                mhy.j(((SettingsDomainFragment) obj2).b0);
                return;
            case 7:
                qfk0 qfk0Var = (qfk0) obj2;
                Activity b = enj.b(qfk0Var.a);
                Object systemService = b != null ? b.getSystemService("input_method") : null;
                InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(qfk0Var.k, 0);
                    return;
                }
                return;
            case 8:
                ycq0 ycq0Var = (ycq0) obj2;
                try {
                    ycq0Var.i();
                    return;
                } finally {
                    ycq0Var.a();
                }
            case 9:
                TechStatsCollectorManager$runnable$1.run$lambda$0((TechStatsCollectorManager$runnable$1) obj2);
                return;
            case 10:
                ((TensorflowConfigurator) obj2).configureWithRetryInternal();
                return;
            case 11:
                ((VerificationController) obj2).dismissError();
                return;
            case 12:
                b33 b33Var = (b33) obj2;
                if (b33Var.isShowing()) {
                    b33Var.dismiss();
                    return;
                }
                return;
            case 13:
                ((com.vk.superapp.widget_settings.p004new.b) obj2).q();
                return;
            case 14:
                y1y0 y1y0Var = (y1y0) obj2;
                lk5 lk5Var = y1y0Var.k;
                if (lk5Var == null || (obj = lk5Var.b()) == null) {
                    obj = y1y0Var.b.getInput().getText().toString();
                }
                if (!y1y0Var.a().isEnabled().get()) {
                    y1y0Var.a().enable();
                }
                y1y0Var.a().w(y1y0Var.m.a(obj, y1y0Var.p));
                return;
            case 15:
                ((yads.fl2) obj2).f();
                return;
            case 16:
                yads.jm.c((yads.jm) obj2);
                return;
            default:
                ((C5307y0) obj2).o();
                return;
        }
    }

    public /* synthetic */ bi5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
