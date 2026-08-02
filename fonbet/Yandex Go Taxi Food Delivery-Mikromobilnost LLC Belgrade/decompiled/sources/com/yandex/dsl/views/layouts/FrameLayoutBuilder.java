package com.yandex.dsl.views.layouts;

import android.content.Context;
import android.view.View;
import android.view.ViewManager;
import android.widget.FrameLayout;
import defpackage.kzx;
import defpackage.mzx;
import defpackage.tls;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\u00020\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0006H\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\u0016\u001a\u00020\u000e*\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J2\u0010\u001b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0018*\u00020\u0015*\u00028\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\u0019H\u0096\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/yandex/dsl/views/layouts/FrameLayoutBuilder;", "Landroid/widget/FrameLayout;", "Lkzx;", "Landroid/widget/FrameLayout$LayoutParams;", "Landroid/content/Context;", "context", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;II)V", "(Landroid/content/Context;)V", "Landroid/view/ViewManager;", "viewManager", "Lzy11;", "attachTo", "(Landroid/view/ViewManager;)V", "width", "height", "generateLayoutParams", "(II)Landroid/widget/FrameLayout$LayoutParams;", "Landroid/view/View;", "addToParent", "(Landroid/view/View;)V", CA20Status.STATUS_CERTIFICATE_V, "Lkotlin/Function1;", "init", "invoke", "(Landroid/view/View;Ltls;)Landroid/view/View;", "getCtx", "()Landroid/content/Context;", "ctx", "core-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FrameLayoutBuilder extends FrameLayout implements kzx {
    private final /* synthetic */ kzx $$delegate_0;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.yandex.dsl.views.layouts.FrameLayoutBuilder$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements wls {
        public static final AnonymousClass1 b = new AnonymousClass1(2, 0, FrameLayout.LayoutParams.class, "<init>", "<init>(II)V");

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return new FrameLayout.LayoutParams(((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    public FrameLayoutBuilder(Context context, int i, int i2) {
        super(context, null, i, i2);
        this.$$delegate_0 = new mzx(context, AnonymousClass1.b);
        attachTo(this);
    }

    @Override // defpackage.kzx
    public void addToParent(View view) {
        this.$$delegate_0.addToParent(view);
    }

    @Override // defpackage.kzx
    public void attachTo(ViewManager viewManager) {
        this.$$delegate_0.attachTo(viewManager);
    }

    @Override // defpackage.kzx
    public FrameLayout.LayoutParams generateLayoutParams(int width, int height) {
        return (FrameLayout.LayoutParams) this.$$delegate_0.generateLayoutParams(width, height);
    }

    @Override // defpackage.jp31
    public Context getCtx() {
        return getContext();
    }

    @Override // defpackage.kzx
    public <V extends View> V invoke(V v, tls tlsVar) {
        return (V) this.$$delegate_0.invoke(v, tlsVar);
    }

    public FrameLayoutBuilder(Context context) {
        this(context, 0, 0);
    }
}
