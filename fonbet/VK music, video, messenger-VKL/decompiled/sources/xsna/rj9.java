package xsna;

import com.vk.ml.api.tf.TensorflowFacade;
import ru.ok.gl.tf.TensorflowFaceLandmarksType;
import ru.ok.gl.tf.TensorflowSegmentationType;

/* compiled from: CameraOkEffectsAccessController.kt */
/* loaded from: classes16.dex */
public final class rj9 implements kx70 {
    public final dm9 a;
    public final jj9 b;

    public rj9(dm9 dm9Var) {
        this.a = dm9Var;
        this.b = new jj9(dm9Var);
    }

    @Override // xsna.kx70
    public final TensorflowFacade.OkEngineConfig a() {
        this.a.a.getClass();
        return xkg.b.a();
    }

    @Override // xsna.kx70
    public final TensorflowFaceLandmarksType b() {
        this.a.a.getClass();
        return xkg.b.e();
    }

    @Override // xsna.kx70
    public final TensorflowFacade.a c() {
        this.a.a.getClass();
        return xkg.b.c();
    }

    @Override // xsna.kx70
    public final boolean d() {
        return this.a.f().getExperiments().g();
    }

    @Override // xsna.kx70
    public final y930 e() {
        return this.b;
    }

    @Override // xsna.kx70
    public final TensorflowSegmentationType f() {
        this.a.a.getClass();
        return xkg.b.b();
    }
}
