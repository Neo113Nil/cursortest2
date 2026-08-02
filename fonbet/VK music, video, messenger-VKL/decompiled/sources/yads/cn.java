package yads;

import android.content.Context;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.Lazy;
import xsna.an10;
import xsna.qcy;

/* loaded from: classes10.dex */
public final class cn {
    public final bn a;

    public cn(bn bnVar) {
        this.a = bnVar;
    }

    public final void a(ov0 ov0Var, rm rmVar) {
        Object obj;
        RelativeLayout.LayoutParams layoutParams;
        bn bnVar = this.a;
        ze1 ze1Var = bnVar.c;
        Context context = bnVar.a;
        Iterator it = ze1Var.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((ve1) obj).d.a(context)) {
                    break;
                }
            }
        }
        ve1 ve1Var = (ve1) obj;
        if (ve1Var != null) {
            xe1 xe1Var = bnVar.d;
            ViewGroup viewGroup = bnVar.b;
            xe1Var.getClass();
            Context context2 = viewGroup.getContext();
            int i = ve1Var.a;
            Class cls = ve1Var.b;
            xe1Var.a.getClass();
            ViewGroup viewGroup2 = (ViewGroup) ft2.a(context2, cls, i, viewGroup);
            if (viewGroup2 != null) {
                an anVar = bnVar.e;
                ViewGroup viewGroup3 = bnVar.b;
                mn2 mn2Var = anVar.c;
                qcy qcyVar = an.d[0];
                mn2Var.getClass();
                mn2Var.a = new WeakReference(viewGroup2);
                viewGroup3.setVisibility(0);
                viewGroup3.removeAllViews();
                Context context3 = viewGroup3.getContext();
                ViewTreeObserver.OnPreDrawListener onPreDrawListener = anVar.a;
                Lazy lazy = ql3.a;
                if (viewGroup3.indexOfChild(viewGroup2) == -1) {
                    if (ov0Var != null) {
                        layoutParams = new RelativeLayout.LayoutParams(om3.a(context3, ov0Var.c(context3)), an10.b(TypedValue.applyDimension(1, ov0Var.a(context3), context3.getResources().getDisplayMetrics())));
                    } else {
                        layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    }
                    layoutParams.addRule(13);
                    viewGroup3.setVisibility(0);
                    viewGroup2.setVisibility(0);
                    viewGroup3.addView(viewGroup2, layoutParams);
                    if (onPreDrawListener != null) {
                        an3 an3Var = om3.a;
                        viewGroup2.getViewTreeObserver().addOnPreDrawListener(new nm3(viewGroup2, onPreDrawListener));
                    }
                }
                zf0 zf0Var = ve1Var.c;
                anVar.b = zf0Var;
                if (zf0Var != null) {
                    zf0Var.a(viewGroup2);
                }
                rmVar.a();
                return;
            }
        }
        rmVar.a(h9.f);
    }
}
