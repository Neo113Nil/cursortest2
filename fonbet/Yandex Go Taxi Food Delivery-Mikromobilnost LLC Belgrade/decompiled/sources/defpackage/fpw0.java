package defpackage;

import ru.yandex.taxi.surge.dialog.feedback_sent.SurgeFeedbackSentModalView;

/* loaded from: classes6.dex */
public final class fpw0 implements hpw0 {
    public final /* synthetic */ SurgeFeedbackSentModalView a;

    public fpw0(SurgeFeedbackSentModalView surgeFeedbackSentModalView) {
        this.a = surgeFeedbackSentModalView;
    }

    @Override // defpackage.hpw0
    public final void k4(puq puqVar) {
        ouq binding;
        ouq binding2;
        ouq binding3;
        ouq binding4;
        ouq binding5;
        c57 c57Var;
        SurgeFeedbackSentModalView surgeFeedbackSentModalView = this.a;
        binding = surgeFeedbackSentModalView.getBinding();
        binding.e.setTitle(puqVar.a);
        binding2 = surgeFeedbackSentModalView.getBinding();
        binding2.d.setText(puqVar.b);
        binding3 = surgeFeedbackSentModalView.getBinding();
        binding3.c.setImageDrawable(puqVar.c);
        q47 q47Var = puqVar.d;
        if (q47Var == null) {
            binding4 = surgeFeedbackSentModalView.getBinding();
            binding4.b.setVisibility(8);
        } else {
            binding5 = surgeFeedbackSentModalView.getBinding();
            binding5.b.setVisibility(0);
            c57Var = surgeFeedbackSentModalView.actionButtons;
            ((pm5) c57Var).d(q47Var);
        }
    }
}
