package com.squareup.moshi;

import defpackage.jl40;
import defpackage.lfx;
import defpackage.mgx;
import defpackage.zzb;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Set;
import kotlin.Metadata;
import kotlin.reflect.b;

@Metadata(d1 = {"\u00006\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0018\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0001\u0018\u0001H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0001\u0018\u0001H\u0087\b¢\u0006\u0004\b\b\u0010\u0007\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u000b\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\r¢\u0006\u0004\b\u000b\u0010\u000e\u001a\u0011\u0010\u000b\u001a\u00020\n*\u00020\u000f¢\u0006\u0004\b\u000b\u0010\u0010\"\u0019\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0011*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"", "T", "", "nextAnnotations", "(Ljava/util/Set;)Ljava/util/Set;", "Ljava/lang/reflect/WildcardType;", "subtypeOf", "()Ljava/lang/reflect/WildcardType;", "supertypeOf", "Lmgx;", "Ljava/lang/reflect/GenericArrayType;", "asArrayType", "(Lmgx;)Ljava/lang/reflect/GenericArrayType;", "Llfx;", "(Llfx;)Ljava/lang/reflect/GenericArrayType;", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Type;)Ljava/lang/reflect/GenericArrayType;", "Ljava/lang/Class;", "getRawType", "(Ljava/lang/reflect/Type;)Ljava/lang/Class;", "rawType", "moshi"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class _MoshiKotlinTypesExtensionsKt {
    public static final GenericArrayType asArrayType(lfx lfxVar) {
        return asArrayType(((zzb) lfxVar).a());
    }

    public static final Class<?> getRawType(Type type) {
        return Types.getRawType(type);
    }

    public static final <T extends Annotation> Set<Annotation> nextAnnotations(Set<? extends Annotation> set) {
        jl40.P();
        throw null;
    }

    public static final <T> WildcardType subtypeOf() {
        jl40.P();
        throw null;
    }

    public static final <T> WildcardType supertypeOf() {
        jl40.P();
        throw null;
    }

    public static final GenericArrayType asArrayType(mgx mgxVar) {
        return asArrayType(b.d(mgxVar));
    }

    public static final GenericArrayType asArrayType(Type type) {
        return Types.arrayOf(type);
    }
}
