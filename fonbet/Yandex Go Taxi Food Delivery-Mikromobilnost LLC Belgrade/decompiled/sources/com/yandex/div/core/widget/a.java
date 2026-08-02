package com.yandex.div.core.widget;

import android.view.View;
import android.widget.TextView;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.internal.view.OverridableOnPreDrawListener;
import defpackage.hcm;
import defpackage.jl40;
import defpackage.o80;
import defpackage.xz20;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
public final class a {
    public final TextView a;
    public final hcm b;
    public AdaptiveMaxLines$addAttachListener$1 c;
    public OverridableOnPreDrawListener d;
    public o80 e;
    public boolean f;

    public a(DivLineHeightTextView divLineHeightTextView, hcm hcmVar) {
        this.a = divLineHeightTextView;
        this.b = hcmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View$OnAttachStateChangeListener, com.yandex.div.core.widget.AdaptiveMaxLines$addAttachListener$1] */
    public final void a(o80 o80Var) {
        if (jl40.l(this.e, o80Var)) {
            return;
        }
        this.e = o80Var;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        TextView textView = this.a;
        if (textView.isAttachedToWindow() && this.d == null) {
            OverridableOnPreDrawListener overridableOnPreDrawListener = new OverridableOnPreDrawListener(new xz20(1, new AdaptiveMaxLines$addPreDrawListener$1(this)), this.b);
            textView.getViewTreeObserver().addOnPreDrawListener(overridableOnPreDrawListener);
            this.d = overridableOnPreDrawListener;
        }
        if (this.c != null) {
            return;
        }
        ?? r0 = new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.widget.AdaptiveMaxLines$addAttachListener$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                a aVar = a.this;
                if (aVar.d != null) {
                    return;
                }
                OverridableOnPreDrawListener overridableOnPreDrawListener2 = new OverridableOnPreDrawListener(new xz20(1, new AdaptiveMaxLines$addPreDrawListener$1(aVar)), aVar.b);
                aVar.a.getViewTreeObserver().addOnPreDrawListener(overridableOnPreDrawListener2);
                aVar.d = overridableOnPreDrawListener2;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                a.this.b();
            }
        };
        textView.addOnAttachStateChangeListener(r0);
        this.c = r0;
    }

    public final void b() {
        OverridableOnPreDrawListener overridableOnPreDrawListener = this.d;
        if (overridableOnPreDrawListener != null) {
            this.a.getViewTreeObserver().removeOnPreDrawListener(overridableOnPreDrawListener);
        }
        this.d = null;
    }

    public final void c() {
        AdaptiveMaxLines$addAttachListener$1 adaptiveMaxLines$addAttachListener$1 = this.c;
        if (adaptiveMaxLines$addAttachListener$1 != null) {
            this.a.removeOnAttachStateChangeListener(adaptiveMaxLines$addAttachListener$1);
        }
        this.c = null;
        b();
    }
}
