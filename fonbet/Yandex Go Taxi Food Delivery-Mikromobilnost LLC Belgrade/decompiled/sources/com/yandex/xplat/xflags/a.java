package com.yandex.xplat.xflags;

import defpackage.b231;
import defpackage.b6w;
import defpackage.bg1;
import defpackage.bvu0;
import defpackage.ia6;
import defpackage.ja31;
import defpackage.y6i0;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public abstract class a {
    public static final ia6 a(b231 b231Var, b231 b231Var2, ComparisonResult comparisonResult) {
        VariableType variableType = b231Var.a;
        VariableType variableType2 = b231Var2.a;
        if (variableType != variableType2) {
            throw new IncompatibleTypesError(variableType, variableType2);
        }
        if (variableType == VariableType.Double) {
            double d = b231Var.d();
            double d2 = b231Var2.d();
            return new ia6(((d > d2 ? 1 : (d == d2 ? 0 : -1)) == 0 ? ComparisonResult.Eq : (d > d2 ? 1 : (d == d2 ? 0 : -1)) < 0 ? ComparisonResult.Less : ComparisonResult.Greater) == comparisonResult);
        }
        if (variableType == VariableType.Int) {
            int e = b231Var.e();
            int e2 = b231Var2.e();
            return new ia6((e == e2 ? ComparisonResult.Eq : e < e2 ? ComparisonResult.Less : ComparisonResult.Greater) == comparisonResult);
        }
        if (variableType == VariableType.Version) {
            return b(b231Var, b231Var2, comparisonResult);
        }
        throw new IncompatibleTypesError(variableType, variableType2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b3, code lost:
    
        if (r7 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b5, code lost:
    
        r0 = com.yandex.xplat.xflags.ComparisonResult.IncorrectFirstArg;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
    
        r0 = com.yandex.xplat.xflags.ComparisonResult.IncorrectSecondArg;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ia6 b(b231 b231Var, b231 b231Var2, ComparisonResult comparisonResult) {
        ComparisonResult comparisonResult2;
        VariableType variableType = b231Var.a;
        VariableType variableType2 = VariableType.Version;
        ja31 ja31Var = variableType == variableType2 ? (ja31) b231Var : null;
        VariableCastError variableCastError = new VariableCastError(b231Var, variableType2);
        if (ja31Var == null) {
            throw variableCastError;
        }
        bg1 bg1Var = ja31Var.b;
        ja31 ja31Var2 = b231Var2.a == variableType2 ? (ja31) b231Var2 : null;
        VariableCastError variableCastError2 = new VariableCastError(b231Var2, variableType2);
        if (ja31Var2 == null) {
            throw variableCastError2;
        }
        bg1 bg1Var2 = ja31Var2.b;
        if (bg1Var.b.equals(bg1Var2.b)) {
            comparisonResult2 = ComparisonResult.Eq;
        } else {
            ArrayList e = com.yandex.xplat.common.c.e(bg1Var.b, Extension.DOT_CHAR);
            ArrayList e2 = com.yandex.xplat.common.c.e(bg1Var2.b, Extension.DOT_CHAR);
            while (e.size() < e2.size()) {
                e.add("0");
            }
            while (e2.size() < e.size()) {
                e2.add("0");
            }
            b6w m = y6i0.m(y6i0.n(0, e.size()), 1);
            int i = m.a;
            int i2 = m.b;
            int i3 = m.c;
            if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
                while (true) {
                    Integer l = bvu0.l(10, (String) e.get(i));
                    Integer l2 = bvu0.l(10, (String) e2.get(i));
                    if (l != null && l2 != null) {
                        if (l.intValue() <= l2.intValue()) {
                            if (l.intValue() >= l2.intValue()) {
                                if (i == i2) {
                                    break;
                                }
                                i += i3;
                            } else {
                                comparisonResult2 = ComparisonResult.Less;
                                break;
                            }
                        } else {
                            comparisonResult2 = ComparisonResult.Greater;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            comparisonResult2 = ComparisonResult.Eq;
        }
        ComparisonResult comparisonResult3 = ComparisonResult.IncorrectFirstArg;
        if (comparisonResult2 != comparisonResult3 && comparisonResult2 != ComparisonResult.IncorrectSecondArg) {
            return new ia6(comparisonResult2 == comparisonResult);
        }
        if (comparisonResult2 != comparisonResult3) {
            b231Var = b231Var2;
        }
        throw new IncorrectFormatError(b231Var);
    }
}
