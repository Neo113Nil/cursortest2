package xsna;

import com.vkontakte.android.attachments.DocumentAttachment;

/* compiled from: PrimaryDocumentImageHolder.kt */
/* loaded from: classes4.dex */
public final class m9d0 extends m56<DocumentAttachment> implements bnw {
    public final rtj0 D;

    public m9d0(rtj0 rtj0Var) {
        super(rtj0Var.itemView);
        this.D = rtj0Var;
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        this.D.Q6(s6oVar);
    }

    @Override // xsna.m56
    public final void T6(DocumentAttachment documentAttachment) {
        s1c0 s1c0Var;
        rtj0 rtj0Var = this.D;
        rtj0Var.itemView.setPadding(0, 0, 0, 0);
        u1c0 J0 = J0();
        if (J0 == null || (s1c0Var = J0.n) == null || !s1c0Var.l) {
            return;
        }
        rtj0Var.G.setWrapContent(true);
    }

    @Override // xsna.m56, xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        this.D.a6(u1c0Var);
        super.a6(u1c0Var);
    }

    @Override // xsna.bnw
    public final void b5(anw anwVar) {
        this.D.E.D = anwVar;
    }
}
