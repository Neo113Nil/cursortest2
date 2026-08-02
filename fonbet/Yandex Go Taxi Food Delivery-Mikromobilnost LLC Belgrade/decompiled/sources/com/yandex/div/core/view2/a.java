package com.yandex.div.core.view2;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.z0;
import com.yandex.div.core.view2.backbutton.BackHandlingRecyclerView;
import com.yandex.div.core.widget.DivViewWrapper;
import defpackage.fh;
import defpackage.gh;
import defpackage.ny61;
import defpackage.o6;
import defpackage.oe7;
import defpackage.qoi0;
import defpackage.ryh;
import defpackage.uvc;
import defpackage.wh;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class a extends z0 {
    public final BackHandlingRecyclerView c;
    public final ArrayList w;
    public final o6 x;
    public fh y;
    public boolean z;

    public a(BackHandlingRecyclerView backHandlingRecyclerView) {
        super(backHandlingRecyclerView);
        this.c = backHandlingRecyclerView;
        this.w = new ArrayList();
        o6 o6Var = new o6(1, this);
        this.x = o6Var;
        if (backHandlingRecyclerView.isAttachedToWindow()) {
            backHandlingRecyclerView.getViewTreeObserver().addOnGlobalLayoutListener(o6Var);
        }
        backHandlingRecyclerView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.AccessibilityListDelegate$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                a.this.c.getViewTreeObserver().addOnGlobalLayoutListener(a.this.x);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                a.this.c.getViewTreeObserver().removeOnGlobalLayoutListener(a.this.x);
                a.this.b();
            }
        });
        int childCount = backHandlingRecyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            backHandlingRecyclerView.getChildAt(i).setImportantForAccessibility(this.z ? 1 : 4);
        }
        this.c.setOnBackClickListener(new ryh(7, this));
    }

    @Override // androidx.recyclerview.widget.z0
    public final AccessibilityDelegateCompat a() {
        fh fhVar = this.y;
        if (fhVar != null) {
            return fhVar;
        }
        fh fhVar2 = new fh(this, 0);
        this.y = fhVar2;
        return fhVar2;
    }

    public final void b() {
        if (this.z) {
            this.z = false;
            BackHandlingRecyclerView backHandlingRecyclerView = this.c;
            int childCount = backHandlingRecyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                backHandlingRecyclerView.getChildAt(i).setImportantForAccessibility(this.z ? 1 : 4);
            }
        }
        ArrayList arrayList = this.w;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            gh ghVar = (gh) it.next();
            View view = (View) ghVar.a.get();
            if (view != null) {
                view.setImportantForAccessibility(ghVar.b);
            }
        }
        arrayList.clear();
    }

    public final void c(ViewGroup viewGroup) {
        ViewParent parent = viewGroup.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 == null || viewGroup.equals(viewGroup2.getRootView())) {
            return;
        }
        int i = 0;
        while (true) {
            if (!(i < viewGroup2.getChildCount())) {
                c(viewGroup2);
                return;
            }
            int i2 = i + 1;
            View childAt = viewGroup2.getChildAt(i);
            if (childAt == null) {
                ny61.s();
                return;
            }
            if (!childAt.equals(viewGroup) && childAt.getImportantForAccessibility() != 4) {
                this.w.add(new gh(new WeakReference(childAt), childAt.getImportantForAccessibility()));
                childAt.setImportantForAccessibility(4);
            }
            i = i2;
        }
    }

    @Override // androidx.recyclerview.widget.z0, androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        whVar.p(this.z ? qoi0.a(RecyclerView.class).c() : qoi0.a(Button.class).c());
        AccessibilityNodeInfo accessibilityNodeInfo = whVar.a;
        whVar.a(16);
        whVar.q(true);
        accessibilityNodeInfo.setImportantForAccessibility(true);
        accessibilityNodeInfo.setScreenReaderFocusable(true);
        BackHandlingRecyclerView backHandlingRecyclerView = this.c;
        int childCount = backHandlingRecyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            backHandlingRecyclerView.getChildAt(i).setImportantForAccessibility(this.z ? 1 : 4);
        }
    }

    @Override // androidx.recyclerview.widget.z0, androidx.core.view.AccessibilityDelegateCompat
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        boolean z;
        View view2;
        View child;
        if (i == 16) {
            boolean z2 = this.z;
            BackHandlingRecyclerView backHandlingRecyclerView = this.c;
            if (!z2) {
                this.z = true;
                int childCount = backHandlingRecyclerView.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    backHandlingRecyclerView.getChildAt(i2).setImportantForAccessibility(this.z ? 1 : 4);
                }
            }
            c(backHandlingRecyclerView);
            oe7 a = uvc.a(AccessibilityListDelegate$firstChild$1.b, AccessibilityListDelegate$firstChild$2.b);
            if (backHandlingRecyclerView.getChildCount() > 0) {
                view2 = backHandlingRecyclerView.getChildAt(0);
                if (view2 == null) {
                    ny61.s();
                    return false;
                }
                int i3 = 1;
                while (i3 < backHandlingRecyclerView.getChildCount()) {
                    int i4 = i3 + 1;
                    View childAt = backHandlingRecyclerView.getChildAt(i3);
                    if (childAt == null) {
                        ny61.s();
                        return false;
                    }
                    if (a.compare(view2, childAt) > 0) {
                        view2 = childAt;
                    }
                    i3 = i4;
                }
            } else {
                view2 = null;
            }
            if (view2 == null) {
                view2 = null;
            } else if ((view2 instanceof DivViewWrapper) && (child = ((DivViewWrapper) view2).getChild()) != null) {
                view2 = child;
            }
            if (view2 != null) {
                view2.performAccessibilityAction(64, null);
                view2.sendAccessibilityEvent(1);
            }
            z = true;
        } else {
            z = false;
        }
        return super.performAccessibilityAction(view, i, bundle) || z;
    }
}
