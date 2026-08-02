package defpackage;

import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.taxi.order.titles.c;

/* loaded from: classes6.dex */
public final /* synthetic */ class kz8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object w;

    public /* synthetic */ kz8(int i, Object obj, boolean z, boolean z2) {
        this.a = i;
        this.w = obj;
        this.b = z;
        this.c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mz8 mz8Var = (mz8) this.w;
                boolean z = this.b;
                boolean z2 = this.c;
                mz8Var.c0().invalidateItemDecorations();
                if (!z) {
                    if (z2) {
                        mz8Var.c0().smoothScrollToPosition(0);
                        break;
                    }
                } else {
                    OneShotPreDrawListener.add(mz8Var.c0(), new uz(11, mz8Var));
                    break;
                }
                break;
            case 1:
                nz8 nz8Var = (nz8) this.w;
                boolean z3 = this.b;
                boolean z4 = this.c;
                nz8Var.c0().invalidateItemDecorations();
                if (!z3) {
                    if (z4) {
                        nz8Var.c0().smoothScrollToPosition(0);
                        break;
                    }
                } else {
                    OneShotPreDrawListener.add(nz8Var.c0(), new uz(12, nz8Var));
                    break;
                }
                break;
            case 2:
                d980 d980Var = (d980) this.w;
                boolean z5 = this.b;
                boolean z6 = this.c;
                if (d980Var.x) {
                    d980Var.i.b(d980Var, new c(z5, d980Var, z6));
                    break;
                }
                break;
            case 3:
                i630 i630Var = (i630) this.w;
                ((kcz0) i630Var.d).z(this.b, this.c);
                break;
            default:
                i630 i630Var2 = (i630) this.w;
                ((rr41) i630Var2.d).t(this.b, this.c);
                break;
        }
    }
}
