package androidx.compose.animation;

import androidx.compose.ui.layout.o;
import defpackage.aa10;
import defpackage.ejs0;
import defpackage.gtq0;
import defpackage.jj2;
import defpackage.jt1;
import defpackage.k6w;
import defpackage.oz40;
import defpackage.p8e;
import defpackage.tje;
import defpackage.tls;
import defpackage.uo5;
import defpackage.x0y;
import defpackage.x910;
import defpackage.zy11;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class n extends x0y {
    public jj2 a;
    public jt1 b;
    public boolean x;
    public long c = -9223372034707292160L;
    public long w = p8e.b(0, 0, 0, 0, 15);
    public final oz40 y = androidx.compose.runtime.f.j(null);

    public n(jj2 jj2Var, uo5 uo5Var) {
        this.a = jj2Var;
        this.b = uo5Var;
    }

    @Override // defpackage.v0y
    public final aa10 e(final androidx.compose.ui.layout.k kVar, x910 x910Var, long j) {
        o l0;
        char c;
        long j2;
        ejs0 ejs0Var;
        long d;
        ejs0 ejs0Var2;
        if (kVar.d0()) {
            this.w = j;
            this.x = true;
            l0 = x910Var.l0(j);
        } else {
            l0 = x910Var.l0(this.x ? this.w : j);
        }
        final o oVar = l0;
        long j3 = (oVar.b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (oVar.a << 32);
        if (kVar.d0()) {
            this.c = j3;
            c = ' ';
            d = j3;
            j2 = d;
        } else {
            long j4 = !k6w.a(this.c, -9223372034707292160L) ? this.c : j3;
            oz40 oz40Var = this.y;
            ejs0 ejs0Var3 = (ejs0) oz40Var.getValue();
            if (ejs0Var3 != null) {
                androidx.compose.animation.core.a aVar = ejs0Var3.a;
                c = ' ';
                j2 = j3;
                boolean z = (k6w.a(j4, ((k6w) aVar.e()).a) || ((Boolean) aVar.e.getValue()).booleanValue()) ? false : true;
                if (!k6w.a(j4, ((k6w) aVar.f.getValue()).a) || z) {
                    ejs0Var3.b = ((k6w) aVar.e()).a;
                    ejs0Var2 = ejs0Var3;
                    tje.N(getCoroutineScope(), null, null, new SizeAnimationModifierNode$animateTo$data$1$1(ejs0Var2, j4, this, null), 3);
                } else {
                    ejs0Var2 = ejs0Var3;
                }
                ejs0Var = ejs0Var2;
            } else {
                long j5 = j4;
                c = ' ';
                j2 = j3;
                ejs0Var = new ejs0(new androidx.compose.animation.core.a(new k6w(j5), gtq0.m, new k6w(4294967297L), 8), j5);
            }
            oz40Var.setValue(ejs0Var);
            d = p8e.d(j, ((k6w) ejs0Var.a.e()).a);
        }
        final int i = (int) (d >> c);
        final int i2 = (int) (d & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        final long j6 = j2;
        return kVar.w(i, i2, kotlin.collections.b.f(), new tls() { // from class: androidx.compose.animation.SizeAnimationModifierNode$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                o.a.m((o.a) obj, oVar, n.this.b.a(j6, (i << 32) | (i2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), kVar.getLayoutDirection()));
                return zy11.a;
            }
        });
    }

    @Override // defpackage.e530
    public final void onAttach() {
        this.c = -9223372034707292160L;
        this.x = false;
    }

    @Override // defpackage.e530
    public final void onReset() {
        super.onReset();
        this.y.setValue(null);
    }
}
