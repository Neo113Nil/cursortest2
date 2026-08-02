package com.yandex.div.evaluable;

import defpackage.q0;
import xsna.zcl;

/* compiled from: FunctionArgument.kt */
/* loaded from: classes7.dex */
public final class FunctionArgument {
    private final boolean isVariadic;
    private final EvaluableType type;

    public FunctionArgument(EvaluableType evaluableType, boolean z) {
        this.type = evaluableType;
        this.isVariadic = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FunctionArgument)) {
            return false;
        }
        FunctionArgument functionArgument = (FunctionArgument) obj;
        return this.type == functionArgument.type && this.isVariadic == functionArgument.isVariadic;
    }

    public final EvaluableType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        boolean z = this.isVariadic;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final boolean isVariadic() {
        return this.isVariadic;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FunctionArgument(type=");
        sb.append(this.type);
        sb.append(", isVariadic=");
        return q0.a(sb, this.isVariadic, ')');
    }

    public /* synthetic */ FunctionArgument(EvaluableType evaluableType, boolean z, int i, zcl zclVar) {
        this(evaluableType, (i & 2) != 0 ? false : z);
    }
}
