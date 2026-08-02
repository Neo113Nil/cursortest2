package xsna;

import com.vkontakte.android.attachments.GraffitiAttachment;

/* compiled from: PrimaryGraffitiHolder.kt */
/* loaded from: classes4.dex */
public final class n9d0 extends m56<GraffitiAttachment> {
    public final ncu D;

    public n9d0(ncu ncuVar) {
        super(ncuVar.itemView);
        this.D = ncuVar;
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        this.D.Q6(s6oVar);
    }

    @Override // xsna.m56
    public final void T6(GraffitiAttachment graffitiAttachment) {
        this.D.itemView.setPadding(0, 0, 0, 0);
    }

    @Override // xsna.m56, xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        this.D.a6(u1c0Var);
        super.a6(u1c0Var);
    }
}
