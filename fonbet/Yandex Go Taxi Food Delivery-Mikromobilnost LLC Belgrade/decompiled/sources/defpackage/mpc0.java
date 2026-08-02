package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import com.yandex.plus.core.graphql.type.COMMON_PREDICATE_TYPE;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class mpc0 implements b70 {
    public static final List a = scc.g("type", "argCheckingPredicate", "booleanLiteralPredicate", "notPredicate", "unifyingPredicate", "comparisonPredicate", "containsPredicate", "inSetPredicate");

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        return new defpackage.fpc0(r2, r3, r4, r5, r6, r7, r8, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static fpc0 c(xdx xdxVar, c cVar) {
        Object obj;
        COMMON_PREDICATE_TYPE common_predicate_type;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        COMMON_PREDICATE_TYPE common_predicate_type2 = null;
        yoc0 yoc0Var = null;
        zoc0 zoc0Var = null;
        dpc0 dpc0Var = null;
        epc0 epc0Var = null;
        apc0 apc0Var = null;
        bpc0 bpc0Var = null;
        cpc0 cpc0Var = null;
        while (true) {
            switch (xdxVar.h2(a)) {
                case 0:
                    String nextString = xdxVar.nextString();
                    COMMON_PREDICATE_TYPE.Companion.getClass();
                    COMMON_PREDICATE_TYPE[] values = COMMON_PREDICATE_TYPE.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            common_predicate_type = values[i];
                            if (!jl40.l(common_predicate_type.getRawValue(), nextString)) {
                                i++;
                            }
                        } else {
                            common_predicate_type = null;
                        }
                    }
                    if (common_predicate_type != null) {
                        common_predicate_type2 = common_predicate_type;
                        break;
                    } else {
                        common_predicate_type2 = COMMON_PREDICATE_TYPE.UNKNOWN__;
                        break;
                    }
                case 1:
                    ep60 a2 = l80.a(gpc0.a);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj2 = null;
                    } else {
                        obj2 = a2.b(xdxVar, cVar);
                    }
                    yoc0Var = (yoc0) obj2;
                    break;
                case 2:
                    ep60 a3 = l80.a(hpc0.a);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj3 = null;
                    } else {
                        obj3 = a3.b(xdxVar, cVar);
                    }
                    zoc0Var = (zoc0) obj3;
                    break;
                case 3:
                    ep60 a4 = l80.a(lpc0.a);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj4 = null;
                    } else {
                        obj4 = a4.b(xdxVar, cVar);
                    }
                    dpc0Var = (dpc0) obj4;
                    break;
                case 4:
                    ep60 a5 = l80.a(npc0.a);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj5 = null;
                    } else {
                        obj5 = a5.b(xdxVar, cVar);
                    }
                    epc0Var = (epc0) obj5;
                    break;
                case 5:
                    ep60 a6 = l80.a(ipc0.a);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj6 = null;
                    } else {
                        obj6 = a6.b(xdxVar, cVar);
                    }
                    apc0Var = (apc0) obj6;
                    break;
                case 6:
                    ep60 a7 = l80.a(jpc0.a);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj7 = null;
                    } else {
                        obj7 = a7.b(xdxVar, cVar);
                    }
                    bpc0Var = (bpc0) obj7;
                    break;
                case 7:
                    ep60 a8 = l80.a(kpc0.a);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj = null;
                    } else {
                        obj = a8.b(xdxVar, cVar);
                    }
                    cpc0Var = (cpc0) obj;
                    break;
            }
        }
    }
}
