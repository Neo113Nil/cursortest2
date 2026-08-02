package defpackage;

import sun.misc.Unsafe;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class km91 {
    public static /* synthetic */ boolean a(Unsafe unsafe, ql91 ql91Var, long j, Object obj, Object obj2) {
        while (!fm91.a(unsafe, ql91Var, j, obj, obj2)) {
            if (unsafe.getObject(ql91Var, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
