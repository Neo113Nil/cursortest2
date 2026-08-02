package com.yandex.messaging.ui.pollinfo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.google.android.flexbox.FlexboxLayout;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import com.yandex.messaging.domain.poll.PollAnswer;
import com.yandex.messaging.domain.user.UserNameType;
import defpackage.c18;
import defpackage.e9h0;
import defpackage.h791;
import defpackage.i3y;
import defpackage.in21;
import defpackage.k7d0;
import defpackage.nyh0;
import defpackage.olh0;
import defpackage.oyh0;
import defpackage.pzt0;
import defpackage.qp21;
import defpackage.r0d0;
import defpackage.r770;
import defpackage.rp21;
import defpackage.scc;
import defpackage.tje;
import defpackage.tse;
import defpackage.twd0;
import defpackage.uwd0;
import defpackage.vse;
import defpackage.vwd0;
import defpackage.wwd0;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class a extends RecyclerView.Adapter {
    public final com.yandex.messaging.internal.avatar.a a;
    public final vse b;
    public final r770 c;
    public final wwd0 w;
    public final rp21 x;
    public final i3y y = kotlin.a.a(new r0d0(11, this));
    public String z = "";
    public final ArrayList A = new ArrayList();

    public a(com.yandex.messaging.internal.avatar.a aVar, vse vseVar, r770 r770Var, wwd0 wwd0Var, rp21 rp21Var) {
        this.a = aVar;
        this.b = vseVar;
        this.c = r770Var;
        this.w = wwd0Var;
        this.x = rp21Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.A.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return i == 0 ? PollInfoAdapter$Companion$ItemType.Title.ordinal() : PollInfoAdapter$Companion$ItemType.PollItem.ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        if (x0Var instanceof twd0) {
            ((twd0) x0Var).N.setText(this.z);
            return;
        }
        if (x0Var instanceof vwd0) {
            vwd0 vwd0Var = (vwd0) x0Var;
            a aVar = vwd0Var.Z;
            i3y i3yVar = vwd0Var.S;
            PollAnswer pollAnswer = (PollAnswer) this.A.get(i - 1);
            vwd0Var.W();
            vwd0Var.W = pollAnswer.getAnswerId();
            vwd0Var.P.setText(pollAnswer.getAnswer());
            TextView textView = vwd0Var.Q;
            View view = vwd0Var.a;
            textView.setText(view.getContext().getResources().getString(nyh0.messenger_poll_vote_count_percents, Integer.valueOf(pollAnswer.getVotedPercent())));
            vwd0Var.R.setText(String.valueOf(pollAnswer.getVotedCount()));
            boolean z = false;
            vwd0Var.O.setProgress(((float) Math.rint(pollAnswer.getVotedPercent())) / 100.0f, false);
            ArrayList arrayList = vwd0Var.T;
            int i2 = 0;
            for (Object obj : pollAnswer.getVotedUsers()) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    scc.m();
                    throw null;
                }
                ReducedUserInfo reducedUserInfo = (ReducedUserInfo) obj;
                View view2 = (View) kotlin.collections.a.S(i2, arrayList);
                if (view2 == null) {
                    view2 = LayoutInflater.from(view.getContext()).inflate(olh0.msg_v_poll_user_tag, (FlexboxLayout) i3yVar.getValue(), z);
                    arrayList.add(view2);
                }
                View view3 = view2;
                ArrayList arrayList2 = vwd0Var.U;
                TextView textView2 = (TextView) view3.findViewById(e9h0.user_tag_text);
                rp21 rp21Var = aVar.x;
                String str = reducedUserInfo.userId;
                long c = rp21Var.b.c();
                in21 a = rp21Var.a.a().a(str);
                String g = h791.g(a == null ? new qp21(null, UserNameType.NOT_FOUND) : rp21Var.c.a(a, c), view3.getResources(), reducedUserInfo.displayName);
                textView2.setText(g);
                pzt0 N = tje.N((tse) aVar.y.getValue(), null, null, new PollInfoAdapter$PollAnswerViewHolder$bindTagView$avatarJob$1(view3, aVar, reducedUserInfo, g, null), 3);
                int i4 = 0;
                arrayList2.add(new c18(i4, new uwd0(N, i4)));
                ((FlexboxLayout) i3yVar.getValue()).addView(view3);
                i2 = i3;
                z = false;
            }
            int votedCount = pollAnswer.getVotedCount() - pollAnswer.getVotedUsers().size();
            if (votedCount > 0) {
                TextView textView3 = vwd0Var.V;
                if (textView3 == null) {
                    textView3 = (TextView) LayoutInflater.from(view.getContext()).inflate(olh0.msg_v_poll_user_more, (ViewGroup) i3yVar.getValue(), false);
                    vwd0Var.V = textView3;
                }
                textView3.setText(view.getContext().getString(oyh0.messenger_poll_more_users_btn_text, Integer.valueOf(votedCount)));
                ((FlexboxLayout) i3yVar.getValue()).addView(textView3);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == PollInfoAdapter$Companion$ItemType.Title.ordinal() ? new twd0(LayoutInflater.from(viewGroup.getContext()).inflate(olh0.msg_vh_poll_answer_title, viewGroup, false)) : new vwd0(this, LayoutInflater.from(viewGroup.getContext()).inflate(olh0.msg_vh_poll_answer_info, viewGroup, false), new k7d0(9, this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(x0 x0Var) {
        super.onViewRecycled(x0Var);
        vwd0 vwd0Var = x0Var instanceof vwd0 ? (vwd0) x0Var : null;
        if (vwd0Var != null) {
            vwd0Var.W();
        }
    }
}
