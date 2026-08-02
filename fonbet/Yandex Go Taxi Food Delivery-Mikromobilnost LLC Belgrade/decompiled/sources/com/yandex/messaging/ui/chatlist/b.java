package com.yandex.messaging.ui.chatlist;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;
import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.domain.statuses.e;
import com.yandex.messaging.domain.unreadcount.d;
import com.yandex.messaging.internal.MessageStatus;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.ui.chatlist.c;
import com.yandex.messaging.views.CounterTextView;
import defpackage.ai91;
import defpackage.bob1;
import defpackage.d4b;
import defpackage.e370;
import defpackage.evu0;
import defpackage.ewh0;
import defpackage.f02;
import defpackage.fxa1;
import defpackage.gu21;
import defpackage.gvg0;
import defpackage.h3y;
import defpackage.i3y;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jng0;
import defpackage.jqr;
import defpackage.l8t;
import defpackage.ly4;
import defpackage.n4b;
import defpackage.n8t;
import defpackage.ny61;
import defpackage.nyh0;
import defpackage.oyh0;
import defpackage.p1b;
import defpackage.p4b;
import defpackage.p9t;
import defpackage.pb;
import defpackage.r0k;
import defpackage.rm91;
import defpackage.sfl0;
import defpackage.sk7;
import defpackage.tf;
import defpackage.tje;
import defpackage.tpr;
import defpackage.u9u0;
import defpackage.vng;
import defpackage.vse;
import defpackage.w53;
import defpackage.wwg0;
import defpackage.x6t;
import defpackage.xqi0;
import defpackage.yk3;
import defpackage.ymp;
import defpackage.zx6;
import java.util.Date;
import java.util.List;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes15.dex */
public abstract class b extends x0 {
    public static final /* synthetic */ int i0 = 0;
    public final View N;
    public final sfl0 O;
    public final h3y P;
    public final p1b Q;
    public final c R;
    public final com.yandex.messaging.internal.team.gaps.a S;
    public final com.yandex.messaging.internal.displayname.a T;
    public final p9t U;
    public final zx6 V;
    public final com.yandex.messaging.domain.personal.mentions.a W;
    public final xqi0 Z;
    public final n8t a0;
    public final e b0;
    public final h3y c0;
    public final d d0;
    public final com.yandex.messaging.domain.e e0;
    public final ike f0;
    public p4b g0;
    public final i3y h0;

    public b(View view, sfl0 sfl0Var, h3y h3yVar, p1b p1bVar, c cVar, vse vseVar, com.yandex.messaging.internal.team.gaps.a aVar, com.yandex.messaging.internal.displayname.a aVar2, p9t p9tVar, zx6 zx6Var, com.yandex.messaging.domain.personal.mentions.a aVar3, ymp ympVar, xqi0 xqi0Var, n8t n8tVar, e eVar, h3y h3yVar2, n4b n4bVar, d dVar, com.yandex.messaging.domain.e eVar2) {
        super(view);
        this.N = view;
        this.O = sfl0Var;
        this.P = h3yVar;
        this.Q = p1bVar;
        this.R = cVar;
        this.S = aVar;
        this.T = aVar2;
        this.U = p9tVar;
        this.V = zx6Var;
        this.W = aVar3;
        this.Z = xqi0Var;
        this.a0 = n8tVar;
        this.b0 = eVar;
        this.c0 = h3yVar2;
        this.d0 = dVar;
        this.e0 = eVar2;
        this.f0 = vseVar.c(true);
        this.h0 = kotlin.a.a(new f02(17, this));
        view.setOnClickListener(new tf(13, this));
        if (n4bVar.b) {
            view.setOnLongClickListener(new ly4(0, this));
        }
    }

