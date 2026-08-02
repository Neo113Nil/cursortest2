package defpackage;

/* loaded from: classes.dex */
public class m6e0 implements l6e0 {
    public final Object[] a;
    public int b;

    public m6e0(int i) {
        if (i > 0) {
            this.a = new Object[i];
        } else {
            ny61.g("The max pool size must be > 0");
            throw null;
        }
    }

    @Override // defpackage.l6e0
    public Object a() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.b = i - 1;
        return obj;
    }

    @Override // defpackage.l6e0
    public boolean a0(Object obj) {
        int i = this.b;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i2 >= i) {
                int i3 = this.b;
                if (i3 >= objArr.length) {
                    return false;
                }
                objArr[i3] = obj;
                this.b = i3 + 1;
                return true;
            }
            if (objArr[i2] == obj) {
                ny61.r("Already in the pool!");
                return false;
            }
            i2++;
        }
    }

    public void b(i63 i63Var) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            objArr[i] = i63Var;
            this.b = i + 1;
        }
    }

    public m6e0() {
        this.a = new Object[256];
    }
}
