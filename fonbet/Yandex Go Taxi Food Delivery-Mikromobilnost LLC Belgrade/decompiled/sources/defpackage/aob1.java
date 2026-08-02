package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.widget.TextView;
import com.google.android.gms.common.moduleinstall.internal.c;
import com.yandex.plus.core.gradient.api.PlusDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* loaded from: classes2.dex */
public abstract class aob1 {
    public static c a(Context context) {
        return new c(context, null, c.k, mm2.V0, sst.c);
    }

    public static final LinkedHashMap b(Pair... pairArr) {
        ArrayList arrayList = new ArrayList();
        for (Pair pair : pairArr) {
            if (pair.f() != null) {
                arrayList.add(pair);
            }
        }
        int d = gw00.d(tcc.n(arrayList, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair2 = (Pair) it.next();
            Pair pair3 = new Pair(pair2.c(), pair2.f());
            linkedHashMap.put(pair3.c(), pair3.f());
        }
        return linkedHashMap;
    }

    public static final void c(TextView textView, h2d0 h2d0Var, tls tlsVar) {
        if (h2d0Var instanceof f2d0) {
            textView.getPaint().setShader(null);
            int i = ((f2d0) h2d0Var).a;
            textView.setTextColor(i);
            tlsVar.invoke(Integer.valueOf(i));
            return;
        }
        if (!(h2d0Var instanceof g2d0)) {
            w511.b();
            return;
        }
        if (textView.getVisibility() == 0) {
            Rect rect = new Rect();
            textView.getPaint().getTextBounds(textView.getText().toString(), 0, textView.getText().length(), rect);
            PlusDrawable plusDrawable = ((g2d0) h2d0Var).a;
            plusDrawable.setBounds(rect);
            textView.getPaint().setShader(plusDrawable.getCurrentShader());
        }
    }
}
