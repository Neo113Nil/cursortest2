package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.ui.graphics.layer.a;
import java.util.ArrayList;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class l5y extends e530 implements pam {
    public c a;

    @Override // defpackage.pam
    public final void d(c1y c1yVar) {
        k28 k28Var = c1yVar.a;
        ArrayList arrayList = this.a.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b bVar = (b) arrayList.get(i);
            a aVar = bVar.n;
            if (aVar != null) {
                long j = bVar.m;
                float f = (int) (j >> 32);
                float f2 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                long j2 = aVar.t;
                float f3 = f - ((int) (j2 >> 32));
                float f4 = f2 - ((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & j2));
                ((cot) k28Var.b.a).n(f3, f4);
                try {
                    qje.i(c1yVar, aVar);
                } finally {
                    ((cot) k28Var.b.a).n(-f3, -f4);
                }
            }
        }
        c1yVar.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l5y) && jl40.l(this.a, ((l5y) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.e530
    public final void onAttach() {
        this.a.j = this;
    }

    @Override // defpackage.e530
    public final void onDetach() {
        c cVar = this.a;
        cVar.e();
        cVar.b = null;
        cVar.c = -1;
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.a + ')';
    }
}
