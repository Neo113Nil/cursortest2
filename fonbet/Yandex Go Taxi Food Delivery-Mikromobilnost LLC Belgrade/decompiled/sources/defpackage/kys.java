package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.reflect.b;

/* loaded from: classes11.dex */
public final class kys implements GenericArrayType, Type {
    public final Type a;

    public kys(Type type) {
        this.a = type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return jl40.l(this.a, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return b.a(this.a) + "[]";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
