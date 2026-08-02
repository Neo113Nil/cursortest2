package com.yandex.alicekit.core.views.animator;

import android.view.View;
import defpackage.g8e;
import defpackage.tls;
import defpackage.zj2;
import defpackage.zy11;
import kotlin.Pair;

/* loaded from: classes11.dex */
public final class a {
    public final View a;
    public final tls b;

    public a(View view, tls tlsVar) {
        this.a = view;
        this.b = tlsVar;
    }

    public final void a(Pair pair) {
        final float floatValue = ((Number) pair.c()).floatValue();
        final float floatValue2 = ((Number) pair.f()).floatValue();
        ((DslAnimatorBuilder$targets$1) this.b).invoke(new zj2(new tls() { // from class: com.yandex.alicekit.core.views.animator.ViewAnimatorBuilder$alpha$$inlined$onNewValue$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                float floatValue3 = ((Number) obj).floatValue();
                float f = floatValue;
                this.a.setAlpha(g8e.b(floatValue2, f, floatValue3, f));
                return zy11.a;
            }
        }));
    }
}
