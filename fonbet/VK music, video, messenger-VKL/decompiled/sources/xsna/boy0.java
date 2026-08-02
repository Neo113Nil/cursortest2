package xsna;

import android.content.Intent;
import android.media.metrics.EditingEndedEvent;
import android.media.metrics.EditingSession;
import androidx.media3.transformer.ExportException;
import androidx.media3.transformer.MuxerWrapper;
import androidx.media3.transformer.b0;
import androidx.media3.transformer.o;
import androidx.media3.transformer.t;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.collect.ImmutableList;
import com.google.firebase.messaging.EnhancedIntentService;
import com.huawei.hms.iap.entity.ProductInfoResult;
import com.ironsource.Ya;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.webrtc.MutableMediaSettings;
import ru.ok.android.webrtc.PeerConnectionClient;
import ru.ok.android.webrtc.screenshare.ScreenCapturePermissionProvider;
import xsna.xhl0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class boy0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ boy0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    private final void a() {
        ((com.my.tracker.obfuscated.d) this.d).a((ProductInfoResult) this.e, (List) this.c);
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditingEndedEvent.Builder errorCode;
        EditingEndedEvent build;
        EditingSession editingSession;
        switch (this.b) {
            case 0:
                a();
                break;
            case 1:
                wke wkeVar = (wke) this.d;
                List<hfz> list = (List) this.c;
                gzs gzsVar = (gzs) this.e;
                androidx.recyclerview.widget.d<hfz> dVar = wkeVar.h;
                dVar.b(null, null);
                if (gzsVar != null) {
                    wkeVar.J0(list, new vx3(0, gzsVar));
                    break;
                } else {
                    dVar.b(list, null);
                    break;
                }
            case 2:
                ((EnhancedIntentService) this.d).lambda$processIntent$0((Intent) this.e, (TaskCompletionSource) this.c);
                break;
            case 3:
                ((vjv) this.d).z((f8f0) this.e, (IOException) this.c);
                break;
            case 4:
                ((PeerConnectionClient) this.d).a((MutableMediaSettings) this.e, (ScreenCapturePermissionProvider) this.c);
                break;
            case 5:
                ((k6o0) this.d).e.b(this.e, (xhl0.a) this.c);
                break;
            case 6:
                androidx.media3.transformer.b0 b0Var = (androidx.media3.transformer.b0) this.d;
                ImmutableList.a aVar = (ImmutableList.a) this.e;
                ExportException exportException = (ExportException) this.c;
                b0.b bVar = b0Var.e;
                com.google.common.collect.g g = aVar.g();
                androidx.media3.transformer.d dVar2 = b0Var.d;
                String str = dVar2.b;
                String str2 = dVar2.c;
                androidx.media3.transformer.a0 a0Var = androidx.media3.transformer.a0.this;
                t.a aVar2 = a0Var.s;
                if (exportException.errorCode == 7003) {
                    int i = a0Var.z;
                    if ((i == 5 || i == 6) || a0Var.e()) {
                        a0Var.v = null;
                        a0Var.u = null;
                        aVar2.b();
                        aVar2.p = 6;
                        a0Var.z = 0;
                        androidx.media3.transformer.f fVar = a0Var.w;
                        fVar.getClass();
                        String str3 = a0Var.y;
                        str3.getClass();
                        a0Var.h(fVar, new MuxerWrapper(str3, a0Var.m, a0Var.r, 0, null), a0Var.r, 0L);
                        break;
                    }
                }
                aVar2.a.e(g);
                if (str != null) {
                    aVar2.g = str;
                }
                if (str2 != null) {
                    aVar2.n = str2;
                }
                aVar2.q = exportException;
                a0Var.f();
                androidx.media3.transformer.t a = aVar2.a();
                a0Var.i.f(-1, new n0p(a0Var, a, exportException));
                if (a0Var.b()) {
                    i2e0 i2e0Var = new i2e0();
                    int i2 = a0Var.d(i2e0Var) == 2 ? i2e0Var.a : -1;
                    androidx.media3.transformer.o oVar = a0Var.A;
                    oVar.getClass();
                    boolean e = a0Var.e();
                    o.b bVar2 = oVar.e;
                    errorCode = oVar.a(3).setErrorCode(androidx.media3.transformer.o.f.get(exportException.errorCode, 1));
                    if (i2 != -1) {
                        errorCode.setFinalProgressPercent(i2);
                    }
                    oVar.f(errorCode, a, e);
                    ArrayList c = androidx.media3.transformer.o.c(a.q);
                    for (int i3 = 0; i3 < c.size(); i3++) {
                        errorCode.addInputMediaItemInfo(e2p.a(c.get(i3)));
                    }
                    errorCode.setOutputMediaItemInfo(androidx.media3.transformer.o.d(a));
                    build = errorCode.build();
                    o.a aVar3 = (o.a) bVar2;
                    if (!aVar3.c && (editingSession = aVar3.b) != null) {
                        editingSession.reportEditingEndedEvent(build);
                        aVar3.c = true;
                    }
                    try {
                        ar.d(bVar2);
                    } catch (Exception e2) {
                        ahn.o("EditingMetricsCollector", "error while closing the metrics reporter", e2);
                    }
                }
                a0Var.z = 0;
                a0Var.u = null;
                break;
            default:
                Ya.a((Ya) this.d, (LevelPlayAdError) this.e, (LevelPlayAdInfo) this.c);
                break;
        }
    }

    public /* synthetic */ boy0(wke wkeVar, List list, gzs gzsVar) {
        this.b = 1;
        this.d = wkeVar;
        this.c = list;
        this.e = gzsVar;
    }
}
