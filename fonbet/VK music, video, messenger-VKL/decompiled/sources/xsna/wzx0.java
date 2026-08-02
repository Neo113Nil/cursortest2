package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;
import xsna.a5x;

/* compiled from: Wrapper.android.kt */
/* loaded from: classes11.dex */
public final class wzx0 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final rzx0 a(td tdVar, iri iriVar, jai jaiVar) {
        p52 p52Var;
        rzx0 rzx0Var;
        if (n2u.a.compareAndSet(false, true)) {
            nm8 a2 = w0b.a(1, null, null, 6);
            myc0.h(zvj.a((kotlin.coroutines.d) od2.m.getValue()), null, null, new l2u(a2, null), 3);
            m2u m2uVar = new m2u(a2);
            synchronized (qak0.c) {
                qak0.i = j5g.v0(m2uVar, qak0.i);
                s3q0 s3q0Var = s3q0.a;
            }
            qak0.a();
        }
        if (tdVar.getChildCount() > 0) {
            View childAt = tdVar.getChildAt(0);
            p52Var = childAt instanceof p52 ? (p52) childAt : null;
            if (p52Var != null) {
                p52Var.setComposeViewContext(iriVar);
                if (p52Var == null) {
                    p52Var = new p52(tdVar.getContext(), iriVar);
                    tdVar.addView(p52Var.getView(), a);
                }
                p52Var.setComposeViewContext(iriVar);
                if (tdVar.getComposeViewContext$ui() != null) {
                    iriVar.c();
                    p52Var.setComposeViewContextIncrementedDuringInit$ui(true);
                }
                a5x.a aVar = a5x.a;
                Object tag = p52Var.getTag(R.id.wrapped_composition_tag);
                rzx0Var = tag instanceof rzx0 ? (rzx0) tag : null;
                if (rzx0Var == null) {
                    rzx0Var = new rzx0(p52Var, new ivi(iriVar.b, new myp0(p52Var.getRoot())));
                    p52Var.setTag(R.id.wrapped_composition_tag, rzx0Var);
                }
                rzx0Var.d(jaiVar);
                p52Var.setFrameEndScheduler$ui(new vzx0(iriVar.b));
                return rzx0Var;
            }
        } else {
            tdVar.removeAllViews();
        }
        p52Var = null;
        if (p52Var == null) {
        }
        p52Var.setComposeViewContext(iriVar);
        if (tdVar.getComposeViewContext$ui() != null) {
        }
        a5x.a aVar2 = a5x.a;
        Object tag2 = p52Var.getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof rzx0) {
        }
        if (rzx0Var == null) {
        }
        rzx0Var.d(jaiVar);
        p52Var.setFrameEndScheduler$ui(new vzx0(iriVar.b));
        return rzx0Var;
    }
}
