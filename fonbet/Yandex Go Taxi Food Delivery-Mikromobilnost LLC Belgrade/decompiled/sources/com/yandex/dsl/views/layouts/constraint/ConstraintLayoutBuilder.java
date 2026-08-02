package com.yandex.dsl.views.layouts.constraint;

import android.content.Context;
import android.view.View;
import android.view.ViewManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.kzx;
import defpackage.mzx;
import defpackage.tls;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0015\u001a\u00020\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u0006H\u0097\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0018\u001a\u00020\f*\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J2\u0010\u001d\u001a\u00028\u0000\"\b\b\u0000\u0010\u001a*\u00020\u0017*\u00028\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u001bH\u0096\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010!\u001a\u00020 \"\b\b\u0000\u0010\u001f*\u00020\u0017*\u00028\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\f0\u001b¢\u0006\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/yandex/dsl/views/layouts/constraint/ConstraintLayoutBuilder;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkzx;", "Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;", "Landroid/content/Context;", "context", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;II)V", "(Landroid/content/Context;)V", "Lzy11;", "ensureChildrenHaveIds", "()V", "Landroid/view/ViewManager;", "viewManager", "attachTo", "(Landroid/view/ViewManager;)V", "width", "height", "generateLayoutParams", "(II)Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;", "Landroid/view/View;", "addToParent", "(Landroid/view/View;)V", CA20Status.STATUS_CERTIFICATE_V, "Lkotlin/Function1;", "init", "invoke", "(Landroid/view/View;Ltls;)Landroid/view/View;", "T", "Lcom/yandex/dsl/views/layouts/constraint/a;", "constraints", "(Landroid/view/View;Ltls;)Lcom/yandex/dsl/views/layouts/constraint/a;", "Lcom/yandex/dsl/views/layouts/constraint/ConstraintSetBuilder;", "constraintSetBuilder", "Lcom/yandex/dsl/views/layouts/constraint/ConstraintSetBuilder;", "getCtx", "()Landroid/content/Context;", "ctx", "core-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ConstraintLayoutBuilder extends ConstraintLayout implements kzx {
    private final /* synthetic */ kzx $$delegate_0;
    private final ConstraintSetBuilder constraintSetBuilder;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.yandex.dsl.views.layouts.constraint.ConstraintLayoutBuilder$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements wls {
        public static final AnonymousClass1 b = new AnonymousClass1(2, 0, ConstraintLayout.LayoutParams.class, "<init>", "<init>(II)V");

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return new ConstraintLayout.LayoutParams(((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    public ConstraintLayoutBuilder(Context context, int i, int i2) {
        super(context, null, i, i2);
        this.$$delegate_0 = new mzx(context, AnonymousClass1.b);
        attachTo(this);
        ConstraintSetBuilder constraintSetBuilder = new ConstraintSetBuilder();
        ensureChildrenHaveIds();
        constraintSetBuilder.g(this);
        setConstraintSet(constraintSetBuilder);
        this.constraintSetBuilder = constraintSetBuilder;
    }

    private final void ensureChildrenHaveIds() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() == -1) {
                childAt.setId(View.generateViewId());
            }
        }
    }

    @Override // defpackage.kzx
    public void addToParent(View view) {
        this.$$delegate_0.addToParent(view);
    }

    @Override // defpackage.kzx
    public void attachTo(ViewManager viewManager) {
        this.$$delegate_0.attachTo(viewManager);
    }

    public final <T extends View> a constraints(T t, tls tlsVar) {
        a aVar = new a(t.getId(), this.constraintSetBuilder);
        tlsVar.invoke(aVar);
        return aVar;
    }

    @Override // defpackage.kzx
    public ConstraintLayout.LayoutParams generateLayoutParams(int width, int height) {
        return (ConstraintLayout.LayoutParams) this.$$delegate_0.generateLayoutParams(width, height);
    }

    @Override // defpackage.jp31
    public Context getCtx() {
        return getContext();
    }

    @Override // defpackage.kzx
    public <V extends View> V invoke(V v, tls tlsVar) {
        return (V) this.$$delegate_0.invoke(v, tlsVar);
    }

    public ConstraintLayoutBuilder(Context context) {
        this(context, 0, 0);
    }
}
