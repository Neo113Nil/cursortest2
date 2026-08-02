package com.yandex.div.core.animation;

import android.util.Property;

/* compiled from: IntegerProperty.kt */
/* loaded from: classes7.dex */
public abstract class IntegerProperty<T> extends Property<T, Integer> {
    public IntegerProperty(String str) {
        super(Integer.TYPE, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.util.Property
    public /* bridge */ /* synthetic */ void set(Object obj, Integer num) {
        set((IntegerProperty<T>) obj, num.intValue());
    }

    public abstract void setValue(T t, int i);

    public void set(T t, int i) {
        setValue(t, i);
    }
}
