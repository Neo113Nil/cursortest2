package defpackage;

import com.ybsdk.feature.about.internal.presentation.AboutComposeFragment;
import com.ybsdk.feature.about.internal.presentation.AboutFragment;

/* loaded from: classes5.dex */
public final class a5 implements v7p {
    public final /* synthetic */ int a;
    public final t4 b;

    public /* synthetic */ a5(t4 t4Var, int i) {
        this.a = i;
        this.b = t4Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        t4 t4Var = this.b;
        switch (i) {
            case 0:
                return new AboutComposeFragment(t4Var);
            default:
                return new AboutFragment(t4Var);
        }
    }
}
