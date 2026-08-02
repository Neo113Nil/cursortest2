package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.datetime.EditingMode;
import java.util.Date;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VkDatePicker.kt */
/* loaded from: classes17.dex */
public final class apu0 {

    /* compiled from: VkDatePicker.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((com.vk.core.compose.component.datetime.d) this.receiver).e(false);
            return s3q0.a;
        }
    }

    public static final void a(com.vk.core.compose.component.datetime.d dVar, q630 q630Var, rgy rgyVar, uey ueyVar, sg50 sg50Var, boolean z, EditingMode editingMode, androidx.compose.runtime.a aVar, int i, int i2) {
        boolean z2;
        int i3;
        rgy rgyVar2;
        uey ueyVar2;
        sg50 sg50Var2;
        boolean z3;
        int i4;
        androidx.compose.runtime.a M = aVar.M(1002708356);
        int i5 = i | (M.J(dVar) ? 4 : 2);
        int i6 = 1797504 | i5;
        int i7 = i2 & 128;
        if (i7 != 0) {
            i3 = i5 | 14380416;
            z2 = z;
        } else {
            z2 = z;
            i3 = i6 | (M.l(z2) ? 8388608 : 4194304);
        }
        if ((i & 100663296) == 0) {
            i3 |= M.o(editingMode == null ? -1 : editingMode.ordinal()) ? 67108864 : 33554432;
        }
        int i8 = i3;
        if (M.t(i8 & 1, (38347923 & i8) != 38347922)) {
            rgy rgyVar3 = new rgy(3, 0, 123);
            uey ueyVar3 = uey.d;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            sg50 sg50Var3 = (sg50) x;
            boolean z4 = i7 != 0 ? true : z2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1002708356, i8, -1, "com.vk.core.compose.component.datetime.VkDatePicker (VkDatePicker.kt:44)");
            }
            int i9 = i8 & 14;
            boolean z5 = i9 == 4;
            Object x2 = M.x();
            if (z5 || x2 == c0012a) {
                i4 = i9;
                k3b k3bVar = new k3b(0, dVar, com.vk.core.compose.component.datetime.d.class, "showDialog", "showDialog$components_release()V", 0, 7);
                M.R(k3bVar);
                x2 = k3bVar;
            } else {
                i4 = i9;
            }
            int i10 = i8 << 3;
            boolean z6 = z4;
            bqv0.c(dVar, (gzs) ((fcy) x2), q630Var, null, null, rgyVar3, sg50Var3, z6, editingMode, M, i4 | 14380416 | (234881024 & i10) | (i10 & 1879048192));
            b(dVar, M, i4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            rgyVar2 = rgyVar3;
            sg50Var2 = sg50Var3;
            z3 = z6;
            ueyVar2 = ueyVar3;
        } else {
            M.h();
            rgyVar2 = rgyVar;
            ueyVar2 = ueyVar;
            sg50Var2 = sg50Var;
            z3 = z2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zou0(dVar, q630Var, rgyVar2, ueyVar2, sg50Var2, z3, editingMode, i, i2);
        }
    }

    public static final void b(com.vk.core.compose.component.datetime.d dVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(481191970);
        if ((i & 6) == 0) {
            i2 = (M.J(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(481191970, i2, -1, "com.vk.core.compose.component.datetime.VkDatePickerDialog (VkDatePicker.kt:65)");
            }
            if (((Boolean) ((zak0) dVar.h).getValue()).booleanValue()) {
                M.K(-1410681494);
                k9x k9xVar = (k9x) ((zak0) dVar.c).getValue();
                q9o0 a2 = com.vk.core.compose.component.datetime.o.a(dVar, M, i2 & 14);
                Date date = (Date) dVar.g.getValue();
                you0.a(6, M, kai.c(-2035461360, new o9d(10, dVar, lzk.p(date != null ? Long.valueOf(com.vk.core.compose.component.datetime.c.c(date)) : null, k9xVar, a2, M)), M));
            } else {
                M.K(-1413419104);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new j95(dVar, i, 5);
        }
    }
}
