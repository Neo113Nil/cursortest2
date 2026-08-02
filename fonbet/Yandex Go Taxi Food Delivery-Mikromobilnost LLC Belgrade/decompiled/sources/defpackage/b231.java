package defpackage;

import com.yandex.xplat.xflags.VariableCastError;
import com.yandex.xplat.xflags.VariableType;

/* loaded from: classes2.dex */
public abstract class b231 {
    public final VariableType a;

    public b231(VariableType variableType) {
        this.a = variableType;
    }

    public final String a() {
        return "<Variable type: " + this.a + ", value: " + mbb1.a(b()) + ">";
    }

    public abstract y3x b();

    public final boolean c() {
        VariableType variableType = VariableType.Boolean;
        ia6 ia6Var = this.a == variableType ? (ia6) this : null;
        VariableCastError variableCastError = new VariableCastError(this, variableType);
        if (ia6Var != null) {
            return ia6Var.b;
        }
        throw variableCastError;
    }

    public final double d() {
        VariableType variableType = VariableType.Double;
        s6m s6mVar = this.a == variableType ? (s6m) this : null;
        VariableCastError variableCastError = new VariableCastError(this, variableType);
        if (s6mVar != null) {
            return s6mVar.b;
        }
        throw variableCastError;
    }

    public final int e() {
        VariableType variableType = VariableType.Int;
        o6w o6wVar = this.a == variableType ? (o6w) this : null;
        VariableCastError variableCastError = new VariableCastError(this, variableType);
        if (o6wVar != null) {
            return o6wVar.b;
        }
        throw variableCastError;
    }

    public final String f() {
        VariableType variableType = VariableType.String_;
        ouu0 ouu0Var = this.a == variableType ? (ouu0) this : null;
        VariableCastError variableCastError = new VariableCastError(this, variableType);
        if (ouu0Var != null) {
            return ouu0Var.b;
        }
        throw variableCastError;
    }
}
