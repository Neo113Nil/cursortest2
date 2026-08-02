package com.yandex.bricks;

import android.content.Intent;
import android.content.res.Configuration;
import android.view.View;
import com.yandex.alicekit.core.views.SimpleViewStub;
import defpackage.shw0;
import defpackage.yj6;
import defpackage.ykn0;
import defpackage.z83;
import java.util.Objects;

/* loaded from: classes11.dex */
public class BrickBoundHelper<Key, Data> extends BrickController {
    private Data mBoundData;
    private Key mBoundKey;
    private final yj6 mBoundLifecycle;
    private View mBoundView;

    public BrickBoundHelper(yj6 yj6Var) {
        super(yj6Var, false);
        this.mBoundLifecycle = yj6Var;
    }

    public final void bind(View view, Key key, Data data) {
        z83.d(view, null);
        z83.d(key, null);
        if (this.mBoundKey != null) {
            Objects.requireNonNull(this.mBoundView);
            if (this.mBoundView == view && this.mBoundLifecycle.t(this.mBoundKey, key)) {
                this.mBoundKey = key;
                this.mBoundData = data;
                if (BrickController.isAttachedToWindow(this.mBoundView)) {
                    this.mBoundLifecycle.C();
                    return;
                }
                return;
            }
            this.mBoundView.removeOnAttachStateChangeListener(this);
            if (BrickController.isAttachedToWindow(this.mBoundView)) {
                onViewDetachedFromWindow(this.mBoundView);
            }
        }
        this.mBoundKey = key;
        this.mBoundData = data;
        this.mBoundView = view;
        view.addOnAttachStateChangeListener(this);
        if (BrickController.isAttachedToWindow(view)) {
            onViewAttachedToWindow(view);
        }
    }

    public final Data data() {
        Data data = this.mBoundData;
        Objects.requireNonNull(data);
        return data;
    }

    @Override // com.yandex.bricks.BrickController, defpackage.i651
    public /* bridge */ /* synthetic */ String getUniqueInstanceId() {
        return super.getUniqueInstanceId();
    }

    @Override // com.yandex.bricks.BrickController
    public boolean isAttached() {
        return super.isAttached();
    }

    public boolean isBound() {
        return this.mBoundKey != null;
    }

    public final Key key() {
        Key key = this.mBoundKey;
        Objects.requireNonNull(key);
        return key;
    }

    public final boolean keyIsDifferent(Key key) {
        z83.d(key, null);
        Key key2 = this.mBoundKey;
        return key2 == null || !this.mBoundLifecycle.t(key2, key);
    }

    @Override // com.yandex.bricks.BrickController, defpackage.i651
    public /* bridge */ /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.yandex.bricks.BrickController, defpackage.i651
    public /* bridge */ /* synthetic */ void onActivityResumeChanged(boolean z) {
        super.onActivityResumeChanged(z);
    }

    @Override // com.yandex.bricks.BrickController, defpackage.i651
    public /* bridge */ /* synthetic */ void onActivityStartChanged(boolean z) {
        super.onActivityStartChanged(z);
    }

    @Override // com.yandex.bricks.BrickController, defpackage.i651
    public /* bridge */ /* synthetic */ void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.yandex.bricks.BrickController, defpackage.bju
    public /* bridge */ /* synthetic */ void onContainerVisibilityChanged(boolean z) {
        super.onContainerVisibilityChanged(z);
    }

    @Override // com.yandex.bricks.BrickController, defpackage.i651
    public /* bridge */ /* synthetic */ void onLayout() {
        super.onLayout();
    }

    @Override // com.yandex.bricks.BrickController, defpackage.i651
    public /* bridge */ /* synthetic */ void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // com.yandex.bricks.BrickController, android.view.View.OnAttachStateChangeListener
    public /* bridge */ /* synthetic */ void onViewAttachedToWindow(View view) {
        super.onViewAttachedToWindow(view);
    }

    @Override // com.yandex.bricks.BrickController, android.view.View.OnAttachStateChangeListener
    public /* bridge */ /* synthetic */ void onViewDetachedFromWindow(View view) {
        super.onViewDetachedFromWindow(view);
    }

    public final void unbind() {
        View view = this.mBoundView;
        if (view == null) {
            return;
        }
        view.removeOnAttachStateChangeListener(this);
        if (BrickController.isAttachedToWindow(this.mBoundView)) {
            onViewDetachedFromWindow(this.mBoundView);
        }
        this.mBoundKey = null;
        this.mBoundData = null;
        this.mBoundView = null;
    }

    public final void bind(View view, Key key, shw0 shw0Var) {
        View replace$lambda$2;
        z83.d(view, null);
        z83.d(key, null);
        if (keyIsDifferent(key)) {
            replace$lambda$2 = SimpleViewStub.replace$lambda$2((View) ((ykn0) shw0Var).b);
            bind(view, (View) key, (Key) replace$lambda$2);
        }
    }

    public final void bind(View view, Key key) {
        bind(view, (View) key, (Key) null);
    }
}
