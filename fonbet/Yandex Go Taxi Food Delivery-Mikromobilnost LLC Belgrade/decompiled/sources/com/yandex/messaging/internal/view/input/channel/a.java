package com.yandex.messaging.internal.view.input.channel;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import com.yandex.bricks.Brick;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.SendAction;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.chat.domain.c;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import com.yandex.messaging.internal.view.input.selection.SelectedMessagesPanel;
import defpackage.ao3;
import defpackage.bo3;
import defpackage.cqr0;
import defpackage.dn7;
import defpackage.e9h0;
import defpackage.f620;
import defpackage.fb90;
import defpackage.fcf;
import defpackage.fk6;
import defpackage.gvg0;
import defpackage.h3y;
import defpackage.hi91;
import defpackage.j3b;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.k0b;
import defpackage.olh0;
import defpackage.oo90;
import defpackage.p4t;
import defpackage.pu31;
import defpackage.sfl0;
import defpackage.x22;
import defpackage.y420;
import defpackage.zm90;
import java.util.Arrays;
import java.util.Collections;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes15.dex */
public final class a extends Brick implements fb90, ao3 {
    public final h3y A;
    public final h3y B;
    public final h3y C;
    public final h3y D;
    public final sfl0 E;
    public final ChatInputHeightState F;
    public final k0b G;
    public final Resources H;
    public final View I;
    public final View J;
    public final ImageButton K;
    public final View L;
    public final ImageButton M;
    public final View N;
    public j3b O;
    public String P;
    public final Activity a;
    public final ChatRequest b;
    public final p4t c;
    public final c w;
    public final x22 x;
    public final bo3 y;
    public final fcf z;

    public a(Activity activity, ChatRequest chatRequest, p4t p4tVar, c cVar, x22 x22Var, bo3 bo3Var, fcf fcfVar, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, sfl0 sfl0Var, ChatInputHeightState chatInputHeightState, k0b k0bVar, pu31 pu31Var, SelectedMessagesPanel selectedMessagesPanel) {
        this.a = activity;
        this.b = chatRequest;
        this.c = p4tVar;
        this.w = cVar;
        this.x = x22Var;
        this.y = bo3Var;
        this.z = fcfVar;
        this.A = h3yVar;
        this.B = h3yVar2;
        this.C = h3yVar3;
        this.D = h3yVar4;
        this.E = sfl0Var;
        this.F = chatInputHeightState;
        this.G = k0bVar;
        this.H = activity.getResources();
        View inflate = inflate(activity, olh0.msg_b_input_channel);
        this.I = inflate;
        View findViewById = inflate.findViewById(e9h0.share_text);
        this.J = findViewById;
        ImageButton imageButton = (ImageButton) inflate.findViewById(e9h0.share_button);
        this.K = imageButton;
        View findViewById2 = inflate.findViewById(e9h0.subscribe_text);
        this.L = findViewById2;
        this.M = (ImageButton) inflate.findViewById(e9h0.notification_button);
        this.N = inflate.findViewById(e9h0.input_button);
        hi91.g(new ChannelInput$1(this, null), imageButton);
        hi91.g(new ChannelInput$2(this, null), findViewById);
        hi91.g(new ChannelInput$3(this, null), findViewById2);
        pu31Var.a(inflate, "subscribe", null);
        selectedMessagesPanel.insertInto((fk6) inflate.findViewById(e9h0.messaging_input_slot));
        selectedMessagesPanel.setForwardListener(this);
        if (jl40.l(fcfVar.a, chatRequest)) {
            fcfVar.a = null;
            r();
        }
    }

    public static final void q(a aVar) {
        String str = aVar.P;
        if (str == null || aVar.O == null) {
            return;
        }
        sfl0 sfl0Var = aVar.E;
        y420 y420Var = y420.d;
        SendAction sendAction = SendAction.NO_ACTION;
        Collections.singletonList(str);
        sfl0Var.getClass();
        new cqr0(y420Var);
    }

    @Override // defpackage.ao3
    public final void a() {
        r();
    }

    @Override // defpackage.ao3
    public final void f() {
        this.z.a = this.b;
        this.x.c("am account request", CRLReasonCodeExtension.REASON, "android_messenger_subscribe_channel");
        Intent b = ((oo90) this.A.get()).b("android_messenger_subscribe_channel");
        if (b == null) {
            return;
        }
        startActivityForResult(b, 0);
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        return this.I;
    }

    @Override // defpackage.fb90
    public final void m(ServerMessageRef[] serverMessageRefArr) {
        if (this.O != null) {
            f620 f620Var = f620.d;
            SendAction sendAction = SendAction.NO_ACTION;
            Arrays.asList(serverMessageRefArr);
            this.E.getClass();
            new cqr0(f620Var);
        }
    }

    @Override // com.yandex.bricks.Brick
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        boolean b = ((zm90) this.B.get()).b(i2, intent);
        x22 x22Var = this.x;
        if (!b) {
            x22Var.c("am account answer", "answer", "fail");
            return;
        }
        x22Var.c("am account answer", "answer", "success");
        this.z.a = this.b;
        r();
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickAttach() {
        super.onBrickAttach();
        this.F.a(this.H.getDimensionPixelSize(gvg0.chat_input_button_height));
        p4t p4tVar = this.c;
        ChatRequest chatRequest = this.b;
        e.H(getBrickScope(), new jqr(p4tVar.a(chatRequest), new ChannelInput$onBrickAttach$1(this, null), 3));
        e.H(getBrickScope(), new jqr(this.w.a(chatRequest), new ChannelInput$onBrickAttach$2(this, null), 3));
    }

    public final void r() {
        this.G.a();
        ((Handler) this.C.get()).post(new dn7(22, this));
    }
}
