package defpackage;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes15.dex */
public final class bex implements JsonAdapter.Factory {
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009b, code lost:
    
        return null;
     */
    @Override // com.squareup.moshi.JsonAdapter.Factory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JsonAdapter create(Type type, Set set, Moshi moshi) {
        ArrayList arrayList = null;
        for (Class<?> rawType = Types.getRawType(type); rawType != null && rawType != Object.class && !rawType.isPrimitive(); rawType = rawType.getSuperclass()) {
            for (Field field : rawType.getDeclaredFields()) {
                if (field.isAnnotationPresent(cex.class)) {
                    if (field.getType().isPrimitive()) {
                        ny61.r("@JsonRequired can be applied for non-primitive fields only.");
                        return null;
                    }
                    int modifiers = field.getModifiers();
                    if (Modifier.isStatic(modifiers) || Modifier.isTransient(modifiers)) {
                        vg10.n(field.getName(), ": JsonRequired can be applied for serializable fields only.");
                        return null;
                    }
                    if (Modifier.isPrivate(modifiers)) {
                        String name = field.getName();
                        try {
                            rawType.getMethod("get" + name.substring(0, 1).toUpperCase(Locale.US) + name.substring(1), null);
                        } catch (NoSuchMethodException unused) {
                            vg10.n(field.getName(), ": JsonRequired can be applied for serializable fields only.");
                            return null;
                        }
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(field);
                }
            }
        }
        return new dex(moshi.nextAdapter(this, type, set), arrayList);
    }
}
