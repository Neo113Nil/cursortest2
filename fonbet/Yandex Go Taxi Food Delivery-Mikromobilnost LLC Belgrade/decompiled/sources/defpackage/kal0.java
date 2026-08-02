package defpackage;

import android.graphics.Rect;
import com.yandex.go.preorder.navigation.ModalsVisibility;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class kal0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ m9l0 b;

    public /* synthetic */ kal0(m9l0 m9l0Var, int i) {
        this.a = i;
        this.b = m9l0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        m9l0 m9l0Var = this.b;
        switch (i) {
            case 0:
                int i2 = jal0.a[((ModalsVisibility) obj).ordinal()];
                boolean z = true;
                if (i2 != 1) {
                    if (i2 != 2) {
                        w511.b();
                        break;
                    } else {
                        z = false;
                    }
                }
                m9l0Var.animateVisibility(z);
                break;
            case 1:
                m9l0Var.applyStyle((e430) obj);
                break;
            case 2:
                Pair pair = (Pair) obj;
                m9l0Var.onPinRectForBubbleChanged((Rect) pair.getFirst(), ((Boolean) pair.getSecond()).booleanValue());
                break;
            default:
                Pair pair2 = (Pair) obj;
                m9l0Var.setBubbleText((CharSequence) pair2.getFirst(), ((Boolean) pair2.getSecond()).booleanValue());
                break;
        }
        return zy11Var;
    }
}
