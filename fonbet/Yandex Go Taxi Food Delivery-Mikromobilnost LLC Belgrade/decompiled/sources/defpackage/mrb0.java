package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.jrb0;
import io.scer.pdfx.PdfRendererException;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class mrb0 implements srb0 {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ ce5 b;

    public mrb0(HashMap hashMap, ce5 ce5Var) {
        this.a = hashMap;
        this.b = ce5Var;
    }

    @Override // defpackage.srb0
    public final void c(PdfRendererException pdfRendererException) {
        HashMap a = jrb0.a(pdfRendererException);
        HashMap hashMap = this.a;
        hashMap.put("error", a);
        this.b.a(hashMap);
    }

    @Override // defpackage.srb0
    public final void success(Object obj) {
        HashMap hashMap = this.a;
        hashMap.put(TarifficatorScenarioActivity.RESULT_KEY, (jrb0.f) obj);
        this.b.a(hashMap);
    }
}
