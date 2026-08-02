package defpackage;

import android.util.Log;
import android.view.View;
import androidx.core.view.b;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes11.dex */
public abstract class mia1 {
    public static ArrayList a(Object... objArr) {
        int length = objArr.length;
        ela1.a(length, "arraySize");
        ArrayList arrayList = new ArrayList(aka1.g(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static final Object b(xy40 xy40Var) {
        if (xy40Var.d()) {
            w511.i("List is empty.");
            return null;
        }
        int i = xy40Var.b - 1;
        Object b = xy40Var.b(i);
        xy40Var.m(i);
        return b;
    }

    public static final void c(View view) {
        b.p(view, new ug(view, 0));
    }

    public static final mp60 d(mp60 mp60Var, quq0 quq0Var) {
        if (mp60Var.b > 1) {
            int i = 0;
            Comparable comparable = (Comparable) quq0Var.invoke(mp60Var.b(0));
            int i2 = mp60Var.b;
            int i3 = 1;
            while (i3 < i2) {
                Comparable comparable2 = (Comparable) quq0Var.invoke(mp60Var.b(i3));
                if (comparable.compareTo(comparable2) > 0) {
                    xy40 xy40Var = new xy40(mp60Var.b);
                    Object[] objArr = mp60Var.a;
                    int i4 = mp60Var.b;
                    for (int i5 = 0; i5 < i4; i5++) {
                        xy40Var.g(objArr[i5]);
                    }
                    uy40 i6 = xy40Var.i();
                    if (i6.a.b > 1) {
                        xcc.q(i6, new pzo(i, quq0Var));
                    }
                    return xy40Var;
                }
                i3++;
                comparable = comparable2;
            }
        }
        return mp60Var;
    }

    public static final boolean e(sls slsVar, String str) {
        try {
            boolean booleanValue = ((Boolean) slsVar.invoke()).booleanValue();
            if (!booleanValue) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchFieldException unused2) {
            Log.e("ReflectionGuard", "NoSuchField: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused3) {
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }
}
