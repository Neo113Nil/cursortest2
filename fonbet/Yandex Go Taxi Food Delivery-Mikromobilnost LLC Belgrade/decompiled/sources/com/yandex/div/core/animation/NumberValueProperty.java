package com.yandex.div.core.animation;

import android.util.Log;
import defpackage.x131;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/div/core/animation/NumberValueProperty;", "Lcom/yandex/div/core/animation/FloatProperty;", "Lx131;", "<init>", "()V", "target", "", "value", "Lzy11;", "setValue", "(Lx131;F)V", "get", "(Lx131;)Ljava/lang/Float;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NumberValueProperty extends FloatProperty<x131> {
    public static final NumberValueProperty INSTANCE = new NumberValueProperty();

    private NumberValueProperty() {
        super("value");
    }

    @Override // android.util.Property
    public Float get(x131 target) {
        return Float.valueOf((float) ((Double) target.d()).doubleValue());
    }

    @Override // com.yandex.div.core.animation.FloatProperty
    public void setValue(x131 target, float value) {
        Log.i("NumberValueProperty", "set variable value: " + value);
        target.i(Double.valueOf((double) value));
    }
}
