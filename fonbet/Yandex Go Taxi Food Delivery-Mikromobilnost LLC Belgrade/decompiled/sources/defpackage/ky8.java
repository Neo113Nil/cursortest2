package defpackage;

import androidx.compose.ui.semantics.f;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final /* synthetic */ class ky8 implements tls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ tls b;
    public final /* synthetic */ cy8 c;

    public /* synthetic */ ky8(cy8 cy8Var, tls tlsVar) {
        this.c = cy8Var;
        this.b = tlsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        final cy8 cy8Var = this.c;
        final tls tlsVar = this.b;
        final int i2 = 0;
        switch (i) {
            case 0:
                mnq0 mnq0Var = (mnq0) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(cy8Var.a.toString());
                CharSequence charSequence = cy8Var.b;
                if (charSequence != null) {
                    sb.append(Extension.FIX_SPACE);
                    sb.append(charSequence.toString());
                }
                f.l(mnq0Var, sb.toString());
                if (cy8Var.f != null) {
                    f.p(mnq0Var, 0);
                    final int i3 = 1;
                    f.f(mnq0Var, null, new sls() { // from class: iy8
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i4 = i3;
                            cy8 cy8Var2 = cy8Var;
                            tls tlsVar2 = tlsVar;
                            switch (i4) {
                                case 0:
                                    tlsVar2.invoke(cy8Var2.f);
                                    return zy11.a;
                                default:
                                    tlsVar2.invoke(cy8Var2.f);
                                    return Boolean.TRUE;
                            }
                        }
                    });
                }
                return zy11.a;
            default:
                return q791.d((f530) obj, false, null, new awk0(0), new sls() { // from class: iy8
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i4 = i2;
                        cy8 cy8Var2 = cy8Var;
                        tls tlsVar2 = tlsVar;
                        switch (i4) {
                            case 0:
                                tlsVar2.invoke(cy8Var2.f);
                                return zy11.a;
                            default:
                                tlsVar2.invoke(cy8Var2.f);
                                return Boolean.TRUE;
                        }
                    }
                }, 11);
        }
    }

    public /* synthetic */ ky8(tls tlsVar, cy8 cy8Var) {
        this.b = tlsVar;
        this.c = cy8Var;
    }
}
