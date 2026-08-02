package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import defpackage.e5j0;
import defpackage.iax0;
import defpackage.ny61;
import defpackage.ojs0;
import defpackage.pdh0;
import defpackage.z2a1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class b implements iax0 {
    public static final int c = pdh0.glide_custom_view_target_tag;
    public final a a;
    public final View b;

    public b(View view) {
        z2a1.e(view, "Argument must not be null");
        this.b = view;
        this.a = new a(view);
    }

    @Override // defpackage.iax0
    public final e5j0 getRequest() {
        Object tag = this.b.getTag(c);
        if (tag != null) {
            if (tag instanceof e5j0) {
                return (e5j0) tag;
            }
            ny61.g("You must not pass non-R.id ids to setTag(id)");
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, com.bumptech.glide.request.target.CustomViewTarget$SizeDeterminer$SizeDeterminerLayoutListener] */
    @Override // defpackage.iax0
    public final void getSize(ojs0 ojs0Var) {
        final a aVar = this.a;
        ArrayList arrayList = aVar.b;
        View view = aVar.a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int a = aVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int a2 = aVar.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((a > 0 || a == Integer.MIN_VALUE) && (a2 > 0 || a2 == Integer.MIN_VALUE)) {
            ojs0Var.onSizeReady(a, a2);
            return;
        }
        if (!arrayList.contains(ojs0Var)) {
            arrayList.add(ojs0Var);
        }
        if (aVar.c == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            ?? r0 = new ViewTreeObserver.OnPreDrawListener(aVar) { // from class: com.bumptech.glide.request.target.CustomViewTarget$SizeDeterminer$SizeDeterminerLayoutListener
                private final WeakReference<a> sizeDeterminerRef;

                {
                    this.sizeDeterminerRef = new WeakReference<>(aVar);
                }

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    Log.isLoggable("CustomViewTarget", 2);
                    a aVar2 = this.sizeDeterminerRef.get();
                    if (aVar2 == null) {
                        return true;
                    }
                    ArrayList arrayList2 = aVar2.b;
                    View view2 = aVar2.a;
                    if (arrayList2.isEmpty()) {
                        return true;
                    }
                    int paddingRight2 = view2.getPaddingRight() + view2.getPaddingLeft();
                    ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                    int a3 = aVar2.a(view2.getWidth(), layoutParams3 != null ? layoutParams3.width : 0, paddingRight2);
                    int paddingBottom2 = view2.getPaddingBottom() + view2.getPaddingTop();
                    ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                    int a4 = aVar2.a(view2.getHeight(), layoutParams4 != null ? layoutParams4.height : 0, paddingBottom2);
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
                        viewTreeObserver2.removeOnPreDrawListener(aVar2.c);
                    }
                    aVar2.c = null;
                    arrayList2.clear();
                    return true;
                }
            };
            aVar.c = r0;
            viewTreeObserver.addOnPreDrawListener(r0);
        }
    }

    @Override // defpackage.hey
    public final void onDestroy() {
    }

    @Override // defpackage.iax0
    public final void onLoadCleared(Drawable drawable) {
        a aVar = this.a;
        ViewTreeObserver viewTreeObserver = aVar.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(aVar.c);
        }
        aVar.c = null;
        aVar.b.clear();
    }

    @Override // defpackage.iax0
    public final void onLoadStarted(Drawable drawable) {
    }

    @Override // defpackage.hey
    public final void onStart() {
    }

    @Override // defpackage.hey
    public final void onStop() {
    }

    @Override // defpackage.iax0
    public final void removeCallback(ojs0 ojs0Var) {
        this.a.b.remove(ojs0Var);
    }

    @Override // defpackage.iax0
    public final void setRequest(e5j0 e5j0Var) {
        this.b.setTag(c, e5j0Var);
    }

    public final String toString() {
        return "Target for: " + this.b;
    }
}
