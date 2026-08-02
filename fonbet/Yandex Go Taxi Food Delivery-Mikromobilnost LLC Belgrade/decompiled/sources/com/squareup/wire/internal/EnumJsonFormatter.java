package com.squareup.wire.internal;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireEnumConstant;
import defpackage.bvu0;
import defpackage.j73;
import defpackage.jl40;
import defpackage.zzb;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/wire/internal/EnumJsonFormatter;", "E", "Lcom/squareup/wire/WireEnum;", "Lcom/squareup/wire/internal/JsonFormatter;", "adapter", "Lcom/squareup/wire/EnumAdapter;", "<init>", "(Lcom/squareup/wire/EnumAdapter;)V", "stringToValue", "", "", "valueToString", "unrecognizedClassConstructor", "Ljava/lang/reflect/Constructor;", "fromString", "value", "(Ljava/lang/String;)Lcom/squareup/wire/WireEnum;", "toStringOrNumber", "", "(Lcom/squareup/wire/WireEnum;)Ljava/lang/Object;", "wire-runtime"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EnumJsonFormatter<E extends WireEnum> implements JsonFormatter<E> {
    private final Map<String, E> stringToValue;
    private Constructor<E> unrecognizedClassConstructor;
    private final Map<E, String> valueToString;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.squareup.wire.WireEnum[]] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.squareup.wire.WireEnum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.annotation.Annotation[]] */
    public EnumJsonFormatter(EnumAdapter<E> enumAdapter) {
        WireEnumConstant wireEnumConstant;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Class a = ((zzb) enumAdapter.getType()).a();
        ?? r2 = (WireEnum[]) a.getEnumConstants();
        if (r2 == 0) {
            for (Class<?> cls : a.getDeclaredClasses()) {
                String simpleName = cls.getSimpleName();
                if (!simpleName.equals("Companion")) {
                    Field field = (Field) j73.C(cls.getDeclaredFields());
                    if (jl40.l(field.getName(), "INSTANCE")) {
                        WireEnum wireEnum = (WireEnum) field.get(null);
                        linkedHashMap.put(cls.getSimpleName(), wireEnum);
                        linkedHashMap.put(String.valueOf(wireEnum.getValue()), wireEnum);
                        linkedHashMap2.put(wireEnum, simpleName);
                        ?? annotations = cls.getAnnotations();
                        int length = annotations.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                wireEnumConstant = 0;
                                break;
                            }
                            wireEnumConstant = annotations[i];
                            if (wireEnumConstant instanceof WireEnumConstant) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        WireEnumConstant wireEnumConstant2 = wireEnumConstant instanceof WireEnumConstant ? wireEnumConstant : null;
                        if (wireEnumConstant2 != null && wireEnumConstant2.declaredName().length() > 0) {
                            linkedHashMap.put(wireEnumConstant2.declaredName(), wireEnum);
                            linkedHashMap2.put(wireEnum, wireEnumConstant2.declaredName());
                        }
                    } else {
                        this.unrecognizedClassConstructor = (Constructor) j73.C(cls.getConstructors());
                    }
                }
            }
        } else {
            for (?? r5 : r2) {
                String name = ((Enum) r5).name();
                linkedHashMap.put(name, r5);
                linkedHashMap.put(String.valueOf(r5.getValue()), r5);
                linkedHashMap2.put(r5, name);
                WireEnumConstant wireEnumConstant3 = (WireEnumConstant) a.getDeclaredField(name).getAnnotation(WireEnumConstant.class);
                if (wireEnumConstant3 != null && wireEnumConstant3.declaredName().length() > 0) {
                    linkedHashMap.put(wireEnumConstant3.declaredName(), r5);
                    linkedHashMap2.put(r5, wireEnumConstant3.declaredName());
                }
            }
        }
        this.stringToValue = linkedHashMap;
        this.valueToString = linkedHashMap2;
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public E fromString(String value) {
        E e = this.stringToValue.get(value);
        if (e == null) {
            Integer l = bvu0.l(10, value);
            e = null;
            if (l != null) {
                int intValue = l.intValue();
                Constructor<E> constructor = this.unrecognizedClassConstructor;
                if (constructor != null) {
                    return constructor.newInstance(Integer.valueOf(intValue));
                }
            }
        }
        return e;
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public Object toStringOrNumber(E value) {
        String str = this.valueToString.get(value);
        return str == null ? Integer.valueOf(value.getValue()) : str;
    }
}
