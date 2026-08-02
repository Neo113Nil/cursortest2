package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes10.dex */
public abstract class jhx {
    public int a = -1;
    public int b = -1;
    public String c = null;
    public HashMap d;

    public static float g(Number number) {
        return number instanceof Float ? ((Float) number).floatValue() : Float.parseFloat(number.toString());
    }

    public abstract void a(HashMap hashMap);

    @Override // 
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract jhx clone();

    public jhx c(jhx jhxVar) {
        this.a = jhxVar.a;
        this.b = jhxVar.b;
        this.c = jhxVar.c;
        this.d = jhxVar.d;
        return this;
    }

    public abstract void d(HashSet hashSet);

    public abstract void e(Context context, AttributeSet attributeSet);

    public void f(HashMap hashMap) {
    }
}
