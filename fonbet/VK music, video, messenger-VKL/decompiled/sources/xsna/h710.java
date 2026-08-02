package xsna;

import androidx.compose.ui.text.style.ResolvedTextDirection;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class h710 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h710(int i, int i2, String str, q630 q630Var, boolean z) {
        this.e = str;
        this.c = z;
        this.d = i;
        this.f = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                String str = (String) this.e;
                q630 q630Var = (q630) this.f;
                ((Integer) obj2).getClass();
                int I = ne7.I(49);
                j710.f(this.d, I, (androidx.compose.runtime.a) obj, str, q630Var, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(this.d | 1);
                jho0.a(this.c, (ResolvedTextDirection) this.e, (gho0) this.f, (androidx.compose.runtime.a) obj, I2);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ h710(boolean z, ResolvedTextDirection resolvedTextDirection, gho0 gho0Var, int i) {
        this.c = z;
        this.e = resolvedTextDirection;
        this.f = gho0Var;
        this.d = i;
    }
}
