package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import xsna.exy0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class w5z0 extends exy0 {
    public int g;
    public a h;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int paddingLeft;
            int paddingTop;
            int paddingLeft2;
            int paddingTop2;
            int i9;
            w5z0 w5z0Var = w5z0.this;
            WeakReference weakReference = w5z0Var.f;
            r5z0 r5z0Var = weakReference != null ? (r5z0) weakReference.get() : null;
            if (r5z0Var == null) {
                return;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int measuredWidth2 = r5z0Var.getMeasuredWidth();
            int measuredHeight2 = r5z0Var.getMeasuredHeight();
            int i10 = w5z0Var.g;
            if (i10 != 1) {
                if (i10 == 2) {
                    paddingLeft = (measuredWidth - measuredWidth2) - view.getPaddingLeft();
                    int paddingBottom = (measuredHeight - view.getPaddingBottom()) - measuredHeight2;
                    paddingLeft2 = measuredWidth - view.getPaddingRight();
                    i9 = measuredHeight - view.getPaddingBottom();
                    paddingTop = paddingBottom;
                } else if (i10 == 3) {
                    paddingLeft = view.getPaddingLeft();
                    int paddingBottom2 = (measuredHeight - view.getPaddingBottom()) - measuredHeight2;
                    int paddingLeft3 = measuredWidth2 + view.getPaddingLeft();
                    i9 = measuredHeight - view.getPaddingBottom();
                    paddingTop = paddingBottom2;
                    paddingLeft2 = paddingLeft3;
                } else {
                    if (i10 == 4 || i10 == 5) {
                        return;
                    }
                    paddingLeft = (measuredWidth - measuredWidth2) - view.getPaddingLeft();
                    paddingTop = view.getPaddingTop();
                    paddingLeft2 = measuredWidth - view.getPaddingRight();
                    paddingTop2 = view.getPaddingTop();
                }
                r5z0Var.layout(paddingLeft, paddingTop, paddingLeft2, i9);
            }
            paddingLeft = view.getPaddingLeft();
            paddingTop = view.getPaddingTop();
            paddingLeft2 = view.getPaddingLeft() + measuredWidth2;
            paddingTop2 = view.getPaddingTop();
            i9 = paddingTop2 + measuredHeight2;
            r5z0Var.layout(paddingLeft, paddingTop, paddingLeft2, i9);
        }
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, xsna.o2z0$b] */
    public final void b(ViewGroup viewGroup, ubz0 ubz0Var, exy0.a aVar, int i) {
        WeakReference weakReference = ubz0Var.f;
        View view = weakReference != null ? (View) weakReference.get() : null;
        this.g = i;
        fvy0 fvy0Var = this.b;
        if (i == 5) {
            if (fvy0Var != null) {
                fvy0Var.d = aVar;
            }
            gu8.c(null, "NativeAdChoicesController: No need to add AdChoicesView, adChoicesPlacement is DRAWING_MANUAL");
            return;
        }
        if (view != null && !(view instanceof r5z0)) {
            gu8.c(null, "NativeAdChoicesController: Warning! You must use AdChoicesView class for placement " + i);
            return;
        }
        r5z0 r5z0Var = (r5z0) view;
        wty0 wty0Var = this.a;
        if (wty0Var == null) {
            if (r5z0Var != null) {
                r5z0Var.setImageBitmap(null);
                r5z0Var.setImageDrawable(null);
                r5z0Var.setVisibility(8);
                r5z0Var.setOnClickListener(null);
                return;
            }
            return;
        }
        if (r5z0Var == null) {
            Context context = viewGroup.getContext();
            r5z0 r5z0Var2 = new r5z0(context, null);
            c1z0.n(r5z0Var2, "ad_choices");
            int d = c1z0.d(2, context);
            r5z0Var2.setPadding(d, d, d, d);
            ubz0Var.f = new WeakReference(r5z0Var2);
            r5z0Var = r5z0Var2;
        }
        if (r5z0Var.getParent() == null) {
            try {
                viewGroup.addView(r5z0Var);
            } catch (Throwable th) {
                eb3.a(null, new StringBuilder("NativeAdChoicesController: Unable to add AdChoices View - "), th);
            }
        }
        if (i != 4) {
            viewGroup.addOnLayoutChangeListener(this.h);
        }
        if (fvy0Var != null) {
            fvy0Var.d = aVar;
        }
        this.f = new WeakReference(r5z0Var);
        r5z0Var.setVisibility(0);
        r5z0Var.setOnClickListener(this.e);
        if (r5z0Var.b == null && r5z0Var.c == null) {
            kiw kiwVar = wty0Var.a;
            Bitmap a2 = kiwVar.a();
            if (a2 != null) {
                r5z0Var.setImageBitmap(a2);
            } else {
                o2z0.e(kiwVar, r5z0Var, this.c);
            }
        }
    }

    public final void c(ViewGroup viewGroup) {
        fvy0 fvy0Var = this.b;
        if (fvy0Var != null) {
            fvy0Var.d = null;
        }
        WeakReference weakReference = this.f;
        r5z0 r5z0Var = weakReference != null ? (r5z0) weakReference.get() : null;
        if (r5z0Var != null) {
            wty0 wty0Var = this.a;
            if (wty0Var != null) {
                o2z0.d(wty0Var.a, r5z0Var);
            }
            r5z0Var.setImageBitmap(null);
            r5z0Var.setImageDrawable(null);
            r5z0Var.setVisibility(8);
            r5z0Var.setOnClickListener(null);
            this.f.clear();
            this.f = null;
        }
        a aVar = this.h;
        if (aVar == null) {
            return;
        }
        viewGroup.removeOnLayoutChangeListener(aVar);
    }
}
