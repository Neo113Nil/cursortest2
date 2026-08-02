package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.avc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class i8k implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i8k(String str, String str2, String str3, q630 q630Var, int i) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                k8k.g((String) this.c, (String) this.d, (String) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(3073));
                return s3q0.a;
            default:
                d64 d64Var = (d64) this.c;
                d64 d64Var2 = (d64) this.d;
                d64 d64Var3 = (d64) this.e;
                d64 d64Var4 = (d64) this.f;
                rj50 rj50Var = (rj50) obj;
                avc0 avc0Var = (avc0) obj2;
                if (avc0Var instanceof avc0.d) {
                    return rj50Var.a(d64Var, avc0Var);
                }
                if (avc0Var instanceof avc0.b) {
                    return rj50Var.a(d64Var2, avc0Var);
                }
                if (avc0Var instanceof avc0.a) {
                    return rj50Var.a(d64Var3, avc0Var);
                }
                if (avc0Var instanceof avc0.c) {
                    return rj50Var.a(d64Var4, avc0Var);
                }
                throw new NoWhenBranchMatchedException();
        }
    }

    public /* synthetic */ i8k(d64 d64Var, d64 d64Var2, d64 d64Var3, d64 d64Var4) {
        this.c = d64Var;
        this.d = d64Var2;
        this.e = d64Var3;
        this.f = d64Var4;
    }
}
