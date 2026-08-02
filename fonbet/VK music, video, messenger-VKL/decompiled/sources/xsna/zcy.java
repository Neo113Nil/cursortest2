package xsna;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: Key.java */
/* loaded from: classes11.dex */
public abstract class zcy {
    public int a = -1;
    public int b = -1;
    public String c = null;
    public HashMap<String, ConstraintAttribute> d;

    public static float g(Number number) {
        return number instanceof Float ? ((Float) number).floatValue() : Float.parseFloat(number.toString());
    }

    public static int h(Number number) {
        return number instanceof Integer ? ((Integer) number).intValue() : Integer.parseInt(number.toString());
    }

    public abstract void a(HashMap<String, w0u0> hashMap);

    @Override // 
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract zcy clone();

    public zcy c(zcy zcyVar) {
        this.a = zcyVar.a;
        this.b = zcyVar.b;
        this.c = zcyVar.c;
        this.d = zcyVar.d;
        return this;
    }

    public abstract void d(HashSet<String> hashSet);

    public abstract void e(Context context, AttributeSet attributeSet);

    public void f(HashMap<String, Integer> hashMap) {
    }
}
