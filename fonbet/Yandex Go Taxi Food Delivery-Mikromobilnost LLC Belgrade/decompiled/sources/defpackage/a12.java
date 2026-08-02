package defpackage;

import androidx.compose.foundation.gestures.z;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class a12 implements PointerInputEventHandler {
    public static final a12 b = new a12(0);
    public static final a12 c = new a12(1);
    public static final a12 d = new a12(2);
    public static final a12 e = new a12(3);
    public static final a12 f = new a12(4);
    public static final a12 g = new a12(5);
    public static final a12 h = new a12(6);
    public static final a12 i = new a12(7);
    public static final a12 j = new a12(8);
    public static final a12 k = new a12(9);
    public static final a12 l = new a12(10);
    public static final a12 m = new a12(11);
    public static final a12 n = new a12(12);
    public final /* synthetic */ int a;

    public /* synthetic */ a12(int i2) {
        this.a = i2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        int i2 = this.a;
        zy11 zy11Var = zy11.a;
        switch (i2) {
            case 0:
                return z.f(hwd0Var, null, null, new xvq(16), continuation, 7);
            case 1:
                return z.f(hwd0Var, null, null, new xvq(16), continuation, 7);
            case 2:
                return z.f(hwd0Var, null, null, new xvq(16), continuation, 7);
            case 3:
            case 4:
                return zy11Var;
            case 5:
                return z.f(hwd0Var, null, null, new xvq(16), continuation, 7);
            case 6:
                return z.f(hwd0Var, null, null, new xvq(16), continuation, 7);
            case 7:
                return z.f(hwd0Var, null, null, new xvq(16), continuation, 7);
            case 8:
                return z.f(hwd0Var, null, null, new xvq(16), continuation, 7);
            case 9:
                return z.f(hwd0Var, null, null, new xvq(16), continuation, 7);
            case 10:
            case 11:
            default:
                return zy11Var;
        }
    }
}
