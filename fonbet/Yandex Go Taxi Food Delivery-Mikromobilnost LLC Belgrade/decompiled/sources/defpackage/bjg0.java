package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class bjg0 implements zo31 {
    public final LinearLayout a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final y2j e;
    public final y2j f;

    public bjg0(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, y2j y2jVar, y2j y2jVar2) {
        this.a = linearLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = y2jVar;
        this.f = y2jVar2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
