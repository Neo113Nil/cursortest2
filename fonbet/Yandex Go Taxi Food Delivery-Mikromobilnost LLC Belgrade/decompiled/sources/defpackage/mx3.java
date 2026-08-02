package defpackage;

import com.ybsdk.feature.autotopup.internal.domain.b;
import com.ybsdk.feature.autotopup.internal.domain.d;

/* loaded from: classes3.dex */
public final class mx3 implements v7p {
    public final /* synthetic */ int a;
    public final k4 b;

    public /* synthetic */ mx3(k4 k4Var, int i) {
        this.a = i;
        this.b = k4Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        k4 k4Var = this.b;
        switch (i) {
            case 0:
                return new b((com.ybsdk.feature.autotopup.internal.data.b) k4Var.get());
            default:
                return new d((com.ybsdk.feature.autotopup.internal.data.b) k4Var.get());
        }
    }
}
