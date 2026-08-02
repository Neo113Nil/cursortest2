package xsna;

/* compiled from: VkSecondaryTabRow.kt */
/* loaded from: classes17.dex */
public final class m1i0 extends k1i0 {
    @Override // xsna.k1i0
    public final void a(q630 q630Var, boolean z, gzs<s3q0> gzsVar, zzs<? super k1i0, ? super Boolean, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        q630 q630Var2;
        boolean z2;
        gzs<s3q0> gzsVar2;
        zzs<? super k1i0, ? super Boolean, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar2;
        long j;
        float f;
        androidx.compose.runtime.a M = aVar.M(377052035);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(zzsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(this) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(377052035, i2, -1, "com.vk.core.compose.component.SecondaryTabScopeImpl.InternalSecondaryTab (VkSecondaryTabRow.kt:386)");
            }
            pqo pqoVar = yfj.a;
            if (z) {
                M.K(1569763451);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getBackground().z;
            } else {
                M.K(1569765002);
                j = ((l5g) M.r(opv0.b)).a;
            }
            M.j();
            c9e0 b = vcl0.b(j, pqoVar);
            pqo pqoVar2 = hfj.a;
            if (((Boolean) M.r(opv0.a)).booleanValue()) {
                M.K(1569768042);
                f = ((Number) M.r(pqoVar2)).floatValue();
                M.j();
            } else {
                M.K(-1817463969);
                M.j();
                f = 0.64f;
            }
            c9e0[] c9e0VarArr = {b, pqoVar2.b(Float.valueOf(f))};
            q630Var2 = q630Var;
            z2 = z;
            gzsVar2 = gzsVar;
            zzsVar2 = zzsVar;
            rvi.b(c9e0VarArr, kai.c(554102467, new wmu(q630Var2, z2, gzsVar2, zzsVar2, this), M), M, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            z2 = z;
            gzsVar2 = gzsVar;
            zzsVar2 = zzsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final gzs<s3q0> gzsVar3 = gzsVar2;
            final q630 q630Var3 = q630Var2;
            final zzs<? super k1i0, ? super Boolean, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar3 = zzsVar2;
            final boolean z3 = z2;
            s.d = new wzs() { // from class: xsna.l1i0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    m1i0.this.a(q630Var3, z3, gzsVar3, zzsVar3, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
