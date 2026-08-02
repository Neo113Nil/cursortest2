package xsna;

import com.vk.biometrics.lock.api.di.BiometricsLockComponent;
import com.vk.donut.privacy.api.di.DonutPrivacyComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class xb8 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ xb8(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (DonutPrivacyComponent) this.c.a(fpf0.a(DonutPrivacyComponent.class));
            default:
                return (BiometricsLockComponent) this.c.a(fpf0.a(BiometricsLockComponent.class));
        }
    }
}
