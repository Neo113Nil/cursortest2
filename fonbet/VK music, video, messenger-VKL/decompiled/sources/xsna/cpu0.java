package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.datetime.EditingMode;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VkDateRangePicker.kt */
/* loaded from: classes17.dex */
public final class cpu0 {

    /* compiled from: VkDateRangePicker.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((com.vk.core.compose.component.datetime.g) this.receiver).e(false);
            return s3q0.a;
        }
    }

    public static final void a(final com.vk.core.compose.component.datetime.g gVar, final q630 q630Var, rgy rgyVar, uey ueyVar, sg50 sg50Var, final boolean z, final EditingMode editingMode, androidx.compose.runtime.a aVar, final int i) {
        final rgy rgyVar2;
        final uey ueyVar2;
        final sg50 sg50Var2;
        androidx.compose.runtime.a M = aVar.M(1989580039);
        int i2 = i | (M.J(gVar) ? 4 : 2) | 1797504 | (M.l(z) ? 8388608 : 4194304) | (M.o(editingMode == null ? -1 : editingMode.ordinal()) ? 67108864 : 33554432);
        if (M.t(i2 & 1, (38347923 & i2) != 38347922)) {
            rgy rgyVar3 = new rgy(3, 0, 123);
            uey ueyVar3 = uey.d;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            sg50 sg50Var3 = (sg50) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1989580039, i2, -1, "com.vk.core.compose.component.datetime.VkDateRangePicker (VkDateRangePicker.kt:43)");
            }
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                ud5 ud5Var = new ud5(0, gVar, com.vk.core.compose.component.datetime.g.class, "showDialog", "showDialog$components_release()V", 0, 6);
                M.R(ud5Var);
                x2 = ud5Var;
            }
            int i4 = i2 << 3;
            bqv0.c(gVar, (gzs) ((fcy) x2), q630Var, null, null, rgyVar3, sg50Var3, z, editingMode, M, 14380416 | i3 | (234881024 & i4) | (i4 & 1879048192));
            b(gVar, M, i3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            rgyVar2 = rgyVar3;
            sg50Var2 = sg50Var3;
            ueyVar2 = ueyVar3;
        } else {
            M.h();
            rgyVar2 = rgyVar;
            ueyVar2 = ueyVar;
            sg50Var2 = sg50Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(q630Var, rgyVar2, ueyVar2, sg50Var2, z, editingMode, i) { // from class: xsna.bpu0
                public final /* synthetic */ q630 c;
                public final /* synthetic */ rgy d;
                public final /* synthetic */ uey e;
                public final /* synthetic */ sg50 f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ EditingMode h;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(49);
                    cpu0.a(com.vk.core.compose.component.datetime.g.this, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(com.vk.core.compose.component.datetime.g gVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q9o0 q9o0Var;
        f1m f1mVar = gVar.g;
        androidx.compose.runtime.a M = aVar.M(2112155929);
        if ((i & 6) == 0) {
            i2 = (M.J(gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2112155929, i2, -1, "com.vk.core.compose.component.datetime.VkDateRangePickerDialog (VkDateRangePicker.kt:64)");
            }
            if (((Boolean) ((zak0) gVar.i).getValue()).booleanValue()) {
                M.K(1966598762);
                k9x k9xVar = (k9x) ((zak0) gVar.c).getValue();
                q9o0 a2 = com.vk.core.compose.component.datetime.o.a(gVar, M, i2 & 14);
                Date date = (Date) f1mVar.getValue();
                Long l = null;
                Long valueOf = date != null ? Long.valueOf(com.vk.core.compose.component.datetime.c.c(date)) : null;
                Date date2 = (Date) gVar.h.getValue();
                if (date2 != null) {
                    if (((Date) f1mVar.getValue()) == null) {
                        date2 = null;
                    }
                    if (date2 != null) {
                        l = Long.valueOf(com.vk.core.compose.component.datetime.c.c(date2));
                    }
                }
                Long l2 = l;
                u890 u890Var = x0l.a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2012087461, 0, -1, "androidx.compose.material3.rememberDateRangePickerState (DateRangePicker.kt:283)");
                }
                Locale a3 = uz8.a(M);
                Object[] objArr = new Object[0];
                fh9 C = q6x.C(new fh1(11, a2, a3), new vx7((byte) 0, 2));
                boolean J = M.J(valueOf) | M.J(l2) | M.J(valueOf) | M.y(k9xVar) | M.o(0) | M.J(a2) | M.y(a3);
                Object x = M.x();
                if (J || x == a.C0011a.a) {
                    o0l o0lVar = new o0l(valueOf, l2, valueOf, k9xVar, a2, a3, 0);
                    q9o0Var = a2;
                    M.R(o0lVar);
                    x = o0lVar;
                } else {
                    q9o0Var = a2;
                }
                e1l e1lVar = (e1l) crx0.D(objArr, C, (gzs) x, M, 0);
                ((zak0) e1lVar.d).setValue(q9o0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                you0.a(6, M, kai.c(579931243, new jhq(3, gVar, e1lVar), M));
            } else {
                M.K(1963838057);
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
            s.d = new h36(gVar, i, 3);
        }
    }
}
