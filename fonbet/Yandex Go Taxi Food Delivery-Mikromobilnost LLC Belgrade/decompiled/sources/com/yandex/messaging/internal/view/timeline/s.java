package com.yandex.messaging.internal.view.timeline;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.messaging.core.net.entities.directives.Button;
import com.yandex.messaging.core.net.entities.proto.message.CustomPayload;
import defpackage.c00;
import defpackage.dx10;
import defpackage.e9h0;
import defpackage.fxa1;
import defpackage.g8a1;
import defpackage.ip31;
import defpackage.j73;
import defpackage.jng0;
import defpackage.jwf;
import defpackage.kbs;
import defpackage.olh0;
import defpackage.tbz0;
import defpackage.vb5;
import defpackage.wwg0;
import defpackage.x3;
import defpackage.xql;
import defpackage.yab;
import defpackage.z9z0;

/* loaded from: classes15.dex */
public final class s extends d {
    public static final int V2 = olh0.msg_vh_chat_other_message_item;
    public final RecyclerView T2;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(jwf jwfVar) {
        super(false, r0, jwfVar);
        View g = g8a1.g((ViewGroup) jwfVar.k, olh0.msg_vh_chat_other_message_item);
        this.T2 = (RecyclerView) g8a1.e(e9h0.chat_actions, g);
    }

    @Override // com.yandex.messaging.internal.view.timeline.d, com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public final void X(yab yabVar, vb5 vb5Var) {
        Button[] actions;
        View view = this.B1;
        if (view != null) {
            this.L0.k(view);
        }
        super.X(yabVar, vb5Var);
        l lVar = e0().g;
        View view2 = this.a;
        lVar.c = fxa1.c(jng0.messagingIncomingLinkColor, view2.getContext()).data;
        c00 c00Var = e0().j;
        RecyclerView recyclerView = this.T2;
        recyclerView.setAdapter(c00Var);
        recyclerView.setOverScrollMode(2);
        Context context = view2.getContext();
        Drawable drawable = context.getDrawable(wwg0.msg_divider_chat_action);
        if (drawable == null) {
            kbs.g("No drawable found");
            return;
        }
        recyclerView.addItemDecoration(new xql(drawable));
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.O = new tbz0(yabVar.Z(), yabVar.a());
        CustomPayload e = yabVar.e();
        Button[] buttonArr = null;
        if (e != null && (actions = e.getActions()) != null) {
            buttonArr = (Button[]) j73.A(actions).toArray(new Button[0]);
        }
        if (buttonArr == null || buttonArr.length == 0) {
            recyclerView.setVisibility(8);
            c00 c00Var2 = e0().j;
            c00Var2.getClass();
            c00Var2.w = c00.x;
            c00Var2.notifyDataSetChanged();
            return;
        }
        e0().g.c = fxa1.c(jng0.messagingIncomingLinkColor, view2.getContext()).data;
        c00 c00Var3 = e0().j;
        c00Var3.getClass();
        c00Var3.w = buttonArr;
        c00Var3.notifyDataSetChanged();
        recyclerView.setVisibility(0);
    }

    @Override // com.yandex.messaging.internal.view.timeline.d, com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public final void i0(Canvas canvas, z9z0 z9z0Var, boolean z, boolean z2) {
        View Jg;
        x3 x3Var;
        super.i0(canvas, z9z0Var, z, z2);
        int visibility = this.T2.getVisibility();
        ip31 ip31Var = this.H1;
        if (visibility == 0) {
            Drawable drawable = z2 ? z9z0Var.e : z9z0Var.f;
            drawable.setBounds(ip31Var.f(), ip31Var.h(), ip31Var.g(), ip31Var.d());
            drawable.draw(canvas);
        }
        dx10 K0 = K0();
        x3 x3Var2 = K0.f;
        if (x3Var2 == null || (Jg = x3Var2.Jg()) == null || Jg.getVisibility() != 0 || (x3Var = K0.f) == null) {
            return;
        }
        x3Var.Tg(ip31Var, z9z0Var, canvas, z, z2, false);
    }
}
