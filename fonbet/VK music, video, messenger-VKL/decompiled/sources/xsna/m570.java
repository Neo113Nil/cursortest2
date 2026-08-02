package xsna;

import com.vk.log.L;
import com.vk.ml.MLFeatures;
import java.util.Iterator;
import java.util.List;

/* compiled from: NoiseSuppressorDependencyImpl.kt */
/* loaded from: classes7.dex */
public final class m570 implements l570 {
    public final krw0 a;
    public final ufm0 b;
    public final i8c0 c;
    public boolean d;

    public m570(krw0 krw0Var, ufm0 ufm0Var, i8c0 i8c0Var) {
        List<MLFeatures.MLFeature> list = o570.a;
        this.a = krw0Var;
        this.b = ufm0Var;
        this.c = i8c0Var;
    }

    @Override // xsna.l570
    public final boolean a() {
        try {
            List<MLFeatures.MLFeature> list = o570.a;
            Iterator it = o570.a().iterator();
            int i = 0;
            while (true) {
                int i2 = 1;
                if (!it.hasNext()) {
                    break;
                }
                MLFeatures.MLFeature mLFeature = (MLFeatures.MLFeature) it.next();
                com.vk.ml.b bVar = MLFeatures.a;
                if (!bVar.f() || !com.vk.ml.b.g(bVar.d(mLFeature)) || !bVar.h(mLFeature)) {
                    i2 = 0;
                }
                i += i2;
            }
            return i > 0;
        } catch (Exception e) {
            L.i(e);
            return false;
        }
    }

    @Override // xsna.l570
    public final void b() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.a();
    }
}
