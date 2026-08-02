package com.yandex.passport.common.ui.view;

import android.content.Context;
import android.view.View;
import android.view.ViewManager;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import defpackage.lzx;
import defpackage.nzx;
import defpackage.tls;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ$\u0010\u000e\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0011*\u00020\u0010*\u00028\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u0012H\u0096\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u001b\u001a\u00020\u0013*\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/yandex/passport/common/ui/view/HorizontalScrollViewBuilder;", "Landroid/widget/HorizontalScrollView;", "Llzx;", "Landroid/widget/FrameLayout$LayoutParams;", "Landroid/content/Context;", "context", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;II)V", "(Landroid/content/Context;)V", "width", "height", "generateLayoutParams", "(II)Landroid/widget/FrameLayout$LayoutParams;", "Landroid/view/View;", CA20Status.STATUS_CERTIFICATE_V, "Lkotlin/Function1;", "Lzy11;", "init", "invoke", "(Landroid/view/View;Ltls;)Landroid/view/View;", "Landroid/view/ViewManager;", "viewManager", "attachTo", "(Landroid/view/ViewManager;)V", "addToParent", "(Landroid/view/View;)V", "getCtx", "()Landroid/content/Context;", "ctx", "passport-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class HorizontalScrollViewBuilder extends HorizontalScrollView implements lzx {
    public static final int $stable = 8;
    private final /* synthetic */ lzx $$delegate_0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.yandex.passport.common.ui.view.HorizontalScrollViewBuilder$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements wls {
        public static final AnonymousClass1 b = new AnonymousClass1(2, 0, FrameLayout.LayoutParams.class, "<init>", "<init>(II)V");

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return new FrameLayout.LayoutParams(((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    public HorizontalScrollViewBuilder(Context context, int i, int i2) {
        super(context, null, i, i2);
        this.$$delegate_0 = new nzx(context, AnonymousClass1.b);
        attachTo(this);
    }

    @Override // defpackage.lzx
    public void addToParent(View view) {
        this.$$delegate_0.addToParent(view);
    }

    @Override // defpackage.lzx
    public void attachTo(ViewManager viewManager) {
        this.$$delegate_0.attachTo(viewManager);
    }

    @Override // defpackage.lzx
    public FrameLayout.LayoutParams generateLayoutParams(int width, int height) {
        return (FrameLayout.LayoutParams) this.$$delegate_0.generateLayoutParams(width, height);
    }

    @Override // defpackage.kp31
    public Context getCtx() {
        return getContext();
    }

    @Override // defpackage.lzx
    public <V extends View> V invoke(V v, tls tlsVar) {
        return (V) this.$$delegate_0.invoke(v, tlsVar);
    }

    public HorizontalScrollViewBuilder(Context context) {
        this(context, 0, 0);
    }
}
