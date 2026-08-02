package defpackage;

import java.util.Arrays;

/* loaded from: classes11.dex */
public final class ezu0 {
    public final boolean a;

    public /* synthetic */ ezu0(czu0 czu0Var) {
        this.a = czu0Var.a;
    }

    public final wmb1 a() {
        smb1 smb1Var = new smb1();
        Boolean bool = Boolean.FALSE;
        smb1Var.a = bool;
        smb1Var.b = bool;
        smb1Var.c = Boolean.valueOf(this.a);
        smb1Var.d = bool;
        smb1Var.e = bool;
        return new wmb1(smb1Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ezu0) && this.a == ((ezu0) obj).a && ooc.m(null, null);
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, bool, Boolean.valueOf(this.a), bool, bool, null});
    }
}
