package defpackage;

import android.content.Context;
import com.yandex.messaging.sdk.a;
import com.yx360.design.compose.atoms.DsButton$Style;

/* loaded from: classes11.dex */
public abstract class leb1 {
    public static final void a(int i, fid fidVar, sls slsVar, sls slsVar2, f530 f530Var) {
        int i2;
        sls slsVar3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1972777158);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(slsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(slsVar2) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i3 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
            slsVar3 = slsVar2;
        } else {
            String e = ohb1.e(btsVar, oyh0.folders_discard_create_dialog_title);
            String e2 = ohb1.e(btsVar, oyh0.folders_discard_create_dialog_description);
            vnm vnmVar = new vnm(slsVar2, DsButton$Style.Neutral, ohb1.e(btsVar, oyh0.folders_discard_create_dialog_confirm));
            String e3 = ohb1.e(btsVar, oyh0.folders_discard_create_dialog_cancel);
            c530 c530Var = c530.a;
            slsVar3 = slsVar2;
            qn91.a(slsVar3, e, vnmVar, c530Var, null, e2, new vnm(slsVar, DsButton$Style.Brand, e3), btsVar, ((i3 >> 3) & 14) | ((i3 << 3) & 7168), 144);
            f530Var = c530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0(slsVar, slsVar3, f530Var, i);
        }
    }

    public static p520 b(Context context) {
        int i = g720.c;
        ((zzf) new a(context).b()).e.get();
        return new p520("ru.yandex.taxi", "marketplace");
    }

    public static final fiy c(k911 k911Var) {
        if (k911Var instanceof i911) {
            return new diy(((i911) k911Var).a);
        }
        if (k911Var instanceof h911) {
            return new diy(((h911) k911Var).a);
        }
        if (jl40.l(k911Var, f911.a) || jl40.l(k911Var, g911.a)) {
            return zhy.a;
        }
        if (jl40.l(k911Var, j911.a)) {
            return biy.a;
        }
        w511.b();
        return null;
    }
}
