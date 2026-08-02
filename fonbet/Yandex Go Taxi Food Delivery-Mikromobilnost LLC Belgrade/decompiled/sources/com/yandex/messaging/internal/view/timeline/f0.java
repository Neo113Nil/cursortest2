package com.yandex.messaging.internal.view.timeline;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.messaging.core.net.entities.proto.calls.CallInfo;
import com.yandex.messaging.internal.entities.TechCallInfoMessage;
import defpackage.e9h0;
import defpackage.g8a1;
import defpackage.im91;
import defpackage.jwf;
import defpackage.kw;
import defpackage.olh0;
import defpackage.oyh0;
import defpackage.ubz0;
import defpackage.vb5;
import defpackage.yab;
import defpackage.z9z0;

/* loaded from: classes15.dex */
public final class f0 extends e {
    public static final int H0 = olh0.msg_vh_chat_technical_outgoing_call_message;
    public final ConstraintLayout B0;
    public final ImageView C0;
    public final ImageView D0;
    public final TextView E0;
    public final TextView F0;
    public final kw G0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f0(jwf jwfVar) {
        super(false, r0, jwfVar);
        View g = g8a1.g((ViewGroup) jwfVar.k, olh0.msg_vh_chat_technical_outgoing_call_message);
        ConstraintLayout constraintLayout = (ConstraintLayout) g.findViewById(e9h0.outgoing_call_container);
        this.B0 = constraintLayout;
        this.C0 = (ImageView) g.findViewById(e9h0.successful_call);
        this.D0 = (ImageView) g.findViewById(e9h0.failed_call);
        this.E0 = (TextView) g.findViewById(e9h0.additional_info);
        this.F0 = (TextView) g.findViewById(e9h0.time);
        this.G0 = new kw(constraintLayout.getContext());
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final void X(yab yabVar, vb5 vb5Var) {
        super.X(yabVar, vb5Var);
        TechCallInfoMessage techCallInfoMessage = (TechCallInfoMessage) yabVar.R();
        CallInfo callInfo = techCallInfoMessage.callInfo;
        int i = callInfo.callStatus;
        View view = this.a;
        this.E0.setText(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : view.getContext().getString(oyh0.call_canceled_for_caller_text) : view.getContext().getString(oyh0.call_failed) : view.getContext().getString(oyh0.call_declined) : view.getContext().getString(oyh0.call_canceled_for_caller_text) : this.G0.b(callInfo.duration));
        String str = techCallInfoMessage.callInfo.callGuid;
        yabVar.T();
        this.F0.setText(DateFormat.getTimeFormat(view.getContext()).format(yabVar.T()));
        this.O = new ubz0(yabVar.Z());
        int i2 = techCallInfoMessage.callInfo.callStatus;
        ImageView imageView = this.D0;
        ImageView imageView2 = this.C0;
        if (i2 == 1) {
            imageView2.setVisibility(0);
            imageView.setVisibility(4);
        } else {
            imageView2.setVisibility(4);
            imageView.setVisibility(0);
        }
        ConstraintLayout constraintLayout = this.B0;
        constraintLayout.setOnClickListener(null);
        constraintLayout.setOnLongClickListener(null);
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final void i0(Canvas canvas, z9z0 z9z0Var, boolean z, boolean z2) {
        Drawable a = z9z0Var.a(z, z2, true, false, false);
        im91.i(a, this.a.getLayoutDirection());
        ConstraintLayout constraintLayout = this.B0;
        a.setBounds(constraintLayout.getLeft(), 0, constraintLayout.getRight(), constraintLayout.getBottom());
        a.draw(canvas);
    }
}
