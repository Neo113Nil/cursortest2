package androidx.compose.foundation.text.contextmenu.modifier;

import defpackage.bly0;
import defpackage.cqh;
import defpackage.dai0;
import defpackage.kly0;
import defpackage.lzu0;
import defpackage.s5w0;
import defpackage.tls;
import defpackage.xky0;
import defpackage.xy40;
import defpackage.yky0;
import defpackage.zky0;

/* loaded from: classes10.dex */
public abstract class b {
    public static final zky0 a(cqh cqhVar) {
        kly0 kly0Var;
        xky0 xky0Var = new xky0();
        dai0.L(cqhVar, bly0.a, new lzu0(29, new s5w0(27, xky0Var), new TextContextMenuModifierKt$collectTextContextMenuData$1$1(1, xky0Var, xky0.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0)));
        xy40 xy40Var = new xy40((Object) null);
        xy40 xy40Var2 = xky0Var.a;
        Object[] objArr = xy40Var2.a;
        int i = xy40Var2.b;
        yky0 yky0Var = null;
        int i2 = 0;
        boolean z = true;
        while (true) {
            kly0Var = kly0.b;
            if (i2 >= i) {
                break;
            }
            yky0 yky0Var2 = (yky0) objArr[i2];
            if (!z || yky0Var2 != kly0Var) {
                if (yky0Var2 != kly0Var || yky0Var != kly0Var) {
                    if (yky0Var2 != kly0Var) {
                        xy40 xy40Var3 = xky0Var.b;
                        Object[] objArr2 = xy40Var3.a;
                        int i3 = xy40Var3.b;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (((Boolean) ((tls) objArr2[i4]).invoke(yky0Var2)).booleanValue()) {
                            }
                        }
                    }
                    xy40Var.g(yky0Var2);
                    z = false;
                    yky0Var = yky0Var2;
                }
                z = false;
                break;
            }
            i2++;
        }
        if (((yky0) (xy40Var.d() ? null : xy40Var.a[xy40Var.b - 1])) == kly0Var) {
            xy40Var.m(xy40Var.b - 1);
        }
        return new zky0(xy40Var.i());
    }
}
