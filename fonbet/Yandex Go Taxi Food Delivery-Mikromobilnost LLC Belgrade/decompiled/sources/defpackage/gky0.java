package defpackage;

import android.view.View;
import android.widget.TextView;
import com.yandex.div.core.view2.Div2View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class gky0 implements dpk {
    public static final int a = kp50.r(1);
    public static final int b = kp50.r(1);

    @Override // defpackage.dpk
    public final void bindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        TextView textView = view instanceof TextView ? (TextView) view : null;
        if (textView != null) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(a, (int) textView.getTextSize(), b, 0);
        }
    }

    @Override // defpackage.dpk
    public final boolean matches(egk egkVar) {
        if (!(egkVar instanceof ffl)) {
            return false;
        }
        List list = ((ffl) egkVar).q;
        Object obj = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (jl40.l(((bpk) next).a, "autosize")) {
                    obj = next;
                    break;
                }
            }
            obj = (bpk) obj;
        }
        return obj != null;
    }

    @Override // defpackage.dpk
    public final void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
    }
}
