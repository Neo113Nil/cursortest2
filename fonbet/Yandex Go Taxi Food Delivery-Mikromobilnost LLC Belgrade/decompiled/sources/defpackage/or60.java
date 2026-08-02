package defpackage;

import com.yandex.xplat.xflags.IncompatibleTypesError;
import com.yandex.xplat.xflags.VariableCastError;
import com.yandex.xplat.xflags.VariableType;

/* loaded from: classes2.dex */
public class or60 implements ut5 {
    @Override // defpackage.ut5
    public final b231 a(b231 b231Var, b231 b231Var2) {
        VariableType variableType;
        VariableType variableType2 = b231Var2.a;
        VariableType variableType3 = b231Var.a;
        if (variableType3 != VariableType.String_ || variableType2 != (variableType = VariableType.Map)) {
            throw new IncompatibleTypesError(variableType3, variableType2);
        }
        if (variableType2 == variableType) {
            throw new ClassCastException();
        }
        throw new VariableCastError(b231Var2, variableType);
    }
}
