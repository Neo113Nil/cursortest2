package com.yandex.messaging.protojson;

import com.squareup.moshi.Types;
import defpackage.w511;
import defpackage.y6a1;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class Util$ParameterizedTypeImpl implements ParameterizedType {
    public final Type a;
    public final Type b;
    public final Type[] c;

    public Util$ParameterizedTypeImpl(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
            if (type != null) {
                if (enclosingClass == null || Types.getRawType(type) != enclosingClass) {
                    w511.l("unexpected owner type for ", type2, Extension.COLON_SPACE, type);
                    throw null;
                }
            } else if (enclosingClass != null) {
                w511.t("unexpected owner type for ", type2, ": null");
                throw null;
            }
        }
        this.a = type != null ? y6a1.b(type) : null;
        this.b = y6a1.b(type2);
        this.c = (Type[]) typeArr.clone();
        int i = 0;
        while (true) {
            Type[] typeArr2 = this.c;
            if (i >= typeArr2.length) {
                return;
            }
            typeArr2[i].getClass();
            y6a1.c(this.c[i]);
            Type[] typeArr3 = this.c;
            typeArr3[i] = y6a1.b(typeArr3[i]);
            i++;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && Types.equals(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.c) ^ this.b.hashCode();
        Type type = this.a;
        return (type != null ? type.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        Type[] typeArr = this.c;
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(y6a1.f(this.b));
        if (typeArr.length == 0) {
            return sb.toString();
        }
        sb.append("<");
        sb.append(y6a1.f(typeArr[0]));
        for (int i = 1; i < typeArr.length; i++) {
            sb.append(Extension.FIX_SPACE);
            sb.append(y6a1.f(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
