package xsna;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;

/* compiled from: DisposableSaveableStateRegistry.android.kt */
/* loaded from: classes11.dex */
public final class ugn {
    public static final Class<? extends Object>[] a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean a(Object obj) {
        if (obj instanceof yak0) {
            yak0 yak0Var = (yak0) obj;
            if (yak0Var.d() == w65.e || yak0Var.d() == k0x.c || yak0Var.d() == hg10.g) {
                T value = yak0Var.getValue();
                if (value == 0) {
                    return true;
                }
                return a(value);
            }
        } else {
            if ((obj instanceof xzs) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i = 0; i < 7; i++) {
                if (a[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }
}
