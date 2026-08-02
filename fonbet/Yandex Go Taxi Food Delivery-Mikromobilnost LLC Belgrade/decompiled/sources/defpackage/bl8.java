package defpackage;

import android.content.Context;
import android.view.View;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes13.dex */
public final class bl8 implements jt31 {
    public final i3y a;

    public bl8(Context context) {
        this.a = a.b(LazyThreadSafetyMode.NONE, new n5(context, 8));
    }

    @Override // defpackage.jt31
    public final void c(float f, View view) {
        view.setScaleY(1.0f - (Math.abs(f) * 0.1f));
        view.setTranslationX(((Number) this.a.getValue()).floatValue() * f);
    }
}
