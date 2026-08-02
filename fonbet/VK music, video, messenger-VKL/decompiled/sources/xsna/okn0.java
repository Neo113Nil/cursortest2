package xsna;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.Arrays;

/* compiled from: SuspendingPointerInputFilter.kt */
/* loaded from: classes11.dex */
public final class okn0 extends d730<xkn0> {
    public final Object a;
    public final Object b;
    public final Object[] c;
    public final PointerInputEventHandler d;

    public okn0(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj = (i & 1) != 0 ? null : obj;
        obj2 = (i & 2) != 0 ? null : obj2;
        objArr = (i & 4) != 0 ? null : objArr;
        this.a = obj;
        this.b = obj2;
        this.c = objArr;
        this.d = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof okn0)) {
            return false;
        }
        okn0 okn0Var = (okn0) obj;
        if (!epx.f(this.a, okn0Var.a) || !epx.f(this.b, okn0Var.b)) {
            return false;
        }
        Object[] objArr = this.c;
        if (objArr != null) {
            Object[] objArr2 = okn0Var.c;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (okn0Var.c != null) {
            return false;
        }
        return this.d == okn0Var.d;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        int hashCode2 = (hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.c;
        return this.d.hashCode() + ((hashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }

    @Override // xsna.d730
    public final xkn0 r() {
        return new xkn0(this.a, this.b, this.c, this.d);
    }

    @Override // xsna.d730
    public final void s(xkn0 xkn0Var) {
        xkn0 xkn0Var2 = xkn0Var;
        Object obj = xkn0Var2.p;
        Object obj2 = this.a;
        boolean z = !epx.f(obj, obj2);
        xkn0Var2.p = obj2;
        Object obj3 = xkn0Var2.q;
        Object obj4 = this.b;
        if (!epx.f(obj3, obj4)) {
            z = true;
        }
        xkn0Var2.q = obj4;
        Object[] objArr = xkn0Var2.r;
        Object[] objArr2 = this.c;
        if (objArr != null && objArr2 == null) {
            z = true;
        }
        if (objArr == null && objArr2 != null) {
            z = true;
        }
        if (objArr != null && objArr2 != null && !Arrays.equals(objArr2, objArr)) {
            z = true;
        }
        xkn0Var2.r = objArr2;
        Class<?> cls = xkn0Var2.s.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.d;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            xkn0Var2.x0();
        }
        xkn0Var2.s = pointerInputEventHandler;
    }
}
