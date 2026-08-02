package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor;
import defpackage.c48;
import defpackage.l0r0;
import defpackage.q6x0;
import defpackage.rdv;
import defpackage.vjx;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final /* synthetic */ class b implements PreviewProcessor.OnCaptureResultCallback, c48 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(h hVar, l0r0 l0r0Var, int i, q6x0 q6x0Var) {
        this.a = l0r0Var;
        this.b = q6x0Var;
    }

    @Override // defpackage.c48
    public void a(rdv rdvVar, TotalCaptureResult totalCaptureResult, int i) {
        ((PreviewProcessor) this.a).lambda$start$0((PreviewProcessor.OnCaptureResultCallback) this.b, rdvVar, totalCaptureResult, i);
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor.OnCaptureResultCallback
    public void onCaptureResult(long j, List list) {
        ((l0r0) this.a).b(new vjx(j, (q6x0) this.b, (Map) h.t(list)));
    }

    public /* synthetic */ b(PreviewProcessor previewProcessor, PreviewProcessor.OnCaptureResultCallback onCaptureResultCallback) {
        this.a = previewProcessor;
        this.b = onCaptureResultCallback;
    }
}
