package defpackage;

import java.util.HashMap;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes12.dex */
public final /* synthetic */ class mk7 implements pry, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mk7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.pry
    public final void a(boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                qk7 qk7Var = (qk7) obj;
                qk7Var.F = z;
                njv njvVar = qk7Var.E;
                String str = qk7Var.z.b;
                mjv mjvVar = njvVar.b;
                mjvVar.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("linkage_id", str);
                mjvVar.a.a("InAppCalls.CallSelection.RememberChoice", hashMap, 2, x4e.r(z, hashMap, "is_remember_option_enabled"));
                break;
            default:
                ((tls) obj).invoke(Boolean.valueOf(z));
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof pry) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof pry) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new FunctionReferenceImpl(1, (qk7) this.b, qk7.class, "onRememberSettingChanged", "onRememberSettingChanged(Z)V", 0);
            default:
                return (tls) this.b;
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
