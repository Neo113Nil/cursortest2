package defpackage;

import android.content.Context;
import androidx.compose.foundation.text.selection.i;
import androidx.compose.foundation.text.selection.j;
import androidx.compose.runtime.internal.a;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class frb1 {
    public static final void a(f530 f530Var, ButtonSize buttonSize, sls slsVar, fid fidVar, int i) {
        f530 f530Var2;
        ButtonSize buttonSize2;
        f530 f530Var3;
        ButtonSize buttonSize3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2112810005);
        int i2 = i | 432 | (btsVar.e(slsVar) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                ButtonSize buttonSize4 = ButtonSize.L;
                f530Var3 = c530.a;
                buttonSize3 = buttonSize4;
            } else {
                btsVar.Y();
                f530Var3 = f530Var;
                buttonSize3 = buttonSize;
            }
            btsVar.u();
            f530 d = u3a1.d(an91.o(f530Var3.k(new pa31(x4c.E)), 0.0f, 8.0f, 8.0f, 8.0f, 1), "my_location_btn");
            z9d.a.getClass();
            y4b1.a(d, null, buttonSize3, slsVar, z9d.b, btsVar, 24960 | (i2 & 7168), 2);
            f530Var2 = f530Var3;
            buttonSize2 = buttonSize3;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
            buttonSize2 = buttonSize;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m050(f530Var2, buttonSize2, slsVar, i, 0);
        }
    }

    public static final void b(i iVar, a aVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-954926513);
        int i2 = (btsVar.e(iVar) ? 4 : 2) | i;
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            pob1.a(iVar, aVar, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new onc(iVar, aVar, i, i3);
        }
    }

    public static final void c(j jVar, a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2080741862);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(jVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(aVar) ? 32 : 16;
        }
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            pob1.b(jVar, aVar, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nnc(jVar, aVar, i, i3);
        }
    }

    public static buz0 d(Context context) {
        return new buz0(context);
    }
}
