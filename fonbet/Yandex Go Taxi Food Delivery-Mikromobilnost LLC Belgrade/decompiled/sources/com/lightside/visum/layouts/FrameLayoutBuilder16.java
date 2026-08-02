package com.lightside.visum.layouts;

import android.content.Context;
import android.view.View;
import android.view.ViewManager;
import android.widget.FrameLayout;
import defpackage.lzx;
import defpackage.nzx;
import defpackage.tls;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ$\u0010\r\u001a\u00020\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006H\u0097\u0001¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\u0010*\u00020\u000f*\u00028\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\u0011H\u0096\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u0012*\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/lightside/visum/layouts/FrameLayoutBuilder16;", "Landroid/widget/FrameLayout;", "Llzx;", "Landroid/widget/FrameLayout$LayoutParams;", "Landroid/content/Context;", "context", "", "defStyleAttr", "<init>", "(Landroid/content/Context;I)V", "(Landroid/content/Context;)V", "width", "height", "generateLayoutParams", "(II)Landroid/widget/FrameLayout$LayoutParams;", "Landroid/view/View;", CA20Status.STATUS_CERTIFICATE_V, "Lkotlin/Function1;", "Lzy11;", "init", "invoke", "(Landroid/view/View;Ltls;)Landroid/view/View;", "Landroid/view/ViewManager;", "viewManager", "attachTo", "(Landroid/view/ViewManager;)V", "addToParent", "(Landroid/view/View;)V", "getCtx", "()Landroid/content/Context;", "ctx", "visum_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FrameLayoutBuilder16 extends FrameLayout implements lzx {
    private final /* synthetic */ lzx $$delegate_0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.lightside.visum.layouts.FrameLayoutBuilder16$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements wls {
        public static final AnonymousClass1 b = new AnonymousClass1(2, 0, FrameLayout.LayoutParams.class, "<init>", "<init>(II)V");

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return new FrameLayout.LayoutParams(((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    public FrameLayoutBuilder16(Context context, int i) {
        super(context, null, i);
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

    public FrameLayoutBuilder16(Context context) {
        this(context, 0);
    }
}
