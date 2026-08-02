package com.yandex.div.core.animation;

import android.util.Property;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ \u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/core/animation/IntegerProperty;", "T", "Landroid/util/Property;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "target", "value", "Lzy11;", "setValue", "(Ljava/lang/Object;I)V", "set", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class IntegerProperty<T> extends Property<T, Integer> {
    public IntegerProperty(String str) {
        super(Integer.TYPE, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.util.Property
    public /* bridge */ /* synthetic */ void set(Object obj, Integer num) {
        set((IntegerProperty<T>) obj, num.intValue());
    }

    public abstract void setValue(T target, int value);

    public void set(T target, int value) {
        setValue(target, value);
    }
}
