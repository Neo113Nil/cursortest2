package com.yandex.dsl.views.layouts.constraint;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.i3y;
import defpackage.kzx;
import defpackage.ms11;
import defpackage.sls;
import defpackage.tls;
import defpackage.zy11;

/* loaded from: classes11.dex */
public abstract class b implements ms11, kzx {
    public final Context a;
    public final ConstraintLayoutBuilder b;
    public final i3y c;

    public b(Context context) {
        ConstraintLayoutBuilder constraintLayoutBuilder = new ConstraintLayoutBuilder(context);
        this.a = context;
        this.b = constraintLayoutBuilder;
        this.c = kotlin.a.a(new sls() { // from class: com.yandex.dsl.views.layouts.constraint.ConstraintLayoutUi$root$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                final b bVar = b.this;
                ConstraintLayoutBuilder constraintLayoutBuilder2 = bVar.b;
                tls tlsVar = new tls() { // from class: com.yandex.dsl.views.layouts.constraint.ConstraintLayoutUi$root$2$1$1
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        b.this.a((ConstraintSetBuilder) obj);
                        return zy11.a;
                    }
                };
                ConstraintSetBuilder constraintSetBuilder = new ConstraintSetBuilder();
                constraintSetBuilder.g(constraintLayoutBuilder2);
                tlsVar.invoke(constraintSetBuilder);
                constraintSetBuilder.b(constraintLayoutBuilder2);
                return constraintLayoutBuilder2;
            }
        });
    }

    public abstract void a(ConstraintSetBuilder constraintSetBuilder);

    @Override // defpackage.kzx
    public final void addToParent(View view) {
        this.b.addToParent(view);
    }

    @Override // defpackage.kzx
    public final void attachTo(ViewManager viewManager) {
        this.b.attachTo(viewManager);
    }

    @Override // defpackage.ms11
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout getRoot() {
        return (ConstraintLayout) this.c.getValue();
    }

    @Override // defpackage.kzx
    public final ViewGroup.LayoutParams generateLayoutParams(int i, int i2) {
        return this.b.generateLayoutParams(i, i2);
    }

    @Override // defpackage.jp31
    public final Context getCtx() {
        return this.a;
    }

    @Override // defpackage.kzx
    public final View invoke(View view, tls tlsVar) {
        return this.b.invoke(view, tlsVar);
    }
}
