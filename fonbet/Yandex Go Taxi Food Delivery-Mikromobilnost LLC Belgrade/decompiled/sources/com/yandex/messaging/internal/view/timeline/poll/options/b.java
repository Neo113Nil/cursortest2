package com.yandex.messaging.internal.view.timeline.poll.options;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.messaging.views.AnimatedProgressView;
import defpackage.ai91;
import defpackage.d85;
import defpackage.fxa1;
import defpackage.hxd0;
import defpackage.j24;
import defpackage.jng0;
import defpackage.kxd0;
import defpackage.lbb0;
import defpackage.nyh0;
import defpackage.olh0;
import defpackage.tf2;
import defpackage.w511;
import defpackage.z83;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class b extends RecyclerView.Adapter {
    public int A;
    public final j24 a;
    public final d85 b;
    public final LayoutInflater c;
    public final ArrayList w = new ArrayList();
    public boolean x;
    public boolean y;
    public boolean z;

    public b(Context context, j24 j24Var, d85 d85Var) {
        this.a = j24Var;
        this.b = d85Var;
        this.c = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.w.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        float f;
        kxd0 kxd0Var = (kxd0) x0Var;
        hxd0 hxd0Var = (hxd0) this.w.get(i);
        boolean z = this.y;
        boolean z2 = this.x;
        boolean z3 = this.z;
        int i2 = this.A;
        CheckBox checkBox = kxd0Var.U;
        TextView textView = kxd0Var.T;
        TextView textView2 = kxd0Var.S;
        int i3 = hxd0Var.c;
        PollMessageOptionViewHolder$VoteState.Companion.getClass();
        PollMessageOptionViewHolder$VoteState pollMessageOptionViewHolder$VoteState = z3 ? PollMessageOptionViewHolder$VoteState.IsAnswered : z ? PollMessageOptionViewHolder$VoteState.Voting : PollMessageOptionViewHolder$VoteState.NotAnswered;
        boolean z4 = hxd0Var.d;
        ProgressBar progressBar = kxd0Var.P;
        int i4 = a.a[pollMessageOptionViewHolder$VoteState.ordinal()];
        if (i4 == 1) {
            ai91.c(checkBox, false);
            ai91.c(progressBar, false);
            ai91.f(textView2, false);
            ai91.f(textView, false);
        } else if (i4 == 2) {
            checkBox.setEnabled(false);
            if (z2) {
                ai91.c(checkBox, false);
            } else {
                ai91.f(checkBox, false);
            }
            ai91.c(textView, false);
            ai91.c(textView2, false);
            if (z4 && z2) {
                ai91.f(progressBar, false);
            } else {
                ai91.c(progressBar, false);
            }
        } else {
            if (i4 != 3) {
                w511.b();
                return;
            }
            checkBox.setEnabled(true);
            if (z2) {
                ai91.c(checkBox, false);
            } else {
                ai91.f(checkBox, false);
            }
            ai91.c(textView, false);
            ai91.c(textView2, false);
            ai91.c(progressBar, false);
        }
        kxd0Var.R.setText(hxd0Var.a);
        PollMessageOptionViewHolder$VoteState pollMessageOptionViewHolder$VoteState2 = PollMessageOptionViewHolder$VoteState.IsAnswered;
        if (pollMessageOptionViewHolder$VoteState == pollMessageOptionViewHolder$VoteState2) {
            z83.i();
            f = Math.min(i3 / i2, 1.0f);
        } else {
            f = 0.0f;
        }
        Context context = kxd0Var.N;
        AnimatedProgressView animatedProgressView = kxd0Var.Q;
        if (pollMessageOptionViewHolder$VoteState == pollMessageOptionViewHolder$VoteState2) {
            animatedProgressView.setProgressColor(new tf2((hxd0Var.b ? fxa1.c(jng0.messagingPollsAnsweredOptionVotedProgressColor, context) : fxa1.c(jng0.messagingPollsAnsweredOptionProgressColor, context)).data));
            animatedProgressView.setApvBackgroundColor(fxa1.c(jng0.messagingPollsBackgroundColor, context).data);
        }
        animatedProgressView.setProgress(f, false);
        if (pollMessageOptionViewHolder$VoteState == pollMessageOptionViewHolder$VoteState2) {
            textView.setText(String.valueOf(i3));
            textView2.setText(kxd0Var.O.getString(nyh0.messenger_poll_vote_count_percents, Integer.valueOf((int) Math.rint(f * 100.0f))));
        }
        checkBox.setChecked(hxd0Var.d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new kxd0(this.c.inflate(olh0.msg_vh_poll_message_answer_option, viewGroup, false), new lbb0(4, this));
    }
}
