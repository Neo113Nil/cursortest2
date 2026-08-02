package com.yandex.messaging.ui.calls.feedback;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.bricks.Brick;
import com.yandex.bricks.BrickSlotView;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.activity.calls.MessengerCallFeedbackArguments;
import defpackage.e9h0;
import defpackage.euq;
import defpackage.gvg0;
import defpackage.hdu;
import defpackage.jqr;
import defpackage.k5;
import defpackage.kv5;
import defpackage.md6;
import defpackage.o020;
import defpackage.olh0;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tje;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class a extends Brick {
    public final TextView A;
    public final EditText B;
    public final Button C;
    public final Button D;
    public final TextView E;
    public final ArrayList F;
    public final ArrayList G;
    public final String H;
    public final String I;
    public final Integer J;
    public final Boolean K;
    public final Long L;
    public Integer M;
    public final ChatRequest a;
    public final md6 b;
    public final com.yandex.messaging.internal.displayname.a c;
    public final euq w;
    public final View x;
    public final ImageView y;
    public final ImageView z;

    public a(Activity activity, final o020 o020Var, MessengerCallFeedbackArguments messengerCallFeedbackArguments, ChatRequest chatRequest, md6 md6Var, com.yandex.messaging.internal.displayname.a aVar, euq euqVar) {
        this.a = chatRequest;
        this.b = md6Var;
        this.c = aVar;
        this.w = euqVar;
        this.H = messengerCallFeedbackArguments.getCallGuid();
        this.I = messengerCallFeedbackArguments.getMeetingId();
        this.J = messengerCallFeedbackArguments.getMeetingEndReason();
        this.K = messengerCallFeedbackArguments.getIsCallInitiator();
        this.L = messengerCallFeedbackArguments.getTimestamp();
        tje.e();
        View inflate = inflate(activity, olh0.msg_b_call_feedback);
        this.x = inflate;
        euqVar.insertInto((BrickSlotView) inflate.findViewById(e9h0.call_feedback_reasons_brick_slot)).getView().setVisibility(8);
        this.y = (ImageView) inflate.findViewById(e9h0.calls_remote_user_avatar);
        this.z = (ImageView) inflate.findViewById(e9h0.calls_small_remote_user_avatar);
        this.A = (TextView) inflate.findViewById(e9h0.calls_remote_user_name);
        this.B = (EditText) inflate.findViewById(e9h0.calls_feedback_details_message);
        this.E = (TextView) inflate.findViewById(e9h0.calls_feedback_warning);
        List g = scc.g(Integer.valueOf(e9h0.feedback_title), Integer.valueOf(e9h0.calls_small_remote_user_avatar), Integer.valueOf(e9h0.call_feedback_reasons_brick_slot));
        ArrayList arrayList = new ArrayList(tcc.n(g, 10));
        Iterator it = g.iterator();
        while (it.hasNext()) {
            arrayList.add(this.x.findViewById(((Number) it.next()).intValue()));
        }
        this.F = arrayList;
        List g2 = scc.g(Integer.valueOf(e9h0.calls_remote_user_avatar), Integer.valueOf(e9h0.calls_remote_user_name), Integer.valueOf(e9h0.calls_status), Integer.valueOf(e9h0.feedback_hint));
        ArrayList arrayList2 = new ArrayList(tcc.n(g2, 10));
        Iterator it2 = g2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(this.x.findViewById(((Number) it2.next()).intValue()));
        }
        this.G = arrayList2;
        Button button = (Button) this.x.findViewById(e9h0.calls_feedback_refuse);
        this.C = button;
        final int i = 0;
        button.setOnClickListener(new View.OnClickListener() { // from class: eh7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                o020 o020Var2 = o020Var;
                switch (i2) {
                    case 0:
                        o020Var2.a.finish();
                        break;
                    default:
                        o020Var2.a.finish();
                        break;
                }
            }
        });
        Button button2 = (Button) this.x.findViewById(e9h0.calls_feedback_send);
        this.D = button2;
        button2.setOnClickListener(new k5(13, this, o020Var));
        ((RatingView) this.x.findViewById(e9h0.rating_view)).setOnRatingChangeListener(new kv5(25, this));
        final int i2 = 1;
        this.x.findViewById(e9h0.feedback_close).setOnClickListener(new View.OnClickListener() { // from class: eh7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                o020 o020Var2 = o020Var;
                switch (i22) {
                    case 0:
                        o020Var2.a.finish();
                        break;
                    default:
                        o020Var2.a.finish();
                        break;
                }
            }
        });
        new hdu(this.x);
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        return this.x;
    }

    @Override // com.yandex.bricks.Brick
    public final void onBrickAttach(Bundle bundle) {
        super.onBrickAttach(bundle);
        int i = gvg0.avatar_size_48;
        com.yandex.messaging.internal.displayname.a aVar = this.c;
        ChatRequest chatRequest = this.a;
        e.H(getBrickScope(), new jqr(aVar.a(chatRequest, i), new CallFeedbackBrick$onBrickAttach$1(this, null), 3));
        e.H(getBrickScope(), new jqr(aVar.a(chatRequest, gvg0.avatar_size_48), new CallFeedbackBrick$onBrickAttach$2(this, null), 3));
    }
}
