package androidx.compose.foundation.interaction;

import androidx.compose.runtime.f;
import defpackage.ay40;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.h8w;
import defpackage.o430;
import defpackage.oz40;
import defpackage.wls;
import defpackage.zpn;
import defpackage.zx40;

/* loaded from: classes10.dex */
public abstract class a {
    public static final oz40 a(ay40 ay40Var, fid fidVar) {
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Q = f.j(Boolean.FALSE);
            btsVar.o0(Q);
        }
        oz40 oz40Var = (oz40) Q;
        boolean k = btsVar.k(ay40Var);
        Object Q2 = btsVar.Q();
        if (k || Q2 == o430Var) {
            Q2 = new DragInteractionKt$collectIsDraggedAsState$1$1(ay40Var, oz40Var, null);
            btsVar.o0(Q2);
        }
        zpn.e(btsVar, (wls) Q2, ay40Var);
        return oz40Var;
    }

    public static final oz40 b(h8w h8wVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Q = f.j(Boolean.FALSE);
            btsVar.o0(Q);
        }
        oz40 oz40Var = (oz40) Q;
        boolean z = (((i & 14) ^ 6) > 4 && btsVar.k(h8wVar)) || (i & 6) == 4;
        Object Q2 = btsVar.Q();
        if (z || Q2 == o430Var) {
            Q2 = new FocusInteractionKt$collectIsFocusedAsState$1$1(h8wVar, oz40Var, null);
            btsVar.o0(Q2);
        }
        zpn.e(btsVar, (wls) Q2, h8wVar);
        return oz40Var;
    }

    public static final oz40 c(zx40 zx40Var, fid fidVar) {
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Q = f.j(Boolean.FALSE);
            btsVar.o0(Q);
        }
        oz40 oz40Var = (oz40) Q;
        Object Q2 = btsVar.Q();
        if (Q2 == o430Var) {
            Q2 = new PressInteractionKt$collectIsPressedAsState$1$1(zx40Var, oz40Var, null);
            btsVar.o0(Q2);
        }
        zpn.e(btsVar, (wls) Q2, zx40Var);
        return oz40Var;
    }
}
