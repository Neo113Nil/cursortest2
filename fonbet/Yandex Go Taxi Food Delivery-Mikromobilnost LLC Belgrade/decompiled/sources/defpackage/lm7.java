package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.l;
import androidx.camera.core.InitializationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class lm7 {
    public final Context a;
    public final jm7 b;
    public final v34 c;
    public final ht7 d;
    public final kr7 e;
    public final gzj f;
    public final long g;
    public final zt7 i;
    public final zn7 j;
    public final xs7 k;
    public final HashMap h = new HashMap();
    public final Object l = new Object();
    public ArrayList m = new ArrayList();

    public lm7(Context context, v34 v34Var, xs7 xs7Var, long j, zt7 zt7Var, hhs0 hhs0Var) {
        this.a = context;
        this.c = v34Var;
        kr7 kr7Var = new kr7(Build.VERSION.SDK_INT >= 30 ? new lr7(context) : new sr4(context));
        this.e = kr7Var;
        this.f = gzj.b(context);
        jm7 jm7Var = new jm7(kr7Var);
        this.b = jm7Var;
        ht7 ht7Var = new ht7(jm7Var);
        this.d = ht7Var;
        synchronized (jm7Var.a) {
            jm7Var.c.add(ht7Var);
        }
        this.g = j;
        this.i = zt7Var;
        this.k = xs7Var;
        try {
            List asList = Arrays.asList(kr7Var.b());
            this.j = new zn7(asList, kr7Var, v34Var.a);
            e(asList);
        } catch (CameraAccessExceptionCompat e) {
            throw new InitializationException(ceb1.b(e));
        }
    }

    public final LinkedHashSet a() {
        LinkedHashSet linkedHashSet;
        synchronized (this.l) {
            linkedHashSet = new LinkedHashSet(this.m);
        }
        return linkedHashSet;
    }

    public final ArrayList b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.equals("0") || str.equals("1")) {
                arrayList2.add(str);
            } else if (wdb1.j(this.e, str)) {
                arrayList2.add(str);
            } else {
                sgb1.g(3, "Camera2CameraFactory");
            }
        }
        return arrayList2;
    }

    public final l c(String str) {
        synchronized (this.l) {
            if (!this.m.contains(str)) {
                throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
            }
        }
        Context context = this.a;
        kr7 kr7Var = this.e;
        rm7 d = d(str);
        jm7 jm7Var = this.b;
        ht7 ht7Var = this.d;
        v34 v34Var = this.c;
        return new l(context, kr7Var, str, d, jm7Var, ht7Var, v34Var.a, v34Var.b, this.f, this.g, this.i);
    }

    public final rm7 d(String str) {
        HashMap hashMap = this.h;
        try {
            rm7 rm7Var = (rm7) hashMap.get(str);
            if (rm7Var != null) {
                return rm7Var;
            }
            rm7 rm7Var2 = new rm7(this.e, str);
            hashMap.put(str, rm7Var2);
            return rm7Var2;
        } catch (CameraAccessExceptionCompat e) {
            throw ceb1.b(e);
        }
    }

    public final void e(List list) {
        try {
            ArrayList b = b(beb1.f(this, this.k, new ArrayList(list)));
            synchronized (this.l) {
                try {
                    if (this.m.equals(b)) {
                        return;
                    }
                    Objects.toString(this.m);
                    b.toString();
                    sgb1.g(3, "Camera2CameraFactory");
                    this.m = b;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InitializationException e) {
            Log.e("Camera2CameraFactory", "Unable to get backward compatible camera ids", e);
            throw e;
        }
    }
}
