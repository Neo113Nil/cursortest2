package com.yandex.div.core.view2;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l0;
import com.yandex.div.core.view2.AccessibilityListDelegate;
import com.yandex.div.core.view2.backbutton.BackHandlingRecyclerView;
import com.yandex.div.core.view2.backbutton.BackKeyPressedHelper;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.widget.DivViewWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import xsna.am;
import xsna.e7i;
import xsna.epx;
import xsna.fpf0;
import xsna.hk;
import xsna.jw5;
import xsna.kxt0;

/* compiled from: AccessibilityListDelegate.kt */
/* loaded from: classes7.dex */
public final class AccessibilityListDelegate extends l0 {
    private boolean isItemsFocusActive;
    private hk itemDelegate;
    private final ArrayList<ViewAccessibilityState> list;
    private final BackHandlingRecyclerView recyclerView;
    private final ViewTreeObserver.OnGlobalLayoutListener visibilityListener;

    /* compiled from: AccessibilityListDelegate.kt */
    public final class ItemAccessibilityDelegate extends l0.a {
        public ItemAccessibilityDelegate() {
            super(AccessibilityListDelegate.this);
        }

        @Override // androidx.recyclerview.widget.l0.a, xsna.hk
        public void onInitializeAccessibilityNodeInfo(View view, am amVar) {
            super.onInitializeAccessibilityNodeInfo(view, amVar);
            amVar.n(fpf0.a(Button.class).h());
            AccessibilityListDelegate.this.updateItemAccessibility(view);
        }
    }

    /* compiled from: AccessibilityListDelegate.kt */
    public static final class ViewAccessibilityState {
        private final int accessibilityState;
        private final WeakReference<View> view;

        public ViewAccessibilityState(WeakReference<View> weakReference, int i) {
            this.view = weakReference;
            this.accessibilityState = i;
        }

        public final int getAccessibilityState() {
            return this.accessibilityState;
        }

        public final WeakReference<View> getView() {
            return this.view;
        }
    }

