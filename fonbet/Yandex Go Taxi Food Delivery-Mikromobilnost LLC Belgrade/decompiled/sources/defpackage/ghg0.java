package defpackage;

import com.yandex.go.quark.api.router.QuarkDynamicFeatureRouter$Payload$DisplayMode;
import com.yandex.go.quark.dynamic.h;
import com.yandex.go.quark.impl.QuarkDynamicFeatureApi;

/* loaded from: classes8.dex */
public final class ghg0 implements t7n {
    public final /* synthetic */ hhg0 a;
    public final /* synthetic */ fhg0 b;
    public final /* synthetic */ xgg0 c;

    public ghg0(hhg0 hhg0Var, fhg0 fhg0Var, xgg0 xgg0Var) {
        this.a = hhg0Var;
        this.b = fhg0Var;
        this.c = xgg0Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.r(new qu(9));
    }

    @Override // defpackage.t7n
    public final void u() {
        this.a.r(new qu(9));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if (r6 == null) goto L17;
     */
    @Override // defpackage.t7n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(h7n h7nVar) {
        wgg0 e;
        wgg0 wgg0Var;
        h hVar;
        QuarkDynamicFeatureApi quarkDynamicFeatureApi = (QuarkDynamicFeatureApi) h7nVar;
        this.a.F.b();
        zgg0 zgg0Var = this.a.E;
        fhg0 fhg0Var = this.b;
        boolean z = fhg0Var.a;
        QuarkDynamicFeatureRouter$Payload$DisplayMode quarkDynamicFeatureRouter$Payload$DisplayMode = fhg0Var.c;
        xgg0 xgg0Var = this.c;
        zgg0Var.getClass();
        xgg0 xgg0Var2 = xgg0.c;
        if (jl40.l(xgg0Var, xgg0Var2)) {
            ygg0 ygg0Var = new ygg0(quarkDynamicFeatureRouter$Payload$DisplayMode);
            wgg0 wgg0Var2 = null;
            if (!z) {
                kjz kjzVar = zgg0Var.b;
                if (kjzVar != null) {
                    if (!((ygg0) kjzVar.b).equals(ygg0Var)) {
                        kjzVar = null;
                    }
                    if (kjzVar != null) {
                        e = (wgg0) kjzVar.c;
                    }
                }
                e = null;
            }
            synchronized (zgg0Var) {
                if (!z) {
                    try {
                        kjz kjzVar2 = zgg0Var.b;
                        if (kjzVar2 != null) {
                            if (!((ygg0) kjzVar2.b).equals(ygg0Var)) {
                                kjzVar2 = null;
                            }
                            if (kjzVar2 != null) {
                                wgg0Var2 = (wgg0) kjzVar2.c;
                            }
                        }
                        if (wgg0Var2 != null) {
                            e = wgg0Var2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                kjz kjzVar3 = zgg0Var.b;
                if (kjzVar3 != null && (wgg0Var = (wgg0) kjzVar3.c) != null && (hVar = (h) ((xvf0) ((e6g) wgg0Var).d).get()) != null) {
                    hVar.f();
                }
                e = quarkDynamicFeatureApi.e((h6r) zgg0Var.a.get(), xgg0Var2, new yig0(false, quarkDynamicFeatureRouter$Payload$DisplayMode));
                zgg0Var.b = new kjz(29, ygg0Var, e);
            }
        } else {
            e = quarkDynamicFeatureApi.e((h6r) zgg0Var.a.get(), xgg0Var, new yig0(true, quarkDynamicFeatureRouter$Payload$DisplayMode));
        }
        this.a.r(new ate0(2, e));
    }
}
