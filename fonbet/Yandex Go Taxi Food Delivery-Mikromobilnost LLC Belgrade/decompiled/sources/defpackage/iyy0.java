package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes9.dex */
public class iyy0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(iyy0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public igo[] a;

    public final void a(igo igoVar) {
        igoVar.c((jgo) this);
        igo[] igoVarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (igoVarArr == null) {
            igoVarArr = new igo[4];
            this.a = igoVarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= igoVarArr.length) {
            igoVarArr = (igo[]) Arrays.copyOf(igoVarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.a = igoVarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        igoVarArr[i] = igoVar;
        igoVar.b = i;
        while (i > 0) {
            Object[] objArr = this.a;
            int i2 = (i - 1) / 2;
            if (objArr[i2].compareTo(objArr[i]) <= 0) {
                return;
            }
            c(i, i2);
            i = i2;
        }
    }

    public final igo b(int i) {
        Object[] objArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            c(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i <= 0 || objArr[i].compareTo(objArr[i2]) >= 0) {
                while (true) {
                    int i3 = i * 2;
                    int i4 = i3 + 1;
                    if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                    }
                    Object[] objArr2 = this.a;
                    int i5 = i3 + 2;
                    if (i5 >= atomicIntegerFieldUpdater.get(this) || objArr2[i5].compareTo(objArr2[i4]) >= 0) {
                        i5 = i4;
                    }
                    if (objArr2[i].compareTo(objArr2[i5]) <= 0) {
                        break;
                    }
                    c(i, i5);
                    i = i5;
                }
            } else {
                c(i, i2);
                while (i2 > 0) {
                    Object[] objArr3 = this.a;
                    int i6 = (i2 - 1) / 2;
                    if (objArr3[i6].compareTo(objArr3[i2]) <= 0) {
                        break;
                    }
                    c(i2, i6);
                    i2 = i6;
                }
            }
        }
        igo igoVar = objArr[atomicIntegerFieldUpdater.get(this)];
        igoVar.c(null);
        igoVar.b = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return igoVar;
    }

    public final void c(int i, int i2) {
        igo[] igoVarArr = this.a;
        igo igoVar = igoVarArr[i2];
        igo igoVar2 = igoVarArr[i];
        igoVarArr[i] = igoVar;
        igoVarArr[i2] = igoVar2;
        igoVar.b = i;
        igoVar2.b = i2;
    }
}
