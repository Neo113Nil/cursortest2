package defpackage;

import com.yandex.xplat.xflags.IncompatibleTypesError;
import com.yandex.xplat.xflags.VariableType;

/* loaded from: classes2.dex */
public class b72 implements ut5 {
    @Override // defpackage.ut5
    public final b231 a(b231 b231Var, b231 b231Var2) {
        VariableType variableType = b231Var2.a;
        VariableType variableType2 = b231Var.a;
        VariableType variableType3 = VariableType.Boolean;
        if (variableType2 == variableType3 && variableType == variableType3) {
            return new ia6(b231Var.c() && b231Var2.c());
        }
        if (variableType2 != variableType3) {
            variableType = variableType2;
        }
        throw new IncompatibleTypesError(variableType, variableType3);
    }
}
