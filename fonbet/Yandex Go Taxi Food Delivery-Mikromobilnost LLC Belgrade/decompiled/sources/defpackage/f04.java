package defpackage;

import com.ybsdk.feature.autotopup.internal.network.dto.regular.a;

/* loaded from: classes3.dex */
public final class f04 implements v7p {
    public final /* synthetic */ int a;
    public final gwf b;
    public final wri0 c;

    public /* synthetic */ f04(gwf gwfVar, wri0 wri0Var, int i) {
        this.a = i;
        this.b = gwfVar;
        this.c = wri0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        wri0 wri0Var = this.c;
        gwf gwfVar = this.b;
        switch (i) {
            case 0:
                return new e04((w530) gwfVar.get(), (gdb0) wri0Var.get());
            default:
                return new a((w530) gwfVar.get(), (gdb0) wri0Var.get());
        }
    }
}
