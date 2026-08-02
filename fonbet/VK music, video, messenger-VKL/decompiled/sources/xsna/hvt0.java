package xsna;

import android.view.View;

/* compiled from: ViewExt2.kt */
/* loaded from: classes18.dex */
public final class hvt0 {
    public static final View a(int i, View view, izs izsVar) {
        View findViewById = view.findViewById(i);
        if (izsVar != null && findViewById != null) {
            findViewById.setOnClickListener(new xz5(izsVar, 14));
        }
        return findViewById;
    }

    public static final <T extends View> T b(View view, int i, View.OnClickListener onClickListener) {
        T t = (T) view.findViewById(i);
        if (t != null) {
            t.setOnClickListener(onClickListener);
        }
        return t;
    }

    public static View c(int i, View view) {
        return view.findViewById(i);
    }
}
