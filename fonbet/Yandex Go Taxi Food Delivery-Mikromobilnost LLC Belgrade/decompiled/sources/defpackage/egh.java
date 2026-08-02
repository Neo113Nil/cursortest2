package defpackage;

import com.yandex.go.payments.paymentlist.ui.PaymentOptionState;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes8.dex */
public final class egh extends l6a0 {
    public final PaymentOptionState b;
    public final DividerType c;
    public final boolean d;
    public final cf70 e;
    public final boolean f;
    public final CharSequence g;
    public final t0a0 h;
    public final j4a0 i;
    public final c6a0 j;
    public final boolean k;
    public final c6a0 l;
    public final c6a0 m;
    public final c6a0 n;
    public final c6a0 o;

    public egh(PaymentOptionState paymentOptionState, DividerType dividerType, boolean z, cf70 cf70Var, boolean z2, CharSequence charSequence, t0a0 t0a0Var, j4a0 j4a0Var, c6a0 c6a0Var, boolean z3, c6a0 c6a0Var2, c6a0 c6a0Var3, c6a0 c6a0Var4, c6a0 c6a0Var5) {
        super(new fvc(new Object[]{paymentOptionState, dividerType, Boolean.valueOf(z), charSequence, cf70Var, Boolean.valueOf(z2), j4a0Var, Boolean.valueOf(z3), c6a0Var, c6a0Var2, c6a0Var3, c6a0Var4, c6a0Var5}));
        this.b = paymentOptionState;
        this.c = dividerType;
        this.d = z;
        this.e = cf70Var;
        this.f = z2;
        this.g = charSequence;
        this.h = t0a0Var;
        this.i = j4a0Var;
        this.j = c6a0Var;
        this.k = z3;
        this.l = c6a0Var2;
        this.m = c6a0Var3;
        this.n = c6a0Var4;
        this.o = c6a0Var5;
    }

    @Override // defpackage.l6a0
    public final j4a0 c() {
        return this.i;
    }

    @Override // defpackage.l6a0
    public final CharSequence getTitle() {
        return this.g;
    }

    @Override // defpackage.l6a0
    public final DividerType m() {
        return this.c;
    }

    @Override // defpackage.l6a0
    public final t0a0 n() {
        return this.h;
    }

    @Override // defpackage.l6a0
    public final boolean v() {
        return this.f;
    }

    @Override // defpackage.l6a0
    public final boolean w() {
        return this.d;
    }

    @Override // defpackage.l6a0
    public final PaymentOptionState x() {
        return this.b;
    }

    @Override // defpackage.l6a0
    public final cf70 y() {
        return this.e;
    }

    @Override // defpackage.l6a0
    public final boolean z() {
        return this.k;
    }
}