    public void W(p4b p4bVar) {
        boolean l;
        tpr a;
        TextView textView;
        String str = p4bVar.g;
        ExistingChatRequest existingChatRequest = p4bVar.k;
        this.g0 = p4bVar;
        X();
        d4b Z = Z();
        Z.d(null);
        TextView textView2 = Z.d;
        Z.e("");
        xqi0 xqi0Var = this.Z;
        xqi0Var.getClass();
        tje.e();
        yk3 yk3Var = xqi0Var.p;
        sk7 sk7Var = yk3Var != null ? yk3Var.a : null;
        String d = sk7Var != null ? sk7Var.d() : null;
        if (d == null) {
            l = false;
        } else {
            p4b p4bVar2 = this.g0;
            if (p4bVar2 == null) {
                p4bVar2 = null;
            }
            l = jl40.l(p4bVar2.k.id(), new ChatId.PrivateChatId(d, d).a);
        }
        int i = l ? nyh0.empty_string : oyh0.chat_list_new_chat;
        TextView textView3 = Z.e;
        if (textView3 != null) {
            textView3.setText(i);
        }
        int i2 = p4bVar.d;
        boolean z = p4bVar.f;
        Context context = Z.p;
        CounterTextView counterTextView = Z.k;
        if (i2 > 0) {
            ai91.f(counterTextView, false);
            counterTextView.setCount(i2);
            counterTextView.setContentDescription(context.getResources().getQuantityString(ewh0.chat_list_item_unread_count_content_desc, i2, Integer.valueOf(i2)));
            if (z) {
                counterTextView.setBackground(vng.t(wwg0.msg_bg_mute_counter, context));
                counterTextView.getBackground().setAlpha(191);
            } else {
                counterTextView.setBackground(vng.t(wwg0.msg_bg_counter, context));
                counterTextView.getBackground().setAlpha(255);
            }
        } else {
            counterTextView.setContentDescription(null);
            ai91.c(counterTextView, false);
            if (z) {
                ai91.f(counterTextView, false);
                counterTextView.setCurrentText("");
                Drawable t = vng.t(wwg0.msg_ic_chat_list_notifications_off, counterTextView.getContext());
                if (t == null) {
                    ny61.g("Required value was null.");
                    return;
                }
                Drawable mutate = rm91.d(t, fxa1.c(jng0.messagingCommonIconsSecondaryColor, counterTextView.getContext()).data).mutate();
                mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                mutate.setAlpha(191);
                counterTextView.setBackground(mutate);
            }
        }
        String str2 = p4bVar.c;
        textView2.setText(str2);
        textView2.setContentDescription(str2);
        Z.c.clear();
        Z.q = null;
        Z.r = null;
        bob1.d(textView2, null, false);
        Z.f.setBadge(null);
        Z.g.setBadge(null);
        c.a Y = Y();
        Boolean bool = Y.f;
        e370 e370Var = new e370(bool != null ? bool.booleanValue() : false, 0L);
        String str3 = Y.a;
        if (str3 != null) {
            if (evu0.J(str3)) {
                str3 = null;
            }
            if (str3 != null) {
                TextView textView4 = Z().d;
                textView4.setText(str3);
                textView4.setContentDescription(str3);
            }
        }
        Drawable drawable = Y.b;
        if (drawable != null) {
            Z().c.setImageDrawable(drawable);
        }
        MessageStatus messageStatus = Y.e;
        if (messageStatus != null) {
            Z().c(messageStatus);
        }
        gu21 gu21Var = Y.g;
        if (gu21Var != null) {
            Z().f(new r0k(gu21Var, e370Var));
        }
        if (Y.f != null) {
            Z().c.updateDisplayUserStatus(e370Var.a());
        }
        Boolean bool2 = Y.h;
        if (bool2 != null) {
            Z().c.setHasMeeting(bool2.booleanValue());
        }
        CharSequence charSequence = Y.c;
        if (charSequence != null && (textView = Z().e) != null) {
            textView.setText(charSequence, TextView.BufferType.EDITABLE);
        }
        Date date = Y.d;
        if (date != null) {
            Z().d(date);
        }
        Integer num = Y.j;
        if (num != null) {
            Z().b(Integer.valueOf(num.intValue()));
        }
        List list = Y.i;
        if (list != null) {
            Z().a(list);
        }
        jqr jqrVar = new jqr(this.T.a(existingChatRequest, a0() ? gvg0.avatar_size_32 : gvg0.avatar_size_48), new BaseChatItemViewHolder$bind$2(this, null), 3);
        ike ikeVar = this.f0;
        kotlinx.coroutines.flow.e.H(ikeVar, jqrVar);
        h3y h3yVar = this.c0;
        if (!((u9u0) h3yVar.get()).w) {
            kotlinx.coroutines.flow.e.H(ikeVar, new jqr(this.U.a(existingChatRequest), new BaseChatItemViewHolder$bind$3(2, this, b.class, "onOnlineStatusChanged", "onOnlineStatusChanged(Lcom/yandex/messaging/chat/OnlineStatus;)V", 4), 3));
        }
        zx6 zx6Var = this.V;
        if (zx6Var != null && (a = zx6Var.a(existingChatRequest)) != null) {
            kotlinx.coroutines.flow.e.H(ikeVar, new jqr(a, new BaseChatItemViewHolder$bind$4(2, this, b.class, "onHasMeetingChanged", "onHasMeetingChanged(Z)V", 4), 3));
        }
        if (!a0()) {
            tpr a2 = this.a0.a(new l8t(existingChatRequest));
            kotlinx.coroutines.flow.e.H(ikeVar, new jqr(a2, new BaseChatItemViewHolder$bind$5(this, null), 3));
            kotlinx.coroutines.flow.e.H(ikeVar, new jqr(kotlinx.coroutines.flow.e.t(new m0(d.d(this.d0, null, existingChatRequest, 5), a2, new BaseChatItemViewHolder$bind$6(this, null))), new BaseChatItemViewHolder$bind$7(this, null), 3));
        }
        kotlinx.coroutines.flow.e.H(ikeVar, new jqr(this.e0.a(existingChatRequest), new BaseChatItemViewHolder$bind$8(this, null), 3));
        kotlinx.coroutines.flow.e.H(ikeVar, new jqr(new pb(this.W.a(existingChatRequest), 15), new BaseChatItemViewHolder$bind$10(this, null), 3));
        if (str == null || !p4bVar.i || p4bVar.j) {
            return;
        }
        if (((u9u0) h3yVar.get()).w) {
            kotlinx.coroutines.flow.e.H(ikeVar, new jqr(this.b0.a(new x6t(str)), new BaseChatItemViewHolder$bind$11(this, null), 3));
        }
        tje.N(ikeVar, null, null, new BaseChatItemViewHolder$bind$12(this, str, null), 3);
    }

    public void X() {
        kotlinx.coroutines.a.g(this.f0.a, null);
        ai91.e(Z().o, false);
    }

    public final c.a Y() {
        p4b p4bVar = this.g0;
        if (p4bVar == null) {
            p4bVar = null;
        }
        String id = p4bVar.k.id();
        w53 w53Var = this.R.a;
        c.a aVar = (c.a) w53Var.get(id);
        if (aVar != null) {
            return aVar;
        }
        c.a aVar2 = new c.a(0);
        w53Var.put(id, aVar2);
        return aVar2;
    }

    public final d4b Z() {
        return (d4b) this.h0.getValue();
    }

    public abstract boolean a0();
}
