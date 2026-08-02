package xsna;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: DotsFactory.kt */
/* loaded from: classes3.dex */
public class u5o {
    public r5o createDot(Context context) {
        r5o r5oVar = new r5o(context);
        int a = iah0.a(12);
        int a2 = iah0.a(10);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a, a);
        layoutParams.setMargins(a2, a2, a2, a2);
        r5oVar.setLayoutParams(layoutParams);
        return r5oVar;
    }
}
