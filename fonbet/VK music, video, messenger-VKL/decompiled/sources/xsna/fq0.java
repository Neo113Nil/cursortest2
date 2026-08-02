package xsna;

import com.vk.ml.MLFeatures;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.gl.tf.TensorflowModel;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class fq0 implements izs {
    public final /* synthetic */ aad b;
    public final /* synthetic */ TensorflowModel[] c;
    public final /* synthetic */ hq0 d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ vw70 f;

    public /* synthetic */ fq0(aad aadVar, TensorflowModel[] tensorflowModelArr, hq0 hq0Var, ArrayList arrayList, vw70 vw70Var) {
        this.b = aadVar;
        this.c = tensorflowModelArr;
        this.d = hq0Var;
        this.e = arrayList;
        this.f = vw70Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        hq0 hq0Var = this.d;
        xb00 xb00Var = hq0Var.a;
        com.vk.ml.f fVar = (com.vk.ml.f) obj;
        boolean z = fVar instanceof com.vk.ml.g;
        aad aadVar = this.b;
        TensorflowModel[] tensorflowModelArr = this.c;
        if (z) {
            aadVar.invoke(new IllegalStateException("Download failed"), tensorflowModelArr);
        } else if ((fVar instanceof com.vk.ml.h) || (fVar instanceof com.vk.ml.e)) {
            if (!xb00Var.a().c().c(fVar.a())) {
                aadVar.invoke(new IllegalStateException("Something's going wrong: Downloaded model is not ready"), tensorflowModelArr);
                return s3q0.a;
            }
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!xb00Var.a().c().c((MLFeatures.MLFeature) it.next())) {
                        break;
                    }
                }
            }
            this.f.invoke(tensorflowModelArr);
        }
        io.reactivex.rxjava3.disposables.c cVar = hq0Var.b;
        if (cVar != null) {
            cVar.dispose();
        }
        return s3q0.a;
    }
}
