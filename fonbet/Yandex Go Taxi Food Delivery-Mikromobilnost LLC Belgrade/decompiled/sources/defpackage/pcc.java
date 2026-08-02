package defpackage;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes11.dex */
public final class pcc implements ol11 {
    public final /* synthetic */ int a;
    public final tis0 b;

    public /* synthetic */ pcc(tis0 tis0Var, int i) {
        this.a = i;
        this.b = tis0Var;
    }

    @Override // defpackage.ol11
    public final nl11 create(u3u u3uVar, TypeToken typeToken) {
        Class cls;
        Type[] actualTypeArguments;
        int i = this.a;
        tis0 tis0Var = this.b;
        cls = Object.class;
        switch (i) {
            case 0:
                Type type = typeToken.getType();
                Class rawType = typeToken.getRawType();
                if (!Collection.class.isAssignableFrom(rawType)) {
                    return null;
                }
                Type n = si91.n(type, rawType, Collection.class);
                cls = n instanceof ParameterizedType ? ((ParameterizedType) n).getActualTypeArguments()[0] : Object.class;
                return new occ(new h7x(u3uVar, u3uVar.e(TypeToken.get(cls)), cls), tis0Var.J(typeToken, false));
            default:
                Type type2 = typeToken.getType();
                Class rawType2 = typeToken.getRawType();
                if (!Map.class.isAssignableFrom(rawType2)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(rawType2)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    Type n2 = si91.n(type2, rawType2, Map.class);
                    actualTypeArguments = n2 instanceof ParameterizedType ? ((ParameterizedType) n2).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                Type type4 = actualTypeArguments[1];
                return new h7x(this, new h7x(u3uVar, (type3 == Boolean.TYPE || type3 == Boolean.class) ? um11.c : u3uVar.e(TypeToken.get(type3)), type3), new h7x(u3uVar, u3uVar.e(TypeToken.get(type4)), type4), tis0Var.J(typeToken, false));
        }
    }
}
