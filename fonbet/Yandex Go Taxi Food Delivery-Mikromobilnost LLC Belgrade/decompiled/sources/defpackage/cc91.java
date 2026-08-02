package defpackage;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes11.dex */
public abstract class cc91 {
    static {
        cc91.class.getClassLoader();
    }

    public static void a(Parcel parcel, IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iObjectWrapper.asBinder());
        }
    }
}
