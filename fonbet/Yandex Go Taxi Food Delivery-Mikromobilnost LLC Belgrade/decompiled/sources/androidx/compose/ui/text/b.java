package androidx.compose.ui.text;

import defpackage.bmt0;
import defpackage.e731;
import defpackage.gc90;
import defpackage.ik2;
import defpackage.iky;
import defpackage.jky;
import defpackage.jl40;
import defpackage.sg21;
import defpackage.t2m0;
import defpackage.tig0;
import defpackage.tls;
import defpackage.w511;
import defpackage.wsu0;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(0);
        gc90 gc90Var = null;
        r0 = null;
        iky ikyVar = null;
        r0 = null;
        jky jkyVar = null;
        r0 = null;
        sg21 sg21Var = null;
        r0 = null;
        e731 e731Var = null;
        r0 = null;
        bmt0 bmt0Var = null;
        gc90Var = null;
        AnnotationType annotationType = obj2 != null ? (AnnotationType) obj2 : null;
        Object obj3 = list.get(2);
        int intValue = (obj3 != null ? (Integer) obj3 : null).intValue();
        Object obj4 = list.get(3);
        int intValue2 = (obj4 != null ? (Integer) obj4 : null).intValue();
        Object obj5 = list.get(4);
        String str = obj5 != null ? (String) obj5 : null;
        switch (c.a[annotationType.ordinal()]) {
            case 1:
                Object obj6 = list.get(1);
                tig0 tig0Var = t2m0.g;
                if (!jl40.l(obj6, Boolean.FALSE) && obj6 != null) {
                    gc90Var = (gc90) ((tls) tig0Var.b).invoke(obj6);
                }
                return new ik2(intValue, intValue2, gc90Var, str);
            case 2:
                Object obj7 = list.get(1);
                tig0 tig0Var2 = t2m0.h;
                if (!jl40.l(obj7, Boolean.FALSE) && obj7 != null) {
                    bmt0Var = (bmt0) ((tls) tig0Var2.b).invoke(obj7);
                }
                return new ik2(intValue, intValue2, bmt0Var, str);
            case 3:
                Object obj8 = list.get(1);
                tig0 tig0Var3 = t2m0.c;
                if (!jl40.l(obj8, Boolean.FALSE) && obj8 != null) {
                    e731Var = (e731) ((tls) tig0Var3.b).invoke(obj8);
                }
                return new ik2(intValue, intValue2, e731Var, str);
            case 4:
                Object obj9 = list.get(1);
                tig0 tig0Var4 = t2m0.d;
                if (!jl40.l(obj9, Boolean.FALSE) && obj9 != null) {
                    sg21Var = (sg21) ((tls) tig0Var4.b).invoke(obj9);
                }
                return new ik2(intValue, intValue2, sg21Var, str);
            case 5:
                Object obj10 = list.get(1);
                tig0 tig0Var5 = t2m0.e;
                if (!jl40.l(obj10, Boolean.FALSE) && obj10 != null) {
                    jkyVar = (jky) ((tls) tig0Var5.b).invoke(obj10);
                }
                return new ik2(intValue, intValue2, jkyVar, str);
            case 6:
                Object obj11 = list.get(1);
                tig0 tig0Var6 = t2m0.f;
                if (!jl40.l(obj11, Boolean.FALSE) && obj11 != null) {
                    ikyVar = (iky) ((tls) tig0Var6.b).invoke(obj11);
                }
                return new ik2(intValue, intValue2, ikyVar, str);
            case 7:
                Object obj12 = list.get(1);
                return new ik2(intValue, intValue2, wsu0.a(obj12 != null ? (String) obj12 : null), str);
            default:
                w511.b();
                return null;
        }
    }
}
