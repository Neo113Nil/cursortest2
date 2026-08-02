package com.yandex.messaging.internal.urlpreview.impl;

import android.content.Context;
import android.widget.Button;
import android.widget.TextView;
import defpackage.ewh0;
import defpackage.fx00;
import defpackage.oyh0;
import defpackage.pzt0;
import defpackage.rh21;
import defpackage.tje;
import defpackage.uxe0;

/* loaded from: classes15.dex */
public final class a extends uxe0 {
    @Override // defpackage.uxe0
    public final pzt0 a(rh21 rh21Var) {
        Button button = rh21Var.e;
        TextView textView = rh21Var.d;
        Context context = this.a;
        StringBuilder sb = new StringBuilder(context.getResources().getString(oyh0.messaging_url_preview_channel_type));
        sb.append(" • ");
        Integer num = this.h;
        int intValue = num != null ? num.intValue() : 0;
        if (intValue > 0) {
            sb.append(context.getResources().getQuantityString(ewh0.channel_subscribers_plural, intValue, Integer.valueOf(intValue)));
        }
        rh21Var.b.setText(sb.toString());
        rh21Var.c.setText(this.e);
        String str = this.f;
        if (str != null) {
            textView.setVisibility(0);
            textView.setText(str);
        } else {
            textView.setVisibility(8);
        }
        button.setText(oyh0.messaging_url_preview_navigate_to_channel);
        button.setOnClickListener(new fx00(25, this, this.d));
        return tje.N(this.j, null, null, new ChannelDataBinder$bindTo$1(this, rh21Var, null), 3);
    }
}
