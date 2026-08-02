package yads;

import android.content.Context;
import java.util.ArrayList;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class ei1 {
    public static ArrayList a(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new te1(context, new fi1()));
        qu2 a = gx2.a().a(context);
        if (a == null || a.g) {
            return arrayList;
        }
        if (b01.b == null) {
            synchronized (b01.a) {
                try {
                    if (b01.b == null) {
                        b01.b = new yy0(context, "com.google.android.gms.location.LocationServices");
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        yy0 yy0Var = b01.b;
        if (yy0Var == null) {
            throw new IllegalStateException("Required value was null.");
        }
        arrayList.add(yy0Var);
        arrayList.add(z01.a(context));
        return arrayList;
    }
}
