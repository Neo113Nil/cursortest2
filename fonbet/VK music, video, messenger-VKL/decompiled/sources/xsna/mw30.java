package xsna;

import android.hardware.camera2.CameraDevice;
import com.vk.dto.common.Source;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.gl.tf.Tensorflow;
import xsna.pdg0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class mw30 implements io.reactivex.rxjava3.core.s, iy3 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mw30(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // xsna.iy3
    /* renamed from: apply */
    public ugz mo416apply(Object obj) {
        ugz f;
        f = super/*xsna.xon0*/.f((CameraDevice) this.c, (zsi0) this.d);
        return f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        rw30 rw30Var = (rw30) this.b;
        sx30 sx30Var = (sx30) this.d;
        pdg0 n = rw30Var.i.n(this.c, new sx30(sx30Var.b, sx30Var.c, Source.CACHE, sx30Var.e, sx30Var.f, sx30Var.g, sx30Var.h, Tensorflow.FRAME_HEIGHT));
        if (n instanceof pdg0.b) {
            rVar.onNext((hy30) ((pdg0.b) n).a);
            rVar.onComplete();
        } else {
            if (!(n instanceof pdg0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            rVar.onError(((pdg0.a) n).a.b);
        }
    }
}
