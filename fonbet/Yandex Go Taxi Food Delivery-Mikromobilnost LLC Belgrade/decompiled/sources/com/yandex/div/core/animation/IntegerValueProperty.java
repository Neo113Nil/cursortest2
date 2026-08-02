package com.yandex.div.core.animation;

import defpackage.y131;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/div/core/animation/IntegerValueProperty;", "Lcom/yandex/div/core/animation/IntegerProperty;", "Ly131;", "<init>", "()V", "target", "", "value", "Lzy11;", "setValue", "(Ly131;I)V", "get", "(Ly131;)Ljava/lang/Integer;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class IntegerValueProperty extends IntegerProperty<y131> {
    public static final IntegerValueProperty INSTANCE = new IntegerValueProperty();

    private IntegerValueProperty() {
        super("value");
    }

    @Override // android.util.Property
    public Integer get(y131 target) {
        return Integer.valueOf((int) ((Long) target.d()).longValue());
    }

    @Override // com.yandex.div.core.animation.IntegerProperty
    public void setValue(y131 target, int value) {
        target.i(Long.valueOf(value));
    }
}
