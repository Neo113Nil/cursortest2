package com.yandex.messaging.internal.view.timeline;

import android.database.Cursor;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.TechBaseMessage;
import defpackage.e1k;
import defpackage.e9h0;
import defpackage.evu0;
import defpackage.fxa1;
import defpackage.g8a1;
import defpackage.jcy0;
import defpackage.jng0;
import defpackage.jwf;
import defpackage.kcy0;
import defpackage.kgx;
import defpackage.n2v0;
import defpackage.ny61;
import defpackage.olh0;
import defpackage.ooy0;
import defpackage.oyr;
import defpackage.qoi0;
import defpackage.qp3;
import defpackage.r400;
import defpackage.smt0;
import defpackage.tmt0;
import defpackage.v3k0;
import defpackage.vb5;
import defpackage.vbz0;
import defpackage.x22;
import defpackage.yab;
import defpackage.z83;
import java.io.IOException;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class e0 extends e implements jcy0 {
    public final x22 B0;
    public final tmt0 C0;
    public final kcy0 D0;
    public final TextView E0;
    public final ViewGroup.LayoutParams F0;
    public final v3k0 G0;
    public final qp3 H0;
    public final qp3 I0;
    public static final /* synthetic */ kgx[] K0 = {new MutablePropertyReference1Impl("techMessageSubscription", 0, "getTechMessageSubscription()Lcom/yandex/alicekit/core/Disposable;", e0.class), oyr.B(qoi0.a, e0.class, "spannableMessageSubscription", "getSpannableMessageSubscription()Lcom/yandex/messaging/internal/SpannableMessageSubscription;", 0)};
    public static final r400 J0 = new r400(14);
    public static final int L0 = olh0.msg_vh_chat_technical_message;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e0(jwf jwfVar) {
        super(false, r0, jwfVar);
        View g = g8a1.g((ViewGroup) jwfVar.k, olh0.msg_vh_chat_technical_message);
        this.B0 = (x22) jwfVar.a;
        this.C0 = (tmt0) jwfVar.t;
        this.D0 = (kcy0) jwfVar.z;
        TextView textView = (TextView) g.findViewById(e9h0.technical_message_text);
        this.E0 = textView;
        this.F0 = g.getLayoutParams();
        this.G0 = (v3k0) ((ooy0) jwfVar.q).a();
        this.H0 = new qp3();
        this.I0 = new qp3();
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final void X(yab yabVar, vb5 vb5Var) {
        e0 e0Var;
        com.yandex.messaging.internal.e0 e0Var2;
        super.X(yabVar, vb5Var);
        if (!(yabVar.R() instanceof TechBaseMessage)) {
            Pair pair = new Pair("message type", yabVar.a0());
            Pair pair2 = new Pair("message data type", Integer.valueOf(yabVar.R().type));
            Cursor cursor = yabVar.a;
            if (cursor.isNull(5)) {
                ny61.r("Check failed.");
                return;
            }
            try {
                this.B0.reportEvent("tech message data class cast error", kotlin.collections.b.i(pair, pair2, new Pair("message data ignore cache type", Integer.valueOf(((MessageData) yabVar.w.fromJson(cursor.getString(5))).type)), new Pair("is technical message", Boolean.valueOf(yabVar.c1()))));
            } catch (IOException e) {
                ny61.j(e);
                return;
            }
        }
        TechBaseMessage techBaseMessage = (TechBaseMessage) yabVar.R();
        kgx[] kgxVarArr = K0;
        kgx kgxVar = kgxVarArr[0];
        qp3 qp3Var = this.H0;
        z83.f((e1k) qp3Var.a(), null);
        this.O = new vbz0(yabVar.Z());
        boolean a1 = yabVar.a1();
        String str = techBaseMessage.initiator;
        kcy0 kcy0Var = this.D0;
        if (a1) {
            ChatRequest chatRequest = e0().d;
            kcy0Var.getClass();
            e0Var = this;
            e0Var2 = new com.yandex.messaging.internal.e0(kcy0Var, e0Var, techBaseMessage, str, true, chatRequest);
        } else {
            e0Var = this;
            ChatRequest chatRequest2 = e0Var.e0().d;
            kcy0Var.getClass();
            e0Var2 = new com.yandex.messaging.internal.e0(kcy0Var, e0Var, techBaseMessage, str, false, chatRequest2);
        }
        kgx kgxVar2 = kgxVarArr[0];
        qp3Var.b(e0Var2);
        e0Var.e0().g.c = fxa1.c(jng0.messagingIncomingLinkColor, e0Var.a.getContext()).data;
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final void f0() {
        super.f0();
        kgx[] kgxVarArr = K0;
        kgx kgxVar = kgxVarArr[0];
        this.H0.b(null);
        kgx kgxVar2 = kgxVarArr[1];
        this.I0.b(null);
    }

    @Override // defpackage.jcy0
    public final void u(String str) {
        View view = this.a;
        if (str == null || evu0.J(str)) {
            view.setVisibility(8);
            view.setLayoutParams(new RecyclerView.LayoutParams(0, 0));
            return;
        }
        view.setVisibility(0);
        view.setLayoutParams(this.F0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.G0.b(2, str));
        l lVar = e0().g;
        n2v0 n2v0Var = new n2v0(14, this);
        tmt0 tmt0Var = this.C0;
        tmt0Var.getClass();
        smt0 smt0Var = new smt0(tmt0Var, n2v0Var, spannableStringBuilder, lVar, false);
        kgx kgxVar = K0[1];
        this.I0.b(smt0Var);
    }
}
