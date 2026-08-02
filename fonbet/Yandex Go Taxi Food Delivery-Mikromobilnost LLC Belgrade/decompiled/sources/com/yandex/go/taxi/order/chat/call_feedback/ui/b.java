package com.yandex.go.taxi.order.chat.call_feedback.ui;

import android.graphics.Paint;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.gh7;
import defpackage.jh7;
import defpackage.lc6;
import defpackage.mrj;
import defpackage.oh7;
import defpackage.qje;
import defpackage.rbh;
import defpackage.sh60;
import defpackage.tje;
import defpackage.tls;
import defpackage.xng0;
import java.util.List;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class b implements jh7 {
    public final /* synthetic */ CallFeedbackQuestionModalView a;

    public b(CallFeedbackQuestionModalView callFeedbackQuestionModalView) {
        this.a = callFeedbackQuestionModalView;
    }

    @Override // defpackage.jh7
    public final void R2(rbh rbhVar) {
        oh7 access$getBinding = CallFeedbackQuestionModalView.access$getBinding(this.a);
        access$getBinding.e.setText(rbhVar.b);
        access$getBinding.k.setText(rbhVar.c);
        access$getBinding.j.setSelectedTab(0);
        access$getBinding.f.setVisibility(8);
        access$getBinding.c.setVisibility(8);
        access$getBinding.h.setVisibility(0);
    }

    @Override // defpackage.jh7
    public final void V5(sh60 sh60Var) {
        tls tlsVar;
        CallFeedbackQuestionModalView callFeedbackQuestionModalView = this.a;
        callFeedbackQuestionModalView.dismiss();
        tlsVar = callFeedbackQuestionModalView.onFeedbackDone;
        tlsVar.invoke(sh60Var);
    }

    public final RobotoTextView h(String str) {
        CallFeedbackQuestionModalView callFeedbackQuestionModalView = this.a;
        RobotoTextView robotoTextView = new RobotoTextView(callFeedbackQuestionModalView.getContext(), null, 0, 6, null);
        robotoTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        robotoTextView.setText(str);
        callFeedbackQuestionModalView.setTitleTextSize(robotoTextView);
        robotoTextView.setSingleLine();
        robotoTextView.setPadding(tje.u(12, callFeedbackQuestionModalView.getContext()), tje.u(8, callFeedbackQuestionModalView.getContext()), tje.u(20, callFeedbackQuestionModalView.getContext()), tje.u(8, callFeedbackQuestionModalView.getContext()));
        robotoTextView.setGravity(1);
        robotoTextView.setTextColor(qje.t(xng0.textMain, robotoTextView.getContext()));
        return robotoTextView;
    }

    @Override // defpackage.jh7
    public final void y5(mrj mrjVar) {
        CallFeedbackQuestionModalView callFeedbackQuestionModalView = this.a;
        oh7 access$getBinding = CallFeedbackQuestionModalView.access$getBinding(callFeedbackQuestionModalView);
        access$getBinding.e.setText((String) mrjVar.b);
        RecyclerView recyclerView = access$getBinding.i;
        recyclerView.setAdapter(new gh7((List) mrjVar.c, new CallFeedbackQuestionModalView$InnerMvpView$showBadFeedbackForm$1$1$1(1, this, b.class, "onBadReasonSelected", "onBadReasonSelected(Ljava/lang/String;)V", 0)));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        lc6 lc6Var = new lc6();
        float v = tje.v(callFeedbackQuestionModalView.getContext(), 0.5f);
        Paint paint = lc6Var.a;
        paint.setStrokeWidth(v);
        paint.setColor(qje.t(xng0.line, callFeedbackQuestionModalView.getContext()));
        recyclerView.addItemDecoration(lc6Var);
        access$getBinding.k.setText((String) mrjVar.w);
        access$getBinding.j.setSelectedTab(1);
        access$getBinding.f.setVisibility(8);
        access$getBinding.h.setVisibility(8);
        access$getBinding.c.setVisibility(0);
    }
}
