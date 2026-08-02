package xsna;

import com.vk.api.generated.auth.dto.AuthGetExchangeTokenResponseDto;
import com.vk.toggle.anonymous.SakFeatures;
import java.util.Collections;

/* compiled from: AuthGetExchangeLoginDataCommand.kt */
/* loaded from: classes6.dex */
public final class o35 extends y1q {
    public final h7r0 b;
    public final boolean c = true;
    public final xy2<AuthGetExchangeTokenResponseDto> d = new ufx("auth.getExchangeToken", new defpackage.j0(9), new or(5));
    public final bpn0 e = new bpn0(new uw3(2));
    public final bpn0 f = new bpn0(new l9(1));
    public final bpn0 g = new bpn0(new l35(0));

    public o35(h7r0 h7r0Var) {
        this.b = h7r0Var;
    }

    @Override // xsna.nx2
    public final xbu0 f(l7r0 l7r0Var) {
        boolean z = this.c;
        h7r0 h7r0Var = this.b;
        if (z) {
            l7r0Var.j(Collections.singletonList(h7r0Var));
        }
        String str = h7r0Var.a;
        String str2 = h7r0Var.b;
        boolean h = SakFeatures.Type.SAK_MIGRATION_USERS_GET_TO_ACC_GET.h();
        bpn0 bpn0Var = this.g;
        xy2<AuthGetExchangeTokenResponseDto> xy2Var = this.d;
        if (h) {
            try {
                bx2 e = e370.e(xy2Var);
                e.n = str;
                e.o = str2;
                io.reactivex.rxjava3.internal.operators.observable.i2 B = rdx0.B(e);
                bx2 e2 = e370.e((xy2) this.f.getValue());
                e2.n = str;
                e2.o = str2;
                io.reactivex.rxjava3.internal.operators.observable.i2 B2 = rdx0.B(e2);
                bx2 e3 = e370.e((xy2) bpn0Var.getValue());
                e3.n = str;
                e3.o = str2;
                return (xbu0) io.reactivex.rxjava3.core.x.A(B, B2, rdx0.B(e3), new jo3(new n35(0), 1)).c();
            } finally {
            }
        } else {
            try {
                bx2 e4 = e370.e(xy2Var);
                e4.n = str;
                e4.o = str2;
                io.reactivex.rxjava3.internal.operators.observable.i2 B3 = rdx0.B(e4);
                bx2 e5 = e370.e((xy2) this.e.getValue());
                e5.n = str;
                e5.o = str2;
                io.reactivex.rxjava3.internal.operators.observable.i2 B4 = rdx0.B(e5);
                bx2 e6 = e370.e((xy2) bpn0Var.getValue());
                e6.n = str;
                e6.o = str2;
                return (xbu0) io.reactivex.rxjava3.core.x.A(B3, B4, rdx0.B(e6), new d22(new m35(0), 2)).c();
            } finally {
            }
        }
    }
}
