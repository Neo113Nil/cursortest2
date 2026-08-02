package xsna;

import androidx.compose.foundation.text.Handle;
import androidx.compose.runtime.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.q630;

/* compiled from: TextFieldSelectionManager.kt */
/* loaded from: classes11.dex */
public final class jho0 {

    /* compiled from: TextFieldSelectionManager.kt */
    public static final class a implements wv70 {
        public final /* synthetic */ gho0 b;
        public final /* synthetic */ boolean c;

        public a(gho0 gho0Var, boolean z) {
            this.b = gho0Var;
            this.c = z;
        }

        @Override // xsna.wv70
        public final long a() {
            return this.b.n(this.c);
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    public static final class b implements PointerInputEventHandler {
        public final /* synthetic */ zdo0 a;

        public b(zdo0 zdo0Var) {
            this.a = zdo0Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
            Object a = m500.a(dmb0Var, this.a, spjVar);
            return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : s3q0.a;
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(boolean z, ResolvedTextDirection resolvedTextDirection, gho0 gho0Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        boolean z2;
        ResolvedTextDirection resolvedTextDirection2;
        mjo0 d;
        ljo0 ljo0Var;
        androidx.compose.runtime.a M = aVar.M(-1344558920);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.o(resolvedTextDirection.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gho0Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1344558920, i2, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:1365)");
            }
            int i3 = i2 & 14;
            boolean J = (i3 == 4) | M.J(gho0Var);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new eho0(gho0Var, z);
                M.R(x);
            }
            zdo0 zdo0Var = (zdo0) x;
            boolean y = M.y(gho0Var) | (i3 == 4);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new a(gho0Var, z);
                M.R(x2);
            }
            wv70 wv70Var = (wv70) x2;
            boolean g = qko0.g(gho0Var.p().b);
            tho0 p = gho0Var.p();
            int i4 = (int) (z ? p.b >> 32 : p.b & 4294967295L);
            j1z j1zVar = gho0Var.d;
            float a2 = (j1zVar == null || (d = j1zVar.d()) == null || (ljo0Var = d.a) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : jjo0.a(ljo0Var, i4);
            boolean y2 = M.y(zdo0Var);
            Object x3 = M.x();
            if (y2 || x3 == c0012a) {
                x3 = new b(zdo0Var);
                M.R(x3);
            }
            resolvedTextDirection2 = resolvedTextDirection;
            float f = a2;
            z2 = z;
            nc2.b(wv70Var, z2, resolvedTextDirection2, g, 0L, f, skn0.b(q630.a.a, zdo0Var, (PointerInputEventHandler) x3), M, (i2 << 3) & 1008);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            z2 = z;
            resolvedTextDirection2 = resolvedTextDirection;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h710(z2, resolvedTextDirection2, gho0Var, i);
        }
    }
}
