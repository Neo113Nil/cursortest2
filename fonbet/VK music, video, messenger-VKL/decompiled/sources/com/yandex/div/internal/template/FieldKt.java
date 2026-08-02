package com.yandex.div.internal.template;

import com.yandex.div.internal.template.Field;

/* compiled from: Field.kt */
/* loaded from: classes7.dex */
public final class FieldKt {
    public static final <T> Field<T> clone(Field<T> field, boolean z) {
        if (field == null || field.equals(Field.Null.INSTANCE) || field.equals(Field.Placeholder.INSTANCE)) {
            return Field.Companion.nullField(z);
        }
        if (field instanceof Field.Value) {
            return new Field.Value(z, ((Field.Value) field).value);
        }
        if (field instanceof Field.Reference) {
            return new Field.Reference(z, ((Field.Reference) field).reference);
        }
        throw new IllegalStateException("Unknown field type");
    }
}