    public AccessibilityListDelegate(BackHandlingRecyclerView backHandlingRecyclerView) {
        super(backHandlingRecyclerView);
        this.recyclerView = backHandlingRecyclerView;
        this.list = new ArrayList<>();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.jl
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AccessibilityListDelegate.visibilityListener$lambda$0(AccessibilityListDelegate.this);
            }
        };
        this.visibilityListener = onGlobalLayoutListener;
        if (backHandlingRecyclerView.isAttachedToWindow()) {
            backHandlingRecyclerView.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        backHandlingRecyclerView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.AccessibilityListDelegate.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                AccessibilityListDelegate.this.recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(AccessibilityListDelegate.this.visibilityListener);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                AccessibilityListDelegate.this.recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(AccessibilityListDelegate.this.visibilityListener);
                AccessibilityListDelegate.this.clearItemsFocus();
            }
        });
        int childCount = backHandlingRecyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            updateItemAccessibility(backHandlingRecyclerView.getChildAt(i));
        }
        this.recyclerView.setOnBackClickListener(new BackKeyPressedHelper.OnBackClickListener() { // from class: com.yandex.div.core.view2.AccessibilityListDelegate.3
            @Override // com.yandex.div.core.view2.backbutton.BackKeyPressedHelper.OnBackClickListener
            public boolean onBackClick() {
                return AccessibilityListDelegate.this.onBackPressed();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearItemsFocus() {
        setItemsFocusActive(false);
        restoreAccessibilityState();
    }

    private final void focusChildren() {
        setItemsFocusActive(true);
        makeInaccessibleAllOtherViews(this.recyclerView);
        View firstChild = getFirstChild(this.recyclerView);
        View unwrap = firstChild != null ? getUnwrap(firstChild) : null;
        if (unwrap != null) {
            BaseDivViewExtensionsKt.gainAccessibilityFocus(unwrap);
        }
    }

    private final void focusContainer() {
        BaseDivViewExtensionsKt.gainAccessibilityFocus(this.recyclerView);
        clearItemsFocus();
    }

    private final View getFirstChild(ViewGroup viewGroup) {
        e7i a = jw5.a(AccessibilityListDelegate$firstChild$1.INSTANCE, AccessibilityListDelegate$firstChild$2.INSTANCE);
        if (!(viewGroup.getChildCount() > 0)) {
            return null;
        }
        int i = 0 + 1;
        View childAt = viewGroup.getChildAt(0);
        if (childAt == null) {
            throw new IndexOutOfBoundsException();
        }
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                return childAt;
            }
            int i2 = i + 1;
            View childAt2 = viewGroup.getChildAt(i);
            if (childAt2 == null) {
                throw new IndexOutOfBoundsException();
            }
            if (a.compare(childAt, childAt2) > 0) {
                childAt = childAt2;
            }
            i = i2;
        }
    }

    private final View getUnwrap(View view) {
        View child;
        return (!(view instanceof DivViewWrapper) || (child = ((DivViewWrapper) view).getChild()) == null) ? view : child;
    }

    private final void makeInaccessibleAllOtherViews(ViewGroup viewGroup) {
        ViewParent parent = viewGroup.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 == null || viewGroup.equals(viewGroup2.getRootView())) {
            return;
        }
        kxt0 kxt0Var = new kxt0(viewGroup2);
        while (kxt0Var.hasNext()) {
            View next = kxt0Var.next();
            if (!epx.f(next, viewGroup) && next.getImportantForAccessibility() != 4) {
                this.list.add(new ViewAccessibilityState(new WeakReference(next), next.getImportantForAccessibility()));
                next.setImportantForAccessibility(4);
            }
        }
        makeInaccessibleAllOtherViews(viewGroup2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onBackPressed() {
        if (!this.isItemsFocusActive) {
            return false;
        }
        focusContainer();
        return true;
    }

    private final void restoreAccessibilityState() {
        for (ViewAccessibilityState viewAccessibilityState : this.list) {
            View view = viewAccessibilityState.getView().get();
            if (view != null) {
                view.setImportantForAccessibility(viewAccessibilityState.getAccessibilityState());
            }
        }
        this.list.clear();
    }

    private final void setItemsFocusActive(boolean z) {
        if (this.isItemsFocusActive == z) {
            return;
        }
        this.isItemsFocusActive = z;
        BackHandlingRecyclerView backHandlingRecyclerView = this.recyclerView;
        int childCount = backHandlingRecyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            updateItemAccessibility(backHandlingRecyclerView.getChildAt(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateItemAccessibility(View view) {
        view.setImportantForAccessibility(this.isItemsFocusActive ? 1 : 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void visibilityListener$lambda$0(AccessibilityListDelegate accessibilityListDelegate) {
        if (!accessibilityListDelegate.isItemsFocusActive || accessibilityListDelegate.recyclerView.getVisibility() == 0) {
            return;
        }
        accessibilityListDelegate.clearItemsFocus();
    }

    @Override // androidx.recyclerview.widget.l0
    public hk getItemDelegate() {
        hk hkVar = this.itemDelegate;
        if (hkVar != null) {
            return hkVar;
        }
        ItemAccessibilityDelegate itemAccessibilityDelegate = new ItemAccessibilityDelegate();
        this.itemDelegate = itemAccessibilityDelegate;
        return itemAccessibilityDelegate;
    }

    @Override // androidx.recyclerview.widget.l0, xsna.hk
    public void onInitializeAccessibilityNodeInfo(View view, am amVar) {
        super.onInitializeAccessibilityNodeInfo(view, amVar);
        amVar.n(this.isItemsFocusActive ? fpf0.a(RecyclerView.class).h() : fpf0.a(Button.class).h());
        amVar.a(16);
        amVar.o(true);
        amVar.a.setImportantForAccessibility(true);
        amVar.x(true);
        BackHandlingRecyclerView backHandlingRecyclerView = this.recyclerView;
        int childCount = backHandlingRecyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            updateItemAccessibility(backHandlingRecyclerView.getChildAt(i));
        }
    }

    @Override // androidx.recyclerview.widget.l0, xsna.hk
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        boolean z;
        if (i == 16) {
            focusChildren();
            z = true;
        } else {
            z = false;
        }
        return super.performAccessibilityAction(view, i, bundle) || z;
    }
}
