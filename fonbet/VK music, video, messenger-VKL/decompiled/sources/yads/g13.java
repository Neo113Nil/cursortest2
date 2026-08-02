package yads;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes10.dex */
public abstract class g13 {
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0049, code lost:
    
        if (r3 == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0050, code lost:
    
        if (r5 <= r3) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(Context context, v9 v9Var, ov0 ov0Var, mm mmVar, e13 e13Var) {
        boolean z;
        mmVar.getClass();
        boolean z2 = ov0Var.c(context) > 0 && ov0Var.a(context) > 0;
        boolean z3 = v9Var.z;
        Context applicationContext = context.getApplicationContext();
        int c = e13Var.c(applicationContext);
        int a = e13Var.a(applicationContext);
        int c2 = ov0Var.c(applicationContext);
        int a2 = ov0Var.a(applicationContext);
        int ordinal = e13Var.b().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                z = true;
            }
            if (c2 <= c) {
                if (c > 0) {
                    if (a2 > a) {
                    }
                    z = true;
                }
            }
            z = false;
        } else {
            if (c2 <= c) {
                if (c > 0) {
                }
            }
            z = false;
        }
        return z3 || (z2 && (z && (ov0Var.c(applicationContext) <= om3.d(applicationContext) && ov0Var.a(applicationContext) <= om3.b(applicationContext))));
    }
}
