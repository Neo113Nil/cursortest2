package com.yandex.div.core.animation;

import android.util.Property;

/* compiled from: FloatProperty.kt */
/* loaded from: classes7.dex */
public abstract class FloatProperty<T> extends Property<T, Float> {
    public FloatProperty(String str) {
        super(Float.TYPE, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.util.Property
    public /* bridge */ /* synthetic */ void set(Object obj, Float f) {
        set((FloatProperty<T>) obj, f.floatValue());
    }

    public abstract void setValue(T t, float f);

    public void set(T t, float f) {
        setValue(t, f);
    }
}
