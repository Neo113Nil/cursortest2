package xsna;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.compose.runtime.a;

/* compiled from: BaseMenuWrapper.java */
/* loaded from: classes11.dex */
public abstract class wg6 implements xr8 {
    public final Object a;
    public Object b;
    public Object c;

    public wg6(Context context) {
        this.a = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0108, code lost:
    
        if (r36.p(r6) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0141, code lost:
    
        if (r36.p(r8) == false) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static psv0 d(long j, long j2, long j3, long j4, long j5, long j6, androidx.compose.runtime.a aVar, int i, int i2) {
        long j7;
        long j8;
        long j9;
        long j10;
        boolean z;
        long j11;
        boolean z2;
        boolean z3;
        Object x;
        if ((i2 & 1) != 0) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j7 = ylu0Var.getBackground().d;
        } else {
            j7 = j;
        }
        long c = (i2 & 2) != 0 ? l5g.c(14, j7, 0.64f) : j2;
        if ((i2 & 4) != 0) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j8 = ylu0Var2.getText().e;
        } else {
            j8 = j3;
        }
        long c2 = (i2 & 8) != 0 ? l5g.c(14, j8, 0.64f) : j4;
        if ((i2 & 16) != 0) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var3 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j9 = ylu0Var3.getIcon().e;
        } else {
            j9 = j5;
        }
        long c3 = (i2 & 32) != 0 ? l5g.c(14, j9, 0.64f) : j6;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-74648257, i, -1, "com.vk.core.compose.component.button.tool.ToolButtonDefaults.buttonColors (ToolButtonDefaults.kt:99)");
        }
        boolean z4 = ((((i & 112) ^ 48) > 32 && aVar.p(c)) || (i & 48) == 32) | ((((i & 14) ^ 6) > 4 && aVar.p(j7)) || (i & 6) == 4) | ((((i & 896) ^ 384) > 256 && aVar.p(j8)) || (i & 384) == 256);
        long j12 = c3;
        if (((i & 7168) ^ 3072) > 2048) {
            j10 = c2;
        } else {
            j10 = c2;
        }
        if ((i & 3072) != 2048) {
            z = false;
            boolean z5 = z4 | z | ((((57344 & i) ^ 24576) <= 16384 && aVar.p(j9)) || (i & 24576) == 16384);
            if (((458752 & i) ^ 196608) <= 131072) {
                j11 = j12;
            } else {
                j11 = j12;
            }
            if ((i & 196608) != 131072) {
                z2 = false;
                z3 = z5 | z2;
                x = aVar.x();
                if (!z3 || x == a.C0011a.a) {
                    psv0 psv0Var = new psv0(j7, j8, c, j10, j9, j11);
                    aVar.R(psv0Var);
                    x = psv0Var;
                }
                psv0 psv0Var2 = (psv0) x;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return psv0Var2;
            }
            z2 = true;
            z3 = z5 | z2;
            x = aVar.x();
            if (!z3) {
            }
            psv0 psv0Var3 = new psv0(j7, j8, c, j10, j9, j11);
            aVar.R(psv0Var3);
            x = psv0Var3;
            psv0 psv0Var22 = (psv0) x;
            if (androidx.compose.runtime.b.d()) {
            }
            return psv0Var22;
        }
        z = true;
        boolean z52 = z4 | z | ((((57344 & i) ^ 24576) <= 16384 && aVar.p(j9)) || (i & 24576) == 16384);
        if (((458752 & i) ^ 196608) <= 131072) {
        }
        if ((i & 196608) != 131072) {
        }
        z2 = true;
        z3 = z52 | z2;
        x = aVar.x();
        if (!z3) {
        }
        psv0 psv0Var32 = new psv0(j7, j8, c, j10, j9, j11);
        aVar.R(psv0Var32);
        x = psv0Var32;
        psv0 psv0Var222 = (psv0) x;
        if (androidx.compose.runtime.b.d()) {
        }
        return psv0Var222;
    }

    @Override // xsna.xr8
    public void a(Object obj) {
        if (epx.f(this.b, obj)) {
            return;
        }
        g(obj);
        this.b = obj;
    }

    public MenuItem e(MenuItem menuItem) {
        if (!(menuItem instanceof nin0)) {
            return menuItem;
        }
        nin0 nin0Var = (nin0) menuItem;
        if (((dpj0) this.b) == null) {
            this.b = new dpj0();
        }
        MenuItem menuItem2 = (MenuItem) ((dpj0) this.b).get(nin0Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        t720 t720Var = new t720((Context) this.a, nin0Var);
        ((dpj0) this.b).put(nin0Var, t720Var);
        return t720Var;
    }

    public SubMenu f(SubMenu subMenu) {
        if (!(subMenu instanceof ajn0)) {
            return subMenu;
        }
        ajn0 ajn0Var = (ajn0) subMenu;
        if (((dpj0) this.c) == null) {
            this.c = new dpj0();
        }
        SubMenu subMenu2 = (SubMenu) ((dpj0) this.c).get(ajn0Var);
        if (subMenu2 != null) {
            return subMenu2;
        }
        ttm0 ttm0Var = new ttm0((Context) this.a, ajn0Var);
        ((dpj0) this.c).put(ajn0Var, ttm0Var);
        return ttm0Var;
    }

    public abstract void g(Object obj);

    @Override // xsna.xr8
    public View getView() {
        return (View) this.c;
    }

    public wg6() {
        this.a = wpu0.b;
        float f = kqu0.t;
        this.b = new u890(f, f, f, f);
        this.c = new u890(f, f, kqu0.v, f);
    }

    public wg6(fge fgeVar) {
        this.a = fgeVar;
        this.c = fgeVar.getView();
    }
}
