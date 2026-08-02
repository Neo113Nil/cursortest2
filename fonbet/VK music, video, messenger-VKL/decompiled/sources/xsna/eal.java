package xsna;

import ru.ok.gl.tf.factory.FaceMeshFactory;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.smoothing.DetectionSmoother;
import ru.ok.tensorflow.util.Function2;
import xsna.by1;
import xsna.ihz;
import xsna.vzc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class eal implements ihz.a, Function2, ghj0 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eal(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // ru.ok.tensorflow.util.Function2
    public Object apply(Object obj, Object obj2) {
        DetectionSmoother lambda$create$1;
        lambda$create$1 = ((FaceMeshFactory) this.b).lambda$create$1((io.reactivex.rxjava3.subjects.c) this.c, (Detection) obj, (Long) obj2);
        return lambda$create$1;
    }

    @Override // xsna.ghj0
    public boolean b() {
        vzc0.a aVar = (vzc0.a) this.b;
        gt5 gt5Var = (gt5) this.c;
        if (!aVar.r) {
            aVar.j();
            gt5Var.a = gt5.a(aVar.p, gt5Var.a);
            aVar.r = !aVar.i(aVar.o, r2 + gt5Var.b);
        }
        return aVar.r;
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).b0((androidx.media3.common.a) this.b, (n8l) this.c);
    }

    public /* synthetic */ eal(by1.a aVar, androidx.media3.common.a aVar2, n8l n8lVar) {
        this.b = aVar2;
        this.c = n8lVar;
    }
}
