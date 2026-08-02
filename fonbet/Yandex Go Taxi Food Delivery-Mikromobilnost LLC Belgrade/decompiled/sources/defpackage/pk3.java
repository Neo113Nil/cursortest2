package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.bricks.Brick;

/* loaded from: classes15.dex */
public final class pk3 extends Brick {
    public final FrameLayout a;
    public final SparseArray b = new SparseArray();
    public p61 c;

    public pk3(Activity activity) {
        this.a = new FrameLayout(activity);
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        return this.a;
    }

    @Override // com.yandex.bricks.Brick
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        yj3 yj3Var = (yj3) this.b.get(i);
        if (yj3Var != null) {
            switch (yj3Var.a) {
                case 0:
                    ck3 ck3Var = yj3Var.b;
                    if (i2 != -1) {
                        if (ck3Var.j) {
                            ck3Var.e();
                            ck3Var.c();
                            ck3Var.a();
                        }
                        ck3Var.j = false;
                        break;
                    } else {
                        ck3Var.e.a(i2);
                        break;
                    }
                default:
                    ck3 ck3Var2 = yj3Var.b;
                    if (!ck3Var2.e.b(i2, intent)) {
                        if (ck3Var2.j) {
                            ck3Var2.e();
                            ck3Var2.c();
                            ck3Var2.a();
                        }
                        ck3Var2.j = false;
                        break;
                    }
                    break;
            }
        }
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickAttach() {
        super.onBrickAttach();
        p61 p61Var = this.c;
        if (p61Var != null) {
            p61Var.invoke();
        }
        this.c = null;
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        SparseArray sparseArray = this.b;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.keyAt(i);
            ((yj3) sparseArray.valueAt(i)).getClass();
        }
        sparseArray.clear();
    }
}
