package defpackage;

import android.util.Property;
import android.view.View;
import com.yandex.go.shortcuts.impl.ui.feed.AnimatorUtilsKt$HEIGHT_PROPERTY$1;

/* loaded from: classes13.dex */
public abstract class ek2 {
    public static final AnimatorUtilsKt$HEIGHT_PROPERTY$1 a;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.go.shortcuts.impl.ui.feed.AnimatorUtilsKt$HEIGHT_PROPERTY$1] */
    static {
        final Class cls = Integer.TYPE;
        a = new Property<View, Integer>(cls) { // from class: com.yandex.go.shortcuts.impl.ui.feed.AnimatorUtilsKt$HEIGHT_PROPERTY$1
            @Override // android.util.Property
            public Integer get(View view) {
                return Integer.valueOf(view.getHeight());
            }

            public void set(View view, int value) {
                view.getLayoutParams().height = value;
                view.setLayoutParams(view.getLayoutParams());
            }

            @Override // android.util.Property
            public /* bridge */ /* synthetic */ void set(View view, Integer num) {
                set(view, num.intValue());
            }
        };
    }
}
