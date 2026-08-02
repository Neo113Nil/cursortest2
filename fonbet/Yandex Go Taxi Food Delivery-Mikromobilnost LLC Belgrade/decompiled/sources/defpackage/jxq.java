package defpackage;

import android.view.View;
import android.widget.CheckBox;
import androidx.recyclerview.widget.x0;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class jxq extends x0 {
    public static final /* synthetic */ kgx[] Q = {new PropertyReference1Impl("textView", 0, "getTextView()Landroid/widget/TextView;", jxq.class), b64.x(qoi0.a, jxq.class, "checkbox", "getCheckbox()Landroid/widget/CheckBox;", 0)};
    public final wls N;
    public final wv5 O;
    public final wv5 P;

    public jxq(wls wlsVar, View view) {
        super(view);
        this.N = wlsVar;
        this.O = new wv5(new sdg(view, s9h0.plus_debug_panel_dialog_item_text, 17));
        this.P = new wv5(new sdg(view, s9h0.plus_debug_panel_dialog_item_checkbox, 18));
    }

    public final CheckBox W() {
        return (CheckBox) this.P.a(Q[1]);
    }
}
