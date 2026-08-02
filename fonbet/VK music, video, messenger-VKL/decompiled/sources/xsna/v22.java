package xsna;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.state.ToggleableState;
import xsna.cgj;

/* compiled from: AndroidAutofillManager.android.kt */
/* loaded from: classes11.dex */
public final class v22 extends lo5 implements cgi0, uvr {
    public final gta0 b;
    public final mgi0 c;
    public final p52 d;
    public final fif0 e;
    public final String f;
    public final Rect g = new Rect();
    public final AutofillId h;
    public final qg50 i;
    public boolean j;

    /* compiled from: AndroidAutofillManager.android.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public v22(gta0 gta0Var, mgi0 mgi0Var, p52 p52Var, fif0 fif0Var, String str) {
        this.b = gta0Var;
        this.c = mgi0Var;
        this.d = p52Var;
        this.e = fif0Var;
        this.f = str;
        p52Var.setImportantForAutofill(1);
        AutofillId autofillId = p52Var.getAutofillId();
        if (autofillId == null) {
            throw pm0.f("Required value was null.");
        }
        this.h = autofillId;
        this.i = new qg50((Object) null);
    }

    @Override // xsna.cgi0
    public final void a(LayoutNode layoutNode, xfi0 xfi0Var) {
        us2 us2Var;
        us2 us2Var2;
        xfi0 d = layoutNode.d();
        int i = layoutNode.c;
        String str = (xfi0Var == null || (us2Var2 = (us2) zfi0.a(xfi0Var, ngi0.F)) == null) ? null : us2Var2.c;
        String str2 = (d == null || (us2Var = (us2) zfi0.a(d, ngi0.F)) == null) ? null : us2Var.c;
        boolean z = false;
        p52 p52Var = this.d;
        gta0 gta0Var = this.b;
        if (str != str2) {
            if (str == null) {
                gta0Var.b(p52Var, i, true);
            } else if (str2 == null) {
                gta0Var.b(p52Var, i, false);
            } else if (epx.f((cgj) zfi0.a(d, ngi0.s), cgj.a.a)) {
                if (str2.length() >= 5000) {
                    str2 = (Character.isHighSurrogate(str2.charAt(4999)) && Character.isLowSurrogate(str2.charAt(5000))) ? erm0.D0(4999, str2) : erm0.D0(5000, str2);
                }
                gta0Var.a(p52Var, i, AutofillValue.forText(str2));
            }
        }
        ToggleableState toggleableState = xfi0Var != null ? (ToggleableState) zfi0.a(xfi0Var, ngi0.K) : null;
        ToggleableState toggleableState2 = d != null ? (ToggleableState) zfi0.a(d, ngi0.K) : null;
        if (toggleableState != toggleableState2) {
            if (toggleableState == null) {
                gta0Var.b(p52Var, i, true);
            } else if (toggleableState2 == null) {
                gta0Var.b(p52Var, i, false);
            } else if (epx.f((cgj) zfi0.a(d, ngi0.s), cgj.a.b)) {
                int i2 = a.$EnumSwitchMapping$0[toggleableState2.ordinal()];
                Boolean bool = i2 != 1 ? i2 != 2 ? null : Boolean.FALSE : Boolean.TRUE;
                if (bool != null) {
                    gta0Var.a(p52Var, i, AutofillValue.forToggle(bool.booleanValue()));
                }
            }
        }
        xbr xbrVar = xfi0Var != null ? (xbr) zfi0.a(xfi0Var, ngi0.t) : null;
        xbr xbrVar2 = d != null ? (xbr) zfi0.a(d, ngi0.t) : null;
        if (!epx.f(xbrVar, xbrVar2)) {
            if (xbrVar == null) {
                gta0Var.b(p52Var, i, true);
            } else if (xbrVar2 == null) {
                gta0Var.b(p52Var, i, false);
            } else {
                gta0Var.a(p52Var, i, ((r82) xbrVar2).a);
            }
        }
        boolean z2 = xfi0Var != null && xfi0Var.b.a(ngi0.r);
        if (d != null && d.b.a(ngi0.r)) {
            z = true;
        }
        if (z2 != z) {
            qg50 qg50Var = this.i;
            if (z) {
                qg50Var.b(i);
            } else {
                qg50Var.h(i);
            }
        }
    }

    @Override // xsna.uvr
    public final void r(cxr cxrVar, dxr dxrVar) {
        LayoutNode f;
        xfi0 d;
        LayoutNode f2;
        xfi0 d2;
        if (cxrVar != null && (f2 = itl.f(cxrVar)) != null && (d2 = f2.d()) != null) {
            ph50<sgi0<?>, Object> ph50Var = d2.b;
            if (ph50Var.a(wfi0.g) || ph50Var.a(wfi0.h)) {
                this.b.a.notifyViewExited(this.d, f2.c);
            }
        }
        if (dxrVar == null || (f = itl.f(dxrVar)) == null || (d = f.d()) == null) {
            return;
        }
        ph50<sgi0<?>, Object> ph50Var2 = d.b;
        if (ph50Var2.a(wfi0.g) || ph50Var2.a(wfi0.h)) {
            int i = f.c;
            this.e.b.e(i, new w22(this, i));
        }
    }
}
