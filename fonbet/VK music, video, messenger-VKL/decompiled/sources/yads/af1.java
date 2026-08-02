package yads;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class af1 {
    public final Context a;
    public final ViewGroup b;
    public final ze1 c;
    public final xe1 d;
    public final we1 e;

    public af1(Context context, ViewGroup viewGroup, ze1 ze1Var, xe1 xe1Var, we1 we1Var) {
        this.a = context;
        this.b = viewGroup;
        this.c = ze1Var;
        this.d = xe1Var;
        this.e = we1Var;
    }

    public final boolean a() {
        Object obj;
        ze1 ze1Var = this.c;
        Context context = this.a;
        Iterator it = ze1Var.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ve1) obj).d.a(context)) {
                break;
            }
        }
        ve1 ve1Var = (ve1) obj;
        if (ve1Var == null) {
            return false;
        }
        xe1 xe1Var = this.d;
        ViewGroup viewGroup = this.b;
        xe1Var.getClass();
        Context context2 = viewGroup.getContext();
        int i = ve1Var.a;
        Class cls = ve1Var.b;
        xe1Var.a.getClass();
        ViewGroup viewGroup2 = (ViewGroup) ft2.a(context2, cls, i, viewGroup);
        if (viewGroup2 == null) {
            return false;
        }
        we1 we1Var = this.e;
        ViewGroup viewGroup3 = this.b;
        we1Var.getClass();
        try {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            viewGroup3.removeAllViews();
            viewGroup3.addView(viewGroup2, layoutParams);
        } catch (Throwable unused) {
        }
        zf0 zf0Var = ve1Var.c;
        we1Var.a = zf0Var;
        if (zf0Var == null) {
            return true;
        }
        zf0Var.a(viewGroup2);
        return true;
    }

    public final void b() {
        we1 we1Var = this.e;
        ViewGroup viewGroup = this.b;
        we1Var.getClass();
        try {
            viewGroup.removeAllViews();
            zf0 zf0Var = we1Var.a;
            if (zf0Var != null) {
                zf0Var.c();
            }
        } catch (Throwable unused) {
        }
    }
}
