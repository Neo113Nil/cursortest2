package defpackage;

import android.view.View;
import kotlin.Triple;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class f85 implements vpr {
    public final /* synthetic */ int a;
    public static final f85 b = new f85(0);
    public static final f85 c = new f85(1);
    public static final f85 w = new f85(2);
    public static final f85 x = new f85(3);
    public static final f85 y = new f85(4);
    public static final f85 z = new f85(5);
    public static final f85 A = new f85(6);
    public static final f85 B = new f85(7);

    public /* synthetic */ f85(int i) {
        this.a = i;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                break;
            case 1:
                ((Boolean) obj).getClass();
                break;
            case 2:
                break;
            case 3:
                ioi0 ioi0Var = (ioi0) obj;
                int i2 = ioi0Var.b;
                View view = ioi0Var.a;
                if (i2 > 0) {
                    xw31.L(i2, view);
                }
                cma1.J(view);
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                Triple triple = (Triple) obj;
                m2e0 m2e0Var = (m2e0) triple.getFirst();
                rsn rsnVar = (rsn) triple.getSecond();
                boolean booleanValue = ((Boolean) triple.getThird()).booleanValue();
                jy11 jy11Var = (jy11) rsnVar.a;
                if (jy11Var != null) {
                    jy11Var.h();
                }
                jy11 jy11Var2 = (jy11) rsnVar.b;
                if (m2e0Var != null && booleanValue) {
                    jy11Var2.c(m2e0Var);
                    break;
                } else {
                    jy11Var2.h();
                    break;
                }
        }
        return zy11Var;
    }
}
