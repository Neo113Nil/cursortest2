package xsna;

import com.vk.im.engine.models.ProfilesInfo;

/* compiled from: CommonEngineCommandsFactoryImpl.kt */
/* loaded from: classes2.dex */
public final class njg implements mjg {
    @Override // xsna.mjg
    public final e1w<d5w> a(i5w i5wVar) {
        return new h5w(i5wVar);
    }

    @Override // xsna.mjg
    public final e1w<dem> b(aem aemVar) {
        return new cem(aemVar.a, aemVar.b, aemVar.c, aemVar.d);
    }

    @Override // xsna.mjg
    public final e1w<m5w> c(g5w g5wVar) {
        return new f5w(g5wVar);
    }

    @Override // xsna.mjg
    public final e1w<ProfilesInfo> d(e1e0 e1e0Var) {
        return new d1e0(e1e0Var);
    }

    @Override // xsna.mjg
    public final e1w<s3q0> e() {
        return new c8w();
    }

    @Override // xsna.mjg
    public final e1w<Boolean> f() {
        return new b8w();
    }
}
