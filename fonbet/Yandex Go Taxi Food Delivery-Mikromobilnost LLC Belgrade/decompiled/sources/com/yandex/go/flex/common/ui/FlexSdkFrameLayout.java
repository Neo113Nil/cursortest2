package com.yandex.go.flex.common.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.eor;
import defpackage.idy;
import defpackage.nwy0;
import defpackage.vng;
import defpackage.ylr;
import defpackage.zo31;
import flex.engine.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B#\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0015¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0015¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010\u0011J\u000f\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\u0011J\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010\u0011J\u0017\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000f0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8$X¤\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/yandex/go/flex/common/ui/FlexSdkFrameLayout;", "Lylr;", "Landroid/widget/FrameLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Lflex/engine/a;", "flexSdkEngine", "", "shouldDestroyOnDetach", "<init>", "(Landroid/content/Context;Lflex/engine/a;Z)V", "Landroid/view/ViewGroup;", "provideEngineContainer", "()Landroid/view/ViewGroup;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/View;", "asView", "()Landroid/view/View;", "interceptOnBackPressed", "()Z", "", "getAnchoredHeight", "()I", "Landroidx/recyclerview/widget/RecyclerView$g;", "listener", "addScrollListener", "(Landroidx/recyclerview/widget/RecyclerView$g;)V", "removeScrollListener", "onResume", "onPause", "onStop", "shouldDestroyEngine", "onDestroy", "(Z)V", "Lflex/engine/a;", "Z", "Lidy;", "lifecycleAwareController", "Lidy;", "Lzo31;", "getBinding", "()Lzo31;", "binding", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class FlexSdkFrameLayout extends FrameLayout implements ylr, nwy0 {
    private final a flexSdkEngine;
    private final idy lifecycleAwareController;
    private final boolean shouldDestroyOnDetach;

    public FlexSdkFrameLayout(Context context, a aVar, boolean z) {
        super(context);
        this.flexSdkEngine = aVar;
        this.shouldDestroyOnDetach = z;
        idy idyVar = new idy();
        idyVar.a();
        this.lifecycleAwareController = idyVar;
    }

    @Override // defpackage.ylr
    public void addScrollListener(RecyclerView.g listener) {
        this.flexSdkEngine.d(listener);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public /* bridge */ void applyTheme(ThemeType themeType) {
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // defpackage.ylr
    public View asView() {
        return this;
    }

    public int getAnchoredHeight() {
        return getBinding().getRoot().getHeight();
    }

    public abstract zo31 getBinding();

    @Override // defpackage.ylr
    public boolean interceptOnBackPressed() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vng.E(this, this.lifecycleAwareController);
        this.flexSdkEngine.g(provideEngineContainer(), this.lifecycleAwareController);
    }

    @Override // defpackage.ylr
    public void onDestroy(boolean shouldDestroyEngine) {
        this.lifecycleAwareController.b();
        if (shouldDestroyEngine) {
            this.flexSdkEngine.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.flexSdkEngine.j();
        if (this.shouldDestroyOnDetach) {
            this.flexSdkEngine.i();
        }
    }

    @Override // defpackage.ylr
    public void onPause() {
        this.lifecycleAwareController.c();
    }

    @Override // defpackage.ylr
    public void onResume() {
        this.lifecycleAwareController.d();
        this.flexSdkEngine.n();
    }

    @Override // defpackage.ylr
    public void onStop() {
        this.lifecycleAwareController.f();
    }

    public abstract ViewGroup provideEngineContainer();

    @Override // defpackage.ylr
    public void removeScrollListener(RecyclerView.g listener) {
        this.flexSdkEngine.y(listener);
    }

    @Override // defpackage.ylr
    public /* bridge */ void setCanScroll(boolean z) {
    }

    @Override // defpackage.ylr
    public /* bridge */ void setFloatButtons(eor eorVar, eor eorVar2) {
    }

    @Override // defpackage.ylr
    public /* bridge */ void updateVisibilities() {
    }

    public /* synthetic */ FlexSdkFrameLayout(Context context, a aVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, aVar, (i & 4) != 0 ? true : z);
    }
}
