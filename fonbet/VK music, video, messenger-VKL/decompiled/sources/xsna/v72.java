package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.UUID;
import kotlin.jvm.internal.Lambda;
import xsna.cri;
import xsna.q630;

/* compiled from: AndroidDialog.android.kt */
/* loaded from: classes11.dex */
public final class v72 {

    /* compiled from: AndroidDialog.android.kt */
    public static final class a extends Lambda implements izs<lgn, kgn> {
        final /* synthetic */ smm $dialog;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(smm smmVar) {
            super(1);
            this.$dialog = smmVar;
        }

        @Override // xsna.izs
        public final kgn invoke(lgn lgnVar) {
            this.$dialog.show();
            return new u72(this.$dialog, 0);
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    public static final class b extends Lambda implements gzs<s3q0> {
        final /* synthetic */ smm $dialog;
        final /* synthetic */ LayoutDirection $layoutDirection;
        final /* synthetic */ gzs<s3q0> $onDismissRequest;
        final /* synthetic */ xim $properties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(smm smmVar, gzs<s3q0> gzsVar, xim ximVar, LayoutDirection layoutDirection) {
            super(0);
            this.$dialog = smmVar;
            this.$onDismissRequest = gzsVar;
            this.$properties = ximVar;
            this.$layoutDirection = layoutDirection;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            this.$dialog.l(this.$onDismissRequest, this.$properties, this.$layoutDirection);
            return s3q0.a;
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    public static final class c extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> $content;
        final /* synthetic */ gzs<s3q0> $onDismissRequest;
        final /* synthetic */ xim $properties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(gzs<s3q0> gzsVar, xim ximVar, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar, int i, int i2) {
            super(2);
            this.$onDismissRequest = gzsVar;
            this.$properties = ximVar;
            this.$content = wzsVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            v72.a(this.$onDismissRequest, this.$properties, this.$content, aVar, ne7.I(this.$$changed | 1), this.$$default);
            return s3q0.a;
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    public static final class d extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ mtk0<wzs<androidx.compose.runtime.a, Integer, s3q0>> $currentContent$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(wh50 wh50Var) {
            super(2);
            this.$currentContent$delegate = wh50Var;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1338939603, intValue, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:265)");
                }
                Object x = aVar2.x();
                if (x == a.C0011a.a) {
                    x = w72.i;
                    aVar2.R(x);
                }
                v72.b(egi0.b(q630.a.a, false, (izs) x), this.$currentContent$delegate.getValue(), aVar2, 0, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    public static final class e extends Lambda implements gzs<UUID> {
        public static final e i = new e(0);

        @Override // xsna.gzs
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(gzs<s3q0> gzsVar, xim ximVar, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar, androidx.compose.runtime.a aVar, int i, int i2) {
        int i3;
        xim ximVar2;
        int i4;
        xim ximVar3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(826668973);
        if ((i & 6) == 0) {
            i3 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            ximVar2 = ximVar;
            i3 |= M.J(ximVar2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= M.y(wzsVar) ? 256 : 128;
            }
            i4 = i3;
            if (M.t(i4 & 1, (i4 & 147) == 146)) {
                M.h();
                ximVar3 = ximVar2;
            } else {
                ximVar3 = i5 != 0 ? new xim(false, 7) : ximVar2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(826668973, i4, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:249)");
                }
                View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
                azl azlVar = (azl) M.r(uvi.h);
                LayoutDirection layoutDirection = (LayoutDirection) M.r(uvi.n);
                cvi z = n34.z(M);
                wh50 c2 = androidx.compose.runtime.k.c(wzsVar, M, (i4 >> 6) & 14);
                Object[] objArr = new Object[0];
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = e.i;
                    M.R(x);
                }
                UUID uuid = (UUID) crx0.A(objArr, (gzs) x, M, 48);
                boolean o = M.o(ximVar3.g) | M.J(view) | M.J(azlVar) | M.J(null);
                Object x2 = M.x();
                if (o || x2 == c0012a) {
                    smm smmVar = new smm(gzsVar, ximVar3, view, layoutDirection, azlVar, uuid);
                    jai jaiVar = new jai(-1338939603, new d(c2), true);
                    kgm kgmVar = smmVar.i;
                    kgmVar.setParentCompositionContext(z);
                    ((zak0) kgmVar.m).setValue(jaiVar);
                    kgmVar.q = true;
                    kgmVar.r();
                    M.R(smmVar);
                    x2 = smmVar;
                }
                smm smmVar2 = (smm) x2;
                boolean y = M.y(smmVar2);
                Object x3 = M.x();
                if (y || x3 == c0012a) {
                    x3 = new a(smmVar2);
                    M.R(x3);
                }
                bap.c(smmVar2, (izs) x3, M, 0);
                boolean y2 = M.y(smmVar2) | ((i4 & 14) == 4) | ((i4 & 112) == 32) | M.o(layoutDirection.ordinal());
                Object x4 = M.x();
                if (y2 || x4 == c0012a) {
                    x4 = new b(smmVar2, gzsVar, ximVar3, layoutDirection);
                    M.R(x4);
                }
                bap.i((gzs) x4, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            s = M.s();
            if (s == null) {
                s.d = new c(gzsVar, ximVar3, wzsVar, i, i2);
                return;
            }
            return;
        }
        ximVar2 = ximVar;
        if ((i & 384) == 0) {
        }
        i4 = i3;
        if (M.t(i4 & 1, (i4 & 147) == 146)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    public static final void b(q630 q630Var, wzs wzsVar, androidx.compose.runtime.a aVar, int i, int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(1090521195);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.y(wzsVar) ? 32 : 16;
        }
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                q630Var = q630.a.a;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1090521195, i3, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:752)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = x72.a;
                M.R(x);
            }
            cp10 cp10Var = (cp10) x;
            int i5 = ((i3 >> 3) & 14) | 384 | ((i3 << 3) & 112);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            int i6 = ((i5 << 6) & 896) | 6;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, cp10Var, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            wzsVar.invoke(M, Integer.valueOf((i6 >> 6) & 14));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new y72(q630Var, wzsVar, i, i2);
        }
    }
}
