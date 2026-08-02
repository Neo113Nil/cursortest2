package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lightside.visum.layouts.constraint.ConstraintLayoutBuilder;
import com.lightside.visum.layouts.constraint.ConstraintSetBuilder;
import kotlin.a;

/* loaded from: classes2.dex */
public abstract class l7e implements rs11, lzx {
    public final Context a;
    public final ConstraintLayoutBuilder b;
    public final i3y c;

    public l7e(ContextWrapper contextWrapper) {
        ConstraintLayoutBuilder constraintLayoutBuilder = new ConstraintLayoutBuilder(contextWrapper);
        this.a = contextWrapper;
        this.b = constraintLayoutBuilder;
        this.c = a.a(new lyc(13, this));
    }

    public abstract void a(ConstraintSetBuilder constraintSetBuilder);

    @Override // defpackage.lzx
    public final void addToParent(View view) {
        this.b.addToParent(view);
    }

    @Override // defpackage.lzx
    public final void attachTo(ViewManager viewManager) {
        this.b.attachTo(viewManager);
    }

    @Override // defpackage.rs11
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout getRoot() {
        return (ConstraintLayout) this.c.getValue();
    }

    public abstract void c(ConstraintLayout constraintLayout);

    @Override // defpackage.lzx
    public final ViewGroup.LayoutParams generateLayoutParams(int i, int i2) {
        return this.b.generateLayoutParams(i, i2);
    }

    @Override // defpackage.kp31
    public final Context getCtx() {
        return this.a;
    }

    @Override // defpackage.lzx
    public final View invoke(View view, tls tlsVar) {
        return this.b.invoke(view, tlsVar);
    }
}
