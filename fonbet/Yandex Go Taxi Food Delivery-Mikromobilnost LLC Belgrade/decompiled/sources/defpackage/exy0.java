package defpackage;

import android.graphics.Color;
import flex.theme.ThemedColor;
import flex.theme.a;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public final class exy0 {
    public final pvy0 a;
    public final int b;
    public final int c = -65281;
    public final ArrayList d = new ArrayList();

    public exy0(pvy0 pvy0Var, int i) {
        this.a = pvy0Var;
        this.b = i;
        pvy0Var.b.add(new b6q0(1, this));
    }

    public final int a(ThemedColor themedColor) {
        Object failure;
        pvy0 pvy0Var;
        String str;
        Object failure2;
        boolean z = themedColor instanceof his0;
        int i = this.c;
        if (z) {
            his0 his0Var = (his0) themedColor;
            try {
                failure2 = Integer.valueOf(Color.parseColor(his0Var.a));
            } catch (Throwable th) {
                failure2 = new Result.Failure(th);
            }
            Throwable a = Result.a(failure2);
            if (a != null) {
                h5z0.a.f(a, "Unable to get color value for " + his0Var, new Object[0]);
                failure2 = Integer.valueOf(i);
            }
            return ((Number) failure2).intValue();
        }
        if (!(themedColor instanceof ex40)) {
            if (themedColor instanceof a) {
                return i;
            }
            if (themedColor == null) {
                return this.b;
            }
            w511.b();
            return 0;
        }
        ex40 ex40Var = (ex40) themedColor;
        try {
            pvy0Var = this.a;
            str = pvy0Var.a;
        } catch (Throwable th2) {
            failure = new Result.Failure(th2);
        }
        if (str == null) {
            throw new IllegalStateException("Theme id was not set " + pvy0Var);
        }
        failure = Integer.valueOf(Color.parseColor((String) b.g(str, ex40Var.a)));
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            h5z0.a.f(a2, "Unable to resolve color value for " + ex40Var, new Object[0]);
            failure = Integer.valueOf(i);
        }
        return ((Number) failure).intValue();
    }

    public final dxy0 b(ThemedColor themedColor, bxy0 bxy0Var) {
        Pair pair = new Pair(themedColor, bxy0Var);
        this.d.add(pair);
        bxy0Var.a(a(themedColor));
        return new dxy0(this, pair);
    }
}
