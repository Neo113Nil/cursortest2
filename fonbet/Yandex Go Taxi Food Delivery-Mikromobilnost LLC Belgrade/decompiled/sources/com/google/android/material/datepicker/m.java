package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;
import defpackage.leh0;

/* loaded from: classes11.dex */
public final class m extends x0 {
    public final TextView N;
    public final MaterialCalendarGridView O;

    public m(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(leh0.month_title);
        this.N = textView;
        androidx.core.view.b.q(textView, true);
        this.O = (MaterialCalendarGridView) linearLayout.findViewById(leh0.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
