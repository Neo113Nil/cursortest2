package defpackage;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.widgets.common.drawable.gradient.RoundedCornersLinearGradientDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes3.dex */
public abstract class pha1 {
    public static m481 a() {
        if (m481.b == null) {
            synchronized (m481.c) {
                if (m481.b == null) {
                    m481.b = new m481();
                }
            }
        }
        m481 m481Var = m481.b;
        if (m481Var != null) {
            return m481Var;
        }
        ny61.r("Required value was null.");
        return null;
    }

    public static final void b(ConstraintLayout constraintLayout, qzt qztVar, ColorModel colorModel, int i, int i2) {
        if (qztVar != null) {
            List list = qztVar.a;
            if (!list.isEmpty()) {
                constraintLayout.setBackground(new RoundedCornersLinearGradientDrawable(a.I0(list), constraintLayout.getResources().getDimension(i2), qztVar.b));
                return;
            }
        }
        constraintLayout.setBackgroundResource(i);
        constraintLayout.getBackground().setTint(colorModel.get(constraintLayout.getContext()));
    }

    public static final qzt c(dyt dytVar, Context context, srp0 srp0Var) {
        ArrayList arrayList = dytVar.a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ColorModel a = gxy0.a((fxy0) it.next());
            if (a == null) {
                x4c.h("Failed to parse", new srp0[]{srp0Var}, "colors=" + arrayList, 4);
                arrayList2 = null;
                break;
            }
            arrayList2.add(a);
        }
        if (arrayList2 == null) {
            return null;
        }
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Integer.valueOf(((ColorModel) it2.next()).get(context)));
        }
        return new qzt(a.J0(arrayList3), dytVar.b);
    }
}
