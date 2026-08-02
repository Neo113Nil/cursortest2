package xsna;

import com.ironsource.X3;
import kotlin.jvm.internal.Lambda;
import xsna.fh50;

/* compiled from: ObjectList.kt */
/* loaded from: classes11.dex */
public abstract class rp70<E> {
    public Object[] a;
    public int b;

    /* compiled from: ObjectList.kt */
    public static final class a extends Lambda implements izs<E, CharSequence> {
        final /* synthetic */ rp70<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rp70<E> rp70Var) {
            super(1);
            this.this$0 = rp70Var;
        }

        @Override // xsna.izs
        public final CharSequence invoke(Object obj) {
            return obj == this.this$0 ? "(this)" : String.valueOf(obj);
        }
    }

    public static String h(rp70 rp70Var, a aVar, int i) {
        String str = (i & 2) != 0 ? "" : X3.j.d;
        String str2 = (i & 4) == 0 ? X3.j.e : "";
        if ((i & 32) != 0) {
            aVar = null;
        }
        rp70Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str);
        Object[] objArr = rp70Var.a;
        int i2 = rp70Var.b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                sb.append((CharSequence) str2);
                break;
            }
            Object obj = objArr[i3];
            if (i3 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i3 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (aVar == null) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) aVar.invoke(obj));
            }
            i3++;
        }
        return sb.toString();
    }

    public abstract fh50.b a();

    public final boolean b(E e) {
        return e(e) >= 0;
    }

    public final E c() {
        if (!f()) {
            return (E) this.a[0];
        }
        alk.E("ObjectList is empty.");
        throw null;
    }

    public final E d(int i) {
        if (i >= 0 && i < this.b) {
            return (E) this.a[i];
        }
        i(i);
        throw null;
    }

    public final int e(E e) {
        int i = 0;
        if (e == null) {
            Object[] objArr = this.a;
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        Object[] objArr2 = this.a;
        int i3 = this.b;
        while (i < i3) {
            if (e.equals(objArr2[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rp70) {
            rp70 rp70Var = (rp70) obj;
            int i = rp70Var.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = rp70Var.a;
                k9x q = swe0.q(0, i2);
                int i3 = q.b;
                int i4 = q.c;
                if (i3 > i4) {
                    return true;
                }
                while (epx.f(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.b == 0;
    }

    public final boolean g() {
        return this.b != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i2;
    }

    public final void i(int i) {
        StringBuilder b = ji.b(i, "Index ", " must be in 0..");
        b.append(this.b - 1);
        alk.D(b.toString());
        throw null;
    }

    public final String toString() {
        return h(this, new a(this), 25);
    }
}
