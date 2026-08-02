package com.yandex.xplat.xflags;

import defpackage.b231;
import defpackage.ia6;
import defpackage.jl40;
import defpackage.ut5;

/* loaded from: classes2.dex */
public class b implements ut5 {
    @Override // defpackage.ut5
    public final b231 a(b231 b231Var, b231 b231Var2) {
        VariableType variableType = b231Var.a;
        VariableType variableType2 = b231Var2.a;
        if (variableType != variableType2) {
            throw new IncompatibleTypesError(variableType, variableType2);
        }
        if (variableType == VariableType.Boolean) {
            return new ia6(b231Var.c() == b231Var2.c());
        }
        if (variableType == VariableType.Double) {
            return new ia6(b231Var.d() == b231Var2.d());
        }
        if (variableType == VariableType.Int) {
            return new ia6(b231Var.e() == b231Var2.e());
        }
        return variableType == VariableType.Version ? a.b(b231Var, b231Var2, ComparisonResult.Eq) : new ia6(jl40.l(b231Var.f(), b231Var2.f()));
    }
}
