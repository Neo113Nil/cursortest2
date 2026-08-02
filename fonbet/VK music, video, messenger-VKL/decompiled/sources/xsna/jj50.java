package xsna;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import xsna.ao50;
import xsna.kj50;

/* compiled from: MviAbstractComposeView.kt */
/* loaded from: classes3.dex */
public abstract class jj50<VS extends ao50, A extends kj50> implements gm50 {
    public final f5z b;
    public final Context c;

    public jj50(Context context, f5z f5zVar) {
        this.b = f5zVar;
        this.c = context;
    }

    public abstract void b(VS vs, izs<? super A, s3q0> izsVar, androidx.compose.runtime.a aVar, int i);

    public abstract ComposeView c();

    public final wh50 d(fm50 fm50Var, n0u0[] n0u0VarArr, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1142772936, i, -1, "com.vk.mvi.compose.MviAbstractComposeView.renderWith (MviAbstractComposeView.kt:41)");
        }
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (x == c0012a) {
            x = androidx.compose.runtime.k.b(fm50Var);
            aVar.R(x);
        }
        wh50 wh50Var = (wh50) x;
        s3q0 s3q0Var = s3q0.a;
        boolean y = aVar.y(n0u0VarArr) | aVar.y(this);
        Object x2 = aVar.x();
        if (y || x2 == c0012a) {
            x2 = new ij50(n0u0VarArr, this, wh50Var, null);
            aVar.R(x2);
        }
        bap.g(s3q0Var, (wzs) x2, aVar, 6);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return wh50Var;
    }

    public final View getView() {
        return c();
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b;
    }
}
