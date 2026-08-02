package xsna;

import com.vkontakte.android.attachments.PhotoAttachment;

/* compiled from: PrimaryRestrictedBlurredPhotoHolder.kt */
/* loaded from: classes4.dex */
public final class pad0 extends m56<PhotoAttachment> implements bnw {
    public final hcg0 D;

    public pad0(hcg0 hcg0Var) {
        super(hcg0Var.itemView);
        this.D = hcg0Var;
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        this.D.Q6(s6oVar);
    }

    @Override // xsna.m56
    public final void T6(PhotoAttachment photoAttachment) {
        this.D.itemView.setPadding(0, 0, 0, 0);
    }

    @Override // xsna.m56, xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        this.D.a6(u1c0Var);
        super.a6(u1c0Var);
    }

    @Override // xsna.bnw
    public final void b5(anw anwVar) {
        this.D.D = anwVar;
    }
}
