package kotlin.jvm.internal;

import xsna.ccy;
import xsna.epx;
import xsna.fcy;
import xsna.fpf0;
import xsna.h0t;

/* loaded from: classes11.dex */
public class FunctionReference extends CallableReference implements h0t, fcy {
    private final int arity;

    public FunctionReference(int i) {
        this(i, CallableReference.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public ccy computeReflected() {
        fpf0.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && epx.f(getBoundReceiver(), functionReference.getBoundReceiver()) && epx.f(getOwner(), functionReference.getOwner());
        }
        if (obj instanceof fcy) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // xsna.h0t
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // xsna.fcy
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // xsna.fcy
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // xsna.fcy
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // xsna.fcy
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.CallableReference, xsna.ccy
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        ccy compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public FunctionReference(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public fcy getReflected() {
        return (fcy) super.getReflected();
    }

    public FunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
    }
}
