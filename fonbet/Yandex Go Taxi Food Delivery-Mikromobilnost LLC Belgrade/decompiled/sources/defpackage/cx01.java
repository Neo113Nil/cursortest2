package defpackage;

import android.view.View;
import androidx.core.view.c;
import kotlin.sequences.b;

/* loaded from: classes.dex */
public final class cx01 implements ax01 {
    public int a;

    public static void a(View view) {
        view.invalidate();
        s5r s5rVar = new s5r(b.g(c.a(view), bx01.a));
        while (s5rVar.hasNext()) {
            ((ugk) s5rVar.next()).invalidateBorder();
        }
    }

    @Override // defpackage.ax01
    public final boolean isTransient() {
        return this.a != 0;
    }

    @Override // defpackage.ax01
    public final void transitionFinished(View view) {
        int i = this.a;
        if (i > 0) {
            int i2 = i - 1;
            this.a = i2;
            if (i2 == 0) {
                a(view);
            }
        }
    }

    @Override // defpackage.ax01
    public final void transitionStarted(View view) {
        int i = this.a + 1;
        this.a = i;
        if (i == 1) {
            a(view);
        }
    }
}
