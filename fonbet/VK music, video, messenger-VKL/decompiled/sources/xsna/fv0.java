package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DisclaimerData;
import com.vkontakte.android.attachments.ShitAttachment;
import xsna.iv0;

/* compiled from: AdsCardsCarouselHolder.kt */
/* loaded from: classes4.dex */
public final class fv0 extends wf0 implements View.OnClickListener, iv0.a, a1n, o0n {
    public final jv0 E;
    public boolean F;

    public fv0(ViewGroup viewGroup, h170 h170Var) {
        super(R.layout.news_ad_card_block, viewGroup);
        View view = this.itemView;
        jv0 jv0Var = new jv0(viewGroup, view, view.getResources(), false);
        this.E = jv0Var;
        jv0Var.b(viewGroup.getContext(), this);
    }

    @Override // xsna.qi6
    public final void E6(ShitAttachment shitAttachment) {
        jv0 jv0Var = this.E;
        jv0Var.getClass();
        this.F = false;
        s3q0 s3q0Var = s3q0.a;
        jv0Var.b.setContentDescription(null);
    }

    @Override // xsna.a1n
    public final void U5() {
        this.F = true;
    }

    @Override // xsna.iv0.a
    public final void Y4(ShitAttachment.Card card) {
        u1c0 J0 = J0();
        int i = J0 != null ? J0.k : -1;
        ShitAttachment q6 = q6();
        jv0 jv0Var = this.E;
        jv0Var.getClass();
        if (jjc.b() || q6 == null) {
            return;
        }
        hd60.a().E0(jv0Var.b.getContext(), q6, card, i);
    }

    @Override // xsna.o0n
    public final void a5() {
        RecyclerView recyclerView = this.E.d;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            awt0.q(recyclerView.getChildAt(linearLayoutManager.s()));
        }
    }

    @Override // xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        super.a6(u1c0Var);
        this.E.a(u1c0Var, this);
    }

    @Override // xsna.a1n
    public final boolean o5() {
        return this.F;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.E.getClass();
        if (jjc.b()) {
            return;
        }
        R6(null);
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.iv0.a
    public final void t4(ShitAttachment.Card card) {
        u1c0 J0 = J0();
        int i = J0 != null ? J0.k : -1;
        ShitAttachment q6 = q6();
        if (q6 == null) {
            return;
        }
        jv0 jv0Var = this.E;
        jv0Var.getClass();
        if (jjc.b()) {
            return;
        }
        hd60.a().j1(jv0Var.b.getContext(), q6, card, i);
    }

    @Override // xsna.a1n
    public final void E2(DisclaimerData disclaimerData) {
    }
}
