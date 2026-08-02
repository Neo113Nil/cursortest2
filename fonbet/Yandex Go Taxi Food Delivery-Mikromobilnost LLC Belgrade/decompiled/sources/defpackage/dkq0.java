package defpackage;

import androidx.compose.foundation.text.selection.CrossStatus;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes10.dex */
public final /* synthetic */ class dkq0 {
    public final /* synthetic */ int a;

    public /* synthetic */ dkq0(int i) {
        this.a = i;
    }

    public final ckq0 a(rkq0 rkq0Var) {
        bkq0 b;
        bkq0 bkq0Var;
        boolean z;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                return new ckq0(rkq0Var.f().a(rkq0Var.f().c), rkq0Var.e().a(rkq0Var.e().d), rkq0Var.c() == CrossStatus.CROSSED);
            case 1:
                return u8b1.a(rkq0Var, bei.O);
            case 2:
                return u8b1.a(rkq0Var, l76.Q);
            default:
                ckq0 d = rkq0Var.d();
                if (d == null) {
                    return u8b1.a(rkq0Var, bei.O);
                }
                bkq0 bkq0Var2 = d.b;
                bkq0 bkq0Var3 = d.a;
                if (rkq0Var.a()) {
                    bkq0Var = u8b1.b(rkq0Var, rkq0Var.f(), bkq0Var3);
                    b = bkq0Var2;
                    bkq0Var2 = bkq0Var3;
                    bkq0Var3 = bkq0Var;
                } else {
                    b = u8b1.b(rkq0Var, rkq0Var.e(), bkq0Var2);
                    bkq0Var = b;
                }
                if (jl40.l(bkq0Var, bkq0Var2)) {
                    return d;
                }
                ckq0 ckq0Var = new ckq0(bkq0Var3, b, rkq0Var.c() == CrossStatus.CROSSED || (rkq0Var.c() == CrossStatus.COLLAPSED && bkq0Var3.b > b.b));
                bkq0 bkq0Var4 = ckq0Var.a;
                long j = bkq0Var4.c;
                bkq0 bkq0Var5 = ckq0Var.b;
                if (j == bkq0Var5.c) {
                    if (bkq0Var4.b == bkq0Var5.b) {
                        z = true;
                    }
                    z = false;
                } else {
                    boolean z3 = ckq0Var.c;
                    if ((z3 ? bkq0Var4 : bkq0Var5).b == 0) {
                        if (rkq0Var.j().f.a.a.b.length() == (z3 ? bkq0Var5 : bkq0Var4).b) {
                            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                            ref$BooleanRef.element = true;
                            rkq0Var.i(new uyo0(23, ref$BooleanRef));
                            z = ref$BooleanRef.element;
                        }
                    }
                    z = false;
                }
                if (z) {
                    String str = rkq0Var.b().f.a.a.b;
                    if (rkq0Var.getSize() <= 1 && rkq0Var.d() != null && str.length() != 0) {
                        dfq0 b2 = rkq0Var.b();
                        String str2 = b2.f.a.a.b;
                        int i = b2.c;
                        int length = str2.length();
                        if (i == 0) {
                            int b3 = nhb1.b(0, str2);
                            return rkq0Var.a() ? ckq0.a(ckq0Var, u8b1.e(bkq0Var4, b2, b3), null, true, 2) : ckq0.a(ckq0Var, null, u8b1.e(bkq0Var5, b2, b3), false, 1);
                        }
                        if (i == length) {
                            int c = nhb1.c(length, str2);
                            return rkq0Var.a() ? ckq0.a(ckq0Var, u8b1.e(bkq0Var4, b2, c), null, false, 2) : ckq0.a(ckq0Var, null, u8b1.e(bkq0Var5, b2, c), true, 1);
                        }
                        ckq0 d2 = rkq0Var.d();
                        if (d2 != null && d2.c) {
                            z2 = true;
                        }
                        int c2 = rkq0Var.a() ^ z2 ? nhb1.c(i, str2) : nhb1.b(i, str2);
                        return rkq0Var.a() ? ckq0.a(ckq0Var, u8b1.e(bkq0Var4, b2, c2), null, z2, 2) : ckq0.a(ckq0Var, null, u8b1.e(bkq0Var5, b2, c2), z2, 1);
                    }
                }
                return ckq0Var;
        }
    }
}
