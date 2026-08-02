package defpackage;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: classes11.dex */
public class m63 implements ol11 {
    @Override // defpackage.ol11
    public final nl11 create(u3u u3uVar, TypeToken typeToken) {
        Type type = typeToken.getType();
        boolean z = type instanceof GenericArrayType;
        if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
        return new n63(u3uVar, u3uVar.e(TypeToken.get(genericComponentType)), si91.m(genericComponentType));
    }
}
