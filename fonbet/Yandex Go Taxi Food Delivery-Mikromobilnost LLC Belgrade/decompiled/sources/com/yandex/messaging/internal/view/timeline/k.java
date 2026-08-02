package com.yandex.messaging.internal.view.timeline;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.cmi;
import defpackage.dz2;
import defpackage.e9h0;
import defpackage.g8a1;
import defpackage.im91;
import defpackage.jwf;
import defpackage.olh0;
import defpackage.tbz0;
import defpackage.ubz0;
import defpackage.vb5;
import defpackage.yab;
import defpackage.z9z0;

/* loaded from: classes15.dex */
public final class k extends e {
    public static final int E0 = olh0.msg_vh_chat_hidden_message;
    public final TextView B0;
    public final dz2 C0;
    public boolean D0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k(jwf jwfVar) {
        super(false, r0, jwfVar);
        View g = g8a1.g((ViewGroup) jwfVar.k, olh0.msg_vh_chat_hidden_message);
        TextView textView = (TextView) g.findViewById(e9h0.timeline_message_container);
        this.B0 = textView;
        this.C0 = new dz2(4);
        textView.setMovementMethod(null);
        g.setOnClickListener(new cmi(29, this));
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final void X(yab yabVar, vb5 vb5Var) {
        super.X(yabVar, vb5Var);
        TextView textView = this.B0;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        this.D0 = yabVar.a1();
        if (yabVar.a1()) {
            this.O = new ubz0(yabVar.Z());
            layoutParams.gravity = 8388613;
        } else {
            this.O = new tbz0(yabVar.Z(), yabVar.a());
            layoutParams.gravity = 8388611;
        }
        textView.setLayoutParams(layoutParams);
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final void i0(Canvas canvas, z9z0 z9z0Var, boolean z, boolean z2) {
        Drawable a = z9z0Var.a(z, z2, this.D0, false, false);
        im91.i(a, this.a.getLayoutDirection());
        TextView textView = this.B0;
        a.setBounds(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
        a.draw(canvas);
    }
}
