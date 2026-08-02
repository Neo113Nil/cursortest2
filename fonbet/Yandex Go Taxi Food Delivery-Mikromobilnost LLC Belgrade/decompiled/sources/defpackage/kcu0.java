package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class kcu0 {
    public final h3y a;
    public final k020 b;
    public final odu0 c;
    public final h3y d;
    public final Handler e = new Handler(Looper.getMainLooper());
    public final zq60 f = new zq60();

    public kcu0(h3y h3yVar, k020 k020Var, odu0 odu0Var, h3y h3yVar2) {
        this.a = h3yVar;
        this.b = k020Var;
        this.c = odu0Var;
        this.d = h3yVar2;
    }

    public final void a(String[] strArr) {
        boolean z;
        z83.g(null, this.a.get(), Looper.myLooper());
        zq60 zq60Var = this.f;
        zq60Var.getClass();
        zq60Var.b++;
        ArrayList arrayList = zq60Var.a;
        int size = arrayList.size();
        int i = 0;
        boolean z2 = false;
        while (true) {
            int i2 = i;
            while (i2 < size && arrayList.get(i2) == null) {
                i2++;
            }
            if (i2 < size) {
                z = true;
            } else {
                if (!z2) {
                    zq60.a(zq60Var);
                    z2 = true;
                }
                z = false;
            }
            if (!z) {
                return;
            }
            while (i < size && arrayList.get(i) == null) {
                i++;
            }
            if (i >= size) {
                if (!z2) {
                    zq60.a(zq60Var);
                }
                ny61.p();
                return;
            }
            int i3 = i + 1;
            jcu0 jcu0Var = (jcu0) arrayList.get(i);
            kcu0 kcu0Var = jcu0Var.x;
            h3y h3yVar = kcu0Var.a;
            Handler handler = kcu0Var.e;
            z83.g(null, h3yVar.get(), Looper.myLooper());
            int length = strArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    handler.post(new icu0(jcu0Var, 3));
                    break;
                } else {
                    if (strArr[i4].equals(jcu0Var.a)) {
                        handler.post(new icu0(jcu0Var, 2));
                        break;
                    }
                    i4++;
                }
            }
            i = i3;
        }
    }
}
