package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import defpackage.e5j0;
import defpackage.jb5;
import defpackage.ny61;
import defpackage.ojs0;
import defpackage.pdh0;
import defpackage.z2a1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class ViewTarget extends jb5 {
    private static final String TAG = "ViewTarget";
    private static boolean isTagUsedAtLeastOnce;
    private static int tagId = pdh0.glide_custom_view_target_tag;
    private View.OnAttachStateChangeListener attachStateListener;
    private boolean isAttachStateListenerAdded;
    private boolean isClearedByUs;
    private final c sizeDeterminer;
    protected final View view;

    public ViewTarget(ImageView imageView) {
        z2a1.e(imageView, "Argument must not be null");
        this.view = imageView;
        this.sizeDeterminer = new c(imageView);
    }

    @Deprecated
    public static void setTagId(int i) {
        if (isTagUsedAtLeastOnce) {
            ny61.g("You cannot set the tag id more than once or change the tag id after the first request has been made");
        } else {
            tagId = i;
        }
    }

    public final void a() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.attachStateListener;
        if (onAttachStateChangeListener == null || this.isAttachStateListenerAdded) {
            return;
        }
        this.view.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.isAttachStateListenerAdded = true;
    }

    public final ViewTarget clearOnDetach() {
        if (this.attachStateListener != null) {
            return this;
        }
        this.attachStateListener = new View.OnAttachStateChangeListener() { // from class: com.bumptech.glide.request.target.ViewTarget.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                ViewTarget.this.resumeMyRequest();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                ViewTarget.this.pauseMyRequest();
            }
        };
        a();
        return this;
    }

    @Override // defpackage.jb5, defpackage.iax0
    public e5j0 getRequest() {
        Object tag = this.view.getTag(tagId);
        if (tag != null) {
            if (tag instanceof e5j0) {
                return (e5j0) tag;
            }
            ny61.g("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, com.bumptech.glide.request.target.ViewTarget$SizeDeterminer$SizeDeterminerLayoutListener] */
    @Override // defpackage.iax0
    public void getSize(ojs0 ojs0Var) {
        final c cVar = this.sizeDeterminer;
        ArrayList arrayList = cVar.b;
        View view = cVar.a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int a = cVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int a2 = cVar.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((a > 0 || a == Integer.MIN_VALUE) && (a2 > 0 || a2 == Integer.MIN_VALUE)) {
            ojs0Var.onSizeReady(a, a2);
            return;
        }
        if (!arrayList.contains(ojs0Var)) {
            arrayList.add(ojs0Var);
        }
        if (cVar.d == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            ?? r0 = new ViewTreeObserver.OnPreDrawListener(cVar) { // from class: com.bumptech.glide.request.target.ViewTarget$SizeDeterminer$SizeDeterminerLayoutListener
                private final WeakReference<c> sizeDeterminerRef;

                {
                    this.sizeDeterminerRef = new WeakReference<>(cVar);
                }

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    Log.isLoggable("ViewTarget", 2);
                    c cVar2 = this.sizeDeterminerRef.get();
                    if (cVar2 == null) {
                        return true;
                    }
                    ArrayList arrayList2 = cVar2.b;
                    View view2 = cVar2.a;
                    if (arrayList2.isEmpty()) {
                        return true;
                    }
                    int paddingRight2 = view2.getPaddingRight() + view2.getPaddingLeft();
                    ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                    int a3 = cVar2.a(view2.getWidth(), layoutParams3 != null ? layoutParams3.width : 0, paddingRight2);
                    int paddingBottom2 = view2.getPaddingBottom() + view2.getPaddingTop();
                    ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                    int a4 = cVar2.a(view2.getHeight(), layoutParams4 != null ? layoutParams4.height : 0, paddingBottom2);
                    if (a3 <= 0 && a3 != Integer.MIN_VALUE) {
                        return true;
                    }
                    if (a4 <= 0 && a4 != Integer.MIN_VALUE) {
                        return true;
                    }
                    Iterator it = new ArrayList(arrayList2).iterator();
                    while (it.hasNext()) {
                        ((ojs0) it.next()).onSizeReady(a3, a4);
                    }
                    ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
                    if (viewTreeObserver2.isAlive()) {
                        viewTreeObserver2.removeOnPreDrawListener(cVar2.d);
                    }
                    cVar2.d = null;
                    arrayList2.clear();
                    return true;
                }
            };
            cVar.d = r0;
            viewTreeObserver.addOnPreDrawListener(r0);
        }
    }

    public View getView() {
        return this.view;
    }

    @Override // defpackage.jb5, defpackage.iax0
    public void onLoadCleared(Drawable drawable) {
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        c cVar = this.sizeDeterminer;
        ViewTreeObserver viewTreeObserver = cVar.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(cVar.d);
        }
        cVar.d = null;
        cVar.b.clear();
        if (this.isClearedByUs || (onAttachStateChangeListener = this.attachStateListener) == null || !this.isAttachStateListenerAdded) {
            return;
        }
        this.view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.isAttachStateListenerAdded = false;
    }

    public void pauseMyRequest() {
        e5j0 request = getRequest();
        if (request != null) {
            this.isClearedByUs = true;
            request.clear();
            this.isClearedByUs = false;
        }
    }

    @Override // defpackage.iax0
    public void removeCallback(ojs0 ojs0Var) {
        this.sizeDeterminer.b.remove(ojs0Var);
    }

    public void resumeMyRequest() {
        e5j0 request = getRequest();
        if (request == null || !request.c()) {
            return;
        }
        request.j();
    }

    @Override // defpackage.jb5, defpackage.iax0
    public void setRequest(e5j0 e5j0Var) {
        isTagUsedAtLeastOnce = true;
        this.view.setTag(tagId, e5j0Var);
    }

    public String toString() {
        return "Target for: " + this.view;
    }

    public final ViewTarget waitForLayout() {
        this.sizeDeterminer.c = true;
        return this;
    }
}
