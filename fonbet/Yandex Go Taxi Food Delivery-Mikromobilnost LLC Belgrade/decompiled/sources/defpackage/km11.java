package defpackage;

import com.google.gson.reflect.TypeToken;

/* loaded from: classes11.dex */
public final class km11 implements ol11 {
    public final /* synthetic */ Class a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ nl11 c;

    public km11(Class cls, Class cls2, nl11 nl11Var) {
        this.a = cls;
        this.b = cls2;
        this.c = nl11Var;
    }

    @Override // defpackage.ol11
    public final nl11 create(u3u u3uVar, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (rawType == this.a || rawType == this.b) {
            return this.c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.b.getName() + "+" + this.a.getName() + ",adapter=" + this.c + "]";
    }
}
