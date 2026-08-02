package com.yandex.bricks;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.bju;
import defpackage.cju;
import defpackage.sq60;
import defpackage.xq60;
import defpackage.zq60;

/* loaded from: classes11.dex */
public class HideableHelper implements View.OnAttachStateChangeListener, bju {
    private final zq60 mObserverList;
    private final xq60 mObserverListIterator;
    private cju mParentContainer;
    private final ViewGroup mView;
    private boolean mVisible;

    public HideableHelper(ViewGroup viewGroup, boolean z) {
        zq60 zq60Var = new zq60();
        this.mObserverList = zq60Var;
        this.mObserverListIterator = new sq60(zq60Var);
        this.mView = viewGroup;
        this.mVisible = z;
        viewGroup.addOnAttachStateChangeListener(this);
        if (isAttachedToWindow(viewGroup)) {
            onViewAttachedToWindow(viewGroup);
        }
    }

    private cju findParentVisibilityContainer(View view) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof cju) {
                return (cju) parent;
            }
        }
        return null;
    }

    private static boolean isAttachedToWindow(View view) {
        return view.isAttachedToWindow();
    }

    public void addObserver(bju bjuVar) {
        this.mObserverList.b(bjuVar);
    }

    public boolean isVisible() {
        if (!this.mVisible) {
            return false;
        }
        cju cjuVar = this.mParentContainer;
        if (cjuVar != null) {
            return cjuVar.isVisibleToUser();
        }
        return true;
    }

    @Override // defpackage.bju
    public void onContainerVisibilityChanged(boolean z) {
        boolean isVisible = isVisible();
        this.mObserverListIterator.rewind();
        while (this.mObserverListIterator.hasNext()) {
            ((bju) this.mObserverListIterator.next()).onContainerVisibilityChanged(isVisible);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        cju findParentVisibilityContainer = findParentVisibilityContainer(this.mView);
        this.mParentContainer = findParentVisibilityContainer;
        if (findParentVisibilityContainer != null) {
            findParentVisibilityContainer.addObserver(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        cju cjuVar = this.mParentContainer;
        if (cjuVar != null) {
            cjuVar.removeObserver(this);
            this.mParentContainer = null;
        }
    }

    public void removeObserver(bju bjuVar) {
        this.mObserverList.d(bjuVar);
    }

    public void setVisibility(boolean z) {
        boolean z2 = this.mVisible != z;
        this.mVisible = z;
        if (z2) {
            boolean isVisible = isVisible();
            this.mObserverListIterator.rewind();
            while (this.mObserverListIterator.hasNext()) {
                ((bju) this.mObserverListIterator.next()).onContainerVisibilityChanged(isVisible);
            }
        }
    }

    public HideableHelper(ViewGroup viewGroup) {
        this(viewGroup, true);
    }
}
