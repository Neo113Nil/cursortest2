package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.platform.m;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.input.utils.a;

/* loaded from: classes12.dex */
public abstract class i6b1 {
    public static au2 a;

    public static final void a(int i, fid fidVar, sls slsVar, f530 f530Var) {
        sls slsVar2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2024582196);
        int i2 = (btsVar.e(slsVar) ? 32 : 16) | i;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            ButtonSize buttonSize = ButtonSize.M;
            f3d.a.getClass();
            slsVar2 = slsVar;
            f530Var2 = f530Var;
            vpa1.a(f530Var2, false, buttonSize, slsVar2, f3d.b, btsVar, 24966 | ((i2 << 6) & 7168), 2);
        } else {
            slsVar2 = slsVar;
            f530Var2 = f530Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vl5(f530Var2, slsVar2, i, 0);
        }
    }

    public static f530 b(f530 f530Var) {
        f530 a2;
        a2 = b.a(f530Var, m.a(), new a());
        return a2;
    }
}
