package defpackage;

import android.content.SharedPreferences;
import com.ybsdk.network.retrofit.e;
import com.ybsdk.rconfig.b;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public abstract class k9 implements xbi0, ag7 {
    public final Object a;
    public final Object b;
    public Object c;
    public final Object w;

    public k9(Type type, e eVar, Annotation[] annotationArr, b bVar) {
        this.a = type;
        this.b = eVar;
        this.c = annotationArr;
        this.w = bVar;
    }

    public gy4 a(yv60 yv60Var) {
        Annotation[] annotationArr = (Annotation[]) this.c;
        int length = annotationArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            }
            if (annotationArr[i] instanceof onj) {
                break;
            }
            i++;
        }
        return new gy4(this, z, (k1k0) yv60Var.k().c(k1k0.class));
    }

    public abstract Object b(SharedPreferences sharedPreferences, Object obj, String str);

    public abstract void c(SharedPreferences sharedPreferences, Object obj, String str);

    @Override // defpackage.vbi0
    public Object getValue(Object obj, kgx kgxVar) {
        Object obj2 = this.c;
        if (obj2 != null) {
            return obj2;
        }
        Object b = b((SharedPreferences) this.a, this.b, (String) this.w);
        this.c = b;
        return b;
    }

    @Override // defpackage.ag7
    public Type n() {
        return (Type) this.a;
    }

    @Override // defpackage.xbi0
    public void setValue(Object obj, kgx kgxVar, Object obj2) {
        this.c = obj2;
        c((SharedPreferences) this.a, obj2, (String) this.w);
    }

    public k9(SharedPreferences sharedPreferences, Object obj, String str) {
        this.a = sharedPreferences;
        this.b = obj;
        this.w = str;
    }
}
