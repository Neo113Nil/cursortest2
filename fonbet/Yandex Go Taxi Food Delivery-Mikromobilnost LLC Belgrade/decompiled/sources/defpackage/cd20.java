package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes8.dex */
public final /* synthetic */ class cd20 implements yc20, jms {
    public final /* synthetic */ dd20 a;

    public cd20(dd20 dd20Var) {
        this.a = dd20Var;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof yc20) && (obj instanceof jms)) {
            return getFunctionDelegate().equals(((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, dd20.class, "onLogUploadComplete", "onLogUploadComplete(I)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
