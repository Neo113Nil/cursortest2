package xsna;

import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import xsna.mjf;
import xsna.pvj;
import xsna.ugf;

/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: classes17.dex */
public final class ybf extends kotlin.coroutines.a implements pvj {
    public final /* synthetic */ wcf b;
    public final /* synthetic */ mjf.a.o c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybf(wcf wcfVar, mjf.a.o oVar) {
        super(pvj.a.b);
        this.b = wcfVar;
        this.c = oVar;
    }

    @Override // xsna.pvj
    public final void handleException(kotlin.coroutines.d dVar, Throwable th) {
        nn50<ClipsUploadState, Object, mjf, ugf, qef> nn50Var = this.b.g;
        mjf.a.o oVar = this.c;
        nn50Var.e(new ugf.f.e(oVar.b, oVar.c));
        if (h03.a(th)) {
            return;
        }
        com.vk.metrics.eventtracking.b.a.a(th);
    }
}
