package xsna;

import com.vkontakte.android.attachments.PhotoAttachment;

/* compiled from: PrimaryRestrictedPhotoHolder.kt */
/* loaded from: classes4.dex */
public final class qad0 extends m56<PhotoAttachment> implements bnw {
    public final ncg0 D;

    public qad0(ncg0 ncg0Var) {
        super(ncg0Var.itemView);
        this.D = ncg0Var;
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
