package com.yandex.bricks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ScrollView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ak6;
import defpackage.dk6;
import defpackage.e1k;
import defpackage.eu11;
import defpackage.fk6;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.pey;
import defpackage.tse;
import defpackage.wj6;
import defpackage.xi3;
import defpackage.xj6;
import defpackage.ydz;
import defpackage.z83;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes11.dex */
public abstract class Brick implements ak6, pey {
    private static final String TAG = "Brick";
    private Bundle mRestoredBundle;
    private SaveStateView mSaveStateView;
    private String mUniqueInstanceId;
    private View mView;
    private t mLifecycleRegistry = new t(this, true);
    private final BrickController mBrickController = new BrickController(this, true) { // from class: com.yandex.bricks.Brick.1
        @Override // com.yandex.bricks.BrickController, defpackage.i651
        public String getUniqueInstanceId() {
            return Brick.this.getUniqueInstanceId();
        }

        @Override // com.yandex.bricks.BrickController, defpackage.i651
        public void onActivityResult(int i, int i2, Intent intent) {
            Brick.this.onActivityResult(i, i2, intent);
        }

        @Override // com.yandex.bricks.BrickController, defpackage.i651
        public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            Brick.this.onRequestPermissionsResult(i, strArr, iArr);
        }
    };
    private final dk6 mBrickScopeHolder = new dk6(this);
    private e1k mActivityDestroyListener = e1k.M1;

    public final tse getBrickScope() {
        return this.mBrickScopeHolder.a();
    }

    @Override // defpackage.pey
    public final Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public boolean getTrue() {
        return true;
    }

    public final String getUniqueInstanceId() {
        if (this.mUniqueInstanceId == null) {
            this.mUniqueInstanceId = UUID.randomUUID().toString();
        }
        return this.mUniqueInstanceId;
    }

    public abstract View getView();

    public final <T extends View> T inflate(Context context, int i) {
        return (T) LayoutInflater.from(context).inflate(i, (ViewGroup) null);
    }

    public final fk6 insertInto(fk6 fk6Var) {
        eu11.a.getClass();
        z83.h("Called on non UI thread", jl40.l(Looper.myLooper(), Looper.getMainLooper()));
        return fk6Var.insert(this);
    }

    public final boolean isAttached() {
        return this.mBrickController.isAttached();
    }

    public void onActivityDestroy() {
        this.mLifecycleRegistry.g(Lifecycle.Event.ON_DESTROY);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        z83.h("Deliver activity result in detached brick", isAttached());
    }

    @Override // defpackage.ak6
    public void onBrickAttach() {
        e1k xi3Var;
        onBrickAttach(this.mRestoredBundle);
        Lifecycle lifecycle = null;
        this.mRestoredBundle = null;
        View view = this.mView;
        if (view != null) {
            Object context = view.getContext();
            if (context instanceof pey) {
                lifecycle = ((pey) context).getLifecycle();
            }
        }
        if (lifecycle == null) {
            ydz.b(TAG, "View is not set or not in lifecycle-managed context. onDestroy() will never be called.");
            xi3Var = e1k.M1;
        } else {
            wj6 wj6Var = new wj6(0, this);
            lifecycle.a(wj6Var);
            xi3Var = new xi3(2, lifecycle, wj6Var);
        }
        this.mActivityDestroyListener = xi3Var;
    }

    @Override // defpackage.ak6
    public void onBrickDetach() {
        this.mLifecycleRegistry.g(Lifecycle.Event.ON_DESTROY);
        this.mLifecycleRegistry = new t(this, true);
        this.mActivityDestroyListener.close();
    }

    @Override // defpackage.ak6
    public void onBrickPause() {
        this.mLifecycleRegistry.g(Lifecycle.Event.ON_PAUSE);
    }

    @Override // defpackage.ak6
    public void onBrickResume() {
        this.mLifecycleRegistry.g(Lifecycle.Event.ON_RESUME);
    }

    @Override // defpackage.ak6
    public void onBrickStart() {
        this.mLifecycleRegistry.g(Lifecycle.Event.ON_START);
    }

    @Override // defpackage.ak6
    public void onBrickStop() {
        this.mLifecycleRegistry.g(Lifecycle.Event.ON_STOP);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public final fk6 replaceThisBrickWith(Brick brick) {
        View view = this.mView;
        if (view == null) {
            ny61.k();
            return null;
        }
        if (view.getParent() != null) {
            brick.replaceWithBrick(this.mView);
            return new xj6(brick, this.mView);
        }
        ny61.k();
        return null;
    }

    public final View replaceWithBrick(View view) {
        View view2;
        eu11.a.getClass();
        z83.h("Called on non UI thread", jl40.l(Looper.myLooper(), Looper.getMainLooper()));
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = null;
        if (!(parent instanceof ViewGroup)) {
            ny61.r("viewToReplace must be attached to parent");
            return null;
        }
        if (!getTrue() || ((view2 = this.mView) != null && view2 == view)) {
            return view;
        }
        if (view2 == null) {
            View view3 = getView();
            Objects.requireNonNull(view3);
            this.mView = view3;
            view3.addOnAttachStateChangeListener(this.mBrickController);
        }
        ViewGroup viewGroup2 = (ViewGroup) parent;
        int indexOfChild = viewGroup2.indexOfChild(view);
        viewGroup2.removeViewInLayout(view);
        if (view.getId() != -1) {
            this.mView.setId(view.getId());
        }
        View view4 = this.mView;
        if ((view4 instanceof ViewGroup) && !(view4 instanceof RecyclerView) && !(view4 instanceof ScrollView)) {
            viewGroup = (ViewGroup) view4;
        }
        if (view.getId() != -1 && viewGroup != null && this.mSaveStateView == null) {
            SaveStateView saveStateView = new SaveStateView(this.mView.getContext(), this);
            this.mSaveStateView = saveStateView;
            saveStateView.setVisibility(8);
            this.mSaveStateView.setId((view.getId() & 16777215) | 419430400);
            viewGroup.addView(this.mSaveStateView, new ViewGroup.LayoutParams(-2, -2));
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        View view5 = this.mView;
        if (layoutParams != null) {
            viewGroup2.addView(view5, indexOfChild, layoutParams);
        } else {
            viewGroup2.addView(view5, indexOfChild);
        }
        return this.mView;
    }

    public void requestPermissions(String[] strArr, int i) {
        View view = this.mView;
        if (view == null) {
            ny61.k();
            return;
        }
        if (view.getParent() == null) {
            ny61.k();
            return;
        }
        if (this.mSaveStateView == null) {
            ny61.k();
            return;
        }
        HookResultFragment b = e.b(this.mView.getContext());
        if (b != null) {
            b.requestPermissions(getUniqueInstanceId(), strArr, i);
        } else {
            ny61.k();
        }
    }

    public final String saveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        return getUniqueInstanceId();
    }

    public final void setRestoredInstanceState(String str, Bundle bundle) {
        String str2 = this.mUniqueInstanceId;
        z83.h(null, str2 == null || str2.equals(str));
        this.mUniqueInstanceId = str;
        this.mRestoredBundle = bundle;
    }

    public void startActivityForResult(Intent intent, int i) {
        View view = this.mView;
        if (view == null) {
            ny61.k();
            return;
        }
        if (view.getParent() == null) {
            ny61.k();
            return;
        }
        if (this.mSaveStateView == null) {
            ny61.k();
            return;
        }
        HookResultFragment b = e.b(this.mView.getContext());
        if (b != null) {
            b.startActivityForResult(getUniqueInstanceId(), intent, i);
        } else {
            ny61.k();
        }
    }

    public void onBrickAttach(Bundle bundle) {
        this.mLifecycleRegistry.g(Lifecycle.Event.ON_CREATE);
    }
}
