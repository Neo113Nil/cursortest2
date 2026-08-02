package com.yandex.messaging.internal.view.timeline;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import defpackage.bh11;
import defpackage.e9h0;
import defpackage.g8a1;
import defpackage.jwf;
import defpackage.m421;
import defpackage.n421;
import defpackage.o421;
import defpackage.olh0;
import defpackage.v1b;
import defpackage.vb5;
import defpackage.vbz0;
import defpackage.yab;

/* loaded from: classes15.dex */
public final class h0 extends e implements m421 {
    public static final int F0 = olh0.msg_vh_chat_unsupported_message_item;
    public final TextView B0;
    public final n421 C0;
    public final o421 D0;
    public v1b E0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h0(jwf jwfVar) {
        super(false, r0, jwfVar);
        View g = g8a1.g((ViewGroup) jwfVar.k, olh0.msg_vh_chat_unsupported_message_item);
        this.B0 = (TextView) g8a1.e(e9h0.unsupported_message_text, g);
        this.C0 = (n421) jwfVar.G;
        this.D0 = (o421) jwfVar.H;
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final void X(yab yabVar, vb5 vb5Var) {
        super.X(yabVar, vb5Var);
        this.O = new vbz0(yabVar.Z());
        String a = yabVar.a();
        n421 n421Var = this.C0;
        n421Var.getClass();
        this.E0 = new v1b(n421Var, this, a);
        o421 o421Var = this.D0;
        o421Var.b.post(new bh11(5, o421Var));
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final void f0() {
        super.f0();
        v1b v1bVar = this.E0;
        if (v1bVar != null) {
            v1bVar.close();
            this.E0 = null;
        }
    }

    @Override // defpackage.m421
    public final void j(String str) {
        this.B0.setText(str);
    }
}
