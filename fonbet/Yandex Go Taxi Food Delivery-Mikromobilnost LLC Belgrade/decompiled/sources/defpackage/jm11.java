package defpackage;

import com.google.gson.reflect.TypeToken;

/* loaded from: classes11.dex */
public final class jm11 implements ol11 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ nl11 c;

    public /* synthetic */ jm11(Class cls, nl11 nl11Var, int i) {
        this.a = i;
        this.b = cls;
        this.c = nl11Var;
    }

    @Override // defpackage.ol11
    public final nl11 create(u3u u3uVar, TypeToken typeToken) {
        int i = this.a;
        Class cls = this.b;
        switch (i) {
            case 0:
                if (typeToken.getRawType() == cls) {
                    return this.c;
                }
                return null;
            default:
                Class<?> rawType = typeToken.getRawType();
                if (cls.isAssignableFrom(rawType)) {
                    return new occ(this, rawType);
                }
                return null;
        }
    }

    public final String toString() {
        int i = this.a;
        nl11 nl11Var = this.c;
        Class cls = this.b;
        switch (i) {
            case 0:
                return "Factory[type=" + cls.getName() + ",adapter=" + nl11Var + "]";
            default:
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + nl11Var + "]";
        }
    }
}
